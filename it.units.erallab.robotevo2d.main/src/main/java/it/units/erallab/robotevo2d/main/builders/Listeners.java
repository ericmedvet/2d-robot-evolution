package it.units.erallab.robotevo2d.main.builders;

import io.github.ericmedvet.jgea.core.listener.AccumulatorFactory;
import io.github.ericmedvet.jgea.core.listener.ListenerFactory;
import io.github.ericmedvet.jgea.core.solver.state.POSetPopulationState;
import io.github.ericmedvet.jgea.experimenter.Experiment;
import io.github.ericmedvet.jgea.experimenter.Run;
import io.github.ericmedvet.jnb.core.Param;

import java.io.File;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.function.BiFunction;

public class Listeners {

  private Listeners() {
  }

  @SuppressWarnings("unused")
  public static <A> BiFunction<Experiment, ExecutorService, ListenerFactory<POSetPopulationState<?, A, ?>, Run<?, ?, A, ?>>> videoSaver(
          @Param("videos") List<AccumulatorFactory<POSetPopulationState<?, A, ?>, File, Run<?, ?, A, ?>>> accumulators
  ) {
    return (experiment, executorService) -> ListenerFactory
        .all(accumulators.stream().map(AccumulatorFactory::withAutoGet).toList())
        .deferred(executorService);
  }

}
