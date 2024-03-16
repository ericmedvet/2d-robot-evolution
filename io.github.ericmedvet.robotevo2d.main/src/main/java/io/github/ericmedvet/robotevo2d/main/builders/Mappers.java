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

import io.github.ericmedvet.jgea.core.InvertibleMapper;
import io.github.ericmedvet.jgea.core.representation.NamedMultivariateRealFunction;
import io.github.ericmedvet.jgea.core.representation.graph.Graph;
import io.github.ericmedvet.jgea.core.representation.graph.Node;
import io.github.ericmedvet.jgea.core.representation.graph.numeric.operatorgraph.OperatorGraph;
import io.github.ericmedvet.jgea.core.representation.sequence.integer.IntString;
import io.github.ericmedvet.jgea.core.representation.tree.Tree;
import io.github.ericmedvet.jgea.core.representation.tree.numeric.Element;
import io.github.ericmedvet.jgea.core.representation.tree.numeric.TreeBasedMultivariateRealFunction;
import io.github.ericmedvet.jnb.core.Discoverable;
import io.github.ericmedvet.jnb.core.NamedBuilder;
import io.github.ericmedvet.jnb.core.NamedParamMap;
import io.github.ericmedvet.jnb.core.Param;
import io.github.ericmedvet.jnb.core.ParamMap;
import io.github.ericmedvet.jnb.datastructure.Grid;
import io.github.ericmedvet.jnb.datastructure.GridUtils;
import io.github.ericmedvet.jnb.datastructure.NumericalParametrized;
import io.github.ericmedvet.jnb.datastructure.Parametrized;
import io.github.ericmedvet.jsdynsym.core.composed.Composed;
import io.github.ericmedvet.jsdynsym.core.numerical.MultivariateRealFunction;
import io.github.ericmedvet.jsdynsym.core.numerical.NumericalDynamicalSystem;
import io.github.ericmedvet.mrsim2d.buildable.builders.ReactiveVoxels;
import io.github.ericmedvet.mrsim2d.core.NumMultiBrained;
import io.github.ericmedvet.mrsim2d.core.agents.gridvsr.ReactiveGridVSR;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

// TODO make consistent with Mappers of jgea: 1. of parameter; 2. numerical parametrized
@Discoverable(prefixTemplate = "evorobots|er.mapper|m")
public class Mappers {
  private Mappers() {}

  private static int argmax(double[] values) {
    if (values.length == 0) {
      throw new IllegalArgumentException("Empty array");
    }
    int i = 0;
    for (int j = 1; j < values.length; j++) {
      if (values[j] > values[i]) {
        i = j;
      }
    }
    return i;
  }

  private static void checkIOSizeConsistency(NumMultiBrained numMultiBrained) {
    List<Integer> inSizes = numMultiBrained.brains().stream()
        .map(NumericalDynamicalSystem::nOfInputs)
        .distinct()
        .toList();
    List<Integer> outSizes = numMultiBrained.brains().stream()
        .map(NumericalDynamicalSystem::nOfOutputs)
        .distinct()
        .toList();
    if (inSizes.size() != 1) {
      throw new IllegalArgumentException("Not all of the %d brains has the same input size: %s sizes found"
          .formatted(numMultiBrained.brains().size(), inSizes));
    }
    if (outSizes.size() != 1) {
      throw new IllegalArgumentException("Not all of the %d brains has the same output size: %s sizes found"
          .formatted(numMultiBrained.brains().size(), outSizes));
    }
  }

  private static void checkNumericalParametrizedSizeConsistency(NumMultiBrained numMultiBrained) {
    List<Integer> brainSizes = numMultiBrained.brains().stream()
        .map(b -> ((double[]) Composed.shallowest(b, NumericalParametrized.class)
                .orElseThrow()
                .getParams())
            .length)
        .distinct()
        .toList();
    if (brainSizes.size() != 1) {
      throw new IllegalArgumentException("Not all of the %d brains has the same output size: %s sizes found"
          .formatted(numMultiBrained.brains().size(), brainSizes));
    }
  }

  private static <T> void checkType(NumMultiBrained numMultiBrained, Class<T> clazz) {
    for (NumericalDynamicalSystem<?> nds : numMultiBrained.brains()) {
      if (Composed.shallowest(nds, clazz).isEmpty()) {
        throw new IllegalArgumentException("Some of the %d brains is not a %s"
            .formatted(numMultiBrained.brains().size(), clazz.getSimpleName()));
      }
    }
  }

