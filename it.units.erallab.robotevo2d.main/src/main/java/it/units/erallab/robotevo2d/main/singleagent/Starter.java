/*
 * Copyright 2022 eric
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

package it.units.erallab.robotevo2d.main.singleagent;

import com.beust.jcommander.JCommander;
import com.beust.jcommander.ParameterException;
import it.units.malelab.jgea.core.listener.ListenerFactory;
import it.units.malelab.jgea.core.listener.NamedFunction;
import it.units.malelab.jgea.core.listener.ProgressMonitor;
import it.units.malelab.jgea.core.solver.Individual;
import it.units.malelab.jgea.core.solver.SolverException;
import it.units.malelab.jgea.core.solver.state.POSetPopulationState;
import it.units.malelab.jgea.core.util.Misc;
import it.units.malelab.jgea.tui.TerminalMonitor;
import it.units.malelab.jnb.core.InfoPrinter;
import it.units.malelab.jnb.core.NamedBuilder;
import it.units.malelab.jnb.core.StringNamedParamMap;

import java.io.*;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import java.util.stream.Collectors;

import static it.units.malelab.jgea.core.listener.NamedFunctions.*;

/**
 * @author "Eric Medvet" on 2022/08/11 for 2d-robot-evolution
 */
public class Starter implements Runnable {

  private final static Logger L = Logger.getLogger(Starter.class.getName());

  private final Configuration configuration;
  private final NamedBuilder<Object> nb;

  public Starter(Configuration configuration, NamedBuilder<Object> nb) {
    this.configuration = configuration;
    this.nb = nb;
  }

  public static void main(String[] args) {
    NamedBuilder<Object> nb = PreparedNamedBuilder.get();
    Configuration configuration = new Configuration();
    try {
      JCommander.newBuilder()
          .addObject(configuration)
          .build()
          .parse(args);
      new Starter(configuration, nb).run();
    } catch (ParameterException e) {
      e.usage();
      L.severe(String.format("Cannot read command line options: %s", e));
      System.exit(-1);
    } catch (RuntimeException e) {
      L.severe(e.getClass().getSimpleName() + ": " + e.getMessage());
      System.exit(-1);
    }
  }

