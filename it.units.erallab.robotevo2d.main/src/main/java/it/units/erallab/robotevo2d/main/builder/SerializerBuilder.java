/*
 * Copyright 2022 Eric Medvet <eric.medvet@gmail.com> (as eric)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package it.units.erallab.robotevo2d.main.builder;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Base64;
import java.util.function.Function;
import java.util.logging.Logger;

/**
 * @author "Eric Medvet" on 2022/08/11 for 2d-robot-evolution
 */
public class SerializerBuilder {

  private final static Logger L = Logger.getLogger(SerializerBuilder.class.getName());

  public static Function<Object, String> javaSerializer() {
    return o -> {
      try (ByteArrayOutputStream baos = new ByteArrayOutputStream(); ObjectOutputStream oos = new ObjectOutputStream(
          baos)) {
        oos.writeObject(o);
        oos.flush();
        return Base64.getEncoder().encodeToString(baos.toByteArray());
      } catch (IOException ex) {
        L.warning("Cannot serialize a %s: %s".formatted(o.getClass().getSimpleName(), ex));
      }
      return "";
    };
  }

  public static Function<Object, String> stringifier() {
    return Object::toString;
  }

}
