package io.github.ericmedvet.robotevo2d.main.builders;

import io.github.ericmedvet.jgea.core.representation.tree.Tree;
import io.github.ericmedvet.jgea.problem.symbolicregression.Element;
import io.github.ericmedvet.jgea.problem.symbolicregression.TreeBasedRealFunction;
import io.github.ericmedvet.jsdynsym.core.Parametrized;
import io.github.ericmedvet.jsdynsym.core.StatelessSystem;
import io.github.ericmedvet.jsdynsym.core.numerical.NumericalTimeInvariantStatelessSystem;

import java.util.List;
import java.util.stream.IntStream;

public class NumericalDynamicalSystems {

  private NumericalDynamicalSystems() {
  }

  public static class ReplaceableTreeBasedNumericalTimeInvariantStatelessSystem
      implements NumericalTimeInvariantStatelessSystem, Parametrized<List<Tree<Element>>> {

    private List<TreeBasedRealFunction> treeBasedRealFunctions;

    public ReplaceableTreeBasedNumericalTimeInvariantStatelessSystem(List<TreeBasedRealFunction> treeBasedRealFunctions) {
      this.treeBasedRealFunctions = treeBasedRealFunctions;
    }

    @Override
    public double[] step(double[] doubles) {
      return treeBasedRealFunctions.stream().mapToDouble(f -> Math.tanh(f.apply(doubles))).toArray();
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
    public List<Tree<Element>> getParams() {
      return treeBasedRealFunctions.stream().map(TreeBasedRealFunction::getNode).toList();
    }

    @Override
    public void setParams(List<Tree<Element>> trees) {
      treeBasedRealFunctions = IntStream.range(0, trees.size()).mapToObj(i -> new TreeBasedRealFunction(trees.get(i), treeBasedRealFunctions.get(i).getVarNames())).toList();
    }

  }

  @SuppressWarnings("unused")
  public static io.github.ericmedvet.jsdynsym.buildable.builders.NumericalDynamicalSystems.Builder<ReplaceableTreeBasedNumericalTimeInvariantStatelessSystem,
      StatelessSystem.State> tbf(
  ) {
    return (nOfInputs, nOfOutputs) -> {
      String[] varNames = IntStream.range(0, nOfInputs).mapToObj(i -> String.format("x%d", i)).toArray(String[]::new);
      return new ReplaceableTreeBasedNumericalTimeInvariantStatelessSystem(IntStream.range(0, nOfOutputs).mapToObj(i -> new TreeBasedRealFunction(null, varNames)).toList());
    };
  }

}
