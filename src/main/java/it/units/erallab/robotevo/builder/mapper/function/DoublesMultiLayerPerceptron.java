/*
 * Copyright 2022 Eric Medvet <eric.medvet@gmail.com> (as eric)
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

package it.units.erallab.robotevo.builder.mapper.function;

import it.units.erallab.mrsim.functions.MultiLayerPerceptron;
import it.units.erallab.mrsim.functions.TimedRealFunction;
import it.units.erallab.mrsim.util.builder.Param;
import it.units.erallab.robotevo.builder.MapperBuilder;

import java.util.Collections;
import java.util.List;
import java.util.function.Function;

/**
 * @author "Eric Medvet" on 2022/08/11 for 2d-robot-evolution
 */
public class DoublesMultiLayerPerceptron implements MapperBuilder<List<Double>, TimedRealFunction> {

  private final double innerLayerRatio;
  private final int nOfInnerLayers;
  private final MultiLayerPerceptron.ActivationFunction activationFunction;

  public DoublesMultiLayerPerceptron(
      @Param(value = "innerLayerRatio", dD = 0.65) double innerLayerRatio,
      @Param(value = "nOfInnerLayers", dI = 1) int nOfInnerLayers,
      @Param(value = "activationFunction", dS = "tanh") String activationFunction
  ) {
    this.innerLayerRatio = innerLayerRatio;
    this.nOfInnerLayers = nOfInnerLayers;
    this.activationFunction = MultiLayerPerceptron.ActivationFunction.valueOf(activationFunction);
  }

  protected static int[] innerNeurons(int nOfInputs, int nOfOutputs, double innerLayerRatio, int nOfInnerLayers) {
    int[] innerNeurons = new int[nOfInnerLayers];
    int centerSize = (int) Math.max(2, Math.round(nOfInputs * innerLayerRatio));
    if (nOfInnerLayers > 1) {
      for (int i = 0; i < nOfInnerLayers / 2; i++) {
        innerNeurons[i] = nOfInputs + (centerSize - nOfInputs) / (nOfInnerLayers / 2 + 1) * (i + 1);
      }
      for (int i = nOfInnerLayers / 2; i < nOfInnerLayers; i++) {
        innerNeurons[i] = centerSize + (nOfOutputs - centerSize) / (nOfInnerLayers / 2 + 1) * (i - nOfInnerLayers / 2);
      }
    } else if (nOfInnerLayers > 0) {
      innerNeurons[0] = centerSize;
    }
    return innerNeurons;
  }

  @Override
  public Function<List<Double>, TimedRealFunction> buildFor(TimedRealFunction trf) {
    return values -> {
      int nOfInputs = trf.nOfInputs();
      int nOfOutputs = trf.nOfOutputs();
      int[] innerNeurons = innerNeurons(nOfInputs, nOfOutputs, innerLayerRatio, nOfInnerLayers);
      int nOfWeights = MultiLayerPerceptron.countWeights(nOfInputs, innerNeurons, nOfOutputs);
      if (nOfWeights != values.size()) {
        throw new IllegalArgumentException(String.format(
            "Wrong number of values for weights: %d expected, %d found",
            nOfWeights,
            values.size()
        ));
      }
      return new MultiLayerPerceptron(
          activationFunction,
          nOfInputs,
          innerNeurons,
          nOfOutputs,
          values.stream().mapToDouble(d -> d).toArray()
      );
    };
  }

  @Override
  public List<Double> exampleFor(TimedRealFunction trf) {
    int nOfInputs = trf.nOfInputs();
    int nOfOutputs = trf.nOfOutputs();
    int[] innerNeurons = innerNeurons(nOfInputs, nOfOutputs, innerLayerRatio, nOfInnerLayers);
    return Collections.nCopies(MultiLayerPerceptron.countWeights(nOfInputs, innerNeurons, nOfOutputs), 0d);
  }

}
