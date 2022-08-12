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
import it.units.erallab.mrsim.engine.Engine;
import it.units.erallab.mrsim.engine.dyn4j.Dyn4JEngine;
import it.units.erallab.mrsim.tasks.Task;
import it.units.erallab.mrsim.util.builder.GridVSRBodyBuilder;
import it.units.erallab.mrsim.util.builder.NamedBuilder;
import it.units.erallab.mrsim.util.builder.ParamMap;
import it.units.erallab.mrsim.util.builder.TaskBuilder;
import it.units.erallab.robotevo.builder.*;
import it.units.erallab.robotevo.builder.agent.AgentBuilder;
import it.units.erallab.robotevo.builder.mapper.MapperBuilder;
import it.units.erallab.robotevo.builder.solver.SolverBuilder;
import it.units.erallab.robotevo.builder.solver.SolverBuilderBuilder;
import it.units.malelab.jgea.Worker;
import it.units.malelab.jgea.core.QualityBasedProblem;
import it.units.malelab.jgea.core.listener.*;
import it.units.malelab.jgea.core.order.PartialComparator;
import it.units.malelab.jgea.core.solver.Individual;
import it.units.malelab.jgea.core.solver.IterativeSolver;
import it.units.malelab.jgea.core.solver.SolverException;
import it.units.malelab.jgea.core.solver.state.POSetPopulationState;
import it.units.malelab.jgea.core.util.Misc;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.time.Instant;
import java.util.*;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.logging.Logger;
import java.util.random.RandomGenerator;
import java.util.stream.Collectors;

import static it.units.malelab.jgea.core.listener.NamedFunctions.*;

/**
 * @author "Eric Medvet" on 2022/08/11 for 2d-robot-evolution
 */
public class Starter extends Worker {

  public record Run<G, Q>(
      SolverBuilder<G> solverBuilder,
      PrototypedFunctionBuilder<G, Supplier<EmbodiedAgent>> mapper,
      EmbodiedAgent target,
      Task<Supplier<EmbodiedAgent>, Q> task,
      PartialComparator<? super Q> comparator,
      RandomGenerator randomGenerator,
      ParamMap map
  ) {}

  private record FileSaver<Q>(
      String fileName,
      Function<? super Q, String> serializer
  ) {}

  public record Experiment<G, Q>(
      List<? extends Run<? extends G, ? extends Q>> runs,
      Function<? super Q, Double> qExtractor,
      FileSaver<Q> bestFileSaver
  ) {}

  private final static NamedBuilder<Object> NB = new NamedBuilder<>();
  private final static Logger L = Logger.getLogger(Starter.class.getName());

  static {
    NB.register(List.of("randomGenerator", "rg"), RandomGeneratorBuilder.getInstance());
    NB.register(List.of("gridVsrBody", "gvb"), GridVSRBodyBuilder.getInstance());
    NB.register(List.of("task", "t"), TaskBuilder.getInstance());
    NB.register(List.of("comparator", "c"), ComparatorBuilder.getInstance());
    NB.register(List.of("extractor", "e"), ExtractorBuilder.getInstance());
    NB.register(List.of("serializer"), SerializerBuilder.getInstance());
    NB.register(List.of("solver", "s"), SolverBuilderBuilder.getInstance());
    NB.register(List.of("mapper", "m"), MapperBuilder.getInstance());
    NB.register(List.of("agent", "a"), AgentBuilder.getInstance());
    NB.register("vsr", GridVSRBodyBuilder.getInstance());
    //noinspection unchecked
    NB.register("exp", (m, nb) -> new Experiment<Object, Object>(
        m.npms("runs").stream()
            .map(im -> (Run<?, ?>) nb.build(im)
                .orElseThrow(() -> new IllegalArgumentException("Cannot build run for " + im)))
            .toList(),
        (Function<Object, Double>) nb.build(m.npm("qExtractor"))
            .orElseThrow(() -> new IllegalArgumentException("Cannot build extractor")),
        (FileSaver<Object>) ((m.npm("bestFileSaver") == null) ? null : nb.build(m.npm("bestFileSaver"))
            .orElseThrow(() -> new IllegalArgumentException("Cannot build best file saver")))
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
            .orElseThrow(() -> new IllegalArgumentException("Cannot build comparator")),
        ((NamedBuilder<Object>) nb).build(m.npm("randomGenerator"), (Supplier<RandomGenerator>) () -> new Random(1))
            .orElseThrow(),
        m
    ));
    //noinspection unchecked
    NB.register("fileSaver", (m, nb) -> new FileSaver<>(
        m.s("file"),
        (Function<? super Object, String>) nb.build(m.npm("serializer"))
            .orElseThrow(() -> new IllegalArgumentException("Cannot build serializer"))
    ));
  }

  public Starter(String[] args) {
    super(args);
  }

  public static void main(String[] args) {
    new Starter(args);
  }

