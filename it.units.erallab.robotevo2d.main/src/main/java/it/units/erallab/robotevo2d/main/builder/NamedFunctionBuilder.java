package it.units.erallab.robotevo2d.main.builder;

import it.units.malelab.jgea.core.listener.NamedFunction;
import it.units.malelab.jgea.core.listener.NamedFunctions;
import it.units.malelab.jgea.core.solver.Individual;
import it.units.malelab.jnb.core.Param;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Base64;
import java.util.logging.Logger;

public class NamedFunctionBuilder {

  private final static Logger L = Logger.getLogger(NamedFunctionBuilder.class.getName());


  private NamedFunctionBuilder() {
  }

  public static NamedFunction<?, String> base64Serializer() {
    return NamedFunction.build(
        "base64",
        "%s",
        o -> {
          try (ByteArrayOutputStream baos = new ByteArrayOutputStream(); ObjectOutputStream oos = new ObjectOutputStream(
              baos)) {
            oos.writeObject(o);
            oos.flush();
            return Base64.getEncoder().encodeToString(baos.toByteArray());
          } catch (IOException ex) {
            L.warning("Cannot serialize a %s: %s".formatted(o.getClass().getSimpleName(), ex));
          }
          return "";
        }
    );
  }

  public static <A,B,C> NamedFunction<A,C> composition(
      @Param("first") NamedFunction<A,B> first,
      @Param("second") NamedFunction<B,C> second
  ) {
    return first.then(second);
  }

  public static <Q> NamedFunction<Individual<?, ?, ? extends Q>, Q> fitness() {
    return NamedFunctions.fitness();
  }

  public static <G> NamedFunction<Individual<? extends G, ?, ?>, G> genotype() {
    return NamedFunctions.genotype();
  }

  public static <S> NamedFunction<Individual<?, ? extends S, ?>, S> solution() {
    return NamedFunctions.solution();
  }

  public static NamedFunction<?, String> stringSerialized() {
    return NamedFunction.build("string", "%s", Object::toString);
  }


}
