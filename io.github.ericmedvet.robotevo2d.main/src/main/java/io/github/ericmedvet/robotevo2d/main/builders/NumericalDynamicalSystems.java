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

import io.github.ericmedvet.jgea.core.representation.NamedMultivariateRealFunction;
import io.github.ericmedvet.jgea.core.representation.graph.numeric.operatorgraph.OperatorGraph;
import io.github.ericmedvet.jgea.core.representation.tree.numeric.TreeBasedMultivariateRealFunction;
import io.github.ericmedvet.jnb.core.Discoverable;
import io.github.ericmedvet.jnb.core.Param;
import io.github.ericmedvet.jsdynsym.core.StatelessSystem;
import io.github.ericmedvet.jsdynsym.core.numerical.NumericalDynamicalSystem;
import io.github.ericmedvet.jsdynsym.core.numerical.ann.MultiLayerPerceptron;
import io.github.ericmedvet.robotevo2d.main.dynamicalsystems.IOSaver;

@Discoverable(prefixTemplate = "evorobots|er.dynamicalSystem|dynSys|ds.numerical|num")
public class NumericalDynamicalSystems {

  private NumericalDynamicalSystems() {}

  @SuppressWarnings("unused")
  public static <S>
      io.github.ericmedvet.jsdynsym.buildable.builders.NumericalDynamicalSystems.Builder<IOSaver<S>, S> ioSaver(
          @Param(value = "initT", dD = 0.0d) double initT,
          @Param(value = "finalT", dD = 30.0d) double finalT,
          @Param("inner")
              io.github.ericmedvet.jsdynsym.buildable.builders.NumericalDynamicalSystems.Builder<
                      ? extends NumericalDynamicalSystem<S>, S>
                  inner,
          @Param("filePath") String filePath) {
    return (xVarNames, yVarNames) -> new IOSaver<>(inner.apply(xVarNames, yVarNames), filePath, initT, finalT);
  }

  @SuppressWarnings("unused")
  public static io.github.ericmedvet.jsdynsym.buildable.builders.NumericalDynamicalSystems.Builder<
          NamedMultivariateRealFunction, StatelessSystem.State>
      oGraphMRF(
          @Param(value = "postOperator", dS = "identity")
              MultiLayerPerceptron.ActivationFunction postOperator) {

    return (xVarNames, yVarNames) ->
        new OperatorGraph(OperatorGraph.sampleFor(xVarNames, yVarNames), xVarNames, yVarNames, postOperator);
  }

  @SuppressWarnings("unused")
  public static io.github.ericmedvet.jsdynsym.buildable.builders.NumericalDynamicalSystems.Builder<
          NamedMultivariateRealFunction, StatelessSystem.State>
      treeMRF(
          @Param(value = "postOperator", dS = "identity")
              MultiLayerPerceptron.ActivationFunction postOperator) {
    return (xVarNames, yVarNames) -> new TreeBasedMultivariateRealFunction(
        TreeBasedMultivariateRealFunction.sampleFor(xVarNames, yVarNames), xVarNames, yVarNames, postOperator);
  }
}
