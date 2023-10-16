/*-
 * ========================LICENSE_START=================================
 * robotevo2d-main
 * %%
 * Copyright (C) 2022 - 2023 Eric Medvet
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * =========================LICENSE_END==================================
 */
module io.github.ericmedvet.robotevo2d.main {
  requires io.github.ericmedvet.jgea.core;
  requires io.github.ericmedvet.jgea.problem;
  requires io.github.ericmedvet.jgea.experimenter;
  requires java.desktop;
  requires java.logging;
  requires io.github.ericmedvet.mrsim2d.core;
  requires io.github.ericmedvet.mrsim2d.viewer;
  requires io.github.ericmedvet.mrsim2d.buildable;
  requires io.github.ericmedvet.jsdynsym.core;
  requires io.github.ericmedvet.jsdynsym.buildable;
  requires io.github.ericmedvet.jnb.core;
  requires jcommander;
  requires org.apache.commons.csv;

  opens io.github.ericmedvet.robotevo2d.main.builders to
      io.github.ericmedvet.jnb.core;
  opens io.github.ericmedvet.robotevo2d.main to
      io.github.ericmedvet.jnb.core;
  opens io.github.ericmedvet.robotevo2d.main.helper to
      io.github.ericmedvet.jnb.core;

  exports io.github.ericmedvet.robotevo2d.main;
  exports io.github.ericmedvet.robotevo2d.main.helper;

  opens io.github.ericmedvet.robotevo2d.main.dynamicalsystems to
      io.github.ericmedvet.jnb.core;
}
