package it.units.erallab.robotevo2d.main;

import it.units.malelab.jnb.core.InfoPrinter;
import it.units.malelab.jnb.core.NamedBuilder;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class DocWriter {
  public static void main(String[] args) {
    String mdHelpFilePath = args[0];
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
