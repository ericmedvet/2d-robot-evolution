
package io.github.ericmedvet.robotevo2d.main.helper;

import io.github.ericmedvet.jnb.core.NamedBuilder;
import io.github.ericmedvet.mrsim2d.core.Agent;
import io.github.ericmedvet.mrsim2d.core.engine.Engine;
import io.github.ericmedvet.mrsim2d.core.tasks.Task;
import io.github.ericmedvet.mrsim2d.viewer.Drawer;
import io.github.ericmedvet.mrsim2d.viewer.FramesImageBuilder;
import io.github.ericmedvet.robotevo2d.main.PreparedNamedBuilder;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class AgentImageWriter {

  private static final List<String> AGENT_DESCRIPTION_RESOURCE_PATHS = List.of(
      "/agent-examples/vsr-centralized-biped.txt",
      "/agent-examples/vsr-centralized-free.txt",
      "/agent-examples/vsr-distributed-worm.txt",
      "/agent-examples/hybrid-vsr-distributed-tripod.txt",
      "/agent-examples/legged-passive-3.txt",
      "/agent-examples/legged-active-4.txt",
      "/agent-examples/legged-modular-active-4.txt"
  );

  private static final String ENGINE_DESCRIPTION = "s.engine()";
  private static final String DRAWER_DESCRIPTION = "s.drawer(actions = true; miniAgents = brains; enlargement = 1.5)";
  private static final String IMGS_PATH = "assets/images/agents/";

  private static final int W = 400;
  private static final int H = 300;
  private static final int N = 3;
  private static final double D_T = 0.25;
  private static final double T0 = 0.25;

  private static final String TASK_DESCRIPTION = String.format(
      Locale.ROOT,
      "s.task.locomotion(terrain = s.t.hilly(chunkW = 1; chunkH = 0.25); duration = %f)",
      T0 + (N + 1d) * D_T
  );

  public static void main(String[] args) {
    NamedBuilder<?> nb = PreparedNamedBuilder.get();
    String imgsPath = args.length > 1 ? args[0] : IMGS_PATH;
    List<String> agentResourcePaths = AGENT_DESCRIPTION_RESOURCE_PATHS;
    @SuppressWarnings("unchecked")
    Function<String, Drawer> drawer = (Function<String, Drawer>) nb.build(DRAWER_DESCRIPTION);
    @SuppressWarnings("unchecked")
    Supplier<Engine> engine = (Supplier<Engine>) nb.build(ENGINE_DESCRIPTION);
    @SuppressWarnings("unchecked")
    Task<Supplier<Agent>, ?> task = (Task<Supplier<Agent>, ?>) nb.build(TASK_DESCRIPTION);

    System.out.printf("Going to generate and save %d images.%n", agentResourcePaths.size());
    for (String agentResourcePath : agentResourcePaths) {
      String name = agentResourcePath.split("/")[agentResourcePath.split("/").length - 1].split("\\.")[0];
      System.out.printf("Doing %s.%n", name);
      //noinspection DataFlowIssue
      try (
          InputStream inputStream = AgentImageWriter.class.getResourceAsStream(agentResourcePath);
          BufferedReader br = new BufferedReader(new InputStreamReader(inputStream))
      ) {
        Supplier<Agent> agent = () -> (Agent) nb.build(br.lines().collect(Collectors.joining()));
        FramesImageBuilder fib = new FramesImageBuilder(
            W,
            H,
            N,
            D_T,
            T0,
            FramesImageBuilder.Direction.HORIZONTAL,
            true,
            drawer.apply(name)
        );
        task.run(agent, engine.get(), fib);
        BufferedImage bufferedImage = fib.get();
        File imgFile = new File(imgsPath + File.separator + name + ".png");
        ImageIO.write(bufferedImage, "png", imgFile);
        System.out.printf("Image saved to %s.%n", imgFile);
      } catch (IOException e) {
        System.err.printf("Cannot generate image for %s because: %s%n", agentResourcePath, e);
      }
    }
  }
}
