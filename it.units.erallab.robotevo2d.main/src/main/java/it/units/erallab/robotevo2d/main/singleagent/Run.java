package it.units.erallab.robotevo2d.main.singleagent;

import it.units.erallab.mrsim2d.builder.Param;
import it.units.erallab.mrsim2d.builder.ParamMap;
import it.units.erallab.mrsim2d.core.engine.Engine;
import it.units.erallab.mrsim2d.core.tasks.Task;
import it.units.malelab.jgea.core.QualityBasedProblem;
import it.units.malelab.jgea.core.listener.Listener;
import it.units.malelab.jgea.core.solver.AbstractPopulationBasedIterativeSolver;
import it.units.malelab.jgea.core.solver.SolverException;
import it.units.malelab.jgea.core.solver.state.POSetPopulationState;

import java.util.Collection;
import java.util.concurrent.ExecutorService;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.random.RandomGenerator;

/**
 * @author "Eric Medvet" on 2022/09/01 for 2d-robot-evolution
 */
public record Run<P extends QualityBasedProblem<S, Q>, G, S, Q>(
    @Param("solver") AbstractPopulationBasedIterativeSolver<? extends POSetPopulationState<G, S, Q>, P, G, S, Q> solver,
    @Param("problem") Function<Function<S, Q>, P> problem,
    @Param("task") Task<S, Q> task,
    @Param("randomGenerator") RandomGenerator randomGenerator,
    @Param(value = "", self = true) ParamMap map
) {

  public Collection<S> run(
      Supplier<Engine> engineSupplier,
      ExecutorService executorService,
      Listener<? super POSetPopulationState<G, S, Q>> listener
  ) throws SolverException {
    return solver.solve(
        problem.apply(s -> task().run(s, engineSupplier.get())),
        randomGenerator,
        executorService,
        listener
    );
  }

}
