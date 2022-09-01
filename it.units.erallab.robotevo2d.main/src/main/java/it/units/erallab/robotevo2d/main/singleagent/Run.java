package it.units.erallab.robotevo2d.main.singleagent;

import it.units.erallab.mrsim2d.builder.Param;
import it.units.erallab.mrsim2d.builder.ParamMap;
import it.units.erallab.mrsim2d.core.EmbodiedAgent;
import it.units.erallab.mrsim2d.core.tasks.Task;
import it.units.erallab.robotevo2d.main.builder.MapperBuilder;
import it.units.erallab.robotevo2d.main.builder.solver.SolverBuilder;
import it.units.malelab.jgea.core.order.PartialComparator;

import java.util.function.Supplier;
import java.util.random.RandomGenerator;

/**
 * @author "Eric Medvet" on 2022/09/01 for 2d-robot-evolution
 */
public record Run<G, Q>(
    @Param("solver") SolverBuilder<G> solverBuilder,
    @Param("mapper") MapperBuilder<G, Supplier<EmbodiedAgent>> mapper,
    @Param("target") EmbodiedAgent target,
    @Param("task") Task<Supplier<EmbodiedAgent>, Q> task,
    @Param("comparator") PartialComparator<? super Q> comparator,
    @Param("randomGenerator") RandomGenerator randomGenerator,
    @Param(value = "", self = true) ParamMap map
) {}
