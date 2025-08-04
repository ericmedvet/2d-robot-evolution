/*-
 * ========================LICENSE_START=================================
 * robotevo2d-main
 * %%
 * Copyright (C) 2018 - 2025 Eric Medvet
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

import io.github.ericmedvet.jgea.core.InvertibleMapper;
import io.github.ericmedvet.jnb.core.NamedBuilder;
import io.github.ericmedvet.jnb.datastructure.Pair;
import io.github.ericmedvet.mrsim2d.core.EmbodiedAgent;
import io.github.ericmedvet.mrsim2d.core.agents.gridvsr.DistributedNumGridVSR;
import io.github.ericmedvet.mrsim2d.core.engine.Engine;
import io.github.ericmedvet.mrsim2d.core.tasks.sumo.SumoAgentsOutcome;
import io.github.ericmedvet.mrsim2d.core.tasks.sumo.SumoCup;
import io.github.ericmedvet.mrsim2d.viewer.Drawer;
import io.github.ericmedvet.mrsim2d.viewer.OnlineVideoBuilder;
import io.github.ericmedvet.mrsim2d.viewer.VideoUtils;
import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Function;
import java.util.function.Supplier;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

public class SumoCupFightsOptimized {

  private static final NamedBuilder<Object> BUILDER = NamedBuilder.fromDiscovery();

  private static final String DRAWER = """
      sim.drawer(
        framer = sim.staticFramer(minX = 4; maxX = 36; minY = 3; maxY = 24)
      )
      """;

  @SuppressWarnings("unchecked")
  public static void main(String[] args) throws IOException {
    int nThreads = 20;
    String folder = "C:\\Users\\elsal\\Desktop\\to_delete\\";
    String CSVPath1 = folder + "allBest_bi.csv";
    String CSVPath2 = folder + "allBest_box.csv";
    String delimiter = ";";
    boolean singleCSV = false;
    boolean saveVideo = true;

    Function<SumoAgentsOutcome, Double> getScore1 = (Function<SumoAgentsOutcome, Double>) BUILDER.build(
        "s.f.outcome.sumoShiftedScoreDifference1()"
    );
    Function<SumoAgentsOutcome, Double> getScore2 = (Function<SumoAgentsOutcome, Double>) BUILDER.build(
        "s.f.outcome.sumoShiftedScoreDifference2()"
    );
    String mapper = """
            er.m.bodyBrainHomoDistributedVSR(
              w = 4;
              h = 4;
              sensors = [s.s.a(); s.s.ar(); s.s.rv(a = 0); s.s.rv(a = 90); s.s.d(r = 5)];
              of = ea.m.pair(
                of = ea.m.splitter();
                first = ea.m.dsToFixedGrid(negItem = s.a.vsr.voxel(type = none); posItem = s.a.vsr.voxel(type = soft));
                second = ea.m.steppedNds(of = ea.m.dsToNpnds(npnds = ds.num.mlp(innerLayerRatio = 2; nOfInnerLayers = 2)); stepT = 0.2)
              )
            )
        """;

    Map<String, Integer> opponentIndices = new HashMap<>();
    List<String> opponentNames = new ArrayList<>();
    List<Pair<String, Supplier<EmbodiedAgent>>> opponents = new ArrayList<>();
    int maxSeed = 0;

    List<String> lines1 = Files.readAllLines(Paths.get(CSVPath1));
    List<String> mergedLines = new ArrayList<>(lines1);
    List<String> lines2;
    if (!singleCSV) {
      lines2 = Files.readAllLines(Paths.get(CSVPath2));
      System.out.println("Removing header, check if correct: " + lines2.getFirst());
      lines2.removeFirst();
      mergedLines.addAll(lines2);
    }
    String mergedCSVContent = String.join(System.lineSeparator(), mergedLines);

    try (Reader mergedReader = new StringReader(mergedCSVContent)) {
      CSVParser csvParser = CSVFormat.Builder.create()
          .setDelimiter(delimiter)
          .build()
          .parse(mergedReader);

      List<CSVRecord> records = csvParser.getRecords();
      CSVRecord headerCSV = records.getFirst();

      int mapperColumnIndex = 0, genotypeColumnIndex = 0, nameColumnIndex = 0, seedColumnIndex = 0;
      for (int i = 0; i < headerCSV.size(); i++) {
        String columnName = headerCSV.get(i);
        if (columnName.contains("mapper")) {
          mapperColumnIndex = i;
        } else if (columnName.contains("genotype")) {
          genotypeColumnIndex = i;
        } else if (columnName.contains("name")) {
          nameColumnIndex = i;
        } else if (columnName.contains("seed")) {
          seedColumnIndex = i;
        }
      }

      Function<String, Object> deserializer = (Function<String, Object>) BUILDER.build("f.fromBase64()");

      InvertibleMapper<List<Double>, Supplier<DistributedNumGridVSR>> invertibleMapper = (InvertibleMapper<List<Double>, Supplier<DistributedNumGridVSR>>) BUILDER
          .build(mapper);
      Function<List<Double>, Supplier<DistributedNumGridVSR>> supplierFunction = invertibleMapper.mapperFor(null);

      for (int i = 1; i < records.size(); i++) {
        CSVRecord record = records.get(i);
        Supplier<DistributedNumGridVSR> opponent = supplierFunction.apply(
            (List<Double>) deserializer.apply(record.get(genotypeColumnIndex))
        );
        Supplier<EmbodiedAgent> embodiedOpponent = opponent::get;
        String name = record.get(nameColumnIndex);
        maxSeed = Math.max(maxSeed, Integer.parseInt(record.get(seedColumnIndex)));
        if (!opponentIndices.containsKey(name)) {
          opponentIndices.put(name, opponentNames.size());
          opponentNames.add(name);
        }
        opponents.add(new Pair<>(name, embodiedOpponent));
      }

      Map<String, AtomicInteger> winsMap = new ConcurrentHashMap<>();
      Map<String, AtomicInteger> matchesPlayed = new ConcurrentHashMap<>();

      for (String name : opponentNames) {
        winsMap.put(name, new AtomicInteger(0));
        matchesPlayed.put(name, new AtomicInteger(0));
      }

      Supplier<Engine> engineSupplier = () -> ServiceLoader.load(Engine.class).findFirst().orElseThrow();

      ExecutorService executor = Executors.newFixedThreadPool(nThreads);
      List<Future<?>> futures = new ArrayList<>();
      AtomicLong videoCounter = new AtomicLong(0);

      for (Pair<String, Supplier<EmbodiedAgent>> opponent1 : opponents) {
        for (Pair<String, Supplier<EmbodiedAgent>> opponent2 : opponents) {
          if (opponent1 == opponent2) {
            continue;
          }
          futures.add(executor.submit(() -> {
            SumoCup sumo = (SumoCup) BUILDER.build("s.task.sumoCup(duration = 15)");
            String videoName = String.format(
                "%s_vs_%s-%d.mp4",
                opponent1.first(),
                opponent2.first(),
                videoCounter.incrementAndGet()
            );
            OnlineVideoBuilder ovb = new OnlineVideoBuilder(
                400,
                300,
                0,
                15,
                24,
                VideoUtils.EncoderFacility.FFMPEG_SMALL,
                new File(folder + "video/" + videoName),
                ((Function<String, Drawer>) BUILDER.build(DRAWER)).apply(videoName)
            );

            SumoAgentsOutcome outcome = sumo.run(
                opponent1.second(),
                opponent2.second(),
                engineSupplier.get(),
                saveVideo ? ovb : null
            );
            double fitness1 = getScore1.apply(outcome);
            double fitness2 = getScore2.apply(outcome);

            if (saveVideo) {
              ovb.get();
            }

            // MODIFICA: Operazioni atomiche senza 'synchronized'
            matchesPlayed.get(opponent1.first()).incrementAndGet();
            matchesPlayed.get(opponent2.first()).incrementAndGet();

            if (fitness1 > fitness2) {
              winsMap.get(opponent1.first()).incrementAndGet();
            } else if (fitness2 > fitness1) {
              winsMap.get(opponent2.first()).incrementAndGet();
            }
          }));
        }
      }
      for (Future<?> f : futures) {
        f.get();
      }
      executor.shutdown();
      List<String> rankingLines = new ArrayList<>();
      rankingLines.add("Name;Wins;Matches;WinRate");
      List<String> finalNames = new ArrayList<>(opponentNames);
      finalNames.sort(Comparator.comparingDouble(name -> {
        int played = matchesPlayed.get(name).get();
        if (played == 0)
          return 0.0;
        return -1.0 * winsMap.get(name).get() / (double) played;
      }));
      for (String name : finalNames) {
        int wins = winsMap.get(name).get();
        int played = matchesPlayed.get(name).get();
        double winRate = (played > 0) ? (double) wins / played : 0.0;
        rankingLines.add(String.format("%s;%d;%d;%.4f", name, wins, played, winRate));
      }
      String rankingPath = folder + "ranking.csv";
      Files.write(Paths.get(rankingPath), rankingLines);
      System.out.println("Ranking saved in: " + rankingPath);
    } catch (ExecutionException | InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new RuntimeException(e);
    }
  }
}
