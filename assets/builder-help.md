## Package `dynamicalSystem`

Aliases: `ds`, `dynSys`, `dynamicalSystem`

### Builder `dynamicalSystem.defaultRG()`

`ds.defaultRG(seed)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `seed` | i | `0` | <code>int</code> |

Produces <code><abbr title="java.util.random.RandomGenerator">RandomGenerator</abbr></code>; built from `io.github.ericmedvet.jsdynsym.buildable.builders.Misc.defaultRG()` by jsdynsym-buildable:0.10.8-SNAPSHOT:2024-02-26T23:32:39Z

### Builder `dynamicalSystem.grid()`

`ds.grid(w; h; items)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `w` | i |  | <code>int</code> |
| `h` | i |  | <code>int</code> |
| `items` | npm[] | `[]` | <code><abbr title="java.util.List">List</abbr>&lt;T&gt;</code> |

Produces <code><abbr title="io.github.ericmedvet.jnb.datastructure.Grid">Grid</abbr>&lt;T&gt;</code>; built from `io.github.ericmedvet.jsdynsym.buildable.builders.Misc.grid()` by jsdynsym-buildable:0.10.8-SNAPSHOT:2024-02-26T23:32:39Z

### Builder `dynamicalSystem.range()`

`ds.range(min; max)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `min` | d |  | <code>double</code> |
| `max` | d |  | <code>double</code> |

Produces <code><abbr title="io.github.ericmedvet.jnb.datastructure.DoubleRange">DoubleRange</abbr></code>; built from `io.github.ericmedvet.jsdynsym.buildable.builders.Misc.range()` by jsdynsym-buildable:0.10.8-SNAPSHOT:2024-02-26T23:32:39Z

## Package `dynamicalSystem.num`

Aliases: `ds.num`, `dynSys.num`, `dynamicalSystem.num`

### Builder `dynamicalSystem.num.drn()`

`ds.num.drn(timeRange; innerNeuronsRatio; activationFunction; threshold; timeResolution)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `timeRange` | npm | `ds.range(min = 0; max = 1)` | <code><abbr title="io.github.ericmedvet.jnb.datastructure.DoubleRange">DoubleRange</abbr></code> |
| `innerNeuronsRatio` | d | `1.0` | <code>double</code> |
| `activationFunction` | e | `TANH` | <code><abbr title="io.github.ericmedvet.jsdynsym.core.numerical.ann.MultiLayerPerceptron$ActivationFunction">MultiLayerPerceptron$ActivationFunction</abbr></code> |
| `threshold` | d | `0.1` | <code>double</code> |
| `timeResolution` | d | `0.16666` | <code>double</code> |

Produces <code><abbr title="io.github.ericmedvet.jsdynsym.buildable.builders.NumericalDynamicalSystems$Builder">NumericalDynamicalSystems$Builder</abbr>&lt;<abbr title="io.github.ericmedvet.jsdynsym.core.numerical.ann.DelayedRecurrentNetwork">DelayedRecurrentNetwork</abbr>, <abbr title="io.github.ericmedvet.jsdynsym.core.numerical.ann.DelayedRecurrentNetwork$State">DelayedRecurrentNetwork$State</abbr>&gt;</code>; built from `io.github.ericmedvet.jsdynsym.buildable.builders.NumericalDynamicalSystems.drn()` by jsdynsym-buildable:0.10.8-SNAPSHOT:2024-02-26T23:32:39Z

### Builder `dynamicalSystem.num.enhanced()`

`ds.num.enhanced(windowT; inner; types)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `windowT` | d |  | <code>double</code> |
| `inner` | npm |  | <code><abbr title="io.github.ericmedvet.jsdynsym.buildable.builders.NumericalDynamicalSystems$Builder">NumericalDynamicalSystems$Builder</abbr>&lt;? extends <abbr title="io.github.ericmedvet.jsdynsym.core.numerical.NumericalDynamicalSystem">NumericalDynamicalSystem</abbr>&lt;S&gt;, S&gt;</code> |
| `types` | e[] | `[CURRENT, TREND, AVG]` | <code><abbr title="java.util.List">List</abbr>&lt;<abbr title="io.github.ericmedvet.jsdynsym.core.numerical.EnhancedInput$Type">EnhancedInput$Type</abbr>&gt;</code> |

Produces <code><abbr title="io.github.ericmedvet.jsdynsym.buildable.builders.NumericalDynamicalSystems$Builder">NumericalDynamicalSystems$Builder</abbr>&lt;<abbr title="io.github.ericmedvet.jsdynsym.core.numerical.EnhancedInput">EnhancedInput</abbr>&lt;S&gt;, S&gt;</code>; built from `io.github.ericmedvet.jsdynsym.buildable.builders.NumericalDynamicalSystems.enhanced()` by jsdynsym-buildable:0.10.8-SNAPSHOT:2024-02-26T23:32:39Z

### Builder `dynamicalSystem.num.inStepped()`

`ds.num.inStepped(stepT; inner)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `stepT` | d | `1.0` | <code>double</code> |
| `inner` | npm |  | <code><abbr title="io.github.ericmedvet.jsdynsym.buildable.builders.NumericalDynamicalSystems$Builder">NumericalDynamicalSystems$Builder</abbr>&lt;? extends <abbr title="io.github.ericmedvet.jsdynsym.core.numerical.NumericalDynamicalSystem">NumericalDynamicalSystem</abbr>&lt;S&gt;, S&gt;</code> |

Produces <code><abbr title="io.github.ericmedvet.jsdynsym.buildable.builders.NumericalDynamicalSystems$Builder">NumericalDynamicalSystems$Builder</abbr>&lt;<abbr title="io.github.ericmedvet.jsdynsym.core.numerical.NumericalDynamicalSystem">NumericalDynamicalSystem</abbr>&lt;<abbr title="io.github.ericmedvet.jsdynsym.core.composed.Stepped$State">Stepped$State</abbr>&lt;S&gt;&gt;, <abbr title="io.github.ericmedvet.jsdynsym.core.composed.Stepped$State">Stepped$State</abbr>&lt;S&gt;&gt;</code>; built from `io.github.ericmedvet.jsdynsym.buildable.builders.NumericalDynamicalSystems.inStepped()` by jsdynsym-buildable:0.10.8-SNAPSHOT:2024-02-26T23:32:39Z

### Builder `dynamicalSystem.num.mlp()`

`ds.num.mlp(innerLayerRatio; nOfInnerLayers; activationFunction)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `innerLayerRatio` | d | `0.65` | <code>double</code> |
| `nOfInnerLayers` | i | `1` | <code>int</code> |
| `activationFunction` | e | `TANH` | <code><abbr title="io.github.ericmedvet.jsdynsym.core.numerical.ann.MultiLayerPerceptron$ActivationFunction">MultiLayerPerceptron$ActivationFunction</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.jsdynsym.buildable.builders.NumericalDynamicalSystems$Builder">NumericalDynamicalSystems$Builder</abbr>&lt;<abbr title="io.github.ericmedvet.jsdynsym.core.numerical.ann.MultiLayerPerceptron">MultiLayerPerceptron</abbr>, <abbr title="io.github.ericmedvet.jsdynsym.core.StatelessSystem$State">StatelessSystem$State</abbr>&gt;</code>; built from `io.github.ericmedvet.jsdynsym.buildable.builders.NumericalDynamicalSystems.mlp()` by jsdynsym-buildable:0.10.8-SNAPSHOT:2024-02-26T23:32:39Z

### Builder `dynamicalSystem.num.noised()`

`ds.num.noised(inputSigma; outputSigma; randomGenerator; inner)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `inputSigma` | d | `0.0` | <code>double</code> |
| `outputSigma` | d | `0.0` | <code>double</code> |
| `randomGenerator` | npm | `ds.defaultRG()` | <code><abbr title="java.util.random.RandomGenerator">RandomGenerator</abbr></code> |
| `inner` | npm |  | <code><abbr title="io.github.ericmedvet.jsdynsym.buildable.builders.NumericalDynamicalSystems$Builder">NumericalDynamicalSystems$Builder</abbr>&lt;? extends <abbr title="io.github.ericmedvet.jsdynsym.core.numerical.NumericalDynamicalSystem">NumericalDynamicalSystem</abbr>&lt;S&gt;, S&gt;</code> |

Produces <code><abbr title="io.github.ericmedvet.jsdynsym.buildable.builders.NumericalDynamicalSystems$Builder">NumericalDynamicalSystems$Builder</abbr>&lt;<abbr title="io.github.ericmedvet.jsdynsym.core.numerical.Noised">Noised</abbr>&lt;S&gt;, S&gt;</code>; built from `io.github.ericmedvet.jsdynsym.buildable.builders.NumericalDynamicalSystems.noised()` by jsdynsym-buildable:0.10.8-SNAPSHOT:2024-02-26T23:32:39Z

### Builder `dynamicalSystem.num.outStepped()`

`ds.num.outStepped(stepT; inner)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `stepT` | d | `1.0` | <code>double</code> |
| `inner` | npm |  | <code><abbr title="io.github.ericmedvet.jsdynsym.buildable.builders.NumericalDynamicalSystems$Builder">NumericalDynamicalSystems$Builder</abbr>&lt;? extends <abbr title="io.github.ericmedvet.jsdynsym.core.numerical.NumericalDynamicalSystem">NumericalDynamicalSystem</abbr>&lt;S&gt;, S&gt;</code> |

Produces <code><abbr title="io.github.ericmedvet.jsdynsym.buildable.builders.NumericalDynamicalSystems$Builder">NumericalDynamicalSystems$Builder</abbr>&lt;<abbr title="io.github.ericmedvet.jsdynsym.core.numerical.NumericalDynamicalSystem">NumericalDynamicalSystem</abbr>&lt;<abbr title="io.github.ericmedvet.jsdynsym.core.composed.Stepped$State">Stepped$State</abbr>&lt;S&gt;&gt;, <abbr title="io.github.ericmedvet.jsdynsym.core.composed.Stepped$State">Stepped$State</abbr>&lt;S&gt;&gt;</code>; built from `io.github.ericmedvet.jsdynsym.buildable.builders.NumericalDynamicalSystems.outStepped()` by jsdynsym-buildable:0.10.8-SNAPSHOT:2024-02-26T23:32:39Z

### Builder `dynamicalSystem.num.sin()`

`ds.num.sin(p; f; a; b)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `p` | npm | `ds.range(min = -1.57; max = 1.57)` | <code><abbr title="io.github.ericmedvet.jnb.datastructure.DoubleRange">DoubleRange</abbr></code> |
| `f` | npm | `ds.range(min = 0; max = 1)` | <code><abbr title="io.github.ericmedvet.jnb.datastructure.DoubleRange">DoubleRange</abbr></code> |
| `a` | npm | `ds.range(min = 0; max = 1)` | <code><abbr title="io.github.ericmedvet.jnb.datastructure.DoubleRange">DoubleRange</abbr></code> |
| `b` | npm | `ds.range(min = -0.5; max = 0.5)` | <code><abbr title="io.github.ericmedvet.jnb.datastructure.DoubleRange">DoubleRange</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.jsdynsym.buildable.builders.NumericalDynamicalSystems$Builder">NumericalDynamicalSystems$Builder</abbr>&lt;<abbr title="io.github.ericmedvet.jsdynsym.core.numerical.Sinusoidal">Sinusoidal</abbr>, <abbr title="io.github.ericmedvet.jsdynsym.core.StatelessSystem$State">StatelessSystem$State</abbr>&gt;</code>; built from `io.github.ericmedvet.jsdynsym.buildable.builders.NumericalDynamicalSystems.sin()` by jsdynsym-buildable:0.10.8-SNAPSHOT:2024-02-26T23:32:39Z

### Builder `dynamicalSystem.num.stepped()`

`ds.num.stepped(stepT; inner)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `stepT` | d | `1.0` | <code>double</code> |
| `inner` | npm |  | <code><abbr title="io.github.ericmedvet.jsdynsym.buildable.builders.NumericalDynamicalSystems$Builder">NumericalDynamicalSystems$Builder</abbr>&lt;? extends <abbr title="io.github.ericmedvet.jsdynsym.core.numerical.NumericalDynamicalSystem">NumericalDynamicalSystem</abbr>&lt;S&gt;, S&gt;</code> |

Produces <code><abbr title="io.github.ericmedvet.jsdynsym.buildable.builders.NumericalDynamicalSystems$Builder">NumericalDynamicalSystems$Builder</abbr>&lt;<abbr title="io.github.ericmedvet.jsdynsym.core.numerical.NumericalDynamicalSystem">NumericalDynamicalSystem</abbr>&lt;<abbr title="io.github.ericmedvet.jsdynsym.core.composed.Stepped$State">Stepped$State</abbr>&lt;S&gt;&gt;, <abbr title="io.github.ericmedvet.jsdynsym.core.composed.Stepped$State">Stepped$State</abbr>&lt;S&gt;&gt;</code>; built from `io.github.ericmedvet.jsdynsym.buildable.builders.NumericalDynamicalSystems.stepped()` by jsdynsym-buildable:0.10.8-SNAPSHOT:2024-02-26T23:32:39Z

## Package `ea`

### Builder `ea.experiment()`

`ea.experiment(name; runs; listeners)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `name` | s | `` | <code><abbr title="java.lang.String">String</abbr></code> |
| `runs` | npm[] | `[]` | <code><abbr title="java.util.List">List</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.experimenter.Run">Run</abbr>&lt;?, ?, ?, ?&gt;&gt;</code> |
| `listeners` | npm[] | `[ea.l.console()]` | <code><abbr title="java.util.List">List</abbr>&lt;<abbr title="java.util.function.BiFunction">BiFunction</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.experimenter.Experiment">Experiment</abbr>, <abbr title="java.util.concurrent.ExecutorService">ExecutorService</abbr>, <abbr title="io.github.ericmedvet.jgea.core.listener.ListenerFactory">ListenerFactory</abbr>&lt;? super <abbr title="io.github.ericmedvet.jgea.core.solver.POCPopulationState">POCPopulationState</abbr>&lt;?, ?, ?, ?, ?&gt;, <abbr title="io.github.ericmedvet.jgea.experimenter.Run">Run</abbr>&lt;?, ?, ?, ?&gt;&gt;&gt;&gt;</code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.experimenter.Experiment">Experiment</abbr></code>; built from `io.github.ericmedvet.jgea.experimenter.Experiment()` by jgea-experimenter:2.5.2-SNAPSHOT:2024-02-26T23:37:48Z

### Builder `ea.run()`

`ea.run(name; solver; problem; randomGenerator)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `name` | s | `` | <code><abbr title="java.lang.String">String</abbr></code> |
| `solver` | npm |  | <code><abbr title="java.util.function.Function">Function</abbr>&lt;S, ? extends <abbr title="io.github.ericmedvet.jgea.core.solver.AbstractPopulationBasedIterativeSolver">AbstractPopulationBasedIterativeSolver</abbr>&lt;? extends <abbr title="io.github.ericmedvet.jgea.core.solver.POCPopulationState">POCPopulationState</abbr>&lt;?, G, S, Q, P&gt;, P, ?, G, S, Q&gt;&gt;</code> |
| `problem` | npm |  | <code>P</code> |
| `randomGenerator` | npm |  | <code><abbr title="java.util.random.RandomGenerator">RandomGenerator</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.experimenter.Run">Run</abbr></code>; built from `io.github.ericmedvet.jgea.experimenter.Run()` by jgea-experimenter:2.5.2-SNAPSHOT:2024-02-26T23:37:48Z

### Builder `ea.runOutcome()`

`ea.runOutcome(index; run; serializedGenotypes)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `index` | s |  | <code><abbr title="java.lang.String">String</abbr></code> |
| `run` | npm |  | <code><abbr title="io.github.ericmedvet.jgea.experimenter.Run">Run</abbr>&lt;?, ?, ?, ?&gt;</code> |
| `serializedGenotypes` | s[] | `[]` | <code><abbr title="java.util.List">List</abbr>&lt;<abbr title="java.lang.String">String</abbr>&gt;</code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.experimenter.RunOutcome">RunOutcome</abbr></code>; built from `io.github.ericmedvet.jgea.experimenter.RunOutcome()` by jgea-experimenter:2.5.2-SNAPSHOT:2024-02-26T23:37:48Z

## Package `ea.drawer`

Aliases: `ea.d`, `ea.drawer`

### Builder `ea.drawer.navigationOutcome()`

`ea.d.navigationOutcome()`

Produces <code><abbr title="io.github.ericmedvet.jgea.problem.control.navigation.OutcomeDrawer">OutcomeDrawer</abbr></code>; built from `io.github.ericmedvet.jgea.experimenter.builders.Drawers.navigationOutcome()` by jgea-experimenter:2.5.2-SNAPSHOT:2024-02-26T23:37:48Z

## Package `ea.function`

Aliases: `ea.f`, `ea.function`

### Builder `ea.function.fromBase64()`

`ea.f.fromBase64()`

Produces <code><abbr title="java.util.function.Function">Function</abbr>&lt;<abbr title="java.lang.String">String</abbr>, <abbr title="java.lang.Object">Object</abbr>&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.Functions.fromBase64()` by jgea-experimenter:2.5.2-SNAPSHOT:2024-02-26T23:37:48Z

### Builder `ea.function.identity()`

`ea.f.identity()`

Produces <code><abbr title="java.util.function.Function">Function</abbr>&lt;T, T&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.Functions.identity()` by jgea-experimenter:2.5.2-SNAPSHOT:2024-02-26T23:37:48Z

## Package `ea.grammar`

### Builder `ea.grammar.gridBundled()`

`ea.grammar.gridBundled(name)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `name` | s |  | <code><abbr title="java.lang.String">String</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.core.representation.grammar.grid.GridGrammar">GridGrammar</abbr>&lt;<abbr title="java.lang.Character">Character</abbr>&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.Grammars.gridBundled()` by jgea-experimenter:2.5.2-SNAPSHOT:2024-02-26T23:37:48Z

## Package `ea.listener`

Aliases: `ea.l`, `ea.listener`

### Builder `ea.listener.allCsv()`

`ea.l.allCsv(filePath; defaultFunctions; functions; individualFunctions; runKeys; deferred; onlyLast; condition)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `filePath` | s |  | <code><abbr title="java.lang.String">String</abbr></code> |
| `defaultFunctions` | npm[] | `[ea.nf.iterations()]` | <code><abbr title="java.util.List">List</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;? super <abbr title="io.github.ericmedvet.jgea.core.solver.POCPopulationState">POCPopulationState</abbr>&lt;?, G, S, Q, ?&gt;, ?&gt;&gt;</code> |
| `functions` | npm[] | `[]` | <code><abbr title="java.util.List">List</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;? super <abbr title="io.github.ericmedvet.jgea.core.solver.POCPopulationState">POCPopulationState</abbr>&lt;?, G, S, Q, ?&gt;, ?&gt;&gt;</code> |
| `individualFunctions` | npm[] | `[]` | <code><abbr title="java.util.List">List</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;? super <abbr title="io.github.ericmedvet.jgea.core.solver.Individual">Individual</abbr>&lt;G, S, Q&gt;, ?&gt;&gt;</code> |
| `runKeys` | npm[] | `[]` | <code><abbr title="java.util.List">List</abbr>&lt;<abbr title="java.util.Map$Entry">Map$Entry</abbr>&lt;<abbr title="java.lang.String">String</abbr>, <abbr title="java.lang.String">String</abbr>&gt;&gt;</code> |
| `deferred` | b | `false` | <code>boolean</code> |
| `onlyLast` | b | `false` | <code>boolean</code> |
| `condition` | npm | `ea.predicate.always()` | <code><abbr title="java.util.function.Predicate">Predicate</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.experimenter.Run">Run</abbr>&lt;?, G, S, Q&gt;&gt;</code> |

Produces <code><abbr title="java.util.function.BiFunction">BiFunction</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.experimenter.Experiment">Experiment</abbr>, <abbr title="java.util.concurrent.ExecutorService">ExecutorService</abbr>, <abbr title="io.github.ericmedvet.jgea.core.listener.ListenerFactory">ListenerFactory</abbr>&lt;? super <abbr title="io.github.ericmedvet.jgea.core.solver.POCPopulationState">POCPopulationState</abbr>&lt;?, G, S, Q, ?&gt;, <abbr title="io.github.ericmedvet.jgea.experimenter.Run">Run</abbr>&lt;?, G, S, Q&gt;&gt;&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.Listeners.allCsv()` by jgea-experimenter:2.5.2-SNAPSHOT:2024-02-26T23:37:48Z

### Builder `ea.listener.bestCsv()`

`ea.l.bestCsv(filePath; defaultFunctions; functions; runKeys; deferred; onlyLast; condition)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `filePath` | s |  | <code><abbr title="java.lang.String">String</abbr></code> |
| `defaultFunctions` | npm[] | `[ea.nf.iterations(), ea.nf.evals(), ea.nf.births(), ea.nf.elapsed(), ea.nf.size(f = ea.nf.all()), ea.nf.size(f = ea.nf.firsts()), ea.nf.size(f = ea.nf.lasts()), ea.nf.uniqueness(collection = ea.nf.each(collection = ea.nf.all(); map = ea.nf.genotype())), ea.nf.uniqueness(collection = ea.nf.each(collection = ea.nf.all(); map = ea.nf.solution())), ea.nf.uniqueness(collection = ea.nf.each(collection = ea.nf.all(); map = ea.nf.fitness()))]` | <code><abbr title="java.util.List">List</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;? super <abbr title="io.github.ericmedvet.jgea.core.solver.POCPopulationState">POCPopulationState</abbr>&lt;?, G, S, Q, ?&gt;, ?&gt;&gt;</code> |
| `functions` | npm[] | `[]` | <code><abbr title="java.util.List">List</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;? super <abbr title="io.github.ericmedvet.jgea.core.solver.POCPopulationState">POCPopulationState</abbr>&lt;?, G, S, Q, ?&gt;, ?&gt;&gt;</code> |
| `runKeys` | npm[] | `[]` | <code><abbr title="java.util.List">List</abbr>&lt;<abbr title="java.util.Map$Entry">Map$Entry</abbr>&lt;<abbr title="java.lang.String">String</abbr>, <abbr title="java.lang.String">String</abbr>&gt;&gt;</code> |
| `deferred` | b | `false` | <code>boolean</code> |
| `onlyLast` | b | `false` | <code>boolean</code> |
| `condition` | npm | `ea.predicate.always()` | <code><abbr title="java.util.function.Predicate">Predicate</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.experimenter.Run">Run</abbr>&lt;?, G, S, Q&gt;&gt;</code> |

Produces <code><abbr title="java.util.function.BiFunction">BiFunction</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.experimenter.Experiment">Experiment</abbr>, <abbr title="java.util.concurrent.ExecutorService">ExecutorService</abbr>, <abbr title="io.github.ericmedvet.jgea.core.listener.ListenerFactory">ListenerFactory</abbr>&lt;? super <abbr title="io.github.ericmedvet.jgea.core.solver.POCPopulationState">POCPopulationState</abbr>&lt;?, G, S, Q, ?&gt;, <abbr title="io.github.ericmedvet.jgea.experimenter.Run">Run</abbr>&lt;?, G, S, Q&gt;&gt;&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.Listeners.bestCsv()` by jgea-experimenter:2.5.2-SNAPSHOT:2024-02-26T23:37:48Z

### Builder `ea.listener.console()`

`ea.l.console(defaultFunctions; functions; runKeys; deferred; onlyLast; condition)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `defaultFunctions` | npm[] | `[ea.nf.iterations(), ea.nf.evals(), ea.nf.births(), ea.nf.elapsed(), ea.nf.size(f = ea.nf.all()), ea.nf.size(f = ea.nf.firsts()), ea.nf.size(f = ea.nf.lasts()), ea.nf.uniqueness(collection = ea.nf.each(collection = ea.nf.all(); map = ea.nf.genotype())), ea.nf.uniqueness(collection = ea.nf.each(collection = ea.nf.all(); map = ea.nf.solution())), ea.nf.uniqueness(collection = ea.nf.each(collection = ea.nf.all(); map = ea.nf.fitness()))]` | <code><abbr title="java.util.List">List</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;? super <abbr title="io.github.ericmedvet.jgea.core.solver.POCPopulationState">POCPopulationState</abbr>&lt;?, G, S, Q, ?&gt;, ?&gt;&gt;</code> |
| `functions` | npm[] | `[]` | <code><abbr title="java.util.List">List</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;? super <abbr title="io.github.ericmedvet.jgea.core.solver.POCPopulationState">POCPopulationState</abbr>&lt;?, G, S, Q, ?&gt;, ?&gt;&gt;</code> |
| `runKeys` | npm[] | `[]` | <code><abbr title="java.util.List">List</abbr>&lt;<abbr title="java.util.Map$Entry">Map$Entry</abbr>&lt;<abbr title="java.lang.String">String</abbr>, <abbr title="java.lang.String">String</abbr>&gt;&gt;</code> |
| `deferred` | b | `false` | <code>boolean</code> |
| `onlyLast` | b | `false` | <code>boolean</code> |
| `condition` | npm | `ea.predicate.always()` | <code><abbr title="java.util.function.Predicate">Predicate</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.experimenter.Run">Run</abbr>&lt;?, G, S, Q&gt;&gt;</code> |

Produces <code><abbr title="java.util.function.BiFunction">BiFunction</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.experimenter.Experiment">Experiment</abbr>, <abbr title="java.util.concurrent.ExecutorService">ExecutorService</abbr>, <abbr title="io.github.ericmedvet.jgea.core.listener.ListenerFactory">ListenerFactory</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.solver.POCPopulationState">POCPopulationState</abbr>&lt;?, G, S, Q, ?&gt;, <abbr title="io.github.ericmedvet.jgea.experimenter.Run">Run</abbr>&lt;?, G, S, Q&gt;&gt;&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.Listeners.console()` by jgea-experimenter:2.5.2-SNAPSHOT:2024-02-26T23:37:48Z

### Builder `ea.listener.expPlotSaver()`

`ea.l.expPlotSaver(plot; type; w; h; freeScales; filePath; saveCsvDataMode; condition)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `plot` | npm |  | <code><abbr title="io.github.ericmedvet.jgea.core.listener.AccumulatorFactory">AccumulatorFactory</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.solver.POCPopulationState">POCPopulationState</abbr>&lt;?, G, S, Q, ?&gt;, <abbr title="io.github.ericmedvet.jviz.core.plot.XYPlot">XYPlot</abbr>&lt;?&gt;, <abbr title="io.github.ericmedvet.jgea.experimenter.Run">Run</abbr>&lt;?, G, S, Q&gt;&gt;</code> |
| `type` | e |  | <code><abbr title="io.github.ericmedvet.jviz.core.plot.Plotter$Type">Plotter$Type</abbr></code> |
| `w` | i | `800` | <code>int</code> |
| `h` | i | `800` | <code>int</code> |
| `freeScales` | b | `false` | <code>boolean</code> |
| `filePath` | s |  | <code><abbr title="java.lang.String">String</abbr></code> |
| `saveCsvDataMode` | e | `NONE` | <code><abbr title="io.github.ericmedvet.jviz.core.plot.CsvPlotter$Mode">CsvPlotter$Mode</abbr></code> |
| `condition` | npm | `ea.predicate.always()` | <code><abbr title="java.util.function.Predicate">Predicate</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.experimenter.Run">Run</abbr>&lt;?, G, S, Q&gt;&gt;</code> |

Produces <code><abbr title="java.util.function.BiFunction">BiFunction</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.experimenter.Experiment">Experiment</abbr>, <abbr title="java.util.concurrent.ExecutorService">ExecutorService</abbr>, <abbr title="io.github.ericmedvet.jgea.core.listener.ListenerFactory">ListenerFactory</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.solver.POCPopulationState">POCPopulationState</abbr>&lt;?, G, S, Q, ?&gt;, <abbr title="io.github.ericmedvet.jgea.experimenter.Run">Run</abbr>&lt;?, G, S, Q&gt;&gt;&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.Listeners.expPlotSaver()` by jgea-experimenter:2.5.2-SNAPSHOT:2024-02-26T23:37:48Z

### Builder `ea.listener.net()`

`ea.l.net(defaultFunctions; functions; runKeys; serverAddress; serverPort; serverKeyFilePath; pollInterval; condition)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `defaultFunctions` | npm[] | `[ea.nf.iterations(), ea.nf.evals(), ea.nf.births(), ea.nf.elapsed(), ea.nf.size(f = ea.nf.all()), ea.nf.size(f = ea.nf.firsts()), ea.nf.size(f = ea.nf.lasts()), ea.nf.uniqueness(collection = ea.nf.each(collection = ea.nf.all(); map = ea.nf.genotype())), ea.nf.uniqueness(collection = ea.nf.each(collection = ea.nf.all(); map = ea.nf.solution())), ea.nf.uniqueness(collection = ea.nf.each(collection = ea.nf.all(); map = ea.nf.fitness()))]` | <code><abbr title="java.util.List">List</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;? super <abbr title="io.github.ericmedvet.jgea.core.solver.POCPopulationState">POCPopulationState</abbr>&lt;?, G, S, Q, ?&gt;, ?&gt;&gt;</code> |
| `functions` | npm[] | `[]` | <code><abbr title="java.util.List">List</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;? super <abbr title="io.github.ericmedvet.jgea.core.solver.POCPopulationState">POCPopulationState</abbr>&lt;?, G, S, Q, ?&gt;, ?&gt;&gt;</code> |
| `runKeys` | npm[] | `[]` | <code><abbr title="java.util.List">List</abbr>&lt;<abbr title="java.util.Map$Entry">Map$Entry</abbr>&lt;<abbr title="java.lang.String">String</abbr>, <abbr title="java.lang.String">String</abbr>&gt;&gt;</code> |
| `serverAddress` | s | `127.0.0.1` | <code><abbr title="java.lang.String">String</abbr></code> |
| `serverPort` | i | `10979` | <code>int</code> |
| `serverKeyFilePath` | s |  | <code><abbr title="java.lang.String">String</abbr></code> |
| `pollInterval` | d | `1.0` | <code>double</code> |
| `condition` | npm | `ea.predicate.always()` | <code><abbr title="java.util.function.Predicate">Predicate</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.experimenter.Run">Run</abbr>&lt;?, G, S, Q&gt;&gt;</code> |

Produces <code><abbr title="java.util.function.BiFunction">BiFunction</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.experimenter.Experiment">Experiment</abbr>, <abbr title="java.util.concurrent.ExecutorService">ExecutorService</abbr>, <abbr title="io.github.ericmedvet.jgea.core.listener.ListenerFactory">ListenerFactory</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.solver.POCPopulationState">POCPopulationState</abbr>&lt;?, G, S, Q, ?&gt;, <abbr title="io.github.ericmedvet.jgea.experimenter.Run">Run</abbr>&lt;?, G, S, Q&gt;&gt;&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.Listeners.net()` by jgea-experimenter:2.5.2-SNAPSHOT:2024-02-26T23:37:48Z

### Builder `ea.listener.outcomeSaver()`

`ea.l.outcomeSaver(filePathTemplate; deferred; condition)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `filePathTemplate` | s | `run-outcome-{index:%04d}.txt` | <code><abbr title="java.lang.String">String</abbr></code> |
| `deferred` | b | `true` | <code>boolean</code> |
| `condition` | npm | `ea.predicate.always()` | <code><abbr title="java.util.function.Predicate">Predicate</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.experimenter.Run">Run</abbr>&lt;?, G, S, Q&gt;&gt;</code> |

Produces <code><abbr title="java.util.function.BiFunction">BiFunction</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.experimenter.Experiment">Experiment</abbr>, <abbr title="java.util.concurrent.ExecutorService">ExecutorService</abbr>, <abbr title="io.github.ericmedvet.jgea.core.listener.ListenerFactory">ListenerFactory</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.solver.POCPopulationState">POCPopulationState</abbr>&lt;?, G, S, Q, ?&gt;, <abbr title="io.github.ericmedvet.jgea.experimenter.Run">Run</abbr>&lt;?, G, S, Q&gt;&gt;&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.Listeners.outcomeSaver()` by jgea-experimenter:2.5.2-SNAPSHOT:2024-02-26T23:37:48Z

