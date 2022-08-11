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

/**
 * @author "Eric Medvet" on 2022/08/11 for 2d-robot-evolution
 */
public class ComparatorBuilder extends NamedBuilder<PartialComparator<?>> {

  private ComparatorBuilder() {
    register("locomotionXVelocity", ComparatorBuilder::createLocomotionVelocity);
  }

  private static PartialComparator<Locomotion.Outcome> createLocomotionVelocity(ParamMap m, NamedBuilder<?> nb) {
    double transientT = m.d("transientT", 0d);
    return (o1, o2) -> {
      int o = Double.compare(
          o1.subOutcome(new DoubleRange(transientT, o1.duration())).xVelocity(),
          o1.subOutcome(new DoubleRange(transientT, o2.duration())).xVelocity()
      );
      if (o<0) {
        return PartialComparator.PartialComparatorOutcome.BEFORE;
      } else if (o>0) {
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
