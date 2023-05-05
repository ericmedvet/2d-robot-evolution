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

package io.github.ericmedvet.robotevo2d.main.builders;

import io.github.ericmedvet.jgea.core.representation.graph.Graph;
import io.github.ericmedvet.jgea.core.representation.graph.Node;
import io.github.ericmedvet.jgea.core.representation.graph.numeric.operatorgraph.OperatorGraph;
import io.github.ericmedvet.jgea.core.representation.tree.Tree;
import io.github.ericmedvet.jgea.core.representation.tree.numeric.Element;
import io.github.ericmedvet.jgea.core.representation.tree.numeric.TreeBasedMultivariateRealFunction;
import io.github.ericmedvet.jgea.experimenter.InvertibleMapper;
import io.github.ericmedvet.jnb.core.NamedBuilder;
import io.github.ericmedvet.jnb.core.Param;
import io.github.ericmedvet.jnb.core.ParamMap;
import io.github.ericmedvet.jsdynsym.core.NumericalParametrized;
import io.github.ericmedvet.jsdynsym.core.Parametrized;
import io.github.ericmedvet.jsdynsym.core.composed.Composed;
import io.github.ericmedvet.jsdynsym.core.numerical.NumericalDynamicalSystem;
import io.github.ericmedvet.mrsim2d.core.NumMultiBrained;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

