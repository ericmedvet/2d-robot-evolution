package it.units.erallab.robotevo2d.main.builder;

import it.units.erallab.mrsim2d.builder.NamedParamMap;
import it.units.erallab.mrsim2d.builder.Param;
import it.units.erallab.mrsim2d.builder.ParamMap;
import it.units.erallab.mrsim2d.builder.StringNamedParamMap;
import it.units.erallab.mrsim2d.viewer.VideoBuilder;
import it.units.erallab.mrsim2d.viewer.VideoUtils;
import it.units.erallab.robotevo2d.main.singleagent.Experiment;
import it.units.erallab.robotevo2d.main.singleagent.NamedTask;
import it.units.erallab.robotevo2d.main.singleagent.Run;
import it.units.erallab.robotevo2d.main.singleagent.VideoSaver;
import it.units.malelab.jgea.core.listener.*;
import it.units.malelab.jgea.core.solver.Individual;
import it.units.malelab.jgea.core.solver.state.POSetPopulationState;
import it.units.malelab.jgea.core.util.ImagePlotters;
import it.units.malelab.jgea.core.util.Misc;
import it.units.malelab.jgea.telegram.TelegramUpdater;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.function.BiFunction;
import java.util.logging.Logger;

import static it.units.malelab.jgea.core.listener.NamedFunctions.*;

public class ListenerBuilder {

  public final static List<NamedFunction<? super POSetPopulationState<?, ?, ?>, ?>> BASIC_FUNCTIONS = List.of(
      iterations(),
      births(),
      fitnessEvaluations(),
      elapsedSeconds()
  );
  private final static int TELEGRAM_IMAGE_W = 600;
  private final static int TELEGRAM_IMAGE_H = 400;
  private final static int TELEGRAM_VIDEO_W = 600;
  private final static int TELEGRAM_VIDEO_H = 400;
  private final static int FILE_VIDEO_W = 600;
  private final static int FILE_VIDEO_H = 400;
  private final static Logger L = Logger.getLogger(ListenerBuilder.class.getName());

  private ListenerBuilder() {
  }

  public static <G, S, Q> BiFunction<Experiment<G, S, Q>, ExecutorService, ListenerFactory<?
      super POSetPopulationState<G,
      S, Q>, Run<G, Q>>> allCsv(
      @Param("filePath") String filePath,
      @Param("individualFunctions") List<NamedFunction<? super Individual<? extends G, ? extends S, ? extends Q>, ?>> individualFunctions,
      @Param("runKeys") List<String> runKeys,
      @Param(value = "onlyLast", dB = false) boolean onlyLast
  ) {
    @SuppressWarnings({"rawtypes", "unchecked"}) List<NamedFunction<POSetPopulationState<G, S, Q>, ?>> popFunctions =
        new ArrayList<>(
            (List) BASIC_FUNCTIONS);
    List<NamedFunction<Run<G, Q>, Object>> runFunctions = runKeys.stream()
        .map(k -> NamedFunction.build(
            k,
            "%s",
            (Run<G, Q> run) -> getKeyFromParamMap(run.map(), Arrays.stream(k.split("\\.")).toList())
        ))
        .toList();
    record PopIndividualPair<G, S, Q>(POSetPopulationState<G, S, Q> pop, Individual<G, S, Q> individual) {}
    List<NamedFunction<? super PopIndividualPair<G, S, Q>, ?>> pairFunctions = new ArrayList<>();
    popFunctions.stream()
        .map(f -> NamedFunction.build(
            f.getName(),
            f.getFormat(),
            (PopIndividualPair<G, S, Q> pair) -> f.apply(pair.pop())
        ))
        .forEach(pairFunctions::add);
    individualFunctions.stream()
        .map(f -> NamedFunction.build(
            f.getName(),
            f.getFormat(),
            (PopIndividualPair<G, S, Q> pair) -> f.apply(pair.individual())
        ))
        .forEach(pairFunctions::add);
    @SuppressWarnings({"unchecked", "rawtypes"}) CSVPrinter<PopIndividualPair<G, S, Q>, Run<G, Q>> innerListenerFactory =
        new CSVPrinter<>(
            (List) Collections.unmodifiableList(pairFunctions),
            (List) runFunctions,
            new File(filePath)
        );
    return (experiment, executorService) -> {
      ListenerFactory<? super POSetPopulationState<G, S, Q>, Run<G, Q>> listenerFactory = new ListenerFactory<>() {
        @Override
        public Listener<POSetPopulationState<G, S, Q>> build(Run<G, Q> run) {
          Listener<PopIndividualPair<G, S, Q>> innerListener = innerListenerFactory.build(run);
          return new Listener<>() {
            @Override
            public void listen(POSetPopulationState<G, S, Q> state) {
              for (Individual<G, S, Q> individual : state.getPopulation().all()) {
                innerListener.listen(new PopIndividualPair<>(state, individual));
              }
            }

            @Override
            public void done() {
              innerListener.done();
            }
          };
        }

        @Override
        public void shutdown() {
          innerListenerFactory.shutdown();
        }
      };
      if (onlyLast) {
        listenerFactory = listenerFactory.onLast();
      }
      return listenerFactory;
    };
  }

