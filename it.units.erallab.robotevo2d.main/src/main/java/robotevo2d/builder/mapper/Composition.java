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

package robotevo2d.builder.mapper;

import it.units.erallab.mrsim2d.builder.Param;
import robotevo2d.builder.MapperBuilder;

import java.util.function.Function;

/**
 * @author "Eric Medvet" on 2022/08/13 for 2d-robot-evolution
 */
public class Composition<A, B, C> implements MapperBuilder<A, C> {
  private final MapperBuilder<A, B> first;
  private final MapperBuilder<B, C> second;

  public Composition(
      @Param("first") MapperBuilder<A, B> first,
      @Param("second") MapperBuilder<B, C> second
  ) {
    this.first = first;
    this.second = second;
  }

  @Override
  public Function<A, C> buildFor(C c) {
    Function<A, B> firstF = first.buildFor(second.exampleFor(c));
    Function<B, C> secondF = second.buildFor(c);
    return firstF.andThen(secondF);
  }

  @Override
  public A exampleFor(C c) {
    return first.exampleFor(second.exampleFor(c));
  }
}
