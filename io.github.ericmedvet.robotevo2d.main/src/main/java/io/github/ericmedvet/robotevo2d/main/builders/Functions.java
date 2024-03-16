/*-
 * ========================LICENSE_START=================================
 * robotevo2d-main
 * %%
 * Copyright (C) 2018 - 2024 Eric Medvet
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * =========================LICENSE_END==================================
 */
package io.github.ericmedvet.robotevo2d.main.builders;

import io.github.ericmedvet.jnb.core.Discoverable;
import io.github.ericmedvet.jnb.core.Param;
import io.github.ericmedvet.jnb.datastructure.FormattedNamedFunction;
import io.github.ericmedvet.mrsim2d.core.agents.gridvsr.GridBody;

import java.util.function.Function;

@Discoverable(prefixTemplate = "evorobots|er.function|f")
public class Functions {

  private Functions() {}


  @SuppressWarnings("unused")
  public static <X> FormattedNamedFunction<X, Boolean> nonEmptyVoxel(
      @Param(value = "of", dNPM = "f.identity()") Function<X, GridBody.Element> beforeF,
      @Param(value = "format", dS = "%s") String format) {
    Function<GridBody.Element, Boolean> f = e -> !e.type().equals(GridBody.VoxelType.NONE);
    return FormattedNamedFunction.from(f, format, "non.empty.voxel").compose(beforeF);
  }



}
