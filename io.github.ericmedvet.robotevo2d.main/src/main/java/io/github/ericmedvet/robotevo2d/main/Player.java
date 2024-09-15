/*-
 * ========================LICENSE_START=================================
 * robotevo2d-main
 * %%
 * Copyright (C) 2018 - 2024 Eric Medvet
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * =========================LICENSE_END==================================
 */

package io.github.ericmedvet.robotevo2d.main;

import com.beust.jcommander.JCommander;
import com.beust.jcommander.Parameter;
import com.beust.jcommander.ParameterException;
import io.github.ericmedvet.jgea.experimenter.Starter;
import io.github.ericmedvet.jnb.core.BuilderException;
import io.github.ericmedvet.jnb.core.NamedBuilder;
import io.github.ericmedvet.jnb.datastructure.FormattedFunction;
import io.github.ericmedvet.jnb.datastructure.NamedFunction;
import io.github.ericmedvet.mrsim2d.core.tasks.AgentsObservation;
import io.github.ericmedvet.mrsim2d.core.tasks.AgentsOutcome;
import io.github.ericmedvet.robotevo2d.main.builders.PlayConsumers;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.function.Function;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class Player {

  private static final Logger L = Logger.getLogger(Player.class.getName());

  static {
    try {
      LogManager.getLogManager()
          .readConfiguration(Starter.class.getClassLoader().getResourceAsStream("logging.properties"));
    } catch (IOException ex) {
      // ignore
    }
  }

  public static class Configuration {
    @Parameter(
        names = {"--playFile", "-f"},
        description = "Path of the file with the play description.")
    public String playDescriptionFilePath = "";

    @Parameter(
        names = {"--help", "-h"},
        description = "Show this help.",
        help = true)
    public boolean help;

    @Parameter(
        names = {"--default", "-d"},
        description = "Use default play description.")
    public boolean defaultPlay;

    @Parameter(
        names = {"--verbose", "-v"},
        description = "Be verbose on errors (i.e., print stack traces)")
    public boolean verbose = false;

    @Parameter(
        names = {"--justOutput", "-j"},
        description = "Just show the task output, if any")
    public boolean justOutput = false;
  }

  public static void main(String[] args) {
    // read configuration
    Configuration configuration = new Configuration();
    JCommander jc = JCommander.newBuilder().addObject(configuration).build();
    jc.setProgramName(Player.class.getName());
    try {
      jc.parse(args);
    } catch (ParameterException e) {
      e.usage();
      L.severe(String.format("Cannot read command line options: %s", e));
      System.exit(-1);
    } catch (RuntimeException e) {
      L.severe(e.getClass().getSimpleName() + ": " + e.getMessage());
      System.exit(-1);
    }
    // check help
    if (configuration.help) {
      jc.usage();
      System.exit(0);
    }
    // check output
    if (configuration.justOutput) {
      L.setLevel(Level.SEVERE);
    }
    // prepare local named builder
    NamedBuilder<Object> nb = NamedBuilder.fromDiscovery();
    // read experiment description
    String playDescription = null;
    if (configuration.defaultPlay) {
      String defaultPlayDesc = "/play-examples/vsr-centralized-mlp-random-locomotion.txt";
      L.config(String.format("Using default play description: %s", defaultPlayDesc));
      InputStream resourceIS = Player.class.getResourceAsStream(defaultPlayDesc);
      if (resourceIS == null) {
        L.info("No default play description: exiting");
      } else {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(resourceIS))) {
          playDescription = br.lines().collect(Collectors.joining());
        } catch (IOException e) {
          L.severe("Cannot read provided experiment description at %s: %s%n"
              .formatted(configuration.playDescriptionFilePath, e));
          if (configuration.verbose) {
            //noinspection CallToPrintStackTrace
            e.printStackTrace();
          }
        }
      }
    } else if (configuration.playDescriptionFilePath.isEmpty()) {
      L.info("No play description file: exiting");
    } else {
      L.config(String.format("Using provided play description: %s", configuration.playDescriptionFilePath));
      try (BufferedReader br = new BufferedReader(new FileReader(configuration.playDescriptionFilePath))) {
        playDescription = br.lines().collect(Collectors.joining());
      } catch (IOException e) {
        L.severe("Cannot read provided experiment description at %s: %s%n"
            .formatted(configuration.playDescriptionFilePath, e));
        if (configuration.verbose) {
          //noinspection CallToPrintStackTrace
          e.printStackTrace();
        }
      }
    }
    if (playDescription == null) {
      System.exit(-1);
    }
    // run player
    try {
      // build solution
      L.config("Building genotype");
      @SuppressWarnings("unchecked")
      Play<Object, Object, AgentsObservation, AgentsOutcome<AgentsObservation>> play =
          (Play<Object, Object, AgentsObservation, AgentsOutcome<AgentsObservation>>)
              nb.build(playDescription);
      Object genotype = play.genotype().apply(play.mapper().exampleFor(null));
      L.config("Building solution");
      Object solution = play.mapper().mapperFor(null).apply(genotype);
      // build consumer
      PlayConsumers.ProducingConsumer consumer = play.consumers().stream()
          .reduce(PlayConsumers.ProducingConsumer::andThen)
          .orElse(PlayConsumers.ProducingConsumer.from(s -> {}, () -> {}));
      // do task
      L.info("Executing the task");
      AgentsOutcome<AgentsObservation> outcome =
          play.task().run(solution, play.engineSupplier().get(), consumer);
      L.info("The outcome of the task is %s".formatted(outcome));
      // process outcome
      if (configuration.justOutput) {
        //noinspection unchecked,rawtypes
        System.out.println(play.outcomeFunctions().stream()
            .map(f -> FormattedFunction.format(f).formatted(((Function) f).apply(outcome)))
            .collect(Collectors.joining("; ")));
      } else {
        //noinspection unchecked,rawtypes
        play.outcomeFunctions()
            .forEach(f -> System.out.printf(
                "%s = " + FormattedFunction.format(f) + "%n",
                NamedFunction.name(f),
                ((Function) f).apply(outcome)));
      }
      consumer.run();
    } catch (BuilderException e) {
      L.severe("Cannot build experiment: %s%n".formatted(e));
      if (configuration.verbose) {
        //noinspection CallToPrintStackTrace
        e.printStackTrace();
      }
      System.exit(-1);
    }
  }
}
