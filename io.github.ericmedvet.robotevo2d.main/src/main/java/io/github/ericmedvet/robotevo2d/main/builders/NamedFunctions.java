package io.github.ericmedvet.robotevo2d.main.builders;

import io.github.ericmedvet.jgea.core.listener.NamedFunction;
import io.github.ericmedvet.jnb.core.Param;

import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Base64;
import java.util.logging.Logger;

public class NamedFunctions {

  private final static Logger L = Logger.getLogger(NamedFunctions.class.getName());

  private NamedFunctions() {
  }

  private static String c(String... names) {
    return Arrays.stream(names).reduce(NamedFunction.NAME_COMPOSER::apply).orElseThrow();
  }

  public static <X> NamedFunction<X, String> stringBase64(
      @Param("f") NamedFunction<X, Serializable> f
  ) {
    return NamedFunction.build(c("stringBase64", f.getName()), x -> {
      try (ByteArrayOutputStream baos = new ByteArrayOutputStream(); ObjectOutputStream oos = new ObjectOutputStream(
          baos)) {
        oos.writeObject(f.apply(x).toString());
        oos.flush();
        return Base64.getEncoder().encodeToString(baos.toByteArray());
      } catch (Throwable t) {
        L.warning("Cannot serialize %s due to %s".formatted(f.getName(), t));
        return "not-serializable";
      }
    });
  }

}
