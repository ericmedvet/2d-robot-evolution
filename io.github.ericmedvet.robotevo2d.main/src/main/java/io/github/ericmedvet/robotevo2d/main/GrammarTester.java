/*-
 * ========================LICENSE_START=================================
 * robotevo2d-main
 * %%
 * Copyright (C) 2018 - 2025 Eric Medvet
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * =========================LICENSE_END==================================
 */
package io.github.ericmedvet.robotevo2d.main;

import io.github.ericmedvet.jgea.core.Factory;
import io.github.ericmedvet.jgea.core.InvertibleMapper;
import io.github.ericmedvet.jgea.core.representation.sequence.bit.BitString;
import io.github.ericmedvet.jgea.core.representation.sequence.integer.IntString;
import io.github.ericmedvet.jgea.experimenter.Representation;
import io.github.ericmedvet.jnb.core.NamedBuilder;
import io.github.ericmedvet.jnb.datastructure.DoubleRange;
import io.github.ericmedvet.jnb.datastructure.Grid;
import io.github.ericmedvet.jnb.datastructure.GridUtils;
import io.github.ericmedvet.mrsim2d.core.agents.gridvsr.ReactiveGridVSR;
import io.github.ericmedvet.mrsim2d.core.engine.Engine;
import io.github.ericmedvet.mrsim2d.core.tasks.AgentsObservation;
import io.github.ericmedvet.mrsim2d.core.tasks.AgentsOutcome;
import io.github.ericmedvet.mrsim2d.core.tasks.locomotion.Locomotion;
import java.util.*;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.random.RandomGenerator;
import java.util.stream.Collectors;

