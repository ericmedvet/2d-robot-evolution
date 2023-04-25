package io.github.ericmedvet.robotevo2d.main.dynamicalsystems;

import io.github.ericmedvet.jsdynsym.core.composed.AbstractComposed;
import io.github.ericmedvet.jsdynsym.core.numerical.NumericalDynamicalSystem;

import java.io.Writer;

public class IOSaver<S> extends AbstractComposed<NumericalDynamicalSystem<S>> implements NumericalDynamicalSystem<S> {

  private final String filePath;
  private final double initialT;
  private final double finalT;

  private Writer writer;

  public IOSaver(NumericalDynamicalSystem<S> inner, String filePath, double initialT, double finalT) {
    super(inner);
    this.filePath = filePath;
    this.initialT = initialT;
    this.finalT = finalT;
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
    // TODO
    // check time, if appropriate write
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