### Builder `ea.listener.runImageVideoSaver()`

`ea.l.runImageVideoSaver(function; drawer; w; h; encoder; frameRate; filePathTemplate; condition)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `function` | npm | `ea.nf.best()` | <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.solver.POCPopulationState">POCPopulationState</abbr>&lt;?, G, S, Q, ?&gt;, K&gt;</code> |
| `drawer` | npm |  | <code><abbr title="io.github.ericmedvet.jviz.core.drawer.Drawer">Drawer</abbr>&lt;K&gt;</code> |
| `w` | i | `500` | <code>int</code> |
| `h` | i | `500` | <code>int</code> |
| `encoder` | e | `JCODEC` | <code><abbr title="io.github.ericmedvet.jviz.core.util.VideoUtils$EncoderFacility">VideoUtils$EncoderFacility</abbr></code> |
| `frameRate` | d | `20.0` | <code>double</code> |
| `filePathTemplate` | s | `run-{index:%04d}.mp4` | <code><abbr title="java.lang.String">String</abbr></code> |
| `condition` | npm | `ea.predicate.always()` | <code><abbr title="java.util.function.Predicate">Predicate</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.experimenter.Run">Run</abbr>&lt;?, G, S, Q&gt;&gt;</code> |

Produces <code><abbr title="java.util.function.BiFunction">BiFunction</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.experimenter.Experiment">Experiment</abbr>, <abbr title="java.util.concurrent.ExecutorService">ExecutorService</abbr>, <abbr title="io.github.ericmedvet.jgea.core.listener.ListenerFactory">ListenerFactory</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.solver.POCPopulationState">POCPopulationState</abbr>&lt;?, G, S, Q, ?&gt;, <abbr title="io.github.ericmedvet.jgea.experimenter.Run">Run</abbr>&lt;?, G, S, Q&gt;&gt;&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.Listeners.runImageVideoSaver()` by jgea-experimenter:2.5.2-SNAPSHOT:2024-02-26T23:37:48Z

### Builder `ea.listener.runPlotSaver()`

`ea.l.runPlotSaver(plot; type; w; h; freeScales; filePathTemplate; saveCsvDataMode; condition)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `plot` | npm |  | <code><abbr title="io.github.ericmedvet.jgea.core.listener.AccumulatorFactory">AccumulatorFactory</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.solver.POCPopulationState">POCPopulationState</abbr>&lt;?, G, S, Q, ?&gt;, <abbr title="io.github.ericmedvet.jviz.core.plot.XYPlot">XYPlot</abbr>&lt;?&gt;, <abbr title="io.github.ericmedvet.jgea.experimenter.Run">Run</abbr>&lt;?, G, S, Q&gt;&gt;</code> |
| `type` | e |  | <code><abbr title="io.github.ericmedvet.jviz.core.plot.Plotter$Type">Plotter$Type</abbr></code> |
| `w` | i | `800` | <code>int</code> |
| `h` | i | `800` | <code>int</code> |
| `freeScales` | b | `false` | <code>boolean</code> |
| `filePathTemplate` | s | `run-{index:%04d}.png` | <code><abbr title="java.lang.String">String</abbr></code> |
| `saveCsvDataMode` | e | `NONE` | <code><abbr title="io.github.ericmedvet.jviz.core.plot.CsvPlotter$Mode">CsvPlotter$Mode</abbr></code> |
| `condition` | npm | `ea.predicate.always()` | <code><abbr title="java.util.function.Predicate">Predicate</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.experimenter.Run">Run</abbr>&lt;?, G, S, Q&gt;&gt;</code> |

Produces <code><abbr title="java.util.function.BiFunction">BiFunction</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.experimenter.Experiment">Experiment</abbr>, <abbr title="java.util.concurrent.ExecutorService">ExecutorService</abbr>, <abbr title="io.github.ericmedvet.jgea.core.listener.ListenerFactory">ListenerFactory</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.solver.POCPopulationState">POCPopulationState</abbr>&lt;?, G, S, Q, ?&gt;, <abbr title="io.github.ericmedvet.jgea.experimenter.Run">Run</abbr>&lt;?, G, S, Q&gt;&gt;&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.Listeners.runPlotSaver()` by jgea-experimenter:2.5.2-SNAPSHOT:2024-02-26T23:37:48Z

### Builder `ea.listener.runPlotVideoSaver()`

`ea.l.runPlotVideoSaver(plot; type; w; h; freeScales; splitType; encoder; frameRate; filePathTemplate; condition)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `plot` | npm |  | <code><abbr title="io.github.ericmedvet.jgea.core.listener.AccumulatorFactory">AccumulatorFactory</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.solver.POCPopulationState">POCPopulationState</abbr>&lt;?, G, S, Q, ?&gt;, <abbr title="io.github.ericmedvet.jviz.core.plot.XYPlot">XYPlot</abbr>&lt;?&gt;, <abbr title="io.github.ericmedvet.jgea.experimenter.Run">Run</abbr>&lt;?, G, S, Q&gt;&gt;</code> |
| `type` | e |  | <code><abbr title="io.github.ericmedvet.jviz.core.plot.Plotter$Type">Plotter$Type</abbr></code> |
| `w` | i | `800` | <code>int</code> |
| `h` | i | `800` | <code>int</code> |
| `freeScales` | b | `false` | <code>boolean</code> |
| `splitType` | e | `COLUMNS` | <code><abbr title="io.github.ericmedvet.jviz.core.plot.video.VideoPlotter$SplitType">VideoPlotter$SplitType</abbr></code> |
| `encoder` | e | `JCODEC` | <code><abbr title="io.github.ericmedvet.jviz.core.util.VideoUtils$EncoderFacility">VideoUtils$EncoderFacility</abbr></code> |
| `frameRate` | d | `20.0` | <code>double</code> |
| `filePathTemplate` | s | `run-{index:%04d}.mp4` | <code><abbr title="java.lang.String">String</abbr></code> |
| `condition` | npm | `ea.predicate.always()` | <code><abbr title="java.util.function.Predicate">Predicate</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.experimenter.Run">Run</abbr>&lt;?, G, S, Q&gt;&gt;</code> |

Produces <code><abbr title="java.util.function.BiFunction">BiFunction</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.experimenter.Experiment">Experiment</abbr>, <abbr title="java.util.concurrent.ExecutorService">ExecutorService</abbr>, <abbr title="io.github.ericmedvet.jgea.core.listener.ListenerFactory">ListenerFactory</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.solver.POCPopulationState">POCPopulationState</abbr>&lt;?, G, S, Q, ?&gt;, <abbr title="io.github.ericmedvet.jgea.experimenter.Run">Run</abbr>&lt;?, G, S, Q&gt;&gt;&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.Listeners.runPlotVideoSaver()` by jgea-experimenter:2.5.2-SNAPSHOT:2024-02-26T23:37:48Z

### Builder `ea.listener.telegram()`

`ea.l.telegram(chatId; botIdFilePath; defaultPlots; plots; accumulators; runKeys; deferred; onlyLast; condition)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `chatId` | s |  | <code><abbr title="java.lang.String">String</abbr></code> |
| `botIdFilePath` | s |  | <code><abbr title="java.lang.String">String</abbr></code> |
| `defaultPlots` | npm[] | `[ea.plot.elapsed()]` | <code><abbr title="java.util.List">List</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.experimenter.listener.plot.accumulator.PlotAccumulatorFactory">PlotAccumulatorFactory</abbr>&lt;? super <abbr title="io.github.ericmedvet.jgea.core.solver.POCPopulationState">POCPopulationState</abbr>&lt;?, G, S, Q, ?&gt;, ?, <abbr title="io.github.ericmedvet.jgea.experimenter.Run">Run</abbr>&lt;?, G, S, Q&gt;, ?&gt;&gt;</code> |
| `plots` | npm[] | `[]` | <code><abbr title="java.util.List">List</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.experimenter.listener.plot.accumulator.PlotAccumulatorFactory">PlotAccumulatorFactory</abbr>&lt;? super <abbr title="io.github.ericmedvet.jgea.core.solver.POCPopulationState">POCPopulationState</abbr>&lt;?, G, S, Q, ?&gt;, ?, <abbr title="io.github.ericmedvet.jgea.experimenter.Run">Run</abbr>&lt;?, G, S, Q&gt;, ?&gt;&gt;</code> |
| `accumulators` | npm[] | `[]` | <code><abbr title="java.util.List">List</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.listener.AccumulatorFactory">AccumulatorFactory</abbr>&lt;? super <abbr title="io.github.ericmedvet.jgea.core.solver.POCPopulationState">POCPopulationState</abbr>&lt;?, G, S, Q, ?&gt;, ?, <abbr title="io.github.ericmedvet.jgea.experimenter.Run">Run</abbr>&lt;?, G, S, Q&gt;&gt;&gt;</code> |
| `runKeys` | npm[] | `[]` | <code><abbr title="java.util.List">List</abbr>&lt;<abbr title="java.util.Map$Entry">Map$Entry</abbr>&lt;<abbr title="java.lang.String">String</abbr>, <abbr title="java.lang.String">String</abbr>&gt;&gt;</code> |
| `deferred` | b | `true` | <code>boolean</code> |
| `onlyLast` | b | `false` | <code>boolean</code> |
| `condition` | npm | `ea.predicate.always()` | <code><abbr title="java.util.function.Predicate">Predicate</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.experimenter.Run">Run</abbr>&lt;?, G, S, Q&gt;&gt;</code> |

Produces <code><abbr title="java.util.function.BiFunction">BiFunction</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.experimenter.Experiment">Experiment</abbr>, <abbr title="java.util.concurrent.ExecutorService">ExecutorService</abbr>, <abbr title="io.github.ericmedvet.jgea.core.listener.ListenerFactory">ListenerFactory</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.solver.POCPopulationState">POCPopulationState</abbr>&lt;?, G, S, Q, ?&gt;, <abbr title="io.github.ericmedvet.jgea.experimenter.Run">Run</abbr>&lt;?, G, S, Q&gt;&gt;&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.Listeners.telegram()` by jgea-experimenter:2.5.2-SNAPSHOT:2024-02-26T23:37:48Z

### Builder `ea.listener.tui()`

`ea.l.tui(defaultFunctions; functions; runKeys; condition)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `defaultFunctions` | npm[] | `[ea.nf.iterations(), ea.nf.evals(), ea.nf.births(), ea.nf.elapsed(), ea.nf.size(f = ea.nf.all()), ea.nf.size(f = ea.nf.firsts()), ea.nf.size(f = ea.nf.lasts()), ea.nf.uniqueness(collection = ea.nf.each(collection = ea.nf.all(); map = ea.nf.genotype())), ea.nf.uniqueness(collection = ea.nf.each(collection = ea.nf.all(); map = ea.nf.solution())), ea.nf.uniqueness(collection = ea.nf.each(collection = ea.nf.all(); map = ea.nf.fitness()))]` | <code><abbr title="java.util.List">List</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;? super <abbr title="io.github.ericmedvet.jgea.core.solver.POCPopulationState">POCPopulationState</abbr>&lt;?, G, S, Q, ?&gt;, ?&gt;&gt;</code> |
| `functions` | npm[] | `[]` | <code><abbr title="java.util.List">List</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;? super <abbr title="io.github.ericmedvet.jgea.core.solver.POCPopulationState">POCPopulationState</abbr>&lt;?, G, S, Q, ?&gt;, ?&gt;&gt;</code> |
| `runKeys` | npm[] | `[]` | <code><abbr title="java.util.List">List</abbr>&lt;<abbr title="java.util.Map$Entry">Map$Entry</abbr>&lt;<abbr title="java.lang.String">String</abbr>, <abbr title="java.lang.String">String</abbr>&gt;&gt;</code> |
| `condition` | npm | `ea.predicate.always()` | <code><abbr title="java.util.function.Predicate">Predicate</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.experimenter.Run">Run</abbr>&lt;?, G, S, Q&gt;&gt;</code> |

Produces <code><abbr title="java.util.function.BiFunction">BiFunction</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.experimenter.Experiment">Experiment</abbr>, <abbr title="java.util.concurrent.ExecutorService">ExecutorService</abbr>, <abbr title="io.github.ericmedvet.jgea.core.listener.ListenerFactory">ListenerFactory</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.solver.POCPopulationState">POCPopulationState</abbr>&lt;?, G, S, Q, ?&gt;, <abbr title="io.github.ericmedvet.jgea.experimenter.Run">Run</abbr>&lt;?, G, S, Q&gt;&gt;&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.Listeners.tui()` by jgea-experimenter:2.5.2-SNAPSHOT:2024-02-26T23:37:48Z

## Package `ea.mapper`

Aliases: `ea.m`, `ea.mapper`

### Builder `ea.mapper.bitStringToGrammarGrid()`

`ea.m.bitStringToGrammarGrid(grammar; l; overwrite; criteria)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `grammar` | npm |  | <code><abbr title="io.github.ericmedvet.jgea.core.representation.grammar.grid.GridGrammar">GridGrammar</abbr>&lt;T&gt;</code> |
| `l` | i | `256` | <code>int</code> |
| `overwrite` | b | `false` | <code>boolean</code> |
| `criteria` | e[] | `[LEAST_RECENT, LOWEST_Y, LOWEST_X]` | <code><abbr title="java.util.List">List</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.representation.grammar.grid.StandardGridDeveloper$SortingCriterion">StandardGridDeveloper$SortingCriterion</abbr>&gt;</code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.experimenter.InvertibleMapper">InvertibleMapper</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.representation.sequence.bit.BitString">BitString</abbr>, <abbr title="io.github.ericmedvet.jnb.datastructure.Grid">Grid</abbr>&lt;T&gt;&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.Mappers.bitStringToGrammarGrid()` by jgea-experimenter:2.5.2-SNAPSHOT:2024-02-26T23:37:48Z

### Builder `ea.mapper.compose()`

`ea.m.compose(first; second)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `first` | npm |  | <code><abbr title="io.github.ericmedvet.jgea.experimenter.InvertibleMapper">InvertibleMapper</abbr>&lt;A, B&gt;</code> |
| `second` | npm |  | <code><abbr title="io.github.ericmedvet.jgea.experimenter.InvertibleMapper">InvertibleMapper</abbr>&lt;B, C&gt;</code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.experimenter.InvertibleMapper">InvertibleMapper</abbr>&lt;A, C&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.Mappers.compose()` by jgea-experimenter:2.5.2-SNAPSHOT:2024-02-26T23:37:48Z

### Builder `ea.mapper.doubleStringToBitString()`

`ea.m.doubleStringToBitString(t)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `t` | d | `0.0` | <code>double</code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.experimenter.InvertibleMapper">InvertibleMapper</abbr>&lt;<abbr title="java.util.List">List</abbr>&lt;<abbr title="java.lang.Double">Double</abbr>&gt;, <abbr title="io.github.ericmedvet.jgea.core.representation.sequence.bit.BitString">BitString</abbr>&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.Mappers.doubleStringToBitString()` by jgea-experimenter:2.5.2-SNAPSHOT:2024-02-26T23:37:48Z

### Builder `ea.mapper.doubleStringToGrammarGrid()`

`ea.m.doubleStringToGrammarGrid(grammar; l; overwrite; criteria)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `grammar` | npm |  | <code><abbr title="io.github.ericmedvet.jgea.core.representation.grammar.grid.GridGrammar">GridGrammar</abbr>&lt;T&gt;</code> |
| `l` | i | `256` | <code>int</code> |
| `overwrite` | b | `false` | <code>boolean</code> |
| `criteria` | e[] | `[LEAST_RECENT, LOWEST_Y, LOWEST_X]` | <code><abbr title="java.util.List">List</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.representation.grammar.grid.StandardGridDeveloper$SortingCriterion">StandardGridDeveloper$SortingCriterion</abbr>&gt;</code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.experimenter.InvertibleMapper">InvertibleMapper</abbr>&lt;<abbr title="java.util.List">List</abbr>&lt;<abbr title="java.lang.Double">Double</abbr>&gt;, <abbr title="io.github.ericmedvet.jnb.datastructure.Grid">Grid</abbr>&lt;T&gt;&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.Mappers.doubleStringToGrammarGrid()` by jgea-experimenter:2.5.2-SNAPSHOT:2024-02-26T23:37:48Z

### Builder `ea.mapper.doubleStringToIntString()`

`ea.m.doubleStringToIntString(range)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `range` | npm | `ds.range(min = -1; max = 1)` | <code><abbr title="io.github.ericmedvet.jnb.datastructure.DoubleRange">DoubleRange</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.experimenter.InvertibleMapper">InvertibleMapper</abbr>&lt;<abbr title="java.util.List">List</abbr>&lt;<abbr title="java.lang.Double">Double</abbr>&gt;, <abbr title="io.github.ericmedvet.jgea.core.representation.sequence.integer.IntString">IntString</abbr>&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.Mappers.doubleStringToIntString()` by jgea-experimenter:2.5.2-SNAPSHOT:2024-02-26T23:37:48Z

### Builder `ea.mapper.fGraphToMrf()`

`ea.m.fGraphToMrf(postOperator)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `postOperator` | e | `IDENTITY` | <code><abbr title="io.github.ericmedvet.jsdynsym.core.numerical.ann.MultiLayerPerceptron$ActivationFunction">MultiLayerPerceptron$ActivationFunction</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.experimenter.InvertibleMapper">InvertibleMapper</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.representation.graph.Graph">Graph</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.representation.graph.Node">Node</abbr>, <abbr title="java.lang.Double">Double</abbr>&gt;, <abbr title="io.github.ericmedvet.jgea.core.representation.NamedMultivariateRealFunction">NamedMultivariateRealFunction</abbr>&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.Mappers.fGraphToMrf()` by jgea-experimenter:2.5.2-SNAPSHOT:2024-02-26T23:37:48Z

### Builder `ea.mapper.identity()`

`ea.m.identity()`

Produces <code><abbr title="io.github.ericmedvet.jgea.experimenter.InvertibleMapper">InvertibleMapper</abbr>&lt;X, X&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.Mappers.identity()` by jgea-experimenter:2.5.2-SNAPSHOT:2024-02-26T23:37:48Z

### Builder `ea.mapper.intStringToGrammarGrid()`

`ea.m.intStringToGrammarGrid(grammar; upperBound; l; overwrite; criteria)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `grammar` | npm |  | <code><abbr title="io.github.ericmedvet.jgea.core.representation.grammar.grid.GridGrammar">GridGrammar</abbr>&lt;T&gt;</code> |
| `upperBound` | i | `16` | <code>int</code> |
| `l` | i | `256` | <code>int</code> |
| `overwrite` | b | `false` | <code>boolean</code> |
| `criteria` | e[] | `[LEAST_RECENT, LOWEST_Y, LOWEST_X]` | <code><abbr title="java.util.List">List</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.representation.grammar.grid.StandardGridDeveloper$SortingCriterion">StandardGridDeveloper$SortingCriterion</abbr>&gt;</code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.experimenter.InvertibleMapper">InvertibleMapper</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.representation.sequence.integer.IntString">IntString</abbr>, <abbr title="io.github.ericmedvet.jnb.datastructure.Grid">Grid</abbr>&lt;T&gt;&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.Mappers.intStringToGrammarGrid()` by jgea-experimenter:2.5.2-SNAPSHOT:2024-02-26T23:37:48Z

### Builder `ea.mapper.mlpToMrf()`

`ea.m.mlpToMrf(innerLayerRatio; nOfInnerLayers; activationFunction)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `innerLayerRatio` | d | `0.65` | <code>double</code> |
| `nOfInnerLayers` | i | `1` | <code>int</code> |
| `activationFunction` | e | `TANH` | <code><abbr title="io.github.ericmedvet.jsdynsym.core.numerical.ann.MultiLayerPerceptron$ActivationFunction">MultiLayerPerceptron$ActivationFunction</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.experimenter.InvertibleMapper">InvertibleMapper</abbr>&lt;<abbr title="java.util.List">List</abbr>&lt;<abbr title="java.lang.Double">Double</abbr>&gt;, <abbr title="io.github.ericmedvet.jgea.core.representation.NamedMultivariateRealFunction">NamedMultivariateRealFunction</abbr>&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.Mappers.mlpToMrf()` by jgea-experimenter:2.5.2-SNAPSHOT:2024-02-26T23:37:48Z

### Builder `ea.mapper.mrfToNds()`

`ea.m.mrfToNds()`

Produces <code><abbr title="io.github.ericmedvet.jgea.experimenter.InvertibleMapper">InvertibleMapper</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.representation.NamedMultivariateRealFunction">NamedMultivariateRealFunction</abbr>, <abbr title="io.github.ericmedvet.jsdynsym.core.numerical.NumericalDynamicalSystem">NumericalDynamicalSystem</abbr>&lt;?&gt;&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.Mappers.mrfToNds()` by jgea-experimenter:2.5.2-SNAPSHOT:2024-02-26T23:37:48Z

### Builder `ea.mapper.mrfToUrf()`

`ea.m.mrfToUrf()`

Produces <code><abbr title="io.github.ericmedvet.jgea.experimenter.InvertibleMapper">InvertibleMapper</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.representation.NamedMultivariateRealFunction">NamedMultivariateRealFunction</abbr>, <abbr title="io.github.ericmedvet.jgea.core.representation.NamedUnivariateRealFunction">NamedUnivariateRealFunction</abbr>&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.Mappers.mrfToUrf()` by jgea-experimenter:2.5.2-SNAPSHOT:2024-02-26T23:37:48Z

### Builder `ea.mapper.multiSrTreeToMrf()`

`ea.m.multiSrTreeToMrf(postOperator)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `postOperator` | e | `IDENTITY` | <code><abbr title="io.github.ericmedvet.jsdynsym.core.numerical.ann.MultiLayerPerceptron$ActivationFunction">MultiLayerPerceptron$ActivationFunction</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.experimenter.InvertibleMapper">InvertibleMapper</abbr>&lt;<abbr title="java.util.List">List</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.representation.tree.Tree">Tree</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.representation.tree.numeric.Element">Element</abbr>&gt;&gt;, <abbr title="io.github.ericmedvet.jgea.core.representation.NamedMultivariateRealFunction">NamedMultivariateRealFunction</abbr>&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.Mappers.multiSrTreeToMrf()` by jgea-experimenter:2.5.2-SNAPSHOT:2024-02-26T23:37:48Z

### Builder `ea.mapper.numericalParametrizedToMrf()`

`ea.m.numericalParametrizedToMrf(function)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `function` | npm |  | <code><abbr title="io.github.ericmedvet.jsdynsym.buildable.builders.NumericalDynamicalSystems$Builder">NumericalDynamicalSystems$Builder</abbr>&lt;<abbr title="io.github.ericmedvet.jsdynsym.core.numerical.MultivariateRealFunction">MultivariateRealFunction</abbr>, <abbr title="io.github.ericmedvet.jsdynsym.core.StatelessSystem$State">StatelessSystem$State</abbr>&gt;</code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.experimenter.InvertibleMapper">InvertibleMapper</abbr>&lt;<abbr title="java.util.List">List</abbr>&lt;<abbr title="java.lang.Double">Double</abbr>&gt;, <abbr title="io.github.ericmedvet.jgea.core.representation.NamedMultivariateRealFunction">NamedMultivariateRealFunction</abbr>&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.Mappers.numericalParametrizedToMrf()` by jgea-experimenter:2.5.2-SNAPSHOT:2024-02-26T23:37:48Z

### Builder `ea.mapper.oGraphToMrf()`

`ea.m.oGraphToMrf(postOperator)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `postOperator` | e | `IDENTITY` | <code><abbr title="io.github.ericmedvet.jsdynsym.core.numerical.ann.MultiLayerPerceptron$ActivationFunction">MultiLayerPerceptron$ActivationFunction</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.experimenter.InvertibleMapper">InvertibleMapper</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.representation.graph.Graph">Graph</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.representation.graph.Node">Node</abbr>, <abbr title="io.github.ericmedvet.jgea.core.representation.graph.numeric.operatorgraph.OperatorGraph$NonValuedArc">OperatorGraph$NonValuedArc</abbr>&gt;, <abbr title="io.github.ericmedvet.jgea.core.representation.NamedMultivariateRealFunction">NamedMultivariateRealFunction</abbr>&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.Mappers.oGraphToMrf()` by jgea-experimenter:2.5.2-SNAPSHOT:2024-02-26T23:37:48Z

### Builder `ea.mapper.srTreeToUrf()`

`ea.m.srTreeToUrf(postOperator)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `postOperator` | e | `IDENTITY` | <code><abbr title="io.github.ericmedvet.jsdynsym.core.numerical.ann.MultiLayerPerceptron$ActivationFunction">MultiLayerPerceptron$ActivationFunction</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.experimenter.InvertibleMapper">InvertibleMapper</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.representation.tree.Tree">Tree</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.representation.tree.numeric.Element">Element</abbr>&gt;, <abbr title="io.github.ericmedvet.jgea.core.representation.NamedUnivariateRealFunction">NamedUnivariateRealFunction</abbr>&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.Mappers.srTreeToUrf()` by jgea-experimenter:2.5.2-SNAPSHOT:2024-02-26T23:37:48Z

## Package `ea.misc`

### Builder `ea.misc.colorByName()`

`ea.misc.colorByName(name)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `name` | s |  | <code><abbr title="java.lang.String">String</abbr></code> |

Produces <code><abbr title="java.awt.Color">Color</abbr></code>; built from `io.github.ericmedvet.jgea.experimenter.builders.Misc.colorByName()` by jgea-experimenter:2.5.2-SNAPSHOT:2024-02-26T23:37:48Z

### Builder `ea.misc.colorByRGB()`

`ea.misc.colorByRGB(r; g; c)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `r` | d |  | <code>double</code> |
| `g` | d |  | <code>double</code> |
| `c` | d |  | <code>double</code> |

Produces <code><abbr title="java.awt.Color">Color</abbr></code>; built from `io.github.ericmedvet.jgea.experimenter.builders.Misc.colorByRGB()` by jgea-experimenter:2.5.2-SNAPSHOT:2024-02-26T23:37:48Z

### Builder `ea.misc.entry()`

`ea.misc.entry(key; value)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `key` | npm |  | <code>K</code> |
| `value` | npm |  | <code>V</code> |

Produces <code><abbr title="java.util.Map$Entry">Map$Entry</abbr>&lt;K, V&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.Misc.entry()` by jgea-experimenter:2.5.2-SNAPSHOT:2024-02-26T23:37:48Z

### Builder `ea.misc.map()`

`ea.misc.map(entries)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `entries` | npm[] | `[]` | <code><abbr title="java.util.List">List</abbr>&lt;<abbr title="java.util.Map$Entry">Map$Entry</abbr>&lt;K, V&gt;&gt;</code> |

Produces <code><abbr title="java.util.Map">Map</abbr>&lt;K, V&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.Misc.map()` by jgea-experimenter:2.5.2-SNAPSHOT:2024-02-26T23:37:48Z

### Builder `ea.misc.sEntry()`

`ea.misc.sEntry(key; value)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `key` | s |  | <code><abbr title="java.lang.String">String</abbr></code> |
| `value` | s |  | <code><abbr title="java.lang.String">String</abbr></code> |

Produces <code><abbr title="java.util.Map$Entry">Map$Entry</abbr>&lt;<abbr title="java.lang.String">String</abbr>, <abbr title="java.lang.String">String</abbr>&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.Misc.sEntry()` by jgea-experimenter:2.5.2-SNAPSHOT:2024-02-26T23:37:48Z

## Package `ea.namedFunctions`

Aliases: `ea.namedFunctions`, `ea.nf`

### Builder `ea.namedFunctions.all()`

`ea.nf.all()`

Produces <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.solver.POCPopulationState">POCPopulationState</abbr>&lt;?, G, S, Q, ?&gt;, <abbr title="java.util.Collection">Collection</abbr>&lt;? extends <abbr title="io.github.ericmedvet.jgea.core.solver.Individual">Individual</abbr>&lt;G, S, Q&gt;&gt;&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.NamedFunctions.all()` by jgea-experimenter:2.5.2-SNAPSHOT:2024-02-26T23:37:48Z

### Builder `ea.namedFunctions.asDoubleString()`

`ea.nf.asDoubleString(f)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `f` | npm | `ea.nf.identity()` | <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;X, S&gt;</code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;X, <abbr title="java.util.List">List</abbr>&lt;<abbr title="java.lang.Double">Double</abbr>&gt;&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.NamedFunctions.asDoubleString()` by jgea-experimenter:2.5.2-SNAPSHOT:2024-02-26T23:37:48Z

### Builder `ea.namedFunctions.avg()`

`ea.nf.avg(collection; s)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `collection` | npm | `ea.nf.identity()` | <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;X, <abbr title="java.util.Collection">Collection</abbr>&lt;<abbr title="java.lang.Number">Number</abbr>&gt;&gt;</code> |
| `s` | s | `%s` | <code><abbr title="java.lang.String">String</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;X, <abbr title="java.lang.Number">Number</abbr>&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.NamedFunctions.avg()` by jgea-experimenter:2.5.2-SNAPSHOT:2024-02-26T23:37:48Z

### Builder `ea.namedFunctions.base64()`

`ea.nf.base64(f)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `f` | npm | `ea.nf.identity()` | <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;X, <abbr title="java.io.Serializable">Serializable</abbr>&gt;</code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;X, <abbr title="java.lang.String">String</abbr>&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.NamedFunctions.base64()` by jgea-experimenter:2.5.2-SNAPSHOT:2024-02-26T23:37:48Z

### Builder `ea.namedFunctions.best()`

`ea.nf.best(f)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `f` | npm | `ea.nf.identity()` | <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.solver.Individual">Individual</abbr>&lt;G, S, Q&gt;, T&gt;</code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.solver.POCPopulationState">POCPopulationState</abbr>&lt;?, G, S, Q, ?&gt;, T&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.NamedFunctions.best()` by jgea-experimenter:2.5.2-SNAPSHOT:2024-02-26T23:37:48Z

### Builder `ea.namedFunctions.bestFitness()`

`ea.nf.bestFitness(f; s)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `f` | npm | `ea.nf.identity()` | <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;Q, T&gt;</code> |
| `s` | s | `%s` | <code><abbr title="java.lang.String">String</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.solver.POCPopulationState">POCPopulationState</abbr>&lt;?, ?, ?, Q, ?&gt;, T&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.NamedFunctions.bestFitness()` by jgea-experimenter:2.5.2-SNAPSHOT:2024-02-26T23:37:48Z

### Builder `ea.namedFunctions.births()`

`ea.nf.births()`

Produces <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.solver.POCPopulationState">POCPopulationState</abbr>&lt;?, ?, ?, ?, ?&gt;, <abbr title="java.lang.Long">Long</abbr>&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.NamedFunctions.births()` by jgea-experimenter:2.5.2-SNAPSHOT:2024-02-26T23:37:48Z

### Builder `ea.namedFunctions.controlQuality()`

`ea.nf.controlQuality(individual; f; s)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `individual` | npm | `ea.nf.identity()` | <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;X, <abbr title="io.github.ericmedvet.jgea.core.solver.Individual">Individual</abbr>&lt;?, ?, <abbr title="io.github.ericmedvet.jgea.problem.control.ControlProblem$Outcome">ControlProblem$Outcome</abbr>&lt;?, Q&gt;&gt;&gt;</code> |
| `f` | npm | `ea.nf.identity()` | <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;Q, T&gt;</code> |
| `s` | s | `%s` | <code><abbr title="java.lang.String">String</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;X, T&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.NamedFunctions.controlQuality()` by jgea-experimenter:2.5.2-SNAPSHOT:2024-02-26T23:37:48Z

