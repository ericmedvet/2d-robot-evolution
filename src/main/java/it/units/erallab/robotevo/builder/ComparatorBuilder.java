/*
 * Copyright 2022 Eric Medvet <eric.medvet@gmail.com> (as eric)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package it.units.erallab.robotevo.builder;

import it.units.erallab.mrsim.tasks.locomotion.Locomotion;
import it.units.erallab.mrsim.util.DoubleRange;
import it.units.erallab.mrsim.util.builder.NamedBuilder;
import it.units.erallab.mrsim.util.builder.ParamMap;
import it.units.malelab.jgea.core.order.PartialComparator;

import java.util.Comparator;
import java.util.function.Function;

/**
 * @author "Eric Medvet" on 2022/08/11 for 2d-robot-evolution
 */
public class ComparatorBuilder extends NamedBuilder<PartialComparator<?>> {

  private ComparatorBuilder() {
    register("min", ComparatorBuilder::createMin);
    register("max", (m, nb) -> createMin(m, nb).reversed());
  }


  @SuppressWarnings("unchecked")
  private static PartialComparator<Object> createMin(ParamMap m, NamedBuilder<?> nb) {
    Function<Object, Double> extractor = (Function<Object, Double>) nb.build(m.npm("of"))
        .orElseThrow(() -> new IllegalArgumentException("No value for of"));
    return (k1, k2) -> {
      int o = Double.compare(extractor.apply(k1), extractor.apply(k2));
      if (o < 0) {
        return PartialComparator.PartialComparatorOutcome.BEFORE;
      } else if (o > 0) {
        return PartialComparator.PartialComparatorOutcome.AFTER;
      }
      return PartialComparator.PartialComparatorOutcome.SAME;
    };
  }

  private final static ComparatorBuilder INSTANCE = new ComparatorBuilder();

  public static ComparatorBuilder getInstance() {
    return INSTANCE;
  }

}
