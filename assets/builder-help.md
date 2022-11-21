## Unnamed package

### Builder `configuration()`

`configuration()`

Produces <code><abbr title="it.units.erallab.robotevo2d.main.singleagent.Configuration">Configuration</abbr></code>

### Builder `experiment()`

`experiment(runs; qExtractor; listeners; engine)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `runs` | npm[] | `[]` | <code><abbr title="java.util.List">List</abbr><? extends <abbr title="it.units.erallab.robotevo2d.main.singleagent.Run">Run</abbr><? extends G, ? extends Q>></code> |
| `qExtractor` | npm |  | <code><abbr title="it.units.malelab.jgea.core.listener.NamedFunction">NamedFunction</abbr><? super Q, <abbr title="java.lang.Double">Double</abbr>></code> |
| `listeners` | npm[] | `[]` | <code><abbr title="java.util.List">List</abbr><<abbr title="java.util.function.BiFunction">BiFunction</abbr><<abbr title="it.units.erallab.robotevo2d.main.singleagent.Experiment">Experiment</abbr><G, S, Q>, <abbr title="java.util.concurrent.ExecutorService">ExecutorService</abbr>, ? extends <abbr title="it.units.malelab.jgea.core.listener.ListenerFactory">ListenerFactory</abbr><? super <abbr title="it.units.malelab.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr><? extends G, ? extends S, ? extends Q>, <abbr title="it.units.erallab.robotevo2d.main.singleagent.Run">Run</abbr><? extends G, ? extends Q>>>></code> |
| `engine` | npm | `engine.defaultEngine()` | <code><abbr title="java.util.function.Supplier">Supplier</abbr><<abbr title="it.units.erallab.mrsim2d.core.engine.Engine">Engine</abbr>></code> |

Produces <code><abbr title="it.units.erallab.robotevo2d.main.singleagent.Experiment">Experiment</abbr></code>

### Builder `namedTask()`

`namedTask(task; )`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `task` | npm |  | <code><abbr title="it.units.erallab.mrsim2d.core.tasks.Task">Task</abbr><Q, ?></code> |

Produces <code><abbr title="it.units.erallab.robotevo2d.main.singleagent.NamedTask">NamedTask</abbr></code>

### Builder `run()`

`run(solver; mapper; target; task; comparator; randomGenerator; )`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `solver` | npm |  | <code><abbr title="it.units.erallab.robotevo2d.main.builder.solver.SolverBuilder">SolverBuilder</abbr><G></code> |
| `mapper` | npm |  | <code><abbr title="it.units.erallab.robotevo2d.main.builder.MapperBuilder">MapperBuilder</abbr><G, <abbr title="java.util.function.Supplier">Supplier</abbr><<abbr title="it.units.erallab.mrsim2d.core.EmbodiedAgent">EmbodiedAgent</abbr>>></code> |
| `target` | npm |  | <code><abbr title="it.units.erallab.mrsim2d.core.EmbodiedAgent">EmbodiedAgent</abbr></code> |
| `task` | npm |  | <code><abbr title="it.units.erallab.mrsim2d.core.tasks.Task">Task</abbr><<abbr title="java.util.function.Supplier">Supplier</abbr><<abbr title="it.units.erallab.mrsim2d.core.EmbodiedAgent">EmbodiedAgent</abbr>>, Q></code> |
| `comparator` | npm |  | <code><abbr title="it.units.malelab.jgea.core.order.PartialComparator">PartialComparator</abbr><? super Q></code> |
| `randomGenerator` | npm |  | <code><abbr title="java.util.random.RandomGenerator">RandomGenerator</abbr></code> |

Produces <code><abbr title="it.units.erallab.robotevo2d.main.singleagent.Run">Run</abbr></code>

### Builder `videoSaver()`

`videoSaver(w; h; frameRate; startTime; endTime; codec; drawer)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `w` | i | `400` | <code>int</code> |
| `h` | i | `250` | <code>int</code> |
| `frameRate` | d | `30.0` | <code>double</code> |
| `startTime` | d | `0.0` | <code>double</code> |
| `endTime` | d | `30.0` | <code>double</code> |
| `codec` | e | `JCODEC` | <code><abbr title="it.units.erallab.mrsim2d.viewer.VideoUtils$EncoderFacility">VideoUtils$EncoderFacility</abbr></code> |
| `drawer` | npm |  | <code><abbr title="java.util.function.Function">Function</abbr><<abbr title="java.lang.String">String</abbr>, <abbr title="it.units.erallab.mrsim2d.viewer.Drawer">Drawer</abbr>></code> |

Produces <code><abbr title="it.units.erallab.robotevo2d.main.singleagent.VideoSaver">VideoSaver</abbr></code>

## Package `comparator`

Aliases: `c`, `comparator`

### Builder `comparator.max()`

`c.max(of)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `of` | npm |  | <code><abbr title="java.util.function.Function">Function</abbr><<abbr title="java.lang.Object">Object</abbr>, <abbr title="java.lang.Double">Double</abbr>></code> |

Produces <code><abbr title="it.units.malelab.jgea.core.order.PartialComparator">PartialComparator</abbr><<abbr title="java.lang.Object">Object</abbr>></code>

### Builder `comparator.min()`

`c.min(of)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `of` | npm |  | <code><abbr title="java.util.function.Function">Function</abbr><<abbr title="java.lang.Object">Object</abbr>, <abbr title="java.lang.Double">Double</abbr>></code> |

Produces <code><abbr title="it.units.malelab.jgea.core.order.PartialComparator">PartialComparator</abbr><<abbr title="java.lang.Object">Object</abbr>></code>

## Package `drawer`

Aliases: `d`, `drawer`

### Builder `drawer.basic()`

`d.basic()`

Produces <code><abbr title="java.util.function.Function">Function</abbr><<abbr title="java.lang.String">String</abbr>, <abbr title="it.units.erallab.mrsim2d.viewer.Drawer">Drawer</abbr>></code>

### Builder `drawer.basicWithAgentMiniature()`

`d.basicWithAgentMiniature()`

Produces <code><abbr title="java.util.function.Function">Function</abbr><<abbr title="java.lang.String">String</abbr>, <abbr title="it.units.erallab.mrsim2d.viewer.Drawer">Drawer</abbr>></code>

## Package `engine`

### Builder `engine.defaultEngine()`

`engine.defaultEngine()`

