/**
 * @author "Eric Medvet" on 2022/08/28 for robotevo2d
 */
module it.units.erallab.robotevo2d.main {
  uses it.units.erallab.mrsim2d.core.engine.Engine;
  requires JGEA;
  requires java.desktop;
  requires java.logging;
  requires it.units.erallab.mrsim2d.core;
  requires it.units.erallab.mrsim2d.viewer;
  requires it.units.erallab.mrsim2d.builder;
  opens robotevo2d.singleagent to it.units.erallab.mrsim2d.builder;
  opens robotevo2d.builder to it.units.erallab.mrsim2d.builder;
  opens robotevo2d.builder.agent to it.units.erallab.mrsim2d.builder;
  opens robotevo2d.builder.mapper to it.units.erallab.mrsim2d.builder;
  opens robotevo2d.builder.mapper.agent to it.units.erallab.mrsim2d.builder;
  opens robotevo2d.builder.mapper.function to it.units.erallab.mrsim2d.builder;
  opens robotevo2d.builder.solver to it.units.erallab.mrsim2d.builder;
}