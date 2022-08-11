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

import it.units.erallab.mrsim.util.builder.NamedBuilder;
import it.units.erallab.mrsim.util.builder.ParamMap;
import it.units.erallab.robotevo.builder.PrototypedFunctionBuilder;
import it.units.malelab.jgea.core.IndependentFactory;
import it.units.malelab.jgea.core.QualityBasedProblem;
import it.units.malelab.jgea.core.operator.GeneticOperator;
import it.units.malelab.jgea.core.selector.Last;
import it.units.malelab.jgea.core.selector.Tournament;
import it.units.malelab.jgea.core.solver.IterativeSolver;
import it.units.malelab.jgea.core.solver.StandardEvolver;
import it.units.malelab.jgea.core.solver.StandardWithEnforcedDiversityEvolver;
import it.units.malelab.jgea.core.solver.StopConditions;
import it.units.malelab.jgea.core.solver.state.POSetPopulationState;
import it.units.malelab.jgea.representation.sequence.FixedLengthListFactory;
import it.units.malelab.jgea.representation.sequence.UniformCrossover;
import it.units.malelab.jgea.representation.sequence.numeric.GaussianMutation;
import it.units.malelab.jgea.representation.sequence.numeric.UniformDoubleFactory;

import java.util.List;
import java.util.Map;

/**
 * @author "Eric Medvet" on 2022/08/11 for 2d-robot-evolution
 */
public class DoublesStandard implements NamedBuilder.Builder<SolverBuilder<List<Double>>> {

  @Override
  public SolverBuilder<List<Double>> build(ParamMap m, NamedBuilder<?> nb) throws IllegalArgumentException {
    double initialMinV = m.d("initialMinV", -1d);
    double initialMaxV = m.d("initialMaxV", 1d);
    double crossoverP = m.d("crossoverP", 0.8d);
    double sigmaMut = m.d("sigmaMut", 0.35d);
    double tournamentRate = m.d("tournamentRate", 0.05d);
    int minNTournament = m.i("minNTournament", 3);
    int nPop = m.i("nPop", 100);
    int nEval = m.i("nEval");
    boolean diversity = m.b("diversity", false);
    boolean remap = m.b("remap", false);
    return new SolverBuilder<>() {
      @Override
      public <S, Q> IterativeSolver<? extends POSetPopulationState<List<Double>, S, Q>, QualityBasedProblem<S, Q>, S> build(
          PrototypedFunctionBuilder<List<Double>, S> mapper,
          S target
      ) {
        IndependentFactory<List<Double>> doublesFactory = new FixedLengthListFactory<>(
            mapper.exampleFor(target).size(),
            new UniformDoubleFactory(initialMinV, initialMaxV)
        );
        Map<GeneticOperator<List<Double>>, Double> geneticOperators = Map.of(
            new GaussianMutation(sigmaMut), 1d - crossoverP,
            new UniformCrossover<>(doublesFactory).andThen(new GaussianMutation(sigmaMut)), crossoverP
        );
        if (!diversity) {
          return new StandardEvolver<>(
              mapper.buildFor(target),
              doublesFactory,
              nPop,
              StopConditions.nOfFitnessEvaluations(nEval),
              geneticOperators,
              new Tournament(Math.max(minNTournament, (int) Math.ceil((double) nPop * tournamentRate))),
              new Last(),
              nPop,
              true,
              remap,
              (p, r) -> new POSetPopulationState<>()
          );
        } else {
          return new StandardWithEnforcedDiversityEvolver<>(
              mapper.buildFor(target),
              doublesFactory,
              nPop,
              StopConditions.nOfFitnessEvaluations(nEval),
              geneticOperators,
              new Tournament(Math.max(minNTournament, (int) Math.ceil((double) nPop * tournamentRate))),
              new Last(),
              nPop,
              true,
              remap,
              (p, r) -> new POSetPopulationState<>(),
              100
          );
        }
      }
    };
  }
}
