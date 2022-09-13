package it.units.erallab.robotevo2d.main.singleagent;

import it.units.erallab.mrsim2d.builder.Param;
import it.units.malelab.jgea.core.listener.NamedFunction;

import java.util.List;

/**
 * @author "Eric Medvet" on 2022/09/01 for 2d-robot-evolution
 */
public record Experiment<G, Q>(
    @Param("runs") List<? extends Run<? extends G, ? extends Q>> runs,
    @Param("qExtractor") NamedFunction<? super Q, Double> qExtractor,
    @Param("bestFileSaver") FileSaver<Q> bestFileSaver,
    @Param("videoSaver") VideoSaver videoSaver,
    @Param("videoTasks") List<VideoTask> videoTasks
) {}
