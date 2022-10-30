package it.units.erallab.robotevo2d.main.builder;

import it.units.erallab.mrsim2d.builder.NamedParamMap;
import it.units.erallab.mrsim2d.builder.Param;
import it.units.erallab.mrsim2d.builder.ParamMap;
import it.units.malelab.jgea.core.listener.CSVPrinter;
import it.units.malelab.jgea.core.listener.NamedFunction;
import it.units.malelab.jgea.core.solver.Individual;
import it.units.malelab.jgea.core.solver.state.POSetPopulationState;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

import static it.units.malelab.jgea.core.listener.NamedFunctions.*;

public class ListenerBuilder {

  private final static List<NamedFunction<? super POSetPopulationState<?, ?, ?>, ?>> BASIC_FUNCTIONS = List.of(
      iterations(),
      births(),
      fitnessEvaluations(),
      elapsedSeconds()
  );

  private ListenerBuilder() {
  }

  public static <G, S, Q> Function<NamedFunction<? super Q, Double>, CSVPrinter<? super POSetPopulationState<G, S, Q>, ParamMap>> csvPrinter(
      @Param("filePath") String filePath,
      @Param("popFunctions") List<NamedFunction<? super POSetPopulationState<? extends G, ? extends S, ? extends Q>, ?>> popFunctions,
      @Param("bestFunctions") List<NamedFunction<? super Individual<? extends G, ? extends S, ? extends Q>, ?>> bestFunctions,
      @Param("runKeys") List<String> runKeys
  ) {
    NamedFunction<POSetPopulationState<? extends G, ? extends S, ? extends Q>, Individual<? extends G, ? extends S, ? extends Q>> best = best();
    List<NamedFunction<? super POSetPopulationState<? extends G, ? extends S, ? extends Q>, ?>> functions = new ArrayList<>(
        BASIC_FUNCTIONS);
    functions.addAll(popFunctions);
    functions.addAll(best.then(bestFunctions));
    List<NamedFunction<? super ParamMap, ?>> paramMapFunctions = Collections.unmodifiableList(runKeys.stream()
        .map(k -> NamedFunction.build(
            k,
            "%s",
            (ParamMap m) -> getKeyFromParamMap(m, Arrays.stream(k.split("\\.")).toList())
        ))
        .toList());
    return qFunction -> {
      functions.add(best.then(fitness()).then(qFunction));
      return new CSVPrinter<POSetPopulationState<G, S, Q>, ParamMap>(
          Collections.unmodifiableList(functions),
          paramMapFunctions,
          new File(filePath)
      );
    };
  }

  private static Object getKeyFromParamMap(ParamMap paramMap, List<String> keyPieces) {
    if (keyPieces.size() == 1) {
      return paramMap.value(keyPieces.get(0));
    }
    NamedParamMap namedParamMap = paramMap.npm(keyPieces.get(0));
    if (namedParamMap == null) {
      return null;
    }
    return getKeyFromParamMap(namedParamMap, keyPieces.subList(1, keyPieces.size()));
  }
}
