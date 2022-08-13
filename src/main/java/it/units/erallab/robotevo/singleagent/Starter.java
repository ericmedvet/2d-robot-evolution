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

import it.units.erallab.mrsim.agents.gridvsr.NumGridVSR;
import it.units.erallab.mrsim.builders.GridShapeBuilder;
import it.units.erallab.mrsim.builders.TerrainBuilder;
import it.units.erallab.mrsim.builders.VSRSensorizingFunctionBuilder;
import it.units.erallab.mrsim.builders.VoxelSensorBuilder;
import it.units.erallab.mrsim.core.EmbodiedAgent;
import it.units.erallab.mrsim.engine.Engine;
import it.units.erallab.mrsim.engine.dyn4j.Dyn4JEngine;
import it.units.erallab.mrsim.tasks.Task;
import it.units.erallab.mrsim.util.builder.NamedBuilder;
import it.units.erallab.mrsim.util.builder.Param;
import it.units.erallab.mrsim.util.builder.ParamMap;
import it.units.erallab.robotevo.builder.ComparatorBuilder;
import it.units.erallab.robotevo.builder.ExtractorBuilder;
import it.units.erallab.robotevo.builder.MapperBuilder;
import it.units.erallab.robotevo.builder.RandomGeneratorBuilder;
import it.units.erallab.robotevo.builder.mapper.Composition;
import it.units.erallab.robotevo.builder.mapper.agent.CentralizedNumGridVSRBrain;
import it.units.erallab.robotevo.builder.mapper.function.DoublesMultiLayerPerceptron;
import it.units.erallab.robotevo.builder.solver.DoublesStandard;
import it.units.erallab.robotevo.builder.solver.SolverBuilder;
import it.units.malelab.jgea.core.QualityBasedProblem;
import it.units.malelab.jgea.core.listener.*;
import it.units.malelab.jgea.core.order.PartialComparator;
import it.units.malelab.jgea.core.solver.Individual;
import it.units.malelab.jgea.core.solver.IterativeSolver;
import it.units.malelab.jgea.core.solver.SolverException;
import it.units.malelab.jgea.core.solver.state.POSetPopulationState;
import it.units.malelab.jgea.core.util.Args;
import it.units.malelab.jgea.core.util.Misc;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.logging.Logger;
import java.util.random.RandomGenerator;
import java.util.stream.Collectors;

import static it.units.malelab.jgea.core.listener.NamedFunctions.*;

/**
 * @author "Eric Medvet" on 2022/08/11 for 2d-robot-evolution
 */
public class Starter implements Runnable {

  private final static Logger L = Logger.getLogger(Starter.class.getName());

  private final NamedBuilder<Object> nb;
  private final String descFile;

  public Starter(NamedBuilder<Object> nb, String descFile) {
    this.nb = nb;
    this.descFile = descFile;
  }

  public record Experiment<G, Q>(
      @Param("runs") List<? extends Run<? extends G, ? extends Q>> runs,
      @Param("qExtractor") Function<? super Q, Double> qExtractor,
      @Param("bestFileSaver") FileSaver<Q> bestFileSaver
  ) {}

  public record FileSaver<Q>(
      @Param("fileName") String fileName,
      @Param("serializer") Function<? super Q, String> serializer
  ) {}

  public record Run<G, Q>(
      @Param("solverBuilder") SolverBuilder<G> solverBuilder,
      @Param("mapper") MapperBuilder<G, Supplier<EmbodiedAgent>> mapper,
      @Param("target") EmbodiedAgent target,
      @Param("task") Task<Supplier<EmbodiedAgent>, Q> task,
      @Param("comparator") PartialComparator<? super Q> comparator,
      @Param("randomGenerator") RandomGenerator randomGenerator,
      @Param(value = "", self = true) ParamMap map
  ) {}

  public static void main(String[] args) {
    NamedBuilder<Object> nb = NamedBuilder.empty()
        .and(List.of("sim", "s"), NamedBuilder.empty()
            .and(NamedBuilder.fromClass(NumGridVSR.Body.class))
            .and(List.of("terrain", "t"), NamedBuilder.fromUtilityClass(TerrainBuilder.class))
            .and(List.of("shape", "s"), NamedBuilder.fromUtilityClass(GridShapeBuilder.class))
            .and(
                List.of("sensorizingFunction", "sf"),
                NamedBuilder.fromUtilityClass(VSRSensorizingFunctionBuilder.class)
            )
            .and(List.of("voxelSensor", "vs"), NamedBuilder.fromUtilityClass(VoxelSensorBuilder.class)))
        .and(List.of("randomGenerator", "rg"), NamedBuilder.fromUtilityClass(RandomGeneratorBuilder.class))
        .and(List.of("comparator", "c"), NamedBuilder.fromUtilityClass(ComparatorBuilder.class))
        .and(List.of("extractor", "e"), NamedBuilder.fromUtilityClass(ExtractorBuilder.class))
        .and(List.of("serializer", "ser"), NamedBuilder.fromUtilityClass(ExtractorBuilder.class))
        .and(List.of("mapper", "m"), NamedBuilder.empty()
            .and(NamedBuilder.fromClass(Composition.class))
            .and(NamedBuilder.fromClass(CentralizedNumGridVSRBrain.class))
            .and(NamedBuilder.fromClass(DoublesMultiLayerPerceptron.class))
        )
        .and(List.of("solver", "so"), NamedBuilder.empty()
            .and(NamedBuilder.fromClass(DoublesStandard.class))
        )
        .and(NamedBuilder.fromClass(FileSaver.class))
        .and(NamedBuilder.fromClass(Run.class))
        .and(NamedBuilder.fromClass(Experiment.class));
    new Starter(nb, Args.a(args, "descFile", null)).run();
  }

  @Override
  public void run() {
    //read experiment description
    if (descFile == null) {
      throw new IllegalArgumentException("Experiment description file not provided");
    }
    Experiment<?, ?> experiment;
    try (BufferedReader br = new BufferedReader(new FileReader(descFile))) {
      String expDescription = br.lines().collect(Collectors.joining());
      experiment = (Experiment<?, ?>) nb.build(expDescription);
    } catch (IOException e) {
      throw new IllegalArgumentException(String.format("Cannot read experiment description: %s", e));
    }
    //create engine
    Supplier<Engine> engineSupplier = Dyn4JEngine::new;
    //create executor
    ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
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
            (MapperBuilder) run.mapper(),
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
    executorService.shutdown();
  }
}
