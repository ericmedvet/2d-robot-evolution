package it.units.erallab.robotevo2d.main.singleagent;

import it.units.erallab.mrsim2d.builder.Param;
import it.units.erallab.mrsim2d.builder.ParamMap;
import it.units.erallab.mrsim2d.core.engine.Engine;
import it.units.malelab.jgea.core.listener.ListenerFactory;
import it.units.malelab.jgea.core.listener.NamedFunction;
import it.units.malelab.jgea.core.solver.state.POSetPopulationState;

import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * @author "Eric Medvet" on 2022/09/01 for 2d-robot-evolution
 */
public record Experiment<G, S, Q>(
    @Param("runs") List<? extends Run<? extends G, ? extends Q>> runs,
    @Param("qExtractor") NamedFunction<? super Q, Double> qExtractor,
    @Param("listeners") List<Function<Experiment<G, S, Q>, ? extends ListenerFactory<? super POSetPopulationState<?
        extends G, ? extends S, ? extends Q>, ParamMap>>> listeners,
    @Param(value = "engine", dNPM = "engine.defaultEngine()") Supplier<Engine> engineSupplier
) {}
