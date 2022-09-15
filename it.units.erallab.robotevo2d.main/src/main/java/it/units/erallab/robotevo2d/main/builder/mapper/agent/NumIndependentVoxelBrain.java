package it.units.erallab.robotevo2d.main.builder.mapper.agent;

import it.units.erallab.mrsim2d.core.agents.independentvoxel.NumIndependentVoxel;
import it.units.erallab.mrsim2d.core.functions.TimedRealFunction;
import it.units.erallab.robotevo2d.main.builder.MapperBuilder;

import java.util.function.Function;
import java.util.function.Supplier;

public class NumIndependentVoxelBrain implements MapperBuilder<TimedRealFunction, Supplier<NumIndependentVoxel>> {
  @Override
  public Function<TimedRealFunction, Supplier<NumIndependentVoxel>> buildFor(Supplier<NumIndependentVoxel> target) {
    return trf -> () -> new NumIndependentVoxel(target.get().getSensors(), trf);
  }

  @Override
  public TimedRealFunction exampleFor(Supplier<NumIndependentVoxel> target) {
    return TimedRealFunction.from(
        (t, in) -> new double[NumIndependentVoxel.nOfOutputs()],
        NumIndependentVoxel.nOfInputs(target.get().getSensors()),
        NumIndependentVoxel.nOfOutputs()
    );
  }
}