### Builder `ea.namedFunctions.each()`

`ea.nf.each(map; collection; s)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `map` | npm |  | <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;T, R&gt;</code> |
| `collection` | npm | `ea.nf.identity()` | <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;X, <abbr title="java.util.Collection">Collection</abbr>&lt;T&gt;&gt;</code> |
| `s` | s | `%s` | <code><abbr title="java.lang.String">String</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;X, <abbr title="java.util.Collection">Collection</abbr>&lt;R&gt;&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.NamedFunctions.each()` by jgea-experimenter:2.5.2-SNAPSHOT:2024-02-26T23:37:48Z

### Builder `ea.namedFunctions.elapsed()`

`ea.nf.elapsed()`

Produces <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.solver.POCPopulationState">POCPopulationState</abbr>&lt;?, ?, ?, ?, ?&gt;, <abbr title="java.lang.Double">Double</abbr>&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.NamedFunctions.elapsed()` by jgea-experimenter:2.5.2-SNAPSHOT:2024-02-26T23:37:48Z

### Builder `ea.namedFunctions.evals()`

`ea.nf.evals()`

Produces <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.solver.POCPopulationState">POCPopulationState</abbr>&lt;?, ?, ?, ?, ?&gt;, <abbr title="java.lang.Long">Long</abbr>&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.NamedFunctions.evals()` by jgea-experimenter:2.5.2-SNAPSHOT:2024-02-26T23:37:48Z

### Builder `ea.namedFunctions.expr()`

`ea.nf.expr(f1; f2; op)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `f1` | npm |  | <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;X, <abbr title="java.lang.Number">Number</abbr>&gt;</code> |
| `f2` | npm |  | <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;X, <abbr title="java.lang.Number">Number</abbr>&gt;</code> |
| `op` | e |  | <code><abbr title="io.github.ericmedvet.jgea.experimenter.builders.NamedFunctions$Op">NamedFunctions$Op</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;X, <abbr title="java.lang.Double">Double</abbr>&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.NamedFunctions.expr()` by jgea-experimenter:2.5.2-SNAPSHOT:2024-02-26T23:37:48Z

### Builder `ea.namedFunctions.f()`

`ea.nf.f(outerF; innerF; name; s)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `outerF` | npm |  | <code><abbr title="java.util.function.Function">Function</abbr>&lt;T, R&gt;</code> |
| `innerF` | npm | `ea.nf.identity()` | <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;X, T&gt;</code> |
| `name` | s | `` | <code><abbr title="java.lang.String">String</abbr></code> |
| `s` | s | `%s` | <code><abbr title="java.lang.String">String</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;X, R&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.NamedFunctions.f()` by jgea-experimenter:2.5.2-SNAPSHOT:2024-02-26T23:37:48Z

### Builder `ea.namedFunctions.firsts()`

`ea.nf.firsts()`

Produces <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.solver.POCPopulationState">POCPopulationState</abbr>&lt;I, G, S, Q, P&gt;, <abbr title="java.util.Collection">Collection</abbr>&lt;I&gt;&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.NamedFunctions.firsts()` by jgea-experimenter:2.5.2-SNAPSHOT:2024-02-26T23:37:48Z

### Builder `ea.namedFunctions.fitness()`

`ea.nf.fitness(individual; f; s)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `individual` | npm | `ea.nf.identity()` | <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;X, <abbr title="io.github.ericmedvet.jgea.core.solver.Individual">Individual</abbr>&lt;?, ?, F&gt;&gt;</code> |
| `f` | npm | `ea.nf.identity()` | <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;F, T&gt;</code> |
| `s` | s | `%s` | <code><abbr title="java.lang.String">String</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;X, T&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.NamedFunctions.fitness()` by jgea-experimenter:2.5.2-SNAPSHOT:2024-02-26T23:37:48Z

### Builder `ea.namedFunctions.fitnessHist()`

`ea.nf.fitnessHist(f; nBins)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `f` | npm | `ea.nf.identity()` | <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;Q, <abbr title="java.lang.Number">Number</abbr>&gt;</code> |
| `nBins` | i | `8` | <code>int</code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.solver.POCPopulationState">POCPopulationState</abbr>&lt;?, ?, ?, Q, ?&gt;, <abbr title="io.github.ericmedvet.jgea.core.util.TextPlotter$Miniplot">TextPlotter$Miniplot</abbr>&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.NamedFunctions.fitnessHist()` by jgea-experimenter:2.5.2-SNAPSHOT:2024-02-26T23:37:48Z

### Builder `ea.namedFunctions.formatted()`

`ea.nf.formatted(s; f)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `s` | s |  | <code><abbr title="java.lang.String">String</abbr></code> |
| `f` | npm |  | <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;T, R&gt;</code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;T, R&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.NamedFunctions.formatted()` by jgea-experimenter:2.5.2-SNAPSHOT:2024-02-26T23:37:48Z

### Builder `ea.namedFunctions.genotype()`

`ea.nf.genotype(individual; s)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `individual` | npm | `ea.nf.identity()` | <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;X, <abbr title="io.github.ericmedvet.jgea.core.solver.Individual">Individual</abbr>&lt;G, ?, ?&gt;&gt;</code> |
| `s` | s | `%s` | <code><abbr title="java.lang.String">String</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;X, G&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.NamedFunctions.genotype()` by jgea-experimenter:2.5.2-SNAPSHOT:2024-02-26T23:37:48Z

### Builder `ea.namedFunctions.grid()`

`ea.nf.grid(f; s; cellSeparator; rowSeparator; emptyCell)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `f` | npm | `ea.nf.identity()` | <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;T, <abbr title="io.github.ericmedvet.jnb.datastructure.Grid">Grid</abbr>&lt;<abbr title="java.lang.Object">Object</abbr>&gt;&gt;</code> |
| `s` | s | `%20.20s` | <code><abbr title="java.lang.String">String</abbr></code> |
| `cellSeparator` | s | `` | <code><abbr title="java.lang.String">String</abbr></code> |
| `rowSeparator` | s | `;` | <code><abbr title="java.lang.String">String</abbr></code> |
| `emptyCell` | s | `·` | <code><abbr title="java.lang.String">String</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;T, <abbr title="java.lang.String">String</abbr>&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.NamedFunctions.grid()` by jgea-experimenter:2.5.2-SNAPSHOT:2024-02-26T23:37:48Z

### Builder `ea.namedFunctions.gridCount()`

`ea.nf.gridCount(f; s)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `f` | npm | `ea.nf.identity()` | <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;X, <abbr title="io.github.ericmedvet.jnb.datastructure.Grid">Grid</abbr>&lt;?&gt;&gt;</code> |
| `s` | s | `%2d` | <code><abbr title="java.lang.String">String</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;X, <abbr title="java.lang.Integer">Integer</abbr>&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.NamedFunctions.gridCount()` by jgea-experimenter:2.5.2-SNAPSHOT:2024-02-26T23:37:48Z

### Builder `ea.namedFunctions.gridH()`

`ea.nf.gridH(f; s)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `f` | npm | `ea.nf.identity()` | <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;X, <abbr title="io.github.ericmedvet.jnb.datastructure.Grid">Grid</abbr>&lt;?&gt;&gt;</code> |
| `s` | s | `%2d` | <code><abbr title="java.lang.String">String</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;X, <abbr title="java.lang.Integer">Integer</abbr>&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.NamedFunctions.gridH()` by jgea-experimenter:2.5.2-SNAPSHOT:2024-02-26T23:37:48Z

### Builder `ea.namedFunctions.gridW()`

`ea.nf.gridW(f; s)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `f` | npm | `ea.nf.identity()` | <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;X, <abbr title="io.github.ericmedvet.jnb.datastructure.Grid">Grid</abbr>&lt;?&gt;&gt;</code> |
| `s` | s | `%2d` | <code><abbr title="java.lang.String">String</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;X, <abbr title="java.lang.Integer">Integer</abbr>&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.NamedFunctions.gridW()` by jgea-experimenter:2.5.2-SNAPSHOT:2024-02-26T23:37:48Z

### Builder `ea.namedFunctions.hist()`

`ea.nf.hist(collection; nBins)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `collection` | npm | `ea.nf.identity()` | <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;X, <abbr title="java.util.Collection">Collection</abbr>&lt;<abbr title="java.lang.Number">Number</abbr>&gt;&gt;</code> |
| `nBins` | i | `8` | <code>int</code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;X, <abbr title="io.github.ericmedvet.jgea.core.util.TextPlotter$Miniplot">TextPlotter$Miniplot</abbr>&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.NamedFunctions.hist()` by jgea-experimenter:2.5.2-SNAPSHOT:2024-02-26T23:37:48Z

### Builder `ea.namedFunctions.hypervolume2D()`

`ea.nf.hypervolume2D(collection; minReference; maxReference; s)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `collection` | npm | `ea.nf.identity()` | <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;X, <abbr title="java.util.Collection">Collection</abbr>&lt;<abbr title="java.util.List">List</abbr>&lt;<abbr title="java.lang.Double">Double</abbr>&gt;&gt;&gt;</code> |
| `minReference` | d[] | `[]` | <code><abbr title="java.util.List">List</abbr>&lt;<abbr title="java.lang.Double">Double</abbr>&gt;</code> |
| `maxReference` | d[] | `[]` | <code><abbr title="java.util.List">List</abbr>&lt;<abbr title="java.lang.Double">Double</abbr>&gt;</code> |
| `s` | s | `%s` | <code><abbr title="java.lang.String">String</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;X, <abbr title="java.lang.Double">Double</abbr>&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.NamedFunctions.hypervolume2D()` by jgea-experimenter:2.5.2-SNAPSHOT:2024-02-26T23:37:48Z

### Builder `ea.namedFunctions.identity()`

`ea.nf.identity()`

Produces <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;T, T&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.NamedFunctions.identity()` by jgea-experimenter:2.5.2-SNAPSHOT:2024-02-26T23:37:48Z

### Builder `ea.namedFunctions.iterations()`

`ea.nf.iterations()`

Produces <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.solver.POCPopulationState">POCPopulationState</abbr>&lt;?, ?, ?, ?, ?&gt;, <abbr title="java.lang.Long">Long</abbr>&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.NamedFunctions.iterations()` by jgea-experimenter:2.5.2-SNAPSHOT:2024-02-26T23:37:48Z

### Builder `ea.namedFunctions.lasts()`

`ea.nf.lasts()`

Produces <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.solver.POCPopulationState">POCPopulationState</abbr>&lt;I, G, S, Q, P&gt;, <abbr title="java.util.Collection">Collection</abbr>&lt;I&gt;&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.NamedFunctions.lasts()` by jgea-experimenter:2.5.2-SNAPSHOT:2024-02-26T23:37:48Z

### Builder `ea.namedFunctions.max()`

`ea.nf.max(collection; s)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `collection` | npm | `ea.nf.identity()` | <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;X, <abbr title="java.util.Collection">Collection</abbr>&lt;T&gt;&gt;</code> |
| `s` | s | `%s` | <code><abbr title="java.lang.String">String</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;X, T&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.NamedFunctions.max()` by jgea-experimenter:2.5.2-SNAPSHOT:2024-02-26T23:37:48Z

### Builder `ea.namedFunctions.median()`

`ea.nf.median(collection; s)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `collection` | npm | `ea.nf.identity()` | <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;X, <abbr title="java.util.Collection">Collection</abbr>&lt;T&gt;&gt;</code> |
| `s` | s | `%s` | <code><abbr title="java.lang.String">String</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;X, T&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.NamedFunctions.median()` by jgea-experimenter:2.5.2-SNAPSHOT:2024-02-26T23:37:48Z

### Builder `ea.namedFunctions.mids()`

`ea.nf.mids()`

Produces <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.solver.POCPopulationState">POCPopulationState</abbr>&lt;I, G, S, Q, P&gt;, <abbr title="java.util.Collection">Collection</abbr>&lt;I&gt;&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.NamedFunctions.mids()` by jgea-experimenter:2.5.2-SNAPSHOT:2024-02-26T23:37:48Z

### Builder `ea.namedFunctions.min()`

`ea.nf.min(collection; s)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `collection` | npm | `ea.nf.identity()` | <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;X, <abbr title="java.util.Collection">Collection</abbr>&lt;T&gt;&gt;</code> |
| `s` | s | `%s` | <code><abbr title="java.lang.String">String</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;X, T&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.NamedFunctions.min()` by jgea-experimenter:2.5.2-SNAPSHOT:2024-02-26T23:37:48Z

### Builder `ea.namedFunctions.nth()`

`ea.nf.nth(list; n; s)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `list` | npm | `ea.nf.identity()` | <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;? super X, ? extends <abbr title="java.util.List">List</abbr>&lt;? extends T&gt;&gt;</code> |
| `n` | i |  | <code>int</code> |
| `s` | s | `%s` | <code><abbr title="java.lang.String">String</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;? super X, T&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.NamedFunctions.nth()` by jgea-experimenter:2.5.2-SNAPSHOT:2024-02-26T23:37:48Z

### Builder `ea.namedFunctions.nthItems()`

`ea.nf.nthItems(list; n; k)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `list` | npm | `ea.nf.identity()` | <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;X, <abbr title="java.util.List">List</abbr>&lt;T&gt;&gt;</code> |
| `n` | i |  | <code>int</code> |
| `k` | i |  | <code>int</code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;X, <abbr title="java.util.List">List</abbr>&lt;T&gt;&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.NamedFunctions.nthItems()` by jgea-experimenter:2.5.2-SNAPSHOT:2024-02-26T23:37:48Z

### Builder `ea.namedFunctions.overallTargetDistance()`

`ea.nf.overallTargetDistance()`

Produces <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.solver.POCPopulationState">POCPopulationState</abbr>&lt;I, G, S, <abbr title="java.lang.Double">Double</abbr>, P&gt;, <abbr title="java.lang.Double">Double</abbr>&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.NamedFunctions.overallTargetDistance()` by jgea-experimenter:2.5.2-SNAPSHOT:2024-02-26T23:37:48Z

### Builder `ea.namedFunctions.percentile()`

`ea.nf.percentile(collection; p; s)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `collection` | npm | `ea.nf.identity()` | <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;X, <abbr title="java.util.Collection">Collection</abbr>&lt;T&gt;&gt;</code> |
| `p` | d |  | <code>double</code> |
| `s` | s | `%s` | <code><abbr title="java.lang.String">String</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;X, T&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.NamedFunctions.percentile()` by jgea-experimenter:2.5.2-SNAPSHOT:2024-02-26T23:37:48Z

### Builder `ea.namedFunctions.progress()`

`ea.nf.progress()`

Produces <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.solver.POCPopulationState">POCPopulationState</abbr>&lt;?, ?, ?, ?, ?&gt;, <abbr title="java.lang.Double">Double</abbr>&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.NamedFunctions.progress()` by jgea-experimenter:2.5.2-SNAPSHOT:2024-02-26T23:37:48Z

### Builder `ea.namedFunctions.quantized()`

`ea.nf.quantized(f; r; s)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `f` | npm | `ea.nf.identity()` | <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;X, N&gt;</code> |
| `r` | d |  | <code>double</code> |
| `s` | s | `%s` | <code><abbr title="java.lang.String">String</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;X, <abbr title="java.lang.Double">Double</abbr>&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.NamedFunctions.quantized()` by jgea-experimenter:2.5.2-SNAPSHOT:2024-02-26T23:37:48Z

### Builder `ea.namedFunctions.runKey()`

`ea.nf.runKey(runKey)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `runKey` | npm |  | <code><abbr title="java.util.Map$Entry">Map$Entry</abbr>&lt;<abbr title="java.lang.String">String</abbr>, <abbr title="java.lang.String">String</abbr>&gt;</code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.experimenter.Run">Run</abbr>&lt;?, ?, ?, ?&gt;, ?&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.NamedFunctions.runKey()` by jgea-experimenter:2.5.2-SNAPSHOT:2024-02-26T23:37:48Z

### Builder `ea.namedFunctions.size()`

`ea.nf.size(f; s)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `f` | npm | `ea.nf.identity()` | <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;X, ?&gt;</code> |
| `s` | s | `%s` | <code><abbr title="java.lang.String">String</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;X, <abbr title="java.lang.Integer">Integer</abbr>&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.NamedFunctions.size()` by jgea-experimenter:2.5.2-SNAPSHOT:2024-02-26T23:37:48Z

### Builder `ea.namedFunctions.solution()`

`ea.nf.solution(individual; s)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `individual` | npm | `ea.nf.identity()` | <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;X, <abbr title="io.github.ericmedvet.jgea.core.solver.Individual">Individual</abbr>&lt;?, S, ?&gt;&gt;</code> |
| `s` | s | `%s` | <code><abbr title="java.lang.String">String</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;X, S&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.NamedFunctions.solution()` by jgea-experimenter:2.5.2-SNAPSHOT:2024-02-26T23:37:48Z

### Builder `ea.namedFunctions.subList()`

`ea.nf.subList(list; n; i)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `list` | npm | `ea.nf.identity()` | <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;X, <abbr title="java.util.List">List</abbr>&lt;T&gt;&gt;</code> |
| `n` | i |  | <code>int</code> |
| `i` | i |  | <code>int</code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;X, <abbr title="java.util.List">List</abbr>&lt;T&gt;&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.NamedFunctions.subList()` by jgea-experimenter:2.5.2-SNAPSHOT:2024-02-26T23:37:48Z

### Builder `ea.namedFunctions.targetDistances()`

`ea.nf.targetDistances(individual; problem)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `individual` | npm | `ea.nf.identity()` | <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;X, <abbr title="io.github.ericmedvet.jgea.core.solver.Individual">Individual</abbr>&lt;?, S, ?&gt;&gt;</code> |
| `problem` | npm |  | <code><abbr title="io.github.ericmedvet.jgea.core.problem.MultiTargetProblem">MultiTargetProblem</abbr>&lt;S&gt;</code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;X, <abbr title="java.util.List">List</abbr>&lt;<abbr title="java.lang.Double">Double</abbr>&gt;&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.NamedFunctions.targetDistances()` by jgea-experimenter:2.5.2-SNAPSHOT:2024-02-26T23:37:48Z

### Builder `ea.namedFunctions.uniqueness()`

`ea.nf.uniqueness(collection)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `collection` | npm | `ea.nf.identity()` | <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;X, <abbr title="java.util.Collection">Collection</abbr>&lt;T&gt;&gt;</code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;X, <abbr title="java.lang.Double">Double</abbr>&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.NamedFunctions.uniqueness()` by jgea-experimenter:2.5.2-SNAPSHOT:2024-02-26T23:37:48Z

### Builder `ea.namedFunctions.validationFitness()`

`ea.nf.validationFitness(individual; s)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `individual` | npm | `ea.nf.best()` | <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.solver.POCPopulationState">POCPopulationState</abbr>&lt;I, G, S, Q, P&gt;, <abbr title="io.github.ericmedvet.jgea.core.solver.Individual">Individual</abbr>&lt;?, S, ?&gt;&gt;</code> |
| `s` | s | `%s` | <code><abbr title="java.lang.String">String</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.solver.POCPopulationState">POCPopulationState</abbr>&lt;I, G, S, Q, P&gt;, Q&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.NamedFunctions.validationFitness()` by jgea-experimenter:2.5.2-SNAPSHOT:2024-02-26T23:37:48Z

## Package `ea.plot`

### Builder `ea.plot.biObjectivePopulation()`

`ea.plot.biObjectivePopulation(titleRunKey; predicateValue; condition; xRange; yRange; unique)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `titleRunKey` | npm | `ea.misc.sEntry(value = "Fronts of {solver.name} on {problem.name} (seed={randomGenerator.seed})"; key = title)` | <code><abbr title="java.util.Map$Entry">Map$Entry</abbr>&lt;<abbr title="java.lang.String">String</abbr>, <abbr title="java.lang.String">String</abbr>&gt;</code> |
| `predicateValue` | npm | `ea.nf.iterations()` | <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.solver.POCPopulationState">POCPopulationState</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.solver.Individual">Individual</abbr>&lt;G, S, <abbr title="java.util.List">List</abbr>&lt;<abbr title="java.lang.Double">Double</abbr>&gt;&gt;, G, S, <abbr title="java.util.List">List</abbr>&lt;<abbr title="java.lang.Double">Double</abbr>&gt;, ?&gt;, X&gt;</code> |
| `condition` | npm | `ea.predicate.always()` | <code><abbr title="java.util.function.Predicate">Predicate</abbr>&lt;X&gt;</code> |
| `xRange` | npm | `ds.range(min = -Infinity; max = Infinity)` | <code><abbr title="io.github.ericmedvet.jnb.datastructure.DoubleRange">DoubleRange</abbr></code> |
| `yRange` | npm | `ds.range(min = -Infinity; max = Infinity)` | <code><abbr title="io.github.ericmedvet.jnb.datastructure.DoubleRange">DoubleRange</abbr></code> |
| `unique` | b | `true` | <code>boolean</code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.experimenter.listener.plot.accumulator.XYDataSeriesSEPAF">XYDataSeriesSEPAF</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.solver.POCPopulationState">POCPopulationState</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.solver.Individual">Individual</abbr>&lt;G, S, <abbr title="java.util.List">List</abbr>&lt;<abbr title="java.lang.Double">Double</abbr>&gt;&gt;, G, S, <abbr title="java.util.List">List</abbr>&lt;<abbr title="java.lang.Double">Double</abbr>&gt;, P&gt;, <abbr title="io.github.ericmedvet.jgea.experimenter.Run">Run</abbr>&lt;?, G, S, <abbr title="java.util.List">List</abbr>&lt;<abbr title="java.lang.Double">Double</abbr>&gt;&gt;, X, <abbr title="io.github.ericmedvet.jgea.core.solver.Individual">Individual</abbr>&lt;G, S, <abbr title="java.util.List">List</abbr>&lt;<abbr title="java.lang.Double">Double</abbr>&gt;&gt;&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.Plots.biObjectivePopulation()` by jgea-experimenter:2.5.2-SNAPSHOT:2024-02-26T23:37:48Z

### Builder `ea.plot.dyPlot()`

`ea.plot.dyPlot(titleRunKey; x; y; xRange; yRange)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `titleRunKey` | npm | `ea.misc.sEntry(value = "{solver.name} on {problem.name} (seed={randomGenerator.seed})"; key = title)` | <code><abbr title="java.util.Map$Entry">Map$Entry</abbr>&lt;<abbr title="java.lang.String">String</abbr>, <abbr title="java.lang.String">String</abbr>&gt;</code> |
| `x` | npm | `ea.nf.iterations()` | <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;? super <abbr title="io.github.ericmedvet.jgea.core.solver.POCPopulationState">POCPopulationState</abbr>&lt;?, G, S, Q, ?&gt;, ? extends <abbr title="java.lang.Number">Number</abbr>&gt;</code> |
| `y` | npm |  | <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;? super <abbr title="io.github.ericmedvet.jgea.core.solver.POCPopulationState">POCPopulationState</abbr>&lt;?, G, S, Q, ?&gt;, ? extends <abbr title="java.lang.Number">Number</abbr>&gt;</code> |
| `xRange` | npm | `ds.range(min = -Infinity; max = Infinity)` | <code><abbr title="io.github.ericmedvet.jnb.datastructure.DoubleRange">DoubleRange</abbr></code> |
| `yRange` | npm | `ds.range(min = -Infinity; max = Infinity)` | <code><abbr title="io.github.ericmedvet.jnb.datastructure.DoubleRange">DoubleRange</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.experimenter.listener.plot.accumulator.XYDataSeriesSRPAF">XYDataSeriesSRPAF</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.solver.POCPopulationState">POCPopulationState</abbr>&lt;?, G, S, Q, ?&gt;, <abbr title="io.github.ericmedvet.jgea.experimenter.Run">Run</abbr>&lt;?, G, S, Q&gt;&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.Plots.dyPlot()` by jgea-experimenter:2.5.2-SNAPSHOT:2024-02-26T23:37:48Z

### Builder `ea.plot.elapsed()`

`ea.plot.elapsed(titleRunKey; x; y; xRange; yRange)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `titleRunKey` | npm | `ea.misc.sEntry(value = "Elapsed time of {solver.name} on {problem.name} (seed={randomGenerator.seed})"; key = title)` | <code><abbr title="java.util.Map$Entry">Map$Entry</abbr>&lt;<abbr title="java.lang.String">String</abbr>, <abbr title="java.lang.String">String</abbr>&gt;</code> |
| `x` | npm | `ea.nf.iterations()` | <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;? super <abbr title="io.github.ericmedvet.jgea.core.solver.POCPopulationState">POCPopulationState</abbr>&lt;?, G, S, Q, ?&gt;, ? extends <abbr title="java.lang.Number">Number</abbr>&gt;</code> |
| `y` | npm | `ea.nf.elapsed()` | <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;? super <abbr title="io.github.ericmedvet.jgea.core.solver.POCPopulationState">POCPopulationState</abbr>&lt;?, G, S, Q, ?&gt;, ? extends <abbr title="java.lang.Number">Number</abbr>&gt;</code> |
| `xRange` | npm | `ds.range(min = -Infinity; max = Infinity)` | <code><abbr title="io.github.ericmedvet.jnb.datastructure.DoubleRange">DoubleRange</abbr></code> |
| `yRange` | npm | `ds.range(min = -Infinity; max = Infinity)` | <code><abbr title="io.github.ericmedvet.jnb.datastructure.DoubleRange">DoubleRange</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.experimenter.listener.plot.accumulator.XYDataSeriesSRPAF">XYDataSeriesSRPAF</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.solver.POCPopulationState">POCPopulationState</abbr>&lt;?, G, S, Q, ?&gt;, <abbr title="io.github.ericmedvet.jgea.experimenter.Run">Run</abbr>&lt;?, G, S, Q&gt;&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.Plots.elapsed()` by jgea-experimenter:2.5.2-SNAPSHOT:2024-02-26T23:37:48Z

### Builder `ea.plot.fitness()`

`ea.plot.fitness(titleRunKey; x; collection; f; xRange; yRange; sort; s)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `titleRunKey` | npm | `ea.misc.sEntry(value = "Best fitness of {solver.name} on {problem.name} (seed={randomGenerator.seed})"; key = title)` | <code><abbr title="java.util.Map$Entry">Map$Entry</abbr>&lt;<abbr title="java.lang.String">String</abbr>, <abbr title="java.lang.String">String</abbr>&gt;</code> |
| `x` | npm | `ea.nf.iterations()` | <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;? super <abbr title="io.github.ericmedvet.jgea.core.solver.POCPopulationState">POCPopulationState</abbr>&lt;?, G, S, Q, ?&gt;, ? extends <abbr title="java.lang.Number">Number</abbr>&gt;</code> |
| `collection` | npm | `ea.nf.all()` | <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.solver.POCPopulationState">POCPopulationState</abbr>&lt;?, G, S, Q, ?&gt;, <abbr title="java.util.Collection">Collection</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.solver.Individual">Individual</abbr>&lt;G, S, Q&gt;&gt;&gt;</code> |
| `f` | npm | `ea.nf.identity()` | <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;Q, <abbr title="java.lang.Double">Double</abbr>&gt;</code> |
| `xRange` | npm | `ds.range(min = -Infinity; max = Infinity)` | <code><abbr title="io.github.ericmedvet.jnb.datastructure.DoubleRange">DoubleRange</abbr></code> |
| `yRange` | npm | `ds.range(min = -Infinity; max = Infinity)` | <code><abbr title="io.github.ericmedvet.jnb.datastructure.DoubleRange">DoubleRange</abbr></code> |
| `sort` | e | `MIN` | <code><abbr title="io.github.ericmedvet.jgea.experimenter.builders.Plots$Sorting">Plots$Sorting</abbr></code> |
| `s` | s | `%.2f` | <code><abbr title="java.lang.String">String</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.experimenter.listener.plot.accumulator.XYDataSeriesSRPAF">XYDataSeriesSRPAF</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.solver.POCPopulationState">POCPopulationState</abbr>&lt;?, G, S, Q, ?&gt;, <abbr title="io.github.ericmedvet.jgea.experimenter.Run">Run</abbr>&lt;?, G, S, Q&gt;&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.Plots.fitness()` by jgea-experimenter:2.5.2-SNAPSHOT:2024-02-26T23:37:48Z

### Builder `ea.plot.fitnessBoxplotMatrix()`

`ea.plot.fitnessBoxplotMatrix(xSubplotRunKey; ySubplotRunKey; lineRunKey; yFunction; predicateValue; condition; yRange)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `xSubplotRunKey` | npm | `ea.misc.sEntry(value = "_"; key = none)` | <code><abbr title="java.util.Map$Entry">Map$Entry</abbr>&lt;<abbr title="java.lang.String">String</abbr>, <abbr title="java.lang.String">String</abbr>&gt;</code> |
| `ySubplotRunKey` | npm | `ea.misc.sEntry(value = "{problem.name}"; key = problem)` | <code><abbr title="java.util.Map$Entry">Map$Entry</abbr>&lt;<abbr title="java.lang.String">String</abbr>, <abbr title="java.lang.String">String</abbr>&gt;</code> |
| `lineRunKey` | npm | `ea.misc.sEntry(value = "{solver.name}"; key = solver)` | <code><abbr title="java.util.Map$Entry">Map$Entry</abbr>&lt;<abbr title="java.lang.String">String</abbr>, <abbr title="java.lang.String">String</abbr>&gt;</code> |
| `yFunction` | npm | `ea.nf.bestFitness()` | <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;? super <abbr title="io.github.ericmedvet.jgea.core.solver.POCPopulationState">POCPopulationState</abbr>&lt;?, G, S, Q, ?&gt;, ? extends <abbr title="java.lang.Number">Number</abbr>&gt;</code> |
| `predicateValue` | npm | `ea.nf.progress()` | <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.solver.POCPopulationState">POCPopulationState</abbr>&lt;?, G, S, Q, ?&gt;, X&gt;</code> |
| `condition` | npm | `ea.predicate.gtEq(t = 1)` | <code><abbr title="java.util.function.Predicate">Predicate</abbr>&lt;X&gt;</code> |
| `yRange` | npm | `ds.range(min = -Infinity; max = Infinity)` | <code><abbr title="io.github.ericmedvet.jnb.datastructure.DoubleRange">DoubleRange</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.experimenter.listener.plot.accumulator.DistributionMRPAF">DistributionMRPAF</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.solver.POCPopulationState">POCPopulationState</abbr>&lt;?, G, S, Q, ?&gt;, <abbr title="io.github.ericmedvet.jgea.experimenter.Run">Run</abbr>&lt;?, G, S, Q&gt;, <abbr title="java.lang.String">String</abbr>, X&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.Plots.fitnessBoxplotMatrix()` by jgea-experimenter:2.5.2-SNAPSHOT:2024-02-26T23:37:48Z

### Builder `ea.plot.fitnessPlotMatrix()`

