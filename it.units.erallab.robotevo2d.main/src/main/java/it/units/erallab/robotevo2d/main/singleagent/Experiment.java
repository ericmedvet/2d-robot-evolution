package it.units.erallab.robotevo2d.main.singleagent;

import it.units.erallab.mrsim2d.builder.Param;
import it.units.malelab.jgea.core.listener.ListenerFactory;
import it.units.malelab.jgea.core.listener.NamedFunction;
import it.units.malelab.jgea.core.solver.state.POSetPopulationState;

import java.util.List;
import java.util.Map;
import java.util.function.Function;

/**
 * @author "Eric Medvet" on 2022/09/01 for 2d-robot-evolution
 */
public record Experiment<G, S, Q>(
    @Param("runs") List<? extends Run<? extends G, ? extends Q>> runs,
    @Param("qExtractor") NamedFunction<? super Q, Double> qExtractor,
    @Param("listeners") List<Function<NamedFunction<? super Q, Double>, ? extends ListenerFactory<? super POSetPopulationState<G, S, Q>, Map<String, Object>>>> listeners,
    @Param("bestFileSaver") FileSaver<Q> bestFileSaver,
    @Param("videoSaver") VideoSaver videoSaver,
    @Param("videoTasks") List<VideoTask> videoTasks
) {}
