/*-
 * ========================LICENSE_START=================================
 * robotevo2d-main
 * %%
 * Copyright (C) 2022 - 2023 Eric Medvet
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

import io.github.ericmedvet.jgea.core.listener.NamedFunction;
import io.github.ericmedvet.jnb.core.Discoverable;
import io.github.ericmedvet.jnb.core.Param;
import io.github.ericmedvet.jnb.core.ParamMap;
import io.github.ericmedvet.jsdynsym.grid.Grid;
import io.github.ericmedvet.jsdynsym.grid.GridUtils;
import io.github.ericmedvet.mrsim2d.core.agents.gridvsr.AbstractGridVSR;
import io.github.ericmedvet.mrsim2d.core.agents.gridvsr.GridBody;
import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Base64;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.logging.Logger;

@Discoverable(prefixTemplate = "evorobots|er.namedFunction|nf")
public class NamedFunctions {

  private static final Logger L = Logger.getLogger(NamedFunctions.class.getName());

  private NamedFunctions() {}

  private static String c(String... names) {
    return Arrays.stream(names).reduce(NamedFunction.NAME_COMPOSER::apply).orElseThrow();
  }

  @SuppressWarnings("unused")
  public static <X> NamedFunction<X, Double> compactness(@Param("f") NamedFunction<X, Grid<GridBody.Element>> f) {
    return NamedFunction.build(
        c("compactness", f.getName()),
        "%4.2f",
        x -> GridUtils.compactness(f.apply(x), e -> !e.type().equals(GridBody.VoxelType.NONE)));
  }

  @SuppressWarnings("unused")
  public static <X> NamedFunction<X, Integer> count(@Param("f") NamedFunction<X, Grid<GridBody.Element>> f) {
    return NamedFunction.build(
        c("count", f.getName()),
        "%3d",
        x -> GridUtils.count(f.apply(x), e -> !e.type().equals(GridBody.VoxelType.NONE)));
  }

  @SuppressWarnings("unused")
  public static <X> NamedFunction<X, Double> elongation(@Param("f") NamedFunction<X, Grid<GridBody.Element>> f) {
    return NamedFunction.build(
        c("elongation", f.getName()),
        "%4.1f",
        x -> GridUtils.elongation(f.apply(x), e -> !e.type().equals(GridBody.VoxelType.NONE)));
  }

  @SuppressWarnings("unused")
  public static <T, R> NamedFunction<T, R> f(
      @Param("inner") Function<T, R> inner,
      @Param("name") String name,
      @Param(value = "s", dS = "%s") String s,
      @Param(value = "", injection = Param.Injection.MAP) ParamMap map) {
    if ((name == null) || name.isEmpty()) {
      name = map.value("inner", ParamMap.Type.NAMED_PARAM_MAP).toString();
    }
    return NamedFunction.build(name, s, inner);
  }

  @SuppressWarnings("unused")
  public static <X> NamedFunction<X, Grid<GridBody.Element>> gridBody(
      @Param("f") NamedFunction<X, Supplier<AbstractGridVSR>> f) {
    return NamedFunction.build(
        c("gridBody", f.getName()), x -> f.apply(x).get().getElementGrid());
  }

  @SuppressWarnings("unused")
  public static <X> NamedFunction<X, Integer> h(@Param("f") NamedFunction<X, Grid<GridBody.Element>> f) {
    return NamedFunction.build(
        c("h", f.getName()),
        "%2d",
        x -> GridUtils.h(f.apply(x), e -> !e.type().equals(GridBody.VoxelType.NONE)));
  }

  @SuppressWarnings("unused")
  public static <X> NamedFunction<X, String> stringBase64(@Param("f") NamedFunction<X, Serializable> f) {
    return NamedFunction.build(c("stringBase64", f.getName()), x -> {
      try (ByteArrayOutputStream baos = new ByteArrayOutputStream();
          ObjectOutputStream oos = new ObjectOutputStream(baos)) {
        oos.writeObject(f.apply(x).toString());
        oos.flush();
        return Base64.getEncoder().encodeToString(baos.toByteArray());
      } catch (Throwable t) {
        L.warning("Cannot serialize %s due to %s".formatted(f.getName(), t));
        return "not-serializable";
      }
    });
  }

  @SuppressWarnings("unused")
  public static <X> NamedFunction<X, Integer> w(@Param("f") NamedFunction<X, Grid<GridBody.Element>> f) {
    return NamedFunction.build(
        c("w", f.getName()),
        "%2d",
        x -> GridUtils.w(f.apply(x), e -> !e.type().equals(GridBody.VoxelType.NONE)));
  }
}