`ea.plot.fitnessPlotMatrix(xSubplotRunKey; ySubplotRunKey; lineRunKey; xFunction; yFunction; valueAggregator; minAggregator; maxAggregator; xRange; yRange)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `xSubplotRunKey` | npm | `ea.misc.sEntry(value = "_"; key = none)` | <code><abbr title="java.util.Map$Entry">Map$Entry</abbr>&lt;<abbr title="java.lang.String">String</abbr>, <abbr title="java.lang.String">String</abbr>&gt;</code> |
| `ySubplotRunKey` | npm | `ea.misc.sEntry(value = "{problem.name}"; key = problem)` | <code><abbr title="java.util.Map$Entry">Map$Entry</abbr>&lt;<abbr title="java.lang.String">String</abbr>, <abbr title="java.lang.String">String</abbr>&gt;</code> |
| `lineRunKey` | npm | `ea.misc.sEntry(value = "{solver.name}"; key = solver)` | <code><abbr title="java.util.Map$Entry">Map$Entry</abbr>&lt;<abbr title="java.lang.String">String</abbr>, <abbr title="java.lang.String">String</abbr>&gt;</code> |
| `xFunction` | npm | `ea.nf.evals()` | <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;? super <abbr title="io.github.ericmedvet.jgea.core.solver.POCPopulationState">POCPopulationState</abbr>&lt;?, G, S, Q, ?&gt;, ? extends <abbr title="java.lang.Number">Number</abbr>&gt;</code> |
| `yFunction` | npm | `ea.nf.bestFitness()` | <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;? super <abbr title="io.github.ericmedvet.jgea.core.solver.POCPopulationState">POCPopulationState</abbr>&lt;?, G, S, Q, ?&gt;, ? extends <abbr title="java.lang.Number">Number</abbr>&gt;</code> |
| `valueAggregator` | npm | `ea.nf.median(collection = ea.nf.identity())` | <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;<abbr title="java.util.List">List</abbr>&lt;<abbr title="java.lang.Number">Number</abbr>&gt;, <abbr title="java.lang.Number">Number</abbr>&gt;</code> |
| `minAggregator` | npm | `ea.nf.percentile(p = 0.25; collection = ea.nf.identity())` | <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;<abbr title="java.util.List">List</abbr>&lt;<abbr title="java.lang.Number">Number</abbr>&gt;, <abbr title="java.lang.Number">Number</abbr>&gt;</code> |
| `maxAggregator` | npm | `ea.nf.percentile(p = 0.75; collection = ea.nf.identity())` | <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;<abbr title="java.util.List">List</abbr>&lt;<abbr title="java.lang.Number">Number</abbr>&gt;, <abbr title="java.lang.Number">Number</abbr>&gt;</code> |
| `xRange` | npm | `ds.range(min = -Infinity; max = Infinity)` | <code><abbr title="io.github.ericmedvet.jnb.datastructure.DoubleRange">DoubleRange</abbr></code> |
| `yRange` | npm | `ds.range(min = -Infinity; max = Infinity)` | <code><abbr title="io.github.ericmedvet.jnb.datastructure.DoubleRange">DoubleRange</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.experimenter.listener.plot.accumulator.AggregatedXYDataSeriesMRPAF">AggregatedXYDataSeriesMRPAF</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.solver.POCPopulationState">POCPopulationState</abbr>&lt;?, G, S, Q, ?&gt;, <abbr title="io.github.ericmedvet.jgea.experimenter.Run">Run</abbr>&lt;?, G, S, Q&gt;, <abbr title="java.lang.String">String</abbr>&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.Plots.fitnessPlotMatrix()` by jgea-experimenter:2.5.2-SNAPSHOT:2024-02-26T23:37:48Z

### Builder `ea.plot.gridPopulation()`

`ea.plot.gridPopulation(titleRunKey; individualFunctions; predicateValue; condition; valueRange; unique)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `titleRunKey` | npm | `ea.misc.sEntry(value = "Population grid of {solver.name} on {problem.name} (seed={randomGenerator.seed})"; key = title)` | <code><abbr title="java.util.Map$Entry">Map$Entry</abbr>&lt;<abbr title="java.lang.String">String</abbr>, <abbr title="java.lang.String">String</abbr>&gt;</code> |
| `individualFunctions` | npm[] | `[ea.nf.fitness()]` | <code><abbr title="java.util.List">List</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;? super <abbr title="io.github.ericmedvet.jgea.core.solver.Individual">Individual</abbr>&lt;G, S, Q&gt;, ? extends <abbr title="java.lang.Number">Number</abbr>&gt;&gt;</code> |
| `predicateValue` | npm | `ea.nf.iterations()` | <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.solver.cabea.GridPopulationState">GridPopulationState</abbr>&lt;G, S, Q, ?&gt;, X&gt;</code> |
| `condition` | npm | `ea.predicate.always()` | <code><abbr title="java.util.function.Predicate">Predicate</abbr>&lt;X&gt;</code> |
| `valueRange` | npm | `ds.range(min = -Infinity; max = Infinity)` | <code><abbr title="io.github.ericmedvet.jnb.datastructure.DoubleRange">DoubleRange</abbr></code> |
| `unique` | b | `true` | <code>boolean</code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.experimenter.listener.plot.accumulator.UnivariateGridSEPAF">UnivariateGridSEPAF</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.solver.cabea.GridPopulationState">GridPopulationState</abbr>&lt;G, S, Q, ?&gt;, <abbr title="io.github.ericmedvet.jgea.experimenter.Run">Run</abbr>&lt;?, G, S, Q&gt;, X, <abbr title="io.github.ericmedvet.jgea.core.solver.Individual">Individual</abbr>&lt;G, S, Q&gt;&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.Plots.gridPopulation()` by jgea-experimenter:2.5.2-SNAPSHOT:2024-02-26T23:37:48Z

### Builder `ea.plot.landscape()`

`ea.plot.landscape(titleRunKey; predicateValue; mapper; condition; xRange; yRange; valueRange; unique)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `titleRunKey` | npm | `ea.misc.sEntry(value = "Landscape of {solver.name} on {problem.name} (seed={randomGenerator.seed})"; key = title)` | <code><abbr title="java.util.Map$Entry">Map$Entry</abbr>&lt;<abbr title="java.lang.String">String</abbr>, <abbr title="java.lang.String">String</abbr>&gt;</code> |
| `predicateValue` | npm | `ea.nf.iterations()` | <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.solver.POCPopulationState">POCPopulationState</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.solver.Individual">Individual</abbr>&lt;<abbr title="java.util.List">List</abbr>&lt;<abbr title="java.lang.Double">Double</abbr>&gt;, S, <abbr title="java.lang.Double">Double</abbr>&gt;, <abbr title="java.util.List">List</abbr>&lt;<abbr title="java.lang.Double">Double</abbr>&gt;, S, <abbr title="java.lang.Double">Double</abbr>, ?&gt;, X&gt;</code> |
| `mapper` | npm | `ea.m.identity()` | <code><abbr title="io.github.ericmedvet.jgea.experimenter.InvertibleMapper">InvertibleMapper</abbr>&lt;<abbr title="java.util.List">List</abbr>&lt;<abbr title="java.lang.Double">Double</abbr>&gt;, S&gt;</code> |
| `condition` | npm | `ea.predicate.always()` | <code><abbr title="java.util.function.Predicate">Predicate</abbr>&lt;X&gt;</code> |
| `xRange` | npm | `ds.range(min = -Infinity; max = Infinity)` | <code><abbr title="io.github.ericmedvet.jnb.datastructure.DoubleRange">DoubleRange</abbr></code> |
| `yRange` | npm | `ds.range(min = -Infinity; max = Infinity)` | <code><abbr title="io.github.ericmedvet.jnb.datastructure.DoubleRange">DoubleRange</abbr></code> |
| `valueRange` | npm | `ds.range(min = -Infinity; max = Infinity)` | <code><abbr title="io.github.ericmedvet.jnb.datastructure.DoubleRange">DoubleRange</abbr></code> |
| `unique` | b | `true` | <code>boolean</code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.experimenter.listener.plot.accumulator.LandscapeSEPAF">LandscapeSEPAF</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.solver.POCPopulationState">POCPopulationState</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.solver.Individual">Individual</abbr>&lt;<abbr title="java.util.List">List</abbr>&lt;<abbr title="java.lang.Double">Double</abbr>&gt;, S, <abbr title="java.lang.Double">Double</abbr>&gt;, <abbr title="java.util.List">List</abbr>&lt;<abbr title="java.lang.Double">Double</abbr>&gt;, S, <abbr title="java.lang.Double">Double</abbr>, P&gt;, <abbr title="io.github.ericmedvet.jgea.experimenter.Run">Run</abbr>&lt;?, <abbr title="java.util.List">List</abbr>&lt;<abbr title="java.lang.Double">Double</abbr>&gt;, S, <abbr title="java.lang.Double">Double</abbr>&gt;, X, <abbr title="io.github.ericmedvet.jgea.core.solver.Individual">Individual</abbr>&lt;<abbr title="java.util.List">List</abbr>&lt;<abbr title="java.lang.Double">Double</abbr>&gt;, S, <abbr title="java.lang.Double">Double</abbr>&gt;&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.Plots.landscape()` by jgea-experimenter:2.5.2-SNAPSHOT:2024-02-26T23:37:48Z

### Builder `ea.plot.mapElitesPopulation()`

`ea.plot.mapElitesPopulation(titleRunKey; individualFunctions; predicateValue; condition; valueRange; unique)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `titleRunKey` | npm | `ea.misc.sEntry(value = "Map of elites of {solver.name} on {problem.name} (seed={randomGenerator.seed})"; key = title)` | <code><abbr title="java.util.Map$Entry">Map$Entry</abbr>&lt;<abbr title="java.lang.String">String</abbr>, <abbr title="java.lang.String">String</abbr>&gt;</code> |
| `individualFunctions` | npm[] | `[ea.nf.fitness()]` | <code><abbr title="java.util.List">List</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;? super <abbr title="io.github.ericmedvet.jgea.core.solver.Individual">Individual</abbr>&lt;G, S, Q&gt;, ? extends <abbr title="java.lang.Number">Number</abbr>&gt;&gt;</code> |
| `predicateValue` | npm | `ea.nf.iterations()` | <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.solver.mapelites.MEPopulationState">MEPopulationState</abbr>&lt;G, S, Q, ?&gt;, X&gt;</code> |
| `condition` | npm | `ea.predicate.always()` | <code><abbr title="java.util.function.Predicate">Predicate</abbr>&lt;X&gt;</code> |
| `valueRange` | npm | `ds.range(min = -Infinity; max = Infinity)` | <code><abbr title="io.github.ericmedvet.jnb.datastructure.DoubleRange">DoubleRange</abbr></code> |
| `unique` | b | `true` | <code>boolean</code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.experimenter.listener.plot.accumulator.UnivariateGridSEPAF">UnivariateGridSEPAF</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.solver.mapelites.MEPopulationState">MEPopulationState</abbr>&lt;G, S, Q, ?&gt;, <abbr title="io.github.ericmedvet.jgea.experimenter.Run">Run</abbr>&lt;?, G, S, Q&gt;, X, <abbr title="io.github.ericmedvet.jgea.core.solver.Individual">Individual</abbr>&lt;G, S, Q&gt;&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.Plots.mapElitesPopulation()` by jgea-experimenter:2.5.2-SNAPSHOT:2024-02-26T23:37:48Z

### Builder `ea.plot.uniqueness()`

`ea.plot.uniqueness(titleRunKey; x; ys; xRange; yRange)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `titleRunKey` | npm | `ea.misc.sEntry(value = "Uniqueness of {solver.name} on {problem.name} (seed={randomGenerator.seed})"; key = title)` | <code><abbr title="java.util.Map$Entry">Map$Entry</abbr>&lt;<abbr title="java.lang.String">String</abbr>, <abbr title="java.lang.String">String</abbr>&gt;</code> |
| `x` | npm | `ea.nf.iterations()` | <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;? super <abbr title="io.github.ericmedvet.jgea.core.solver.POCPopulationState">POCPopulationState</abbr>&lt;?, G, S, Q, ?&gt;, ? extends <abbr title="java.lang.Number">Number</abbr>&gt;</code> |
| `ys` | npm[] | `[ea.nf.uniqueness(collection = ea.nf.each(collection = ea.nf.all(); map = ea.nf.genotype())), ea.nf.uniqueness(collection = ea.nf.each(collection = ea.nf.all(); map = ea.nf.solution())), ea.nf.uniqueness(collection = ea.nf.each(collection = ea.nf.all(); map = ea.nf.fitness()))]` | <code><abbr title="java.util.List">List</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;? super <abbr title="io.github.ericmedvet.jgea.core.solver.POCPopulationState">POCPopulationState</abbr>&lt;?, G, S, Q, ?&gt;, ? extends <abbr title="java.lang.Number">Number</abbr>&gt;&gt;</code> |
| `xRange` | npm | `ds.range(min = -Infinity; max = Infinity)` | <code><abbr title="io.github.ericmedvet.jnb.datastructure.DoubleRange">DoubleRange</abbr></code> |
| `yRange` | npm | `ds.range(min = -Infinity; max = Infinity)` | <code><abbr title="io.github.ericmedvet.jnb.datastructure.DoubleRange">DoubleRange</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.experimenter.listener.plot.accumulator.XYDataSeriesSRPAF">XYDataSeriesSRPAF</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.solver.POCPopulationState">POCPopulationState</abbr>&lt;?, G, S, Q, ?&gt;, <abbr title="io.github.ericmedvet.jgea.experimenter.Run">Run</abbr>&lt;?, G, S, Q&gt;&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.Plots.uniqueness()` by jgea-experimenter:2.5.2-SNAPSHOT:2024-02-26T23:37:48Z

### Builder `ea.plot.xyPlot()`

`ea.plot.xyPlot(titleRunKey; x; y; xRange; yRange)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `titleRunKey` | npm | `ea.misc.sEntry(value = "{solver.name} on {problem.name} (seed={randomGenerator.seed})"; key = title)` | <code><abbr title="java.util.Map$Entry">Map$Entry</abbr>&lt;<abbr title="java.lang.String">String</abbr>, <abbr title="java.lang.String">String</abbr>&gt;</code> |
| `x` | npm |  | <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;? super E, ? extends <abbr title="java.lang.Number">Number</abbr>&gt;</code> |
| `y` | npm |  | <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;? super E, ? extends <abbr title="java.lang.Number">Number</abbr>&gt;</code> |
| `xRange` | npm | `ds.range(min = -Infinity; max = Infinity)` | <code><abbr title="io.github.ericmedvet.jnb.datastructure.DoubleRange">DoubleRange</abbr></code> |
| `yRange` | npm | `ds.range(min = -Infinity; max = Infinity)` | <code><abbr title="io.github.ericmedvet.jnb.datastructure.DoubleRange">DoubleRange</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.experimenter.listener.plot.accumulator.XYDataSeriesSRPAF">XYDataSeriesSRPAF</abbr>&lt;E, <abbr title="io.github.ericmedvet.jgea.experimenter.Run">Run</abbr>&lt;?, G, S, Q&gt;&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.Plots.xyPlot()` by jgea-experimenter:2.5.2-SNAPSHOT:2024-02-26T23:37:48Z

### Builder `ea.plot.xyPlotMatrix()`

`ea.plot.xyPlotMatrix(xSubplotRunKey; ySubplotRunKey; lineRunKey; xFunction; yFunction; valueAggregator; minAggregator; maxAggregator; xRange; yRange)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `xSubplotRunKey` | npm | `ea.misc.sEntry(value = "_"; key = none)` | <code><abbr title="java.util.Map$Entry">Map$Entry</abbr>&lt;<abbr title="java.lang.String">String</abbr>, <abbr title="java.lang.String">String</abbr>&gt;</code> |
| `ySubplotRunKey` | npm | `ea.misc.sEntry(value = "{problem}"; key = problem)` | <code><abbr title="java.util.Map$Entry">Map$Entry</abbr>&lt;<abbr title="java.lang.String">String</abbr>, <abbr title="java.lang.String">String</abbr>&gt;</code> |
| `lineRunKey` | npm | `ea.misc.sEntry(value = "{solver.name}"; key = solver)` | <code><abbr title="java.util.Map$Entry">Map$Entry</abbr>&lt;<abbr title="java.lang.String">String</abbr>, <abbr title="java.lang.String">String</abbr>&gt;</code> |
| `xFunction` | npm |  | <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;? super <abbr title="io.github.ericmedvet.jgea.core.solver.POCPopulationState">POCPopulationState</abbr>&lt;?, G, S, Q, ?&gt;, ? extends <abbr title="java.lang.Number">Number</abbr>&gt;</code> |
| `yFunction` | npm |  | <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;? super <abbr title="io.github.ericmedvet.jgea.core.solver.POCPopulationState">POCPopulationState</abbr>&lt;?, G, S, Q, ?&gt;, ? extends <abbr title="java.lang.Number">Number</abbr>&gt;</code> |
| `valueAggregator` | npm | `ea.nf.median(collection = ea.nf.identity())` | <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;<abbr title="java.util.List">List</abbr>&lt;<abbr title="java.lang.Number">Number</abbr>&gt;, <abbr title="java.lang.Number">Number</abbr>&gt;</code> |
| `minAggregator` | npm | `ea.nf.percentile(p = 0.25; collection = ea.nf.identity())` | <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;<abbr title="java.util.List">List</abbr>&lt;<abbr title="java.lang.Number">Number</abbr>&gt;, <abbr title="java.lang.Number">Number</abbr>&gt;</code> |
| `maxAggregator` | npm | `ea.nf.percentile(p = 0.75; collection = ea.nf.identity())` | <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;<abbr title="java.util.List">List</abbr>&lt;<abbr title="java.lang.Number">Number</abbr>&gt;, <abbr title="java.lang.Number">Number</abbr>&gt;</code> |
| `xRange` | npm | `ds.range(min = -Infinity; max = Infinity)` | <code><abbr title="io.github.ericmedvet.jnb.datastructure.DoubleRange">DoubleRange</abbr></code> |
| `yRange` | npm | `ds.range(min = -Infinity; max = Infinity)` | <code><abbr title="io.github.ericmedvet.jnb.datastructure.DoubleRange">DoubleRange</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.experimenter.listener.plot.accumulator.AggregatedXYDataSeriesMRPAF">AggregatedXYDataSeriesMRPAF</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.solver.POCPopulationState">POCPopulationState</abbr>&lt;?, G, S, Q, ?&gt;, <abbr title="io.github.ericmedvet.jgea.experimenter.Run">Run</abbr>&lt;?, G, S, Q&gt;, <abbr title="java.lang.String">String</abbr>&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.Plots.xyPlotMatrix()` by jgea-experimenter:2.5.2-SNAPSHOT:2024-02-26T23:37:48Z

### Builder `ea.plot.xysPlot()`

`ea.plot.xysPlot(titleRunKey; x; ys; xRange; yRange)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `titleRunKey` | npm | `ea.misc.sEntry(value = "{solver.name} on {problem.name} (seed={randomGenerator.seed})"; key = title)` | <code><abbr title="java.util.Map$Entry">Map$Entry</abbr>&lt;<abbr title="java.lang.String">String</abbr>, <abbr title="java.lang.String">String</abbr>&gt;</code> |
| `x` | npm |  | <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;? super E, ? extends <abbr title="java.lang.Number">Number</abbr>&gt;</code> |
| `ys` | npm[] | `[]` | <code><abbr title="java.util.List">List</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;? super E, ? extends <abbr title="java.lang.Number">Number</abbr>&gt;&gt;</code> |
| `xRange` | npm | `ds.range(min = -Infinity; max = Infinity)` | <code><abbr title="io.github.ericmedvet.jnb.datastructure.DoubleRange">DoubleRange</abbr></code> |
| `yRange` | npm | `ds.range(min = -Infinity; max = Infinity)` | <code><abbr title="io.github.ericmedvet.jnb.datastructure.DoubleRange">DoubleRange</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.experimenter.listener.plot.accumulator.XYDataSeriesSRPAF">XYDataSeriesSRPAF</abbr>&lt;E, <abbr title="io.github.ericmedvet.jgea.experimenter.Run">Run</abbr>&lt;?, G, S, Q&gt;&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.Plots.xysPlot()` by jgea-experimenter:2.5.2-SNAPSHOT:2024-02-26T23:37:48Z

### Builder `ea.plot.yPlot()`

`ea.plot.yPlot(titleRunKey; x; y; xRange; yRange)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `titleRunKey` | npm | `ea.misc.sEntry(value = "{solver.name} on {problem.name} (seed={randomGenerator.seed})"; key = title)` | <code><abbr title="java.util.Map$Entry">Map$Entry</abbr>&lt;<abbr title="java.lang.String">String</abbr>, <abbr title="java.lang.String">String</abbr>&gt;</code> |
| `x` | npm | `ea.nf.iterations()` | <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;? super <abbr title="io.github.ericmedvet.jgea.core.solver.POCPopulationState">POCPopulationState</abbr>&lt;?, G, S, Q, ?&gt;, ? extends <abbr title="java.lang.Number">Number</abbr>&gt;</code> |
| `y` | npm |  | <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;? super <abbr title="io.github.ericmedvet.jgea.core.solver.POCPopulationState">POCPopulationState</abbr>&lt;?, G, S, Q, ?&gt;, ? extends <abbr title="java.lang.Number">Number</abbr>&gt;</code> |
| `xRange` | npm | `ds.range(min = -Infinity; max = Infinity)` | <code><abbr title="io.github.ericmedvet.jnb.datastructure.DoubleRange">DoubleRange</abbr></code> |
| `yRange` | npm | `ds.range(min = -Infinity; max = Infinity)` | <code><abbr title="io.github.ericmedvet.jnb.datastructure.DoubleRange">DoubleRange</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.experimenter.listener.plot.accumulator.XYDataSeriesSRPAF">XYDataSeriesSRPAF</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.solver.POCPopulationState">POCPopulationState</abbr>&lt;?, G, S, Q, ?&gt;, <abbr title="io.github.ericmedvet.jgea.experimenter.Run">Run</abbr>&lt;?, G, S, Q&gt;&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.Plots.yPlot()` by jgea-experimenter:2.5.2-SNAPSHOT:2024-02-26T23:37:48Z

### Builder `ea.plot.ysPlot()`

`ea.plot.ysPlot(titleRunKey; x; ys; xRange; yRange)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `titleRunKey` | npm | `ea.misc.sEntry(value = "{solver.name} on {problem.name} (seed={randomGenerator.seed})"; key = title)` | <code><abbr title="java.util.Map$Entry">Map$Entry</abbr>&lt;<abbr title="java.lang.String">String</abbr>, <abbr title="java.lang.String">String</abbr>&gt;</code> |
| `x` | npm | `ea.nf.iterations()` | <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;? super <abbr title="io.github.ericmedvet.jgea.core.solver.POCPopulationState">POCPopulationState</abbr>&lt;?, G, S, Q, ?&gt;, ? extends <abbr title="java.lang.Number">Number</abbr>&gt;</code> |
| `ys` | npm[] | `[]` | <code><abbr title="java.util.List">List</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;? super <abbr title="io.github.ericmedvet.jgea.core.solver.POCPopulationState">POCPopulationState</abbr>&lt;?, G, S, Q, ?&gt;, ? extends <abbr title="java.lang.Number">Number</abbr>&gt;&gt;</code> |
| `xRange` | npm | `ds.range(min = -Infinity; max = Infinity)` | <code><abbr title="io.github.ericmedvet.jnb.datastructure.DoubleRange">DoubleRange</abbr></code> |
| `yRange` | npm | `ds.range(min = -Infinity; max = Infinity)` | <code><abbr title="io.github.ericmedvet.jnb.datastructure.DoubleRange">DoubleRange</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.experimenter.listener.plot.accumulator.XYDataSeriesSRPAF">XYDataSeriesSRPAF</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.solver.POCPopulationState">POCPopulationState</abbr>&lt;?, G, S, Q, ?&gt;, <abbr title="io.github.ericmedvet.jgea.experimenter.Run">Run</abbr>&lt;?, G, S, Q&gt;&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.Plots.ysPlot()` by jgea-experimenter:2.5.2-SNAPSHOT:2024-02-26T23:37:48Z

## Package `ea.predicate`

### Builder `ea.predicate.all()`

`ea.predicate.all(conditions)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `conditions` | npm[] | `[]` | <code><abbr title="java.util.List">List</abbr>&lt;<abbr title="java.util.function.Predicate">Predicate</abbr>&lt;X&gt;&gt;</code> |

Produces <code><abbr title="java.util.function.Predicate">Predicate</abbr>&lt;X&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.Predicates.all()` by jgea-experimenter:2.5.2-SNAPSHOT:2024-02-26T23:37:48Z

### Builder `ea.predicate.always()`

`ea.predicate.always()`

Produces <code><abbr title="java.util.function.Predicate">Predicate</abbr>&lt;?&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.Predicates.always()` by jgea-experimenter:2.5.2-SNAPSHOT:2024-02-26T23:37:48Z

### Builder `ea.predicate.any()`

`ea.predicate.any(conditions)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `conditions` | npm[] | `[]` | <code><abbr title="java.util.List">List</abbr>&lt;<abbr title="java.util.function.Predicate">Predicate</abbr>&lt;X&gt;&gt;</code> |

Produces <code><abbr title="java.util.function.Predicate">Predicate</abbr>&lt;X&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.Predicates.any()` by jgea-experimenter:2.5.2-SNAPSHOT:2024-02-26T23:37:48Z

### Builder `ea.predicate.eq()`

`ea.predicate.eq(f; v)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `f` | npm | `ea.nf.identity()` | <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;X, T&gt;</code> |
| `v` | npm |  | <code>T</code> |

Produces <code><abbr title="java.util.function.Predicate">Predicate</abbr>&lt;X&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.Predicates.eq()` by jgea-experimenter:2.5.2-SNAPSHOT:2024-02-26T23:37:48Z

### Builder `ea.predicate.gt()`

`ea.predicate.gt(f; t)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `f` | npm | `ea.nf.identity()` | <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;X, ? extends <abbr title="java.lang.Number">Number</abbr>&gt;</code> |
| `t` | d |  | <code>double</code> |

Produces <code><abbr title="java.util.function.Predicate">Predicate</abbr>&lt;X&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.Predicates.gt()` by jgea-experimenter:2.5.2-SNAPSHOT:2024-02-26T23:37:48Z

### Builder `ea.predicate.gtEq()`

`ea.predicate.gtEq(f; t)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `f` | npm | `ea.nf.identity()` | <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;X, ? extends <abbr title="java.lang.Number">Number</abbr>&gt;</code> |
| `t` | d |  | <code>double</code> |

Produces <code><abbr title="java.util.function.Predicate">Predicate</abbr>&lt;X&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.Predicates.gtEq()` by jgea-experimenter:2.5.2-SNAPSHOT:2024-02-26T23:37:48Z

### Builder `ea.predicate.inD()`

`ea.predicate.inD(f; values)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `f` | npm | `ea.nf.identity()` | <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;X, <abbr title="java.lang.Double">Double</abbr>&gt;</code> |
| `values` | d[] | `[]` | <code><abbr title="java.util.List">List</abbr>&lt;<abbr title="java.lang.Double">Double</abbr>&gt;</code> |

Produces <code><abbr title="java.util.function.Predicate">Predicate</abbr>&lt;X&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.Predicates.inD()` by jgea-experimenter:2.5.2-SNAPSHOT:2024-02-26T23:37:48Z

### Builder `ea.predicate.inI()`

`ea.predicate.inI(f; values)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `f` | npm | `ea.nf.identity()` | <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;X, <abbr title="java.lang.Integer">Integer</abbr>&gt;</code> |
| `values` | i[] | `[]` | <code><abbr title="java.util.List">List</abbr>&lt;<abbr title="java.lang.Integer">Integer</abbr>&gt;</code> |

Produces <code><abbr title="java.util.function.Predicate">Predicate</abbr>&lt;X&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.Predicates.inI()` by jgea-experimenter:2.5.2-SNAPSHOT:2024-02-26T23:37:48Z

### Builder `ea.predicate.inL()`

`ea.predicate.inL(f; values)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `f` | npm | `ea.nf.identity()` | <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;X, <abbr title="java.lang.Long">Long</abbr>&gt;</code> |
| `values` | i[] | `[]` | <code><abbr title="java.util.List">List</abbr>&lt;<abbr title="java.lang.Integer">Integer</abbr>&gt;</code> |

Produces <code><abbr title="java.util.function.Predicate">Predicate</abbr>&lt;X&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.Predicates.inL()` by jgea-experimenter:2.5.2-SNAPSHOT:2024-02-26T23:37:48Z

### Builder `ea.predicate.inS()`

`ea.predicate.inS(f; values)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `f` | npm | `ea.nf.identity()` | <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;X, <abbr title="java.lang.String">String</abbr>&gt;</code> |
| `values` | s[] | `[]` | <code><abbr title="java.util.List">List</abbr>&lt;<abbr title="java.lang.String">String</abbr>&gt;</code> |

Produces <code><abbr title="java.util.function.Predicate">Predicate</abbr>&lt;X&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.Predicates.inS()` by jgea-experimenter:2.5.2-SNAPSHOT:2024-02-26T23:37:48Z

### Builder `ea.predicate.lt()`

`ea.predicate.lt(f; t)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `f` | npm | `ea.nf.identity()` | <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;X, ? extends <abbr title="java.lang.Number">Number</abbr>&gt;</code> |
| `t` | d |  | <code>double</code> |

Produces <code><abbr title="java.util.function.Predicate">Predicate</abbr>&lt;X&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.Predicates.lt()` by jgea-experimenter:2.5.2-SNAPSHOT:2024-02-26T23:37:48Z

### Builder `ea.predicate.ltEq()`

`ea.predicate.ltEq(f; t)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `f` | npm | `ea.nf.identity()` | <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;X, ? extends <abbr title="java.lang.Number">Number</abbr>&gt;</code> |
| `t` | d |  | <code>double</code> |

Produces <code><abbr title="java.util.function.Predicate">Predicate</abbr>&lt;X&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.Predicates.ltEq()` by jgea-experimenter:2.5.2-SNAPSHOT:2024-02-26T23:37:48Z

### Builder `ea.predicate.matches()`

`ea.predicate.matches(f; regex)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `f` | npm | `ea.nf.identity()` | <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;X, <abbr title="java.lang.String">String</abbr>&gt;</code> |
| `regex` | s |  | <code><abbr title="java.lang.String">String</abbr></code> |

Produces <code><abbr title="java.util.function.Predicate">Predicate</abbr>&lt;X&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.Predicates.matches()` by jgea-experimenter:2.5.2-SNAPSHOT:2024-02-26T23:37:48Z

## Package `ea.problem`

Aliases: `ea.p`, `ea.problem`

### Builder `ea.problem.mhoProblem()`

`ea.p.mhoProblem(name; mtProblem)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `name` | s | interpolate `mt2mo({mtProblem.name})` | <code><abbr title="java.lang.String">String</abbr></code> |
| `mtProblem` | npm |  | <code><abbr title="io.github.ericmedvet.jgea.core.problem.MultiTargetProblem">MultiTargetProblem</abbr>&lt;S&gt;</code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.core.problem.MultiHomogeneousObjectiveProblem">MultiHomogeneousObjectiveProblem</abbr>&lt;S, <abbr title="java.lang.Double">Double</abbr>&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.Problems.mhoProblem()` by jgea-experimenter:2.5.2-SNAPSHOT:2024-02-26T23:37:48Z

### Builder `ea.problem.totalOrder()`

`ea.p.totalOrder(name; qFunction; cFunction; type)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `name` | s | `to` | <code><abbr title="java.lang.String">String</abbr></code> |
| `qFunction` | npm |  | <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;S, Q&gt;</code> |
| `cFunction` | npm | `ea.f.identity()` | <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;Q, C&gt;</code> |
| `type` | e | `MINIMIZE` | <code><abbr title="io.github.ericmedvet.jgea.experimenter.builders.Problems$OptimizationType">Problems$OptimizationType</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.core.problem.TotalOrderQualityBasedProblem">TotalOrderQualityBasedProblem</abbr>&lt;S, Q&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.Problems.totalOrder()` by jgea-experimenter:2.5.2-SNAPSHOT:2024-02-26T23:37:48Z

## Package `ea.problem.control`

Aliases: `ea.p.c`, `ea.p.control`, `ea.problem.c`, `ea.problem.control`

### Builder `ea.problem.control.navigation()`

