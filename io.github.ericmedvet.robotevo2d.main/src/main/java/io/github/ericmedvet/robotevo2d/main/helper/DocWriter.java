
package io.github.ericmedvet.robotevo2d.main.helper;

import io.github.ericmedvet.jnb.core.InfoPrinter;
import io.github.ericmedvet.jnb.core.NamedBuilder;
import io.github.ericmedvet.robotevo2d.main.PreparedNamedBuilder;

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
