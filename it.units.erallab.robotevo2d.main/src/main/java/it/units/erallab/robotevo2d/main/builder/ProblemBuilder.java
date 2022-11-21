package it.units.erallab.robotevo2d.main.builder;

import it.units.erallab.mrsim2d.builder.Param;
import it.units.malelab.jgea.core.TotalOrderQualityBasedProblem;

import java.util.Comparator;
import java.util.function.Function;

/**
 * @author "Eric Medvet" on 2022/11/21 for 2d-robot-evolution
 */
public class ProblemBuilder {

  private ProblemBuilder() {
  }

  public static <S,Q, C extends Comparable<C>> Function<Function<S,Q>, TotalOrderQualityBasedProblem<S,Q>> totalOrder(
      @Param("cqExtractor") Function<Q, C> cqExtrator
  ) {
    return qFunction -> new TotalOrderQualityBasedProblem<>() {
      @Override
      public Function<S, Q> qualityFunction() {
        return qFunction;
      }

      @Override
      public Comparator<Q> totalOrderComparator() {
        return Comparator.comparing(cqExtrator);
      }
    };
  }
}
