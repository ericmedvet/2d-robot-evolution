package it.units.erallab.robotevo2d.main.singleagent;

import it.units.erallab.mrsim2d.core.tasks.Task;
import it.units.malelab.jnb.core.Param;
import it.units.malelab.jnb.core.ParamMap;

/**
 * @author "Eric Medvet" on 2022/09/01 for 2d-robot-evolution
 */
public record NamedTask<Q>(
    @Param("task") Task<Q, ?> task,
    @Param(value = "", injection = Param.Injection.MAP) ParamMap map
) {}
