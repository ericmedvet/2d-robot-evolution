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

import it.units.erallab.robotevo2d.main.builder.*;
import it.units.erallab.robotevo2d.main.builder.mapper.ParametrizedSupplier;
import it.units.malelab.jnb.core.NamedBuilder;

import java.util.List;

public class PreparedNamedBuilder {

  private final static NamedBuilder<Object> NB = NamedBuilder.empty()
      .and(it.units.erallab.mrsim2d.core.PreparedNamedBuilder.get())
      .and(List.of("randomGenerator", "rg"), NamedBuilder.fromUtilityClass(RandomGeneratorBuilder.class))
      .and(List.of("extractor", "e"), NamedBuilder.fromUtilityClass(ExtractorBuilder.class))
      .and(List.of("listener", "l"), NamedBuilder.fromUtilityClass(ListenerBuilder.class))
      .and("engine", NamedBuilder.fromUtilityClass(EngineBuilder.class))
      .and("misc", NamedBuilder.fromUtilityClass(MiscBuilder.class))
      .and(List.of("namedFunction", "nf"), NamedBuilder.fromUtilityClass(NamedFunctionBuilder.class))
      .and(List.of("drawer", "d"), NamedBuilder.fromUtilityClass(DrawerBuilder.class))
      .and(List.of("mapper", "m"), NamedBuilder.empty()
          .and(NamedBuilder.fromClass(ParametrizedSupplier.class))
      )
      .and(List.of("solver", "so"), NamedBuilder.fromUtilityClass(SolverBuilder.class))
      .and(List.of("problem", "p"), NamedBuilder.fromUtilityClass(ProblemBuilder.class))
      .and(NamedBuilder.fromClass(VideoSaver.class))
      .and(NamedBuilder.fromClass(NamedTask.class))
      .and(NamedBuilder.fromClass(Run.class))
      .and(NamedBuilder.fromClass(Experiment.class))
      .and(NamedBuilder.fromClass(Configuration.class));

  private PreparedNamedBuilder() {
  }

  public static NamedBuilder<Object> get() {
    return NB;
  }
}
