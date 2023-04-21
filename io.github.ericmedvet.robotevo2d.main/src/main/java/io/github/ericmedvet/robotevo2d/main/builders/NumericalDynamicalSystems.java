package io.github.ericmedvet.robotevo2d.main.builders;

import io.github.ericmedvet.jgea.problem.symbolicregression.TreeBasedRealFunction;
import io.github.ericmedvet.jsdynsym.core.StatelessSystem;
import io.github.ericmedvet.robotevo2d.main.dynamicalsystems.TreeBasedMultivariateFunction;

import java.util.stream.IntStream;

public class NumericalDynamicalSystems {

  private NumericalDynamicalSystems() {
  }

  @SuppressWarnings("unused")
  public static io.github.ericmedvet.jsdynsym.buildable.builders.NumericalDynamicalSystems.Builder<TreeBasedMultivariateFunction,
      StatelessSystem.State> tbf(
  ) {
    return (nOfInputs, nOfOutputs) -> {
      String[] varNames = IntStream.range(0, nOfInputs).mapToObj(i -> String.format("x%d", i)).toArray(String[]::new);
      return new TreeBasedMultivariateFunction(IntStream.range(0, nOfOutputs).mapToObj(i -> new TreeBasedRealFunction(null, varNames)).toList());
    };
  }

}
