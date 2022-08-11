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

package it.units.erallab.robotevo.singleagent;

import it.units.erallab.mrsim.core.EmbodiedAgent;
import it.units.erallab.mrsim.tasks.Task;
import it.units.erallab.mrsim.util.builder.GridVSRBodyBuilder;
import it.units.erallab.mrsim.util.builder.NamedBuilder;
import it.units.erallab.robotevo.builder.PrototypedFunctionBuilder;
import it.units.malelab.jgea.core.solver.AbstractPopulationBasedIterativeSolver;

import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.function.Supplier;
import java.util.random.RandomGenerator;

/**
 * @author "Eric Medvet" on 2022/08/11 for 2d-robot-evolution
 */
public class Starter {

  public record Run<G, Q>(
      AbstractPopulationBasedIterativeSolver<?, ?, G, Supplier<EmbodiedAgent>, Q> solver,
      PrototypedFunctionBuilder<G, Supplier<EmbodiedAgent>> mapper,
      Task<Supplier<EmbodiedAgent>, Q> task,
      RandomGenerator randomGenerator
  ) {}

  public record Experiment<G, Q>(
      List<? extends Run<? extends G, ? extends Q>> runs
  ) {}

  private final static NamedBuilder<Object> NB = new NamedBuilder<>();

  static {
    NB.register("vsr", GridVSRBodyBuilder.getInstance());
    NB.register("exp", (m, nb) -> new Experiment<Object, Object>(
        m.npms("runs").stream()
            .map(im -> (Run<?, ?>) nb.build(im).orElseThrow(() -> new IllegalArgumentException("Cannot build run for "+im)))
            .toList()
    ));
    //noinspection unchecked
    NB.register("run", (m, nb) -> new Run<>(
        (AbstractPopulationBasedIterativeSolver<?, ?, Object, Supplier<EmbodiedAgent>, Object>) nb.build(m.npm("solver"))
            .orElseThrow(() -> new IllegalArgumentException("Cannot build solver")),
        (PrototypedFunctionBuilder<Object, Supplier<EmbodiedAgent>>)nb.build(m.npm("mapper"))
            .orElseThrow(() -> new IllegalArgumentException("Cannot build mapper")),
        (Task<Supplier<EmbodiedAgent>, Object>) nb.build(m.npm("task"))
            .orElseThrow(() -> new IllegalArgumentException("Cannot build task")),
        (RandomGenerator) nb.build(m.npm("randomGenerator")).orElseThrow() //TODO use a default value
    ));
  }

}