public class GrammarTester {
  private static final String GRAMMAR_MAPPER = """
      er.m.sGridToReactiveGridVsr(
        of = ea.m.bsToGrammarGrid(
          l = 1024;
          grammar = ea.grammar.gridFile(path = "src/main/resources/grammars/biped-vh123-improved.bnf")
        );
        availableVoxels = ea.misc.sMapFromLists(
          keys = [h; s; avsin; ahsin; asin; acos];
          values = [
            m.supplier(of = s.a.vsr.rv.ph());
            m.supplier(of = s.a.vsr.rv.ps());
            m.supplier(of = s.a.vsr.rv.avsin());
            m.supplier(of = s.a.vsr.rv.ahsin());
            m.supplier(of = s.a.vsr.rv.asin());
            m.supplier(of = s.a.vsr.rv.asin(phase = 3.14))
          ]
        )
      )
      """;
  private static final String GRID_MAPPER = """
      er.m.isToReactiveGridVsr(
        w = 6;
        h = 4;
        availableVoxels = [
            m.supplier(of = s.a.vsr.rv.ph());
            m.supplier(of = s.a.vsr.rv.ps());
            m.supplier(of = s.a.vsr.rv.avsin());
            m.supplier(of = s.a.vsr.rv.ahsin());
            m.supplier(of = s.a.vsr.rv.asin());
            m.supplier(of = s.a.vsr.rv.asin(phase = 3.14))
        ]
      )
      """;
  private static final String PARTIAL_GRAMMAR_MAPPER = """
      ea.m.bsToGrammarGrid(
        l = 1024;
        grammar = ea.grammar.gridFile(path = "src/main/resources/grammars/biped-vh123-improved.bnf")
      )
      """;
  private static final String B_REPRESENTATION = "ea.r.bitString()";
  private static final String I_REPRESENTATION = "ea.r.intString()";
  private static final String TASK_LOCOMOTION = "sim.task.locomotion(duration = 30)";
  private static final List<String> BIT_STRINGS = List.of(
      "1010001100101011011111011110100001011110111010000111000111011111101010000100110001111110110101001011011111111110000100110010000010100000101000101011110111110101100101011100100101011111111110010111110010101101111110100010011001001000111000011100101011100000101110100111000000111100010000101010001110010000001010111011111110000110010001011110110110100011111100100001111100001010101010000010010000101101001011101110101101000000101010001011000011010101100100111111011001000010000100001101100101111001100100111000111110110110101011011011011010001101101000000100101111000001010000101100101111000100000010110111011110110100011011011110100000110100101100110101100100011010000111100010011101011000001101111111101101101101100110010010011100011001001001011001101000110011011110101011110101000111001100000011001100101001010101011111100100111011000101010101011101111010110000100110100011111001100101101110101100001100011010100011000001000011010000001100101010110000100101110000110110000011011011001000110100001111000000110101011111010010",
      "1010101010101011001100010100110001011100110010110111001011000110011100001010101010010101111110000100000111001010000100100101000000100010100000100000101111011001111011100110100111010010101101101001110011110110111010111010011011111101001010010010101011011111101000101010110001010101111000100110000100100010000000101011000010000111110100100011101111100011110000100100001111001001110010011111000111100010100100010101001000111010010111010111110011110011110110111111010011010000100001010000000101000010010011111110111011001110011000000011011000101110001000100011111110111000110000011101110111010110000001111010111000001000101010101111110010111000110100110100001100100010110001000010001101011000010001001111000101111111000110010100101100111011000100011000100101110011010010001111000110001101100011010100111111010111000001010101000010111011100011000101000101111110101000101111101010101000100000101111101100110110110101100111010010010000010011000101000010101001001000010111101111010111100101100011100000010100000010000000101100010110",
      "1010101010101011001100010100110001011100110010110111001011000110011100001010101010010101111110100100000111001010000100100001000000100010100000100000101111011001111011100110100111010010101101101001110011110110111010111010011011111101001010010010101011011111101000101010110001010101111000100110000100100010000000101011000010000111110100100011101111100011110000100100001111001001110010011111000111100010100100010101001000110010010111010111110011110011110110111111010011010000100101010000000101000010010011111110111011001110011000000011011000101110001000100011111110111000110000011101110111010110000001111010111000001000101010101111110010111000110100110100001100100010110001000010001101011000010001001101000101111111000110010100101100111011000100011000100101110011010010001111000110001101100011010100111111010111000001010101000010111011100011000101000101111110101000101111101010101000100000101111101100110110110101100111010010010000010011000101000010101001001000010111101111010111100101100011100000010100000010000000101100010110",
      "1000101010100011001101010101101001011110010101110111101011000100111100011000111000110100110100000110001011011000000100100011000001100001100000000000101111011000100001100110101111010110101000011110111010110111111010010010001101101111001001110110101011010010101010101010110000010100011000001010000000000011000010111111000110001110100101101001110111100011110110110100011111101011100011111110010011100010111101110101010100011010110011000011110010010011010110111111010011001111000000010000000101100010101100101010101011001110100010100011011000111110001100101011101010011001100010111001110111010110000000111111100110111100011010101110110000111000110100100000000110100010010010010010011011011000000001001111000100110101110110110100101101011011000000010011100001110010001011100110100111001101100110100000111101010111010101010001000001101011000011011001011101111111001010100110110011101000101001101110101100110110101001100111010110000100010001001111100011100001100100110011101101010101000111100011100100011100010010111000101110010111"
  );
  private static final List<String> INT_STRINGS = List.of(
      "0,0,0,2,5,2,6,6,3,1,3,1,0,0,5,6,3,3,3,1,3,1,6,2",
      "1,1,2,1,0,5,4,0,1,6,1,1,2,0,0,0,0,2,0,5,0,2,4,5",
      "1,1,1,1,0,5,4,0,2,6,1,0,2,0,0,6,2,0,1,3,0,2,4,3",
      "1,1,1,1,0,1,1,0,0,6,1,0,2,0,0,5,1,0,6,3,0,6,4,3"
  );

  private static final Map<String, Character> GRID_CHARS = Map.ofEntries(
      Map.entry("h", 'f'),
      Map.entry("s", 'g'),
      Map.entry("ahsin", 'a'),
      Map.entry("avsin", 'b'),
      Map.entry("asin", 'c'),
      Map.entry("acos", 'd')
  );
  private static final Map<Integer, String> INTS_STRINGS = Map.ofEntries(
      Map.entry(1, "h"),
      Map.entry(2, "s"),
      Map.entry(3, "ahsin"),
      Map.entry(4, "avsin"),
      Map.entry(5, "asin"),
      Map.entry(6, "acos")
  );

  private static Character toChar(String s) {
    if (s == null) {
      return ' ';
    }
    return GRID_CHARS.get(s);
  }

