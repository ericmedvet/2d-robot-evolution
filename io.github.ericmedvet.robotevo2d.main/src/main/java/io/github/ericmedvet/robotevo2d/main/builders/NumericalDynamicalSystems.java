package io.github.ericmedvet.robotevo2d.main.builders;

import io.github.ericmedvet.jnb.core.Param;
import io.github.ericmedvet.jsdynsym.core.StatelessSystem;
import io.github.ericmedvet.jsdynsym.core.numerical.ann.MultiLayerPerceptron;
import io.github.ericmedvet.robotevo2d.main.dynamicalsystems.TreeBasedMultivariateFunction;

public class NumericalDynamicalSystems {

  private NumericalDynamicalSystems() {
  }

  @SuppressWarnings("unused")
  public static io.github.ericmedvet.jsdynsym.buildable.builders.NumericalDynamicalSystems.Builder<TreeBasedMultivariateFunction,
      StatelessSystem.State> tbf(
      @Param(value = "activationFunction", dS = "tanh") MultiLayerPerceptron.ActivationFunction activationFunction
  ) {
    return (nOfInputs, nOfOutputs) -> new TreeBasedMultivariateFunction(nOfInputs, nOfOutputs, activationFunction);
  }

}
