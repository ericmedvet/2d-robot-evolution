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

package io.github.ericmedvet.robotevo2d.main;

import io.github.ericmedvet.jnb.core.NamedBuilder;
import io.github.ericmedvet.robotevo2d.main.builders.*;

import java.util.List;

public class PreparedNamedBuilder {

  private final static NamedBuilder<Object> NB = NamedBuilder.empty()
      .and(io.github.ericmedvet.mrsim2d.buildable.PreparedNamedBuilder.get())
      .and(io.github.ericmedvet.jgea.experimenter.PreparedNamedBuilder.get())
      .and(List.of("evorobots", "er"), NamedBuilder.empty()
          .and(NamedBuilder.fromUtilityClass(Misc.class))
          .and(NamedBuilder.fromClass(Play.class))
          .and(List.of("solver", "s"), NamedBuilder.fromUtilityClass(Solvers.class))
          .and(List.of("mapper", "m"), NamedBuilder.fromUtilityClass(Mappers.class))
          .and(List.of("dynamicalSystem", "dynSys", "ds"), NamedBuilder.empty()
              .and(List.of("numerical", "num"), NamedBuilder.fromUtilityClass(NumericalDynamicalSystems.class))
          )
          .and(List.of("namedFunction", "nf"), NamedBuilder.fromUtilityClass(NamedFunctions.class))
          .and(List.of("listener", "l"), NamedBuilder.fromUtilityClass(Listeners.class))
      );

  private PreparedNamedBuilder() {
  }

  public static NamedBuilder<Object> get() {
    return NB;
  }

}
