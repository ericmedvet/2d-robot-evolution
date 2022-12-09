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

package it.units.erallab.robotevo2d.main;

import com.beust.jcommander.JCommander;
import com.beust.jcommander.Parameter;
import com.beust.jcommander.ParameterException;
import it.units.malelab.jgea.experimenter.Experiment;
import it.units.malelab.jgea.experimenter.Experimenter;
import it.units.malelab.jnb.core.NamedBuilder;

import java.io.*;
import java.util.logging.Logger;
import java.util.stream.Collectors;

/**
 * @author "Eric Medvet" on 2022/08/11 for 2d-robot-evolution
 */
public class Starter {

  private final static Logger L = Logger.getLogger(Starter.class.getName());

  public static class Configuration {
    @Parameter(
        names = {"--expFile", "-e"},
        description = "Path of the file with the experiment description"
    )
    public String experimentDescriptionFilePath = "";
    @Parameter(
        names = {"--nOfThreads", "-n"},
        description = "Number of threads to be used"
    )
    public int nOfThreads = 1;

    @Parameter(
        names = {"--showExpFileHelp", "-d"},
        description = "Show a description of available constructs for the experiment file"
    )
    public boolean showExpFileName = false;

    @Parameter(
        names = {"--checkExpFile", "-c"},
        description = "Just check the correctness of the experiment description"
    )
    public boolean check = false;

  }

  public static void main(String[] args) {
    //read configuration
    Configuration configuration = new Configuration();
    try {
      JCommander.newBuilder()
          .addObject(configuration)
          .build()
          .parse(args);
    } catch (ParameterException e) {
      e.usage();
      L.severe(String.format("Cannot read command line options: %s", e));
      System.exit(-1);
    } catch (RuntimeException e) {
      L.severe(e.getClass().getSimpleName() + ": " + e.getMessage());
      System.exit(-1);
    }
    //prepare local named builder
    NamedBuilder<Object> nb = PreparedNamedBuilder.get();
    //check if it's just a help invocation
    if (configuration.showExpFileName) {
      System.out.println(NamedBuilder.prettyToString(nb, true));
      System.exit(0);
    }
    //read experiment description
    String expDescription;
    if (configuration.experimentDescriptionFilePath.isEmpty()) {
      L.config("Using default experiment description");
      InputStream inputStream = Starter.class.getResourceAsStream("/exp-examples/legged.txt");
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
    //check if just check
    if (configuration.check) {
      Experiment experiment = (Experiment) nb.build(expDescription);
      System.out.println("Experiment description is valid");
      System.out.printf("\t%d runs%n", experiment.runs().size());
      System.out.printf("\t%d listenerss%n", experiment.listeners().size());
      System.exit(0);
    }
    //prepare and run experimenter
    Experimenter experimenter = new Experimenter(nb, configuration.nOfThreads);
    experimenter.run(expDescription);
  }

}
