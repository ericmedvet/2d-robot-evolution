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

import it.units.erallab.mrsim.util.builder.Param;
import it.units.erallab.robotevo.builder.MapperBuilder;
import it.units.malelab.jgea.core.QualityBasedProblem;
import it.units.malelab.jgea.core.solver.IterativeSolver;
import it.units.malelab.jgea.core.solver.SimpleEvolutionaryStrategy;
import it.units.malelab.jgea.core.solver.StopConditions;
import it.units.malelab.jgea.core.solver.state.POSetPopulationState;
import it.units.malelab.jgea.representation.sequence.FixedLengthListFactory;
import it.units.malelab.jgea.representation.sequence.numeric.UniformDoubleFactory;

import java.util.List;
import java.util.function.Function;

/**
 * @author "Eric Medvet" on 2022/08/14 for 2d-robot-evolution
 */
public class SimpleES implements SolverBuilder<List<Double>> {

  private final double initialMinV;
  private final double initialMaxV;
  private final double sigma;
  private final double parentsRate;
  private final int nOfElites;
  private final int nPop;
  private final int nEval;
  private final boolean remap;
  private final Function<?, Double> qExtractor;
  private final Goal goal;
  public SimpleES(
      @Param(value = "initialMinV", dD = -1d) double initialMinV,
      @Param(value = "initialMaxV", dD = 1d) double initialMaxV,
      @Param(value = "sigma", dD = 0.35d) double sigma,
      @Param(value = "parentsRate", dD = 0.33d) double parentsRate,
      @Param(value = "nOfElites", dI = 1) int nOfElites,
      @Param(value = "nPop", dI = 30) int nPop,
      @Param(value = "nEval") int nEval,
      @Param(value = "remap") boolean remap,
      @Param(value = "qExtractor") Function<?, Double> qExtractor,
      @Param(value = "goal", dS = "min") String goalString
  ) {
    this.initialMinV = initialMinV;
    this.initialMaxV = initialMaxV;
    this.sigma = sigma;
    this.parentsRate = parentsRate;
    this.nOfElites = nOfElites;
    this.nPop = nPop;
    this.nEval = nEval;
    this.remap = remap;
    this.qExtractor = qExtractor;
    this.goal = Goal.valueOf(goalString.toUpperCase());
  }

  private enum Goal {MAX, MIN}

  @Override
  public <S, Q> IterativeSolver<? extends POSetPopulationState<List<Double>, S, Q>, QualityBasedProblem<S, Q>, S> build(
      MapperBuilder<List<Double>, S> builder,
      S target
  ) {
    SimpleEvolutionaryStrategy<S, Q> es = new SimpleEvolutionaryStrategy<>(
        builder.buildFor(target),
        new FixedLengthListFactory<>(
            builder.exampleFor(target).size(),
            new UniformDoubleFactory(initialMinV, initialMaxV)
        ),
        nPop,
        StopConditions.nOfFitnessEvaluations(nEval),
        (int) Math.round(nPop * parentsRate),
        nOfElites,
        sigma,
        remap
    );
    /*
    @SuppressWarnings("unchecked") Function<Q, Double> qDoubleFunction = (Function<Q, Double>) qExtractor;
    Comparator<Q> qComparator = switch (goal) {
      case MIN -> Comparator.comparing(qDoubleFunction);
      case MAX -> Comparator.comparing(qDoubleFunction).reversed();
    };
    return es.with((QualityBasedProblem<S, Q> p) -> new TotalOrderQualityBasedProblem<>() {
      @Override
      public Function<S, Q> qualityFunction() {
        return p.qualityFunction();
      }

      @Override
      public Comparator<Q> totalOrderComparator() {
        return qComparator;
      }
    });

     */
    return null;
  }
}
