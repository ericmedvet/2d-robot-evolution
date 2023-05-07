package io.github.ericmedvet.robotevo2d.main.builders;

import io.github.ericmedvet.jnb.core.Param;
import io.github.ericmedvet.mrsim2d.core.Snapshot;
import io.github.ericmedvet.mrsim2d.viewer.Drawer;
import io.github.ericmedvet.mrsim2d.viewer.RealtimeViewer;
import io.github.ericmedvet.mrsim2d.viewer.VideoBuilder;
import io.github.ericmedvet.mrsim2d.viewer.VideoUtils;

import java.io.File;
import java.util.function.Consumer;
import java.util.function.Function;

/**
 * @author "Eric Medvet" on 2023/05/07 for 2d-robot-evolution
 */
public class PlayConsumers {
  private PlayConsumers() {
  }

  @SuppressWarnings("unused")
  public static Consumer<Snapshot> rtGUI(
      @Param("title") String title,
      @Param(value = "drawer", dNPM = "sim.drawer()") Function<String, Drawer> drawer,
      @Param(value = "frameRate", dD = 30) double frameRate
  ) {
    return new RealtimeViewer(frameRate, drawer.apply(title == null ? "" : title));
  }

  @SuppressWarnings("unused")
  public static Consumer<Snapshot> video(
      @Param("title") String title,
      @Param(value = "drawer", dNPM = "sim.drawer()") Function<String, Drawer> drawer,
      @Param(value = "w", dI = Misc.FILE_VIDEO_W) int w,
      @Param(value = "h", dI = Misc.FILE_VIDEO_H) int h,
      @Param(value = "frameRate", dD = 30) double frameRate,
      @Param(value = "startTime", dD = 0) double startTime,
      @Param(value = "endTime", dD = 30) double endTime,
      @Param(value = "codec", dS = "jcodec") VideoUtils.EncoderFacility codec,
      @Param("filePath") String filePath
  ) {
    return new VideoBuilder(
        w,
        h,
        startTime,
        endTime,
        frameRate,
        codec,
        io.github.ericmedvet.jgea.core.util.Misc.checkExistenceAndChangeName(new File(filePath)),
        drawer.apply(title == null ? "" : title)
    );
  }

}