`ea.p.c.navigation(name; initialRobotXRange; initialRobotYRange; initialRobotDirection; targetXRange; targetYRange; robotRadius; robotMaxV; sensorsAngleRange; nOfSensors; sensorRange; senseTarget; dT; finalT; arena; metric; seed)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `name` | s | interpolate `nav-{arena}` | <code><abbr title="java.lang.String">String</abbr></code> |
| `initialRobotXRange` | npm | `ds.range(min = 0.45; max = 0.55)` | <code><abbr title="io.github.ericmedvet.jnb.datastructure.DoubleRange">DoubleRange</abbr></code> |
| `initialRobotYRange` | npm | `ds.range(min = 0.8; max = 0.85)` | <code><abbr title="io.github.ericmedvet.jnb.datastructure.DoubleRange">DoubleRange</abbr></code> |
| `initialRobotDirection` | npm | `ds.range(min = 0; max = 0)` | <code><abbr title="io.github.ericmedvet.jnb.datastructure.DoubleRange">DoubleRange</abbr></code> |
| `targetXRange` | npm | `ds.range(min = 0.5; max = 0.5)` | <code><abbr title="io.github.ericmedvet.jnb.datastructure.DoubleRange">DoubleRange</abbr></code> |
| `targetYRange` | npm | `ds.range(min = 0.15; max = 0.15)` | <code><abbr title="io.github.ericmedvet.jnb.datastructure.DoubleRange">DoubleRange</abbr></code> |
| `robotRadius` | d | `0.05` | <code>double</code> |
| `robotMaxV` | d | `0.01` | <code>double</code> |
| `sensorsAngleRange` | npm | `ds.range(min = -1.57; max = 1.57)` | <code><abbr title="io.github.ericmedvet.jnb.datastructure.DoubleRange">DoubleRange</abbr></code> |
| `nOfSensors` | i | `5` | <code>int</code> |
| `sensorRange` | d | `0.5` | <code>double</code> |
| `senseTarget` | b | `true` | <code>boolean</code> |
| `dT` | d | `0.1` | <code>double</code> |
| `finalT` | d | `100.0` | <code>double</code> |
| `arena` | e | `EMPTY` | <code><abbr title="io.github.ericmedvet.jgea.problem.control.navigation.Arena$Prepared">Arena$Prepared</abbr></code> |
| `metric` | e | `AVG_DISTANCE` | <code><abbr title="io.github.ericmedvet.jgea.problem.control.navigation.Navigation$Metric">Navigation$Metric</abbr></code> |
| `seed` | i | `1` | <code>int</code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.problem.control.navigation.Navigation">Navigation</abbr>&lt;?&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.ControlProblems.navigation()` by jgea-experimenter:2.5.2-SNAPSHOT:2024-02-26T23:37:48Z

## Package `ea.problem.dataset.numerical`

Aliases: `ea.p.d.num`, `ea.p.d.numerical`, `ea.p.dataset.num`, `ea.p.dataset.numerical`, `ea.problem.d.num`, `ea.problem.d.numerical`, `ea.problem.dataset.num`, `ea.problem.dataset.numerical`

### Builder `ea.problem.dataset.numerical.empty()`

`ea.p.d.num.empty(xVars; yVars)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `xVars` | s[] | `[]` | <code><abbr title="java.util.List">List</abbr>&lt;<abbr title="java.lang.String">String</abbr>&gt;</code> |
| `yVars` | s[] | `[]` | <code><abbr title="java.util.List">List</abbr>&lt;<abbr title="java.lang.String">String</abbr>&gt;</code> |

Produces <code><abbr title="java.util.function.Supplier">Supplier</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.problem.regression.NumericalDataset">NumericalDataset</abbr>&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.NumericalDatasets.empty()` by jgea-experimenter:2.5.2-SNAPSHOT:2024-02-26T23:37:48Z

### Builder `ea.problem.dataset.numerical.fromFile()`

`ea.p.d.num.fromFile(filePath; folds; nFolds; xVarNamePattern; yVarNamePattern)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `filePath` | s |  | <code><abbr title="java.lang.String">String</abbr></code> |
| `folds` | i[] | `[0]` | <code><abbr title="java.util.List">List</abbr>&lt;<abbr title="java.lang.Integer">Integer</abbr>&gt;</code> |
| `nFolds` | i | `1` | <code>int</code> |
| `xVarNamePattern` | s | `x.*` | <code><abbr title="java.lang.String">String</abbr></code> |
| `yVarNamePattern` | s | `y.*` | <code><abbr title="java.lang.String">String</abbr></code> |

Produces <code><abbr title="java.util.function.Supplier">Supplier</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.problem.regression.NumericalDataset">NumericalDataset</abbr>&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.NumericalDatasets.fromFile()` by jgea-experimenter:2.5.2-SNAPSHOT:2024-02-26T23:37:48Z

### Builder `ea.problem.dataset.numerical.fromProblem()`

`ea.p.d.num.fromProblem(problem)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `problem` | npm |  | <code><abbr title="io.github.ericmedvet.jgea.problem.regression.univariate.UnivariateRegressionProblem">UnivariateRegressionProblem</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.problem.regression.univariate.UnivariateRegressionFitness">UnivariateRegressionFitness</abbr>&gt;</code> |

Produces <code><abbr title="java.util.function.Supplier">Supplier</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.problem.regression.NumericalDataset">NumericalDataset</abbr>&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.NumericalDatasets.fromProblem()` by jgea-experimenter:2.5.2-SNAPSHOT:2024-02-26T23:37:48Z

## Package `ea.problem.multivariateRegression`

Aliases: `ea.p.mr`, `ea.p.multivariateRegression`, `ea.problem.mr`, `ea.problem.multivariateRegression`

### Builder `ea.problem.multivariateRegression.fromData()`

`ea.p.mr.fromData(trainingDataset; testDataset; metric)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `trainingDataset` | npm |  | <code><abbr title="java.util.function.Supplier">Supplier</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.problem.regression.NumericalDataset">NumericalDataset</abbr>&gt;</code> |
| `testDataset` | npm | `ea.d.num.empty()` | <code><abbr title="java.util.function.Supplier">Supplier</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.problem.regression.NumericalDataset">NumericalDataset</abbr>&gt;</code> |
| `metric` | e | `MSE` | <code><abbr title="io.github.ericmedvet.jgea.problem.regression.univariate.UnivariateRegressionFitness$Metric">UnivariateRegressionFitness$Metric</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.problem.regression.multivariate.MultivariateRegressionProblem">MultivariateRegressionProblem</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.problem.regression.multivariate.MultivariateRegressionFitness">MultivariateRegressionFitness</abbr>&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.MultivariateRegressionProblems.fromData()` by jgea-experimenter:2.5.2-SNAPSHOT:2024-02-26T23:37:48Z

## Package `ea.problem.synthetic`

Aliases: `ea.p.s`, `ea.p.synthetic`, `ea.problem.s`, `ea.problem.synthetic`

### Builder `ea.problem.synthetic.ackley()`

`ea.p.s.ackley(name; p)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `name` | s | interpolate `ackley-{p}` | <code><abbr title="java.lang.String">String</abbr></code> |
| `p` | i | `100` | <code>int</code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.problem.synthetic.numerical.Ackley">Ackley</abbr></code>; built from `io.github.ericmedvet.jgea.experimenter.builders.SyntheticProblems.ackley()` by jgea-experimenter:2.5.2-SNAPSHOT:2024-02-26T23:37:48Z

### Builder `ea.problem.synthetic.bentCigar()`

`ea.p.s.bentCigar(name; p)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `name` | s | interpolate `bentCigar-{p}` | <code><abbr title="java.lang.String">String</abbr></code> |
| `p` | i | `100` | <code>int</code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.problem.synthetic.numerical.BentCigar">BentCigar</abbr></code>; built from `io.github.ericmedvet.jgea.experimenter.builders.SyntheticProblems.bentCigar()` by jgea-experimenter:2.5.2-SNAPSHOT:2024-02-26T23:37:48Z

### Builder `ea.problem.synthetic.charShapeApproximation()`

`ea.p.s.charShapeApproximation(name; target; translation; smoothed; weighted)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `name` | s | `shape-{target}` | <code><abbr title="java.lang.String">String</abbr></code> |
| `target` | s |  | <code><abbr title="java.lang.String">String</abbr></code> |
| `translation` | b | `true` | <code>boolean</code> |
| `smoothed` | b | `true` | <code>boolean</code> |
| `weighted` | b | `true` | <code>boolean</code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.problem.grid.CharShapeApproximation">CharShapeApproximation</abbr></code>; built from `io.github.ericmedvet.jgea.experimenter.builders.SyntheticProblems.charShapeApproximation()` by jgea-experimenter:2.5.2-SNAPSHOT:2024-02-26T23:37:48Z

### Builder `ea.problem.synthetic.circularPointsAiming()`

`ea.p.s.circularPointsAiming(name; p; n; radius; center; seed)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `name` | s | interpolate `circularPointsAiming-{p}-{n}` | <code><abbr title="java.lang.String">String</abbr></code> |
| `p` | i | `100` | <code>int</code> |
| `n` | i | `5` | <code>int</code> |
| `radius` | d | `0.5` | <code>double</code> |
| `center` | d | `1.0` | <code>double</code> |
| `seed` | i | `1` | <code>int</code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.problem.synthetic.numerical.CircularPointsAiming">CircularPointsAiming</abbr></code>; built from `io.github.ericmedvet.jgea.experimenter.builders.SyntheticProblems.circularPointsAiming()` by jgea-experimenter:2.5.2-SNAPSHOT:2024-02-26T23:37:48Z

### Builder `ea.problem.synthetic.discus()`

`ea.p.s.discus(name; p)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `name` | s | interpolate `discus-{p}` | <code><abbr title="java.lang.String">String</abbr></code> |
| `p` | i | `100` | <code>int</code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.problem.synthetic.numerical.Discus">Discus</abbr></code>; built from `io.github.ericmedvet.jgea.experimenter.builders.SyntheticProblems.discus()` by jgea-experimenter:2.5.2-SNAPSHOT:2024-02-26T23:37:48Z

### Builder `ea.problem.synthetic.gaussianMixture2D()`

`ea.p.s.gaussianMixture2D(name; targets; c)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `name` | s | `gm2D` | <code><abbr title="java.lang.String">String</abbr></code> |
| `targets` | d[] | `[-3.0, -2.0, 2.0, 2.0, 2.0, 1.0]` | <code><abbr title="java.util.List">List</abbr>&lt;<abbr title="java.lang.Double">Double</abbr>&gt;</code> |
| `c` | d | `1.0` | <code>double</code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.problem.synthetic.numerical.GaussianMixture2D">GaussianMixture2D</abbr></code>; built from `io.github.ericmedvet.jgea.experimenter.builders.SyntheticProblems.gaussianMixture2D()` by jgea-experimenter:2.5.2-SNAPSHOT:2024-02-26T23:37:48Z

### Builder `ea.problem.synthetic.highConditionedElliptic()`

`ea.p.s.highConditionedElliptic(name; p)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `name` | s | interpolate `highConditionedElliptic-{p}` | <code><abbr title="java.lang.String">String</abbr></code> |
| `p` | i | `100` | <code>int</code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.problem.synthetic.numerical.HighConditionedElliptic">HighConditionedElliptic</abbr></code>; built from `io.github.ericmedvet.jgea.experimenter.builders.SyntheticProblems.highConditionedElliptic()` by jgea-experimenter:2.5.2-SNAPSHOT:2024-02-26T23:37:48Z

### Builder `ea.problem.synthetic.intOneMax()`

`ea.p.s.intOneMax(name; p; upperBound)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `name` | s | interpolate `iOneMax-{p}` | <code><abbr title="java.lang.String">String</abbr></code> |
| `p` | i | `100` | <code>int</code> |
| `upperBound` | i | `100` | <code>int</code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.problem.synthetic.IntOneMax">IntOneMax</abbr></code>; built from `io.github.ericmedvet.jgea.experimenter.builders.SyntheticProblems.intOneMax()` by jgea-experimenter:2.5.2-SNAPSHOT:2024-02-26T23:37:48Z

### Builder `ea.problem.synthetic.linearPoints()`

`ea.p.s.linearPoints(name; p)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `name` | s | interpolate `lPoints-{p}` | <code><abbr title="java.lang.String">String</abbr></code> |
| `p` | i | `100` | <code>int</code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.problem.synthetic.numerical.LinearPoints">LinearPoints</abbr></code>; built from `io.github.ericmedvet.jgea.experimenter.builders.SyntheticProblems.linearPoints()` by jgea-experimenter:2.5.2-SNAPSHOT:2024-02-26T23:37:48Z

### Builder `ea.problem.synthetic.multiModalIntOneMax()`

`ea.p.s.multiModalIntOneMax(name; p; upperBound; nOfTargets)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `name` | s | interpolate `mmIOneMax-{p}-{nOfTargets}` | <code><abbr title="java.lang.String">String</abbr></code> |
| `p` | i | `100` | <code>int</code> |
| `upperBound` | i | `10` | <code>int</code> |
| `nOfTargets` | i | `3` | <code>int</code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.problem.synthetic.MultiModalIntOneMax">MultiModalIntOneMax</abbr></code>; built from `io.github.ericmedvet.jgea.experimenter.builders.SyntheticProblems.multiModalIntOneMax()` by jgea-experimenter:2.5.2-SNAPSHOT:2024-02-26T23:37:48Z

### Builder `ea.problem.synthetic.multiObjectiveIntOneMax()`

`ea.p.s.multiObjectiveIntOneMax(name; p; upperBound)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `name` | s | interpolate `moIOneMax-{p}` | <code><abbr title="java.lang.String">String</abbr></code> |
| `p` | i | `100` | <code>int</code> |
| `upperBound` | i | `3` | <code>int</code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.problem.synthetic.MultiObjectiveIntOneMax">MultiObjectiveIntOneMax</abbr></code>; built from `io.github.ericmedvet.jgea.experimenter.builders.SyntheticProblems.multiObjectiveIntOneMax()` by jgea-experimenter:2.5.2-SNAPSHOT:2024-02-26T23:37:48Z

### Builder `ea.problem.synthetic.oneMax()`

`ea.p.s.oneMax(name; p)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `name` | s | interpolate `oneMax-{p}` | <code><abbr title="java.lang.String">String</abbr></code> |
| `p` | i | `100` | <code>int</code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.problem.synthetic.OneMax">OneMax</abbr></code>; built from `io.github.ericmedvet.jgea.experimenter.builders.SyntheticProblems.oneMax()` by jgea-experimenter:2.5.2-SNAPSHOT:2024-02-26T23:37:48Z

### Builder `ea.problem.synthetic.pointAiming()`

`ea.p.s.pointAiming(name; p; target)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `name` | s | interpolate `pointAiming-{p}` | <code><abbr title="java.lang.String">String</abbr></code> |
| `p` | i | `100` | <code>int</code> |
| `target` | d | `1.0` | <code>double</code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.problem.synthetic.numerical.PointsAiming">PointsAiming</abbr></code>; built from `io.github.ericmedvet.jgea.experimenter.builders.SyntheticProblems.pointAiming()` by jgea-experimenter:2.5.2-SNAPSHOT:2024-02-26T23:37:48Z

### Builder `ea.problem.synthetic.rastrigin()`

`ea.p.s.rastrigin(name; p)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `name` | s | interpolate `rastrigin-{p}` | <code><abbr title="java.lang.String">String</abbr></code> |
| `p` | i | `100` | <code>int</code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.problem.synthetic.numerical.Rastrigin">Rastrigin</abbr></code>; built from `io.github.ericmedvet.jgea.experimenter.builders.SyntheticProblems.rastrigin()` by jgea-experimenter:2.5.2-SNAPSHOT:2024-02-26T23:37:48Z

### Builder `ea.problem.synthetic.rosenbrock()`

`ea.p.s.rosenbrock(name; p)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `name` | s | interpolate `rosenbrock-{p}` | <code><abbr title="java.lang.String">String</abbr></code> |
| `p` | i | `100` | <code>int</code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.problem.synthetic.numerical.Rosenbrock">Rosenbrock</abbr></code>; built from `io.github.ericmedvet.jgea.experimenter.builders.SyntheticProblems.rosenbrock()` by jgea-experimenter:2.5.2-SNAPSHOT:2024-02-26T23:37:48Z

### Builder `ea.problem.synthetic.sphere()`

`ea.p.s.sphere(name; p)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `name` | s | interpolate `sphere-{p}` | <code><abbr title="java.lang.String">String</abbr></code> |
| `p` | i | `100` | <code>int</code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.problem.synthetic.numerical.Sphere">Sphere</abbr></code>; built from `io.github.ericmedvet.jgea.experimenter.builders.SyntheticProblems.sphere()` by jgea-experimenter:2.5.2-SNAPSHOT:2024-02-26T23:37:48Z

## Package `ea.problem.univariateRegression`

Aliases: `ea.p.univariateRegression`, `ea.p.ur`, `ea.problem.univariateRegression`, `ea.problem.ur`

### Builder `ea.problem.univariateRegression.bundled()`

`ea.p.ur.bundled(name; metric; xScaling; yScaling)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `name` | s |  | <code><abbr title="java.lang.String">String</abbr></code> |
| `metric` | e | `MSE` | <code><abbr title="io.github.ericmedvet.jgea.problem.regression.univariate.UnivariateRegressionFitness$Metric">UnivariateRegressionFitness$Metric</abbr></code> |
| `xScaling` | e | `NONE` | <code><abbr title="io.github.ericmedvet.jgea.problem.regression.NumericalDataset$Scaling">NumericalDataset$Scaling</abbr></code> |
| `yScaling` | e | `NONE` | <code><abbr title="io.github.ericmedvet.jgea.problem.regression.NumericalDataset$Scaling">NumericalDataset$Scaling</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.problem.regression.univariate.UnivariateRegressionProblem">UnivariateRegressionProblem</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.problem.regression.univariate.UnivariateRegressionFitness">UnivariateRegressionFitness</abbr>&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.UnivariateRegressionProblems.bundled()` by jgea-experimenter:2.5.2-SNAPSHOT:2024-02-26T23:37:48Z

### Builder `ea.problem.univariateRegression.fromData()`

`ea.p.ur.fromData(name; trainingDataset; testDataset; metric; xScaling; yScaling)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `name` | s | `dataset` | <code><abbr title="java.lang.String">String</abbr></code> |
| `trainingDataset` | npm |  | <code><abbr title="java.util.function.Supplier">Supplier</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.problem.regression.NumericalDataset">NumericalDataset</abbr>&gt;</code> |
| `testDataset` | npm | `ea.d.num.empty()` | <code><abbr title="java.util.function.Supplier">Supplier</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.problem.regression.NumericalDataset">NumericalDataset</abbr>&gt;</code> |
| `metric` | e | `MSE` | <code><abbr title="io.github.ericmedvet.jgea.problem.regression.univariate.UnivariateRegressionFitness$Metric">UnivariateRegressionFitness$Metric</abbr></code> |
| `xScaling` | e | `NONE` | <code><abbr title="io.github.ericmedvet.jgea.problem.regression.NumericalDataset$Scaling">NumericalDataset$Scaling</abbr></code> |
| `yScaling` | e | `NONE` | <code><abbr title="io.github.ericmedvet.jgea.problem.regression.NumericalDataset$Scaling">NumericalDataset$Scaling</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.problem.regression.univariate.UnivariateRegressionProblem">UnivariateRegressionProblem</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.problem.regression.univariate.UnivariateRegressionFitness">UnivariateRegressionFitness</abbr>&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.UnivariateRegressionProblems.fromData()` by jgea-experimenter:2.5.2-SNAPSHOT:2024-02-26T23:37:48Z

### Builder `ea.problem.univariateRegression.synthetic()`

`ea.p.ur.synthetic(name; metric; seed)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `name` | s |  | <code><abbr title="java.lang.String">String</abbr></code> |
| `metric` | e | `MSE` | <code><abbr title="io.github.ericmedvet.jgea.problem.regression.univariate.UnivariateRegressionFitness$Metric">UnivariateRegressionFitness$Metric</abbr></code> |
| `seed` | i | `1` | <code>int</code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.problem.regression.univariate.synthetic.SyntheticUnivariateRegressionProblem">SyntheticUnivariateRegressionProblem</abbr></code>; built from `io.github.ericmedvet.jgea.experimenter.builders.UnivariateRegressionProblems.synthetic()` by jgea-experimenter:2.5.2-SNAPSHOT:2024-02-26T23:37:48Z

## Package `ea.randomGenerator`

Aliases: `ea.randomGenerator`, `ea.rg`

### Builder `ea.randomGenerator.defaultRG()`

`ea.rg.defaultRG(seed)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `seed` | i | `0` | <code>int</code> |

Produces <code><abbr title="java.util.random.RandomGenerator">RandomGenerator</abbr></code>; built from `io.github.ericmedvet.jgea.experimenter.builders.RandomGenerators.defaultRG()` by jgea-experimenter:2.5.2-SNAPSHOT:2024-02-26T23:37:48Z

## Package `ea.representation`

Aliases: `ea.r`, `ea.representation`

### Builder `ea.representation.bitString()`

`ea.r.bitString(crossoverP; pMutRate)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `crossoverP` | d | `0.8` | <code>double</code> |
| `pMutRate` | d | `1.0` | <code>double</code> |

Produces <code><abbr title="java.util.function.Function">Function</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.representation.sequence.bit.BitString">BitString</abbr>, <abbr title="io.github.ericmedvet.jgea.experimenter.Representation">Representation</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.representation.sequence.bit.BitString">BitString</abbr>&gt;&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.Representations.bitString()` by jgea-experimenter:2.5.2-SNAPSHOT:2024-02-26T23:37:48Z

### Builder `ea.representation.doubleString()`

`ea.r.doubleString(initialMinV; initialMaxV; crossoverP; sigmaMut)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `initialMinV` | d | `-1.0` | <code>double</code> |
| `initialMaxV` | d | `1.0` | <code>double</code> |
| `crossoverP` | d | `0.8` | <code>double</code> |
| `sigmaMut` | d | `0.35` | <code>double</code> |

Produces <code><abbr title="java.util.function.Function">Function</abbr>&lt;<abbr title="java.util.List">List</abbr>&lt;<abbr title="java.lang.Double">Double</abbr>&gt;, <abbr title="io.github.ericmedvet.jgea.experimenter.Representation">Representation</abbr>&lt;<abbr title="java.util.List">List</abbr>&lt;<abbr title="java.lang.Double">Double</abbr>&gt;&gt;&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.Representations.doubleString()` by jgea-experimenter:2.5.2-SNAPSHOT:2024-02-26T23:37:48Z

### Builder `ea.representation.intString()`

`ea.r.intString(crossoverP; pMutRate)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `crossoverP` | d | `0.8` | <code>double</code> |
| `pMutRate` | d | `1.0` | <code>double</code> |

Produces <code><abbr title="java.util.function.Function">Function</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.representation.sequence.integer.IntString">IntString</abbr>, <abbr title="io.github.ericmedvet.jgea.experimenter.Representation">Representation</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.representation.sequence.integer.IntString">IntString</abbr>&gt;&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.Representations.intString()` by jgea-experimenter:2.5.2-SNAPSHOT:2024-02-26T23:37:48Z

### Builder `ea.representation.multiSRTree()`

`ea.r.multiSRTree(constants; operators; minTreeH; maxTreeH; crossoverP)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `constants` | d[] | `[0.1, 1.0, 10.0]` | <code><abbr title="java.util.List">List</abbr>&lt;<abbr title="java.lang.Double">Double</abbr>&gt;</code> |
| `operators` | e[] | `[+, -, *, p/, plog]` | <code><abbr title="java.util.List">List</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.representation.tree.numeric.Element$Operator">Element$Operator</abbr>&gt;</code> |
| `minTreeH` | i | `4` | <code>int</code> |
| `maxTreeH` | i | `10` | <code>int</code> |
| `crossoverP` | d | `0.8` | <code>double</code> |

Produces <code><abbr title="java.util.function.Function">Function</abbr>&lt;<abbr title="java.util.List">List</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.representation.tree.Tree">Tree</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.representation.tree.numeric.Element">Element</abbr>&gt;&gt;, <abbr title="io.github.ericmedvet.jgea.experimenter.Representation">Representation</abbr>&lt;<abbr title="java.util.List">List</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.representation.tree.Tree">Tree</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.representation.tree.numeric.Element">Element</abbr>&gt;&gt;&gt;&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.Representations.multiSRTree()` by jgea-experimenter:2.5.2-SNAPSHOT:2024-02-26T23:37:48Z

### Builder `ea.representation.srTree()`

`ea.r.srTree(constants; operators; minTreeH; maxTreeH; crossoverP)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `constants` | d[] | `[0.1, 1.0, 10.0]` | <code><abbr title="java.util.List">List</abbr>&lt;<abbr title="java.lang.Double">Double</abbr>&gt;</code> |
| `operators` | e[] | `[+, -, *, p/, plog]` | <code><abbr title="java.util.List">List</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.representation.tree.numeric.Element$Operator">Element$Operator</abbr>&gt;</code> |
| `minTreeH` | i | `4` | <code>int</code> |
| `maxTreeH` | i | `10` | <code>int</code> |
| `crossoverP` | d | `0.8` | <code>double</code> |

Produces <code><abbr title="java.util.function.Function">Function</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.representation.tree.Tree">Tree</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.representation.tree.numeric.Element">Element</abbr>&gt;, <abbr title="io.github.ericmedvet.jgea.experimenter.Representation">Representation</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.representation.tree.Tree">Tree</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.representation.tree.numeric.Element">Element</abbr>&gt;&gt;&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.Representations.srTree()` by jgea-experimenter:2.5.2-SNAPSHOT:2024-02-26T23:37:48Z

## Package `ea.solver`

Aliases: `ea.s`, `ea.solver`

### Builder `ea.solver.cabea()`

`ea.s.cabea(name; representation; mapper; keepProbability; crossoverP; nTour; nEval; toroidal; mooreRadius; gridSize; substrate)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `name` | s | `cabea` | <code><abbr title="java.lang.String">String</abbr></code> |
| `representation` | npm |  | <code><abbr title="java.util.function.Function">Function</abbr>&lt;G, <abbr title="io.github.ericmedvet.jgea.experimenter.Representation">Representation</abbr>&lt;G&gt;&gt;</code> |
| `mapper` | npm | `ea.m.identity()` | <code><abbr title="io.github.ericmedvet.jgea.experimenter.InvertibleMapper">InvertibleMapper</abbr>&lt;G, S&gt;</code> |
| `keepProbability` | d | `0.0` | <code>double</code> |
| `crossoverP` | d | `0.8` | <code>double</code> |
| `nTour` | i | `1` | <code>int</code> |
| `nEval` | i | `1000` | <code>int</code> |
| `toroidal` | b | `true` | <code>boolean</code> |
| `mooreRadius` | i | `1` | <code>int</code> |
| `gridSize` | i | `11` | <code>int</code> |
| `substrate` | e | `EMPTY` | <code><abbr title="io.github.ericmedvet.jgea.core.solver.cabea.SubstrateFiller$Predefined">SubstrateFiller$Predefined</abbr></code> |

Produces <code><abbr title="java.util.function.Function">Function</abbr>&lt;S, <abbr title="io.github.ericmedvet.jgea.core.solver.cabea.CellularAutomataBasedSolver">CellularAutomataBasedSolver</abbr>&lt;G, S, Q&gt;&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.Solvers.cabea()` by jgea-experimenter:2.5.2-SNAPSHOT:2024-02-26T23:37:48Z

### Builder `ea.solver.cmaEs()`

`ea.s.cmaEs(name; mapper; initialMinV; initialMaxV; nEval)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `name` | s | `cmaEs` | <code><abbr title="java.lang.String">String</abbr></code> |
| `mapper` | npm | `ea.m.identity()` | <code><abbr title="io.github.ericmedvet.jgea.experimenter.InvertibleMapper">InvertibleMapper</abbr>&lt;<abbr title="java.util.List">List</abbr>&lt;<abbr title="java.lang.Double">Double</abbr>&gt;, S&gt;</code> |
| `initialMinV` | d | `-1.0` | <code>double</code> |
| `initialMaxV` | d | `1.0` | <code>double</code> |
| `nEval` | i | `1000` | <code>int</code> |

Produces <code><abbr title="java.util.function.Function">Function</abbr>&lt;S, <abbr title="io.github.ericmedvet.jgea.core.solver.CMAEvolutionaryStrategy">CMAEvolutionaryStrategy</abbr>&lt;S, Q&gt;&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.Solvers.cmaEs()` by jgea-experimenter:2.5.2-SNAPSHOT:2024-02-26T23:37:48Z

### Builder `ea.solver.differentialEvolution()`

`ea.s.differentialEvolution(name; mapper; initialMinV; initialMaxV; populationSize; nEval; differentialWeight; crossoverP; remap)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `name` | s | `de` | <code><abbr title="java.lang.String">String</abbr></code> |
| `mapper` | npm | `ea.m.identity()` | <code><abbr title="io.github.ericmedvet.jgea.experimenter.InvertibleMapper">InvertibleMapper</abbr>&lt;<abbr title="java.util.List">List</abbr>&lt;<abbr title="java.lang.Double">Double</abbr>&gt;, S&gt;</code> |
| `initialMinV` | d | `-1.0` | <code>double</code> |
| `initialMaxV` | d | `1.0` | <code>double</code> |
| `populationSize` | i | `15` | <code>int</code> |
| `nEval` | i | `1000` | <code>int</code> |
| `differentialWeight` | d | `0.5` | <code>double</code> |
| `crossoverP` | d | `0.8` | <code>double</code> |
| `remap` | b | `false` | <code>boolean</code> |

Produces <code><abbr title="java.util.function.Function">Function</abbr>&lt;S, <abbr title="io.github.ericmedvet.jgea.core.solver.DifferentialEvolution">DifferentialEvolution</abbr>&lt;S, Q&gt;&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.Solvers.differentialEvolution()` by jgea-experimenter:2.5.2-SNAPSHOT:2024-02-26T23:37:48Z

### Builder `ea.solver.ga()`

`ea.s.ga(name; representation; mapper; crossoverP; tournamentRate; minNTournament; nPop; nEval; maxUniquenessAttempts; remap)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `name` | s | `ga` | <code><abbr title="java.lang.String">String</abbr></code> |
| `representation` | npm |  | <code><abbr title="java.util.function.Function">Function</abbr>&lt;G, <abbr title="io.github.ericmedvet.jgea.experimenter.Representation">Representation</abbr>&lt;G&gt;&gt;</code> |
| `mapper` | npm | `ea.m.identity()` | <code><abbr title="io.github.ericmedvet.jgea.experimenter.InvertibleMapper">InvertibleMapper</abbr>&lt;G, S&gt;</code> |
| `crossoverP` | d | `0.8` | <code>double</code> |
| `tournamentRate` | d | `0.05` | <code>double</code> |
| `minNTournament` | i | `3` | <code>int</code> |
| `nPop` | i | `100` | <code>int</code> |
| `nEval` | i | `1000` | <code>int</code> |
| `maxUniquenessAttempts` | i | `100` | <code>int</code> |
| `remap` | b | `false` | <code>boolean</code> |

Produces <code><abbr title="java.util.function.Function">Function</abbr>&lt;S, <abbr title="io.github.ericmedvet.jgea.core.solver.StandardEvolver">StandardEvolver</abbr>&lt;G, S, Q&gt;&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.Solvers.ga()` by jgea-experimenter:2.5.2-SNAPSHOT:2024-02-26T23:37:48Z

### Builder `ea.solver.mapElites()`

