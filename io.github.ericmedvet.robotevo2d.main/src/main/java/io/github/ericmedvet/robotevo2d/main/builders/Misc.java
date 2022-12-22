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

package io.github.ericmedvet.robotevo2d.main.builders;

import io.github.ericmedvet.jgea.core.listener.Accumulator;
import io.github.ericmedvet.jgea.core.listener.AccumulatorFactory;
import io.github.ericmedvet.jgea.core.listener.CSVPrinter;
import io.github.ericmedvet.jgea.core.solver.Individual;
import io.github.ericmedvet.jgea.core.solver.state.POSetPopulationState;
import io.github.ericmedvet.jgea.experimenter.Run;
import io.github.ericmedvet.jnb.core.Param;
import io.github.ericmedvet.jnb.core.ParamMap;
import io.github.ericmedvet.mrsim2d.core.engine.Engine;
import io.github.ericmedvet.mrsim2d.core.tasks.Task;
import io.github.ericmedvet.mrsim2d.core.util.DoubleRange;
import io.github.ericmedvet.mrsim2d.viewer.Drawer;
import io.github.ericmedvet.mrsim2d.viewer.VideoBuilder;
import io.github.ericmedvet.mrsim2d.viewer.VideoUtils;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Base64;
import java.util.List;
import java.util.UUID;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.logging.Logger;
import java.util.random.RandomGenerator;

public class Misc {

  public final static int FILE_VIDEO_W = 600;
  public final static int FILE_VIDEO_H = 400;
  private final static Logger L = Logger.getLogger(Misc.class.getName());


  private Misc() {
  }

  @SuppressWarnings("unused")
  public static Function<List<Double>, List<Double>> doublesRandomizer(
      @Param(value = "randomGenerator", dNPM = "sim.defaultRG()") RandomGenerator randomGenerator,
      @Param(value = "range", dNPM = "sim.range(max=1.0;min=-1.0)") DoubleRange range
  ) {
    return values -> values.stream().map(v -> range.denormalize(randomGenerator.nextDouble())).toList();
  }

  @SuppressWarnings("unused")
  public static Function<Object, Object> fromBase64(
      @Param("s") String s
  ) {
    return o -> {
      try (ByteArrayInputStream bais = new ByteArrayInputStream(Base64.getDecoder().decode(s));
           ObjectInputStream ois = new ObjectInputStream(bais)) {
        return ois.readObject();
      } catch (Throwable t) {
        L.warning("Cannot deserialize: %s".formatted(t));
        return null;
      }
    };
  }

  @SuppressWarnings("unused")
  public static <A> AccumulatorFactory<POSetPopulationState<?, A, ?>, File, Run<?, ?, A, ?>> video(
      @Param("dirPath") String dirPath,
      @Param(value = "fileNameTemplate", dS = "video-%s.mp4") String fileNameTemplate,
      @Param(value = "w", dI = FILE_VIDEO_W) int w,
      @Param(value = "h", dI = FILE_VIDEO_H) int h,
      @Param(value = "frameRate", dD = 30) double frameRate,
      @Param(value = "startTime", dD = 0) double startTime,
      @Param(value = "endTime", dD = 30) double endTime,
      @Param(value = "codec", dS = "jcodec") VideoUtils.EncoderFacility codec,
      @Param(value = "drawer", dNPM = "sim.drawer()") Function<String, Drawer> drawer,
      @Param("task") Task<A, ?> task,
      @Param(value = "engine", dNPM = "sim.engine()") Supplier<Engine> engineSupplier,
      @Param(value = "individual", dNPM = "ea.nf.best()") Function<POSetPopulationState<?, A, ?>,
          Individual<?, A, ?>> individualFunction,
      @Param(value = "", injection = Param.Injection.MAP) ParamMap map
  ) {
    return run -> Accumulator.<POSetPopulationState<?, A, ?>>last().then(state -> {
      //extract individual
      A a = individualFunction.apply(state).solution();
      //create file
      boolean tempFile = false;
      File file;
      try {
        if (dirPath == null || dirPath.isEmpty()) {
          tempFile = true;
          file = File.createTempFile("video", ".mp4");
          file.deleteOnExit();
        } else {
          String fileName = fileNameTemplate.formatted(UUID.nameUUIDFromBytes(map.npm("task").toString().getBytes()));
          file = CSVPrinter.checkExistenceAndChangeName(new File(dirPath + File.separator + fileName));
        }
        //do video
        String videoName = map.npm("task").toString();
        VideoBuilder videoBuilder = new VideoBuilder(
            w,
            h,
            startTime,
            endTime,
            frameRate,
            codec,
            file,
            drawer.apply(videoName)
        );
        L.info("Doing video for %s on file %s".formatted(videoName, tempFile ? "temp" : file.getAbsolutePath()));
        task.run(a, engineSupplier.get(), videoBuilder);
        file = videoBuilder.get();
        L.info("Video done for %s on file %s".formatted(videoName, tempFile ? "temp" : file.getAbsolutePath()));
        return file;
      } catch (IOException ex) {
        L.warning("Cannot make video: %s".formatted(ex));
      }
      return null;
    });
  }

}
