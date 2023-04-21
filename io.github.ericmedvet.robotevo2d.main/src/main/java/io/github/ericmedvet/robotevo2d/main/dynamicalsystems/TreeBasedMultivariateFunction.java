package io.github.ericmedvet.robotevo2d.main.dynamicalsystems;

import io.github.ericmedvet.jgea.core.representation.tree.Tree;
import io.github.ericmedvet.jgea.problem.symbolicregression.Element;
import io.github.ericmedvet.jgea.problem.symbolicregression.TreeBasedRealFunction;
import io.github.ericmedvet.jsdynsym.core.Parametrized;
import io.github.ericmedvet.jsdynsym.core.numerical.NumericalTimeInvariantStatelessSystem;
import io.github.ericmedvet.jsdynsym.core.numerical.ann.MultiLayerPerceptron;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class TreeBasedMultivariateFunction
    implements NumericalTimeInvariantStatelessSystem, Parametrized<List<Tree<Element>>> {

  private final List<TreeBasedRealFunction> functions;
  private final int nOfInputs;
  private final int nOfOutputs;
  private final MultiLayerPerceptron.ActivationFunction activationFunction;

  public TreeBasedMultivariateFunction(
      int nOfInputs,
      int nOfOutputs,
      MultiLayerPerceptron.ActivationFunction activationFunction
  ) {
    this.nOfInputs = nOfInputs;
    this.nOfOutputs = nOfOutputs;
    this.activationFunction = activationFunction;
    functions = new ArrayList<>(nOfOutputs);
    String[] varNames = varNames(nOfOutputs);
    for (int i = 0; i < nOfOutputs; i = i + 1) {
      functions.add(new TreeBasedRealFunction(
          Tree.of(new Element.Constant(0d)),
          varNames
      ));
    }
  }

  public static String[] varNames(int nOfOutputs) {
    return IntStream.range(0, nOfOutputs).mapToObj(i -> "x%d".formatted(i + 1)).toArray(String[]::new);
  }

  @Override
  public List<Tree<Element>> getParams() {
    return functions.stream().map(TreeBasedRealFunction::getNode).toList();
  }

  @Override
  public int nOfInputs() {
    return nOfInputs;
  }

  @Override
  public int nOfOutputs() {
    return nOfOutputs;
  }

  @Override
  public void setParams(List<Tree<Element>> trees) {
    if (trees.size() != nOfOutputs) {
      throw new IllegalArgumentException("Wrong number of trees: %d expected, %d found".formatted(
          nOfOutputs,
          trees.size()
      ));
    }
    String[] varNames = varNames(nOfInputs);
    for (int i = 0; i < nOfOutputs; i = i + 1) {
      functions.set(i, new TreeBasedRealFunction(trees.get(i), varNames));
    }
  }

  @Override
  public double[] step(double[] values) {
    if (values.length != nOfInputs) {
      throw new IllegalArgumentException("Wrong input size: %d expected, %d found".formatted(
          nOfInputs,
          values.length
      ));
    }
    return functions.stream().mapToDouble(f -> activationFunction.applyAsDouble(f.apply(values))).toArray();
  }

}
