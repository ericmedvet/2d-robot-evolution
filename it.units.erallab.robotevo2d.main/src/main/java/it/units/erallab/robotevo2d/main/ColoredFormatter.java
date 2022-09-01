package it.units.erallab.robotevo2d.main;

import java.util.logging.Formatter;
import java.util.logging.Level;
import java.util.logging.LogRecord;

/**
 * @author "Eric Medvet" on 2022/09/01 for 2d-robot-evolution
 */
@SuppressWarnings("unused")
public class ColoredFormatter extends Formatter {

  private static final String ANSI_RESET = "\u001B[0m";
  private static final String ANSI_BLACK = "\u001B[30m";
  private static final String ANSI_RED = "\u001B[31m";
  private static final String ANSI_GREEN = "\u001B[32m";
  private static final String ANSI_YELLOW = "\u001B[33m";
  private static final String ANSI_BLUE = "\u001B[34m";
  private static final String ANSI_PURPLE = "\u001B[35m";
  private static final String ANSI_CYAN = "\u001B[36m";
  private static final String ANSI_WHITE = "\u001B[37m";

  private final static String LEVEL_FORMAT = "%4.4s";
  private final static String TIME_FORMAT = "%1$tm-%1$td %1$tH:%1$tM:%1$tS";

  private static String color(Level level){
    if (Level.SEVERE.equals(level)) {
      return ANSI_PURPLE;
    } else if (Level.WARNING.equals(level)) {
      return ANSI_YELLOW;
    } else if (Level.INFO.equals(level)) {
      return ANSI_GREEN;
    } else if (Level.CONFIG.equals(level)) {
      return ANSI_WHITE;
    }
    return ANSI_CYAN;
  }

  @Override
  public String format(LogRecord record) {
    return ANSI_RESET +
        "[" +
        color(record.getLevel()) +
        String.format(LEVEL_FORMAT, record.getLevel()) +
        ANSI_RESET +
        " @ " +
        String.format(TIME_FORMAT, record.getInstant().getEpochSecond()) +
        "] " +
        ANSI_WHITE +
        record.getMessage() +
        "\n";
  }
}
