package io.github.ericmedvet.robotevo2d.main.grammar2d;

import io.github.ericmedvet.mrsim2d.core.util.ArrayGrid;
import io.github.ericmedvet.mrsim2d.core.util.Grid;
import io.github.ericmedvet.mrsim2d.core.util.Grid.Key;

import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.Map;
import java.util.Comparator;
import java.util.Random;
import java.util.random.RandomGenerator;
import java.util.stream.Collectors;

public class GridProducer {

  private record Aged<T>(int iteration, T t) {
  }

  private record Decorated(int iteration, int nOfFreeSides) {
  }

  public enum SortingCriterion {
    LEAST_RECENT, MOST_RECENT, LEAST_FREE_SIDES, MOST_FREE_SIDE, LOWEST_X, LOWEST_Y
  }

  private final boolean overwriting;
  private final List<SortingCriterion> criteria;
  private final Comparator<Grid.Entry<Decorated>> comparator;

  public GridProducer(boolean overwriting, List<SortingCriterion> criteria) {
    this.overwriting = overwriting;
    this.criteria = criteria;
    // TODO: comparator now set to just recency
    comparator = (e1, e2) -> e1.value().iteration() - e2.value().iteration();
    // thenComparing allows that we use more than one criteria
    // comparator.thenComparing(comparator)
  }

  private static int freeSides(Grid<?> g, Grid.Key k) {
    int n = 0;
    n = n + ((k.x() < 1 || g.get(k.x() - 1, k.y()) == null) ? 1 : 0);
    n = n + ((k.x() >= g.w() - 1 || g.get(k.x() + 1, k.y()) == null) ? 1 : 0);
    n = n + ((k.y() < 1 || g.get(k.x(), k.y() - 1) == null) ? 1 : 0);
    n = n + ((k.y() >= g.h() - 1 || g.get(k.x(), k.y() + 1) == null) ? 1 : 0);
    return n;
  }

  private static boolean isWriteable(Grid<?> original, ReferencedGrid<?> replacement, Key k) {
    // TODO: check what happens if the coords in Grid.get() are invalid, if there is
    // an illegal arg exc;
    // in case yes, put a try catch and ignore the exception (bc this means we can
    // write there)
    return !replacement.grid().entries().stream()
        .filter(e -> e.value() != null && !e.key().equals(replacement.referenceKey()))
        .anyMatch(e -> {
          Key tK = e.key().at(k.x(), k.y()).at(-replacement.referenceKey().x(), -replacement.referenceKey().y());
          if (!original.isValid(tK)) {
            return false;
          }
          // System.out.printf("repl:%s -> %s\torig:%s -> %s%n", e.key(), e.value(), tK,
          // original.get(tK));
          return original.get(tK) != null;
        });
  }

  private static <T> Grid<Aged<T>> modify(Grid<Aged<T>> original, ReferencedGrid<T> replacement, Key k, int iteration) {
    List<Grid.Entry<T>> repEntries = replacement.grid().entries().stream()
        .map(e -> new Grid.Entry<>(
            e.key().at(k.x(), k.y()).at(-replacement.referenceKey().x(), -replacement.referenceKey().y()),
            e.value()))
        .toList();
    int minX = Math.min(repEntries.stream().mapToInt(e -> e.key().x()).min().orElse(0), 0);
    int maxX = Math.max(repEntries.stream().mapToInt(e -> e.key().x()).max().orElse(0), original.w() - 1);
    int minY = Math.min(repEntries.stream().mapToInt(e -> e.key().y()).min().orElse(0), 0);
    int maxY = Math.max(repEntries.stream().mapToInt(e -> e.key().y()).max().orElse(0), original.h() - 1);

    System.out.printf("\torig:%n%s%n\trep: %s%n", s(original), replacement);
    System.out.printf("\tat: %s%n", k);
    // System.out.printf("\tx:%d > x:%d ; y:%d > y:%d\n", maxX, minX, maxY, minY);

    if (minX >= 0 && maxX < original.w() && minY >= 0 && maxY < original.h()) {
      // just write elements on the original grid
      repEntries.stream().filter(e -> e.value() != null)
          .forEach(e -> original.set(e.key(), new Aged<>(iteration, e.value())));
      return original;
    }

    // build a new grid and fill it
    Grid<Aged<T>> enlarged = Grid.create(maxX - minX + 1, maxY - minY + 1);
    original.entries().forEach(e -> enlarged.set(
        e.key().at(-minX, -minY),
        e.value()));
    repEntries.stream().filter(e -> e.value() != null).forEach(e -> enlarged.set(
        e.key().at(-minX, -minY),
        new Aged<>(iteration, e.value())));
    return enlarged;
  }

