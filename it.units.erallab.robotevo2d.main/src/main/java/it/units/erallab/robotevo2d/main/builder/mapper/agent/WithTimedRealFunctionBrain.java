/*
 * Copyright 2022 eric
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

package it.units.erallab.robotevo2d.main.builder.mapper.agent;

import it.units.erallab.mrsim2d.core.agents.WithTimedRealFunction;
import it.units.erallab.mrsim2d.core.functions.TimedRealFunction;
import it.units.erallab.robotevo2d.main.builder.MapperBuilder;

import java.util.function.Function;
import java.util.function.Supplier;

public class WithTimedRealFunctionBrain<T extends WithTimedRealFunction> implements MapperBuilder<TimedRealFunction,
    Supplier<T>> {

  @Override
  public Function<TimedRealFunction, Supplier<T>> buildFor(Supplier<T> withTimedRealFunctionSupplier) {
    return timedRealFunction -> () -> {
      T withTimedRealFunction = withTimedRealFunctionSupplier.get();
      withTimedRealFunction.setTimedRealFunction(timedRealFunction);
      return withTimedRealFunction;
    };
  }

  @Override
  public TimedRealFunction exampleFor(Supplier<T> withTimedRealFunctionSupplier) {
    T withTimedRealFunction = withTimedRealFunctionSupplier.get();
    return TimedRealFunction.zeros(
        withTimedRealFunction.getTimedRealFunction().nOfInputs(),
        withTimedRealFunction.getTimedRealFunction().nOfOutputs()
    );
  }
}
