package it.units.erallab.robotevo2d.main.builder.mapper;

import java.util.function.Function;

/**
 * @author "Eric Medvet" on 2022/11/21 for 2d-robot-evolution
 */
public interface InvertibleMapper<T, R> extends Function<T, R> {
  T exampleInput();
}
