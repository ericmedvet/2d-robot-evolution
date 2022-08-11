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

package it.units.erallab.robotevo.builder.agent;

import it.units.erallab.mrsim.agents.gridvsr.CentralizedNumGridVSR;
import it.units.erallab.mrsim.agents.gridvsr.NumGridVSR;
import it.units.erallab.mrsim.functions.TimedRealFunction;
import it.units.erallab.mrsim.util.builder.NamedBuilder;
import it.units.erallab.mrsim.util.builder.ParamMap;

/**
 * @author "Eric Medvet" on 2022/08/11 for 2d-robot-evolution
 */
public class DumbCentralizedNumGridVSR implements NamedBuilder.Builder<CentralizedNumGridVSR> {

  @Override
  public CentralizedNumGridVSR build(ParamMap m, NamedBuilder<?> nb) throws IllegalArgumentException {
    NumGridVSR.Body body = (NumGridVSR.Body) nb.build(m.npm("body")).orElseThrow(() -> new IllegalArgumentException(
        "No value for the body"));
    int nOfInputs = CentralizedNumGridVSR.nOfInputs(body);
    int nOfOutputs = CentralizedNumGridVSR.nOfOutputs(body);
    return new CentralizedNumGridVSR(
        body,
        TimedRealFunction.from((t, in) -> new double[nOfOutputs], nOfInputs, nOfOutputs)
    );
  }
}