Produces <code><abbr title="java.util.function.Supplier">Supplier</abbr><<abbr title="it.units.erallab.mrsim2d.core.engine.Engine">Engine</abbr>></code>

## Package `extractor`

Aliases: `e`, `extractor`

### Builder `extractor.locomotionXVelocity()`

`e.locomotionXVelocity(transientT)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `transientT` | d | `0.0` | <code>double</code> |

Produces <code><abbr title="it.units.malelab.jgea.core.listener.NamedFunction">NamedFunction</abbr><<abbr title="it.units.erallab.mrsim2d.core.tasks.locomotion.Outcome">Outcome</abbr>, <abbr title="java.lang.Double">Double</abbr>></code>

### Builder `extractor.pilingAverageHeight()`

`e.pilingAverageHeight()`

Produces <code><abbr title="it.units.malelab.jgea.core.listener.NamedFunction">NamedFunction</abbr><<abbr title="it.units.erallab.mrsim2d.core.tasks.piling.Outcome">Outcome</abbr>, <abbr title="java.lang.Double">Double</abbr>></code>

### Builder `extractor.pilingHeightDiff()`

`e.pilingHeightDiff()`

Produces <code><abbr title="it.units.malelab.jgea.core.listener.NamedFunction">NamedFunction</abbr><<abbr title="it.units.erallab.mrsim2d.core.tasks.piling.Outcome">Outcome</abbr>, <abbr title="java.lang.Double">Double</abbr>></code>

## Package `listener`

Aliases: `l`, `listener`

### Builder `listener.allCsv()`

`l.allCsv(filePath; individualFunctions; runKeys; onlyLast)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `filePath` | s |  | <code><abbr title="java.lang.String">String</abbr></code> |
| `individualFunctions` | npm[] | `[]` | <code><abbr title="java.util.List">List</abbr><<abbr title="it.units.malelab.jgea.core.listener.NamedFunction">NamedFunction</abbr><? super <abbr title="it.units.malelab.jgea.core.solver.Individual">Individual</abbr><? extends G, ? extends S, ? extends Q>, ?>></code> |
| `runKeys` | s[] | `[]` | <code><abbr title="java.util.List">List</abbr><<abbr title="java.lang.String">String</abbr>></code> |
| `onlyLast` | b | `false` | <code>boolean</code> |

Produces <code><abbr title="java.util.function.BiFunction">BiFunction</abbr><<abbr title="it.units.erallab.robotevo2d.main.singleagent.Experiment">Experiment</abbr><G, S, Q>, <abbr title="java.util.concurrent.ExecutorService">ExecutorService</abbr>, <abbr title="it.units.malelab.jgea.core.listener.ListenerFactory">ListenerFactory</abbr><? super <abbr title="it.units.malelab.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr><G, S, Q>, <abbr title="it.units.erallab.robotevo2d.main.singleagent.Run">Run</abbr><G, Q>>></code>

### Builder `listener.bestCsv()`

`l.bestCsv(filePath; popFunctions; individualFunctions; runKeys; onlyLast)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `filePath` | s |  | <code><abbr title="java.lang.String">String</abbr></code> |
| `popFunctions` | npm[] | `[]` | <code><abbr title="java.util.List">List</abbr><<abbr title="it.units.malelab.jgea.core.listener.NamedFunction">NamedFunction</abbr><? super <abbr title="it.units.malelab.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr><? extends G, ? extends S, ? extends Q>, ?>></code> |
| `individualFunctions` | npm[] | `[]` | <code><abbr title="java.util.List">List</abbr><<abbr title="it.units.malelab.jgea.core.listener.NamedFunction">NamedFunction</abbr><? super <abbr title="it.units.malelab.jgea.core.solver.Individual">Individual</abbr><? extends G, ? extends S, ? extends Q>, ?>></code> |
| `runKeys` | s[] | `[]` | <code><abbr title="java.util.List">List</abbr><<abbr title="java.lang.String">String</abbr>></code> |
| `onlyLast` | b | `false` | <code>boolean</code> |

Produces <code><abbr title="java.util.function.BiFunction">BiFunction</abbr><<abbr title="it.units.erallab.robotevo2d.main.singleagent.Experiment">Experiment</abbr><G, S, Q>, <abbr title="java.util.concurrent.ExecutorService">ExecutorService</abbr>, <abbr title="it.units.malelab.jgea.core.listener.ListenerFactory">ListenerFactory</abbr><? super <abbr title="it.units.malelab.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr><G, S, Q>, <abbr title="it.units.erallab.robotevo2d.main.singleagent.Run">Run</abbr><G, Q>>></code>

### Builder `listener.lastBestVideo()`

`l.lastBestVideo(dirPath; fileNameTemplate; videoSaver; tasks; deferred)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `dirPath` | s |  | <code><abbr title="java.lang.String">String</abbr></code> |
| `fileNameTemplate` | s | `video-%s.mp4` | <code><abbr title="java.lang.String">String</abbr></code> |
| `videoSaver` | npm | `videoSaver(drawer=d.basicWithAgentMiniature();h=400.0;w=600.0)` | <code><abbr title="it.units.erallab.robotevo2d.main.singleagent.VideoSaver">VideoSaver</abbr></code> |
| `tasks` | npm[] | `[]` | <code><abbr title="java.util.List">List</abbr><<abbr title="it.units.erallab.robotevo2d.main.singleagent.NamedTask">NamedTask</abbr><? super S>></code> |
| `deferred` | b | `true` | <code>boolean</code> |

Produces <code><abbr title="java.util.function.BiFunction">BiFunction</abbr><<abbr title="it.units.erallab.robotevo2d.main.singleagent.Experiment">Experiment</abbr><G, S, Q>, <abbr title="java.util.concurrent.ExecutorService">ExecutorService</abbr>, <abbr title="it.units.malelab.jgea.core.listener.ListenerFactory">ListenerFactory</abbr><? super <abbr title="it.units.malelab.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr><G, S, Q>, <abbr title="it.units.erallab.robotevo2d.main.singleagent.Run">Run</abbr><G, Q>>></code>

### Builder `listener.telegram()`