  @Override
  public void run() {
    //read experiment description
    String descFile = a("descFile", null);
    if (descFile == null) {
      throw new IllegalArgumentException("Experiment description file not provided");
    }
    Experiment<?, ?> experiment;
    try (BufferedReader br = new BufferedReader(new FileReader(descFile))) {
      String expDescription = br.lines().collect(Collectors.joining());
      experiment = (Experiment<?, ?>) NB.build(expDescription)
          .orElseThrow(() -> new IllegalArgumentException("Cannot parse experiment description"));
    } catch (IOException e) {
      throw new IllegalArgumentException(String.format("Cannot read experiment description: %s", e));
    }
    //create engine
    Supplier<Engine> engineSupplier = Dyn4JEngine::new;
    //create common listeners and progress monitor
    List<NamedFunction<? super POSetPopulationState<?, Supplier<EmbodiedAgent>, ?>, ?>> basicFunctions = List.of(
        iterations(),
        births(),
        fitnessEvaluations(),
        elapsedSeconds()
    );
    @SuppressWarnings("unchecked") Function<Object, Double> qFunction =
        (Function<Object, Double>) experiment.qExtractor();
    List<NamedFunction<? super Individual<?, Supplier<EmbodiedAgent>, ?>, ?>> individualFunctions = List.of(
        size().of(genotype()),
        f("genotype.birth.iteration", "%4d", Individual::genotypeBirthIteration),
        f("q", "%+6.3f", i -> qFunction.apply(i.fitness()))
    );
    List<NamedFunction<? super POSetPopulationState<?, Supplier<EmbodiedAgent>, ?>, ?>> visualFunctions = List.of(
        hist(8).of(each(f("q", qFunction).of(fitness()))).of(all())
    );
    @SuppressWarnings({"rawtypes", "unchecked"}) List<NamedFunction<? super POSetPopulationState<?,
        Supplier<EmbodiedAgent>, ?>, ?>> nonVisualFunctions =
        Misc.concat(List.of(
            basicFunctions,
            best().then((List) individualFunctions)
        ));
    List<NamedFunction<? super POSetPopulationState<?, Supplier<EmbodiedAgent>, ?>, ?>> screenFunctions = Misc.concat(
        List.of(
            nonVisualFunctions,
            visualFunctions
        ));
    List<NamedFunction<? super Map<String, Object>, ?>> keysFunctions = List.of(
        attribute("solver"),
        attribute("mapper"),
        attribute("target"),
        attribute("task"),
        attribute("comparator"),
        attribute("randomGenerator")
    );
    List<ListenerFactory<? super POSetPopulationState<?, Supplier<EmbodiedAgent>, ?>, Map<String, Object>>> factories = new ArrayList<>();
    factories.add(new TabularPrinter<>(screenFunctions, List.of()));
    if (experiment.bestFileSaver() != null) {
      @SuppressWarnings("unchecked") Function<Object, String> serializer =
          (Function<Object, String>) experiment.bestFileSaver()
              .serializer();
      List<NamedFunction<? super Individual<?, Supplier<EmbodiedAgent>, ?>, ?>> individualFileFunctions = List.of(
          f("g", "%s", i -> serializer.apply(i.genotype()))
      );
      @SuppressWarnings({"unchecked", "rawtypes"}) List<NamedFunction<? super POSetPopulationState<?,
          Supplier<EmbodiedAgent>, ?>,
          ?>> fileFunctions = Misc.concat(
          List.of(
              nonVisualFunctions,
              best().then((List) individualFileFunctions)
          ));
      factories.add(new CSVPrinter<>(fileFunctions, keysFunctions, new File(experiment.bestFileSaver().fileName())));
    }
    ListenerFactory<? super POSetPopulationState<?, Supplier<EmbodiedAgent>, ?>, Map<String, Object>> factory =
        ListenerFactory.all(factories);
    ProgressMonitor progressMonitor = new ScreenProgressMonitor(System.out);
    //iterate over runs
    for (int i = 0; i < experiment.runs().size(); i++) {
      Run<?, ?> run = experiment.runs().get(i);
      progressMonitor.notify(
          (float) i / (float) experiment.runs().size(),
          String.format("Starting %d/%d run: %s", i, experiment.runs().size(), run.map())
      );
      //build solver
      IterativeSolver<? extends POSetPopulationState<?, Supplier<EmbodiedAgent>, ?>,
          QualityBasedProblem<Supplier<EmbodiedAgent>, ?>, Supplier<EmbodiedAgent>> solver;
      try {
        //noinspection unchecked,rawtypes
        solver = run.solverBuilder().build(
            (PrototypedFunctionBuilder) run.mapper(),
            (Supplier<EmbodiedAgent>) run::target
        );
      } catch (RuntimeException e) {
        L.warning(String.format("Cannot instantiate solver %s: %s", run.map().npm("solver"), e));
        e.printStackTrace();
        break;
      }
      //build problem
      @SuppressWarnings("unchecked") QualityBasedProblem<Supplier<EmbodiedAgent>, ?> problem =
          QualityBasedProblem.create(
              s -> run.task().run(s, engineSupplier.get()),
              (PartialComparator<Object>) run.comparator()
          );
      //build listener
      Listener<? super POSetPopulationState<?, Supplier<EmbodiedAgent>, ?>> listener = factory.build(Map.ofEntries(
          Map.entry("solver", run.map().npm("solver")),
          Map.entry("mapper", run.map().npm("mapper")),
          Map.entry("target", run.map().npm("target")),
          Map.entry("task", run.map().npm("task")),
          Map.entry("comparator", run.map().npm("comparator")),
          Map.entry("randomGenerator", run.map().npm("randomGenerator"))
      ));
      //do optimization
      try {
        Instant startingT = Instant.now();
        Collection<Supplier<EmbodiedAgent>> solutions = solver.solve(
            problem,
            run.randomGenerator(),
            executorService,
            listener
        );
        double elapsedT = Duration.between(startingT, Instant.now()).toMillis() / 1000d;
        progressMonitor.notify(
            (float) (i + 1) / (float) experiment.runs().size(),
            String.format(
                "%d/%d run done in %.2fs, found %d solutions",
                i,
                experiment.runs().size(),
                elapsedT,
                solutions.size()
            )
        );
      } catch (SolverException e) {
        L.warning(String.format("Cannot solve %s: %s", run.map(), e));
        break;
      }
    }
    factory.shutdown();
  }
}