  @Override
  public void run() {
    //check if it's just an help invocation
    if (configuration.showExpFileName) {
      System.out.println(NamedBuilder.prettyToString(nb, true));
      System.exit(0);
    }
    if (!configuration.mdHelpFilePath.isEmpty()) {
      try (PrintStream filePS = new PrintStream(configuration.mdHelpFilePath)) {
        InfoPrinter infoPrinter = new InfoPrinter();
        infoPrinter.print(nb, filePS);
        System.exit(0);
      } catch (FileNotFoundException e) {
        throw new IllegalArgumentException("Cannot open md file %s: %s".formatted(configuration.mdHelpFilePath, e), e);
      }
    }
    //read experiment description
    String expDescription;
    if (configuration.experimentDescriptionFilePath.isEmpty()) {
      L.config("Using default experiment description");
      InputStream inputStream = getClass().getResourceAsStream("/example-experiment.txt");
      if (inputStream == null) {
        throw new IllegalArgumentException("Cannot find default experiment description");
      } else {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(inputStream))) {
          expDescription = br.lines().collect(Collectors.joining());
        } catch (IOException e) {
          throw new IllegalArgumentException(String.format("Cannot read default experiment description: %s", e));
        }
      }
    } else {
      L.config(String.format("Using provided experiment description: %s", configuration.experimentDescriptionFilePath));
      try (BufferedReader br = new BufferedReader(new FileReader(configuration.experimentDescriptionFilePath))) {
        expDescription = br.lines().collect(Collectors.joining());
      } catch (IOException e) {
        throw new IllegalArgumentException(String.format(
            "Cannot read provided experiment description at %s: %s",
            configuration.experimentDescriptionFilePath,
            e
        ));
      }
    }
    Experiment experiment = (Experiment) nb.build(expDescription);
    //create executors
    ExecutorService runExecutorService = Executors.newFixedThreadPool(configuration.nOfThreads);
    ExecutorService listenerExecutorService = Executors.newSingleThreadExecutor();
    //create common listeners and progress monitor
    List<NamedFunction<? super POSetPopulationState<?, ?, ?>, ?>> basicFunctions =
        List.of(
            iterations(),
            births(),
            fitnessEvaluations(),
            elapsedSeconds()
        );
    List<NamedFunction<? super Individual<?, ?, ?>, ?>> individualFunctions = List.of(
        size().of(genotype()),
        f("genotype.birth.iteration", "%4d", Individual::genotypeBirthIteration)/*,
        fitness().then(qFunction)*/
    );
    List<NamedFunction<? super POSetPopulationState<?, ?, ?>, ?>> visualFunctions = List.of();
    //List.of(hist(8).of(each(qFunction.of(fitness()))).of(all()));
    @SuppressWarnings({"rawtypes", "unchecked"}) List<NamedFunction<? super POSetPopulationState<?, ?, ?>, ?>> nonVisualFunctions = Misc.concat(
        List.of(
            basicFunctions,
            best().then((List) individualFunctions)
        )
    );
    List<NamedFunction<? super POSetPopulationState<?, ?, ?>, ?>> screenFunctions = Misc.concat(
        List.of(nonVisualFunctions, visualFunctions));
    //prepare terminal monitor
    TerminalMonitor<? super POSetPopulationState<?, ?, ?>, Run<?, ?, ?, ?>> terminalMonitor =
        new TerminalMonitor<>(
            screenFunctions,
            List.of(),
            List.of(/*
                new Pair<>(
                    iterations(),
                    best().then(fitness()).then(qFunction)
                )*/
            )
        );
    //preapare factories
    List<ListenerFactory<? super POSetPopulationState<?, ?, ?>, Run<?, ?, ?, ?>>> factories = new ArrayList<>();
    //noinspection unchecked,rawtypes
    experiment.listeners().stream()
        .map(l -> l.apply(experiment, listenerExecutorService))
        .forEach(l -> factories.add((ListenerFactory) l));
    factories.add(terminalMonitor);
    ListenerFactory<? super POSetPopulationState<?, ?, ?>, Run<?, ?, ?, ?>> factory = ListenerFactory.all(factories);
    //iterate over runs
    for (int i = 0; i < experiment.runs().size(); i++) {
      Run<?, ?, ?, ?> run = experiment.runs().get(i);
      terminalMonitor.notify(
          (float) i / (float) experiment.runs().size(),
          String.format(
              "Starting %d/%d run:%n%s",
              i + 1,
              experiment.runs().size(),
              StringNamedParamMap.prettyToString(run.map(), 40)
          )
      );
      //do optimization
      try {
        Instant startingT = Instant.now();
        Collection<?> solutions = run.run(experiment.engineSupplier(), runExecutorService, factory.build(run));
        double elapsedT = Duration.between(startingT, Instant.now()).toMillis() / 1000d;
        String msg = String.format(
            "%d/%d run done in %.2fs, found %d solutions",
            i + 1,
            experiment.runs().size(),
            elapsedT,
            solutions.size()
        );
        L.info(msg);
        ((ProgressMonitor) terminalMonitor).notify((float) (i + 1) / (float) experiment.runs().size(), msg);
      } catch (SolverException | RuntimeException e) {
        L.warning(String.format("Cannot solve %s: %s", run.map(), e));
        break;
      }
    }
    runExecutorService.shutdown();
    listenerExecutorService.shutdown();
    while (true) {
      try {
        if (listenerExecutorService.awaitTermination(1, TimeUnit.SECONDS)) {
          break;
        }
      } catch (InterruptedException e) {
        //ignore
      }
    }
    factory.shutdown();
  }
}
