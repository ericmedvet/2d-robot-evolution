package it.units.erallab.robotevo2d.main.builders;

import it.units.erallab.mrsim2d.core.engine.Engine;
import it.units.erallab.mrsim2d.core.tasks.Task;
import it.units.erallab.mrsim2d.viewer.Drawer;
import it.units.erallab.mrsim2d.viewer.VideoBuilder;
import it.units.erallab.mrsim2d.viewer.VideoUtils;
import it.units.malelab.jgea.core.listener.Accumulator;
import it.units.malelab.jgea.core.listener.AccumulatorFactory;
import it.units.malelab.jgea.core.listener.CSVPrinter;
import it.units.malelab.jgea.core.solver.Individual;
import it.units.malelab.jgea.core.solver.state.POSetPopulationState;
import it.units.malelab.jgea.experimenter.Run;
import it.units.malelab.jnb.core.Param;
import it.units.malelab.jnb.core.ParamMap;

import java.io.File;
import java.io.IOException;
import java.util.UUID;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.logging.Logger;

public class Misc {

  private final static Logger L = Logger.getLogger(Misc.class.getName());

  private final static int FILE_VIDEO_W = 600;
  private final static int FILE_VIDEO_H = 400;


  private Misc() {
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
      @Param(value = "individual", dNPM = "ea.nf.best()") Function<POSetPopulationState<?, A, ?>, Individual<?, A, ?>> individualFunction,
      @Param(value = "", injection = Param.Injection.MAP) ParamMap map
  ) {
    return run -> Accumulator.<POSetPopulationState<?, A, ?>>last().then(state -> {
      //extract individual
      A a = individualFunction.apply(state).solution();
      //create file
      boolean tempFile = false;
      File file;
      try {
        if (dirPath==null || dirPath.isEmpty()) {
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
