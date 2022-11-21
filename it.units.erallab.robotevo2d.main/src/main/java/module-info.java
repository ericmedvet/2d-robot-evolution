/**
 * @author "Eric Medvet" on 2022/08/28 for robotevo2d
 */
module it.units.erallab.robotevo2d.main {
  uses it.units.erallab.mrsim2d.core.engine.Engine;
  requires it.units.malelab.jgea.core;
  requires it.units.malelab.jgea.telegram;
  requires it.units.malelab.jgea.tui;
  requires java.desktop;
  requires java.logging;
  requires it.units.erallab.mrsim2d.core;
  requires it.units.erallab.mrsim2d.viewer;
  requires it.units.erallab.mrsim2d.builder;
  requires jcommander;
  opens it.units.erallab.robotevo2d.main.singleagent to it.units.erallab.mrsim2d.builder;
  exports it.units.erallab.robotevo2d.main.singleagent;
  exports it.units.erallab.robotevo2d.main.builder;
  opens it.units.erallab.robotevo2d.main.builder to it.units.erallab.mrsim2d.builder;
  opens it.units.erallab.robotevo2d.main.builder.mapper to it.units.erallab.mrsim2d.builder;
  opens it.units.erallab.robotevo2d.main.builder.mapper.function to it.units.erallab.mrsim2d.builder;
}