package io.github.ericmedvet.robotevo2d.main.grammar2d;

import io.github.ericmedvet.mrsim2d.core.util.Grid;
import io.github.ericmedvet.robotevo2d.main.grammar2d.GridDeveloper.Chooser;
import io.github.ericmedvet.robotevo2d.main.grammar2d.StandardGridDeveloper.SortingCriterion;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.*;
import java.util.random.RandomGenerator;

public class GrammarBiases {

  private static <T> String printPolyomino(Grid<T> grid) {
    StringBuilder sb = new StringBuilder();
    for (int y = 0; y < grid.h(); y++) {
      for (int x = 0; x < grid.w(); x++) {
        if (grid.get(x, y) == null) {
          sb.append('.');
        } else {
          sb.append(grid.get(x, y));
        }
        // sb.append(function.apply(new Entry<>(new Key(x, y), grid.get(x, y))));
      }
      if (y < grid.h() - 1) {
        sb.append("\n");
      }
    }
    return sb.toString();
  }

  private static int countCells(Grid<String> grid) {
    int phenSize = 0;

    for (int y = 0; y < grid.h(); y++) {
      for (int x = 0; x < grid.w(); x++) {
        if (grid.get(x, y) != null) {
          phenSize += 1;
        }
      }
    }
    return phenSize;
  }

  public static Grid<Boolean> convertGrid(Grid<String> grid) {
    Grid<Boolean> g = Grid.create(grid.w(), grid.h());
    for (int y = 0; y < grid.h(); y++) {
      for (int x = 0; x < grid.w(); x++) {
        if (grid.get(x, y) != null) {
          g.set(x, y, true);
        } else {
          g.set(x, y, false);
        }
      }
    }
    return g;
  }

  public static double shapeCompactness(Grid<Boolean> posture) {
    // approximate convex hull
    Grid<Boolean> convexHull = Grid.create(posture.w(), posture.h(), k -> posture.get(k));

    boolean none = false;
    // loop as long as there are false cells have at least five of the eight Moore
    // neighbors as true
    while (!none) {
      none = true;
      for (Grid.Entry<Boolean> entry : convexHull) {
        if (convexHull.get(entry.key().x(), entry.key().y())) {
          continue;
        }
        int currentX = entry.key().x();
        int currentY = entry.key().y();
        int adjacentCount = 0;
        // count how many of the Moore neighbors are true
        for (int i : new int[] { 1, -1 }) {
          int neighborX = currentX;
          int neighborY = currentY + i;
          if (0 <= neighborY && neighborY < convexHull.h() && convexHull.get(neighborX, neighborY)) {
            adjacentCount += 1;
          }
          neighborX = currentX + i;
          neighborY = currentY;
          if (0 <= neighborX && neighborX < convexHull.w() && convexHull.get(neighborX, neighborY)) {
            adjacentCount += 1;
          }
          neighborX = currentX + i;
          neighborY = currentY + i;
          if (0 <= neighborX && 0 <= neighborY && neighborX < convexHull.w() && neighborY < convexHull.h()
              && convexHull.get(
                  neighborX,
                  neighborY)) {
            adjacentCount += 1;
          }
          neighborX = currentX + i;
          neighborY = currentY - i;
          if (0 <= neighborX && 0 <= neighborY && neighborX < convexHull.w() && neighborY < convexHull.h()
              && convexHull.get(
                  neighborX,
                  neighborY)) {
            adjacentCount += 1;
          }
        }
        // if at least five, fill the cell
        if (adjacentCount >= 5) {
          convexHull.set(entry.key().x(), entry.key().y(), true);
          none = false;
        }
      }
    }
    // compute are ratio between convex hull and posture
    int nVoxels = (int) posture.stream().filter(e -> e.value()).count();
    int nConvexHull = (int) convexHull.stream().filter(e -> e.value()).count();
    // -> 0.0 for less compact shapes, -> 1.0 for more compact shapes
    return (double) nVoxels / nConvexHull;
  }