`ea.s.mapElites(name; representation; mapper; nPop; nEval; descriptors)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `name` | s | `me` | <code><abbr title="java.lang.String">String</abbr></code> |
| `representation` | npm |  | <code><abbr title="java.util.function.Function">Function</abbr>&lt;G, <abbr title="io.github.ericmedvet.jgea.experimenter.Representation">Representation</abbr>&lt;G&gt;&gt;</code> |
| `mapper` | npm | `ea.m.identity()` | <code><abbr title="io.github.ericmedvet.jgea.experimenter.InvertibleMapper">InvertibleMapper</abbr>&lt;G, S&gt;</code> |
| `nPop` | i | `100` | <code>int</code> |
| `nEval` | i | `1000` | <code>int</code> |
| `descriptors` | npm[] | `[]` | <code><abbr title="java.util.List">List</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.solver.mapelites.MapElites$Descriptor">MapElites$Descriptor</abbr>&lt;G, S, Q&gt;&gt;</code> |

Produces <code><abbr title="java.util.function.Function">Function</abbr>&lt;S, <abbr title="io.github.ericmedvet.jgea.core.solver.mapelites.MapElites">MapElites</abbr>&lt;G, S, Q&gt;&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.Solvers.mapElites()` by jgea-experimenter:2.5.2-SNAPSHOT:2024-02-26T23:37:48Z

### Builder `ea.solver.nsga2()`

`ea.s.nsga2(name; representation; mapper; crossoverP; nPop; nEval; maxUniquenessAttempts; remap)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `name` | s | `nsga2` | <code><abbr title="java.lang.String">String</abbr></code> |
| `representation` | npm |  | <code><abbr title="java.util.function.Function">Function</abbr>&lt;G, <abbr title="io.github.ericmedvet.jgea.experimenter.Representation">Representation</abbr>&lt;G&gt;&gt;</code> |
| `mapper` | npm | `ea.m.identity()` | <code><abbr title="io.github.ericmedvet.jgea.experimenter.InvertibleMapper">InvertibleMapper</abbr>&lt;G, S&gt;</code> |
| `crossoverP` | d | `0.8` | <code>double</code> |
| `nPop` | i | `100` | <code>int</code> |
| `nEval` | i | `1000` | <code>int</code> |
| `maxUniquenessAttempts` | i | `100` | <code>int</code> |
| `remap` | b | `false` | <code>boolean</code> |

Produces <code><abbr title="java.util.function.Function">Function</abbr>&lt;S, <abbr title="io.github.ericmedvet.jgea.core.solver.NsgaII">NsgaII</abbr>&lt;G, S&gt;&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.Solvers.nsga2()` by jgea-experimenter:2.5.2-SNAPSHOT:2024-02-26T23:37:48Z

### Builder `ea.solver.oGraphea()`

`ea.s.oGraphea(name; mapper; minConst; maxConst; nConst; operators; nPop; nEval; arcAdditionRate; arcRemovalRate; nodeAdditionRate; nPop; rankBase; remap)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `name` | s | `oGraphea` | <code><abbr title="java.lang.String">String</abbr></code> |
| `mapper` | npm | `ea.m.identity()` | <code><abbr title="io.github.ericmedvet.jgea.experimenter.InvertibleMapper">InvertibleMapper</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.representation.graph.Graph">Graph</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.representation.graph.Node">Node</abbr>, <abbr title="io.github.ericmedvet.jgea.core.representation.graph.numeric.operatorgraph.OperatorGraph$NonValuedArc">OperatorGraph$NonValuedArc</abbr>&gt;, S&gt;</code> |
| `minConst` | d | `0.0` | <code>double</code> |
| `maxConst` | d | `5.0` | <code>double</code> |
| `nConst` | i | `10` | <code>int</code> |
| `operators` | e[] | `[+, -, *, p/, plog]` | <code><abbr title="java.util.List">List</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.representation.graph.numeric.operatorgraph.BaseOperator">BaseOperator</abbr>&gt;</code> |
| `nPop` | i | `100` | <code>int</code> |
| `nEval` | i | `1000` | <code>int</code> |
| `arcAdditionRate` | d | `3.0` | <code>double</code> |
| `arcRemovalRate` | d | `0.1` | <code>double</code> |
| `nodeAdditionRate` | d | `1.0` | <code>double</code> |
| `nPop` | i | `5` | <code>int</code> |
| `rankBase` | d | `0.75` | <code>double</code> |
| `remap` | b | `false` | <code>boolean</code> |

Produces <code><abbr title="java.util.function.Function">Function</abbr>&lt;S, <abbr title="io.github.ericmedvet.jgea.core.solver.speciation.SpeciatedEvolver">SpeciatedEvolver</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.representation.graph.Graph">Graph</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.representation.graph.Node">Node</abbr>, <abbr title="io.github.ericmedvet.jgea.core.representation.graph.numeric.operatorgraph.OperatorGraph$NonValuedArc">OperatorGraph$NonValuedArc</abbr>&gt;, S, Q&gt;&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.Solvers.oGraphea()` by jgea-experimenter:2.5.2-SNAPSHOT:2024-02-26T23:37:48Z

### Builder `ea.solver.openAiEs()`

`ea.s.openAiEs(name; mapper; initialMinV; initialMaxV; sigma; batchSize; nEval)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `name` | s | `openAiEs` | <code><abbr title="java.lang.String">String</abbr></code> |
| `mapper` | npm | `ea.m.identity()` | <code><abbr title="io.github.ericmedvet.jgea.experimenter.InvertibleMapper">InvertibleMapper</abbr>&lt;<abbr title="java.util.List">List</abbr>&lt;<abbr title="java.lang.Double">Double</abbr>&gt;, S&gt;</code> |
| `initialMinV` | d | `-1.0` | <code>double</code> |
| `initialMaxV` | d | `1.0` | <code>double</code> |
| `sigma` | d | `0.02` | <code>double</code> |
| `batchSize` | i | `30` | <code>int</code> |
| `nEval` | i | `1000` | <code>int</code> |

Produces <code><abbr title="java.util.function.Function">Function</abbr>&lt;S, <abbr title="io.github.ericmedvet.jgea.core.solver.OpenAIEvolutionaryStrategy">OpenAIEvolutionaryStrategy</abbr>&lt;S, Q&gt;&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.Solvers.openAiEs()` by jgea-experimenter:2.5.2-SNAPSHOT:2024-02-26T23:37:48Z

### Builder `ea.solver.pso()`

`ea.s.pso(name; mapper; initialMinV; initialMaxV; nEval; nPop; w; phiParticle; phiGlobal)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `name` | s | `pso` | <code><abbr title="java.lang.String">String</abbr></code> |
| `mapper` | npm | `ea.m.identity()` | <code><abbr title="io.github.ericmedvet.jgea.experimenter.InvertibleMapper">InvertibleMapper</abbr>&lt;<abbr title="java.util.List">List</abbr>&lt;<abbr title="java.lang.Double">Double</abbr>&gt;, S&gt;</code> |
| `initialMinV` | d | `-1.0` | <code>double</code> |
| `initialMaxV` | d | `1.0` | <code>double</code> |
| `nEval` | i | `1000` | <code>int</code> |
| `nPop` | i | `100` | <code>int</code> |
| `w` | d | `0.8` | <code>double</code> |
| `phiParticle` | d | `1.5` | <code>double</code> |
| `phiGlobal` | d | `1.5` | <code>double</code> |

Produces <code><abbr title="java.util.function.Function">Function</abbr>&lt;S, <abbr title="io.github.ericmedvet.jgea.core.solver.ParticleSwarmOptimization">ParticleSwarmOptimization</abbr>&lt;S, Q&gt;&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.Solvers.pso()` by jgea-experimenter:2.5.2-SNAPSHOT:2024-02-26T23:37:48Z

### Builder `ea.solver.randomSearch()`

`ea.s.randomSearch(name; representation; mapper; nEval)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `name` | s | `rs` | <code><abbr title="java.lang.String">String</abbr></code> |
| `representation` | npm |  | <code><abbr title="java.util.function.Function">Function</abbr>&lt;G, <abbr title="io.github.ericmedvet.jgea.experimenter.Representation">Representation</abbr>&lt;G&gt;&gt;</code> |
| `mapper` | npm | `ea.m.identity()` | <code><abbr title="io.github.ericmedvet.jgea.experimenter.InvertibleMapper">InvertibleMapper</abbr>&lt;G, S&gt;</code> |
| `nEval` | i | `1000` | <code>int</code> |

Produces <code><abbr title="java.util.function.Function">Function</abbr>&lt;S, <abbr title="io.github.ericmedvet.jgea.core.solver.RandomSearch">RandomSearch</abbr>&lt;G, S, Q&gt;&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.Solvers.randomSearch()` by jgea-experimenter:2.5.2-SNAPSHOT:2024-02-26T23:37:48Z

### Builder `ea.solver.randomWalk()`

`ea.s.randomWalk(name; representation; mapper; nEval)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `name` | s | `rw` | <code><abbr title="java.lang.String">String</abbr></code> |
| `representation` | npm |  | <code><abbr title="java.util.function.Function">Function</abbr>&lt;G, <abbr title="io.github.ericmedvet.jgea.experimenter.Representation">Representation</abbr>&lt;G&gt;&gt;</code> |
| `mapper` | npm | `ea.m.identity()` | <code><abbr title="io.github.ericmedvet.jgea.experimenter.InvertibleMapper">InvertibleMapper</abbr>&lt;G, S&gt;</code> |
| `nEval` | i | `1000` | <code>int</code> |

Produces <code><abbr title="java.util.function.Function">Function</abbr>&lt;S, <abbr title="io.github.ericmedvet.jgea.core.solver.RandomWalk">RandomWalk</abbr>&lt;G, S, Q&gt;&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.Solvers.randomWalk()` by jgea-experimenter:2.5.2-SNAPSHOT:2024-02-26T23:37:48Z

### Builder `ea.solver.simpleEs()`

`ea.s.simpleEs(name; mapper; initialMinV; initialMaxV; sigma; parentsRate; nOfElites; nPop; nEval; remap)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `name` | s | `es` | <code><abbr title="java.lang.String">String</abbr></code> |
| `mapper` | npm | `ea.m.identity()` | <code><abbr title="io.github.ericmedvet.jgea.experimenter.InvertibleMapper">InvertibleMapper</abbr>&lt;<abbr title="java.util.List">List</abbr>&lt;<abbr title="java.lang.Double">Double</abbr>&gt;, S&gt;</code> |
| `initialMinV` | d | `-1.0` | <code>double</code> |
| `initialMaxV` | d | `1.0` | <code>double</code> |
| `sigma` | d | `0.35` | <code>double</code> |
| `parentsRate` | d | `0.33` | <code>double</code> |
| `nOfElites` | i | `1` | <code>int</code> |
| `nPop` | i | `30` | <code>int</code> |
| `nEval` | i | `1000` | <code>int</code> |
| `remap` | b | `false` | <code>boolean</code> |

Produces <code><abbr title="java.util.function.Function">Function</abbr>&lt;S, <abbr title="io.github.ericmedvet.jgea.core.solver.SimpleEvolutionaryStrategy">SimpleEvolutionaryStrategy</abbr>&lt;S, Q&gt;&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.Solvers.simpleEs()` by jgea-experimenter:2.5.2-SNAPSHOT:2024-02-26T23:37:48Z

## Package `ea.solver.mapelites.descriptor`

Aliases: `ea.s.mapelites.d`, `ea.s.mapelites.descriptor`, `ea.s.me.d`, `ea.s.me.descriptor`, `ea.solver.mapelites.d`, `ea.solver.mapelites.descriptor`, `ea.solver.me.d`, `ea.solver.me.descriptor`

### Builder `ea.solver.mapelites.descriptor.ofFitness()`

`ea.s.me.d.ofFitness(f; min; max; nOfBins)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `f` | npm |  | <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;Q, <abbr title="java.lang.Double">Double</abbr>&gt;</code> |
| `min` | d | `0.0` | <code>double</code> |
| `max` | d | `1.0` | <code>double</code> |
| `nOfBins` | i | `20` | <code>int</code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.core.solver.mapelites.MapElites$Descriptor">MapElites$Descriptor</abbr>&lt;G, S, Q&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.MapElitesDescriptors.ofFitness()` by jgea-experimenter:2.5.2-SNAPSHOT:2024-02-26T23:37:48Z

### Builder `ea.solver.mapelites.descriptor.ofGenotype()`

`ea.s.me.d.ofGenotype(f; min; max; nOfBins)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `f` | npm |  | <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;G, <abbr title="java.lang.Double">Double</abbr>&gt;</code> |
| `min` | d | `0.0` | <code>double</code> |
| `max` | d | `1.0` | <code>double</code> |
| `nOfBins` | i | `20` | <code>int</code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.core.solver.mapelites.MapElites$Descriptor">MapElites$Descriptor</abbr>&lt;G, S, Q&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.MapElitesDescriptors.ofGenotype()` by jgea-experimenter:2.5.2-SNAPSHOT:2024-02-26T23:37:48Z

### Builder `ea.solver.mapelites.descriptor.ofSolution()`

`ea.s.me.d.ofSolution(f; min; max; nOfBins)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `f` | npm |  | <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;S, <abbr title="java.lang.Double">Double</abbr>&gt;</code> |
| `min` | d | `0.0` | <code>double</code> |
| `max` | d | `1.0` | <code>double</code> |
| `nOfBins` | i | `20` | <code>int</code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.core.solver.mapelites.MapElites$Descriptor">MapElites$Descriptor</abbr>&lt;G, S, Q&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.MapElitesDescriptors.ofSolution()` by jgea-experimenter:2.5.2-SNAPSHOT:2024-02-26T23:37:48Z

## Package `evorobots`

Aliases: `er`, `evorobots`

### Builder `evorobots.doublesRandomizer()`

`er.doublesRandomizer(randomGenerator; range)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `randomGenerator` | npm | `sim.defaultRG()` | <code><abbr title="java.util.random.RandomGenerator">RandomGenerator</abbr></code> |
| `range` | npm | `sim.range(min = -1; max = 1)` | <code><abbr title="io.github.ericmedvet.jnb.datastructure.DoubleRange">DoubleRange</abbr></code> |

Produces <code><abbr title="java.util.function.Function">Function</abbr>&lt;<abbr title="java.util.List">List</abbr>&lt;<abbr title="java.lang.Double">Double</abbr>&gt;, <abbr title="java.util.List">List</abbr>&lt;<abbr title="java.lang.Double">Double</abbr>&gt;&gt;</code>; built from `io.github.ericmedvet.robotevo2d.main.builders.Misc.doublesRandomizer()` by robotevo2d-main:1.3.5-SNAPSHOT:2024-02-27T07:08:02Z

### Builder `evorobots.fromBase64()`

`er.fromBase64(s)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `s` | s |  | <code><abbr title="java.lang.String">String</abbr></code> |

Produces <code><abbr title="java.util.function.Function">Function</abbr>&lt;<abbr title="java.lang.Object">Object</abbr>, <abbr title="java.lang.Object">Object</abbr>&gt;</code>; built from `io.github.ericmedvet.robotevo2d.main.builders.Misc.fromBase64()` by robotevo2d-main:1.3.5-SNAPSHOT:2024-02-27T07:08:02Z

### Builder `evorobots.fromRunOutcome()`

`er.fromRunOutcome(filePath; index)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `filePath` | s |  | <code><abbr title="java.lang.String">String</abbr></code> |
| `index` | i | `0` | <code>int</code> |

Produces <code><abbr title="java.util.function.Function">Function</abbr>&lt;<abbr title="java.lang.Object">Object</abbr>, <abbr title="java.lang.Object">Object</abbr>&gt;</code>; built from `io.github.ericmedvet.robotevo2d.main.builders.Misc.fromRunOutcome()` by robotevo2d-main:1.3.5-SNAPSHOT:2024-02-27T07:08:02Z

### Builder `evorobots.play()`

`er.play(name; genotype; mapper; task; engine; consumers; outcomeFunctions)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `name` | s | `` | <code><abbr title="java.lang.String">String</abbr></code> |
| `genotype` | npm | `ea.f.identity()` | <code><abbr title="java.util.function.Function">Function</abbr>&lt;G, G&gt;</code> |
| `mapper` | npm |  | <code><abbr title="io.github.ericmedvet.jgea.experimenter.InvertibleMapper">InvertibleMapper</abbr>&lt;G, S&gt;</code> |
| `task` | npm |  | <code><abbr title="io.github.ericmedvet.mrsim2d.core.tasks.Task">Task</abbr>&lt;S, O&gt;</code> |
| `engine` | npm | `sim.engine()` | <code><abbr title="java.util.function.Supplier">Supplier</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.engine.Engine">Engine</abbr>&gt;</code> |
| `consumers` | npm[] | `[]` | <code><abbr title="java.util.List">List</abbr>&lt;<abbr title="io.github.ericmedvet.robotevo2d.main.builders.PlayConsumers$ProducingConsumer">PlayConsumers$ProducingConsumer</abbr>&gt;</code> |
| `outcomeFunctions` | npm[] | `[]` | <code><abbr title="java.util.List">List</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;?, ?&gt;&gt;</code> |

Produces <code><abbr title="io.github.ericmedvet.robotevo2d.main.Play">Play</abbr></code>; built from `io.github.ericmedvet.robotevo2d.main.Play()` by robotevo2d-main:1.3.5-SNAPSHOT:2024-02-27T07:08:02Z

### Builder `evorobots.video()`

`er.video(filePathTemplate; titleTemplate; w; h; frameRate; startTime; endTime; codec; drawer; task; engine; individual)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `filePathTemplate` | s | `video-{index:%04d}.mp4` | <code><abbr title="java.lang.String">String</abbr></code> |
| `titleTemplate` | s | `run.index={index:%04d}` | <code><abbr title="java.lang.String">String</abbr></code> |
| `w` | i | `600` | <code>int</code> |
| `h` | i | `400` | <code>int</code> |
| `frameRate` | d | `30.0` | <code>double</code> |
| `startTime` | d | `0.0` | <code>double</code> |
| `endTime` | d | `30.0` | <code>double</code> |
| `codec` | e | `JCODEC` | <code><abbr title="io.github.ericmedvet.mrsim2d.viewer.VideoUtils$EncoderFacility">VideoUtils$EncoderFacility</abbr></code> |
| `drawer` | npm | `sim.drawer()` | <code><abbr title="java.util.function.Function">Function</abbr>&lt;<abbr title="java.lang.String">String</abbr>, <abbr title="io.github.ericmedvet.mrsim2d.viewer.Drawer">Drawer</abbr>&gt;</code> |
| `task` | npm |  | <code><abbr title="io.github.ericmedvet.mrsim2d.core.tasks.Task">Task</abbr>&lt;A, ?&gt;</code> |
| `engine` | npm | `sim.engine()` | <code><abbr title="java.util.function.Supplier">Supplier</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.engine.Engine">Engine</abbr>&gt;</code> |
| `individual` | npm | `ea.nf.best()` | <code><abbr title="java.util.function.Function">Function</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.solver.POCPopulationState">POCPopulationState</abbr>&lt;?, ?, A, ?, ?&gt;, <abbr title="io.github.ericmedvet.jgea.core.solver.Individual">Individual</abbr>&lt;?, A, ?&gt;&gt;</code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.core.listener.AccumulatorFactory">AccumulatorFactory</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.solver.POCPopulationState">POCPopulationState</abbr>&lt;?, ?, A, ?, ?&gt;, <abbr title="java.io.File">File</abbr>, <abbr title="io.github.ericmedvet.jgea.experimenter.Run">Run</abbr>&lt;?, ?, A, ?&gt;&gt;</code>; built from `io.github.ericmedvet.robotevo2d.main.builders.Misc.video()` by robotevo2d-main:1.3.5-SNAPSHOT:2024-02-27T07:08:02Z

## Package `evorobots.consumer`

Aliases: `er.c`, `er.consumer`, `evorobots.c`, `evorobots.consumer`

### Builder `evorobots.consumer.frames()`

`er.c.frames(title; drawer; w; h; nOfFrames; deltaT; startTime; filePath)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `title` | s |  | <code><abbr title="java.lang.String">String</abbr></code> |
| `drawer` | npm | `sim.drawer()` | <code><abbr title="java.util.function.Function">Function</abbr>&lt;<abbr title="java.lang.String">String</abbr>, <abbr title="io.github.ericmedvet.mrsim2d.viewer.Drawer">Drawer</abbr>&gt;</code> |
| `w` | i | `600` | <code>int</code> |
| `h` | i | `400` | <code>int</code> |
| `nOfFrames` | i | `5` | <code>int</code> |
| `deltaT` | d | `0.2` | <code>double</code> |
| `startTime` | d | `0.0` | <code>double</code> |
| `filePath` | s |  | <code><abbr title="java.lang.String">String</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.robotevo2d.main.builders.PlayConsumers$ProducingConsumer">PlayConsumers$ProducingConsumer</abbr></code>; built from `io.github.ericmedvet.robotevo2d.main.builders.PlayConsumers.frames()` by robotevo2d-main:1.3.5-SNAPSHOT:2024-02-27T07:08:02Z

### Builder `evorobots.consumer.rtGUI()`

`er.c.rtGUI(title; drawer; frameRate)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `title` | s |  | <code><abbr title="java.lang.String">String</abbr></code> |
| `drawer` | npm | `sim.drawer()` | <code><abbr title="java.util.function.Function">Function</abbr>&lt;<abbr title="java.lang.String">String</abbr>, <abbr title="io.github.ericmedvet.mrsim2d.viewer.Drawer">Drawer</abbr>&gt;</code> |
| `frameRate` | d | `30.0` | <code>double</code> |

Produces <code><abbr title="io.github.ericmedvet.robotevo2d.main.builders.PlayConsumers$ProducingConsumer">PlayConsumers$ProducingConsumer</abbr></code>; built from `io.github.ericmedvet.robotevo2d.main.builders.PlayConsumers.rtGUI()` by robotevo2d-main:1.3.5-SNAPSHOT:2024-02-27T07:08:02Z

### Builder `evorobots.consumer.video()`

`er.c.video(title; drawer; w; h; frameRate; startTime; endTime; codec; filePath)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `title` | s | `` | <code><abbr title="java.lang.String">String</abbr></code> |
| `drawer` | npm | `sim.drawer()` | <code><abbr title="java.util.function.Function">Function</abbr>&lt;<abbr title="java.lang.String">String</abbr>, <abbr title="io.github.ericmedvet.mrsim2d.viewer.Drawer">Drawer</abbr>&gt;</code> |
| `w` | i | `600` | <code>int</code> |
| `h` | i | `400` | <code>int</code> |
| `frameRate` | d | `30.0` | <code>double</code> |
| `startTime` | d | `0.0` | <code>double</code> |
| `endTime` | d | `30.0` | <code>double</code> |
| `codec` | e | `JCODEC` | <code><abbr title="io.github.ericmedvet.mrsim2d.viewer.VideoUtils$EncoderFacility">VideoUtils$EncoderFacility</abbr></code> |
| `filePath` | s |  | <code><abbr title="java.lang.String">String</abbr></code> |

Produces <code><abbr title="java.util.function.Consumer">Consumer</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.Snapshot">Snapshot</abbr>&gt;</code>; built from `io.github.ericmedvet.robotevo2d.main.builders.PlayConsumers.video()` by robotevo2d-main:1.3.5-SNAPSHOT:2024-02-27T07:08:02Z

## Package `evorobots.dynamicalSystem.numerical`

Aliases: `er.ds.num`, `er.ds.numerical`, `er.dynSys.num`, `er.dynSys.numerical`, `er.dynamicalSystem.num`, `er.dynamicalSystem.numerical`, `evorobots.ds.num`, `evorobots.ds.numerical`, `evorobots.dynSys.num`, `evorobots.dynSys.numerical`, `evorobots.dynamicalSystem.num`, `evorobots.dynamicalSystem.numerical`

### Builder `evorobots.dynamicalSystem.numerical.ioSaver()`

`er.ds.num.ioSaver(initT; finalT; inner; filePath)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `initT` | d | `0.0` | <code>double</code> |
| `finalT` | d | `30.0` | <code>double</code> |
| `inner` | npm |  | <code><abbr title="io.github.ericmedvet.jsdynsym.buildable.builders.NumericalDynamicalSystems$Builder">NumericalDynamicalSystems$Builder</abbr>&lt;? extends <abbr title="io.github.ericmedvet.jsdynsym.core.numerical.NumericalDynamicalSystem">NumericalDynamicalSystem</abbr>&lt;S&gt;, S&gt;</code> |
| `filePath` | s |  | <code><abbr title="java.lang.String">String</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.jsdynsym.buildable.builders.NumericalDynamicalSystems$Builder">NumericalDynamicalSystems$Builder</abbr>&lt;<abbr title="io.github.ericmedvet.robotevo2d.main.dynamicalsystems.IOSaver">IOSaver</abbr>&lt;S&gt;, S&gt;</code>; built from `io.github.ericmedvet.robotevo2d.main.builders.NumericalDynamicalSystems.ioSaver()` by robotevo2d-main:1.3.5-SNAPSHOT:2024-02-27T07:08:02Z

### Builder `evorobots.dynamicalSystem.numerical.oGraphMRF()`

`er.ds.num.oGraphMRF(postOperator)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `postOperator` | e | `IDENTITY` | <code><abbr title="io.github.ericmedvet.jsdynsym.core.numerical.ann.MultiLayerPerceptron$ActivationFunction">MultiLayerPerceptron$ActivationFunction</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.jsdynsym.buildable.builders.NumericalDynamicalSystems$Builder">NumericalDynamicalSystems$Builder</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.representation.NamedMultivariateRealFunction">NamedMultivariateRealFunction</abbr>, <abbr title="io.github.ericmedvet.jsdynsym.core.StatelessSystem$State">StatelessSystem$State</abbr>&gt;</code>; built from `io.github.ericmedvet.robotevo2d.main.builders.NumericalDynamicalSystems.oGraphMRF()` by robotevo2d-main:1.3.5-SNAPSHOT:2024-02-27T07:08:02Z

### Builder `evorobots.dynamicalSystem.numerical.treeMRF()`

`er.ds.num.treeMRF(postOperator)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `postOperator` | e | `IDENTITY` | <code><abbr title="io.github.ericmedvet.jsdynsym.core.numerical.ann.MultiLayerPerceptron$ActivationFunction">MultiLayerPerceptron$ActivationFunction</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.jsdynsym.buildable.builders.NumericalDynamicalSystems$Builder">NumericalDynamicalSystems$Builder</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.representation.NamedMultivariateRealFunction">NamedMultivariateRealFunction</abbr>, <abbr title="io.github.ericmedvet.jsdynsym.core.StatelessSystem$State">StatelessSystem$State</abbr>&gt;</code>; built from `io.github.ericmedvet.robotevo2d.main.builders.NumericalDynamicalSystems.treeMRF()` by robotevo2d-main:1.3.5-SNAPSHOT:2024-02-27T07:08:02Z

## Package `evorobots.listener`

Aliases: `er.l`, `er.listener`, `evorobots.l`, `evorobots.listener`

### Builder `evorobots.listener.videoSaver()`

`er.l.videoSaver(videos)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `videos` | npm[] | `[]` | <code><abbr title="java.util.List">List</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.listener.AccumulatorFactory">AccumulatorFactory</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.solver.POCPopulationState">POCPopulationState</abbr>&lt;?, ?, A, ?, ?&gt;, <abbr title="java.io.File">File</abbr>, <abbr title="io.github.ericmedvet.jgea.experimenter.Run">Run</abbr>&lt;?, ?, A, ?&gt;&gt;&gt;</code> |

Produces <code><abbr title="java.util.function.BiFunction">BiFunction</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.experimenter.Experiment">Experiment</abbr>, <abbr title="java.util.concurrent.ExecutorService">ExecutorService</abbr>, <abbr title="io.github.ericmedvet.jgea.core.listener.ListenerFactory">ListenerFactory</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.solver.POCPopulationState">POCPopulationState</abbr>&lt;?, ?, A, ?, ?&gt;, <abbr title="io.github.ericmedvet.jgea.experimenter.Run">Run</abbr>&lt;?, ?, A, ?&gt;&gt;&gt;</code>; built from `io.github.ericmedvet.robotevo2d.main.builders.Listeners.videoSaver()` by robotevo2d-main:1.3.5-SNAPSHOT:2024-02-27T07:08:02Z

## Package `evorobots.mapper`

Aliases: `er.m`, `er.mapper`, `evorobots.m`, `evorobots.mapper`

### Builder `evorobots.mapper.intStringReactiveGridVSR()`

`er.m.intStringReactiveGridVSR(w; h; availableVoxels)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `w` | i |  | <code>int</code> |
| `h` | i |  | <code>int</code> |
| `availableVoxels` | npm[] | `[]` | <code><abbr title="java.util.List">List</abbr>&lt;<abbr title="java.util.function.Supplier">Supplier</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.agents.gridvsr.ReactiveGridVSR$ReactiveVoxel">ReactiveGridVSR$ReactiveVoxel</abbr>&gt;&gt;</code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.experimenter.InvertibleMapper">InvertibleMapper</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.representation.sequence.integer.IntString">IntString</abbr>, <abbr title="java.util.function.Supplier">Supplier</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.agents.gridvsr.ReactiveGridVSR">ReactiveGridVSR</abbr>&gt;&gt;</code>; built from `io.github.ericmedvet.robotevo2d.main.builders.Mappers.intStringReactiveGridVSR()` by robotevo2d-main:1.3.5-SNAPSHOT:2024-02-27T07:08:02Z

### Builder `evorobots.mapper.nmrfReactiveGridVSR()`

`er.m.nmrfReactiveGridVSR(w; h; availableVoxels)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `w` | i |  | <code>int</code> |
| `h` | i |  | <code>int</code> |
| `availableVoxels` | npm[] | `[]` | <code><abbr title="java.util.List">List</abbr>&lt;<abbr title="java.util.function.Supplier">Supplier</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.agents.gridvsr.ReactiveGridVSR$ReactiveVoxel">ReactiveGridVSR$ReactiveVoxel</abbr>&gt;&gt;</code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.experimenter.InvertibleMapper">InvertibleMapper</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.representation.NamedMultivariateRealFunction">NamedMultivariateRealFunction</abbr>, <abbr title="java.util.function.Supplier">Supplier</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.agents.gridvsr.ReactiveGridVSR">ReactiveGridVSR</abbr>&gt;&gt;</code>; built from `io.github.ericmedvet.robotevo2d.main.builders.Mappers.nmrfReactiveGridVSR()` by robotevo2d-main:1.3.5-SNAPSHOT:2024-02-27T07:08:02Z

### Builder `evorobots.mapper.numericalParametrizedHeteroBrains()`

`er.m.numericalParametrizedHeteroBrains(target)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `target` | npm |  | <code>T</code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.experimenter.InvertibleMapper">InvertibleMapper</abbr>&lt;<abbr title="java.util.List">List</abbr>&lt;<abbr title="java.lang.Double">Double</abbr>&gt;, <abbr title="java.util.function.Supplier">Supplier</abbr>&lt;T&gt;&gt;</code>; built from `io.github.ericmedvet.robotevo2d.main.builders.Mappers.numericalParametrizedHeteroBrains()` by robotevo2d-main:1.3.5-SNAPSHOT:2024-02-27T07:08:02Z

### Builder `evorobots.mapper.numericalParametrizedHomoBrains()`

`er.m.numericalParametrizedHomoBrains(target)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `target` | npm |  | <code>T</code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.experimenter.InvertibleMapper">InvertibleMapper</abbr>&lt;<abbr title="java.util.List">List</abbr>&lt;<abbr title="java.lang.Double">Double</abbr>&gt;, <abbr title="java.util.function.Supplier">Supplier</abbr>&lt;T&gt;&gt;</code>; built from `io.github.ericmedvet.robotevo2d.main.builders.Mappers.numericalParametrizedHomoBrains()` by robotevo2d-main:1.3.5-SNAPSHOT:2024-02-27T07:08:02Z

