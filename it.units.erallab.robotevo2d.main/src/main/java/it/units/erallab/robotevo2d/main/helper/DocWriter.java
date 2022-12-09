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

package it.units.erallab.robotevo2d.main.helper;

import it.units.erallab.robotevo2d.main.PreparedNamedBuilder;
import it.units.malelab.jnb.core.InfoPrinter;
import it.units.malelab.jnb.core.NamedBuilder;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class DocWriter {

  private static final String DEFAULT_PATH = "assets/builder-help.md";

  public static void main(String[] args) {
    String mdHelpFilePath = args.length > 1 ? args[0] : DEFAULT_PATH;
    NamedBuilder<?> nb = PreparedNamedBuilder.get();
    try (PrintStream filePS = new PrintStream(mdHelpFilePath)) {
      System.out.printf("Writing the builder help file on %s%n", mdHelpFilePath);
      InfoPrinter infoPrinter = new InfoPrinter();
      infoPrinter.print(nb, filePS);
      System.exit(0);
    } catch (FileNotFoundException e) {
      throw new IllegalArgumentException("Cannot open md file %s: %s".formatted(mdHelpFilePath, e), e);
    }

  }
}
