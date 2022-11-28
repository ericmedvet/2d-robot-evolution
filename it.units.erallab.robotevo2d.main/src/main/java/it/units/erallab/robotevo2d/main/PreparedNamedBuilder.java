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

package it.units.erallab.robotevo2d.main;

import it.units.erallab.robotevo2d.main.builders.Drawers;
import it.units.erallab.robotevo2d.main.builders.Engines;
import it.units.erallab.robotevo2d.main.builders.MiscBuilder;
import it.units.erallab.robotevo2d.main.builders.OutcomeFunctions;
import it.units.erallab.robotevo2d.main.builders.mapper.ParametrizedSupplier;
import it.units.malelab.jnb.core.NamedBuilder;

import java.util.List;

public class PreparedNamedBuilder {

  private final static NamedBuilder<Object> NB = NamedBuilder.empty()
      .and(it.units.erallab.mrsim2d.core.PreparedNamedBuilder.get())
      .and(it.units.malelab.jgea.experimenter.PreparedNamedBuilder.get())
      .and(List.of("extractor", "e"), NamedBuilder.fromUtilityClass(OutcomeFunctions.class))
      .and("engine", NamedBuilder.fromUtilityClass(Engines.class))
      .and("misc", NamedBuilder.fromUtilityClass(MiscBuilder.class))
      .and(List.of("drawer", "d"), NamedBuilder.fromUtilityClass(Drawers.class))
      .and(List.of("mapper", "m"), NamedBuilder.empty()
          .and(NamedBuilder.fromClass(ParametrizedSupplier.class))
      )
      .and(NamedBuilder.fromClass(VideoSaver.class));

  private PreparedNamedBuilder() {
  }

  public static NamedBuilder<Object> get() {
    return NB;
  }
}