public class Mappers {
  private Mappers() {
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
      throw new IllegalArgumentException("Not all of the %d brains has the same input size: %s sizes found".formatted(
          numMultiBrained.brains().size(),
          inSizes
      ));
    }
    if (outSizes.size() != 1) {
      throw new IllegalArgumentException("Not all of the %d brains has the same output size: %s sizes found".formatted(
          numMultiBrained.brains().size(),
          outSizes
      ));
    }
  }

  private static void checkNumericalParametrizedSizeConsistency(NumMultiBrained numMultiBrained) {
    List<Integer> brainSizes = numMultiBrained.brains().stream()
        .map(b -> Composed.shallowest(b, NumericalParametrized.class).orElseThrow().getParams().length)
        .distinct()
        .toList();
    if (brainSizes.size() != 1) {
      throw new IllegalArgumentException("Not all of the %d brains has the same output size: %s sizes found".formatted(
          numMultiBrained.brains().size(),
          brainSizes
      ));
    }
  }

  private static <T> void checkType(NumMultiBrained numMultiBrained, Class<T> clazz) {
    for (NumericalDynamicalSystem<?> nds : numMultiBrained.brains()) {
      if (Composed.shallowest(nds, clazz).isEmpty()) {
        throw new IllegalArgumentException("Some of the %d brains is not a %s".formatted(
            numMultiBrained.brains().size(),
            clazz.getSimpleName()
        ));
      }
    }
  }

  @SuppressWarnings("unused")
  public static <T extends NumMultiBrained> InvertibleMapper<List<Double>, Supplier<T>> numericalParametrizedHeteroBrains(
      @Param("target") T target,
      @Param(value = "", injection = Param.Injection.MAP) ParamMap map,
      @Param(value = "", injection = Param.Injection.BUILDER) NamedBuilder<?> builder
  ) {
    checkType(target, NumericalParametrized.class);
    List<Integer> brainSizes = target.brains().stream()
        .map(b -> Composed.shallowest(b, NumericalParametrized.class).orElseThrow().getParams().length)
        .toList();
    int overallBrainSize = brainSizes.stream().mapToInt(i -> i).sum();
    return InvertibleMapper.from(
        values -> {
          if (values.size() != overallBrainSize) {
            throw new IllegalArgumentException("Wrong number of params: %d expected, %d found".formatted(
                overallBrainSize,
                values.size()
            ));
          }
          return () -> {
            @SuppressWarnings("unchecked") T t = (T) builder.build(map.npm("target"));
            int c = 0;
            for (NumericalDynamicalSystem<?> brain : t.brains()) {
              int brainSize = Composed.shallowest(brain, NumericalParametrized.class).orElseThrow().getParams().length;
              Composed.shallowest(brain, NumericalParametrized.class)
                  .orElseThrow()
                  .setParams(values.subList(c, c + brainSize).stream().mapToDouble(d -> d).toArray());
              c = c + brainSize;
            }
            return t;
          };
        },
        Collections.nCopies(overallBrainSize, 0d)
    );
  }

  @SuppressWarnings("unused")
  public static <T extends NumMultiBrained> InvertibleMapper<List<Double>, Supplier<T>> numericalParametrizedHomoBrains(
      @Param("target") T target,
      @Param(value = "", injection = Param.Injection.MAP) ParamMap map,
      @Param(value = "", injection = Param.Injection.BUILDER) NamedBuilder<?> builder
  ) {
    checkType(target, NumericalParametrized.class);
    checkIOSizeConsistency(target);
    checkNumericalParametrizedSizeConsistency(target);
    int brainSize = target.brains().stream()
        .map(b -> Composed.shallowest(b, NumericalParametrized.class).orElseThrow().getParams().length)
        .findFirst().orElseThrow();
    return InvertibleMapper.from(
        values -> {
          if (values.size() != brainSize) {
            throw new IllegalArgumentException("Wrong number of params: %d expected, %d found".formatted(
                brainSize,
                values.size()
            ));
          }
          return () -> {
            @SuppressWarnings("unchecked") T t = (T) builder.build(map.npm("target"));
            t.brains()
                .forEach(b -> Composed.shallowest(b, NumericalParametrized.class)
                    .orElseThrow()
                    .setParams(values.stream().mapToDouble(d -> d).toArray()));
            return t;
          };
        },
        Collections.nCopies(brainSize, 0d)
    );
  }

  @SuppressWarnings("unused")
  public static <T extends NumMultiBrained> InvertibleMapper<List<Tree<Element>>, Supplier<T>> treeParametrizedHomoBrains(
      @Param("target") T target,
      @Param(value = "", injection = Param.Injection.MAP) ParamMap map,
      @Param(value = "", injection = Param.Injection.BUILDER) NamedBuilder<?> builder
  ) {
    checkType(target, Parametrized.class);
    checkIOSizeConsistency(target);
    Optional<TreeBasedMultivariateRealFunction> optionalTreeMRF = Composed.shallowest(
        target.brains().stream().findFirst().orElseThrow(),
        TreeBasedMultivariateRealFunction.class
    );
    if (optionalTreeMRF.isEmpty()) {
      throw new IllegalArgumentException("Cannot use this mapper of trees without a %s".formatted(
          TreeBasedMultivariateRealFunction.class.getSimpleName()));
    }
    return InvertibleMapper.from(
        trees -> () -> {
          @SuppressWarnings("unchecked") T t = (T) builder.build(map.npm("target"));
          t.brains()
              .forEach(b -> Composed.shallowest(b, TreeBasedMultivariateRealFunction.class)
                  .orElseThrow()
                  .setParams(trees));
          return t;
        },
        TreeBasedMultivariateRealFunction.sampleFor(optionalTreeMRF.get().xVarNames(), optionalTreeMRF.get().yVarNames())
    );
  }

  @SuppressWarnings("unused")
  public static <T extends NumMultiBrained> InvertibleMapper<Graph<Node, OperatorGraph.NonValuedArc>, Supplier<T>> oGraphParametrizedHomoBrains(
      @Param("target") T target,
      @Param(value = "", injection = Param.Injection.MAP) ParamMap map,
      @Param(value = "", injection = Param.Injection.BUILDER) NamedBuilder<?> builder
  ) {
    checkType(target, Parametrized.class);
    checkIOSizeConsistency(target);
    Optional<OperatorGraph> optionalOGraphMRF = Composed.shallowest(
        target.brains().stream().findFirst().orElseThrow(),
        OperatorGraph.class
    );
    if (optionalOGraphMRF.isEmpty()) {
      throw new IllegalArgumentException("Cannot use this mapper of oGraph without a %s".formatted(
          OperatorGraph.class.getSimpleName()));
    }
    return InvertibleMapper.from(
        g -> () -> {
          @SuppressWarnings("unchecked") T t = (T) builder.build(map.npm("target"));
          t.brains()
              .forEach(b -> Composed.shallowest(b, OperatorGraph.class)
                  .orElseThrow()
                  .setParams(g));
          return t;
        },
        OperatorGraph.sampleFor(optionalOGraphMRF.get().xVarNames(), optionalOGraphMRF.get().yVarNames())
    );
  }

}
