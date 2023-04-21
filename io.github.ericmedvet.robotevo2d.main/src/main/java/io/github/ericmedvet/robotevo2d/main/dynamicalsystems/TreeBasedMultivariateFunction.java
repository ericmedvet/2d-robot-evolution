package io.github.ericmedvet.robotevo2d.main.dynamicalsystems;

import io.github.ericmedvet.jgea.core.representation.tree.Tree;
import io.github.ericmedvet.jgea.problem.symbolicregression.Element;
import io.github.ericmedvet.jgea.problem.symbolicregression.TreeBasedRealFunction;
import io.github.ericmedvet.jsdynsym.core.Parametrized;
import io.github.ericmedvet.jsdynsym.core.numerical.NumericalTimeInvariantStatelessSystem;

import java.util.List;
import java.util.stream.IntStream;

public class TreeBasedMultivariateFunction
    implements NumericalTimeInvariantStatelessSystem, Parametrized<List<Tree<Element>>> {

  private List<TreeBasedRealFunction> treeBasedRealFunctions;

  public TreeBasedMultivariateFunction(List<TreeBasedRealFunction> treeBasedRealFunctions) {
    this.treeBasedRealFunctions = treeBasedRealFunctions;
  }

  @Override
  public List<Tree<Element>> getParams() {
    return treeBasedRealFunctions.stream().map(TreeBasedRealFunction::getNode).toList();
  }

  @Override
  public void setParams(List<Tree<Element>> trees) {
    treeBasedRealFunctions = IntStream.range(0, trees.size())
        .mapToObj(i -> new TreeBasedRealFunction(trees.get(i), treeBasedRealFunctions.get(i).getVarNames()))
        .toList();
  }

  @Override
  public int nOfInputs() {
    return treeBasedRealFunctions.get(0).getVarNames().length;
  }

  @Override
  public int nOfOutputs() {
    return treeBasedRealFunctions.size();
  }

  @Override
  public double[] step(double[] doubles) {
    return treeBasedRealFunctions.stream().mapToDouble(f -> Math.tanh(f.apply(doubles))).toArray();
  }

}