  @SuppressWarnings("unused")
  public static InvertibleMapper<IntString, Supplier<ReactiveGridVSR>> isToReactiveGridVsr(
      @Param("w") int w,
      @Param("h") int h,
      @Param("availableVoxels") List<Supplier<ReactiveGridVSR.ReactiveVoxel>> availableVoxels) {
    IntString exampleGenotype = new IntString(Collections.nCopies(w * h, 0), 0, availableVoxels.size() + 1);
    return InvertibleMapper.from(
        (supplier, s) -> {
          Grid<Integer> indexGrid = Grid.create(w, h, s.genes());
          Grid<ReactiveGridVSR.ReactiveVoxel> body;
          if (indexGrid.values().stream().max(Integer::compareTo).orElse(0) == 0) {
            body = Grid.create(1, 1, ReactiveVoxels.ph());
          } else {
            body = GridUtils.fit(GridUtils.largestConnected(indexGrid, i -> i > 0, 0), i -> i > 0)
                .map(i -> i == 0
                    ? ReactiveVoxels.none()
                    : availableVoxels.get(i - 1).get());
          }
          return () -> new ReactiveGridVSR(body);
        },
        supplier -> exampleGenotype,
        "isToReactiveGridVsr[w=%d;h=%d]".formatted(w, h));
  }

  @SuppressWarnings("unused")
  public static InvertibleMapper<NamedMultivariateRealFunction, Supplier<ReactiveGridVSR>> nmrfToReactiveGridVsr(
      @Param("w") int w,
      @Param("h") int h,
      @Param("availableVoxels") List<Supplier<ReactiveGridVSR.ReactiveVoxel>> availableVoxels) {
    return InvertibleMapper.from(
        (supplier, nmrf) -> {
          Grid<Integer> indexGrid = Grid.create(w, h, (x, y) -> {
            double[] output = nmrf.apply(new double[] {(double) x / (double) w, (double) y / (double) h});
            int iMax = argmax(output);
            return output[iMax] > 0 ? iMax + 1 : 0;
          });
          Grid<ReactiveGridVSR.ReactiveVoxel> body;
          if (indexGrid.values().stream().max(Integer::compareTo).orElse(0) == 0) {
            body = Grid.create(1, 1, ReactiveVoxels.ph());
          } else {
            body = GridUtils.fit(GridUtils.largestConnected(indexGrid, i -> i > 0, 0), i -> i > 0)
                .map(i -> i == 0
                    ? ReactiveVoxels.none()
                    : availableVoxels.get(i - 1).get());
          }
          return () -> new ReactiveGridVSR(body);
        },
        supplier -> NamedMultivariateRealFunction.from(
            MultivariateRealFunction.from(vs -> vs, 2, availableVoxels.size()),
            List.of("x", "y"),
            MultivariateRealFunction.varNames("v", availableVoxels.size())),
        "nmrfToReactiveGridVsr[w=%d;h=%d]".formatted(w, h));
  }

  @SuppressWarnings("unused")
  public static <T extends NumMultiBrained> InvertibleMapper<List<Double>, Supplier<T>> dsToNpHeteroBrains(
      @Param("target") T target,
      @Param(value = "", injection = Param.Injection.MAP) ParamMap map,
      @Param(value = "", injection = Param.Injection.BUILDER) NamedBuilder<?> builder) {
    checkType(target, NumericalParametrized.class);
    List<Integer> brainSizes = target.brains().stream()
        .map(b -> ((double[]) Composed.shallowest(b, NumericalParametrized.class)
                .orElseThrow()
                .getParams())
            .length)
        .toList();
    int overallBrainSize = brainSizes.stream().mapToInt(i -> i).sum();
    return InvertibleMapper.from(
        (supplier, values) -> {
          if (values.size() != overallBrainSize) {
            throw new IllegalArgumentException("Wrong number of params: %d expected, %d found"
                .formatted(overallBrainSize, values.size()));
          }
          return () -> {
            @SuppressWarnings("unchecked")
            T t = (T) builder.build((NamedParamMap) map.value("target", ParamMap.Type.NAMED_PARAM_MAP));
            int c = 0;
            for (NumericalDynamicalSystem<?> brain : t.brains()) {
              int brainSize = ((double[]) Composed.shallowest(brain, NumericalParametrized.class)
                      .orElseThrow()
                      .getParams())
                  .length;
              //noinspection unchecked
              Composed.shallowest(brain, NumericalParametrized.class)
                  .orElseThrow()
                  .setParams(values.subList(c, c + brainSize).stream()
                      .mapToDouble(d -> d)
                      .toArray());
              c = c + brainSize;
            }
            return t;
          };
        },
        supplier -> Collections.nCopies(overallBrainSize, 0d),
        "dsToNpHeteroBrains");
  }

