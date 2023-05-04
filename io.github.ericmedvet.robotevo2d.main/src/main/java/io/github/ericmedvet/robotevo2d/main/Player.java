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

package io.github.ericmedvet.robotevo2d.main;

import com.beust.jcommander.JCommander;
import com.beust.jcommander.Parameter;
import com.beust.jcommander.ParameterException;
import io.github.ericmedvet.jnb.core.BuilderException;
import io.github.ericmedvet.jnb.core.NamedBuilder;
import io.github.ericmedvet.mrsim2d.core.Snapshot;
import io.github.ericmedvet.mrsim2d.viewer.RealtimeViewer;
import io.github.ericmedvet.mrsim2d.viewer.VideoBuilder;

import java.io.*;
import java.util.function.Consumer;
import java.util.logging.Logger;
import java.util.stream.Collectors;

/**
 * @author "Eric Medvet" on 2022/08/11 for 2d-robot-evolution
 */
public class Player {

  private final static Logger L = Logger.getLogger(Player.class.getName());

  public static class Configuration {
    @Parameter(
        names = {"--playFile", "-f"},
        description = "Path of the file with the play description."
    )
    public String playDescriptionFilePath = "";

    @Parameter(
        names = {"--help", "-h"},
        description = "Show this help.",
        help = true
    )
    public boolean help;

    @Parameter(
        names = {"--default", "-d"},
        description = "Use default play description."
    )
    public boolean defaultPlay;

  }

  public static void main(String[] args) {
    //read configuration
    Configuration configuration = new Configuration();
    JCommander jc = JCommander.newBuilder()
        .addObject(configuration)
        .build();
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
    //check help
    if (configuration.help) {
      jc.usage();
      System.exit(0);
    }
    //prepare local named builder
    NamedBuilder<Object> nb = PreparedNamedBuilder.get();
    //read experiment description
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
          L.severe("Cannot read provided experiment description at %s: %s%n".formatted(
              configuration.playDescriptionFilePath,
              e
          ));
        }
      }
    } else if (configuration.playDescriptionFilePath.isEmpty()) {
      L.info("No play description file: exiting");
    } else {
      L.config(String.format("Using provided play description: %s", configuration.playDescriptionFilePath));
      try (BufferedReader br = new BufferedReader(new FileReader(configuration.playDescriptionFilePath))) {
        playDescription = br.lines().collect(Collectors.joining());
      } catch (IOException e) {
        L.severe("Cannot read provided experiment description at %s: %s%n".formatted(
            configuration.playDescriptionFilePath,
            e
        ));
      }
    }
    if (playDescription == null) {
      System.exit(-1);
    }
    //run player
    try {
      //build solution
      L.config("Building genotype");
      @SuppressWarnings("unchecked") Play<Object, Object, Object> play = (Play<Object, Object, Object>) nb.build(
          playDescription);
      Object genotype = play.genotype().apply(play.mapper().exampleInput());
      L.config("Building solution");
      Object solution = play.mapper().apply(genotype);
      //build consumer
      Consumer<Snapshot> consumer;
      String drawerInfo = play.name() == null ? "" : play.name();
      if (play.videoFilePath() == null || play.videoFilePath().isEmpty()) {
        consumer = new RealtimeViewer(play.frameRate(), play.drawer().apply(drawerInfo));
      } else {
        consumer = new VideoBuilder(
            play.w(),
            play.h(),
            play.startTime(),
            play.endTime(),
            play.frameRate(),
            play.codec(),
            new File(play.videoFilePath()),
            play.drawer().apply(drawerInfo)
        );
      }
      //do task
      L.info("Executing the task");
      Object outcome = play.task().run(solution, play.engineSupplier().get(), consumer);
      L.info("The outcome of the task is %s".formatted(outcome));
      //possibly save video
      if (consumer instanceof VideoBuilder videoBuilder) {
        L.info("Doing video");
        File file = videoBuilder.get();
        if (file != null) {
          L.info("Video done and saved on file %s".formatted(file.getAbsolutePath()));
        } else {
          L.warning("Could not save video file");
        }
      }
    } catch (BuilderException e) {
      L.severe("Cannot build experiment: %s%n".formatted(e));
      System.exit(-1);
    }
  }

}
