package io.github.ericmedvet.robotevo2d.main.builders;

import io.github.ericmedvet.jgea.core.IndependentFactory;
import io.github.ericmedvet.jgea.core.QualityBasedProblem;
import io.github.ericmedvet.jgea.core.operator.Crossover;
import io.github.ericmedvet.jgea.core.operator.GeneticOperator;
import io.github.ericmedvet.jgea.core.operator.Mutation;
import io.github.ericmedvet.jgea.core.representation.sequence.FixedLengthListFactory;
import io.github.ericmedvet.jgea.core.representation.tree.*;
import io.github.ericmedvet.jgea.core.selector.Last;
import io.github.ericmedvet.jgea.core.selector.Tournament;
import io.github.ericmedvet.jgea.core.solver.StandardEvolver;
import io.github.ericmedvet.jgea.core.solver.StandardWithEnforcedDiversityEvolver;
import io.github.ericmedvet.jgea.core.solver.StopConditions;
import io.github.ericmedvet.jgea.core.solver.state.POSetPopulationState;
import io.github.ericmedvet.jgea.experimenter.InvertibleMapper;
import io.github.ericmedvet.jgea.problem.symbolicregression.Element;
import io.github.ericmedvet.jnb.core.Param;
import io.github.ericmedvet.robotevo2d.main.dynamicalsystems.TreeBasedMultivariateFunction;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class Solvers {

  private Solvers() {
  }

  @SuppressWarnings("unused")
  public static <S, Q> StandardEvolver<POSetPopulationState<List<Tree<Element>>, S, Q>, QualityBasedProblem<S, Q>,
      List<Tree<Element>>, S, Q> listGP(
      @Param(value = "mapper") InvertibleMapper<List<Tree<Element>>, S> mapper,
      @Param(value = "minConst", dD = 0d) double minConst,
      @Param(value = "maxConst", dD = 5d) double maxConst,
      @Param(value = "nConst", dI = 10) int nConst,
      @Param(value = "operators", dSs = {
          "addition",
          "subtraction",
          "multiplication",
          "prot_division"
      }) List<Element.Operator> operators,
      @Param(value = "minTreeH", dI = 3) int minTreeH,
      @Param(value = "maxTreeH", dI = 8) int maxTreeH,
      @Param(value = "crossoverP", dD = 0.8d) double crossoverP,
      @Param(value = "tournamentRate", dD = 0.05d) double tournamentRate,
      @Param(value = "minNTournament", dI = 3) int minNTournament,
      @Param(value = "nPop", dI = 100) int nPop,
      @Param(value = "nEval") int nEval,
      @Param(value = "diversity") boolean diversity,
      @Param(value = "remap") boolean remap
  ) {
    int maxVariableIndex = mapper.exampleInput().stream()
        .mapToInt(t -> t.visitDepth().stream()
            .filter(e -> e instanceof Element.Variable)
            .map(e -> ((Element.Variable) e).name())
            .mapToInt(n -> Integer.parseInt(n.substring(1)))
            .max()
            .orElse(0)
        )
        .max()
        .orElse(0);
    Element.Variable[] variables = Arrays.stream(TreeBasedMultivariateFunction.varNames(maxVariableIndex))
        .map(Element.Variable::new)
        .toArray(Element.Variable[]::new);
    double constStep = (maxConst - minConst) / nConst;
    Element.Constant[] constants = DoubleStream.iterate(minConst, d -> d + constStep)
        .limit(nConst)
        .mapToObj(Element.Constant::new)
        .toArray(Element.Constant[]::new);

    Element[] terminals = new Element[constants.length + variables.length];
    int counter = 0;
    for (Element.Constant constant : constants) {
      terminals[counter] = constant;
      counter++;
    }
    for (Element.Variable variable : variables) {
      terminals[counter] = variable;
      counter++;
    }
    IndependentFactory<Element> terminalFactory = IndependentFactory.picker(terminals);
    IndependentFactory<Element> nonTerminalFactory = IndependentFactory.picker(operators.toArray(Element.Operator[]::new));
    IndependentFactory<List<Tree<Element>>> treeListFactory = new FixedLengthListFactory<>(
        mapper.exampleInput().size(),
        new RampedHalfAndHalf<>(minTreeH, maxTreeH, x -> 2, nonTerminalFactory, terminalFactory).independent()
    );
    // single tree factory
    TreeBuilder<Element> treeBuilder = new GrowTreeBuilder<>(x -> 2, nonTerminalFactory, terminalFactory);
    // subtree between same position trees
    SubtreeCrossover<Element> subtreeCrossover = new SubtreeCrossover<>(maxTreeH);
    Crossover<List<Tree<Element>>> pairWiseSubtreeCrossover = (list1, list2, rnd) ->
        IntStream.range(0, list1.size())
            .mapToObj(i -> subtreeCrossover.recombine(list1.get(i), list2.get(i), rnd))
            .toList();
    // swap trees
    Crossover<List<Tree<Element>>> uniformCrossover = (list1, list2, rnd) -> IntStream.range(0, list1.size())
        .mapToObj(i -> rnd.nextDouble() < 0.5 ? list1.get(i) : list2.get(i)).toList();
    // subtree mutation
    SubtreeMutation<Element> subtreeMutation = new SubtreeMutation<>(maxTreeH, treeBuilder);
    Mutation<List<Tree<Element>>> allSubtreeMutations = (list, rnd) -> list.stream()
        .map(t -> subtreeMutation.mutate(t, rnd))
        .toList();
    Map<GeneticOperator<List<Tree<Element>>>, Double> geneticOperators = Map.ofEntries(
        Map.entry(pairWiseSubtreeCrossover, crossoverP / 2d),
        Map.entry(uniformCrossover, crossoverP / 2d),
        Map.entry(allSubtreeMutations, 1d - crossoverP)
    );
    if (!diversity) {
      return new StandardEvolver<>(
          mapper,
          treeListFactory,
          nPop,
          StopConditions.nOfFitnessEvaluations(nEval),
          geneticOperators,
          new Tournament(Math.max(minNTournament, (int) Math.ceil((double) nPop * tournamentRate))),
          new Last(),
          nPop,
          true,
          remap,
          (p, r) -> new POSetPopulationState<>()
      );
    } else {
      return new StandardWithEnforcedDiversityEvolver<>(
          mapper,
          treeListFactory,
          nPop,
          StopConditions.nOfFitnessEvaluations(nEval),
          geneticOperators,
          new Tournament(Math.max(minNTournament, (int) Math.ceil((double) nPop * tournamentRate))),
          new Last(),
          nPop,
          true,
          remap,
          (p, r) -> new POSetPopulationState<>(),
          100
      );
    }
  }

}