`l.telegram(chatId; botIdFilePath; videoSaver; tasks; deferred)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `chatId` | s |  | <code><abbr title="java.lang.String">String</abbr></code> |
| `botIdFilePath` | s |  | <code><abbr title="java.lang.String">String</abbr></code> |
| `videoSaver` | npm | `videoSaver(drawer=d.basicWithAgentMiniature();h=400.0;w=600.0)` | <code><abbr title="it.units.erallab.robotevo2d.main.singleagent.VideoSaver">VideoSaver</abbr></code> |
| `tasks` | npm[] | `[]` | <code><abbr title="java.util.List">List</abbr><<abbr title="it.units.erallab.robotevo2d.main.singleagent.NamedTask">NamedTask</abbr><? super S>></code> |
| `deferred` | b | `true` | <code>boolean</code> |

Produces <code><abbr title="java.util.function.BiFunction">BiFunction</abbr><<abbr title="it.units.erallab.robotevo2d.main.singleagent.Experiment">Experiment</abbr><G, S, Q>, <abbr title="java.util.concurrent.ExecutorService">ExecutorService</abbr>, <abbr title="it.units.malelab.jgea.core.listener.ListenerFactory">ListenerFactory</abbr><? super <abbr title="it.units.malelab.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr><G, S, Q>, <abbr title="it.units.erallab.robotevo2d.main.singleagent.Run">Run</abbr><G, Q>>></code>

## Package `mapper`

Aliases: `m`, `mapper`

### Builder `mapper.composition()`

`m.composition(first; second)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `first` | npm |  | <code><abbr title="it.units.erallab.robotevo2d.main.builder.MapperBuilder">MapperBuilder</abbr><A, B></code> |
| `second` | npm |  | <code><abbr title="it.units.erallab.robotevo2d.main.builder.MapperBuilder">MapperBuilder</abbr><B, C></code> |

Produces <code><abbr title="it.units.erallab.robotevo2d.main.builder.mapper.Composition">Composition</abbr></code>

### Builder `mapper.toParametrized()`

`m.toParametrized()`

Produces <code><abbr title="it.units.erallab.robotevo2d.main.builder.mapper.ParametrizedSupplier">ToParametrized</abbr></code>

## Package `namedFunction`

Aliases: `namedFunction`, `nf`

### Builder `namedFunction.base64Serializer()`

`nf.base64Serializer()`

Produces <code><abbr title="it.units.malelab.jgea.core.listener.NamedFunction">NamedFunction</abbr><?, <abbr title="java.lang.String">String</abbr>></code>

### Builder `namedFunction.composition()`

`nf.composition(first; second)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `first` | npm |  | <code><abbr title="it.units.malelab.jgea.core.listener.NamedFunction">NamedFunction</abbr><A, B></code> |
| `second` | npm |  | <code><abbr title="it.units.malelab.jgea.core.listener.NamedFunction">NamedFunction</abbr><B, C></code> |

Produces <code><abbr title="it.units.malelab.jgea.core.listener.NamedFunction">NamedFunction</abbr><A, C></code>

### Builder `namedFunction.fitness()`

`nf.fitness()`

Produces <code><abbr title="it.units.malelab.jgea.core.listener.NamedFunction">NamedFunction</abbr><<abbr title="it.units.malelab.jgea.core.solver.Individual">Individual</abbr><?, ?, ? extends Q>, Q></code>

### Builder `namedFunction.genotype()`

`nf.genotype()`

Produces <code><abbr title="it.units.malelab.jgea.core.listener.NamedFunction">NamedFunction</abbr><<abbr title="it.units.malelab.jgea.core.solver.Individual">Individual</abbr><? extends G, ?, ?>, G></code>

### Builder `namedFunction.solution()`

`nf.solution()`

Produces <code><abbr title="it.units.malelab.jgea.core.listener.NamedFunction">NamedFunction</abbr><<abbr title="it.units.malelab.jgea.core.solver.Individual">Individual</abbr><?, ? extends S, ?>, S></code>

### Builder `namedFunction.stringSerialized()`

`nf.stringSerialized()`

Produces <code><abbr title="it.units.malelab.jgea.core.listener.NamedFunction">NamedFunction</abbr><?, <abbr title="java.lang.String">String</abbr>></code>

## Package `randomGenerator`

Aliases: `randomGenerator`, `rg`

### Builder `randomGenerator.defaultRG()`

`rg.defaultRG(seed)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `seed` | i | `0` | <code>int</code> |

Produces <code><abbr title="java.util.random.RandomGenerator">RandomGenerator</abbr></code>

## Package `sim`

Aliases: `s`, `sim`

### Builder `sim.range()`

`s.range(min; max)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `min` | d |  | <code>double</code> |
| `max` | d |  | <code>double</code> |

Produces <code><abbr title="it.units.erallab.mrsim2d.core.util.DoubleRange">DoubleRange</abbr></code>

## Package `sim.agent`

Aliases: `s.a`, `s.agent`, `sim.a`, `sim.agent`

### Builder `sim.agent.centralizedNumGridVSR()`

`s.a.centralizedNumGridVSR(body; function)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `body` | npm |  | <code><abbr title="it.units.erallab.mrsim2d.core.agents.gridvsr.GridBody">GridBody</abbr></code> |
| `function` | npm |  | <code><abbr title="java.util.function.BiFunction">BiFunction</abbr><<abbr title="java.lang.Integer">Integer</abbr>, <abbr title="java.lang.Integer">Integer</abbr>, ? extends <abbr title="it.units.erallab.mrsim2d.core.functions.TimedRealFunction">TimedRealFunction</abbr>></code> |

Produces <code><abbr title="it.units.erallab.mrsim2d.core.agents.gridvsr.CentralizedNumGridVSR">CentralizedNumGridVSR</abbr></code>

### Builder `sim.agent.heteroDistributedNumGridVSR()`

`s.a.heteroDistributedNumGridVSR(body; function; signals; directional)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `body` | npm |  | <code><abbr title="it.units.erallab.mrsim2d.core.agents.gridvsr.GridBody">GridBody</abbr></code> |
| `function` | npm |  | <code><abbr title="java.util.function.BiFunction">BiFunction</abbr><<abbr title="java.lang.Integer">Integer</abbr>, <abbr title="java.lang.Integer">Integer</abbr>, ? extends <abbr title="it.units.erallab.mrsim2d.core.functions.TimedRealFunction">TimedRealFunction</abbr>></code> |
| `signals` | i |  | <code>int</code> |
| `directional` | b | `false` | <code>boolean</code> |

Produces <code><abbr title="it.units.erallab.mrsim2d.core.agents.gridvsr.HeteroDistributedNumGridVSR">HeteroDistributedNumGridVSR</abbr></code>

### Builder `sim.agent.homoDistributedNumGridVSR()`

`s.a.homoDistributedNumGridVSR(body; function; signals; directional)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `body` | npm |  | <code><abbr title="it.units.erallab.mrsim2d.core.agents.gridvsr.GridBody">GridBody</abbr></code> |
| `function` | npm |  | <code><abbr title="java.util.function.BiFunction">BiFunction</abbr><<abbr title="java.lang.Integer">Integer</abbr>, <abbr title="java.lang.Integer">Integer</abbr>, ? extends <abbr title="it.units.erallab.mrsim2d.core.functions.TimedRealFunction">TimedRealFunction</abbr>></code> |
| `signals` | i |  | <code>int</code> |
| `directional` | b | `false` | <code>boolean</code> |

