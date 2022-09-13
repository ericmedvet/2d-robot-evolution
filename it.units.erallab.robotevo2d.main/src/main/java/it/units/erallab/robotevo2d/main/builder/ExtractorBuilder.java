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

package it.units.erallab.robotevo2d.main.builder;

import it.units.erallab.mrsim2d.builder.Param;
import it.units.erallab.mrsim2d.core.tasks.locomotion.Locomotion;
import it.units.erallab.mrsim2d.core.util.DoubleRange;
import it.units.malelab.jgea.core.listener.NamedFunction;

/**
 * @author "Eric Medvet" on 2022/08/11 for 2d-robot-evolution
 */
public class ExtractorBuilder {

  public static NamedFunction<Locomotion.Outcome, Double> locomotionXVelocity(@Param(value = "transientT", dD = 0d) double transientT) {
    return NamedFunction.build(
        "vx",
        "%+5.2f",
        o -> o.subOutcome(new DoubleRange(transientT, o.duration())).xVelocity()
    );
  }

}