  public static <G, S, Q> BiFunction<Experiment<G, S, Q>, ExecutorService, ListenerFactory<?
      super POSetPopulationState<G,
      S, Q>, Run<G, Q>>> bestCsv(
      @Param("filePath") String filePath,
      @Param("popFunctions") List<NamedFunction<? super POSetPopulationState<? extends G, ? extends S, ? extends Q>,
          ?>> popFunctions,
      @Param("individualFunctions") List<NamedFunction<? super Individual<? extends G, ? extends S, ? extends Q>, ?>> individualFunctions,
      @Param("runKeys") List<String> runKeys,
      @Param(value = "onlyLast", dB = false) boolean onlyLast
  ) {
    NamedFunction<POSetPopulationState<? extends G, ? extends S, ? extends Q>, Individual<? extends G, ? extends S, ?
        extends Q>> best = best();
    List<NamedFunction<? super POSetPopulationState<? extends G, ? extends S, ? extends Q>, ?>> functions =
        new ArrayList<>(
            BASIC_FUNCTIONS);
    functions.addAll(popFunctions);
    functions.addAll(best.then(individualFunctions));
    List<NamedFunction<Run<G, Q>, Object>> runFunctions = runKeys.stream()
        .map(k -> NamedFunction.build(
            k,
            "%s",
            (Run<G, Q> run) -> getKeyFromParamMap(run.map(), Arrays.stream(k.split("\\.")).toList())
        ))
        .toList();
    return (experiment, executorService) -> {
      functions.add(best.then(fitness()).then(experiment.qExtractor()));
      //noinspection unchecked,rawtypes
      ListenerFactory<? super POSetPopulationState<G, S, Q>, Run<G, Q>> listenerFactory =
          new CSVPrinter<POSetPopulationState<G, S, Q>, Run<G, Q>>(
              Collections.unmodifiableList(functions),
              (List) runFunctions,
              new File(filePath)
          );
      if (onlyLast) {
        listenerFactory = listenerFactory.onLast();
      }
      return listenerFactory;
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

  public static <G, S, Q> BiFunction<Experiment<G, S, Q>, ExecutorService, ListenerFactory<?
      super POSetPopulationState<G, S, Q>,
      Run<G, Q>>> lastBestVideo(
      @Param("dirPath") String dirPath,
      @Param(value = "fileNameTemplate", dS = "video-%s.mp4") String fileNameTemplate,
      @Param(value = "videoSaver", dNPM =
          "videoSaver(drawer=d.basicWithAgentMiniature();w=" + FILE_VIDEO_W + ";h=" + FILE_VIDEO_H + ")") VideoSaver videoSaver,
      @Param("tasks") List<NamedTask<? super S>> namedTasks,
      @Param(value = "deferred", dB = true) boolean deferred
  ) {
    return (experiment, executorService) -> {
      ListenerFactory<POSetPopulationState<G, S, Q>, Run<G, Q>> listenerFactory =
          ((ListenerFactory<POSetPopulationState<G, S, Q>, Run<G, Q>>) run -> state -> {
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
        listenerFactory = listenerFactory.deferred(executorService);
      }
      return listenerFactory;
    };
  }

  public static <G, S, Q> BiFunction<Experiment<G, S, Q>, ExecutorService, ListenerFactory<?
      super POSetPopulationState<G,
      S, Q>, Run<G, Q>>> telegram(
      @Param("chatId") String chatId,
      @Param("botIdFilePath") String botIdFilePath,
      @Param(value = "videoSaver", dNPM = "videoSaver(drawer=d.basicWithAgentMiniature();w=" + TELEGRAM_VIDEO_W + ";" +
          "h=" + TELEGRAM_VIDEO_H + ")") VideoSaver videoSaver,
      @Param("tasks") List<NamedTask<? super S>> namedTasks,
      @Param(value = "deferred", dB = true) boolean deferred
  ) {
    //read credential files
    String botId;
    long longChatId;
    try (BufferedReader br = new BufferedReader(new FileReader(botIdFilePath))) {
      List<String> lines = br.lines().toList();
      if (lines.size() < 1) {
        throw new IllegalArgumentException("Invalid telegram credential file with 0 lines");
      }
      String[] pieces = lines.get(0).split("\\s");
      botId = pieces[0];
      L.config(String.format("Using provided telegram credentials: %s", botIdFilePath));
    } catch (IOException e) {
      throw new IllegalArgumentException(String.format(
          "Cannot read telegram credentials at %s: %s",
          botIdFilePath,
          e
      ));
    }
    try {
      longChatId = Long.parseLong(chatId);
    } catch (NumberFormatException e) {
      throw new IllegalArgumentException("Invalid chatId %s: not a number".formatted(chatId));
    }
    return (experiment, executorService) -> {
      @SuppressWarnings("unchecked") NamedFunction<Object, Double> qFunction =
          ((NamedFunction<Object, Double>) experiment.qExtractor());
      List<AccumulatorFactory<POSetPopulationState<G, S, Q>, ?, Run<G, Q>>> accumulators = new ArrayList<>();
      //prepare text accumulator
      accumulators.add(run -> new Accumulator<>() {
        @Override
        public String get() {
          return StringNamedParamMap.prettyToString(run.map(), 40);
        }

        @Override
        public void listen(POSetPopulationState<G, S, Q> state) {
        }
      });
      //prepare plotter accumulator
      accumulators.add(new TableBuilder<POSetPopulationState<G, S, Q>, Number, Run<G, Q>>(
          List.of(
              iterations(),
              best().then(fitness()).then(qFunction),
              min(Double::compare).of(each(qFunction.of(fitness()))).of(all()),
              median(Double::compare).of(each(qFunction.of(fitness()))).of(all())
          ),
          List.of()
      ).then(t -> ImagePlotters.xyLines(TELEGRAM_IMAGE_W, TELEGRAM_IMAGE_H).apply(t)));
      //prepare video accumulators
      namedTasks.stream()
          .map(namedTask -> (AccumulatorFactory<POSetPopulationState<G, S, Q>, File, Run<G, Q>>) run -> Accumulator.<POSetPopulationState<G, S, Q>>last()
              .then(state -> {
                File file;
                try {
                  file = File.createTempFile("video", ".mp4");
                  L.info("Doing video for %s for telegram chat".formatted(namedTask.map().npm("task").toString()));
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
                  file = videoBuilder.get();
                  file.deleteOnExit();
                } catch (IOException ioException) {
                  L.warning(String.format("Cannot save video of best: %s", ioException));
                  return null;
                }
                return file;
              }))
          .forEach(accumulators::add);
      //prepare listener
      TelegramUpdater<? super POSetPopulationState<G, S, Q>, Run<G, Q>> telegramUpdater = new TelegramUpdater<>(
          accumulators,
          botId,
          longChatId
      );
      L.info("Will send updates to Telegram chat `%s`".formatted(telegramUpdater.getChatInfo()));
      ListenerFactory<? super POSetPopulationState<G, S, Q>, Run<G, Q>> listenerFactory = telegramUpdater;
      if (deferred) {
        listenerFactory = listenerFactory.deferred(executorService);
      }
      return listenerFactory;
    };
  }

}
