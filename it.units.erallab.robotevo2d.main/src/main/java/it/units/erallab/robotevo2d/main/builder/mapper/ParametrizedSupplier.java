package it.units.erallab.robotevo2d.main.builder.mapper;

import it.units.erallab.mrsim2d.builder.BuilderMethod;
import it.units.erallab.mrsim2d.builder.Param;
import it.units.erallab.mrsim2d.core.util.Parametrized;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

/**
 * @author "Eric Medvet" on 2022/10/03 for 2d-robot-evolution
 */
public class ParametrizedSupplier implements InvertibleMapper<List<Double>, Supplier<? extends Parametrized>> {

  private final Supplier<? extends Parametrized> supplier;

  @BuilderMethod
  public ParametrizedSupplier(
      @Param("target") Supplier<? extends Parametrized> supplier
  ) {
    this.supplier = supplier;
  }

  @Override
  public Supplier<? extends Parametrized> apply(List<Double> values) {
    return () -> {
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
  public List<Double> exampleInput() {
    return Arrays.stream(supplier.get().getParams()).boxed().toList();
  }

}
