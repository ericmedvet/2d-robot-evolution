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

package it.units.erallab.robotevo2d.main.builders;

import it.units.erallab.mrsim2d.core.util.Parametrized;
import it.units.malelab.jgea.experimenter.InvertibleMapper;
import it.units.malelab.jnb.core.NamedBuilder;
import it.units.malelab.jnb.core.Param;
import it.units.malelab.jnb.core.ParamMap;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Mappers {
  private Mappers() {
  }

  @SuppressWarnings("unused")
  public static <T extends Parametrized> InvertibleMapper<List<Double>, Supplier<T>> parametrized(
      @Param("target") T target,
      @Param(value = "", injection = Param.Injection.MAP) ParamMap map,
      @Param(value = "", injection = Param.Injection.BUILDER) NamedBuilder<?> builder
  ) {
    return new InvertibleMapper<>() {
      @Override
      public Supplier<T> apply(List<Double> values) {
        if (values.size() != target.getParams().length) {
          throw new IllegalArgumentException("Wrong number of params: %d expected, %d found".formatted(
              target.getParams().length,
              values.size()
          ));
        }
        return () -> {
          @SuppressWarnings("unchecked") T t = (T) builder.build(map.npm("target"));
          t.setParams(values.stream().mapToDouble(d -> d).toArray());
          return t;
        };
      }

      @Override
      public List<Double> exampleInput() {
        return Arrays.stream(target.getParams()).boxed().toList();
      }
    };
  }
}
