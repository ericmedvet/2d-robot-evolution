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
package io.github.ericmedvet.robotevo2d.main.builders;

import io.github.ericmedvet.jnb.core.Discoverable;
import io.github.ericmedvet.jnb.core.Param;
import io.github.ericmedvet.mrsim2d.core.Snapshot;
import io.github.ericmedvet.mrsim2d.viewer.Drawer;
import io.github.ericmedvet.mrsim2d.viewer.FramesImageBuilder;
import io.github.ericmedvet.mrsim2d.viewer.RealtimeViewer;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

@Discoverable(prefixTemplate = "evorobots|er.consumer|c")
public class PlayConsumers {

  private static final Logger L = Logger.getLogger(PlayConsumers.class.getName());

  private PlayConsumers() {}

  public interface ProducingConsumer extends Consumer<Snapshot>, Runnable {
    static ProducingConsumer from(Consumer<Snapshot> consumer, Runnable runnable) {
      return new ProducingConsumer() {
        @Override
        public void accept(Snapshot snapshot) {
          consumer.accept(snapshot);
        }

        @Override
        public void run() {
          runnable.run();
        }
      };
    }

    default ProducingConsumer andThen(ProducingConsumer other) {
      ProducingConsumer thisProducingConsumer = this;
      return ProducingConsumer.from(
          s -> {
            thisProducingConsumer.accept(s);
            other.accept(s);
          },
          () -> {
            thisProducingConsumer.run();
            other.run();
          });
    }
  }

  @SuppressWarnings("unused")
  public static ProducingConsumer frames(
      @Param("title") String title,
      @Param(value = "drawer", dNPM = "sim.drawer()") Function<String, Drawer> drawer,
      @Param(value = "w", dI = 500) int w,
      @Param(value = "h", dI = 300) int h,
      @Param(value = "nOfFrames", dI = 5) int nOfFrames,
      @Param(value = "deltaT", dD = 0.2) double deltaT,
      @Param(value = "startTime", dD = 0) double startTime,
      @Param("filePath") String filePath) {
    FramesImageBuilder framesImageBuilder = new FramesImageBuilder(
        w,
        h,
        nOfFrames,
        deltaT,
        startTime,
        FramesImageBuilder.Direction.HORIZONTAL,
        true,
        drawer.apply(title == null ? "" : title));
    return ProducingConsumer.from(framesImageBuilder, () -> {
      BufferedImage bufferedImage = framesImageBuilder.get();
      try {
        File file = io.github.ericmedvet.jgea.core.util.Misc.robustGetFile(filePath);
        ImageIO.write(bufferedImage, "png", file);
        L.info("Image done and saved on file %s".formatted(file.getAbsolutePath()));
      } catch (IOException e) {
        L.warning("Could not save image file due to: %");
      }
    });
  }

  @SuppressWarnings("unused")
  public static ProducingConsumer rtGUI(
      @Param("title") String title,
      @Param(value = "drawer", dNPM = "sim.drawer()") Function<String, Drawer> drawer,
      @Param(value = "frameRate", dD = 30) double frameRate) {
    return ProducingConsumer.from(
        new RealtimeViewer(frameRate, drawer.apply(title == null ? "" : title)), () -> {});
  }
}
