package it.units.erallab.robotevo2d.main;

import it.units.erallab.robotevo2d.main.builders.Listeners;
import it.units.erallab.robotevo2d.main.builders.Mappers;
import it.units.erallab.robotevo2d.main.builders.Misc;
import it.units.malelab.jnb.core.NamedBuilder;

import java.util.List;

public class PreparedNamedBuilder {

  private final static NamedBuilder<Object> NB = NamedBuilder.empty()
      .and(it.units.erallab.mrsim2d.buildable.PreparedNamedBuilder.get())
      .and(it.units.malelab.jgea.experimenter.PreparedNamedBuilder.get())
      .and(List.of("evorobots", "er"), NamedBuilder.empty()
          .and(NamedBuilder.fromUtilityClass(Misc.class))
          .and(List.of("mapper", "m"), NamedBuilder.fromUtilityClass(Mappers.class))
          .and(List.of("listener", "l"), NamedBuilder.fromUtilityClass(Listeners.class))
      );

  private PreparedNamedBuilder() {
  }

  public static NamedBuilder<Object> get() {
    return NB;
  }

}
