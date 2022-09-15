package it.units.erallab.robotevo2d.main.singleagent;

import com.beust.jcommander.Parameter;

/**
 * @author "Eric Medvet" on 2022/09/01 for 2d-robot-evolution
 */
public final class Configuration {
  @Parameter(
      names = {"--expFile", "-e"},
      description = "Path of the file with the experiment description"
  )
  public String experimentDescriptionFilePath = "";
  @Parameter(
      names = {"--telegramFile", "-t"},
      description = "Path of the file with the Telegram credentials"
  )
  public String telegramCredentialsFilePath = "";
  @Parameter(
      names = {"--nOfThreads", "-n"},
      description = "Number of threads to be used"
  )
  public int nOfThreads = 1;

  @Parameter(
      names = {"--showExpFileHelp", "-d"},
      description = "Show a description of available constructs for the experiment file"
  )
  public boolean showExpFileName = false;
}
