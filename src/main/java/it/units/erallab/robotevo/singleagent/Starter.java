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
import it.units.erallab.mrsim.util.builder.TaskBuilder;
import it.units.erallab.robotevo.builder.ComparatorBuilder;
import it.units.erallab.robotevo.builder.PrototypedFunctionBuilder;
import it.units.erallab.robotevo.builder.RandomGeneratorBuilder;
import it.units.erallab.robotevo.builder.agent.AgentBuilder;
import it.units.erallab.robotevo.builder.mapper.MapperBuilder;
import it.units.erallab.robotevo.builder.solver.SolverBuilder;
import it.units.erallab.robotevo.builder.solver.SolverBuilderBuilder;
import it.units.malelab.jgea.core.order.PartialComparator;

import java.util.List;
import java.util.Random;
import java.util.function.Supplier;
import java.util.random.RandomGenerator;

/**
 * @author "Eric Medvet" on 2022/08/11 for 2d-robot-evolution
 */
public class Starter {

  public record TaskWithComparator<Q>(Task<Supplier<EmbodiedAgent>, Q> task, PartialComparator<Q> partialComparator) {}

  public record Run<G, Q>(
      SolverBuilder<G> solverBuilder,
      PrototypedFunctionBuilder<G, Supplier<EmbodiedAgent>> mapper,
      EmbodiedAgent target,
      Task<Supplier<EmbodiedAgent>, Q> task,
      PartialComparator<? super Q> comparator,
      RandomGenerator randomGenerator
  ) {}

  public record Experiment<G, Q>(
      List<? extends Run<? extends G, ? extends Q>> runs
  ) {}

  private final static NamedBuilder<Object> NB = new NamedBuilder<>();

  static {
    NB.register(List.of("randomGenerator", "rg"), RandomGeneratorBuilder.getInstance());
    NB.register(List.of("gridVsrBody", "gvb"), GridVSRBodyBuilder.getInstance());
    NB.register(List.of("task", "t"), TaskBuilder.getInstance());
    NB.register(List.of("comparator", "c"), ComparatorBuilder.getInstance());
    NB.register(List.of("solver", "s"), SolverBuilderBuilder.getInstance());
    NB.register(List.of("mapper", "m"), MapperBuilder.getInstance());
    NB.register(List.of("agent", "a"), AgentBuilder.getInstance());
    NB.register("vsr", GridVSRBodyBuilder.getInstance());
    NB.register("exp", (m, nb) -> new Experiment<Object, Object>(
        m.npms("runs").stream()
            .map(im -> (Run<?, ?>) nb.build(im)
                .orElseThrow(() -> new IllegalArgumentException("Cannot build run for " + im)))
            .toList()
    ));
    //noinspection unchecked
    NB.register("run", (m, nb) -> new Run<>(
        (SolverBuilder<Object>) nb.build(m.npm("solver"))
            .orElseThrow(() -> new IllegalArgumentException("Cannot build solver")),
        (PrototypedFunctionBuilder<Object, Supplier<EmbodiedAgent>>) nb.build(m.npm("mapper"))
            .orElseThrow(() -> new IllegalArgumentException("Cannot build mapper")),
        (EmbodiedAgent) nb.build(m.npm("target"))
            .orElseThrow(() -> new IllegalArgumentException("Cannot build target")),
        (Task<Supplier<EmbodiedAgent>, Object>) nb.build(m.npm("task"))
            .orElseThrow(() -> new IllegalArgumentException("Cannot build task")),
        (PartialComparator<Object>) nb.build(m.npm("comparator"))
            .orElseThrow(() -> new IllegalArgumentException("Cannot build task")),
        ((NamedBuilder<Object>) nb).build(m.npm("randomGenerator"), (Supplier<RandomGenerator>) () -> new Random(1))
            .orElseThrow()
    ));
  }

  public static void main(String[] args) {
    String s = "exp(runs=[run(" +
        "solver=s.doublesStandard(nEval=1000);" +
        "mapper=m.centralizedVsrBrain(trf=m.doublesMlp());" +
        "target=a.dumbCentralizedNumVSR(body=vsr.plain(shape=vsr.s.biped(w=4;h=3);sensorizingFunction=vsr.sf.uniform" +
        "(sensors=[vsr.sf.s.d(a=-90)])));" +
        "task=t.locomotion(terrain=t.t.flat());" +
        "comparator=c.locomotionXVelocity();" +
        "randomGenerator=rg.default()" +
        ")])";
    Experiment<?, ?> experiment = (Experiment<?, ?>) NB.build(s)
        .orElseThrow(() -> new IllegalArgumentException("Cannot read experiment"));
    System.out.println(experiment);
  }

}
