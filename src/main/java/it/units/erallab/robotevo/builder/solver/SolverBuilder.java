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

package it.units.erallab.robotevo.builder.solver;

import it.units.erallab.robotevo.builder.MapperBuilder;
import it.units.malelab.jgea.core.QualityBasedProblem;
import it.units.malelab.jgea.core.solver.IterativeSolver;
import it.units.malelab.jgea.core.solver.state.POSetPopulationState;

/**
 * @author "Eric Medvet" on 2022/02/14 for VSREvolution
 */
public interface SolverBuilder<G> {
  <S, Q> IterativeSolver<? extends POSetPopulationState<G, S, Q>, QualityBasedProblem<S, Q>, S> build(
      MapperBuilder<G, S> builder,
      S target
  );

}
