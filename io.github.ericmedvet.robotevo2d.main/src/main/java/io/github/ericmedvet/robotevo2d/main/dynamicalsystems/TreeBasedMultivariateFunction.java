package io.github.ericmedvet.robotevo2d.main.dynamicalsystems;

import io.github.ericmedvet.jgea.core.representation.tree.Tree;
import io.github.ericmedvet.jgea.problem.symbolicregression.Element;
import io.github.ericmedvet.jgea.problem.symbolicregression.TreeBasedRealFunction;
import io.github.ericmedvet.jsdynsym.core.Parametrized;
import io.github.ericmedvet.jsdynsym.core.numerical.NumericalTimeInvariantStatelessSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class TreeBasedMultivariateFunction
    implements NumericalTimeInvariantStatelessSystem, Parametrized<List<Tree<Element>>> {

  private final List<TreeBasedRealFunction> functions;
  private final int nOfInputs;
  private final int nOfOutputs;

  public TreeBasedMultivariateFunction(int nOfInputs, int nOfOutputs) {
    this.nOfInputs = nOfInputs;
    this.nOfOutputs = nOfOutputs;
    functions = new ArrayList<>(nOfOutputs);
    String[] varNames = IntStream.range(0, nOfOutputs).mapToObj("x%d"::formatted).toArray(String[]::new);
    for (int i = 0; i < nOfOutputs; i = i + 1) {
      functions.add(new TreeBasedRealFunction(
          Tree.of(new Element.Constant(0d)),
          varNames
      ));
    }
  }

  @Override
  public List<Tree<Element>> getParams() {
    return functions.stream().map(TreeBasedRealFunction::getNode).toList();
  }

  @Override
  public void setParams(List<Tree<Element>> trees) {
    functions = IntStream.range(0, trees.size())
        .mapToObj(i -> new TreeBasedRealFunction(trees.get(i), functions.get(i).getVarNames()))
        .toList();
  }

  @Override
  public int nOfInputs() {
    return functions.get(0).getVarNames().length;
  }

  @Override
  public int nOfOutputs() {
    return functions.size();
  }

  @Override
  public double[] step(double[] doubles) {
    return functions.stream().mapToDouble(f -> Math.tanh(f.apply(doubles))).toArray();
  }

}
