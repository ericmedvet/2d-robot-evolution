/**
 * @author "Eric Medvet" on 2022/08/28 for robotevo2d
 */
module it.units.erallab.robotevo2d.main {
  requires io.github.ericmedvet.jgea.core;
  requires io.github.ericmedvet.jgea.experimenter;
  requires java.desktop;
  requires java.logging;
  requires io.github.ericmedvet.mrsim2d.core;
  requires io.github.ericmedvet.mrsim2d.viewer;
  requires io.github.ericmedvet.mrsim2d.buildable;
  requires io.github.ericmedvet.jnb.core;
  requires jcommander;
  opens io.github.ericmedvet.robotevo2d.main.builders to io.github.ericmedvet.jnb.core;
  opens io.github.ericmedvet.robotevo2d.main to io.github.ericmedvet.jnb.core;
  opens io.github.ericmedvet.robotevo2d.main.helper to io.github.ericmedvet.jnb.core;
  exports io.github.ericmedvet.robotevo2d.main;
  exports io.github.ericmedvet.robotevo2d.main.helper;
}