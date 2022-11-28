package it.units.erallab.robotevo2d.main.builders;

import it.units.malelab.jnb.core.NamedBuilder;
import it.units.malelab.jnb.core.Param;
import it.units.malelab.jnb.core.ParamMap;

import java.util.function.Supplier;

/**
 * @author "Eric Medvet" on 2022/11/21 for 2d-robot-evolution
 */
public class MiscBuilder {
  private MiscBuilder() {
  }

  @SuppressWarnings("unused")
  public static <T> Supplier<T> supplier(
      @Param("of") T target,
      @Param(value = "", injection = Param.Injection.MAP) ParamMap map,
      @Param(value = "", injection = Param.Injection.BUILDER) NamedBuilder<?> builder
  ) {
    //noinspection unchecked
    return () -> (T)builder.build(map.npm("of"));
  }
}