Produces <code><abbr title="it.units.erallab.mrsim2d.core.agents.gridvsr.HomoDistributedNumGridVSR">HomoDistributedNumGridVSR</abbr></code>

### Builder `sim.agent.numIndependentVoxel()`

`s.a.numIndependentVoxel(sensors; function)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `sensors` | npm[] | `[]` | <code><abbr title="java.util.List">List</abbr><<abbr title="it.units.erallab.mrsim2d.core.Sensor">Sensor</abbr><? super <abbr title="it.units.erallab.mrsim2d.core.bodies.Voxel">Voxel</abbr>>></code> |
| `function` | npm |  | <code><abbr title="java.util.function.BiFunction">BiFunction</abbr><<abbr title="java.lang.Integer">Integer</abbr>, <abbr title="java.lang.Integer">Integer</abbr>, ? extends <abbr title="it.units.erallab.mrsim2d.core.functions.TimedRealFunction">TimedRealFunction</abbr>></code> |

Produces <code><abbr title="it.units.erallab.mrsim2d.core.agents.independentvoxel.NumIndependentVoxel">NumIndependentVoxel</abbr></code>

### Builder `sim.agent.numLeggedHybridModularRobot()`

`s.a.numLeggedHybridModularRobot(modules; function)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `modules` | npm[] | `[]` | <code><abbr title="java.util.List">List</abbr><<abbr title="it.units.erallab.mrsim2d.core.agents.legged.AbstractLeggedHybridModularRobot$Module">AbstractLeggedHybridModularRobot$Module</abbr>></code> |
| `function` | npm |  | <code><abbr title="java.util.function.BiFunction">BiFunction</abbr><<abbr title="java.lang.Integer">Integer</abbr>, <abbr title="java.lang.Integer">Integer</abbr>, ? extends <abbr title="it.units.erallab.mrsim2d.core.functions.TimedRealFunction">TimedRealFunction</abbr>></code> |

Produces <code><abbr title="it.units.erallab.mrsim2d.core.agents.legged.NumLeggedHybridModularRobot">NumLeggedHybridModularRobot</abbr></code>

## Package `sim.agent.legged`

Aliases: `s.a.l`, `s.a.legged`, `s.agent.l`, `s.agent.legged`, `sim.a.l`, `sim.a.legged`, `sim.agent.l`, `sim.agent.legged`

### Builder `sim.agent.legged.legChunk()`

`s.a.l.legChunk(trunkLength; width; mass; upConnector)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `trunkLength` | d | `1.5` | <code>double</code> |
| `width` | d | `1.0` | <code>double</code> |
| `mass` | d | `0.375` | <code>double</code> |
| `upConnector` | e | `RIGID` | <code><abbr title="it.units.erallab.mrsim2d.core.agents.legged.AbstractLeggedHybridModularRobot$Connector">AbstractLeggedHybridModularRobot$Connector</abbr></code> |

Produces <code><abbr title="it.units.erallab.mrsim2d.core.agents.legged.AbstractLeggedHybridModularRobot$LegChunk">AbstractLeggedHybridModularRobot$LegChunk</abbr></code>

### Builder `sim.agent.legged.module()`

`s.a.l.module(trunkLength; trunkWidth; trunkMass; legChunks; downConnector; rightConnector)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `trunkLength` | d | `4.0` | <code>double</code> |
| `trunkWidth` | d | `1.0` | <code>double</code> |
| `trunkMass` | d | `1.0` | <code>double</code> |
| `legChunks` | npm[] | `[]` | <code><abbr title="java.util.List">List</abbr><<abbr title="it.units.erallab.mrsim2d.core.agents.legged.AbstractLeggedHybridModularRobot$LegChunk">AbstractLeggedHybridModularRobot$LegChunk</abbr>></code> |
| `downConnector` | e | `RIGID` | <code><abbr title="it.units.erallab.mrsim2d.core.agents.legged.AbstractLeggedHybridModularRobot$Connector">AbstractLeggedHybridModularRobot$Connector</abbr></code> |
| `rightConnector` | e | `RIGID` | <code><abbr title="it.units.erallab.mrsim2d.core.agents.legged.AbstractLeggedHybridModularRobot$Connector">AbstractLeggedHybridModularRobot$Connector</abbr></code> |

Produces <code><abbr title="it.units.erallab.mrsim2d.core.agents.legged.AbstractLeggedHybridModularRobot$Module">AbstractLeggedHybridModularRobot$Module</abbr></code>

## Package `sim.function`

Aliases: `s.f`, `s.function`, `sim.f`, `sim.function`

### Builder `sim.function.diffIn()`

`s.f.diffIn(windowT; innerFunction; types)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `windowT` | d |  | <code>double</code> |
| `innerFunction` | npm |  | <code><abbr title="java.util.function.BiFunction">BiFunction</abbr><<abbr title="java.lang.Integer">Integer</abbr>, <abbr title="java.lang.Integer">Integer</abbr>, ? extends <abbr title="it.units.erallab.mrsim2d.core.functions.TimedRealFunction">TimedRealFunction</abbr>></code> |
| `types` | e[] | `[CURRENT, TREND, AVG]` | <code><abbr title="java.util.List">List</abbr><<abbr title="it.units.erallab.mrsim2d.core.functions.DiffInputTRF$Type">DiffInputTRF$Type</abbr>></code> |

Produces <code><abbr title="java.util.function.BiFunction">BiFunction</abbr><<abbr title="java.lang.Integer">Integer</abbr>, <abbr title="java.lang.Integer">Integer</abbr>, <abbr title="it.units.erallab.mrsim2d.core.functions.DiffInputTRF">DiffInputTRF</abbr>></code>

### Builder `sim.function.mlp()`

`s.f.mlp(innerLayerRatio; nOfInnerLayers; activationFunction)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `innerLayerRatio` | d | `0.65` | <code>double</code> |
| `nOfInnerLayers` | i | `1` | <code>int</code> |
| `activationFunction` | e | `TANH` | <code><abbr title="it.units.erallab.mrsim2d.core.functions.MultiLayerPerceptron$ActivationFunction">MultiLayerPerceptron$ActivationFunction</abbr></code> |

