package io.github.ericmedvet.robotevo2d.main;

import io.github.ericmedvet.jgea.experimenter.Starter;

public class Main {
  public static void main(String[] args) {
    Starter.main(new String[]{
        "-v",
        "-b", "io.github.ericmedvet.robotevo2d.main.PreparedNamedBuilder",
        "-nt", "10",
        "-f", "jumping-centralized-vsr.txt"
    });
  }
}
