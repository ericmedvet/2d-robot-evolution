package io.github.ericmedvet.robotevo2d.main.builders;

import io.github.ericmedvet.jnb.core.Param;
import io.github.ericmedvet.jsdynsym.core.StatelessSystem;
import io.github.ericmedvet.jsdynsym.core.numerical.NumericalDynamicalSystem;
import io.github.ericmedvet.jsdynsym.core.numerical.ann.MultiLayerPerceptron;
import io.github.ericmedvet.robotevo2d.main.dynamicalsystems.IOSaver;
import io.github.ericmedvet.robotevo2d.main.dynamicalsystems.TreeBasedMultivariateFunction;

public class NumericalDynamicalSystems {

  private NumericalDynamicalSystems() {
  }

  @SuppressWarnings("unused")
  public static <S> io.github.ericmedvet.jsdynsym.buildable.builders.NumericalDynamicalSystems.Builder<IOSaver<S>, S> ioSaver(
      @Param(value = "initT", dD = 0.0d) double initT,
      @Param(value = "finalT", dD = 30.0d) double finalT,
      @Param("inner") io.github.ericmedvet.jsdynsym.buildable.builders.NumericalDynamicalSystems.Builder<?
          extends NumericalDynamicalSystem<S>, S> inner,
      @Param("filePath") String filePath
  ) {
    return (nOfInputs, nOfOutputs) -> new IOSaver<>(
        inner.apply(nOfInputs, nOfOutputs),
        filePath,
        initT,
        finalT
    );
  }

  @SuppressWarnings("unused")
  public static io.github.ericmedvet.jsdynsym.buildable.builders.NumericalDynamicalSystems.Builder<TreeBasedMultivariateFunction,
      StatelessSystem.State> tbf(
      @Param(value = "activationFunction", dS = "tanh") MultiLayerPerceptron.ActivationFunction activationFunction
  ) {
    return (nOfInputs, nOfOutputs) -> new TreeBasedMultivariateFunction(nOfInputs, nOfOutputs, activationFunction);
  }


}
