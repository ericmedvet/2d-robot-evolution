package it.units.erallab.robotevo2d.main.builder.agent;

import it.units.erallab.mrsim2d.builder.Param;
import it.units.erallab.mrsim2d.core.actions.Sense;
import it.units.erallab.mrsim2d.core.agents.independentvoxel.NumIndependentVoxel;
import it.units.erallab.mrsim2d.core.bodies.Voxel;
import it.units.erallab.mrsim2d.core.functions.TimedRealFunction;

import java.util.List;
import java.util.function.Function;

public class DumbNumIndependentVoxel extends NumIndependentVoxel {

  public DumbNumIndependentVoxel(
      @Param("sensors") List<Function<Voxel, Sense<? super Voxel>>> sensors
  ) {
    super(
        sensors,
        TimedRealFunction.from(
            (t, in) -> new double[NumIndependentVoxel.nOfOutputs()],
            NumIndependentVoxel.nOfInputs(sensors),
            NumIndependentVoxel.nOfOutputs()
        )
    );
  }
}
