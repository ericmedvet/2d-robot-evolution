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
import io.github.ericmedvet.jgea.experimenter.Representation;
import io.github.ericmedvet.jnb.core.NamedBuilder;
import io.github.ericmedvet.jnb.datastructure.Grid;
import java.util.Random;
import java.util.function.Function;
import java.util.random.RandomGenerator;

public class GrammarTester {
  private static final String MAPPER = """
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
  private static final String PARTIAL_MAPPER = """
      ea.m.bsToGrammarGrid(
        l = 1024;
        grammar = ea.grammar.gridFile(path = "src/main/resources/grammars/biped-vh123-improved.bnf")
      )
      """;
  private static final String REPRESENTATION = "ea.r.bitString()";

  public static void main(String[] args) {
    RandomGenerator rg = new Random(1);
    NamedBuilder<Object> nb = NamedBuilder.fromDiscovery();
    @SuppressWarnings("unchecked") InvertibleMapper<BitString, Grid<String>> invertibleMapper = ((InvertibleMapper<BitString, Grid<String>>) nb
        .build(PARTIAL_MAPPER));
    @SuppressWarnings("unchecked") Function<BitString, Representation<BitString>> representation = (Function<BitString, Representation<BitString>>) nb
        .build(REPRESENTATION);
    Factory<BitString> factory = representation.apply(invertibleMapper.exampleFor(null)).factory();
    Function<BitString, Grid<String>> mapper = invertibleMapper.mapperFor(null);
    for (int i = 0; i < 10; i++) {
      System.out.println(
          Grid.toString(
              mapper.apply(factory.independent().build(rg)),
              (Function<String, Character>) s -> s == null ? ' ' : (s.length() > 1 ? s.charAt(1) : s.charAt(0))
          )
      );
      System.out.println("=======================");
    }
  }
}