  public static void main(String[] args) {
    RandomGenerator rg = new Random(1);
    NamedBuilder<Object> nb = NamedBuilder.fromDiscovery();
    @SuppressWarnings("unchecked") InvertibleMapper<BitString, Grid<String>> partialGrammarInvertibleMapper = ((InvertibleMapper<BitString, Grid<String>>) nb
        .build(PARTIAL_GRAMMAR_MAPPER));
    @SuppressWarnings("unchecked") InvertibleMapper<BitString, Supplier<ReactiveGridVSR>> grammarInvertibleMapper = ((InvertibleMapper<BitString, Supplier<ReactiveGridVSR>>) nb
        .build(GRAMMAR_MAPPER));
    @SuppressWarnings("unchecked") InvertibleMapper<IntString, Supplier<ReactiveGridVSR>> gridInvertibleMapper = ((InvertibleMapper<IntString, Supplier<ReactiveGridVSR>>) nb
        .build(GRID_MAPPER));
    @SuppressWarnings("unchecked") Function<BitString, Representation<BitString>> bRepresentation = (Function<BitString, Representation<BitString>>) nb
        .build(B_REPRESENTATION);
    @SuppressWarnings("unchecked") Function<IntString, Representation<IntString>> iRepresentation = (Function<IntString, Representation<IntString>>) nb
        .build(I_REPRESENTATION);
    Factory<BitString> factory = bRepresentation.apply(partialGrammarInvertibleMapper.exampleFor(null)).factory();
    Function<BitString, Grid<String>> partialGrammarMapper = partialGrammarInvertibleMapper.mapperFor(null);
    Function<IntString, Grid<String>> partialGridMapper = is -> {
      Grid<Integer> grid = Grid.create(6, 4, is.genes());
      grid = GridUtils.largestConnected(grid, i -> i > 0, 0);
      grid = GridUtils.fit(grid, i -> i > 0);
      return grid.map(INTS_STRINGS::get);
    };
    Function<BitString, Supplier<ReactiveGridVSR>> grammarMapper = grammarInvertibleMapper.mapperFor(null);
    Function<IntString, Supplier<ReactiveGridVSR>> gridMapper = gridInvertibleMapper.mapperFor(null);
    // random robots
    for (int i = 0; i < 0; i++) {
      Grid<String> grid = partialGrammarMapper.apply(factory.independent().build(rg));
      System.out.println(Grid.toString(grid, GrammarTester::toChar));
      System.out.println("============");
      System.out.println(toPaperVersion(grid));
      System.out.println("=======================");
    }
    Locomotion task = (Locomotion) nb.build(TASK_LOCOMOTION);
    // given robots
    System.out.println("grammar-based");
    BIT_STRINGS.forEach(s -> {
      ReactiveGridVSR vsr = grammarMapper.apply(new BitString(s)).get();
      AgentsOutcome<AgentsObservation> outcome = task.run(
          () -> vsr,
          ServiceLoader.load(Engine.class).findFirst().orElseThrow()
      ).subOutcome(new DoubleRange(5, 30));
      System.out.printf(
          "%.5e\t%.5e\t%s%n",
          outcome.firstAgentAveragePower(),
          outcome.firstAgentXVelocity(),
          toPaperVersion(partialGrammarMapper.apply(new BitString(s)))
      );
    });
    System.out.println("grid-based");
    INT_STRINGS.forEach(s -> {
      IntString is = new IntString(Arrays.stream(s.split(",")).map(Integer::parseInt).toList(), 0, 7);
      ReactiveGridVSR vsr = gridMapper.apply(is).get();
      AgentsOutcome<AgentsObservation> outcome = task.run(
          () -> vsr,
          ServiceLoader.load(Engine.class).findFirst().orElseThrow()
      ).subOutcome(new DoubleRange(5, 30));
      System.out.printf(
          "%.5e\t%.5e\t%s%n",
          outcome.firstAgentAveragePower(),
          outcome.firstAgentXVelocity(),
          toPaperVersion(partialGridMapper.apply(is))
      );
    });
  }

  private static String toPaperVersion(Grid<String> grid) {
    return "\\cpol{%d;%d}{%s}".formatted(
        grid.w(),
        grid.h(),
        grid.keys()
            .stream()
            .sorted(Comparator.comparing(Grid.Key::y).reversed().thenComparing(Grid.Key::x))
            .map(k -> toChar(grid.get(k)).toString().replaceAll(" ", ""))
            .collect(Collectors.joining(";"))
    );
  }
}
