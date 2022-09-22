/*
 * Copyright 2022 eric
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package it.units.erallab.robotevo2d.main.singleagent;

import it.units.erallab.mrsim2d.builder.NamedBuilder;
import it.units.erallab.mrsim2d.core.PreparedNamedBuilder;
import it.units.erallab.robotevo2d.main.builder.*;
import it.units.erallab.robotevo2d.main.builder.mapper.Composition;
import it.units.erallab.robotevo2d.main.builder.mapper.agent.WithTimedRealFunctionBrain;
import it.units.erallab.robotevo2d.main.builder.mapper.function.DoublesMultiLayerPerceptron;
import it.units.erallab.robotevo2d.main.builder.mapper.function.Phases;
import it.units.erallab.robotevo2d.main.builder.solver.DoublesStandard;
import it.units.erallab.robotevo2d.main.builder.solver.SimpleES;

import java.util.List;

public class PreparedNameBuilder {

  private final static NamedBuilder<Object> NB = NamedBuilder.empty()
      .and(PreparedNamedBuilder.get())
      .and(List.of("randomGenerator", "rg"), NamedBuilder.fromUtilityClass(RandomGeneratorBuilder.class))
      .and(List.of("comparator", "c"), NamedBuilder.fromUtilityClass(ComparatorBuilder.class))
      .and(List.of("extractor", "e"), NamedBuilder.fromUtilityClass(ExtractorBuilder.class))
      .and(List.of("serializer", "ser"), NamedBuilder.fromUtilityClass(SerializerBuilder.class))
      .and(List.of("drawer", "d"), NamedBuilder.fromUtilityClass(DrawerBuilder.class))
      .and(List.of("mapper", "m"), NamedBuilder.empty()
          .and(NamedBuilder.fromClass(Composition.class))
          .and(NamedBuilder.fromClass(WithTimedRealFunctionBrain.class))
          .and(NamedBuilder.fromClass(DoublesMultiLayerPerceptron.class))
          .and(NamedBuilder.fromClass(Phases.class))
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