  public <T> Grid<T> produce(GridGrammar<T> gridGrammar, OptionChooser<T> optionChooser) {
    Set<T> nonTerminalSymbols = gridGrammar.rules().keySet();
    int i = 0;
    // build a 1x1 grid with the starting symbol
    Grid<Aged<T>> polyomino = Grid.create(1, 1);
    polyomino.set(0, 0, new Aged<>(i, gridGrammar.startingSymbol()));
    while (true) {

      System.out.printf("%ni=%d %s%n%s%n%n", i, gridGrammar.startingSymbol(), s(polyomino));

      i = i + 1;
      // find the candidates
      final Grid<Aged<T>> finalPolyomino = polyomino;
      List<Grid.Entry<Decorated>> candidates = polyomino.entries().stream()
          .filter(e -> e.value() != null && nonTerminalSymbols.contains(e.value().t()))
          .map(e -> new Grid.Entry<>(e.key(), new Decorated(
              e.value().iteration,
              freeSides(finalPolyomino, e.key()))))
          .toList();
      // check if no non-terminal symbols
      if (candidates.isEmpty()) {
        return polyomino.map(a -> a == null ? null : a.t());
      }
      // sort the candidates
      candidates = candidates.stream().sorted(comparator).toList();

      System.out.printf("candidates:%n%s%n", candidates.stream()
          .map(c -> "(%d,%d) %s".formatted(c.key().x(), c.key().y(), c.value())).collect(Collectors.joining("\n")));

      boolean modified = false;
      for (Grid.Entry<Decorated> candidate : candidates) {
        T symbol = polyomino.get(candidate.key()).t();
        List<ReferencedGrid<T>> productions = gridGrammar.rules().get(symbol);
        ReferencedGrid<T> production = optionChooser.choose(symbol, productions);
        System.out.printf("\tcandidate: %s\n", candidate);
        System.out.printf("\twriteable: %s %s%n", candidate, isWriteable(polyomino,
        production, candidate.key()));

        if (overwriting || isWriteable(polyomino, production, candidate.key())) {
          // modify grid
          System.out.println("hello");
          polyomino = modify(polyomino, production, candidate.key(), i);
          modified = true;
          break;
        }
      }

      if (!modified) {
        return null;
      }
    }
  }

  private static <T> String s(Grid<Aged<T>> g) {
    return Grid.toString(g, new Function<Aged<T>, Character>() {
      public Character apply(Aged<T> aged) {
        if (aged == null) {
          return '.';
        }
        return aged.t().toString().charAt(0);
      }
    });
  }

  public static void main(String[] args) {
    GridGrammar<Character> g = new GridGrammar<Character>(
        'a',
        Map.ofEntries(Map.entry('a', List.of(
            new ReferencedGrid<Character>(
                new Key(0, 0),
                Grid.create(2, 1, 'a')),
            new ReferencedGrid<Character>(
                new Key(0, 0),
                Grid.create(1, 2, 'a')),
            new ReferencedGrid<Character>(
                new Key(0, 0),
                Grid.create(1, 1, 'A'))))));

    // System.out.println(g);
    RandomGenerator r = new Random();
    GridProducer gp = new GridProducer(false, List.of());
    Grid<Character> mapped = gp.produce(g, (s, rules) -> rules.get(r.nextInt(rules.size())));
    
  }

}
