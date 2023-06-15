package io.github.ericmedvet.robotevo2d.main.grammar2d;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import io.github.ericmedvet.mrsim2d.core.util.Grid;
import io.github.ericmedvet.mrsim2d.core.util.Grid.Key;

public class StandardGridDeveloper<T> implements GridDeveloper<T> {
    private record Aged<T>(int iteration, T t) {
    }

    private record Decorated(int iteration, int nOfFreeSides) {
    }

    public enum SortingCriterion {
        LEAST_RECENT, MOST_RECENT, LEAST_FREE_SIDES, MOST_FREE_SIDE, LOWEST_X, LOWEST_Y
    }

    private final GridGrammar<T> grammar;
    private final boolean overwriting;
    private final List<SortingCriterion> criteria;
    private final Comparator<Grid.Entry<Decorated>> comparator;

    public StandardGridDeveloper(GridGrammar<T> grammar, boolean overwriting, List<SortingCriterion> criteria) {
        this.grammar = grammar;
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
        return replacement.grid().entries().stream()
                .filter(e -> e.value() != null && !e.key().equals(replacement.referenceKey()))
                .noneMatch(e -> {
                    Key tK = e.key().at(k.x(), k.y()).at(-replacement.referenceKey().x(),
                            -replacement.referenceKey().y());
                    if (!original.isValid(tK)) {
                        return false;
                    }
                    // System.out.printf("repl:%s -> %s\torig:%s -> %s%n", e.key(), e.value(), tK,
                    // original.get(tK));
                    return original.get(tK) != null;
                });
    }

    private static <T> Grid<Aged<T>> modify(Grid<Aged<T>> original, ReferencedGrid<T> replacement, Key k,
            int iteration) {
        List<Grid.Entry<T>> repEntries = replacement.grid().entries().stream()
                .map(e -> new Grid.Entry<>(
                        e.key().at(k.x(), k.y()).at(-replacement.referenceKey().x(), -replacement.referenceKey().y()),
                        e.value()))
                .toList();
        int minX = Math.min(repEntries.stream().mapToInt(e -> e.key().x()).min().orElse(0), 0);
        int maxX = Math.max(repEntries.stream().mapToInt(e -> e.key().x()).max().orElse(0), original.w() - 1);
        int minY = Math.min(repEntries.stream().mapToInt(e -> e.key().y()).min().orElse(0), 0);
        int maxY = Math.max(repEntries.stream().mapToInt(e -> e.key().y()).max().orElse(0), original.h() - 1);

        // System.out.printf("\torig:%n%s%n\trep: %s%n", s(original), replacement);
        // System.out.printf("\tat: %s%n", k);
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

    public Optional<Grid<T>> develop(Chooser<T> optionChooser) {
        Set<T> nonTerminalSymbols = grammar.getRules().keySet();
        int i = 0;
        // build a 1x1 grid with the starting symbol
        Grid<Aged<T>> polyomino = Grid.create(1, 1);
        polyomino.set(0, 0, new Aged<>(i, grammar.getStartingSymbol()));
        while (true) {

            // System.out.printf("%ni=%d %s%n%s%n%n", i, grammar.getStartingSymbol(),
            // s(polyomino));

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
                return Optional.of(polyomino.map(a -> a == null ? null : a.t()));
            }
            // sort the candidates
            candidates = candidates.stream().sorted(comparator).toList();

            boolean modified = false;
            for (Grid.Entry<Decorated> candidate : candidates) {
                T symbol = polyomino.get(candidate.key()).t();
                Optional<ReferencedGrid<T>> production = optionChooser.choose(symbol);
                if (production.isEmpty()){
                    return Optional.empty();
                }
                if (overwriting || isWriteable(polyomino, production.get(), candidate.key())) {
                    // modify grid
                    polyomino = modify(polyomino, production.get(), candidate.key(), i);
                    modified = true;
                    break;
                }
            }

            if (!modified) {
                return Optional.empty();
            }
        }
    }
}