Produces <code><abbr title="java.util.function.BiFunction">BiFunction</abbr><<abbr title="java.lang.Integer">Integer</abbr>, <abbr title="java.lang.Integer">Integer</abbr>, <abbr title="it.units.erallab.mrsim2d.core.functions.MultiLayerPerceptron">MultiLayerPerceptron</abbr>></code>

### Builder `sim.function.sinP()`

`s.f.sinP(p; f; a)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `p` | npm | `sim.range(max=1.57;min=-1.57)` | <code><abbr title="it.units.erallab.mrsim2d.core.util.DoubleRange">DoubleRange</abbr></code> |
| `f` | npm | `sim.range(max=1.0;min=0.0)` | <code><abbr title="it.units.erallab.mrsim2d.core.util.DoubleRange">DoubleRange</abbr></code> |
| `a` | npm | `sim.range(max=1.0;min=0.0)` | <code><abbr title="it.units.erallab.mrsim2d.core.util.DoubleRange">DoubleRange</abbr></code> |

Produces <code><abbr title="java.util.function.BiFunction">BiFunction</abbr><<abbr title="java.lang.Integer">Integer</abbr>, <abbr title="java.lang.Integer">Integer</abbr>, <abbr title="it.units.erallab.mrsim2d.core.functions.Sinusoidal">Sinusoidal</abbr>></code>

### Builder `sim.function.sinPA()`

`s.f.sinPA(p; f; a)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `p` | npm | `sim.range(max=1.57;min=-1.57)` | <code><abbr title="it.units.erallab.mrsim2d.core.util.DoubleRange">DoubleRange</abbr></code> |
| `f` | npm | `sim.range(max=1.0;min=0.0)` | <code><abbr title="it.units.erallab.mrsim2d.core.util.DoubleRange">DoubleRange</abbr></code> |
| `a` | npm | `sim.range(max=1.0;min=0.0)` | <code><abbr title="it.units.erallab.mrsim2d.core.util.DoubleRange">DoubleRange</abbr></code> |

Produces <code><abbr title="java.util.function.BiFunction">BiFunction</abbr><<abbr title="java.lang.Integer">Integer</abbr>, <abbr title="java.lang.Integer">Integer</abbr>, <abbr title="it.units.erallab.mrsim2d.core.functions.Sinusoidal">Sinusoidal</abbr>></code>

### Builder `sim.function.sinPF()`

`s.f.sinPF(p; f; a)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `p` | npm | `sim.range(max=1.57;min=-1.57)` | <code><abbr title="it.units.erallab.mrsim2d.core.util.DoubleRange">DoubleRange</abbr></code> |
| `f` | npm | `sim.range(max=1.0;min=0.0)` | <code><abbr title="it.units.erallab.mrsim2d.core.util.DoubleRange">DoubleRange</abbr></code> |
| `a` | npm | `sim.range(max=1.0;min=0.0)` | <code><abbr title="it.units.erallab.mrsim2d.core.util.DoubleRange">DoubleRange</abbr></code> |

Produces <code><abbr title="java.util.function.BiFunction">BiFunction</abbr><<abbr title="java.lang.Integer">Integer</abbr>, <abbr title="java.lang.Integer">Integer</abbr>, <abbr title="it.units.erallab.mrsim2d.core.functions.Sinusoidal">Sinusoidal</abbr>></code>

### Builder `sim.function.sinPFA()`

`s.f.sinPFA(p; f; a)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `p` | npm | `sim.range(max=1.57;min=-1.57)` | <code><abbr title="it.units.erallab.mrsim2d.core.util.DoubleRange">DoubleRange</abbr></code> |
| `f` | npm | `sim.range(max=1.0;min=0.0)` | <code><abbr title="it.units.erallab.mrsim2d.core.util.DoubleRange">DoubleRange</abbr></code> |
| `a` | npm | `sim.range(max=1.0;min=0.0)` | <code><abbr title="it.units.erallab.mrsim2d.core.util.DoubleRange">DoubleRange</abbr></code> |

Produces <code><abbr title="java.util.function.BiFunction">BiFunction</abbr><<abbr title="java.lang.Integer">Integer</abbr>, <abbr title="java.lang.Integer">Integer</abbr>, <abbr title="it.units.erallab.mrsim2d.core.functions.Sinusoidal">Sinusoidal</abbr>></code>

### Builder `sim.function.stepOut()`

`s.f.stepOut(stepT; innerFunction)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `stepT` | d |  | <code>double</code> |
| `innerFunction` | npm |  | <code><abbr title="java.util.function.BiFunction">BiFunction</abbr><<abbr title="java.lang.Integer">Integer</abbr>, <abbr title="java.lang.Integer">Integer</abbr>, ? extends <abbr title="it.units.erallab.mrsim2d.core.functions.TimedRealFunction">TimedRealFunction</abbr>></code> |

Produces <code><abbr title="java.util.function.BiFunction">BiFunction</abbr><<abbr title="java.lang.Integer">Integer</abbr>, <abbr title="java.lang.Integer">Integer</abbr>, <abbr title="it.units.erallab.mrsim2d.core.functions.SteppedOutputTRF">SteppedOutputTRF</abbr>></code>

## Package `sim.sensor`

Aliases: `s.s`, `s.sensor`, `sim.s`, `sim.sensor`

### Builder `sim.sensor.a()`

`s.s.a()`

Produces <code><abbr title="it.units.erallab.mrsim2d.core.Sensor">Sensor</abbr><<abbr title="it.units.erallab.mrsim2d.core.bodies.Body">Body</abbr>></code>

### Builder `sim.sensor.ar()`

`s.s.ar()`

Produces <code><abbr title="it.units.erallab.mrsim2d.core.Sensor">Sensor</abbr><<abbr title="it.units.erallab.mrsim2d.core.bodies.SoftBody">SoftBody</abbr>></code>

### Builder `sim.sensor.c()`

`s.s.c()`

Produces <code><abbr title="it.units.erallab.mrsim2d.core.Sensor">Sensor</abbr><<abbr title="it.units.erallab.mrsim2d.core.bodies.Body">Body</abbr>></code>

### Builder `sim.sensor.d()`

`s.s.d(a; r)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `a` | d | `0.0` | <code><abbr title="java.lang.Double">Double</abbr></code> |
| `r` | d | `1.0` | <code><abbr title="java.lang.Double">Double</abbr></code> |

