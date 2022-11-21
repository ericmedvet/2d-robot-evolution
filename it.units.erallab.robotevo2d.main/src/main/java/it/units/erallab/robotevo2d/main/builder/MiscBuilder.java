package it.units.erallab.robotevo2d.main.builder;

import it.units.erallab.mrsim2d.builder.Param;
import it.units.erallab.mrsim2d.builder.ParamMap;

import java.util.function.Supplier;

/**
 * @author "Eric Medvet" on 2022/11/21 for 2d-robot-evolution
 */
public class MiscBuilder {
  private MiscBuilder() {
  }

  public static <T> Supplier<T> supplier(
      @Param("of") T target,
      @Param(value = "", self = true) ParamMap map
      // TODO add here a injection notation for injecting a NamedBuilder
  ) {
    return () -> {
      return target; // TODO use
    };
  }
}