### Builder `evorobots.mapper.oGraphParametrizedHomoBrains()`

`er.m.oGraphParametrizedHomoBrains(target)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `target` | npm |  | <code>T</code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.experimenter.InvertibleMapper">InvertibleMapper</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.representation.graph.Graph">Graph</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.representation.graph.Node">Node</abbr>, <abbr title="io.github.ericmedvet.jgea.core.representation.graph.numeric.operatorgraph.OperatorGraph$NonValuedArc">OperatorGraph$NonValuedArc</abbr>&gt;, <abbr title="java.util.function.Supplier">Supplier</abbr>&lt;T&gt;&gt;</code>; built from `io.github.ericmedvet.robotevo2d.main.builders.Mappers.oGraphParametrizedHomoBrains()` by robotevo2d-main:1.3.5-SNAPSHOT:2024-02-27T07:08:02Z

### Builder `evorobots.mapper.treeParametrizedHomoBrains()`

`er.m.treeParametrizedHomoBrains(target)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `target` | npm |  | <code>T</code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.experimenter.InvertibleMapper">InvertibleMapper</abbr>&lt;<abbr title="java.util.List">List</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.representation.tree.Tree">Tree</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.representation.tree.numeric.Element">Element</abbr>&gt;&gt;, <abbr title="java.util.function.Supplier">Supplier</abbr>&lt;T&gt;&gt;</code>; built from `io.github.ericmedvet.robotevo2d.main.builders.Mappers.treeParametrizedHomoBrains()` by robotevo2d-main:1.3.5-SNAPSHOT:2024-02-27T07:08:02Z

## Package `evorobots.namedFunction`

Aliases: `er.namedFunction`, `er.nf`, `evorobots.namedFunction`, `evorobots.nf`

### Builder `evorobots.namedFunction.compactness()`

`er.nf.compactness(f)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `f` | npm |  | <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;X, <abbr title="io.github.ericmedvet.jnb.datastructure.Grid">Grid</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.agents.gridvsr.GridBody$Element">GridBody$Element</abbr>&gt;&gt;</code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;X, <abbr title="java.lang.Double">Double</abbr>&gt;</code>; built from `io.github.ericmedvet.robotevo2d.main.builders.NamedFunctions.compactness()` by robotevo2d-main:1.3.5-SNAPSHOT:2024-02-27T07:08:02Z

### Builder `evorobots.namedFunction.count()`

`er.nf.count(f)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `f` | npm |  | <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;X, <abbr title="io.github.ericmedvet.jnb.datastructure.Grid">Grid</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.agents.gridvsr.GridBody$Element">GridBody$Element</abbr>&gt;&gt;</code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;X, <abbr title="java.lang.Integer">Integer</abbr>&gt;</code>; built from `io.github.ericmedvet.robotevo2d.main.builders.NamedFunctions.count()` by robotevo2d-main:1.3.5-SNAPSHOT:2024-02-27T07:08:02Z

### Builder `evorobots.namedFunction.elongation()`

`er.nf.elongation(f)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `f` | npm |  | <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;X, <abbr title="io.github.ericmedvet.jnb.datastructure.Grid">Grid</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.agents.gridvsr.GridBody$Element">GridBody$Element</abbr>&gt;&gt;</code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;X, <abbr title="java.lang.Double">Double</abbr>&gt;</code>; built from `io.github.ericmedvet.robotevo2d.main.builders.NamedFunctions.elongation()` by robotevo2d-main:1.3.5-SNAPSHOT:2024-02-27T07:08:02Z

### Builder `evorobots.namedFunction.f()`

`er.nf.f(inner; name; s)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `inner` | npm |  | <code><abbr title="java.util.function.Function">Function</abbr>&lt;T, R&gt;</code> |
| `name` | s |  | <code><abbr title="java.lang.String">String</abbr></code> |
| `s` | s | `%s` | <code><abbr title="java.lang.String">String</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;T, R&gt;</code>; built from `io.github.ericmedvet.robotevo2d.main.builders.NamedFunctions.f()` by robotevo2d-main:1.3.5-SNAPSHOT:2024-02-27T07:08:02Z

### Builder `evorobots.namedFunction.gridBody()`

`er.nf.gridBody(f)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `f` | npm |  | <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;X, <abbr title="java.util.function.Supplier">Supplier</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.agents.gridvsr.AbstractGridVSR">AbstractGridVSR</abbr>&gt;&gt;</code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;X, <abbr title="io.github.ericmedvet.jnb.datastructure.Grid">Grid</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.agents.gridvsr.GridBody$Element">GridBody$Element</abbr>&gt;&gt;</code>; built from `io.github.ericmedvet.robotevo2d.main.builders.NamedFunctions.gridBody()` by robotevo2d-main:1.3.5-SNAPSHOT:2024-02-27T07:08:02Z

### Builder `evorobots.namedFunction.h()`

`er.nf.h(f)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `f` | npm |  | <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;X, <abbr title="io.github.ericmedvet.jnb.datastructure.Grid">Grid</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.agents.gridvsr.GridBody$Element">GridBody$Element</abbr>&gt;&gt;</code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;X, <abbr title="java.lang.Integer">Integer</abbr>&gt;</code>; built from `io.github.ericmedvet.robotevo2d.main.builders.NamedFunctions.h()` by robotevo2d-main:1.3.5-SNAPSHOT:2024-02-27T07:08:02Z

### Builder `evorobots.namedFunction.stringBase64()`

`er.nf.stringBase64(f)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `f` | npm |  | <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;X, <abbr title="java.io.Serializable">Serializable</abbr>&gt;</code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;X, <abbr title="java.lang.String">String</abbr>&gt;</code>; built from `io.github.ericmedvet.robotevo2d.main.builders.NamedFunctions.stringBase64()` by robotevo2d-main:1.3.5-SNAPSHOT:2024-02-27T07:08:02Z

### Builder `evorobots.namedFunction.w()`

`er.nf.w(f)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `f` | npm |  | <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;X, <abbr title="io.github.ericmedvet.jnb.datastructure.Grid">Grid</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.agents.gridvsr.GridBody$Element">GridBody$Element</abbr>&gt;&gt;</code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;X, <abbr title="java.lang.Integer">Integer</abbr>&gt;</code>; built from `io.github.ericmedvet.robotevo2d.main.builders.NamedFunctions.w()` by robotevo2d-main:1.3.5-SNAPSHOT:2024-02-27T07:08:02Z

## Package `sim`

Aliases: `s`, `sim`

### Builder `sim.allAgentsFramer()`

`s.allAgentsFramer(enlargement; followTime)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `enlargement` | d | `1.5` | <code>double</code> |
| `followTime` | d | `2.0` | <code>double</code> |

Produces <code><abbr title="io.github.ericmedvet.mrsim2d.viewer.Framer">Framer</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.Snapshot">Snapshot</abbr>&gt;</code>; built from `io.github.ericmedvet.mrsim2d.buildable.builders.Misc.allAgentsFramer()` by mrsim2d-buildable:1.0.3-SNAPSHOT:2024-02-26T23:35:43Z

### Builder `sim.defaultRG()`

`s.defaultRG(seed)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `seed` | i | `0` | <code>int</code> |

Produces <code><abbr title="java.util.random.RandomGenerator">RandomGenerator</abbr></code>; built from `io.github.ericmedvet.mrsim2d.buildable.builders.Misc.defaultRG()` by mrsim2d-buildable:1.0.3-SNAPSHOT:2024-02-26T23:35:43Z

### Builder `sim.drawer()`

`s.drawer(framer; profilingTime; miniWorldEnlargement; miniWorld; components; miniAgents; engineProfiling; actions; info; nfc)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `framer` | npm | `s.allAgentsFramer()` | <code><abbr title="io.github.ericmedvet.mrsim2d.viewer.Framer">Framer</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.Snapshot">Snapshot</abbr>&gt;</code> |
| `profilingTime` | d | `1.0` | <code>double</code> |
| `miniWorldEnlargement` | d | `10.0` | <code>double</code> |
| `miniWorld` | b | `false` | <code>boolean</code> |
| `components` | e[] | `[UNMOVABLE_BODIES, SOFT_BODIES, RIGID_BODIES, ROTATIONAL_JOINTS]` | <code><abbr title="java.util.List">List</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.viewer.Drawers$Component">Drawers$Component</abbr>&gt;</code> |
| `miniAgents` | e | `BRAINS` | <code><abbr title="io.github.ericmedvet.mrsim2d.buildable.builders.Misc$MiniAgentInfo">Misc$MiniAgentInfo</abbr></code> |
| `engineProfiling` | b | `false` | <code>boolean</code> |
| `actions` | b | `false` | <code>boolean</code> |
| `info` | b | `true` | <code>boolean</code> |
| `nfc` | b | `false` | <code>boolean</code> |

Produces <code><abbr title="java.util.function.Function">Function</abbr>&lt;<abbr title="java.lang.String">String</abbr>, <abbr title="io.github.ericmedvet.mrsim2d.viewer.Drawer">Drawer</abbr>&gt;</code>; built from `io.github.ericmedvet.mrsim2d.buildable.builders.Misc.drawer()` by mrsim2d-buildable:1.0.3-SNAPSHOT:2024-02-26T23:35:43Z

### Builder `sim.engine()`

`s.engine()`

Produces <code><abbr title="java.util.function.Supplier">Supplier</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.engine.Engine">Engine</abbr>&gt;</code>; built from `io.github.ericmedvet.mrsim2d.buildable.builders.Misc.engine()` by mrsim2d-buildable:1.0.3-SNAPSHOT:2024-02-26T23:35:43Z

### Builder `sim.range()`

`s.range(min; max)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `min` | d |  | <code>double</code> |
| `max` | d |  | <code>double</code> |

Produces <code><abbr title="io.github.ericmedvet.jnb.datastructure.DoubleRange">DoubleRange</abbr></code>; built from `io.github.ericmedvet.mrsim2d.buildable.builders.Misc.range()` by mrsim2d-buildable:1.0.3-SNAPSHOT:2024-02-26T23:35:43Z

### Builder `sim.staticFramer()`

`s.staticFramer(minX; maxX; minY; maxY)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `minX` | d |  | <code>double</code> |
| `maxX` | d |  | <code>double</code> |
| `minY` | d |  | <code>double</code> |
| `maxY` | d |  | <code>double</code> |

Produces <code><abbr title="io.github.ericmedvet.mrsim2d.viewer.Framer">Framer</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.Snapshot">Snapshot</abbr>&gt;</code>; built from `io.github.ericmedvet.mrsim2d.buildable.builders.Misc.staticFramer()` by mrsim2d-buildable:1.0.3-SNAPSHOT:2024-02-26T23:35:43Z

### Builder `sim.supplier()`

`s.supplier(of)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `of` | npm |  | <code>T</code> |

Produces <code><abbr title="java.util.function.Supplier">Supplier</abbr>&lt;T&gt;</code>; built from `io.github.ericmedvet.mrsim2d.buildable.builders.Misc.supplier()` by mrsim2d-buildable:1.0.3-SNAPSHOT:2024-02-26T23:35:43Z

### Builder `sim.taskRunner()`

`s.taskRunner(task; engine)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `task` | npm |  | <code><abbr title="io.github.ericmedvet.mrsim2d.core.tasks.Task">Task</abbr>&lt;A, O&gt;</code> |
| `engine` | npm | `sim.engine()` | <code><abbr title="java.util.function.Supplier">Supplier</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.engine.Engine">Engine</abbr>&gt;</code> |

Produces <code><abbr title="java.util.function.Function">Function</abbr>&lt;A, O&gt;</code>; built from `io.github.ericmedvet.mrsim2d.buildable.builders.Misc.taskRunner()` by mrsim2d-buildable:1.0.3-SNAPSHOT:2024-02-26T23:35:43Z

## Package `sim.agent`

Aliases: `s.a`, `s.agent`, `sim.a`, `sim.agent`

### Builder `sim.agent.centralizedNumGridVSR()`

`s.a.centralizedNumGridVSR(body; function)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `body` | npm |  | <code><abbr title="io.github.ericmedvet.mrsim2d.core.agents.gridvsr.GridBody">GridBody</abbr></code> |
| `function` | npm |  | <code><abbr title="io.github.ericmedvet.jsdynsym.buildable.builders.NumericalDynamicalSystems$Builder">NumericalDynamicalSystems$Builder</abbr>&lt;?, ?&gt;</code> |

Produces <code><abbr title="io.github.ericmedvet.mrsim2d.core.agents.gridvsr.CentralizedNumGridVSR">CentralizedNumGridVSR</abbr></code>; built from `io.github.ericmedvet.mrsim2d.buildable.builders.Agents.centralizedNumGridVSR()` by mrsim2d-buildable:1.0.3-SNAPSHOT:2024-02-26T23:35:43Z

### Builder `sim.agent.distributedNumGridVSR()`

`s.a.distributedNumGridVSR(body; function; signals; directional)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `body` | npm |  | <code><abbr title="io.github.ericmedvet.mrsim2d.core.agents.gridvsr.GridBody">GridBody</abbr></code> |
| `function` | npm |  | <code><abbr title="io.github.ericmedvet.jsdynsym.buildable.builders.NumericalDynamicalSystems$Builder">NumericalDynamicalSystems$Builder</abbr>&lt;?, ?&gt;</code> |
| `signals` | i |  | <code>int</code> |
| `directional` | b | `false` | <code>boolean</code> |

Produces <code><abbr title="io.github.ericmedvet.mrsim2d.core.agents.gridvsr.DistributedNumGridVSR">DistributedNumGridVSR</abbr></code>; built from `io.github.ericmedvet.mrsim2d.buildable.builders.Agents.distributedNumGridVSR()` by mrsim2d-buildable:1.0.3-SNAPSHOT:2024-02-26T23:35:43Z

### Builder `sim.agent.numIndependentVoxel()`

`s.a.numIndependentVoxel(sensors; areaActuation; attachActuation; nOfNFCChannels; function)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `sensors` | npm[] | `[]` | <code><abbr title="java.util.List">List</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.Sensor">Sensor</abbr>&lt;? super <abbr title="io.github.ericmedvet.mrsim2d.core.bodies.Voxel">Voxel</abbr>&gt;&gt;</code> |
| `areaActuation` | e | `SIDES` | <code><abbr title="io.github.ericmedvet.mrsim2d.core.agents.independentvoxel.NumIndependentVoxel$AreaActuation">NumIndependentVoxel$AreaActuation</abbr></code> |
| `attachActuation` | b | `true` | <code>boolean</code> |
| `nOfNFCChannels` | i | `1` | <code>int</code> |
| `function` | npm |  | <code><abbr title="io.github.ericmedvet.jsdynsym.buildable.builders.NumericalDynamicalSystems$Builder">NumericalDynamicalSystems$Builder</abbr>&lt;?, ?&gt;</code> |

Produces <code><abbr title="io.github.ericmedvet.mrsim2d.core.agents.independentvoxel.NumIndependentVoxel">NumIndependentVoxel</abbr></code>; built from `io.github.ericmedvet.mrsim2d.buildable.builders.Agents.numIndependentVoxel()` by mrsim2d-buildable:1.0.3-SNAPSHOT:2024-02-26T23:35:43Z

### Builder `sim.agent.numLeggedHybridModularRobot()`

`s.a.numLeggedHybridModularRobot(modules; function)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `modules` | npm[] | `[]` | <code><abbr title="java.util.List">List</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.agents.legged.AbstractLeggedHybridModularRobot$Module">AbstractLeggedHybridModularRobot$Module</abbr>&gt;</code> |
| `function` | npm |  | <code><abbr title="io.github.ericmedvet.jsdynsym.buildable.builders.NumericalDynamicalSystems$Builder">NumericalDynamicalSystems$Builder</abbr>&lt;?, ?&gt;</code> |

Produces <code><abbr title="io.github.ericmedvet.mrsim2d.core.agents.legged.NumLeggedHybridModularRobot">NumLeggedHybridModularRobot</abbr></code>; built from `io.github.ericmedvet.mrsim2d.buildable.builders.Agents.numLeggedHybridModularRobot()` by mrsim2d-buildable:1.0.3-SNAPSHOT:2024-02-26T23:35:43Z

### Builder `sim.agent.numLeggedHybridRobot()`

`s.a.numLeggedHybridRobot(legs; trunkLength; trunkWidth; trunkMass; headMass; headSensors; function)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `legs` | npm[] | `[]` | <code><abbr title="java.util.List">List</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.agents.legged.AbstractLeggedHybridRobot$Leg">AbstractLeggedHybridRobot$Leg</abbr>&gt;</code> |
| `trunkLength` | d | `24.0` | <code>double</code> |
| `trunkWidth` | d | `1.0` | <code>double</code> |
| `trunkMass` | d | `24.0` | <code>double</code> |
| `headMass` | d | `1.0` | <code>double</code> |
| `headSensors` | npm[] | `[]` | <code><abbr title="java.util.List">List</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.Sensor">Sensor</abbr>&lt;?&gt;&gt;</code> |
| `function` | npm |  | <code><abbr title="io.github.ericmedvet.jsdynsym.buildable.builders.NumericalDynamicalSystems$Builder">NumericalDynamicalSystems$Builder</abbr>&lt;?, ?&gt;</code> |

Produces <code><abbr title="io.github.ericmedvet.mrsim2d.core.agents.legged.NumLeggedHybridRobot">NumLeggedHybridRobot</abbr></code>; built from `io.github.ericmedvet.mrsim2d.buildable.builders.Agents.numLeggedHybridRobot()` by mrsim2d-buildable:1.0.3-SNAPSHOT:2024-02-26T23:35:43Z

### Builder `sim.agent.reactiveGridVSR()`

`s.a.reactiveGridVSR(body)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `body` | npm |  | <code><abbr title="io.github.ericmedvet.jnb.datastructure.Grid">Grid</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.agents.gridvsr.ReactiveGridVSR$ReactiveVoxel">ReactiveGridVSR$ReactiveVoxel</abbr>&gt;</code> |

Produces <code><abbr title="io.github.ericmedvet.mrsim2d.core.agents.gridvsr.ReactiveGridVSR">ReactiveGridVSR</abbr></code>; built from `io.github.ericmedvet.mrsim2d.buildable.builders.Agents.reactiveGridVSR()` by mrsim2d-buildable:1.0.3-SNAPSHOT:2024-02-26T23:35:43Z

## Package `sim.agent.legged`

Aliases: `s.a.l`, `s.a.legged`, `s.agent.l`, `s.agent.legged`, `sim.a.l`, `sim.a.legged`, `sim.agent.l`, `sim.agent.legged`

### Builder `sim.agent.legged.leg()`

`s.a.l.leg(legChunks; downConnectorMass; downConnector; downConnectorSensors)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `legChunks` | npm[] | `[]` | <code><abbr title="java.util.List">List</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.agents.legged.LegChunk">LegChunk</abbr>&gt;</code> |
| `downConnectorMass` | d | `1.1025` | <code>double</code> |
| `downConnector` | e | `RIGID` | <code><abbr title="io.github.ericmedvet.mrsim2d.core.agents.legged.ConnectorType">ConnectorType</abbr></code> |
| `downConnectorSensors` | npm[] | `[]` | <code><abbr title="java.util.List">List</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.Sensor">Sensor</abbr>&lt;?&gt;&gt;</code> |

Produces <code><abbr title="io.github.ericmedvet.mrsim2d.core.agents.legged.AbstractLeggedHybridRobot$Leg">AbstractLeggedHybridRobot$Leg</abbr></code>; built from `io.github.ericmedvet.mrsim2d.buildable.builders.LeggedMisc.leg()` by mrsim2d-buildable:1.0.3-SNAPSHOT:2024-02-26T23:35:43Z

### Builder `sim.agent.legged.legChunk()`

`s.a.l.legChunk(length; width; mass; upConnector; jointSensors; motorMaxSpeed; motorMaxTorque; motorControlP; motorControlI; motorControlD; motorAngleTolerance; activeAngleRange)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `length` | d | `1.05` | <code>double</code> |
| `width` | d | `1.0` | <code>double</code> |
| `mass` | d | `1.05` | <code>double</code> |
| `upConnector` | e | `RIGID` | <code><abbr title="io.github.ericmedvet.mrsim2d.core.agents.legged.ConnectorType">ConnectorType</abbr></code> |
| `jointSensors` | npm[] | `[]` | <code><abbr title="java.util.List">List</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.Sensor">Sensor</abbr>&lt;?&gt;&gt;</code> |
| `motorMaxSpeed` | d | `20.0` | <code>double</code> |
| `motorMaxTorque` | d | `1000.0` | <code>double</code> |
| `motorControlP` | d | `10.0` | <code>double</code> |
| `motorControlI` | d | `2.0` | <code>double</code> |
| `motorControlD` | d | `2.0` | <code>double</code> |
| `motorAngleTolerance` | d | `0.0` | <code>double</code> |
| `activeAngleRange` | npm | `sim.range(min = -1.047; max = 1.047)` | <code><abbr title="io.github.ericmedvet.jnb.datastructure.DoubleRange">DoubleRange</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.mrsim2d.core.agents.legged.LegChunk">LegChunk</abbr></code>; built from `io.github.ericmedvet.mrsim2d.buildable.builders.LeggedMisc.legChunk()` by mrsim2d-buildable:1.0.3-SNAPSHOT:2024-02-26T23:35:43Z

### Builder `sim.agent.legged.module()`

`s.a.l.module(trunkLength; trunkWidth; trunkMass; legChunks; downConnector; rightConnector; trunkSensors; rightConnectorSensors; downConnectorSensors)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `trunkLength` | d | `6.0` | <code>double</code> |
| `trunkWidth` | d | `1.0` | <code>double</code> |
| `trunkMass` | d | `6.0` | <code>double</code> |
| `legChunks` | npm[] | `[]` | <code><abbr title="java.util.List">List</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.agents.legged.LegChunk">LegChunk</abbr>&gt;</code> |
| `downConnector` | e | `RIGID` | <code><abbr title="io.github.ericmedvet.mrsim2d.core.agents.legged.ConnectorType">ConnectorType</abbr></code> |
| `rightConnector` | e | `RIGID` | <code><abbr title="io.github.ericmedvet.mrsim2d.core.agents.legged.ConnectorType">ConnectorType</abbr></code> |
| `trunkSensors` | npm[] | `[]` | <code><abbr title="java.util.List">List</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.Sensor">Sensor</abbr>&lt;?&gt;&gt;</code> |
| `rightConnectorSensors` | npm[] | `[]` | <code><abbr title="java.util.List">List</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.Sensor">Sensor</abbr>&lt;?&gt;&gt;</code> |
| `downConnectorSensors` | npm[] | `[]` | <code><abbr title="java.util.List">List</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.Sensor">Sensor</abbr>&lt;?&gt;&gt;</code> |

Produces <code><abbr title="io.github.ericmedvet.mrsim2d.core.agents.legged.AbstractLeggedHybridModularRobot$Module">AbstractLeggedHybridModularRobot$Module</abbr></code>; built from `io.github.ericmedvet.mrsim2d.buildable.builders.LeggedMisc.module()` by mrsim2d-buildable:1.0.3-SNAPSHOT:2024-02-26T23:35:43Z

## Package `sim.agent.vsr`

Aliases: `s.a.vsr`, `s.agent.vsr`, `sim.a.vsr`, `sim.agent.vsr`

### Builder `sim.agent.vsr.gridBody()`

`s.a.vsr.gridBody(shape; sensorizingFunction)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `shape` | npm |  | <code><abbr title="io.github.ericmedvet.jnb.datastructure.Grid">Grid</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.agents.gridvsr.GridBody$VoxelType">GridBody$VoxelType</abbr>&gt;</code> |
| `sensorizingFunction` | npm |  | <code><abbr title="java.util.function.Function">Function</abbr>&lt;<abbr title="io.github.ericmedvet.jnb.datastructure.Grid">Grid</abbr>&lt;<abbr title="java.lang.Boolean">Boolean</abbr>&gt;, <abbr title="io.github.ericmedvet.jnb.datastructure.Grid">Grid</abbr>&lt;<abbr title="java.util.List">List</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.Sensor">Sensor</abbr>&lt;? super <abbr title="io.github.ericmedvet.mrsim2d.core.bodies.Body">Body</abbr>&gt;&gt;&gt;&gt;</code> |

Produces <code><abbr title="io.github.ericmedvet.mrsim2d.core.agents.gridvsr.GridBody">GridBody</abbr></code>; built from `io.github.ericmedvet.mrsim2d.buildable.builders.VSRMisc.gridBody()` by mrsim2d-buildable:1.0.3-SNAPSHOT:2024-02-26T23:35:43Z

## Package `sim.agent.vsr.reactiveVoxel`

Aliases: `s.a.vsr.reactiveVoxel`, `s.a.vsr.rv`, `s.agent.vsr.reactiveVoxel`, `s.agent.vsr.rv`, `sim.a.vsr.reactiveVoxel`, `sim.a.vsr.rv`, `sim.agent.vsr.reactiveVoxel`, `sim.agent.vsr.rv`

### Builder `sim.agent.vsr.reactiveVoxel.aa()`

`s.a.vsr.rv.aa(angle; action)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `angle` | d | `0.0` | <code>double</code> |
| `action` | e | `EXPAND` | <code><abbr title="io.github.ericmedvet.mrsim2d.buildable.builders.ReactiveVoxels$Action">ReactiveVoxels$Action</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.mrsim2d.core.agents.gridvsr.ReactiveGridVSR$ReactiveVoxel">ReactiveGridVSR$ReactiveVoxel</abbr></code>; built from `io.github.ericmedvet.mrsim2d.buildable.builders.ReactiveVoxels.aa()` by mrsim2d-buildable:1.0.3-SNAPSHOT:2024-02-26T23:35:43Z

### Builder `sim.agent.vsr.reactiveVoxel.asin()`

`s.a.vsr.rv.asin(f)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `f` | d | `1.0` | <code>double</code> |

Produces <code><abbr title="io.github.ericmedvet.mrsim2d.core.agents.gridvsr.ReactiveGridVSR$ReactiveVoxel">ReactiveGridVSR$ReactiveVoxel</abbr></code>; built from `io.github.ericmedvet.mrsim2d.buildable.builders.ReactiveVoxels.asin()` by mrsim2d-buildable:1.0.3-SNAPSHOT:2024-02-26T23:35:43Z

### Builder `sim.agent.vsr.reactiveVoxel.asld()`

`s.a.vsr.rv.asld(duration; threshold; action)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `duration` | d | `0.2` | <code>double</code> |
| `threshold` | d | `0.05` | <code>double</code> |
| `action` | e | `EXPAND` | <code><abbr title="io.github.ericmedvet.mrsim2d.buildable.builders.ReactiveVoxels$Action">ReactiveVoxels$Action</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.mrsim2d.core.agents.gridvsr.ReactiveGridVSR$ReactiveVoxel">ReactiveGridVSR$ReactiveVoxel</abbr></code>; built from `io.github.ericmedvet.mrsim2d.buildable.builders.ReactiveVoxels.asld()` by mrsim2d-buildable:1.0.3-SNAPSHOT:2024-02-26T23:35:43Z

### Builder `sim.agent.vsr.reactiveVoxel.at()`

`s.a.vsr.rv.at(duration; range; side; action)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `duration` | d | `0.2` | <code>double</code> |
| `range` | d | `1.0` | <code>double</code> |
| `side` | e | `S` | <code><abbr title="io.github.ericmedvet.mrsim2d.core.bodies.Voxel$Side">Voxel$Side</abbr></code> |
| `action` | e | `EXPAND` | <code><abbr title="io.github.ericmedvet.mrsim2d.buildable.builders.ReactiveVoxels$Action">ReactiveVoxels$Action</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.mrsim2d.core.agents.gridvsr.ReactiveGridVSR$ReactiveVoxel">ReactiveGridVSR$ReactiveVoxel</abbr></code>; built from `io.github.ericmedvet.mrsim2d.buildable.builders.ReactiveVoxels.at()` by mrsim2d-buildable:1.0.3-SNAPSHOT:2024-02-26T23:35:43Z

### Builder `sim.agent.vsr.reactiveVoxel.none()`

`s.a.vsr.rv.none()`

Produces <code><abbr title="io.github.ericmedvet.mrsim2d.core.agents.gridvsr.ReactiveGridVSR$ReactiveVoxel">ReactiveGridVSR$ReactiveVoxel</abbr></code>; built from `io.github.ericmedvet.mrsim2d.buildable.builders.ReactiveVoxels.none()` by mrsim2d-buildable:1.0.3-SNAPSHOT:2024-02-26T23:35:43Z

### Builder `sim.agent.vsr.reactiveVoxel.ph()`

`s.a.vsr.rv.ph()`

Produces <code><abbr title="io.github.ericmedvet.mrsim2d.core.agents.gridvsr.ReactiveGridVSR$ReactiveVoxel">ReactiveGridVSR$ReactiveVoxel</abbr></code>; built from `io.github.ericmedvet.mrsim2d.buildable.builders.ReactiveVoxels.ph()` by mrsim2d-buildable:1.0.3-SNAPSHOT:2024-02-26T23:35:43Z

### Builder `sim.agent.vsr.reactiveVoxel.ps()`

`s.a.vsr.rv.ps()`

Produces <code><abbr title="io.github.ericmedvet.mrsim2d.core.agents.gridvsr.ReactiveGridVSR$ReactiveVoxel">ReactiveGridVSR$ReactiveVoxel</abbr></code>; built from `io.github.ericmedvet.mrsim2d.buildable.builders.ReactiveVoxels.ps()` by mrsim2d-buildable:1.0.3-SNAPSHOT:2024-02-26T23:35:43Z

## Package `sim.agent.vsr.sensorizingFunction`

Aliases: `s.a.vsr.sensorizingFunction`, `s.a.vsr.sf`, `s.agent.vsr.sensorizingFunction`, `s.agent.vsr.sf`, `sim.a.vsr.sensorizingFunction`, `sim.a.vsr.sf`, `sim.agent.vsr.sensorizingFunction`, `sim.agent.vsr.sf`

### Builder `sim.agent.vsr.sensorizingFunction.directional()`

`s.a.vsr.sf.directional(nSensors; eSensors; sSensors; wSensors; headSensors)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `nSensors` | npm[] | `[]` | <code><abbr title="java.util.List">List</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.Sensor">Sensor</abbr>&lt;? super <abbr title="io.github.ericmedvet.mrsim2d.core.bodies.Voxel">Voxel</abbr>&gt;&gt;</code> |
| `eSensors` | npm[] | `[]` | <code><abbr title="java.util.List">List</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.Sensor">Sensor</abbr>&lt;? super <abbr title="io.github.ericmedvet.mrsim2d.core.bodies.Voxel">Voxel</abbr>&gt;&gt;</code> |
| `sSensors` | npm[] | `[]` | <code><abbr title="java.util.List">List</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.Sensor">Sensor</abbr>&lt;? super <abbr title="io.github.ericmedvet.mrsim2d.core.bodies.Voxel">Voxel</abbr>&gt;&gt;</code> |
| `wSensors` | npm[] | `[]` | <code><abbr title="java.util.List">List</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.Sensor">Sensor</abbr>&lt;? super <abbr title="io.github.ericmedvet.mrsim2d.core.bodies.Voxel">Voxel</abbr>&gt;&gt;</code> |
| `headSensors` | npm[] | `[]` | <code><abbr title="java.util.List">List</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.Sensor">Sensor</abbr>&lt;? super <abbr title="io.github.ericmedvet.mrsim2d.core.bodies.Voxel">Voxel</abbr>&gt;&gt;</code> |