Produces <code><abbr title="it.units.erallab.mrsim2d.core.Sensor">Sensor</abbr><<abbr title="it.units.erallab.mrsim2d.core.bodies.Body">Body</abbr>></code>

### Builder `sim.sensor.rv()`

`s.s.rv(a)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `a` | d | `0.0` | <code><abbr title="java.lang.Double">Double</abbr></code> |

Produces <code><abbr title="it.units.erallab.mrsim2d.core.Sensor">Sensor</abbr><<abbr title="it.units.erallab.mrsim2d.core.bodies.Body">Body</abbr>></code>

### Builder `sim.sensor.sa()`

`s.s.sa(s)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `s` | e |  | <code><abbr title="it.units.erallab.mrsim2d.core.bodies.Voxel$Side">Voxel$Side</abbr></code> |

Produces <code><abbr title="it.units.erallab.mrsim2d.core.Sensor">Sensor</abbr><<abbr title="it.units.erallab.mrsim2d.core.bodies.Voxel">Voxel</abbr>></code>

### Builder `sim.sensor.sc()`

`s.s.sc(s)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `s` | e |  | <code><abbr title="it.units.erallab.mrsim2d.core.bodies.Voxel$Side">Voxel$Side</abbr></code> |

Produces <code><abbr title="it.units.erallab.mrsim2d.core.Sensor">Sensor</abbr><<abbr title="it.units.erallab.mrsim2d.core.bodies.Voxel">Voxel</abbr>></code>

### Builder `sim.sensor.sin()`

`s.s.sin(f; p)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `f` | d | `1.0` | <code><abbr title="java.lang.Double">Double</abbr></code> |
| `p` | d | `0.0` | <code><abbr title="java.lang.Double">Double</abbr></code> |

Produces <code><abbr title="it.units.erallab.mrsim2d.core.Sensor">Sensor</abbr><<abbr title="it.units.erallab.mrsim2d.core.bodies.Body">Body</abbr>></code>

## Package `sim.task`

Aliases: `s.task`, `sim.task`

### Builder `sim.task.fallPiling()`

`s.task.fallPiling(duration; fallInterval; nOfAgents; xSigmaRatio; randomGenerator; terrain; yGapRatio)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `duration` | d | `45.0` | <code>double</code> |
| `fallInterval` | d | `5.0` | <code>double</code> |
| `nOfAgents` | i |  | <code>int</code> |
| `xSigmaRatio` | d | `0.1` | <code>double</code> |
| `randomGenerator` | npm |  | <code><abbr title="java.util.random.RandomGenerator">RandomGenerator</abbr></code> |
| `terrain` | npm |  | <code><abbr title="it.units.erallab.mrsim2d.core.geometry.Terrain">Terrain</abbr></code> |
| `yGapRatio` | d | `1.0` | <code>double</code> |

Produces <code><abbr title="it.units.erallab.mrsim2d.core.tasks.piling.FallPiling">FallPiling</abbr></code>

### Builder `sim.task.locomotion()`

`s.task.locomotion(duration; terrain)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `duration` | d | `30.0` | <code>double</code> |
| `terrain` | npm | `terrain.flat()` | <code><abbr title="it.units.erallab.mrsim2d.core.geometry.Terrain">Terrain</abbr></code> |

Produces <code><abbr title="it.units.erallab.mrsim2d.core.tasks.locomotion.Locomotion">Locomotion</abbr></code>

### Builder `sim.task.standPiling()`

`s.task.standPiling(duration; nOfAgents; xGapRatio; terrain)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `duration` | d | `45.0` | <code>double</code> |
| `nOfAgents` | i |  | <code>int</code> |
| `xGapRatio` | d | `1.0` | <code>double</code> |
| `terrain` | npm |  | <code><abbr title="it.units.erallab.mrsim2d.core.geometry.Terrain">Terrain</abbr></code> |

Produces <code><abbr title="it.units.erallab.mrsim2d.core.tasks.piling.StandPiling">StandPiling</abbr></code>

## Package `sim.terrain`

Aliases: `s.t`, `s.terrain`, `sim.t`, `sim.terrain`

### Builder `sim.terrain.downhill()`

`s.t.downhill(w; h; borderW; borderH; a)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `w` | d | `2000.0` | <code><abbr title="java.lang.Double">Double</abbr></code> |
| `h` | d | `25.0` | <code><abbr title="java.lang.Double">Double</abbr></code> |
| `borderW` | d | `10.0` | <code><abbr title="java.lang.Double">Double</abbr></code> |
| `borderH` | d | `100.0` | <code><abbr title="java.lang.Double">Double</abbr></code> |
| `a` | d | `10.0` | <code><abbr title="java.lang.Double">Double</abbr></code> |

Produces <code><abbr title="it.units.erallab.mrsim2d.core.geometry.Terrain">Terrain</abbr></code>

### Builder `sim.terrain.flat()`

`s.t.flat(w; h; borderW; borderH)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `w` | d | `2000.0` | <code><abbr title="java.lang.Double">Double</abbr></code> |
| `h` | d | `25.0` | <code><abbr title="java.lang.Double">Double</abbr></code> |
| `borderW` | d | `10.0` | <code><abbr title="java.lang.Double">Double</abbr></code> |
| `borderH` | d | `100.0` | <code><abbr title="java.lang.Double">Double</abbr></code> |

Produces <code><abbr title="it.units.erallab.mrsim2d.core.geometry.Terrain">Terrain</abbr></code>

### Builder `sim.terrain.hilly()`

`s.t.hilly(w; h; borderW; borderH; chunkW; chunkH; seed)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `w` | d | `2000.0` | <code><abbr title="java.lang.Double">Double</abbr></code> |
| `h` | d | `25.0` | <code><abbr title="java.lang.Double">Double</abbr></code> |
| `borderW` | d | `10.0` | <code><abbr title="java.lang.Double">Double</abbr></code> |
| `borderH` | d | `100.0` | <code><abbr title="java.lang.Double">Double</abbr></code> |
| `chunkW` | d | `5.0` | <code><abbr title="java.lang.Double">Double</abbr></code> |
| `chunkH` | d | `1.0` | <code><abbr title="java.lang.Double">Double</abbr></code> |
| `seed` | i | `1` | <code><abbr title="java.lang.Integer">Integer</abbr></code> |

