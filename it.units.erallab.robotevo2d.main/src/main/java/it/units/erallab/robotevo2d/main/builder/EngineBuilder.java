package it.units.erallab.robotevo2d.main.builder;

import it.units.erallab.mrsim2d.core.engine.Engine;

import java.util.ServiceLoader;
import java.util.function.Supplier;

/**
 * @author "Eric Medvet" on 2022/10/31 for 2d-robot-evolution
 */
public class EngineBuilder {
  private EngineBuilder() {

  }

  public static Supplier<Engine> defaultEngine() {
    return () -> ServiceLoader.load(Engine.class)
        .findFirst()
        .orElseThrow(() -> new RuntimeException("Cannot instantiate an engine"));
  }
}