Produces <code><abbr title="java.util.function.Function">Function</abbr>&lt;<abbr title="io.github.ericmedvet.jnb.datastructure.Grid">Grid</abbr>&lt;<abbr title="java.lang.Boolean">Boolean</abbr>&gt;, <abbr title="io.github.ericmedvet.jnb.datastructure.Grid">Grid</abbr>&lt;<abbr title="java.util.List">List</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.Sensor">Sensor</abbr>&lt;? super <abbr title="io.github.ericmedvet.mrsim2d.core.bodies.Voxel">Voxel</abbr>&gt;&gt;&gt;&gt;</code>; built from `io.github.ericmedvet.mrsim2d.buildable.builders.VSRSensorizingFunctions.directional()` by mrsim2d-buildable:1.0.3-SNAPSHOT:2024-02-26T23:35:43Z

### Builder `sim.agent.vsr.sensorizingFunction.empty()`

`s.a.vsr.sf.empty()`

Produces <code><abbr title="java.util.function.Function">Function</abbr>&lt;<abbr title="io.github.ericmedvet.jnb.datastructure.Grid">Grid</abbr>&lt;<abbr title="java.lang.Boolean">Boolean</abbr>&gt;, <abbr title="io.github.ericmedvet.jnb.datastructure.Grid">Grid</abbr>&lt;<abbr title="java.util.List">List</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.Sensor">Sensor</abbr>&lt;? super <abbr title="io.github.ericmedvet.mrsim2d.core.bodies.Voxel">Voxel</abbr>&gt;&gt;&gt;&gt;</code>; built from `io.github.ericmedvet.mrsim2d.buildable.builders.VSRSensorizingFunctions.empty()` by mrsim2d-buildable:1.0.3-SNAPSHOT:2024-02-26T23:35:43Z

### Builder `sim.agent.vsr.sensorizingFunction.uniform()`

`s.a.vsr.sf.uniform(sensors)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `sensors` | npm[] | `[]` | <code><abbr title="java.util.List">List</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.Sensor">Sensor</abbr>&lt;? super <abbr title="io.github.ericmedvet.mrsim2d.core.bodies.Voxel">Voxel</abbr>&gt;&gt;</code> |

Produces <code><abbr title="java.util.function.Function">Function</abbr>&lt;<abbr title="io.github.ericmedvet.jnb.datastructure.Grid">Grid</abbr>&lt;<abbr title="java.lang.Boolean">Boolean</abbr>&gt;, <abbr title="io.github.ericmedvet.jnb.datastructure.Grid">Grid</abbr>&lt;<abbr title="java.util.List">List</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.Sensor">Sensor</abbr>&lt;? super <abbr title="io.github.ericmedvet.mrsim2d.core.bodies.Voxel">Voxel</abbr>&gt;&gt;&gt;&gt;</code>; built from `io.github.ericmedvet.mrsim2d.buildable.builders.VSRSensorizingFunctions.uniform()` by mrsim2d-buildable:1.0.3-SNAPSHOT:2024-02-26T23:35:43Z

## Package `sim.agent.vsr.shape`

Aliases: `s.a.vsr.s`, `s.a.vsr.shape`, `s.agent.vsr.s`, `s.agent.vsr.shape`, `sim.a.vsr.s`, `sim.a.vsr.shape`, `sim.agent.vsr.s`, `sim.agent.vsr.shape`

### Builder `sim.agent.vsr.shape.ball()`

`s.a.vsr.s.ball(d)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `d` | i |  | <code><abbr title="java.lang.Integer">Integer</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.jnb.datastructure.Grid">Grid</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.agents.gridvsr.GridBody$VoxelType">GridBody$VoxelType</abbr>&gt;</code>; built from `io.github.ericmedvet.mrsim2d.buildable.builders.GridShapes.ball()` by mrsim2d-buildable:1.0.3-SNAPSHOT:2024-02-26T23:35:43Z

### Builder `sim.agent.vsr.shape.biped()`

`s.a.vsr.s.biped(w; h)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `w` | i |  | <code><abbr title="java.lang.Integer">Integer</abbr></code> |
| `h` | i |  | <code><abbr title="java.lang.Integer">Integer</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.jnb.datastructure.Grid">Grid</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.agents.gridvsr.GridBody$VoxelType">GridBody$VoxelType</abbr>&gt;</code>; built from `io.github.ericmedvet.mrsim2d.buildable.builders.GridShapes.biped()` by mrsim2d-buildable:1.0.3-SNAPSHOT:2024-02-26T23:35:43Z

### Builder `sim.agent.vsr.shape.comb()`

`s.a.vsr.s.comb(w; h)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `w` | i |  | <code><abbr title="java.lang.Integer">Integer</abbr></code> |
| `h` | i |  | <code><abbr title="java.lang.Integer">Integer</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.jnb.datastructure.Grid">Grid</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.agents.gridvsr.GridBody$VoxelType">GridBody$VoxelType</abbr>&gt;</code>; built from `io.github.ericmedvet.mrsim2d.buildable.builders.GridShapes.comb()` by mrsim2d-buildable:1.0.3-SNAPSHOT:2024-02-26T23:35:43Z

### Builder `sim.agent.vsr.shape.free()`

`s.a.vsr.s.free(s)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `s` | s | `rsr-s.s` | <code><abbr title="java.lang.String">String</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.jnb.datastructure.Grid">Grid</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.agents.gridvsr.GridBody$VoxelType">GridBody$VoxelType</abbr>&gt;</code>; built from `io.github.ericmedvet.mrsim2d.buildable.builders.GridShapes.free()` by mrsim2d-buildable:1.0.3-SNAPSHOT:2024-02-26T23:35:43Z

### Builder `sim.agent.vsr.shape.t()`

`s.a.vsr.s.t(w; h)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `w` | i |  | <code><abbr title="java.lang.Integer">Integer</abbr></code> |
| `h` | i |  | <code><abbr title="java.lang.Integer">Integer</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.jnb.datastructure.Grid">Grid</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.agents.gridvsr.GridBody$VoxelType">GridBody$VoxelType</abbr>&gt;</code>; built from `io.github.ericmedvet.mrsim2d.buildable.builders.GridShapes.t()` by mrsim2d-buildable:1.0.3-SNAPSHOT:2024-02-26T23:35:43Z

### Builder `sim.agent.vsr.shape.triangle()`

`s.a.vsr.s.triangle(l)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `l` | i |  | <code><abbr title="java.lang.Integer">Integer</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.jnb.datastructure.Grid">Grid</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.agents.gridvsr.GridBody$VoxelType">GridBody$VoxelType</abbr>&gt;</code>; built from `io.github.ericmedvet.mrsim2d.buildable.builders.GridShapes.triangle()` by mrsim2d-buildable:1.0.3-SNAPSHOT:2024-02-26T23:35:43Z

### Builder `sim.agent.vsr.shape.tripod()`

`s.a.vsr.s.tripod(w; h)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `w` | i |  | <code><abbr title="java.lang.Integer">Integer</abbr></code> |
| `h` | i |  | <code><abbr title="java.lang.Integer">Integer</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.jnb.datastructure.Grid">Grid</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.agents.gridvsr.GridBody$VoxelType">GridBody$VoxelType</abbr>&gt;</code>; built from `io.github.ericmedvet.mrsim2d.buildable.builders.GridShapes.tripod()` by mrsim2d-buildable:1.0.3-SNAPSHOT:2024-02-26T23:35:43Z

### Builder `sim.agent.vsr.shape.worm()`

`s.a.vsr.s.worm(w; h)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `w` | i |  | <code><abbr title="java.lang.Integer">Integer</abbr></code> |
| `h` | i |  | <code><abbr title="java.lang.Integer">Integer</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.jnb.datastructure.Grid">Grid</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.agents.gridvsr.GridBody$VoxelType">GridBody$VoxelType</abbr>&gt;</code>; built from `io.github.ericmedvet.mrsim2d.buildable.builders.GridShapes.worm()` by mrsim2d-buildable:1.0.3-SNAPSHOT:2024-02-26T23:35:43Z

## Package `sim.sensors`

Aliases: `s.s`, `s.sensors`, `sim.s`, `sim.sensors`

### Builder `sim.sensors.a()`

`s.s.a()`

Produces <code><abbr title="io.github.ericmedvet.mrsim2d.core.Sensor">Sensor</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.bodies.Body">Body</abbr>&gt;</code>; built from `io.github.ericmedvet.mrsim2d.buildable.builders.Sensors.a()` by mrsim2d-buildable:1.0.3-SNAPSHOT:2024-02-26T23:35:43Z

### Builder `sim.sensors.ar()`

`s.s.ar()`

Produces <code><abbr title="io.github.ericmedvet.mrsim2d.core.Sensor">Sensor</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.bodies.Body">Body</abbr>&gt;</code>; built from `io.github.ericmedvet.mrsim2d.buildable.builders.Sensors.ar()` by mrsim2d-buildable:1.0.3-SNAPSHOT:2024-02-26T23:35:43Z

### Builder `sim.sensors.c()`

`s.s.c()`

Produces <code><abbr title="io.github.ericmedvet.mrsim2d.core.Sensor">Sensor</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.bodies.Body">Body</abbr>&gt;</code>; built from `io.github.ericmedvet.mrsim2d.buildable.builders.Sensors.c()` by mrsim2d-buildable:1.0.3-SNAPSHOT:2024-02-26T23:35:43Z

### Builder `sim.sensors.d()`

`s.s.d(a; r)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `a` | d | `0.0` | <code><abbr title="java.lang.Double">Double</abbr></code> |
| `r` | d | `1.0` | <code><abbr title="java.lang.Double">Double</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.mrsim2d.core.Sensor">Sensor</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.bodies.Body">Body</abbr>&gt;</code>; built from `io.github.ericmedvet.mrsim2d.buildable.builders.Sensors.d()` by mrsim2d-buildable:1.0.3-SNAPSHOT:2024-02-26T23:35:43Z

### Builder `sim.sensors.ja()`

`s.s.ja()`

Produces <code><abbr title="io.github.ericmedvet.mrsim2d.core.Sensor">Sensor</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.bodies.RotationalJoint">RotationalJoint</abbr>&gt;</code>; built from `io.github.ericmedvet.mrsim2d.buildable.builders.Sensors.ja()` by mrsim2d-buildable:1.0.3-SNAPSHOT:2024-02-26T23:35:43Z

### Builder `sim.sensors.rv()`

`s.s.rv(a)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `a` | d | `0.0` | <code><abbr title="java.lang.Double">Double</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.mrsim2d.core.Sensor">Sensor</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.bodies.Body">Body</abbr>&gt;</code>; built from `io.github.ericmedvet.mrsim2d.buildable.builders.Sensors.rv()` by mrsim2d-buildable:1.0.3-SNAPSHOT:2024-02-26T23:35:43Z

### Builder `sim.sensors.sa()`

`s.s.sa(s)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `s` | e |  | <code><abbr title="io.github.ericmedvet.mrsim2d.core.bodies.Voxel$Side">Voxel$Side</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.mrsim2d.core.Sensor">Sensor</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.bodies.Voxel">Voxel</abbr>&gt;</code>; built from `io.github.ericmedvet.mrsim2d.buildable.builders.Sensors.sa()` by mrsim2d-buildable:1.0.3-SNAPSHOT:2024-02-26T23:35:43Z

### Builder `sim.sensors.sc()`

`s.s.sc(s)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `s` | e |  | <code><abbr title="io.github.ericmedvet.mrsim2d.core.bodies.Voxel$Side">Voxel$Side</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.mrsim2d.core.Sensor">Sensor</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.bodies.Voxel">Voxel</abbr>&gt;</code>; built from `io.github.ericmedvet.mrsim2d.buildable.builders.Sensors.sc()` by mrsim2d-buildable:1.0.3-SNAPSHOT:2024-02-26T23:35:43Z

### Builder `sim.sensors.sin()`

`s.s.sin(f; p)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `f` | d | `1.0` | <code><abbr title="java.lang.Double">Double</abbr></code> |
| `p` | d | `0.0` | <code><abbr title="java.lang.Double">Double</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.mrsim2d.core.Sensor">Sensor</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.bodies.Body">Body</abbr>&gt;</code>; built from `io.github.ericmedvet.mrsim2d.buildable.builders.Sensors.sin()` by mrsim2d-buildable:1.0.3-SNAPSHOT:2024-02-26T23:35:43Z

## Package `sim.task`

Aliases: `s.task`, `sim.task`

### Builder `sim.task.balancing()`

`s.task.balancing(duration; swingLength; swingDensity; supportHeight; initialXGap; initialYGap)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `duration` | d | `10.0` | <code>double</code> |
| `swingLength` | d | `10.0` | <code>double</code> |
| `swingDensity` | d | `0.1` | <code>double</code> |
| `supportHeight` | d | `1.0` | <code>double</code> |
| `initialXGap` | d | `0.0` | <code>double</code> |
| `initialYGap` | d | `0.1` | <code>double</code> |

Produces <code><abbr title="io.github.ericmedvet.mrsim2d.core.tasks.balancing.Balancing">Balancing</abbr></code>; built from `io.github.ericmedvet.mrsim2d.buildable.builders.Tasks.balancing()` by mrsim2d-buildable:1.0.3-SNAPSHOT:2024-02-26T23:35:43Z

### Builder `sim.task.fallPiling()`

`s.task.fallPiling(duration; fallInterval; nOfAgents; xSigmaRatio; randomGenerator; terrain; yGapRatio; xGap)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `duration` | d | `45.0` | <code>double</code> |
| `fallInterval` | d | `5.0` | <code>double</code> |
| `nOfAgents` | i |  | <code>int</code> |
| `xSigmaRatio` | d | `0.1` | <code>double</code> |
| `randomGenerator` | npm | `sim.defaultRG()` | <code><abbr title="java.util.random.RandomGenerator">RandomGenerator</abbr></code> |
| `terrain` | npm | `sim.terrain.flat()` | <code><abbr title="io.github.ericmedvet.mrsim2d.core.geometry.Terrain">Terrain</abbr></code> |
| `yGapRatio` | d | `1.0` | <code>double</code> |
| `xGap` | d | `10.0` | <code>double</code> |

Produces <code><abbr title="io.github.ericmedvet.mrsim2d.core.tasks.piling.FallPiling">FallPiling</abbr></code>; built from `io.github.ericmedvet.mrsim2d.buildable.builders.Tasks.fallPiling()` by mrsim2d-buildable:1.0.3-SNAPSHOT:2024-02-26T23:35:43Z

### Builder `sim.task.jumping()`

`s.task.jumping(duration; initialYGap)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `duration` | d | `10.0` | <code>double</code> |
| `initialYGap` | d | `0.1` | <code>double</code> |

Produces <code><abbr title="io.github.ericmedvet.mrsim2d.core.tasks.jumping.Jumping">Jumping</abbr></code>; built from `io.github.ericmedvet.mrsim2d.buildable.builders.Tasks.jumping()` by mrsim2d-buildable:1.0.3-SNAPSHOT:2024-02-26T23:35:43Z

### Builder `sim.task.locomotion()`

`s.task.locomotion(duration; terrain; initialXGap; initialYGap)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `duration` | d | `30.0` | <code>double</code> |
| `terrain` | npm | `sim.terrain.flat()` | <code><abbr title="io.github.ericmedvet.mrsim2d.core.geometry.Terrain">Terrain</abbr></code> |
| `initialXGap` | d | `1.0` | <code>double</code> |
| `initialYGap` | d | `0.1` | <code>double</code> |

Produces <code><abbr title="io.github.ericmedvet.mrsim2d.core.tasks.locomotion.Locomotion">Locomotion</abbr></code>; built from `io.github.ericmedvet.mrsim2d.buildable.builders.Tasks.locomotion()` by mrsim2d-buildable:1.0.3-SNAPSHOT:2024-02-26T23:35:43Z

### Builder `sim.task.prebuiltIndependentLocomotion()`

`s.task.prebuiltIndependentLocomotion(duration; terrain; initialXGap; initialYGap; shape)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `duration` | d | `30.0` | <code>double</code> |
| `terrain` | npm | `sim.terrain.flat()` | <code><abbr title="io.github.ericmedvet.mrsim2d.core.geometry.Terrain">Terrain</abbr></code> |
| `initialXGap` | d | `1.0` | <code>double</code> |
| `initialYGap` | d | `0.1` | <code>double</code> |
| `shape` | npm |  | <code><abbr title="io.github.ericmedvet.jnb.datastructure.Grid">Grid</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.agents.gridvsr.GridBody$VoxelType">GridBody$VoxelType</abbr>&gt;</code> |

Produces <code><abbr title="io.github.ericmedvet.mrsim2d.core.tasks.locomotion.PrebuiltIndependentLocomotion">PrebuiltIndependentLocomotion</abbr></code>; built from `io.github.ericmedvet.mrsim2d.buildable.builders.Tasks.prebuiltIndependentLocomotion()` by mrsim2d-buildable:1.0.3-SNAPSHOT:2024-02-26T23:35:43Z

### Builder `sim.task.standPiling()`

`s.task.standPiling(duration; nOfAgents; xGapRatio; terrain; firstXGap; initialYGap)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `duration` | d | `45.0` | <code>double</code> |
| `nOfAgents` | i |  | <code>int</code> |
| `xGapRatio` | d | `1.0` | <code>double</code> |
| `terrain` | npm | `sim.terrain.flat()` | <code><abbr title="io.github.ericmedvet.mrsim2d.core.geometry.Terrain">Terrain</abbr></code> |
| `firstXGap` | d | `10.0` | <code>double</code> |
| `initialYGap` | d | `0.1` | <code>double</code> |

Produces <code><abbr title="io.github.ericmedvet.mrsim2d.core.tasks.piling.StandPiling">StandPiling</abbr></code>; built from `io.github.ericmedvet.mrsim2d.buildable.builders.Tasks.standPiling()` by mrsim2d-buildable:1.0.3-SNAPSHOT:2024-02-26T23:35:43Z

## Package `sim.task.balancing`

Aliases: `s.task.b`, `s.task.balancing`, `sim.task.b`, `sim.task.balancing`

### Builder `sim.task.balancing.avgSwingAngle()`

`s.task.b.avgSwingAngle(transientTime)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `transientTime` | d | `5.0` | <code>double</code> |

Produces <code><abbr title="java.util.function.Function">Function</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.tasks.balancing.BalancingOutcome">BalancingOutcome</abbr>, <abbr title="java.lang.Double">Double</abbr>&gt;</code>; built from `io.github.ericmedvet.mrsim2d.buildable.builders.BalancingOutcomeFunctions.avgSwingAngle()` by mrsim2d-buildable:1.0.3-SNAPSHOT:2024-02-26T23:35:43Z

### Builder `sim.task.balancing.avgSwingAngleWithMalus()`

`s.task.b.avgSwingAngleWithMalus(transientTime; malus)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `transientTime` | d | `5.0` | <code>double</code> |
| `malus` | d | `1.5707963267948966` | <code>double</code> |

Produces <code><abbr title="java.util.function.Function">Function</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.tasks.balancing.BalancingOutcome">BalancingOutcome</abbr>, <abbr title="java.lang.Double">Double</abbr>&gt;</code>; built from `io.github.ericmedvet.mrsim2d.buildable.builders.BalancingOutcomeFunctions.avgSwingAngleWithMalus()` by mrsim2d-buildable:1.0.3-SNAPSHOT:2024-02-26T23:35:43Z

## Package `sim.task.jumping`

Aliases: `s.task.j`, `s.task.jumping`, `sim.task.j`, `sim.task.jumping`

### Builder `sim.task.jumping.avgBBMinY()`

`s.task.j.avgBBMinY(transientTime)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `transientTime` | d | `5.0` | <code>double</code> |

Produces <code><abbr title="java.util.function.Function">Function</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.tasks.Outcome">Outcome</abbr>&lt;?&gt;, <abbr title="java.lang.Double">Double</abbr>&gt;</code>; built from `io.github.ericmedvet.mrsim2d.buildable.builders.JumpingOutcomeFunctions.avgBBMinY()` by mrsim2d-buildable:1.0.3-SNAPSHOT:2024-02-26T23:35:43Z

### Builder `sim.task.jumping.avgY()`

`s.task.j.avgY(transientTime)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `transientTime` | d | `5.0` | <code>double</code> |

Produces <code><abbr title="java.util.function.Function">Function</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.tasks.Outcome">Outcome</abbr>&lt;?&gt;, <abbr title="java.lang.Double">Double</abbr>&gt;</code>; built from `io.github.ericmedvet.mrsim2d.buildable.builders.JumpingOutcomeFunctions.avgY()` by mrsim2d-buildable:1.0.3-SNAPSHOT:2024-02-26T23:35:43Z

### Builder `sim.task.jumping.maxBBMinY()`

`s.task.j.maxBBMinY(transientTime)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `transientTime` | d | `5.0` | <code>double</code> |

Produces <code><abbr title="java.util.function.Function">Function</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.tasks.Outcome">Outcome</abbr>&lt;?&gt;, <abbr title="java.lang.Double">Double</abbr>&gt;</code>; built from `io.github.ericmedvet.mrsim2d.buildable.builders.JumpingOutcomeFunctions.maxBBMinY()` by mrsim2d-buildable:1.0.3-SNAPSHOT:2024-02-26T23:35:43Z

### Builder `sim.task.jumping.maxMaxRelJumpH()`

`s.task.j.maxMaxRelJumpH(transientTime)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `transientTime` | d | `5.0` | <code>double</code> |

Produces <code><abbr title="java.util.function.Function">Function</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.tasks.Outcome">Outcome</abbr>&lt;?&gt;, <abbr title="java.lang.Double">Double</abbr>&gt;</code>; built from `io.github.ericmedvet.mrsim2d.buildable.builders.JumpingOutcomeFunctions.maxMaxRelJumpH()` by mrsim2d-buildable:1.0.3-SNAPSHOT:2024-02-26T23:35:43Z

### Builder `sim.task.jumping.maxY()`

`s.task.j.maxY(transientTime)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `transientTime` | d | `5.0` | <code>double</code> |

Produces <code><abbr title="java.util.function.Function">Function</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.tasks.Outcome">Outcome</abbr>&lt;?&gt;, <abbr title="java.lang.Double">Double</abbr>&gt;</code>; built from `io.github.ericmedvet.mrsim2d.buildable.builders.JumpingOutcomeFunctions.maxY()` by mrsim2d-buildable:1.0.3-SNAPSHOT:2024-02-26T23:35:43Z

## Package `sim.task.locomotion`

Aliases: `s.task.l`, `s.task.locomotion`, `sim.task.l`, `sim.task.locomotion`

### Builder `sim.task.locomotion.avgArea()`

`s.task.l.avgArea(transientTime)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `transientTime` | d | `0.0` | <code>double</code> |

Produces <code><abbr title="java.util.function.Function">Function</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.tasks.Outcome">Outcome</abbr>&lt;?&gt;, <abbr title="java.lang.Double">Double</abbr>&gt;</code>; built from `io.github.ericmedvet.mrsim2d.buildable.builders.LocomotionOutcomeFunctions.avgArea()` by mrsim2d-buildable:1.0.3-SNAPSHOT:2024-02-26T23:35:43Z

### Builder `sim.task.locomotion.avgTerrainHeight()`

`s.task.l.avgTerrainHeight(transientTime)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `transientTime` | d | `0.0` | <code>double</code> |

Produces <code><abbr title="java.util.function.Function">Function</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.tasks.Outcome">Outcome</abbr>&lt;?&gt;, <abbr title="java.lang.Double">Double</abbr>&gt;</code>; built from `io.github.ericmedvet.mrsim2d.buildable.builders.LocomotionOutcomeFunctions.avgTerrainHeight()` by mrsim2d-buildable:1.0.3-SNAPSHOT:2024-02-26T23:35:43Z

### Builder `sim.task.locomotion.xDistance()`

`s.task.l.xDistance(transientTime)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `transientTime` | d | `0.0` | <code>double</code> |

Produces <code><abbr title="java.util.function.Function">Function</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.tasks.Outcome">Outcome</abbr>&lt;?&gt;, <abbr title="java.lang.Double">Double</abbr>&gt;</code>; built from `io.github.ericmedvet.mrsim2d.buildable.builders.LocomotionOutcomeFunctions.xDistance()` by mrsim2d-buildable:1.0.3-SNAPSHOT:2024-02-26T23:35:43Z

### Builder `sim.task.locomotion.xVelocity()`

`s.task.l.xVelocity(transientTime)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `transientTime` | d | `0.0` | <code>double</code> |

Produces <code><abbr title="java.util.function.Function">Function</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.tasks.Outcome">Outcome</abbr>&lt;?&gt;, <abbr title="java.lang.Double">Double</abbr>&gt;</code>; built from `io.github.ericmedvet.mrsim2d.buildable.builders.LocomotionOutcomeFunctions.xVelocity()` by mrsim2d-buildable:1.0.3-SNAPSHOT:2024-02-26T23:35:43Z

## Package `sim.task.piling`

Aliases: `s.task.p`, `s.task.piling`, `sim.task.p`, `sim.task.piling`

### Builder `sim.task.piling.avgH()`

`s.task.p.avgH(transientTime)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `transientTime` | d | `0.0` | <code>double</code> |

Produces <code><abbr title="java.util.function.Function">Function</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.tasks.Outcome">Outcome</abbr>&lt;?&gt;, <abbr title="java.lang.Double">Double</abbr>&gt;</code>; built from `io.github.ericmedvet.mrsim2d.buildable.builders.PilingOutcomeFunctions.avgH()` by mrsim2d-buildable:1.0.3-SNAPSHOT:2024-02-26T23:35:43Z

### Builder `sim.task.piling.avgW()`

`s.task.p.avgW(transientTime)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `transientTime` | d | `0.0` | <code>double</code> |

Produces <code><abbr title="java.util.function.Function">Function</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.tasks.Outcome">Outcome</abbr>&lt;?&gt;, <abbr title="java.lang.Double">Double</abbr>&gt;</code>; built from `io.github.ericmedvet.mrsim2d.buildable.builders.PilingOutcomeFunctions.avgW()` by mrsim2d-buildable:1.0.3-SNAPSHOT:2024-02-26T23:35:43Z

### Builder `sim.task.piling.maxH()`

`s.task.p.maxH(transientTime)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `transientTime` | d | `0.0` | <code>double</code> |

Produces <code><abbr title="java.util.function.Function">Function</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.tasks.Outcome">Outcome</abbr>&lt;?&gt;, <abbr title="java.lang.Double">Double</abbr>&gt;</code>; built from `io.github.ericmedvet.mrsim2d.buildable.builders.PilingOutcomeFunctions.maxH()` by mrsim2d-buildable:1.0.3-SNAPSHOT:2024-02-26T23:35:43Z

### Builder `sim.task.piling.maxW()`

`s.task.p.maxW(transientTime)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `transientTime` | d | `0.0` | <code>double</code> |

Produces <code><abbr title="java.util.function.Function">Function</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.tasks.Outcome">Outcome</abbr>&lt;?&gt;, <abbr title="java.lang.Double">Double</abbr>&gt;</code>; built from `io.github.ericmedvet.mrsim2d.buildable.builders.PilingOutcomeFunctions.maxW()` by mrsim2d-buildable:1.0.3-SNAPSHOT:2024-02-26T23:35:43Z

## Package `sim.terrain`

Aliases: `s.t`, `s.terrain`, `sim.t`, `sim.terrain`

### Builder `sim.terrain.downhill()`

`s.t.downhill(w; h; borderW; borderH; a)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `w` | d | `500.0` | <code><abbr title="java.lang.Double">Double</abbr></code> |
| `h` | d | `25.0` | <code><abbr title="java.lang.Double">Double</abbr></code> |
| `borderW` | d | `10.0` | <code><abbr title="java.lang.Double">Double</abbr></code> |
| `borderH` | d | `100.0` | <code><abbr title="java.lang.Double">Double</abbr></code> |
| `a` | d | `10.0` | <code><abbr title="java.lang.Double">Double</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.mrsim2d.core.geometry.Terrain">Terrain</abbr></code>; built from `io.github.ericmedvet.mrsim2d.buildable.builders.Terrains.downhill()` by mrsim2d-buildable:1.0.3-SNAPSHOT:2024-02-26T23:35:43Z

### Builder `sim.terrain.flat()`

`s.t.flat(w; h; borderW; borderH)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `w` | d | `500.0` | <code><abbr title="java.lang.Double">Double</abbr></code> |
| `h` | d | `25.0` | <code><abbr title="java.lang.Double">Double</abbr></code> |
| `borderW` | d | `10.0` | <code><abbr title="java.lang.Double">Double</abbr></code> |
| `borderH` | d | `100.0` | <code><abbr title="java.lang.Double">Double</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.mrsim2d.core.geometry.Terrain">Terrain</abbr></code>; built from `io.github.ericmedvet.mrsim2d.buildable.builders.Terrains.flat()` by mrsim2d-buildable:1.0.3-SNAPSHOT:2024-02-26T23:35:43Z

### Builder `sim.terrain.hilly()`

`s.t.hilly(w; h; borderW; borderH; chunkW; chunkH; seed)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `w` | d | `500.0` | <code><abbr title="java.lang.Double">Double</abbr></code> |
| `h` | d | `25.0` | <code><abbr title="java.lang.Double">Double</abbr></code> |
| `borderW` | d | `10.0` | <code><abbr title="java.lang.Double">Double</abbr></code> |
| `borderH` | d | `100.0` | <code><abbr title="java.lang.Double">Double</abbr></code> |
| `chunkW` | d | `5.0` | <code><abbr title="java.lang.Double">Double</abbr></code> |
| `chunkH` | d | `0.75` | <code><abbr title="java.lang.Double">Double</abbr></code> |
| `seed` | i | `1` | <code><abbr title="java.lang.Integer">Integer</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.mrsim2d.core.geometry.Terrain">Terrain</abbr></code>; built from `io.github.ericmedvet.mrsim2d.buildable.builders.Terrains.hilly()` by mrsim2d-buildable:1.0.3-SNAPSHOT:2024-02-26T23:35:43Z

### Builder `sim.terrain.steppy()`

`s.t.steppy(w; h; borderW; borderH; chunkW; chunkH; seed)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `w` | d | `500.0` | <code><abbr title="java.lang.Double">Double</abbr></code> |
| `h` | d | `25.0` | <code><abbr title="java.lang.Double">Double</abbr></code> |
| `borderW` | d | `10.0` | <code><abbr title="java.lang.Double">Double</abbr></code> |
| `borderH` | d | `100.0` | <code><abbr title="java.lang.Double">Double</abbr></code> |
| `chunkW` | d | `5.0` | <code><abbr title="java.lang.Double">Double</abbr></code> |
| `chunkH` | d | `0.75` | <code><abbr title="java.lang.Double">Double</abbr></code> |
| `seed` | i | `1` | <code><abbr title="java.lang.Integer">Integer</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.mrsim2d.core.geometry.Terrain">Terrain</abbr></code>; built from `io.github.ericmedvet.mrsim2d.buildable.builders.Terrains.steppy()` by mrsim2d-buildable:1.0.3-SNAPSHOT:2024-02-26T23:35:43Z

### Builder `sim.terrain.uphill()`

`s.t.uphill(w; h; borderW; borderH; a)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `w` | d | `500.0` | <code><abbr title="java.lang.Double">Double</abbr></code> |
| `h` | d | `25.0` | <code><abbr title="java.lang.Double">Double</abbr></code> |
| `borderW` | d | `10.0` | <code><abbr title="java.lang.Double">Double</abbr></code> |
| `borderH` | d | `100.0` | <code><abbr title="java.lang.Double">Double</abbr></code> |
| `a` | d | `10.0` | <code><abbr title="java.lang.Double">Double</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.mrsim2d.core.geometry.Terrain">Terrain</abbr></code>; built from `io.github.ericmedvet.mrsim2d.buildable.builders.Terrains.uphill()` by mrsim2d-buildable:1.0.3-SNAPSHOT:2024-02-26T23:35:43Z

