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

package it.units.erallab.robotevo.builder.mapper.agent;

import it.units.erallab.mrsim.agents.gridvsr.CentralizedNumGridVSR;
import it.units.erallab.mrsim.agents.gridvsr.NumGridVSR;
import it.units.erallab.mrsim.functions.TimedRealFunction;
import it.units.erallab.mrsim.util.builder.NamedBuilder;
import it.units.erallab.mrsim.util.builder.ParamMap;
import it.units.erallab.robotevo.builder.PrototypedFunctionBuilder;

import java.util.List;
import java.util.function.Function;

/**
 * @author "Eric Medvet" on 2022/08/11 for 2d-robot-evolution
 */
public class CentralizedNumGridVSRBrain implements NamedBuilder.Builder<PrototypedFunctionBuilder<List<Double>,
    CentralizedNumGridVSR>> {
  @SuppressWarnings("unchecked")
  @Override
  public PrototypedFunctionBuilder<List<Double>, CentralizedNumGridVSR> build(
      ParamMap m,
      NamedBuilder<?> nb
  ) throws IllegalArgumentException {
    PrototypedFunctionBuilder<List<Double>, TimedRealFunction> trfMapper = (PrototypedFunctionBuilder<List<Double>,
        TimedRealFunction>) nb.build(
        m.npm("trf")).orElseThrow(() -> new IllegalArgumentException("No value for the timerdRealFunction"));
    return new PrototypedFunctionBuilder<TimedRealFunction, CentralizedNumGridVSR>() {
      @Override
      public Function<TimedRealFunction, CentralizedNumGridVSR> buildFor(CentralizedNumGridVSR target) {
        return trf -> new CentralizedNumGridVSR(
            new NumGridVSR.Body(target.getBody().grid()),
            trf
        );
      }

      @Override
      public TimedRealFunction exampleFor(CentralizedNumGridVSR centralizedNumGridVSR) {
        return TimedRealFunction.from(
            (t, in) -> in,
            centralizedNumGridVSR.nOfInputs(),
            centralizedNumGridVSR.nOfOutputs()
        );
      }
    }.compose(trfMapper);
  }
}
