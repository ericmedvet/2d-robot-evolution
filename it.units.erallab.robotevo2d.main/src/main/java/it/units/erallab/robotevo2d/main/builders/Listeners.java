package it.units.erallab.robotevo2d.main.builders;

import it.units.malelab.jgea.core.listener.AccumulatorFactory;
import it.units.malelab.jgea.core.listener.ListenerFactory;
import it.units.malelab.jgea.core.solver.state.POSetPopulationState;
import it.units.malelab.jgea.experimenter.Experiment;
import it.units.malelab.jgea.experimenter.Run;
import it.units.malelab.jnb.core.Param;

import java.io.File;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.function.BiFunction;

public class Listeners {

  private Listeners() {
  }

  @SuppressWarnings("unused")
  public static <A> BiFunction<Experiment, ExecutorService, ListenerFactory<POSetPopulationState<?, A, ?>, Run<?, ?, A, ?>>> videoSaver(
          @Param("videos")List<AccumulatorFactory<POSetPopulationState<?, A, ?>, File, Run<?, ?, A, ?>>> accumulators
  ) {
    return (experiment, executorService) -> ListenerFactory
        .all(accumulators.stream().map(AccumulatorFactory::withAutoGet).toList())
        .deferred(executorService);
  }

}
