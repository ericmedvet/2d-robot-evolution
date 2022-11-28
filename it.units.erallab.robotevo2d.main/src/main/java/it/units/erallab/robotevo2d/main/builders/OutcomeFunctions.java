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

package it.units.erallab.robotevo2d.main.builders;

import it.units.erallab.mrsim2d.core.tasks.locomotion.Outcome;
import it.units.erallab.mrsim2d.core.util.DoubleRange;
import it.units.malelab.jgea.core.listener.NamedFunction;
import it.units.malelab.jnb.core.Param;

/**
 * @author "Eric Medvet" on 2022/08/11 for 2d-robot-evolution
 */
public class OutcomeFunctions {

  @SuppressWarnings("unused")
  public static NamedFunction<Outcome, Double> locomotionXVelocity(@Param(value = "transientT", dD = 0d) double transientT) {
    return NamedFunction.build(
        "vx",
        "%+5.2f",
        o -> o.subOutcome(new DoubleRange(transientT, o.duration())).xVelocity()
    );
  }

  @SuppressWarnings("unused")
  public static NamedFunction<it.units.erallab.mrsim2d.core.tasks.piling.Outcome, Double> pilingAverageHeight() {
    return NamedFunction.build(
        "dh",
        "%+5.2f",
        it.units.erallab.mrsim2d.core.tasks.piling.Outcome::averageMaxHeight
    );
  }

  @SuppressWarnings("unused")
  public static NamedFunction<it.units.erallab.mrsim2d.core.tasks.piling.Outcome, Double> pilingHeightDiff() {
    return NamedFunction.build(
        "dh",
        "%+5.2f",
        it.units.erallab.mrsim2d.core.tasks.piling.Outcome::pileHeightDiff
    );
  }

}