  @SuppressWarnings("unused")
  public static <T extends NumMultiBrained> InvertibleMapper<List<Double>, Supplier<T>> dsToNpHomoBrains(
      @Param("target") T target,
      @Param(value = "", injection = Param.Injection.MAP) ParamMap map,
      @Param(value = "", injection = Param.Injection.BUILDER) NamedBuilder<?> builder) {
    checkType(target, NumericalParametrized.class);
    checkIOSizeConsistency(target);
    checkNumericalParametrizedSizeConsistency(target);
    int brainSize = target.brains().stream()
        .map(b -> ((double[]) Composed.shallowest(b, NumericalParametrized.class)
                .orElseThrow()
                .getParams())
            .length)
        .findFirst()
        .orElseThrow();
    return InvertibleMapper.from(
        (supplier, values) -> {
          if (values.size() != brainSize) {
            throw new IllegalArgumentException(
                "Wrong number of params: %d expected, %d found".formatted(brainSize, values.size()));
          }
          return () -> {
            @SuppressWarnings("unchecked")
            T t = (T) builder.build((NamedParamMap) map.value("target", ParamMap.Type.NAMED_PARAM_MAP));
            //noinspection unchecked
            t.brains().forEach(b -> Composed.shallowest(b, NumericalParametrized.class)
                .orElseThrow()
                .setParams(values.stream().mapToDouble(d -> d).toArray()));
            return t;
          };
        },
        supplier -> Collections.nCopies(brainSize, 0d),
        "dsToNpHomoBrains");
  }

  @SuppressWarnings("unused")
  public static <T extends NumMultiBrained>
      InvertibleMapper<Graph<Node, OperatorGraph.NonValuedArc>, Supplier<T>> oGraphToHomoBrains(
          @Param("target") T target,
          @Param(value = "", injection = Param.Injection.MAP) ParamMap map,
          @Param(value = "", injection = Param.Injection.BUILDER) NamedBuilder<?> builder) {
    checkType(target, Parametrized.class);
    checkIOSizeConsistency(target);
    Optional<OperatorGraph> optionalOGraphMRF =
        Composed.shallowest(target.brains().stream().findFirst().orElseThrow(), OperatorGraph.class);
    if (optionalOGraphMRF.isEmpty()) {
      throw new IllegalArgumentException(
          "Cannot use this mapper of oGraph without a %s".formatted(OperatorGraph.class.getSimpleName()));
    }
    return InvertibleMapper.from(
        (supplier, g) -> () -> {
          @SuppressWarnings("unchecked")
          T t = (T) builder.build((NamedParamMap) map.value("target", ParamMap.Type.NAMED_PARAM_MAP));
          t.brains().forEach(b -> Composed.shallowest(b, OperatorGraph.class)
              .orElseThrow()
              .setParams(g));
          return t;
        },
        supplier -> OperatorGraph.sampleFor(
            optionalOGraphMRF.get().xVarNames(),
            optionalOGraphMRF.get().yVarNames()),
        "oGraphToHomoBrains");
  }

  @SuppressWarnings("unused")
  public static <T extends NumMultiBrained> InvertibleMapper<List<Tree<Element>>, Supplier<T>> srTreeToHomoBrains(
      @Param("target") T target,
      @Param(value = "", injection = Param.Injection.MAP) ParamMap map,
      @Param(value = "", injection = Param.Injection.BUILDER) NamedBuilder<?> builder) {
    checkType(target, Parametrized.class);
    checkIOSizeConsistency(target);
    Optional<TreeBasedMultivariateRealFunction> optionalTreeMRF = Composed.shallowest(
        target.brains().stream().findFirst().orElseThrow(), TreeBasedMultivariateRealFunction.class);
    if (optionalTreeMRF.isEmpty()) {
      throw new IllegalArgumentException("Cannot use this mapper of trees without a %s"
          .formatted(TreeBasedMultivariateRealFunction.class.getSimpleName()));
    }
    return InvertibleMapper.from(
        (supplier, trees) -> () -> {
          @SuppressWarnings("unchecked")
          T t = (T) builder.build((NamedParamMap) map.value("target", ParamMap.Type.NAMED_PARAM_MAP));
          t.brains().forEach(b -> Composed.shallowest(b, TreeBasedMultivariateRealFunction.class)
              .orElseThrow()
              .setParams(trees));
          return t;
        },
        supplier -> TreeBasedMultivariateRealFunction.sampleFor(
            optionalTreeMRF.get().xVarNames(), optionalTreeMRF.get().yVarNames()),
        "srTreeToHomoBrains");
  }
}