Produces <code><abbr title="it.units.erallab.mrsim2d.core.geometry.Terrain">Terrain</abbr></code>

### Builder `sim.terrain.steppy()`

`s.t.steppy(w; h; borderW; borderH; chunkW; chunkH; seed)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `w` | d | `2000.0` | <code><abbr title="java.lang.Double">Double</abbr></code> |
| `h` | d | `25.0` | <code><abbr title="java.lang.Double">Double</abbr></code> |
| `borderW` | d | `10.0` | <code><abbr title="java.lang.Double">Double</abbr></code> |
| `borderH` | d | `100.0` | <code><abbr title="java.lang.Double">Double</abbr></code> |
| `chunkW` | d | `2000.0` | <code><abbr title="java.lang.Double">Double</abbr></code> |
| `chunkH` | d | `25.0` | <code><abbr title="java.lang.Double">Double</abbr></code> |
| `seed` | i | `1` | <code><abbr title="java.lang.Integer">Integer</abbr></code> |

Produces <code><abbr title="it.units.erallab.mrsim2d.core.geometry.Terrain">Terrain</abbr></code>

### Builder `sim.terrain.uphill()`

`s.t.uphill(w; h; borderW; borderH; a)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `w` | d | `2000.0` | <code><abbr title="java.lang.Double">Double</abbr></code> |
| `h` | d | `25.0` | <code><abbr title="java.lang.Double">Double</abbr></code> |
| `borderW` | d | `10.0` | <code><abbr title="java.lang.Double">Double</abbr></code> |
| `borderH` | d | `100.0` | <code><abbr title="java.lang.Double">Double</abbr></code> |
| `a` | d | `10.0` | <code><abbr title="java.lang.Double">Double</abbr></code> |

Produces <code><abbr title="it.units.erallab.mrsim2d.core.geometry.Terrain">Terrain</abbr></code>

## Package `sim.vsr`

Aliases: `s.vsr`, `sim.vsr`

### Builder `sim.vsr.gridBody()`

`s.vsr.gridBody(shape; sensorizingFunction)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `shape` | npm |  | <code><abbr title="it.units.erallab.mrsim2d.core.util.Grid">Grid</abbr><<abbr title="java.lang.Boolean">Boolean</abbr>></code> |
| `sensorizingFunction` | npm |  | <code><abbr title="java.util.function.Function">Function</abbr><<abbr title="it.units.erallab.mrsim2d.core.util.Grid">Grid</abbr><<abbr title="java.lang.Boolean">Boolean</abbr>>, <abbr title="it.units.erallab.mrsim2d.core.util.Grid">Grid</abbr><<abbr title="java.util.List">List</abbr><<abbr title="it.units.erallab.mrsim2d.core.Sensor">Sensor</abbr><? super <abbr title="it.units.erallab.mrsim2d.core.bodies.Voxel">Voxel</abbr>>>>></code> |

Produces <code><abbr title="it.units.erallab.mrsim2d.core.agents.gridvsr.GridBody">GridBody</abbr></code>

## Package `sim.vsr.sensorizingFunction`

Aliases: `s.vsr.sensorizingFunction`, `s.vsr.sf`, `sim.vsr.sensorizingFunction`, `sim.vsr.sf`

### Builder `sim.vsr.sensorizingFunction.directional()`

`s.vsr.sf.directional(nSensors; eSensors; sSensors; wSensors; headSensors)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `nSensors` | npm[] | `[]` | <code><abbr title="java.util.List">List</abbr><<abbr title="it.units.erallab.mrsim2d.core.Sensor">Sensor</abbr><? super <abbr title="it.units.erallab.mrsim2d.core.bodies.Voxel">Voxel</abbr>>></code> |
| `eSensors` | npm[] | `[]` | <code><abbr title="java.util.List">List</abbr><<abbr title="it.units.erallab.mrsim2d.core.Sensor">Sensor</abbr><? super <abbr title="it.units.erallab.mrsim2d.core.bodies.Voxel">Voxel</abbr>>></code> |
| `sSensors` | npm[] | `[]` | <code><abbr title="java.util.List">List</abbr><<abbr title="it.units.erallab.mrsim2d.core.Sensor">Sensor</abbr><? super <abbr title="it.units.erallab.mrsim2d.core.bodies.Voxel">Voxel</abbr>>></code> |
| `wSensors` | npm[] | `[]` | <code><abbr title="java.util.List">List</abbr><<abbr title="it.units.erallab.mrsim2d.core.Sensor">Sensor</abbr><? super <abbr title="it.units.erallab.mrsim2d.core.bodies.Voxel">Voxel</abbr>>></code> |
| `headSensors` | npm[] | `[]` | <code><abbr title="java.util.List">List</abbr><<abbr title="it.units.erallab.mrsim2d.core.Sensor">Sensor</abbr><? super <abbr title="it.units.erallab.mrsim2d.core.bodies.Voxel">Voxel</abbr>>></code> |

Produces <code><abbr title="java.util.function.Function">Function</abbr><<abbr title="it.units.erallab.mrsim2d.core.util.Grid">Grid</abbr><<abbr title="java.lang.Boolean">Boolean</abbr>>, <abbr title="it.units.erallab.mrsim2d.core.util.Grid">Grid</abbr><<abbr title="java.util.List">List</abbr><<abbr title="it.units.erallab.mrsim2d.core.Sensor">Sensor</abbr><? super <abbr title="it.units.erallab.mrsim2d.core.bodies.Voxel">Voxel</abbr>>>>></code>

### Builder `sim.vsr.sensorizingFunction.empty()`

`s.vsr.sf.empty()`

Produces <code><abbr title="java.util.function.Function">Function</abbr><<abbr title="it.units.erallab.mrsim2d.core.util.Grid">Grid</abbr><<abbr title="java.lang.Boolean">Boolean</abbr>>, <abbr title="it.units.erallab.mrsim2d.core.util.Grid">Grid</abbr><<abbr title="java.util.List">List</abbr><<abbr title="it.units.erallab.mrsim2d.core.Sensor">Sensor</abbr><? super <abbr title="it.units.erallab.mrsim2d.core.bodies.Voxel">Voxel</abbr>>>>></code>

### Builder `sim.vsr.sensorizingFunction.uniform()`

