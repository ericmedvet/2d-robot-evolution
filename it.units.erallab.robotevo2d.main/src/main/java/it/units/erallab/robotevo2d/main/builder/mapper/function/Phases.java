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

package it.units.erallab.robotevo2d.main.builder.mapper.function;

import it.units.erallab.mrsim2d.builder.Param;
import it.units.erallab.mrsim2d.core.functions.TimedRealFunction;
import it.units.erallab.robotevo2d.main.builder.MapperBuilder;

import java.util.Collections;
import java.util.List;
import java.util.function.Function;

/**
 * @author "Eric Medvet" on 2022/08/11 for 2d-robot-evolution
 */
public class Phases implements MapperBuilder<List<Double>, TimedRealFunction> {

  private final double frequency;
  private final double amplitude;

  public Phases(
      @Param(value = "f", dD = 1f) double frequency,
      @Param(value = "a", dD = 1f) double amplitude
  ) {
    this.frequency = frequency;
    this.amplitude = amplitude;
  }

  @Override
  public Function<List<Double>, TimedRealFunction> buildFor(TimedRealFunction trf) {
    return values -> {
      int nOfOutputs = trf.nOfOutputs();
      if (values.size() != nOfOutputs) {
        throw new IllegalArgumentException(String.format(
            "Wrong number of values: %d expected, %d found",
            nOfOutputs,
            values.size()
        ));
      }
      return TimedRealFunction.from(
          (t, in) -> values.stream()
              .mapToDouble(v -> amplitude * Math.sin(2d * Math.PI * frequency * t + v))
              .toArray(),
          trf.nOfInputs(),
          trf.nOfOutputs()
      );
    };
  }

  @Override
  public List<Double> exampleFor(TimedRealFunction trf) {
    return Collections.nCopies(trf.nOfOutputs(), 0d);
  }

}
