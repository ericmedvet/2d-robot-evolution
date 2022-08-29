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

package it.units.erallab.robotevo2d.main.builder.solver;

import it.units.erallab.mrsim2d.builder.Param;
import it.units.erallab.robotevo2d.main.builder.MapperBuilder;
import it.units.malelab.jgea.core.IndependentFactory;
import it.units.malelab.jgea.core.QualityBasedProblem;
import it.units.malelab.jgea.core.operator.GeneticOperator;
import it.units.malelab.jgea.core.representation.sequence.FixedLengthListFactory;
import it.units.malelab.jgea.core.representation.sequence.UniformCrossover;
import it.units.malelab.jgea.core.representation.sequence.numeric.GaussianMutation;
import it.units.malelab.jgea.core.representation.sequence.numeric.UniformDoubleFactory;
import it.units.malelab.jgea.core.selector.Last;
import it.units.malelab.jgea.core.selector.Tournament;
import it.units.malelab.jgea.core.solver.IterativeSolver;
import it.units.malelab.jgea.core.solver.StandardEvolver;
import it.units.malelab.jgea.core.solver.StandardWithEnforcedDiversityEvolver;
import it.units.malelab.jgea.core.solver.StopConditions;
import it.units.malelab.jgea.core.solver.state.POSetPopulationState;

import java.util.List;
import java.util.Map;

/**
 * @author "Eric Medvet" on 2022/08/11 for 2d-robot-evolution
 */
public class DoublesStandard implements SolverBuilder<List<Double>> {

  private final double initialMinV;
  private final double initialMaxV;
  private final double crossoverP;
  private final double sigmaMut;
  private final double tournamentRate;
  private final int minNTournament;
  private final int nPop;
  private final int nEval;
  private final boolean diversity;
  private final boolean remap;

  public DoublesStandard(
      @Param(value = "initialMinV", dD = -1d) double initialMinV,
      @Param(value = "initialMaxV", dD = 1d) double initialMaxV,
      @Param(value = "crossoverP", dD = 0.8d) double crossoverP,
      @Param(value = "sigmaMut", dD = 0.35d) double sigmaMut,
      @Param(value = "tournamentRate", dD = 0.05d) double tournamentRate,
      @Param(value = "minNTournament", dI = 3) int minNTournament,
      @Param(value = "nPop", dI = 100) int nPop,
      @Param(value = "nEval") int nEval,
      @Param(value = "diversity") boolean diversity,
      @Param(value = "remap") boolean remap
  ) {
    this.initialMinV = initialMinV;
    this.initialMaxV = initialMaxV;
    this.crossoverP = crossoverP;
    this.sigmaMut = sigmaMut;
    this.tournamentRate = tournamentRate;
    this.minNTournament = minNTournament;
    this.nPop = nPop;
    this.nEval = nEval;
    this.diversity = diversity;
    this.remap = remap;

  }

  @Override
  public <S, Q> IterativeSolver<? extends POSetPopulationState<List<Double>, S, Q>, QualityBasedProblem<S, Q>, S> build(
      MapperBuilder<List<Double>, S> mapper,
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
}