`s.vsr.sf.uniform(sensors)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `sensors` | npm[] | `[]` | <code><abbr title="java.util.List">List</abbr><<abbr title="it.units.erallab.mrsim2d.core.Sensor">Sensor</abbr><? super <abbr title="it.units.erallab.mrsim2d.core.bodies.Voxel">Voxel</abbr>>></code> |

Produces <code><abbr title="java.util.function.Function">Function</abbr><<abbr title="it.units.erallab.mrsim2d.core.util.Grid">Grid</abbr><<abbr title="java.lang.Boolean">Boolean</abbr>>, <abbr title="it.units.erallab.mrsim2d.core.util.Grid">Grid</abbr><<abbr title="java.util.List">List</abbr><<abbr title="it.units.erallab.mrsim2d.core.Sensor">Sensor</abbr><? super <abbr title="it.units.erallab.mrsim2d.core.bodies.Voxel">Voxel</abbr>>>>></code>

## Package `sim.vsr.shape`

Aliases: `s.vsr.s`, `s.vsr.shape`, `sim.vsr.s`, `sim.vsr.shape`

### Builder `sim.vsr.shape.ball()`

`s.vsr.s.ball(d)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `d` | i |  | <code><abbr title="java.lang.Integer">Integer</abbr></code> |

Produces <code><abbr title="it.units.erallab.mrsim2d.core.util.Grid">Grid</abbr><<abbr title="java.lang.Boolean">Boolean</abbr>></code>

### Builder `sim.vsr.shape.biped()`

`s.vsr.s.biped(w; h)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `w` | i |  | <code><abbr title="java.lang.Integer">Integer</abbr></code> |
| `h` | i |  | <code><abbr title="java.lang.Integer">Integer</abbr></code> |

Produces <code><abbr title="it.units.erallab.mrsim2d.core.util.Grid">Grid</abbr><<abbr title="java.lang.Boolean">Boolean</abbr>></code>

### Builder `sim.vsr.shape.comb()`

`s.vsr.s.comb(w; h)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `w` | i |  | <code><abbr title="java.lang.Integer">Integer</abbr></code> |
| `h` | i |  | <code><abbr title="java.lang.Integer">Integer</abbr></code> |

Produces <code><abbr title="it.units.erallab.mrsim2d.core.util.Grid">Grid</abbr><<abbr title="java.lang.Boolean">Boolean</abbr>></code>

### Builder `sim.vsr.shape.free()`

`s.vsr.s.free(s)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `s` | s | `111-101` | <code><abbr title="java.lang.String">String</abbr></code> |

Produces <code><abbr title="it.units.erallab.mrsim2d.core.util.Grid">Grid</abbr><<abbr title="java.lang.Boolean">Boolean</abbr>></code>

### Builder `sim.vsr.shape.t()`

`s.vsr.s.t(w; h)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `w` | i |  | <code><abbr title="java.lang.Integer">Integer</abbr></code> |
| `h` | i |  | <code><abbr title="java.lang.Integer">Integer</abbr></code> |

Produces <code><abbr title="it.units.erallab.mrsim2d.core.util.Grid">Grid</abbr><<abbr title="java.lang.Boolean">Boolean</abbr>></code>

### Builder `sim.vsr.shape.triangle()`

`s.vsr.s.triangle(l)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `l` | i |  | <code><abbr title="java.lang.Integer">Integer</abbr></code> |

Produces <code><abbr title="it.units.erallab.mrsim2d.core.util.Grid">Grid</abbr><<abbr title="java.lang.Boolean">Boolean</abbr>></code>

### Builder `sim.vsr.shape.tripod()`

`s.vsr.s.tripod(w; h)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `w` | i |  | <code><abbr title="java.lang.Integer">Integer</abbr></code> |
| `h` | i |  | <code><abbr title="java.lang.Integer">Integer</abbr></code> |

Produces <code><abbr title="it.units.erallab.mrsim2d.core.util.Grid">Grid</abbr><<abbr title="java.lang.Boolean">Boolean</abbr>></code>

### Builder `sim.vsr.shape.worm()`

`s.vsr.s.worm(w; h)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `w` | i |  | <code><abbr title="java.lang.Integer">Integer</abbr></code> |
| `h` | i |  | <code><abbr title="java.lang.Integer">Integer</abbr></code> |

Produces <code><abbr title="it.units.erallab.mrsim2d.core.util.Grid">Grid</abbr><<abbr title="java.lang.Boolean">Boolean</abbr>></code>

## Package `solver`

Aliases: `so`, `solver`

### Builder `solver.doublesStandard()`

`so.doublesStandard(initialMinV; initialMaxV; crossoverP; sigmaMut; tournamentRate; minNTournament; nPop; nEval; diversity; remap)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `initialMinV` | d | `-1.0` | <code>double</code> |
| `initialMaxV` | d | `1.0` | <code>double</code> |
| `crossoverP` | d | `0.8` | <code>double</code> |
| `sigmaMut` | d | `0.35` | <code>double</code> |
| `tournamentRate` | d | `0.05` | <code>double</code> |
| `minNTournament` | i | `3` | <code>int</code> |
| `nPop` | i | `100` | <code>int</code> |
| `nEval` | i |  | <code>int</code> |
| `diversity` | b | `false` | <code>boolean</code> |
| `remap` | b | `false` | <code>boolean</code> |

Produces <code><abbr title="it.units.erallab.robotevo2d.main.builder.solver.DoublesStandard">DoublesStandard</abbr></code>

### Builder `solver.simpleES()`

`so.simpleES(initialMinV; initialMaxV; sigma; parentsRate; nOfElites; nPop; nEval; remap; qExtractor; goal)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `initialMinV` | d | `-1.0` | <code>double</code> |
| `initialMaxV` | d | `1.0` | <code>double</code> |
| `sigma` | d | `0.35` | <code>double</code> |
| `parentsRate` | d | `0.33` | <code>double</code> |
| `nOfElites` | i | `1` | <code>int</code> |
| `nPop` | i | `30` | <code>int</code> |
| `nEval` | i |  | <code>int</code> |
| `remap` | b | `false` | <code>boolean</code> |
| `qExtractor` | npm |  | <code><abbr title="java.util.function.Function">Function</abbr><?, <abbr title="java.lang.Double">Double</abbr>></code> |
| `goal` | s | `min` | <code><abbr title="java.lang.String">String</abbr></code> |

Produces <code><abbr title="it.units.erallab.robotevo2d.main.builder.solver.SimpleES">SimpleES</abbr></code>

