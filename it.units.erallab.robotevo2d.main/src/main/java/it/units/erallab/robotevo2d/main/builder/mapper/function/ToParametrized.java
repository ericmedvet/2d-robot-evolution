package it.units.erallab.robotevo2d.main.builder.mapper.function;

import it.units.erallab.mrsim2d.core.util.Parametrized;
import it.units.erallab.robotevo2d.main.builder.MapperBuilder;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * @author "Eric Medvet" on 2022/10/03 for 2d-robot-evolution
 */
public class ToParametrized implements MapperBuilder<List<Double>, Parametrized> {

  @Override
  public Function<List<Double>, Parametrized> buildFor(Parametrized parametrized) {
    return values -> {
      if (values.size() != parametrized.getParams().length) {
        throw new IllegalArgumentException("Wrong number of params: %d expected, %d found".formatted(
            parametrized.getParams().length,
            values.size()
        ));
      }
      parametrized.setParams(values.stream().mapToDouble(d -> d).toArray());
      return parametrized;
    };
  }

  @Override
  public List<Double> exampleFor(Parametrized parametrized) {
    return Arrays.stream(parametrized.getParams()).boxed().toList();
  }
}
