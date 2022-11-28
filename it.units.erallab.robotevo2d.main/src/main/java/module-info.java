/**
 * @author "Eric Medvet" on 2022/08/28 for robotevo2d
 */
module it.units.erallab.robotevo2d.main {
  uses it.units.erallab.mrsim2d.core.engine.Engine;
  requires it.units.malelab.jgea.core;
  requires it.units.malelab.jgea.experimenter;
  requires java.desktop;
  requires java.logging;
  requires it.units.erallab.mrsim2d.core;
  requires it.units.erallab.mrsim2d.viewer;
  requires it.units.malelab.jnb.core;
  requires jcommander;
  exports it.units.erallab.robotevo2d.main;
  opens it.units.erallab.robotevo2d.main.builders to it.units.malelab.jnb.core;
  opens it.units.erallab.robotevo2d.main.builders.mapper to it.units.malelab.jnb.core;
  opens it.units.erallab.robotevo2d.main to it.units.malelab.jnb.core;
}