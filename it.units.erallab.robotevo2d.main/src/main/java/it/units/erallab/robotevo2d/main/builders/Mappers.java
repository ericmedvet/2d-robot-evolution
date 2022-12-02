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

import it.units.erallab.mrsim2d.core.NumMultiBrained;
import it.units.erallab.mrsim2d.core.functions.TimedRealFunction;
import it.units.erallab.mrsim2d.core.util.Parametrized;
import it.units.malelab.jgea.experimenter.InvertibleMapper;
import it.units.malelab.jnb.core.NamedBuilder;
import it.units.malelab.jnb.core.Param;
import it.units.malelab.jnb.core.ParamMap;

import java.util.Arrays;
import java.util.Collections;
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

  @SuppressWarnings("unused")
  public static <T extends NumMultiBrained> InvertibleMapper<List<Double>, Supplier<T>> parametrizedHeteroBrains(
      @Param("target") T target,
      @Param(value = "", injection = Param.Injection.MAP) ParamMap map,
      @Param(value = "", injection = Param.Injection.BUILDER) NamedBuilder<?> builder
  ) {
    if (!target.brains().stream().allMatch(b -> b instanceof Parametrized)) {
      throw new IllegalArgumentException("Some of the %d brains are not parametrized".formatted(target.brains()
          .size()));
    }
    List<Integer> brainSizes = target.brains().stream()
        .map(b -> ((Parametrized) b).getParams().length)
        .toList();
    int overallBrainSize = brainSizes.stream().mapToInt(i -> i).sum();
    return new InvertibleMapper<>() {
      @Override
      public Supplier<T> apply(List<Double> values) {
        if (values.size() != overallBrainSize) {
          throw new IllegalArgumentException("Wrong number of params: %d expected, %d found".formatted(
              overallBrainSize,
              values.size()
          ));
        }
        return () -> {
          @SuppressWarnings("unchecked") T t = (T) builder.build(map.npm("target"));
          int c = 0;
          for (TimedRealFunction brain : t.brains()) {
            int brainSize = ((Parametrized) brain).getParams().length;
            ((Parametrized) brain).setParams(values.subList(c, c + brainSize).stream().mapToDouble(d -> d).toArray());
            c = c + brainSize;
          }
          return t;
        };
      }

      @Override
      public List<Double> exampleInput() {
        return Collections.nCopies(overallBrainSize, 0d);
      }
    };
  }

  @SuppressWarnings("unused")
  public static <T extends NumMultiBrained> InvertibleMapper<List<Double>, Supplier<T>> parametrizedHomoBrains(
      @Param("target") T target,
      @Param(value = "", injection = Param.Injection.MAP) ParamMap map,
      @Param(value = "", injection = Param.Injection.BUILDER) NamedBuilder<?> builder
  ) {
    if (!target.brains().stream().allMatch(b -> b instanceof Parametrized)) {
      throw new IllegalArgumentException("Some of the %d brains are not parametrized".formatted(target.brains()
          .size()));
    }
    List<Integer> brainSizes = target.brains().stream()
        .map(b -> ((Parametrized) b).getParams().length)
        .distinct()
        .toList();
    if (brainSizes.size() != 1) {
      throw new IllegalArgumentException("Some of the %d brains have different sizes (%s sizes found)".formatted(target.brains()
          .size(), brainSizes));
    }
    int brainSize = brainSizes.get(0);
    return new InvertibleMapper<>() {
      @Override
      public Supplier<T> apply(List<Double> values) {
        if (values.size() != brainSize) {
          throw new IllegalArgumentException("Wrong number of params: %d expected, %d found".formatted(
              brainSize,
              values.size()
          ));
        }
        return () -> {
          @SuppressWarnings("unchecked") T t = (T) builder.build(map.npm("target"));
          t.brains().forEach(b -> ((Parametrized) b).setParams(values.stream().mapToDouble(d -> d).toArray()));
          return t;
        };
      }

      @Override
      public List<Double> exampleInput() {
        return Collections.nCopies(brainSize, 0d);
      }
    };
  }

}
