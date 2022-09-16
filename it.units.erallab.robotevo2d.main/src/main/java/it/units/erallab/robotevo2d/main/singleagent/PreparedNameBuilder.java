package it.units.erallab.robotevo2d.main.singleagent;

import it.units.erallab.mrsim2d.builder.NamedBuilder;
import it.units.erallab.mrsim2d.core.agents.gridvsr.NumGridVSR;
import it.units.erallab.mrsim2d.core.builders.GridShapeBuilder;
import it.units.erallab.mrsim2d.core.builders.TerrainBuilder;
import it.units.erallab.mrsim2d.core.builders.VSRSensorizingFunctionBuilder;
import it.units.erallab.mrsim2d.core.builders.VoxelSensorBuilder;
import it.units.erallab.mrsim2d.core.tasks.locomotion.Locomotion;
import it.units.erallab.mrsim2d.core.tasks.piling.FallPiling;
import it.units.erallab.mrsim2d.core.tasks.piling.StandPiling;
import it.units.erallab.robotevo2d.main.builder.*;
import it.units.erallab.robotevo2d.main.builder.agent.DumbCentralizedNumGridVSR;
import it.units.erallab.robotevo2d.main.builder.agent.DumbNumIndependentVoxel;
import it.units.erallab.robotevo2d.main.builder.mapper.Composition;
import it.units.erallab.robotevo2d.main.builder.mapper.agent.CentralizedNumGridVSRBrain;
import it.units.erallab.robotevo2d.main.builder.mapper.agent.NumIndependentVoxelBrain;
import it.units.erallab.robotevo2d.main.builder.mapper.function.DoublesMultiLayerPerceptron;
import it.units.erallab.robotevo2d.main.builder.mapper.function.Phases;
import it.units.erallab.robotevo2d.main.builder.solver.DoublesStandard;
import it.units.erallab.robotevo2d.main.builder.solver.SimpleES;

import java.util.List;

public class PreparedNameBuilder {

  private final static NamedBuilder<Object> NB = NamedBuilder.empty()
      .and(List.of("sim", "s"), NamedBuilder.empty()
          .and(List.of("terrain", "t"), NamedBuilder.fromUtilityClass(TerrainBuilder.class))
          .and(List.of("task"), NamedBuilder.empty()
              .and(NamedBuilder.fromClass(Locomotion.class))
              .and(NamedBuilder.fromClass(FallPiling.class))
              .and(NamedBuilder.fromClass(StandPiling.class))
          )
          .and(List.of("vsr"), NamedBuilder.empty()
              .and(NamedBuilder.fromClass(NumGridVSR.Body.class))
              .and(List.of("shape", "s"), NamedBuilder.fromUtilityClass(GridShapeBuilder.class))
              .and(
                  List.of("sensorizingFunction", "sf"),
                  NamedBuilder.fromUtilityClass(VSRSensorizingFunctionBuilder.class)
              )
              .and(List.of("voxelSensor", "vs"), NamedBuilder.fromUtilityClass(VoxelSensorBuilder.class))
          ))
      .and(List.of("randomGenerator", "rg"), NamedBuilder.fromUtilityClass(RandomGeneratorBuilder.class))
      .and(List.of("comparator", "c"), NamedBuilder.fromUtilityClass(ComparatorBuilder.class))
      .and(List.of("extractor", "e"), NamedBuilder.fromUtilityClass(ExtractorBuilder.class))
      .and(List.of("serializer", "ser"), NamedBuilder.fromUtilityClass(SerializerBuilder.class))
      .and(List.of("drawer", "d"), NamedBuilder.fromUtilityClass(DrawerBuilder.class))
      .and(List.of("mapper", "m"), NamedBuilder.empty()
          .and(NamedBuilder.fromClass(Composition.class))
          .and(NamedBuilder.fromClass(CentralizedNumGridVSRBrain.class))
          .and(NamedBuilder.fromClass(NumIndependentVoxelBrain.class))
          .and(NamedBuilder.fromClass(DoublesMultiLayerPerceptron.class))
          .and(NamedBuilder.fromClass(Phases.class))
      )
      .and(List.of("agent", "a"), NamedBuilder.empty()
          .and(NamedBuilder.fromClass(DumbCentralizedNumGridVSR.class))
          .and(NamedBuilder.fromClass(DumbNumIndependentVoxel.class))
      )
      .and(List.of("solver", "so"), NamedBuilder.empty()
          .and(NamedBuilder.fromClass(DoublesStandard.class))
          .and(NamedBuilder.fromClass(SimpleES.class))
      )
      .and(NamedBuilder.fromClass(FileSaver.class))
      .and(NamedBuilder.fromClass(VideoSaver.class))
      .and(NamedBuilder.fromClass(VideoTask.class))
      .and(NamedBuilder.fromClass(Run.class))
      .and(NamedBuilder.fromClass(Experiment.class))
      .and(NamedBuilder.fromClass(Configuration.class));

  public static NamedBuilder<Object> get() {
    return NB;
  }
}
