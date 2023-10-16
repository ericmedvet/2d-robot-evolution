
package io.github.ericmedvet.robotevo2d.main;

import io.github.ericmedvet.jnb.core.NamedBuilder;
import io.github.ericmedvet.robotevo2d.main.builders.*;

import java.util.List;

public class PreparedNamedBuilder {

  private final static NamedBuilder<Object> NB = NamedBuilder.empty()
      .and(io.github.ericmedvet.mrsim2d.buildable.PreparedNamedBuilder.get())
      .and(io.github.ericmedvet.jgea.experimenter.PreparedNamedBuilder.get())
      .and(List.of("evorobots", "er"), NamedBuilder.empty()
          .and(NamedBuilder.fromUtilityClass(Misc.class))
          .and(NamedBuilder.fromClass(Play.class))
          .and(List.of("mapper", "m"), NamedBuilder.fromUtilityClass(Mappers.class))
          .and(List.of("dynamicalSystem", "dynSys", "ds"), NamedBuilder.empty()
              .and(List.of("numerical", "num"), NamedBuilder.fromUtilityClass(NumericalDynamicalSystems.class))
          )
          .and(List.of("namedFunction", "nf"), NamedBuilder.fromUtilityClass(NamedFunctions.class))
          .and(List.of("listener", "l"), NamedBuilder.fromUtilityClass(Listeners.class))
          .and(List.of("consumer", "c"), NamedBuilder.fromUtilityClass(PlayConsumers.class))
      );

  private PreparedNamedBuilder() {
  }

  public static NamedBuilder<Object> get() {
    return NB;
  }

}
