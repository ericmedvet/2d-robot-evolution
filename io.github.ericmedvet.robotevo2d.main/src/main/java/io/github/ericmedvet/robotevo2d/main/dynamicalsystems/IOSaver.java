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
package io.github.ericmedvet.robotevo2d.main.dynamicalsystems;

import io.github.ericmedvet.jsdynsym.core.composed.AbstractComposed;
import io.github.ericmedvet.jsdynsym.core.numerical.NumericalDynamicalSystem;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Logger;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;

public class IOSaver<S> extends AbstractComposed<NumericalDynamicalSystem<S>>
    implements NumericalDynamicalSystem<S> {

  private static final Map<PrinterKey, PrinterInfo> PRINTER_MAP = new HashMap<>();
  private static final Logger L = Logger.getLogger(IOSaver.class.getName());
  private final String filePath;
  private final double initialT;
  private final double finalT;
  private CSVPrinter printer;
  private int index;
  private boolean stopped;

  public IOSaver(
      NumericalDynamicalSystem<S> inner, String filePath, double initialT, double finalT) {
    super(inner);
    this.filePath = filePath;
    this.initialT = initialT;
    this.finalT = finalT;
    stopped = false;
  }

  private record PrinterInfo(CSVPrinter printer, AtomicInteger counter) {}

  private record PrinterKey(String filePath, int nOfInputs, int nOfOutputs) {}

  private static void closePrinter(PrinterKey key) {
    PrinterInfo value = PRINTER_MAP.get(key);
    if (value == null) {
      L.warning("Cannot close unopened printer");
      return;
    }
    int count = value.counter().decrementAndGet();
    if (count <= 0) {
      // close printer
      try {
        value.printer().close(true);
        L.info("File %s closed".formatted(key.filePath()));
      } catch (IOException e) {
        L.warning("Cannot close file due to %s".formatted(e));
      }
    }
  }

  private static PrinterInfo openPrinter(PrinterKey key) {
    PrinterInfo printerInfo = PRINTER_MAP.get(key);
    if (printerInfo != null) {
      printerInfo.counter().incrementAndGet();
      return printerInfo;
    }
    // create printer
    CSVPrinter printer;
    try {
      printer =
          new CSVPrinter(
              new PrintStream(new FileOutputStream(key.filePath())),
              CSVFormat.Builder.create().setDelimiter(";").build());
    } catch (IOException e) {
      L.warning("Cannot write on file due to %s".formatted(e));
      return null;
    }
    // print header
    try {
      // TODO to be replaced with a call to Agents.varNames()
      printer.printRecord(
          Stream.concat(
                  Stream.of("index", "t"),
                  Stream.concat(
                      varNames("x", key.nOfInputs()).stream(),
                      varNames("y", key.nOfOutputs()).stream()))
              .toList());
      L.info("Header written on %s".formatted(key.filePath));
    } catch (IOException e) {
      L.warning("Cannot write header due to %s".formatted(e));
    }
    printerInfo = new PrinterInfo(printer, new AtomicInteger(1));
    PRINTER_MAP.put(key, printerInfo);
    return printerInfo;
  }

  private static List<String> varNames(String name, int number) {
    int digits = (int) Math.ceil(Math.log10(number + 1));
    return IntStream.range(1, number + 1)
        .mapToObj((name + "%0" + digits + "d")::formatted)
        .toList();
  }

  @Override
  public S getState() {
    return inner().getState();
  }

  @Override
  public void reset() {
    inner().reset();
  }

  @Override
  public double[] step(double t, double[] input) {
    double[] output = inner().step(t, input);
    if (t >= initialT && !stopped) {
      PrinterKey key = new PrinterKey(filePath, input.length, output.length);
      if (printer == null) {
        PrinterInfo printerInfo = openPrinter(key);
        if (printerInfo != null) {
          printer = printerInfo.printer;
          index = printerInfo.counter().get();
        }
      }
      if (printer != null) {
        // write a row
        try {
          printer.printRecord(
              Stream.concat(
                      Stream.of((double) index, t),
                      Stream.concat(Arrays.stream(input).boxed(), Arrays.stream(output).boxed()))
                  .toList());
        } catch (IOException e) {
          L.warning("Cannot write row due to %s".formatted(e));
        }
        if (t >= finalT) {
          if (printer != null) {
            // close printer
            closePrinter(key);
            printer = null;
            stopped = true;
          }
        }
      }
    }
    return output;
  }

  @Override
  public int nOfInputs() {
    return inner().nOfInputs();
  }

  @Override
  public int nOfOutputs() {
    return inner().nOfOutputs();
  }
}
