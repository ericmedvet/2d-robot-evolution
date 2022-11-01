package it.units.erallab.robotevo2d.main.builder;

import it.units.erallab.mrsim2d.builder.NamedParamMap;
import it.units.erallab.mrsim2d.builder.Param;
import it.units.erallab.mrsim2d.builder.ParamMap;
import it.units.erallab.mrsim2d.viewer.VideoBuilder;
import it.units.erallab.mrsim2d.viewer.VideoUtils;
import it.units.erallab.robotevo2d.main.singleagent.Experiment;
import it.units.erallab.robotevo2d.main.singleagent.NamedTask;
import it.units.erallab.robotevo2d.main.singleagent.Run;
import it.units.erallab.robotevo2d.main.singleagent.VideoSaver;
import it.units.malelab.jgea.core.listener.CSVPrinter;
import it.units.malelab.jgea.core.listener.ListenerFactory;
import it.units.malelab.jgea.core.listener.NamedFunction;
import it.units.malelab.jgea.core.solver.Individual;
import it.units.malelab.jgea.core.solver.state.POSetPopulationState;
import it.units.malelab.jgea.core.util.Misc;

import java.io.File;
import java.util.*;
import java.util.concurrent.Executors;
import java.util.function.Function;
import java.util.logging.Logger;

import static it.units.malelab.jgea.core.listener.NamedFunctions.*;

public class ListenerBuilder {

  private final static Logger L = Logger.getLogger(ListenerBuilder.class.getName());

  private final static List<NamedFunction<? super POSetPopulationState<?, ?, ?>, ?>> BASIC_FUNCTIONS = List.of(
      iterations(),
      births(),
      fitnessEvaluations(),
      elapsedSeconds()
  );

  private ListenerBuilder() {
  }

  public static <G, S, Q> Function<Experiment<G, S, Q>, CSVPrinter<? super POSetPopulationState<G, S, Q>, Run<?, ?>>> bestCsv(
      @Param("filePath") String filePath,
      @Param("popFunctions") List<NamedFunction<? super POSetPopulationState<? extends G, ? extends S, ? extends Q>,
          ?>> popFunctions,
      @Param("bestFunctions") List<NamedFunction<? super Individual<? extends G, ? extends S, ? extends Q>, ?>> bestFunctions,
      @Param("runKeys") List<String> runKeys
  ) {
    NamedFunction<POSetPopulationState<? extends G, ? extends S, ? extends Q>, Individual<? extends G, ? extends S, ?
        extends Q>> best = best();
    List<NamedFunction<? super POSetPopulationState<? extends G, ? extends S, ? extends Q>, ?>> functions =
        new ArrayList<>(
            BASIC_FUNCTIONS);
    functions.addAll(popFunctions);
    functions.addAll(best.then(bestFunctions));
    List<NamedFunction<? super Run<?, ?>, ?>> paramMapFunctions = Collections.unmodifiableList(runKeys.stream()
        .map(k -> NamedFunction.build(
            k,
            "%s",
            (Run<?, ?> run) -> getKeyFromParamMap(run.map(), Arrays.stream(k.split("\\.")).toList())
        ))
        .toList());
    return experiment -> {
      functions.add(best.then(fitness()).then(experiment.qExtractor()));
      return new CSVPrinter<POSetPopulationState<G, S, Q>, Run<?, ?>>(
          Collections.unmodifiableList(functions),
          paramMapFunctions,
          new File(filePath)
      );
    };
  }

  private static Object getKeyFromParamMap(ParamMap paramMap, List<String> keyPieces) {
    if (keyPieces.size() == 1) {
      return paramMap.value(keyPieces.get(0));
    }
    NamedParamMap namedParamMap = paramMap.npm(keyPieces.get(0));
    if (namedParamMap == null) {
      return null;
    }
    return getKeyFromParamMap(namedParamMap, keyPieces.subList(1, keyPieces.size()));
  }

  public static <G, S, Q> Function<Experiment<G, S, Q>, ListenerFactory<? super POSetPopulationState<G, S, Q>,
      Run<?, ?>>> lastBestVideo(
      @Param("dirPath") String dirPath,
      @Param(value = "fileNameTemplate", dS = "video-%s.mp4") String fileNameTemplate,
      @Param(value = "videoSaver", dNPM = "videoSaver(drawer=d.basicWithAgentMiniature();w=600;h=400)") VideoSaver videoSaver,
      @Param("tasks") List<NamedTask<? super S>> namedTasks,
      @Param(value = "deferred", dB = true) boolean deferred
  ) {
    return experiment -> {
      ListenerFactory<POSetPopulationState<G, S, Q>, Run<?, ?>> listenerFactory =
          ((ListenerFactory<POSetPopulationState<G, S, Q>, Run<?, ?>>) run -> state -> {
            for (NamedTask<? super S> namedTask : namedTasks) {
              String fileName = fileNameTemplate.formatted(UUID.nameUUIDFromBytes(
                  (namedTask.map().toString() + run.map().toString()).getBytes()
              ));
              File file = CSVPrinter.checkExistenceAndChangeName(new File(dirPath + File.separator + fileName));
              L.info("Doing video for %s on file %s".formatted(
                  namedTask.map().npm("task").toString(),
                  file.getAbsolutePath()
              ));
              VideoBuilder videoBuilder = new VideoBuilder(
                  videoSaver.w(),
                  videoSaver.h(),
                  videoSaver.startTime(),
                  videoSaver.endTime(),
                  videoSaver.frameRate(),
                  VideoUtils.EncoderFacility.valueOf(videoSaver.codec().toUpperCase()),
                  file,
                  videoSaver.drawer().apply(namedTask.map().npm("task").toString())
              );
              S solution = Misc.first(state.getPopulation().firsts()).solution();
              namedTask.task().run(solution, experiment.engineSupplier().get(), videoBuilder);
              videoBuilder.get();
            }
          }).onLast();
      if (deferred) {
        listenerFactory = listenerFactory.deferred(Executors.newFixedThreadPool(1));
      }
      return listenerFactory;
    };
  }

}