  @SuppressWarnings("OptionalGetWithoutIsPresent")
  public static double shapeElongation(Grid<Boolean> posture, int n) {
    if (posture.values().stream().noneMatch(e -> e)) {
      throw new IllegalArgumentException("Grid is empty");
    } else if (n <= 0) {
      throw new IllegalArgumentException(String.format("Non-positive number of directions provided: %d", n));
    }
    List<Grid.Key> coordinates = posture.stream()
        .filter(Grid.Entry::value)
        .map(Grid.Entry::key)
        .toList();
    List<Double> diameters = new ArrayList<>();
    for (int i = 0; i < n; ++i) {
      double theta = (2 * i * Math.PI) / n;
      List<Grid.Key> rotatedCoordinates = coordinates.stream()
          .map(p -> new Grid.Key(
              (int) Math.round(p.x() * Math.cos(theta) - p.y() * Math.sin(theta)),
              (int) Math.round(p.x() * Math.sin(theta) + p.y() * Math.cos(theta))))
          .toList();
      double minX = rotatedCoordinates.stream().min(Comparator.comparingInt(Grid.Key::x)).get().x();
      double maxX = rotatedCoordinates.stream().max(Comparator.comparingDouble(Grid.Key::x)).get().x();
      double minY = rotatedCoordinates.stream().min(Comparator.comparingDouble(Grid.Key::y)).get().y();
      double maxY = rotatedCoordinates.stream().max(Comparator.comparingDouble(Grid.Key::y)).get().y();
      double sideX = maxX - minX + 1;
      double sideY = maxY - minY + 1;
      diameters.add(Math.min(sideX, sideY) / Math.max(sideX, sideY));
    }
    return 1.0 - Collections.min(diameters);
  }


  public static void main(String[] args) throws IOException {
    int popSize = 1;

    GridGrammar<String> g = GridGrammar.fromFile(new File("grammars/simple.bnf"));
    try (Writer writer = new BufferedWriter(new OutputStreamWriter(
        new FileOutputStream("preliminary-experiments/" + "fractal_overwriting.txt"), "utf-8"))) {
      writer.write("gen_length,invalidity,unique,phenSize,compactness,elongation\n");

      for (int genLength = 10; genLength <= 500; genLength += 10) {
        final int localGenLength = genLength;
        double compactness = 0.0;
        double elongation = 0.0;
        int invalids = 0;
        ArrayList<Integer> phenotypeSize = new ArrayList<Integer>();
        ArrayList<Grid<String>> population = new ArrayList<>();
        for (int i = 0; i < popSize; i++) {

          RandomGenerator r = new Random(i);
          // GridProducer gp = new GridProducer(true, List.of());
          GridDeveloper<String> gd = new StandardGridDeveloper<>(g, false, List.of(SortingCriterion.LEAST_RECENT));
          try {
            Chooser<String> opt = s -> Optional.of(g.getRules().get(s).get(r.nextInt(g.getRules().get(s).size())));
            Chooser<String> lOpt = new Chooser<String>() {
              private int count = 0;

              public Optional<ReferencedGrid<String>> choose(String s) {
                count = count + 1;
                if (count < localGenLength) {
                  return Optional.of(g.getRules().get(s).get(r.nextInt(g.getRules().get(s).size())));
                }
                return Optional.empty();
              }
            };
            // OptionChooser<String> opt = (s, rules) -> rules.get(r.nextInt(rules.size()));
            Grid<String> mapped = gd.develop(lOpt).orElseThrow();

            System.out.printf("\nIndividual: \n%s\n\n", printPolyomino(mapped));

            if (!population.contains(mapped)) {
              population.add(mapped);
              phenotypeSize.add(countCells(mapped));
              compactness += shapeCompactness(convertGrid(mapped));
              // TODO: change n value
              elongation += shapeElongation(convertGrid(mapped), 4);
            }
          } catch (Exception e) {
            // System.out.printf("Erro: %s", e);
            invalids += 1;
          }
        }
        double averagePhen = 0;
        for (Integer size : phenotypeSize) {
          averagePhen += size;
        }
        String s = Integer.toString(genLength) + "," + Integer.toString(invalids) + ","
            + Integer.toString(population.size()) + "," + Double.toString(averagePhen / phenotypeSize.size()) + ","
            + Double.toString(compactness / population.size()) + "," + Double.toString(elongation / population.size())
            + "\n";
        writer.write(s);
        System.out.printf("\nInvalids: %d\n", invalids);
        System.out.printf("Unique: %d\n", population.size());
        System.out.printf("\nCompactness: %f\n", compactness / population.size());
        System.out.printf("\nElongation: %f\n", elongation / population.size());
      }
      writer.close();
    }
  }

}