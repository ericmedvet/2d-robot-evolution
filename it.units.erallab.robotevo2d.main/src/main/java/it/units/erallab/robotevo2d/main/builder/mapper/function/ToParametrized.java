package it.units.erallab.robotevo2d.main.builder.mapper.function;

import it.units.erallab.mrsim2d.core.util.Parametrized;
import it.units.erallab.robotevo2d.main.builder.MapperBuilder;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * @author "Eric Medvet" on 2022/10/03 for 2d-robot-evolution
 */
public class ToParametrized implements MapperBuilder<List<Double>, Supplier<? extends Parametrized>> {

  @Override
  public Function<List<Double>, Supplier<? extends Parametrized>> buildFor(Supplier<? extends Parametrized> supplier) {
    return values -> () -> {
      if (values.size() != supplier.get().getParams().length) {
        throw new IllegalArgumentException("Wrong number of params: %d expected, %d found".formatted(
            supplier.get().getParams().length,
            values.size()
        ));
      }
      Parametrized parametrized = supplier.get();
      parametrized.setParams(values.stream().mapToDouble(d -> d).toArray());
      return parametrized;
    };
  }

  @Override
  public List<Double> exampleFor(Supplier<? extends Parametrized> supplier) {
    return Arrays.stream(supplier.get().getParams()).boxed().toList();
  }
}
