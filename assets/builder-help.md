## Package `dynamicalSystem`

Aliases: `ds`, `dynSys`, `dynamicalSystem`

### Builder `dynamicalSystem.defaultRG()`

`ds.defaultRG(seed)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `seed` | i | `0` | <code>int</code> |

Produces <code><abbr title="java.util.random.RandomGenerator">RandomGenerator</abbr></code>; built from `io.github.ericmedvet.jsdynsym.buildable.builders.Misc.defaultRG()` by jsdynsym-buildable:0.10.5:2023-10-20T07:16:17Z

### Builder `dynamicalSystem.grid()`

`ds.grid(w; h; items)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `w` | i |  | <code>int</code> |
| `h` | i |  | <code>int</code> |
| `items` | npm[] | `[]` | <code><abbr title="java.util.List">List</abbr>&lt;T&gt;</code> |

Produces <code><abbr title="io.github.ericmedvet.jsdynsym.grid.Grid">Grid</abbr>&lt;T&gt;</code>; built from `io.github.ericmedvet.jsdynsym.buildable.builders.Misc.grid()` by jsdynsym-buildable:0.10.5:2023-10-20T07:16:17Z

### Builder `dynamicalSystem.range()`

`ds.range(min; max)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `min` | d |  | <code>double</code> |
| `max` | d |  | <code>double</code> |

Produces <code><abbr title="io.github.ericmedvet.jsdynsym.core.DoubleRange">DoubleRange</abbr></code>; built from `io.github.ericmedvet.jsdynsym.buildable.builders.Misc.range()` by jsdynsym-buildable:0.10.5:2023-10-20T07:16:17Z

## Package `dynamicalSystem.num`

Aliases: `ds.num`, `dynSys.num`, `dynamicalSystem.num`

### Builder `dynamicalSystem.num.drn()`

`ds.num.drn(timeRange; innerNeuronsRatio; activationFunction; threshold; timeResolution)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `timeRange` | npm | `ds.range(min = 0; max = 1)` | <code><abbr title="io.github.ericmedvet.jsdynsym.core.DoubleRange">DoubleRange</abbr></code> |
| `innerNeuronsRatio` | d | `1.0` | <code>double</code> |
| `activationFunction` | e | `TANH` | <code><abbr title="io.github.ericmedvet.jsdynsym.core.numerical.ann.MultiLayerPerceptron$ActivationFunction">MultiLayerPerceptron$ActivationFunction</abbr></code> |
| `threshold` | d | `0.1` | <code>double</code> |
| `timeResolution` | d | `0.16666` | <code>double</code> |

Produces <code><abbr title="io.github.ericmedvet.jsdynsym.buildable.builders.NumericalDynamicalSystems$Builder">NumericalDynamicalSystems$Builder</abbr>&lt;<abbr title="io.github.ericmedvet.jsdynsym.core.numerical.ann.DelayedRecurrentNetwork">DelayedRecurrentNetwork</abbr>, <abbr title="io.github.ericmedvet.jsdynsym.core.numerical.ann.DelayedRecurrentNetwork$State">DelayedRecurrentNetwork$State</abbr>&gt;</code>; built from `io.github.ericmedvet.jsdynsym.buildable.builders.NumericalDynamicalSystems.drn()` by jsdynsym-buildable:0.10.5:2023-10-20T07:16:17Z

### Builder `dynamicalSystem.num.enhanced()`

`ds.num.enhanced(windowT; inner; types)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `windowT` | d |  | <code>double</code> |
| `inner` | npm |  | <code><abbr title="io.github.ericmedvet.jsdynsym.buildable.builders.NumericalDynamicalSystems$Builder">NumericalDynamicalSystems$Builder</abbr>&lt;? extends <abbr title="io.github.ericmedvet.jsdynsym.core.numerical.NumericalDynamicalSystem">NumericalDynamicalSystem</abbr>&lt;S&gt;, S&gt;</code> |
| `types` | e[] | `[CURRENT, TREND, AVG]` | <code><abbr title="java.util.List">List</abbr>&lt;<abbr title="io.github.ericmedvet.jsdynsym.core.numerical.EnhancedInput$Type">EnhancedInput$Type</abbr>&gt;</code> |

Produces <code><abbr title="io.github.ericmedvet.jsdynsym.buildable.builders.NumericalDynamicalSystems$Builder">NumericalDynamicalSystems$Builder</abbr>&lt;<abbr title="io.github.ericmedvet.jsdynsym.core.numerical.EnhancedInput">EnhancedInput</abbr>&lt;S&gt;, S&gt;</code>; built from `io.github.ericmedvet.jsdynsym.buildable.builders.NumericalDynamicalSystems.enhanced()` by jsdynsym-buildable:0.10.5:2023-10-20T07:16:17Z

### Builder `dynamicalSystem.num.inStepped()`

`ds.num.inStepped(stepT; inner)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `stepT` | d | `1.0` | <code>double</code> |
| `inner` | npm |  | <code><abbr title="io.github.ericmedvet.jsdynsym.buildable.builders.NumericalDynamicalSystems$Builder">NumericalDynamicalSystems$Builder</abbr>&lt;? extends <abbr title="io.github.ericmedvet.jsdynsym.core.numerical.NumericalDynamicalSystem">NumericalDynamicalSystem</abbr>&lt;S&gt;, S&gt;</code> |

Produces <code><abbr title="io.github.ericmedvet.jsdynsym.buildable.builders.NumericalDynamicalSystems$Builder">NumericalDynamicalSystems$Builder</abbr>&lt;<abbr title="io.github.ericmedvet.jsdynsym.core.numerical.NumericalDynamicalSystem">NumericalDynamicalSystem</abbr>&lt;<abbr title="io.github.ericmedvet.jsdynsym.core.composed.Stepped$State">Stepped$State</abbr>&lt;S&gt;&gt;, <abbr title="io.github.ericmedvet.jsdynsym.core.composed.Stepped$State">Stepped$State</abbr>&lt;S&gt;&gt;</code>; built from `io.github.ericmedvet.jsdynsym.buildable.builders.NumericalDynamicalSystems.inStepped()` by jsdynsym-buildable:0.10.5:2023-10-20T07:16:17Z

### Builder `dynamicalSystem.num.mlp()`

`ds.num.mlp(innerLayerRatio; nOfInnerLayers; activationFunction)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `innerLayerRatio` | d | `0.65` | <code>double</code> |
| `nOfInnerLayers` | i | `1` | <code>int</code> |
| `activationFunction` | e | `TANH` | <code><abbr title="io.github.ericmedvet.jsdynsym.core.numerical.ann.MultiLayerPerceptron$ActivationFunction">MultiLayerPerceptron$ActivationFunction</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.jsdynsym.buildable.builders.NumericalDynamicalSystems$Builder">NumericalDynamicalSystems$Builder</abbr>&lt;<abbr title="io.github.ericmedvet.jsdynsym.core.numerical.ann.MultiLayerPerceptron">MultiLayerPerceptron</abbr>, <abbr title="io.github.ericmedvet.jsdynsym.core.StatelessSystem$State">StatelessSystem$State</abbr>&gt;</code>; built from `io.github.ericmedvet.jsdynsym.buildable.builders.NumericalDynamicalSystems.mlp()` by jsdynsym-buildable:0.10.5:2023-10-20T07:16:17Z

### Builder `dynamicalSystem.num.noised()`

`ds.num.noised(inputSigma; outputSigma; randomGenerator; inner)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `inputSigma` | d | `0.0` | <code>double</code> |
| `outputSigma` | d | `0.0` | <code>double</code> |
| `randomGenerator` | npm | `ds.defaultRG()` | <code><abbr title="java.util.random.RandomGenerator">RandomGenerator</abbr></code> |
| `inner` | npm |  | <code><abbr title="io.github.ericmedvet.jsdynsym.buildable.builders.NumericalDynamicalSystems$Builder">NumericalDynamicalSystems$Builder</abbr>&lt;? extends <abbr title="io.github.ericmedvet.jsdynsym.core.numerical.NumericalDynamicalSystem">NumericalDynamicalSystem</abbr>&lt;S&gt;, S&gt;</code> |

Produces <code><abbr title="io.github.ericmedvet.jsdynsym.buildable.builders.NumericalDynamicalSystems$Builder">NumericalDynamicalSystems$Builder</abbr>&lt;<abbr title="io.github.ericmedvet.jsdynsym.core.numerical.Noised">Noised</abbr>&lt;S&gt;, S&gt;</code>; built from `io.github.ericmedvet.jsdynsym.buildable.builders.NumericalDynamicalSystems.noised()` by jsdynsym-buildable:0.10.5:2023-10-20T07:16:17Z

### Builder `dynamicalSystem.num.outStepped()`

`ds.num.outStepped(stepT; inner)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `stepT` | d | `1.0` | <code>double</code> |
| `inner` | npm |  | <code><abbr title="io.github.ericmedvet.jsdynsym.buildable.builders.NumericalDynamicalSystems$Builder">NumericalDynamicalSystems$Builder</abbr>&lt;? extends <abbr title="io.github.ericmedvet.jsdynsym.core.numerical.NumericalDynamicalSystem">NumericalDynamicalSystem</abbr>&lt;S&gt;, S&gt;</code> |

Produces <code><abbr title="io.github.ericmedvet.jsdynsym.buildable.builders.NumericalDynamicalSystems$Builder">NumericalDynamicalSystems$Builder</abbr>&lt;<abbr title="io.github.ericmedvet.jsdynsym.core.numerical.NumericalDynamicalSystem">NumericalDynamicalSystem</abbr>&lt;<abbr title="io.github.ericmedvet.jsdynsym.core.composed.Stepped$State">Stepped$State</abbr>&lt;S&gt;&gt;, <abbr title="io.github.ericmedvet.jsdynsym.core.composed.Stepped$State">Stepped$State</abbr>&lt;S&gt;&gt;</code>; built from `io.github.ericmedvet.jsdynsym.buildable.builders.NumericalDynamicalSystems.outStepped()` by jsdynsym-buildable:0.10.5:2023-10-20T07:16:17Z

### Builder `dynamicalSystem.num.sin()`

`ds.num.sin(p; f; a; b)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `p` | npm | `ds.range(min = -1.57; max = 1.57)` | <code><abbr title="io.github.ericmedvet.jsdynsym.core.DoubleRange">DoubleRange</abbr></code> |
| `f` | npm | `ds.range(min = 0; max = 1)` | <code><abbr title="io.github.ericmedvet.jsdynsym.core.DoubleRange">DoubleRange</abbr></code> |
| `a` | npm | `ds.range(min = 0; max = 1)` | <code><abbr title="io.github.ericmedvet.jsdynsym.core.DoubleRange">DoubleRange</abbr></code> |
| `b` | npm | `ds.range(min = -0.5; max = 0.5)` | <code><abbr title="io.github.ericmedvet.jsdynsym.core.DoubleRange">DoubleRange</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.jsdynsym.buildable.builders.NumericalDynamicalSystems$Builder">NumericalDynamicalSystems$Builder</abbr>&lt;<abbr title="io.github.ericmedvet.jsdynsym.core.numerical.Sinusoidal">Sinusoidal</abbr>, <abbr title="io.github.ericmedvet.jsdynsym.core.StatelessSystem$State">StatelessSystem$State</abbr>&gt;</code>; built from `io.github.ericmedvet.jsdynsym.buildable.builders.NumericalDynamicalSystems.sin()` by jsdynsym-buildable:0.10.5:2023-10-20T07:16:17Z

### Builder `dynamicalSystem.num.stepped()`

`ds.num.stepped(stepT; inner)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `stepT` | d | `1.0` | <code>double</code> |
| `inner` | npm |  | <code><abbr title="io.github.ericmedvet.jsdynsym.buildable.builders.NumericalDynamicalSystems$Builder">NumericalDynamicalSystems$Builder</abbr>&lt;? extends <abbr title="io.github.ericmedvet.jsdynsym.core.numerical.NumericalDynamicalSystem">NumericalDynamicalSystem</abbr>&lt;S&gt;, S&gt;</code> |

Produces <code><abbr title="io.github.ericmedvet.jsdynsym.buildable.builders.NumericalDynamicalSystems$Builder">NumericalDynamicalSystems$Builder</abbr>&lt;<abbr title="io.github.ericmedvet.jsdynsym.core.numerical.NumericalDynamicalSystem">NumericalDynamicalSystem</abbr>&lt;<abbr title="io.github.ericmedvet.jsdynsym.core.composed.Stepped$State">Stepped$State</abbr>&lt;S&gt;&gt;, <abbr title="io.github.ericmedvet.jsdynsym.core.composed.Stepped$State">Stepped$State</abbr>&lt;S&gt;&gt;</code>; built from `io.github.ericmedvet.jsdynsym.buildable.builders.NumericalDynamicalSystems.stepped()` by jsdynsym-buildable:0.10.5:2023-10-20T07:16:17Z

## Package `ea`

### Builder `ea.experiment()`

`ea.experiment(name; runs; listeners)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `name` | s | `` | <code><abbr title="java.lang.String">String</abbr></code> |
| `runs` | npm[] | `[]` | <code><abbr title="java.util.List">List</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.experimenter.Run">Run</abbr>&lt;?, ?, ?, ?&gt;&gt;</code> |
| `listeners` | npm[] | `[ea.l.console()]` | <code><abbr title="java.util.List">List</abbr>&lt;<abbr title="java.util.function.BiFunction">BiFunction</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.experimenter.Experiment">Experiment</abbr>, <abbr title="java.util.concurrent.ExecutorService">ExecutorService</abbr>, <abbr title="io.github.ericmedvet.jgea.core.listener.ListenerFactory">ListenerFactory</abbr>&lt;? super <abbr title="io.github.ericmedvet.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr>&lt;?, ?, ?&gt;, <abbr title="io.github.ericmedvet.jgea.experimenter.Run">Run</abbr>&lt;?, ?, ?, ?&gt;&gt;&gt;&gt;</code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.experimenter.Experiment">Experiment</abbr></code>; built from `io.github.ericmedvet.jgea.experimenter.Experiment()` by jgea-experimenter:2.4.10:2023-10-20T07:25:19Z

### Builder `ea.run()`

`ea.run(name; solver; problem; randomGenerator)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `name` | s | `` | <code><abbr title="java.lang.String">String</abbr></code> |
| `solver` | npm |  | <code><abbr title="java.util.function.Function">Function</abbr>&lt;S, ? extends <abbr title="io.github.ericmedvet.jgea.core.solver.AbstractPopulationBasedIterativeSolver">AbstractPopulationBasedIterativeSolver</abbr>&lt;? extends <abbr title="io.github.ericmedvet.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr>&lt;G, S, Q&gt;, P, G, S, Q&gt;&gt;</code> |
| `problem` | npm |  | <code>P</code> |
| `randomGenerator` | npm |  | <code><abbr title="java.util.random.RandomGenerator">RandomGenerator</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.experimenter.Run">Run</abbr></code>; built from `io.github.ericmedvet.jgea.experimenter.Run()` by jgea-experimenter:2.4.10:2023-10-20T07:25:19Z

### Builder `ea.runOutcome()`

`ea.runOutcome(index; run; serializedGenotypes)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `index` | s |  | <code><abbr title="java.lang.String">String</abbr></code> |
| `run` | npm |  | <code><abbr title="io.github.ericmedvet.jgea.experimenter.Run">Run</abbr>&lt;?, ?, ?, ?&gt;</code> |
| `serializedGenotypes` | s[] | `[]` | <code><abbr title="java.util.List">List</abbr>&lt;<abbr title="java.lang.String">String</abbr>&gt;</code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.experimenter.RunOutcome">RunOutcome</abbr></code>; built from `io.github.ericmedvet.jgea.experimenter.RunOutcome()` by jgea-experimenter:2.4.10:2023-10-20T07:25:19Z

## Package `ea.functions`

Aliases: `ea.functions`, `ea.s`

### Builder `ea.functions.fromBase64()`

`ea.s.fromBase64()`

Produces <code><abbr title="java.util.function.Function">Function</abbr>&lt;<abbr title="java.lang.String">String</abbr>, <abbr title="java.lang.Object">Object</abbr>&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.Functions.fromBase64()` by jgea-experimenter:2.4.10:2023-10-20T07:25:19Z

### Builder `ea.functions.identity()`

`ea.s.identity()`

Produces <code><abbr title="java.util.function.Function">Function</abbr>&lt;T, T&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.Functions.identity()` by jgea-experimenter:2.4.10:2023-10-20T07:25:19Z

## Package `ea.grammar`

### Builder `ea.grammar.gridBundled()`

`ea.grammar.gridBundled(name)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `name` | s |  | <code><abbr title="java.lang.String">String</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.core.representation.grammar.grid.GridGrammar">GridGrammar</abbr>&lt;<abbr title="java.lang.Character">Character</abbr>&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.Grammars.gridBundled()` by jgea-experimenter:2.4.10:2023-10-20T07:25:19Z

## Package `ea.listener`

Aliases: `ea.l`, `ea.listener`

### Builder `ea.listener.allCsv()`

`ea.l.allCsv(filePath; defaultFunctions; functions; individualFunctions; runKeys; deferred; onlyLast)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `filePath` | s |  | <code><abbr title="java.lang.String">String</abbr></code> |
| `defaultFunctions` | npm[] | `[ea.nf.iterations()]` | <code><abbr title="java.util.List">List</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;? super <abbr title="io.github.ericmedvet.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr>&lt;G, S, Q&gt;, ?&gt;&gt;</code> |
| `functions` | npm[] | `[]` | <code><abbr title="java.util.List">List</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;? super <abbr title="io.github.ericmedvet.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr>&lt;G, S, Q&gt;, ?&gt;&gt;</code> |
| `individualFunctions` | npm[] | `[]` | <code><abbr title="java.util.List">List</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;? super <abbr title="io.github.ericmedvet.jgea.core.solver.Individual">Individual</abbr>&lt;G, S, Q&gt;, ?&gt;&gt;</code> |
| `runKeys` | s[] | `[]` | <code><abbr title="java.util.List">List</abbr>&lt;<abbr title="java.lang.String">String</abbr>&gt;</code> |
| `deferred` | b | `false` | <code>boolean</code> |
| `onlyLast` | b | `false` | <code>boolean</code> |

Produces <code><abbr title="java.util.function.BiFunction">BiFunction</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.experimenter.Experiment">Experiment</abbr>, <abbr title="java.util.concurrent.ExecutorService">ExecutorService</abbr>, <abbr title="io.github.ericmedvet.jgea.core.listener.ListenerFactory">ListenerFactory</abbr>&lt;? super <abbr title="io.github.ericmedvet.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr>&lt;G, S, Q&gt;, <abbr title="io.github.ericmedvet.jgea.experimenter.Run">Run</abbr>&lt;?, G, S, Q&gt;&gt;&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.Listeners.allCsv()` by jgea-experimenter:2.4.10:2023-10-20T07:25:19Z

### Builder `ea.listener.bestCsv()`

`ea.l.bestCsv(filePath; defaultFunctions; functions; runKeys; deferred; onlyLast)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `filePath` | s |  | <code><abbr title="java.lang.String">String</abbr></code> |
| `defaultFunctions` | npm[] | `[ea.nf.iterations(), ea.nf.evals(), ea.nf.births(), ea.nf.elapsed(), ea.nf.size(f = ea.nf.all()), ea.nf.size(f = ea.nf.firsts()), ea.nf.size(f = ea.nf.lasts()), ea.nf.uniqueness(collection = ea.nf.each(collection = ea.nf.all(); map = ea.nf.genotype())), ea.nf.uniqueness(collection = ea.nf.each(collection = ea.nf.all(); map = ea.nf.solution())), ea.nf.uniqueness(collection = ea.nf.each(collection = ea.nf.all(); map = ea.nf.fitness()))]` | <code><abbr title="java.util.List">List</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;? super <abbr title="io.github.ericmedvet.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr>&lt;G, S, Q&gt;, ?&gt;&gt;</code> |
| `functions` | npm[] | `[]` | <code><abbr title="java.util.List">List</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;? super <abbr title="io.github.ericmedvet.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr>&lt;G, S, Q&gt;, ?&gt;&gt;</code> |
| `runKeys` | s[] | `[]` | <code><abbr title="java.util.List">List</abbr>&lt;<abbr title="java.lang.String">String</abbr>&gt;</code> |
| `deferred` | b | `false` | <code>boolean</code> |
| `onlyLast` | b | `false` | <code>boolean</code> |

Produces <code><abbr title="java.util.function.BiFunction">BiFunction</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.experimenter.Experiment">Experiment</abbr>, <abbr title="java.util.concurrent.ExecutorService">ExecutorService</abbr>, <abbr title="io.github.ericmedvet.jgea.core.listener.ListenerFactory">ListenerFactory</abbr>&lt;? super <abbr title="io.github.ericmedvet.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr>&lt;G, S, Q&gt;, <abbr title="io.github.ericmedvet.jgea.experimenter.Run">Run</abbr>&lt;?, G, S, Q&gt;&gt;&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.Listeners.bestCsv()` by jgea-experimenter:2.4.10:2023-10-20T07:25:19Z

### Builder `ea.listener.console()`

`ea.l.console(defaultFunctions; functions; runKeys; deferred; onlyLast)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `defaultFunctions` | npm[] | `[ea.nf.iterations(), ea.nf.evals(), ea.nf.births(), ea.nf.elapsed(), ea.nf.size(f = ea.nf.all()), ea.nf.size(f = ea.nf.firsts()), ea.nf.size(f = ea.nf.lasts()), ea.nf.uniqueness(collection = ea.nf.each(collection = ea.nf.all(); map = ea.nf.genotype())), ea.nf.uniqueness(collection = ea.nf.each(collection = ea.nf.all(); map = ea.nf.solution())), ea.nf.uniqueness(collection = ea.nf.each(collection = ea.nf.all(); map = ea.nf.fitness()))]` | <code><abbr title="java.util.List">List</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;? super <abbr title="io.github.ericmedvet.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr>&lt;G, S, Q&gt;, ?&gt;&gt;</code> |
| `functions` | npm[] | `[]` | <code><abbr title="java.util.List">List</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;? super <abbr title="io.github.ericmedvet.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr>&lt;G, S, Q&gt;, ?&gt;&gt;</code> |
| `runKeys` | s[] | `[]` | <code><abbr title="java.util.List">List</abbr>&lt;<abbr title="java.lang.String">String</abbr>&gt;</code> |
| `deferred` | b | `false` | <code>boolean</code> |
| `onlyLast` | b | `false` | <code>boolean</code> |

Produces <code><abbr title="java.util.function.BiFunction">BiFunction</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.experimenter.Experiment">Experiment</abbr>, <abbr title="java.util.concurrent.ExecutorService">ExecutorService</abbr>, <abbr title="io.github.ericmedvet.jgea.core.listener.ListenerFactory">ListenerFactory</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr>&lt;G, S, Q&gt;, <abbr title="io.github.ericmedvet.jgea.experimenter.Run">Run</abbr>&lt;?, G, S, Q&gt;&gt;&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.Listeners.console()` by jgea-experimenter:2.4.10:2023-10-20T07:25:19Z

### Builder `ea.listener.net()`

`ea.l.net(defaultFunctions; functions; defaultPlots; plots; runKeys; deferred; onlyLast; serverAddress; serverPort; serverKeyFilePath; pollInterval)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `defaultFunctions` | npm[] | `[ea.nf.iterations(), ea.nf.evals(), ea.nf.births(), ea.nf.elapsed(), ea.nf.size(f = ea.nf.all()), ea.nf.size(f = ea.nf.firsts()), ea.nf.size(f = ea.nf.lasts()), ea.nf.uniqueness(collection = ea.nf.each(collection = ea.nf.all(); map = ea.nf.genotype())), ea.nf.uniqueness(collection = ea.nf.each(collection = ea.nf.all(); map = ea.nf.solution())), ea.nf.uniqueness(collection = ea.nf.each(collection = ea.nf.all(); map = ea.nf.fitness()))]` | <code><abbr title="java.util.List">List</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;? super <abbr title="io.github.ericmedvet.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr>&lt;G, S, Q&gt;, ?&gt;&gt;</code> |
| `functions` | npm[] | `[]` | <code><abbr title="java.util.List">List</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;? super <abbr title="io.github.ericmedvet.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr>&lt;G, S, Q&gt;, ?&gt;&gt;</code> |
| `defaultPlots` | npm[] | `[]` | <code><abbr title="java.util.List">List</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.listener.PlotTableBuilder">PlotTableBuilder</abbr>&lt;? super <abbr title="io.github.ericmedvet.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr>&lt;G, S, Q&gt;&gt;&gt;</code> |
| `plots` | npm[] | `[]` | <code><abbr title="java.util.List">List</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.listener.PlotTableBuilder">PlotTableBuilder</abbr>&lt;? super <abbr title="io.github.ericmedvet.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr>&lt;G, S, Q&gt;&gt;&gt;</code> |
| `runKeys` | s[] | `[]` | <code><abbr title="java.util.List">List</abbr>&lt;<abbr title="java.lang.String">String</abbr>&gt;</code> |
| `deferred` | b | `false` | <code>boolean</code> |
| `onlyLast` | b | `false` | <code>boolean</code> |
| `serverAddress` | s | `127.0.0.1` | <code><abbr title="java.lang.String">String</abbr></code> |
| `serverPort` | i | `10979` | <code>int</code> |
| `serverKeyFilePath` | s |  | <code><abbr title="java.lang.String">String</abbr></code> |
| `pollInterval` | d | `2.0` | <code>double</code> |

Produces <code><abbr title="java.util.function.BiFunction">BiFunction</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.experimenter.Experiment">Experiment</abbr>, <abbr title="java.util.concurrent.ExecutorService">ExecutorService</abbr>, <abbr title="io.github.ericmedvet.jgea.core.listener.ListenerFactory">ListenerFactory</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr>&lt;G, S, Q&gt;, <abbr title="io.github.ericmedvet.jgea.experimenter.Run">Run</abbr>&lt;?, G, S, Q&gt;&gt;&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.Listeners.net()` by jgea-experimenter:2.4.10:2023-10-20T07:25:19Z

### Builder `ea.listener.outcomeSaver()`

`ea.l.outcomeSaver(filePathTemplate; deferred)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `filePathTemplate` | s | `run-outcome-{index:%04d}.txt` | <code><abbr title="java.lang.String">String</abbr></code> |
| `deferred` | b | `true` | <code>boolean</code> |

Produces <code><abbr title="java.util.function.BiFunction">BiFunction</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.experimenter.Experiment">Experiment</abbr>, <abbr title="java.util.concurrent.ExecutorService">ExecutorService</abbr>, <abbr title="io.github.ericmedvet.jgea.core.listener.ListenerFactory">ListenerFactory</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr>&lt;G, S, Q&gt;, <abbr title="io.github.ericmedvet.jgea.experimenter.Run">Run</abbr>&lt;?, G, S, Q&gt;&gt;&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.Listeners.outcomeSaver()` by jgea-experimenter:2.4.10:2023-10-20T07:25:19Z

### Builder `ea.listener.telegram()`

`ea.l.telegram(chatId; botIdFilePath; defaultPlots; plots; accumulators; runKeys; deferred; onlyLast)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `chatId` | s |  | <code><abbr title="java.lang.String">String</abbr></code> |
| `botIdFilePath` | s |  | <code><abbr title="java.lang.String">String</abbr></code> |
| `defaultPlots` | npm[] | `[ea.plot.elapsed()]` | <code><abbr title="java.util.List">List</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.listener.PlotTableBuilder">PlotTableBuilder</abbr>&lt;? super <abbr title="io.github.ericmedvet.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr>&lt;G, S, Q&gt;&gt;&gt;</code> |
| `plots` | npm[] | `[]` | <code><abbr title="java.util.List">List</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.listener.PlotTableBuilder">PlotTableBuilder</abbr>&lt;? super <abbr title="io.github.ericmedvet.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr>&lt;G, S, Q&gt;&gt;&gt;</code> |
| `accumulators` | npm[] | `[]` | <code><abbr title="java.util.List">List</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.listener.AccumulatorFactory">AccumulatorFactory</abbr>&lt;? super <abbr title="io.github.ericmedvet.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr>&lt;G, S, Q&gt;, ?, <abbr title="io.github.ericmedvet.jgea.experimenter.Run">Run</abbr>&lt;?, G, S, Q&gt;&gt;&gt;</code> |
| `runKeys` | s[] | `[]` | <code><abbr title="java.util.List">List</abbr>&lt;<abbr title="java.lang.String">String</abbr>&gt;</code> |
| `deferred` | b | `true` | <code>boolean</code> |
| `onlyLast` | b | `false` | <code>boolean</code> |

Produces <code><abbr title="java.util.function.BiFunction">BiFunction</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.experimenter.Experiment">Experiment</abbr>, <abbr title="java.util.concurrent.ExecutorService">ExecutorService</abbr>, <abbr title="io.github.ericmedvet.jgea.core.listener.ListenerFactory">ListenerFactory</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr>&lt;G, S, Q&gt;, <abbr title="io.github.ericmedvet.jgea.experimenter.Run">Run</abbr>&lt;?, G, S, Q&gt;&gt;&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.Listeners.telegram()` by jgea-experimenter:2.4.10:2023-10-20T07:25:19Z

### Builder `ea.listener.tui()`

`ea.l.tui(defaultFunctions; functions; runKeys; defaultPlots; plots; deferred; onlyLast)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `defaultFunctions` | npm[] | `[ea.nf.iterations(), ea.nf.evals(), ea.nf.births(), ea.nf.elapsed(), ea.nf.size(f = ea.nf.all()), ea.nf.size(f = ea.nf.firsts()), ea.nf.size(f = ea.nf.lasts()), ea.nf.uniqueness(collection = ea.nf.each(collection = ea.nf.all(); map = ea.nf.genotype())), ea.nf.uniqueness(collection = ea.nf.each(collection = ea.nf.all(); map = ea.nf.solution())), ea.nf.uniqueness(collection = ea.nf.each(collection = ea.nf.all(); map = ea.nf.fitness()))]` | <code><abbr title="java.util.List">List</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;? super <abbr title="io.github.ericmedvet.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr>&lt;G, S, Q&gt;, ?&gt;&gt;</code> |
| `functions` | npm[] | `[]` | <code><abbr title="java.util.List">List</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;? super <abbr title="io.github.ericmedvet.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr>&lt;G, S, Q&gt;, ?&gt;&gt;</code> |
| `runKeys` | s[] | `[]` | <code><abbr title="java.util.List">List</abbr>&lt;<abbr title="java.lang.String">String</abbr>&gt;</code> |
| `defaultPlots` | npm[] | `[ea.plot.elapsed()]` | <code><abbr title="java.util.List">List</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.listener.PlotTableBuilder">PlotTableBuilder</abbr>&lt;? super <abbr title="io.github.ericmedvet.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr>&lt;G, S, Q&gt;&gt;&gt;</code> |
| `plots` | npm[] | `[]` | <code><abbr title="java.util.List">List</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.listener.PlotTableBuilder">PlotTableBuilder</abbr>&lt;? super <abbr title="io.github.ericmedvet.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr>&lt;G, S, Q&gt;&gt;&gt;</code> |
| `deferred` | b | `false` | <code>boolean</code> |
| `onlyLast` | b | `false` | <code>boolean</code> |

Produces <code><abbr title="java.util.function.BiFunction">BiFunction</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.experimenter.Experiment">Experiment</abbr>, <abbr title="java.util.concurrent.ExecutorService">ExecutorService</abbr>, <abbr title="io.github.ericmedvet.jgea.core.listener.ListenerFactory">ListenerFactory</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr>&lt;G, S, Q&gt;, <abbr title="io.github.ericmedvet.jgea.experimenter.Run">Run</abbr>&lt;?, G, S, Q&gt;&gt;&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.Listeners.tui()` by jgea-experimenter:2.4.10:2023-10-20T07:25:19Z

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

Produces <code><abbr title="io.github.ericmedvet.jgea.experimenter.InvertibleMapper">InvertibleMapper</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.representation.sequence.bit.BitString">BitString</abbr>, <abbr title="io.github.ericmedvet.jsdynsym.grid.Grid">Grid</abbr>&lt;T&gt;&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.Mappers.bitStringToGrammarGrid()` by jgea-experimenter:2.4.10:2023-10-20T07:25:19Z

### Builder `ea.mapper.compose()`

`ea.m.compose(first; second)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `first` | npm |  | <code><abbr title="io.github.ericmedvet.jgea.experimenter.InvertibleMapper">InvertibleMapper</abbr>&lt;A, B&gt;</code> |
| `second` | npm |  | <code><abbr title="io.github.ericmedvet.jgea.experimenter.InvertibleMapper">InvertibleMapper</abbr>&lt;B, C&gt;</code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.experimenter.InvertibleMapper">InvertibleMapper</abbr>&lt;A, C&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.Mappers.compose()` by jgea-experimenter:2.4.10:2023-10-20T07:25:19Z

### Builder `ea.mapper.doubleStringToGrammarGrid()`

`ea.m.doubleStringToGrammarGrid(grammar; l; overwrite; criteria)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `grammar` | npm |  | <code><abbr title="io.github.ericmedvet.jgea.core.representation.grammar.grid.GridGrammar">GridGrammar</abbr>&lt;T&gt;</code> |
| `l` | i | `256` | <code>int</code> |
| `overwrite` | b | `false` | <code>boolean</code> |
| `criteria` | e[] | `[LEAST_RECENT, LOWEST_Y, LOWEST_X]` | <code><abbr title="java.util.List">List</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.representation.grammar.grid.StandardGridDeveloper$SortingCriterion">StandardGridDeveloper$SortingCriterion</abbr>&gt;</code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.experimenter.InvertibleMapper">InvertibleMapper</abbr>&lt;<abbr title="java.util.List">List</abbr>&lt;<abbr title="java.lang.Double">Double</abbr>&gt;, <abbr title="io.github.ericmedvet.jsdynsym.grid.Grid">Grid</abbr>&lt;T&gt;&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.Mappers.doubleStringToGrammarGrid()` by jgea-experimenter:2.4.10:2023-10-20T07:25:19Z

### Builder `ea.mapper.fGraphToMrf()`

`ea.m.fGraphToMrf(postOperator)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `postOperator` | e | `IDENTITY` | <code><abbr title="io.github.ericmedvet.jsdynsym.core.numerical.ann.MultiLayerPerceptron$ActivationFunction">MultiLayerPerceptron$ActivationFunction</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.experimenter.InvertibleMapper">InvertibleMapper</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.representation.graph.Graph">Graph</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.representation.graph.Node">Node</abbr>, <abbr title="java.lang.Double">Double</abbr>&gt;, <abbr title="io.github.ericmedvet.jgea.core.representation.NamedMultivariateRealFunction">NamedMultivariateRealFunction</abbr>&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.Mappers.fGraphToMrf()` by jgea-experimenter:2.4.10:2023-10-20T07:25:19Z

### Builder `ea.mapper.identity()`

`ea.m.identity()`

Produces <code><abbr title="io.github.ericmedvet.jgea.experimenter.InvertibleMapper">InvertibleMapper</abbr>&lt;X, X&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.Mappers.identity()` by jgea-experimenter:2.4.10:2023-10-20T07:25:19Z

### Builder `ea.mapper.intStringToGrammarGrid()`

`ea.m.intStringToGrammarGrid(grammar; upperBound; l; overwrite; criteria)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `grammar` | npm |  | <code><abbr title="io.github.ericmedvet.jgea.core.representation.grammar.grid.GridGrammar">GridGrammar</abbr>&lt;T&gt;</code> |
| `upperBound` | i | `16` | <code>int</code> |
| `l` | i | `256` | <code>int</code> |
| `overwrite` | b | `false` | <code>boolean</code> |
| `criteria` | e[] | `[LEAST_RECENT, LOWEST_Y, LOWEST_X]` | <code><abbr title="java.util.List">List</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.representation.grammar.grid.StandardGridDeveloper$SortingCriterion">StandardGridDeveloper$SortingCriterion</abbr>&gt;</code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.experimenter.InvertibleMapper">InvertibleMapper</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.representation.sequence.integer.IntString">IntString</abbr>, <abbr title="io.github.ericmedvet.jsdynsym.grid.Grid">Grid</abbr>&lt;T&gt;&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.Mappers.intStringToGrammarGrid()` by jgea-experimenter:2.4.10:2023-10-20T07:25:19Z

### Builder `ea.mapper.mlpToMrf()`

`ea.m.mlpToMrf(innerLayerRatio; nOfInnerLayers; activationFunction)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `innerLayerRatio` | d | `0.65` | <code>double</code> |
| `nOfInnerLayers` | i | `1` | <code>int</code> |
| `activationFunction` | e | `TANH` | <code><abbr title="io.github.ericmedvet.jsdynsym.core.numerical.ann.MultiLayerPerceptron$ActivationFunction">MultiLayerPerceptron$ActivationFunction</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.experimenter.InvertibleMapper">InvertibleMapper</abbr>&lt;<abbr title="java.util.List">List</abbr>&lt;<abbr title="java.lang.Double">Double</abbr>&gt;, <abbr title="io.github.ericmedvet.jgea.core.representation.NamedMultivariateRealFunction">NamedMultivariateRealFunction</abbr>&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.Mappers.mlpToMrf()` by jgea-experimenter:2.4.10:2023-10-20T07:25:19Z

### Builder `ea.mapper.mrfToUrf()`

`ea.m.mrfToUrf()`

Produces <code><abbr title="io.github.ericmedvet.jgea.experimenter.InvertibleMapper">InvertibleMapper</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.representation.NamedMultivariateRealFunction">NamedMultivariateRealFunction</abbr>, <abbr title="io.github.ericmedvet.jgea.core.representation.NamedUnivariateRealFunction">NamedUnivariateRealFunction</abbr>&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.Mappers.mrfToUrf()` by jgea-experimenter:2.4.10:2023-10-20T07:25:19Z

### Builder `ea.mapper.multiSrTreeToMrf()`

`ea.m.multiSrTreeToMrf(postOperator)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `postOperator` | e | `IDENTITY` | <code><abbr title="io.github.ericmedvet.jsdynsym.core.numerical.ann.MultiLayerPerceptron$ActivationFunction">MultiLayerPerceptron$ActivationFunction</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.experimenter.InvertibleMapper">InvertibleMapper</abbr>&lt;<abbr title="java.util.List">List</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.representation.tree.Tree">Tree</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.representation.tree.numeric.Element">Element</abbr>&gt;&gt;, <abbr title="io.github.ericmedvet.jgea.core.representation.NamedMultivariateRealFunction">NamedMultivariateRealFunction</abbr>&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.Mappers.multiSrTreeToMrf()` by jgea-experimenter:2.4.10:2023-10-20T07:25:19Z

### Builder `ea.mapper.numericalParametrizedToMrf()`

`ea.m.numericalParametrizedToMrf(function)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `function` | npm |  | <code><abbr title="io.github.ericmedvet.jsdynsym.buildable.builders.NumericalDynamicalSystems$Builder">NumericalDynamicalSystems$Builder</abbr>&lt;<abbr title="io.github.ericmedvet.jsdynsym.core.numerical.MultivariateRealFunction">MultivariateRealFunction</abbr>, <abbr title="io.github.ericmedvet.jsdynsym.core.StatelessSystem$State">StatelessSystem$State</abbr>&gt;</code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.experimenter.InvertibleMapper">InvertibleMapper</abbr>&lt;<abbr title="java.util.List">List</abbr>&lt;<abbr title="java.lang.Double">Double</abbr>&gt;, <abbr title="io.github.ericmedvet.jgea.core.representation.NamedMultivariateRealFunction">NamedMultivariateRealFunction</abbr>&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.Mappers.numericalParametrizedToMrf()` by jgea-experimenter:2.4.10:2023-10-20T07:25:19Z

### Builder `ea.mapper.oGraphToMrf()`

`ea.m.oGraphToMrf(postOperator)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `postOperator` | e | `IDENTITY` | <code><abbr title="io.github.ericmedvet.jsdynsym.core.numerical.ann.MultiLayerPerceptron$ActivationFunction">MultiLayerPerceptron$ActivationFunction</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.experimenter.InvertibleMapper">InvertibleMapper</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.representation.graph.Graph">Graph</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.representation.graph.Node">Node</abbr>, <abbr title="io.github.ericmedvet.jgea.core.representation.graph.numeric.operatorgraph.OperatorGraph$NonValuedArc">OperatorGraph$NonValuedArc</abbr>&gt;, <abbr title="io.github.ericmedvet.jgea.core.representation.NamedMultivariateRealFunction">NamedMultivariateRealFunction</abbr>&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.Mappers.oGraphToMrf()` by jgea-experimenter:2.4.10:2023-10-20T07:25:19Z

### Builder `ea.mapper.srTreeToUrf()`

`ea.m.srTreeToUrf(postOperator)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `postOperator` | e | `IDENTITY` | <code><abbr title="io.github.ericmedvet.jsdynsym.core.numerical.ann.MultiLayerPerceptron$ActivationFunction">MultiLayerPerceptron$ActivationFunction</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.experimenter.InvertibleMapper">InvertibleMapper</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.representation.tree.Tree">Tree</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.representation.tree.numeric.Element">Element</abbr>&gt;, <abbr title="io.github.ericmedvet.jgea.core.representation.NamedUnivariateRealFunction">NamedUnivariateRealFunction</abbr>&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.Mappers.srTreeToUrf()` by jgea-experimenter:2.4.10:2023-10-20T07:25:19Z

## Package `ea.namedFunctions`

Aliases: `ea.namedFunctions`, `ea.nf`

### Builder `ea.namedFunctions.all()`

`ea.nf.all()`

Produces <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr>&lt;G, S, Q&gt;, <abbr title="java.util.Collection">Collection</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.solver.Individual">Individual</abbr>&lt;G, S, Q&gt;&gt;&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.NamedFunctions.all()` by jgea-experimenter:2.4.10:2023-10-20T07:25:19Z

### Builder `ea.namedFunctions.base64()`

`ea.nf.base64(f)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `f` | npm |  | <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;X, <abbr title="java.io.Serializable">Serializable</abbr>&gt;</code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;X, <abbr title="java.lang.String">String</abbr>&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.NamedFunctions.base64()` by jgea-experimenter:2.4.10:2023-10-20T07:25:19Z

### Builder `ea.namedFunctions.best()`

`ea.nf.best()`

Produces <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr>&lt;G, S, Q&gt;, <abbr title="io.github.ericmedvet.jgea.core.solver.Individual">Individual</abbr>&lt;G, S, Q&gt;&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.NamedFunctions.best()` by jgea-experimenter:2.4.10:2023-10-20T07:25:19Z

### Builder `ea.namedFunctions.bestFitness()`

`ea.nf.bestFitness(f; s)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `f` | npm | `ea.nf.identity()` | <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;Q, T&gt;</code> |
| `s` | s | `%s` | <code><abbr title="java.lang.String">String</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr>&lt;?, ?, Q&gt;, T&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.NamedFunctions.bestFitness()` by jgea-experimenter:2.4.10:2023-10-20T07:25:19Z

### Builder `ea.namedFunctions.births()`

`ea.nf.births()`

Produces <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr>&lt;?, ?, ?&gt;, <abbr title="java.lang.Long">Long</abbr>&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.NamedFunctions.births()` by jgea-experimenter:2.4.10:2023-10-20T07:25:19Z

### Builder `ea.namedFunctions.each()`

`ea.nf.each(map; collection; s)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `map` | npm |  | <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;T, R&gt;</code> |
| `collection` | npm |  | <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;X, <abbr title="java.util.Collection">Collection</abbr>&lt;T&gt;&gt;</code> |
| `s` | s | `%s` | <code><abbr title="java.lang.String">String</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;X, <abbr title="java.util.Collection">Collection</abbr>&lt;R&gt;&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.NamedFunctions.each()` by jgea-experimenter:2.4.10:2023-10-20T07:25:19Z

### Builder `ea.namedFunctions.elapsed()`

`ea.nf.elapsed()`

Produces <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr>&lt;?, ?, ?&gt;, <abbr title="java.lang.Double">Double</abbr>&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.NamedFunctions.elapsed()` by jgea-experimenter:2.4.10:2023-10-20T07:25:19Z

### Builder `ea.namedFunctions.evals()`

`ea.nf.evals()`

Produces <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr>&lt;?, ?, ?&gt;, <abbr title="java.lang.Long">Long</abbr>&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.NamedFunctions.evals()` by jgea-experimenter:2.4.10:2023-10-20T07:25:19Z

### Builder `ea.namedFunctions.expr()`

`ea.nf.expr(f1; f2; op)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `f1` | npm |  | <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;X, <abbr title="java.lang.Number">Number</abbr>&gt;</code> |
| `f2` | npm |  | <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;X, <abbr title="java.lang.Number">Number</abbr>&gt;</code> |
| `op` | e |  | <code><abbr title="io.github.ericmedvet.jgea.experimenter.builders.NamedFunctions$Op">NamedFunctions$Op</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;X, <abbr title="java.lang.Double">Double</abbr>&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.NamedFunctions.expr()` by jgea-experimenter:2.4.10:2023-10-20T07:25:19Z

### Builder `ea.namedFunctions.f()`

`ea.nf.f(outerF; innerF; name; s)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `outerF` | npm |  | <code><abbr title="java.util.function.Function">Function</abbr>&lt;T, R&gt;</code> |
| `innerF` | npm | `ea.nf.identity()` | <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;X, T&gt;</code> |
| `name` | s | `` | <code><abbr title="java.lang.String">String</abbr></code> |
| `s` | s | `%s` | <code><abbr title="java.lang.String">String</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;X, R&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.NamedFunctions.f()` by jgea-experimenter:2.4.10:2023-10-20T07:25:19Z

### Builder `ea.namedFunctions.firsts()`

`ea.nf.firsts()`

Produces <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr>&lt;G, S, Q&gt;, <abbr title="java.util.Collection">Collection</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.solver.Individual">Individual</abbr>&lt;G, S, Q&gt;&gt;&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.NamedFunctions.firsts()` by jgea-experimenter:2.4.10:2023-10-20T07:25:19Z

### Builder `ea.namedFunctions.fitness()`

`ea.nf.fitness(individual; s)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `individual` | npm | `ea.nf.identity()` | <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;X, <abbr title="io.github.ericmedvet.jgea.core.solver.Individual">Individual</abbr>&lt;?, ?, F&gt;&gt;</code> |
| `s` | s | `%s` | <code><abbr title="java.lang.String">String</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;X, F&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.NamedFunctions.fitness()` by jgea-experimenter:2.4.10:2023-10-20T07:25:19Z

### Builder `ea.namedFunctions.fitnessHist()`

`ea.nf.fitnessHist(f; nBins)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `f` | npm | `ea.nf.identity()` | <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;Q, <abbr title="java.lang.Number">Number</abbr>&gt;</code> |
| `nBins` | i | `8` | <code>int</code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr>&lt;?, ?, Q&gt;, <abbr title="java.lang.String">String</abbr>&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.NamedFunctions.fitnessHist()` by jgea-experimenter:2.4.10:2023-10-20T07:25:19Z

### Builder `ea.namedFunctions.formatted()`

`ea.nf.formatted(s; f)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `s` | s |  | <code><abbr title="java.lang.String">String</abbr></code> |
| `f` | npm |  | <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;T, R&gt;</code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;T, R&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.NamedFunctions.formatted()` by jgea-experimenter:2.4.10:2023-10-20T07:25:19Z

### Builder `ea.namedFunctions.genotype()`

`ea.nf.genotype(individual; s)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `individual` | npm | `ea.nf.identity()` | <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;X, <abbr title="io.github.ericmedvet.jgea.core.solver.Individual">Individual</abbr>&lt;G, ?, ?&gt;&gt;</code> |
| `s` | s | `%s` | <code><abbr title="java.lang.String">String</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;X, G&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.NamedFunctions.genotype()` by jgea-experimenter:2.4.10:2023-10-20T07:25:19Z

### Builder `ea.namedFunctions.grid()`

`ea.nf.grid(f; s; cellSeparator; rowSeparator; emptyCell)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `f` | npm |  | <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;T, <abbr title="io.github.ericmedvet.jsdynsym.grid.Grid">Grid</abbr>&lt;<abbr title="java.lang.Object">Object</abbr>&gt;&gt;</code> |
| `s` | s | `%20.20s` | <code><abbr title="java.lang.String">String</abbr></code> |
| `cellSeparator` | s | `` | <code><abbr title="java.lang.String">String</abbr></code> |
| `rowSeparator` | s | `;` | <code><abbr title="java.lang.String">String</abbr></code> |
| `emptyCell` | s | `·` | <code><abbr title="java.lang.String">String</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;T, <abbr title="java.lang.String">String</abbr>&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.NamedFunctions.grid()` by jgea-experimenter:2.4.10:2023-10-20T07:25:19Z

### Builder `ea.namedFunctions.gridCount()`

`ea.nf.gridCount(f; s)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `f` | npm |  | <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;X, <abbr title="io.github.ericmedvet.jsdynsym.grid.Grid">Grid</abbr>&lt;?&gt;&gt;</code> |
| `s` | s | `%2d` | <code><abbr title="java.lang.String">String</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;X, <abbr title="java.lang.Integer">Integer</abbr>&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.NamedFunctions.gridCount()` by jgea-experimenter:2.4.10:2023-10-20T07:25:19Z

### Builder `ea.namedFunctions.gridH()`

`ea.nf.gridH(f; s)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `f` | npm |  | <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;X, <abbr title="io.github.ericmedvet.jsdynsym.grid.Grid">Grid</abbr>&lt;?&gt;&gt;</code> |
| `s` | s | `%2d` | <code><abbr title="java.lang.String">String</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;X, <abbr title="java.lang.Integer">Integer</abbr>&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.NamedFunctions.gridH()` by jgea-experimenter:2.4.10:2023-10-20T07:25:19Z

### Builder `ea.namedFunctions.gridW()`

`ea.nf.gridW(f; s)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `f` | npm |  | <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;X, <abbr title="io.github.ericmedvet.jsdynsym.grid.Grid">Grid</abbr>&lt;?&gt;&gt;</code> |
| `s` | s | `%2d` | <code><abbr title="java.lang.String">String</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;X, <abbr title="java.lang.Integer">Integer</abbr>&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.NamedFunctions.gridW()` by jgea-experimenter:2.4.10:2023-10-20T07:25:19Z

### Builder `ea.namedFunctions.hist()`

`ea.nf.hist(collection; nBins)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `collection` | npm |  | <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;X, <abbr title="java.util.Collection">Collection</abbr>&lt;<abbr title="java.lang.Number">Number</abbr>&gt;&gt;</code> |
| `nBins` | i | `8` | <code>int</code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;X, <abbr title="java.lang.String">String</abbr>&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.NamedFunctions.hist()` by jgea-experimenter:2.4.10:2023-10-20T07:25:19Z

### Builder `ea.namedFunctions.identity()`

`ea.nf.identity()`

Produces <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;T, T&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.NamedFunctions.identity()` by jgea-experimenter:2.4.10:2023-10-20T07:25:19Z

### Builder `ea.namedFunctions.iterations()`

`ea.nf.iterations()`

Produces <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr>&lt;?, ?, ?&gt;, <abbr title="java.lang.Long">Long</abbr>&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.NamedFunctions.iterations()` by jgea-experimenter:2.4.10:2023-10-20T07:25:19Z

### Builder `ea.namedFunctions.lasts()`

`ea.nf.lasts()`

Produces <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr>&lt;G, S, Q&gt;, <abbr title="java.util.Collection">Collection</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.solver.Individual">Individual</abbr>&lt;G, S, Q&gt;&gt;&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.NamedFunctions.lasts()` by jgea-experimenter:2.4.10:2023-10-20T07:25:19Z

### Builder `ea.namedFunctions.max()`

`ea.nf.max(collection; s)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `collection` | npm |  | <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;X, <abbr title="java.util.Collection">Collection</abbr>&lt;T&gt;&gt;</code> |
| `s` | s | `%s` | <code><abbr title="java.lang.String">String</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;X, T&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.NamedFunctions.max()` by jgea-experimenter:2.4.10:2023-10-20T07:25:19Z

### Builder `ea.namedFunctions.median()`

`ea.nf.median(collection; s)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `collection` | npm |  | <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;X, <abbr title="java.util.Collection">Collection</abbr>&lt;T&gt;&gt;</code> |
| `s` | s | `%s` | <code><abbr title="java.lang.String">String</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;X, T&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.NamedFunctions.median()` by jgea-experimenter:2.4.10:2023-10-20T07:25:19Z

### Builder `ea.namedFunctions.min()`

`ea.nf.min(collection; s)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `collection` | npm |  | <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;X, <abbr title="java.util.Collection">Collection</abbr>&lt;T&gt;&gt;</code> |
| `s` | s | `%s` | <code><abbr title="java.lang.String">String</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;X, T&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.NamedFunctions.min()` by jgea-experimenter:2.4.10:2023-10-20T07:25:19Z

### Builder `ea.namedFunctions.percentile()`

`ea.nf.percentile(collection; p; s)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `collection` | npm |  | <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;X, <abbr title="java.util.Collection">Collection</abbr>&lt;T&gt;&gt;</code> |
| `p` | d |  | <code>double</code> |
| `s` | s | `%s` | <code><abbr title="java.lang.String">String</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;X, T&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.NamedFunctions.percentile()` by jgea-experimenter:2.4.10:2023-10-20T07:25:19Z

### Builder `ea.namedFunctions.progress()`

`ea.nf.progress()`

Produces <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr>&lt;?, ?, ?&gt;, <abbr title="java.lang.Double">Double</abbr>&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.NamedFunctions.progress()` by jgea-experimenter:2.4.10:2023-10-20T07:25:19Z

### Builder `ea.namedFunctions.size()`

`ea.nf.size(f; s)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `f` | npm |  | <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;X, ?&gt;</code> |
| `s` | s | `%s` | <code><abbr title="java.lang.String">String</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;X, <abbr title="java.lang.Integer">Integer</abbr>&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.NamedFunctions.size()` by jgea-experimenter:2.4.10:2023-10-20T07:25:19Z

### Builder `ea.namedFunctions.solution()`

`ea.nf.solution(individual; s)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `individual` | npm | `ea.nf.identity()` | <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;X, <abbr title="io.github.ericmedvet.jgea.core.solver.Individual">Individual</abbr>&lt;?, S, ?&gt;&gt;</code> |
| `s` | s | `%s` | <code><abbr title="java.lang.String">String</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;X, S&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.NamedFunctions.solution()` by jgea-experimenter:2.4.10:2023-10-20T07:25:19Z

### Builder `ea.namedFunctions.uniqueness()`

`ea.nf.uniqueness(collection)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `collection` | npm |  | <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;X, <abbr title="java.util.Collection">Collection</abbr>&lt;T&gt;&gt;</code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;X, <abbr title="java.lang.Double">Double</abbr>&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.NamedFunctions.uniqueness()` by jgea-experimenter:2.4.10:2023-10-20T07:25:19Z

## Package `ea.plot`

### Builder `ea.plot.dyPlot()`

`ea.plot.dyPlot(x; y; w; h; minX; maxX; minY; maxY)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `x` | npm | `ea.nf.iterations()` | <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;? super <abbr title="io.github.ericmedvet.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr>&lt;G, S, Q&gt;, ? extends <abbr title="java.lang.Number">Number</abbr>&gt;</code> |
| `y` | npm |  | <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;? super <abbr title="io.github.ericmedvet.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr>&lt;G, S, Q&gt;, ? extends <abbr title="java.lang.Number">Number</abbr>&gt;</code> |
| `w` | i | `600` | <code>int</code> |
| `h` | i | `400` | <code>int</code> |
| `minX` | d | `-Infinity` | <code>double</code> |
| `maxX` | d | `-Infinity` | <code>double</code> |
| `minY` | d | `-Infinity` | <code>double</code> |
| `maxY` | d | `-Infinity` | <code>double</code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.core.listener.XYPlotTableBuilder">XYPlotTableBuilder</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr>&lt;G, S, Q&gt;&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.Plots.dyPlot()` by jgea-experimenter:2.4.10:2023-10-20T07:25:19Z

### Builder `ea.plot.elapsed()`

`ea.plot.elapsed(x; y; w; h; minX; maxX; minY; maxY)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `x` | npm | `ea.nf.iterations()` | <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;? super <abbr title="io.github.ericmedvet.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr>&lt;G, S, Q&gt;, ? extends <abbr title="java.lang.Number">Number</abbr>&gt;</code> |
| `y` | npm | `ea.nf.elapsed()` | <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;? super <abbr title="io.github.ericmedvet.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr>&lt;G, S, Q&gt;, ? extends <abbr title="java.lang.Number">Number</abbr>&gt;</code> |
| `w` | i | `600` | <code>int</code> |
| `h` | i | `400` | <code>int</code> |
| `minX` | d | `-Infinity` | <code>double</code> |
| `maxX` | d | `-Infinity` | <code>double</code> |
| `minY` | d | `0.0` | <code>double</code> |
| `maxY` | d | `-Infinity` | <code>double</code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.core.listener.XYPlotTableBuilder">XYPlotTableBuilder</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr>&lt;G, S, Q&gt;&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.Plots.elapsed()` by jgea-experimenter:2.4.10:2023-10-20T07:25:19Z

### Builder `ea.plot.fitness()`

`ea.plot.fitness(x; collection; f; w; h; minX; maxX; minY; maxY; sort; s)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `x` | npm | `ea.nf.iterations()` | <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;? super <abbr title="io.github.ericmedvet.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr>&lt;G, S, Q&gt;, ? extends <abbr title="java.lang.Number">Number</abbr>&gt;</code> |
| `collection` | npm | `ea.nf.all()` | <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr>&lt;G, S, Q&gt;, <abbr title="java.util.Collection">Collection</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.solver.Individual">Individual</abbr>&lt;G, S, Q&gt;&gt;&gt;</code> |
| `f` | npm | `ea.nf.identity()` | <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;Q, <abbr title="java.lang.Double">Double</abbr>&gt;</code> |
| `w` | i | `600` | <code>int</code> |
| `h` | i | `400` | <code>int</code> |
| `minX` | d | `-Infinity` | <code>double</code> |
| `maxX` | d | `-Infinity` | <code>double</code> |
| `minY` | d | `-Infinity` | <code>double</code> |
| `maxY` | d | `-Infinity` | <code>double</code> |
| `sort` | e | `MIN` | <code><abbr title="io.github.ericmedvet.jgea.experimenter.builders.Plots$Sorting">Plots$Sorting</abbr></code> |
| `s` | s | `%.2f` | <code><abbr title="java.lang.String">String</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.core.listener.XYPlotTableBuilder">XYPlotTableBuilder</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr>&lt;G, S, Q&gt;&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.Plots.fitness()` by jgea-experimenter:2.4.10:2023-10-20T07:25:19Z

### Builder `ea.plot.uniqueness()`

`ea.plot.uniqueness(x; ys; w; h; minX; maxX; minY; maxY)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `x` | npm | `ea.nf.iterations()` | <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;? super <abbr title="io.github.ericmedvet.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr>&lt;G, S, Q&gt;, ? extends <abbr title="java.lang.Number">Number</abbr>&gt;</code> |
| `ys` | npm[] | `[ea.nf.uniqueness(collection = ea.nf.each(collection = ea.nf.all(); map = ea.nf.genotype())), ea.nf.uniqueness(collection = ea.nf.each(collection = ea.nf.all(); map = ea.nf.solution())), ea.nf.uniqueness(collection = ea.nf.each(collection = ea.nf.all(); map = ea.nf.fitness()))]` | <code><abbr title="java.util.List">List</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;? super <abbr title="io.github.ericmedvet.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr>&lt;G, S, Q&gt;, ? extends <abbr title="java.lang.Number">Number</abbr>&gt;&gt;</code> |
| `w` | i | `600` | <code>int</code> |
| `h` | i | `400` | <code>int</code> |
| `minX` | d | `-Infinity` | <code>double</code> |
| `maxX` | d | `-Infinity` | <code>double</code> |
| `minY` | d | `0.0` | <code>double</code> |
| `maxY` | d | `1.0` | <code>double</code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.core.listener.XYPlotTableBuilder">XYPlotTableBuilder</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr>&lt;G, S, Q&gt;&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.Plots.uniqueness()` by jgea-experimenter:2.4.10:2023-10-20T07:25:19Z

### Builder `ea.plot.xyPlot()`

`ea.plot.xyPlot(x; y; w; h; minX; maxX; minY; maxY)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `x` | npm |  | <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;? super E, ? extends <abbr title="java.lang.Number">Number</abbr>&gt;</code> |
| `y` | npm |  | <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;? super E, ? extends <abbr title="java.lang.Number">Number</abbr>&gt;</code> |
| `w` | i | `600` | <code>int</code> |
| `h` | i | `400` | <code>int</code> |
| `minX` | d | `-Infinity` | <code>double</code> |
| `maxX` | d | `-Infinity` | <code>double</code> |
| `minY` | d | `-Infinity` | <code>double</code> |
| `maxY` | d | `-Infinity` | <code>double</code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.core.listener.XYPlotTableBuilder">XYPlotTableBuilder</abbr>&lt;E&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.Plots.xyPlot()` by jgea-experimenter:2.4.10:2023-10-20T07:25:19Z

### Builder `ea.plot.xysPlot()`

`ea.plot.xysPlot(x; ys; w; h; minX; maxX; minY; maxY)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `x` | npm |  | <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;? super E, ? extends <abbr title="java.lang.Number">Number</abbr>&gt;</code> |
| `ys` | npm[] | `[]` | <code><abbr title="java.util.List">List</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;? super E, ? extends <abbr title="java.lang.Number">Number</abbr>&gt;&gt;</code> |
| `w` | i | `600` | <code>int</code> |
| `h` | i | `400` | <code>int</code> |
| `minX` | d | `-Infinity` | <code>double</code> |
| `maxX` | d | `-Infinity` | <code>double</code> |
| `minY` | d | `-Infinity` | <code>double</code> |
| `maxY` | d | `-Infinity` | <code>double</code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.core.listener.XYPlotTableBuilder">XYPlotTableBuilder</abbr>&lt;E&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.Plots.xysPlot()` by jgea-experimenter:2.4.10:2023-10-20T07:25:19Z

### Builder `ea.plot.yPlot()`

`ea.plot.yPlot(x; y; w; h; minX; maxX; minY; maxY)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `x` | npm | `ea.nf.iterations()` | <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;? super <abbr title="io.github.ericmedvet.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr>&lt;G, S, Q&gt;, ? extends <abbr title="java.lang.Number">Number</abbr>&gt;</code> |
| `y` | npm |  | <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;? super <abbr title="io.github.ericmedvet.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr>&lt;G, S, Q&gt;, ? extends <abbr title="java.lang.Number">Number</abbr>&gt;</code> |
| `w` | i | `600` | <code>int</code> |
| `h` | i | `400` | <code>int</code> |
| `minX` | d | `-Infinity` | <code>double</code> |
| `maxX` | d | `-Infinity` | <code>double</code> |
| `minY` | d | `-Infinity` | <code>double</code> |
| `maxY` | d | `-Infinity` | <code>double</code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.core.listener.XYPlotTableBuilder">XYPlotTableBuilder</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr>&lt;G, S, Q&gt;&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.Plots.yPlot()` by jgea-experimenter:2.4.10:2023-10-20T07:25:19Z

### Builder `ea.plot.ysPlot()`

`ea.plot.ysPlot(x; ys; w; h; minX; maxX; minY; maxY)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `x` | npm | `ea.nf.iterations()` | <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;? super <abbr title="io.github.ericmedvet.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr>&lt;G, S, Q&gt;, ? extends <abbr title="java.lang.Number">Number</abbr>&gt;</code> |
| `ys` | npm[] | `[]` | <code><abbr title="java.util.List">List</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;? super <abbr title="io.github.ericmedvet.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr>&lt;G, S, Q&gt;, ? extends <abbr title="java.lang.Number">Number</abbr>&gt;&gt;</code> |
| `w` | i | `600` | <code>int</code> |
| `h` | i | `400` | <code>int</code> |
| `minX` | d | `-Infinity` | <code>double</code> |
| `maxX` | d | `-Infinity` | <code>double</code> |
| `minY` | d | `-Infinity` | <code>double</code> |
| `maxY` | d | `-Infinity` | <code>double</code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.core.listener.XYPlotTableBuilder">XYPlotTableBuilder</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr>&lt;G, S, Q&gt;&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.Plots.ysPlot()` by jgea-experimenter:2.4.10:2023-10-20T07:25:19Z

## Package `ea.problem`

Aliases: `ea.p`, `ea.problem`

### Builder `ea.problem.totalOrder()`

`ea.p.totalOrder(qFunction; cFunction; type)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `qFunction` | npm |  | <code><abbr title="java.util.function.Function">Function</abbr>&lt;S, Q&gt;</code> |
| `cFunction` | npm | `ea.f.identity()` | <code><abbr title="java.util.function.Function">Function</abbr>&lt;Q, C&gt;</code> |
| `type` | e | `MINIMIZE` | <code><abbr title="io.github.ericmedvet.jgea.experimenter.builders.Problems$OptimizationType">Problems$OptimizationType</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.core.problem.TotalOrderQualityBasedProblem">TotalOrderQualityBasedProblem</abbr>&lt;S, Q&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.Problems.totalOrder()` by jgea-experimenter:2.4.10:2023-10-20T07:25:19Z

## Package `ea.problem.dataset.numerical`

Aliases: `ea.p.d.num`, `ea.p.d.numerical`, `ea.p.dataset.num`, `ea.p.dataset.numerical`, `ea.problem.d.num`, `ea.problem.d.numerical`, `ea.problem.dataset.num`, `ea.problem.dataset.numerical`

### Builder `ea.problem.dataset.numerical.empty()`

`ea.p.d.num.empty(xVars; yVars)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `xVars` | s[] | `[]` | <code><abbr title="java.util.List">List</abbr>&lt;<abbr title="java.lang.String">String</abbr>&gt;</code> |
| `yVars` | s[] | `[]` | <code><abbr title="java.util.List">List</abbr>&lt;<abbr title="java.lang.String">String</abbr>&gt;</code> |

Produces <code><abbr title="java.util.function.Supplier">Supplier</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.problem.regression.NumericalDataset">NumericalDataset</abbr>&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.NumericalDatasets.empty()` by jgea-experimenter:2.4.10:2023-10-20T07:25:19Z

### Builder `ea.problem.dataset.numerical.fromFile()`

`ea.p.d.num.fromFile(filePath; folds; nFolds; xVarNamePattern; yVarNamePattern)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `filePath` | s |  | <code><abbr title="java.lang.String">String</abbr></code> |
| `folds` | i[] | `[0]` | <code><abbr title="java.util.List">List</abbr>&lt;<abbr title="java.lang.Integer">Integer</abbr>&gt;</code> |
| `nFolds` | i | `1` | <code>int</code> |
| `xVarNamePattern` | s | `x.*` | <code><abbr title="java.lang.String">String</abbr></code> |
| `yVarNamePattern` | s | `y.*` | <code><abbr title="java.lang.String">String</abbr></code> |

Produces <code><abbr title="java.util.function.Supplier">Supplier</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.problem.regression.NumericalDataset">NumericalDataset</abbr>&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.NumericalDatasets.fromFile()` by jgea-experimenter:2.4.10:2023-10-20T07:25:19Z

### Builder `ea.problem.dataset.numerical.fromProblem()`

`ea.p.d.num.fromProblem(problem)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `problem` | npm |  | <code><abbr title="io.github.ericmedvet.jgea.problem.regression.univariate.UnivariateRegressionProblem">UnivariateRegressionProblem</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.problem.regression.univariate.UnivariateRegressionFitness">UnivariateRegressionFitness</abbr>&gt;</code> |

Produces <code><abbr title="java.util.function.Supplier">Supplier</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.problem.regression.NumericalDataset">NumericalDataset</abbr>&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.NumericalDatasets.fromProblem()` by jgea-experimenter:2.4.10:2023-10-20T07:25:19Z

## Package `ea.problem.multivariateRegression`

Aliases: `ea.p.mr`, `ea.p.multivariateRegression`, `ea.problem.mr`, `ea.problem.multivariateRegression`

### Builder `ea.problem.multivariateRegression.fromData()`

`ea.p.mr.fromData(trainingDataset; testDataset; metric)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `trainingDataset` | npm |  | <code><abbr title="java.util.function.Supplier">Supplier</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.problem.regression.NumericalDataset">NumericalDataset</abbr>&gt;</code> |
| `testDataset` | npm | `ea.d.num.empty()` | <code><abbr title="java.util.function.Supplier">Supplier</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.problem.regression.NumericalDataset">NumericalDataset</abbr>&gt;</code> |
| `metric` | e | `MSE` | <code><abbr title="io.github.ericmedvet.jgea.problem.regression.univariate.UnivariateRegressionFitness$Metric">UnivariateRegressionFitness$Metric</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.problem.regression.multivariate.MultivariateRegressionProblem">MultivariateRegressionProblem</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.problem.regression.multivariate.MultivariateRegressionFitness">MultivariateRegressionFitness</abbr>&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.MultivariateRegressionProblems.fromData()` by jgea-experimenter:2.4.10:2023-10-20T07:25:19Z

## Package `ea.problem.synthetic`

Aliases: `ea.p.s`, `ea.p.synthetic`, `ea.problem.s`, `ea.problem.synthetic`

### Builder `ea.problem.synthetic.ackley()`

`ea.p.s.ackley(p)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `p` | i | `100` | <code>int</code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.problem.synthetic.Ackley">Ackley</abbr></code>; built from `io.github.ericmedvet.jgea.experimenter.builders.SyntheticProblems.ackley()` by jgea-experimenter:2.4.10:2023-10-20T07:25:19Z

### Builder `ea.problem.synthetic.charShapeApproximation()`

`ea.p.s.charShapeApproximation(target; translation; smoothed; weighted)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `target` | s |  | <code><abbr title="java.lang.String">String</abbr></code> |
| `translation` | b | `true` | <code>boolean</code> |
| `smoothed` | b | `true` | <code>boolean</code> |
| `weighted` | b | `true` | <code>boolean</code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.problem.grid.CharShapeApproximation">CharShapeApproximation</abbr></code>; built from `io.github.ericmedvet.jgea.experimenter.builders.SyntheticProblems.charShapeApproximation()` by jgea-experimenter:2.4.10:2023-10-20T07:25:19Z

### Builder `ea.problem.synthetic.doublesOneMax()`

`ea.p.s.doublesOneMax(p)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `p` | i | `100` | <code>int</code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.problem.synthetic.DoublesOneMax">DoublesOneMax</abbr></code>; built from `io.github.ericmedvet.jgea.experimenter.builders.SyntheticProblems.doublesOneMax()` by jgea-experimenter:2.4.10:2023-10-20T07:25:19Z

### Builder `ea.problem.synthetic.doublesVariableTarget()`

`ea.p.s.doublesVariableTarget(p; target)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `p` | i | `100` | <code>int</code> |
| `target` | d |  | <code>double</code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.problem.synthetic.DoublesVariableTarget">DoublesVariableTarget</abbr></code>; built from `io.github.ericmedvet.jgea.experimenter.builders.SyntheticProblems.doublesVariableTarget()` by jgea-experimenter:2.4.10:2023-10-20T07:25:19Z

### Builder `ea.problem.synthetic.intOneMax()`

`ea.p.s.intOneMax(p; upperBound)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `p` | i | `100` | <code>int</code> |
| `upperBound` | i | `100` | <code>int</code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.problem.synthetic.IntOneMax">IntOneMax</abbr></code>; built from `io.github.ericmedvet.jgea.experimenter.builders.SyntheticProblems.intOneMax()` by jgea-experimenter:2.4.10:2023-10-20T07:25:19Z

### Builder `ea.problem.synthetic.linearPoints()`

`ea.p.s.linearPoints(p)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `p` | i | `100` | <code>int</code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.problem.synthetic.LinearPoints">LinearPoints</abbr></code>; built from `io.github.ericmedvet.jgea.experimenter.builders.SyntheticProblems.linearPoints()` by jgea-experimenter:2.4.10:2023-10-20T07:25:19Z

### Builder `ea.problem.synthetic.oneMax()`

`ea.p.s.oneMax(p)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `p` | i | `100` | <code>int</code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.problem.synthetic.OneMax">OneMax</abbr></code>; built from `io.github.ericmedvet.jgea.experimenter.builders.SyntheticProblems.oneMax()` by jgea-experimenter:2.4.10:2023-10-20T07:25:19Z

### Builder `ea.problem.synthetic.rastrigin()`

`ea.p.s.rastrigin(p)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `p` | i | `100` | <code>int</code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.problem.synthetic.Rastrigin">Rastrigin</abbr></code>; built from `io.github.ericmedvet.jgea.experimenter.builders.SyntheticProblems.rastrigin()` by jgea-experimenter:2.4.10:2023-10-20T07:25:19Z

### Builder `ea.problem.synthetic.sphere()`

`ea.p.s.sphere(p)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `p` | i | `100` | <code>int</code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.problem.synthetic.Sphere">Sphere</abbr></code>; built from `io.github.ericmedvet.jgea.experimenter.builders.SyntheticProblems.sphere()` by jgea-experimenter:2.4.10:2023-10-20T07:25:19Z

## Package `ea.problem.univariateRegression`

Aliases: `ea.p.univariateRegression`, `ea.p.ur`, `ea.problem.univariateRegression`, `ea.problem.ur`

### Builder `ea.problem.univariateRegression.bundled()`

`ea.p.ur.bundled(name; metric)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `name` | s |  | <code><abbr title="java.lang.String">String</abbr></code> |
| `metric` | e | `MSE` | <code><abbr title="io.github.ericmedvet.jgea.problem.regression.univariate.UnivariateRegressionFitness$Metric">UnivariateRegressionFitness$Metric</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.problem.regression.univariate.UnivariateRegressionProblem">UnivariateRegressionProblem</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.problem.regression.univariate.UnivariateRegressionFitness">UnivariateRegressionFitness</abbr>&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.UnivariateRegressionProblems.bundled()` by jgea-experimenter:2.4.10:2023-10-20T07:25:19Z

### Builder `ea.problem.univariateRegression.fromData()`

`ea.p.ur.fromData(trainingDataset; testDataset; metric)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `trainingDataset` | npm |  | <code><abbr title="java.util.function.Supplier">Supplier</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.problem.regression.NumericalDataset">NumericalDataset</abbr>&gt;</code> |
| `testDataset` | npm | `ea.d.num.empty()` | <code><abbr title="java.util.function.Supplier">Supplier</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.problem.regression.NumericalDataset">NumericalDataset</abbr>&gt;</code> |
| `metric` | e | `MSE` | <code><abbr title="io.github.ericmedvet.jgea.problem.regression.univariate.UnivariateRegressionFitness$Metric">UnivariateRegressionFitness$Metric</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.problem.regression.univariate.UnivariateRegressionProblem">UnivariateRegressionProblem</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.problem.regression.univariate.UnivariateRegressionFitness">UnivariateRegressionFitness</abbr>&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.UnivariateRegressionProblems.fromData()` by jgea-experimenter:2.4.10:2023-10-20T07:25:19Z

### Builder `ea.problem.univariateRegression.synthetic()`

`ea.p.ur.synthetic(name; metric; seed)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `name` | s |  | <code><abbr title="java.lang.String">String</abbr></code> |
| `metric` | e | `MSE` | <code><abbr title="io.github.ericmedvet.jgea.problem.regression.univariate.UnivariateRegressionFitness$Metric">UnivariateRegressionFitness$Metric</abbr></code> |
| `seed` | i | `1` | <code>int</code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.problem.regression.univariate.synthetic.SyntheticUnivariateRegressionProblem">SyntheticUnivariateRegressionProblem</abbr></code>; built from `io.github.ericmedvet.jgea.experimenter.builders.UnivariateRegressionProblems.synthetic()` by jgea-experimenter:2.4.10:2023-10-20T07:25:19Z

## Package `ea.randomGenerator`

Aliases: `ea.randomGenerator`, `ea.rg`

### Builder `ea.randomGenerator.defaultRG()`

`ea.rg.defaultRG(seed)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `seed` | i | `0` | <code>int</code> |

Produces <code><abbr title="java.util.random.RandomGenerator">RandomGenerator</abbr></code>; built from `io.github.ericmedvet.jgea.experimenter.builders.RandomGenerators.defaultRG()` by jgea-experimenter:2.4.10:2023-10-20T07:25:19Z

## Package `ea.solver`

Aliases: `ea.s`, `ea.solver`

### Builder `ea.solver.bitStringGa()`

`ea.s.bitStringGa(mapper; crossoverP; pMut; tournamentRate; minNTournament; nPop; nEval; diversity; remap)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `mapper` | npm |  | <code><abbr title="io.github.ericmedvet.jgea.experimenter.InvertibleMapper">InvertibleMapper</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.representation.sequence.bit.BitString">BitString</abbr>, S&gt;</code> |
| `crossoverP` | d | `0.8` | <code>double</code> |
| `pMut` | d | `0.01` | <code>double</code> |
| `tournamentRate` | d | `0.05` | <code>double</code> |
| `minNTournament` | i | `3` | <code>int</code> |
| `nPop` | i | `100` | <code>int</code> |
| `nEval` | i |  | <code>int</code> |
| `diversity` | b | `true` | <code>boolean</code> |
| `remap` | b | `false` | <code>boolean</code> |

Produces <code><abbr title="java.util.function.Function">Function</abbr>&lt;S, <abbr title="io.github.ericmedvet.jgea.core.solver.StandardEvolver">StandardEvolver</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.representation.sequence.bit.BitString">BitString</abbr>, S, Q&gt;, <abbr title="io.github.ericmedvet.jgea.core.problem.QualityBasedProblem">QualityBasedProblem</abbr>&lt;S, Q&gt;, <abbr title="io.github.ericmedvet.jgea.core.representation.sequence.bit.BitString">BitString</abbr>, S, Q&gt;&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.Solvers.bitStringGa()` by jgea-experimenter:2.4.10:2023-10-20T07:25:19Z

### Builder `ea.solver.bitStringRandomWalk()`

`ea.s.bitStringRandomWalk(mapper; pMut; nEval)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `mapper` | npm |  | <code><abbr title="io.github.ericmedvet.jgea.experimenter.InvertibleMapper">InvertibleMapper</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.representation.sequence.bit.BitString">BitString</abbr>, S&gt;</code> |
| `pMut` | d | `0.01` | <code>double</code> |
| `nEval` | i |  | <code>int</code> |

Produces <code><abbr title="java.util.function.Function">Function</abbr>&lt;S, <abbr title="io.github.ericmedvet.jgea.core.solver.RandomWalk">RandomWalk</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.problem.QualityBasedProblem">QualityBasedProblem</abbr>&lt;S, Q&gt;, <abbr title="io.github.ericmedvet.jgea.core.representation.sequence.bit.BitString">BitString</abbr>, S, Q&gt;&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.Solvers.bitStringRandomWalk()` by jgea-experimenter:2.4.10:2023-10-20T07:25:19Z

### Builder `ea.solver.cmaEs()`

`ea.s.cmaEs(mapper; initialMinV; initialMaxV; nEval)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `mapper` | npm |  | <code><abbr title="io.github.ericmedvet.jgea.experimenter.InvertibleMapper">InvertibleMapper</abbr>&lt;<abbr title="java.util.List">List</abbr>&lt;<abbr title="java.lang.Double">Double</abbr>&gt;, S&gt;</code> |
| `initialMinV` | d | `-1.0` | <code>double</code> |
| `initialMaxV` | d | `1.0` | <code>double</code> |
| `nEval` | i |  | <code>int</code> |

Produces <code><abbr title="java.util.function.Function">Function</abbr>&lt;S, <abbr title="io.github.ericmedvet.jgea.core.solver.CMAEvolutionaryStrategy">CMAEvolutionaryStrategy</abbr>&lt;S, Q&gt;&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.Solvers.cmaEs()` by jgea-experimenter:2.4.10:2023-10-20T07:25:19Z

### Builder `ea.solver.differentialEvolution()`

`ea.s.differentialEvolution(mapper; initialMinV; initialMaxV; populationSize; nEval; differentialWeight; crossoverProb; remap)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `mapper` | npm |  | <code><abbr title="io.github.ericmedvet.jgea.experimenter.InvertibleMapper">InvertibleMapper</abbr>&lt;<abbr title="java.util.List">List</abbr>&lt;<abbr title="java.lang.Double">Double</abbr>&gt;, S&gt;</code> |
| `initialMinV` | d | `-1.0` | <code>double</code> |
| `initialMaxV` | d | `1.0` | <code>double</code> |
| `populationSize` | i | `15` | <code>int</code> |
| `nEval` | i |  | <code>int</code> |
| `differentialWeight` | d | `0.5` | <code>double</code> |
| `crossoverProb` | d | `0.8` | <code>double</code> |
| `remap` | b | `false` | <code>boolean</code> |

Produces <code><abbr title="java.util.function.Function">Function</abbr>&lt;S, <abbr title="io.github.ericmedvet.jgea.core.solver.DifferentialEvolution">DifferentialEvolution</abbr>&lt;S, Q&gt;&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.Solvers.differentialEvolution()` by jgea-experimenter:2.4.10:2023-10-20T07:25:19Z

### Builder `ea.solver.doubleStringGa()`

`ea.s.doubleStringGa(mapper; initialMinV; initialMaxV; crossoverP; sigmaMut; tournamentRate; minNTournament; nPop; nEval; diversity; remap)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `mapper` | npm |  | <code><abbr title="io.github.ericmedvet.jgea.experimenter.InvertibleMapper">InvertibleMapper</abbr>&lt;<abbr title="java.util.List">List</abbr>&lt;<abbr title="java.lang.Double">Double</abbr>&gt;, S&gt;</code> |
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

Produces <code><abbr title="java.util.function.Function">Function</abbr>&lt;S, <abbr title="io.github.ericmedvet.jgea.core.solver.StandardEvolver">StandardEvolver</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr>&lt;<abbr title="java.util.List">List</abbr>&lt;<abbr title="java.lang.Double">Double</abbr>&gt;, S, Q&gt;, <abbr title="io.github.ericmedvet.jgea.core.problem.QualityBasedProblem">QualityBasedProblem</abbr>&lt;S, Q&gt;, <abbr title="java.util.List">List</abbr>&lt;<abbr title="java.lang.Double">Double</abbr>&gt;, S, Q&gt;&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.Solvers.doubleStringGa()` by jgea-experimenter:2.4.10:2023-10-20T07:25:19Z

### Builder `ea.solver.intStringGa()`

`ea.s.intStringGa(mapper; crossoverP; pMut; tournamentRate; minNTournament; nPop; nEval; diversity; remap)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `mapper` | npm |  | <code><abbr title="io.github.ericmedvet.jgea.experimenter.InvertibleMapper">InvertibleMapper</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.representation.sequence.integer.IntString">IntString</abbr>, S&gt;</code> |
| `crossoverP` | d | `0.8` | <code>double</code> |
| `pMut` | d | `0.01` | <code>double</code> |
| `tournamentRate` | d | `0.05` | <code>double</code> |
| `minNTournament` | i | `3` | <code>int</code> |
| `nPop` | i | `100` | <code>int</code> |
| `nEval` | i |  | <code>int</code> |
| `diversity` | b | `true` | <code>boolean</code> |
| `remap` | b | `false` | <code>boolean</code> |

Produces <code><abbr title="java.util.function.Function">Function</abbr>&lt;S, <abbr title="io.github.ericmedvet.jgea.core.solver.StandardEvolver">StandardEvolver</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.representation.sequence.integer.IntString">IntString</abbr>, S, Q&gt;, <abbr title="io.github.ericmedvet.jgea.core.problem.QualityBasedProblem">QualityBasedProblem</abbr>&lt;S, Q&gt;, <abbr title="io.github.ericmedvet.jgea.core.representation.sequence.integer.IntString">IntString</abbr>, S, Q&gt;&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.Solvers.intStringGa()` by jgea-experimenter:2.4.10:2023-10-20T07:25:19Z

### Builder `ea.solver.multiSRTreeGp()`

`ea.s.multiSRTreeGp(mapper; constants; operators; minTreeH; maxTreeH; crossoverP; tournamentRate; minNTournament; nPop; nEval; diversity; nAttemptsDiversity; remap)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `mapper` | npm |  | <code><abbr title="io.github.ericmedvet.jgea.experimenter.InvertibleMapper">InvertibleMapper</abbr>&lt;<abbr title="java.util.List">List</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.representation.tree.Tree">Tree</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.representation.tree.numeric.Element">Element</abbr>&gt;&gt;, S&gt;</code> |
| `constants` | d[] | `[0.1, 1.0, 10.0]` | <code><abbr title="java.util.List">List</abbr>&lt;<abbr title="java.lang.Double">Double</abbr>&gt;</code> |
| `operators` | e[] | `[+, -, *, p/, plog]` | <code><abbr title="java.util.List">List</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.representation.tree.numeric.Element$Operator">Element$Operator</abbr>&gt;</code> |
| `minTreeH` | i | `4` | <code>int</code> |
| `maxTreeH` | i | `10` | <code>int</code> |
| `crossoverP` | d | `0.8` | <code>double</code> |
| `tournamentRate` | d | `0.05` | <code>double</code> |
| `minNTournament` | i | `3` | <code>int</code> |
| `nPop` | i | `100` | <code>int</code> |
| `nEval` | i |  | <code>int</code> |
| `diversity` | b | `true` | <code>boolean</code> |
| `nAttemptsDiversity` | i | `100` | <code>int</code> |
| `remap` | b | `false` | <code>boolean</code> |

Produces <code><abbr title="java.util.function.Function">Function</abbr>&lt;S, <abbr title="io.github.ericmedvet.jgea.core.solver.StandardEvolver">StandardEvolver</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr>&lt;<abbr title="java.util.List">List</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.representation.tree.Tree">Tree</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.representation.tree.numeric.Element">Element</abbr>&gt;&gt;, S, Q&gt;, <abbr title="io.github.ericmedvet.jgea.core.problem.QualityBasedProblem">QualityBasedProblem</abbr>&lt;S, Q&gt;, <abbr title="java.util.List">List</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.representation.tree.Tree">Tree</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.representation.tree.numeric.Element">Element</abbr>&gt;&gt;, S, Q&gt;&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.Solvers.multiSRTreeGp()` by jgea-experimenter:2.4.10:2023-10-20T07:25:19Z

### Builder `ea.solver.oGraphea()`

`ea.s.oGraphea(mapper; minConst; maxConst; nConst; operators; nPop; nEval; arcAdditionRate; arcRemovalRate; nodeAdditionRate; nPop; rankBase; remap)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `mapper` | npm |  | <code><abbr title="io.github.ericmedvet.jgea.experimenter.InvertibleMapper">InvertibleMapper</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.representation.graph.Graph">Graph</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.representation.graph.Node">Node</abbr>, <abbr title="io.github.ericmedvet.jgea.core.representation.graph.numeric.operatorgraph.OperatorGraph$NonValuedArc">OperatorGraph$NonValuedArc</abbr>&gt;, S&gt;</code> |
| `minConst` | d | `0.0` | <code>double</code> |
| `maxConst` | d | `5.0` | <code>double</code> |
| `nConst` | i | `10` | <code>int</code> |
| `operators` | e[] | `[+, -, *, p/, plog]` | <code><abbr title="java.util.List">List</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.representation.graph.numeric.operatorgraph.BaseOperator">BaseOperator</abbr>&gt;</code> |
| `nPop` | i | `100` | <code>int</code> |
| `nEval` | i |  | <code>int</code> |
| `arcAdditionRate` | d | `3.0` | <code>double</code> |
| `arcRemovalRate` | d | `0.1` | <code>double</code> |
| `nodeAdditionRate` | d | `1.0` | <code>double</code> |
| `nPop` | i | `5` | <code>int</code> |
| `rankBase` | d | `0.75` | <code>double</code> |
| `remap` | b | `false` | <code>boolean</code> |

Produces <code><abbr title="java.util.function.Function">Function</abbr>&lt;S, <abbr title="io.github.ericmedvet.jgea.core.solver.speciation.SpeciatedEvolver">SpeciatedEvolver</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.problem.QualityBasedProblem">QualityBasedProblem</abbr>&lt;S, Q&gt;, <abbr title="io.github.ericmedvet.jgea.core.representation.graph.Graph">Graph</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.representation.graph.Node">Node</abbr>, <abbr title="io.github.ericmedvet.jgea.core.representation.graph.numeric.operatorgraph.OperatorGraph$NonValuedArc">OperatorGraph$NonValuedArc</abbr>&gt;, S, Q&gt;&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.Solvers.oGraphea()` by jgea-experimenter:2.4.10:2023-10-20T07:25:19Z

### Builder `ea.solver.openAiEs()`

`ea.s.openAiEs(mapper; initialMinV; initialMaxV; sigma; batchSize; nEval)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `mapper` | npm |  | <code><abbr title="io.github.ericmedvet.jgea.experimenter.InvertibleMapper">InvertibleMapper</abbr>&lt;<abbr title="java.util.List">List</abbr>&lt;<abbr title="java.lang.Double">Double</abbr>&gt;, S&gt;</code> |
| `initialMinV` | d | `-1.0` | <code>double</code> |
| `initialMaxV` | d | `1.0` | <code>double</code> |
| `sigma` | d | `0.35` | <code>double</code> |
| `batchSize` | i | `15` | <code>int</code> |
| `nEval` | i |  | <code>int</code> |

Produces <code><abbr title="java.util.function.Function">Function</abbr>&lt;S, <abbr title="io.github.ericmedvet.jgea.core.solver.OpenAIEvolutionaryStrategy">OpenAIEvolutionaryStrategy</abbr>&lt;S, Q&gt;&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.Solvers.openAiEs()` by jgea-experimenter:2.4.10:2023-10-20T07:25:19Z

### Builder `ea.solver.simpleEs()`

`ea.s.simpleEs(mapper; initialMinV; initialMaxV; sigma; parentsRate; nOfElites; nPop; nEval; remap)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `mapper` | npm |  | <code><abbr title="io.github.ericmedvet.jgea.experimenter.InvertibleMapper">InvertibleMapper</abbr>&lt;<abbr title="java.util.List">List</abbr>&lt;<abbr title="java.lang.Double">Double</abbr>&gt;, S&gt;</code> |
| `initialMinV` | d | `-1.0` | <code>double</code> |
| `initialMaxV` | d | `1.0` | <code>double</code> |
| `sigma` | d | `0.35` | <code>double</code> |
| `parentsRate` | d | `0.33` | <code>double</code> |
| `nOfElites` | i | `1` | <code>int</code> |
| `nPop` | i | `30` | <code>int</code> |
| `nEval` | i |  | <code>int</code> |
| `remap` | b | `false` | <code>boolean</code> |

Produces <code><abbr title="java.util.function.Function">Function</abbr>&lt;S, <abbr title="io.github.ericmedvet.jgea.core.solver.SimpleEvolutionaryStrategy">SimpleEvolutionaryStrategy</abbr>&lt;S, Q&gt;&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.Solvers.simpleEs()` by jgea-experimenter:2.4.10:2023-10-20T07:25:19Z

### Builder `ea.solver.srTreeGp()`

`ea.s.srTreeGp(mapper; constants; operators; minTreeH; maxTreeH; crossoverP; tournamentRate; minNTournament; nPop; nEval; diversity; nAttemptsDiversity; remap)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `mapper` | npm |  | <code><abbr title="io.github.ericmedvet.jgea.experimenter.InvertibleMapper">InvertibleMapper</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.representation.tree.Tree">Tree</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.representation.tree.numeric.Element">Element</abbr>&gt;, S&gt;</code> |
| `constants` | d[] | `[0.1, 1.0, 10.0]` | <code><abbr title="java.util.List">List</abbr>&lt;<abbr title="java.lang.Double">Double</abbr>&gt;</code> |
| `operators` | e[] | `[+, -, *, p/, plog]` | <code><abbr title="java.util.List">List</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.representation.tree.numeric.Element$Operator">Element$Operator</abbr>&gt;</code> |
| `minTreeH` | i | `4` | <code>int</code> |
| `maxTreeH` | i | `10` | <code>int</code> |
| `crossoverP` | d | `0.8` | <code>double</code> |
| `tournamentRate` | d | `0.05` | <code>double</code> |
| `minNTournament` | i | `3` | <code>int</code> |
| `nPop` | i | `100` | <code>int</code> |
| `nEval` | i |  | <code>int</code> |
| `diversity` | b | `true` | <code>boolean</code> |
| `nAttemptsDiversity` | i | `100` | <code>int</code> |
| `remap` | b | `false` | <code>boolean</code> |

Produces <code><abbr title="java.util.function.Function">Function</abbr>&lt;S, <abbr title="io.github.ericmedvet.jgea.core.solver.StandardEvolver">StandardEvolver</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.representation.tree.Tree">Tree</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.representation.tree.numeric.Element">Element</abbr>&gt;, S, Q&gt;, <abbr title="io.github.ericmedvet.jgea.core.problem.QualityBasedProblem">QualityBasedProblem</abbr>&lt;S, Q&gt;, <abbr title="io.github.ericmedvet.jgea.core.representation.tree.Tree">Tree</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.representation.tree.numeric.Element">Element</abbr>&gt;, S, Q&gt;&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.Solvers.srTreeGp()` by jgea-experimenter:2.4.10:2023-10-20T07:25:19Z

### Builder `ea.solver.srTreeRandomWalk()`

`ea.s.srTreeRandomWalk(mapper; constants; operators; minTreeH; maxTreeH; nEval; remap)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `mapper` | npm |  | <code><abbr title="io.github.ericmedvet.jgea.experimenter.InvertibleMapper">InvertibleMapper</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.representation.tree.Tree">Tree</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.representation.tree.numeric.Element">Element</abbr>&gt;, S&gt;</code> |
| `constants` | d[] | `[0.1, 1.0, 10.0]` | <code><abbr title="java.util.List">List</abbr>&lt;<abbr title="java.lang.Double">Double</abbr>&gt;</code> |
| `operators` | e[] | `[+, -, *, p/, plog]` | <code><abbr title="java.util.List">List</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.representation.tree.numeric.Element$Operator">Element$Operator</abbr>&gt;</code> |
| `minTreeH` | i | `4` | <code>int</code> |
| `maxTreeH` | i | `10` | <code>int</code> |
| `nEval` | i |  | <code>int</code> |
| `remap` | b | `false` | <code>boolean</code> |

Produces <code><abbr title="java.util.function.Function">Function</abbr>&lt;S, <abbr title="io.github.ericmedvet.jgea.core.solver.RandomWalk">RandomWalk</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.problem.QualityBasedProblem">QualityBasedProblem</abbr>&lt;S, Q&gt;, <abbr title="io.github.ericmedvet.jgea.core.representation.tree.Tree">Tree</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.representation.tree.numeric.Element">Element</abbr>&gt;, S, Q&gt;&gt;</code>; built from `io.github.ericmedvet.jgea.experimenter.builders.Solvers.srTreeRandomWalk()` by jgea-experimenter:2.4.10:2023-10-20T07:25:19Z

## Package `evorobots`

Aliases: `er`, `evorobots`

### Builder `evorobots.doublesRandomizer()`

`er.doublesRandomizer(randomGenerator; range)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `randomGenerator` | npm | `sim.defaultRG()` | <code><abbr title="java.util.random.RandomGenerator">RandomGenerator</abbr></code> |
| `range` | npm | `sim.range(min = -1; max = 1)` | <code><abbr title="io.github.ericmedvet.jsdynsym.core.DoubleRange">DoubleRange</abbr></code> |

Produces <code><abbr title="java.util.function.Function">Function</abbr>&lt;<abbr title="java.util.List">List</abbr>&lt;<abbr title="java.lang.Double">Double</abbr>&gt;, <abbr title="java.util.List">List</abbr>&lt;<abbr title="java.lang.Double">Double</abbr>&gt;&gt;</code>; built from `io.github.ericmedvet.robotevo2d.main.builders.Misc.doublesRandomizer()` by robotevo2d-main:1.3.2:2023-10-20T07:31:43Z

### Builder `evorobots.fromBase64()`

`er.fromBase64(s)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `s` | s |  | <code><abbr title="java.lang.String">String</abbr></code> |

Produces <code><abbr title="java.util.function.Function">Function</abbr>&lt;<abbr title="java.lang.Object">Object</abbr>, <abbr title="java.lang.Object">Object</abbr>&gt;</code>; built from `io.github.ericmedvet.robotevo2d.main.builders.Misc.fromBase64()` by robotevo2d-main:1.3.2:2023-10-20T07:31:43Z

### Builder `evorobots.fromRunOutcome()`

`er.fromRunOutcome(filePath; index)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `filePath` | s |  | <code><abbr title="java.lang.String">String</abbr></code> |
| `index` | i | `0` | <code>int</code> |

Produces <code><abbr title="java.util.function.Function">Function</abbr>&lt;<abbr title="java.lang.Object">Object</abbr>, <abbr title="java.lang.Object">Object</abbr>&gt;</code>; built from `io.github.ericmedvet.robotevo2d.main.builders.Misc.fromRunOutcome()` by robotevo2d-main:1.3.2:2023-10-20T07:31:43Z

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

Produces <code><abbr title="io.github.ericmedvet.robotevo2d.main.Play">Play</abbr></code>; built from `io.github.ericmedvet.robotevo2d.main.Play()` by robotevo2d-main:1.3.2:2023-10-20T07:31:43Z

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
| `individual` | npm | `ea.nf.best()` | <code><abbr title="java.util.function.Function">Function</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr>&lt;?, A, ?&gt;, <abbr title="io.github.ericmedvet.jgea.core.solver.Individual">Individual</abbr>&lt;?, A, ?&gt;&gt;</code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.core.listener.AccumulatorFactory">AccumulatorFactory</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr>&lt;?, A, ?&gt;, <abbr title="java.io.File">File</abbr>, <abbr title="io.github.ericmedvet.jgea.experimenter.Run">Run</abbr>&lt;?, ?, A, ?&gt;&gt;</code>; built from `io.github.ericmedvet.robotevo2d.main.builders.Misc.video()` by robotevo2d-main:1.3.2:2023-10-20T07:31:43Z

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

Produces <code><abbr title="io.github.ericmedvet.robotevo2d.main.builders.PlayConsumers$ProducingConsumer">PlayConsumers$ProducingConsumer</abbr></code>; built from `io.github.ericmedvet.robotevo2d.main.builders.PlayConsumers.frames()` by robotevo2d-main:1.3.2:2023-10-20T07:31:43Z

### Builder `evorobots.consumer.rtGUI()`

`er.c.rtGUI(title; drawer; frameRate)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `title` | s |  | <code><abbr title="java.lang.String">String</abbr></code> |
| `drawer` | npm | `sim.drawer()` | <code><abbr title="java.util.function.Function">Function</abbr>&lt;<abbr title="java.lang.String">String</abbr>, <abbr title="io.github.ericmedvet.mrsim2d.viewer.Drawer">Drawer</abbr>&gt;</code> |
| `frameRate` | d | `30.0` | <code>double</code> |

Produces <code><abbr title="io.github.ericmedvet.robotevo2d.main.builders.PlayConsumers$ProducingConsumer">PlayConsumers$ProducingConsumer</abbr></code>; built from `io.github.ericmedvet.robotevo2d.main.builders.PlayConsumers.rtGUI()` by robotevo2d-main:1.3.2:2023-10-20T07:31:43Z

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

Produces <code><abbr title="java.util.function.Consumer">Consumer</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.Snapshot">Snapshot</abbr>&gt;</code>; built from `io.github.ericmedvet.robotevo2d.main.builders.PlayConsumers.video()` by robotevo2d-main:1.3.2:2023-10-20T07:31:43Z

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

Produces <code><abbr title="io.github.ericmedvet.jsdynsym.buildable.builders.NumericalDynamicalSystems$Builder">NumericalDynamicalSystems$Builder</abbr>&lt;<abbr title="io.github.ericmedvet.robotevo2d.main.dynamicalsystems.IOSaver">IOSaver</abbr>&lt;S&gt;, S&gt;</code>; built from `io.github.ericmedvet.robotevo2d.main.builders.NumericalDynamicalSystems.ioSaver()` by robotevo2d-main:1.3.2:2023-10-20T07:31:43Z

### Builder `evorobots.dynamicalSystem.numerical.oGraphMRF()`

`er.ds.num.oGraphMRF(postOperator)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `postOperator` | e | `IDENTITY` | <code><abbr title="io.github.ericmedvet.jsdynsym.core.numerical.ann.MultiLayerPerceptron$ActivationFunction">MultiLayerPerceptron$ActivationFunction</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.jsdynsym.buildable.builders.NumericalDynamicalSystems$Builder">NumericalDynamicalSystems$Builder</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.representation.NamedMultivariateRealFunction">NamedMultivariateRealFunction</abbr>, <abbr title="io.github.ericmedvet.jsdynsym.core.StatelessSystem$State">StatelessSystem$State</abbr>&gt;</code>; built from `io.github.ericmedvet.robotevo2d.main.builders.NumericalDynamicalSystems.oGraphMRF()` by robotevo2d-main:1.3.2:2023-10-20T07:31:43Z

### Builder `evorobots.dynamicalSystem.numerical.treeMRF()`

`er.ds.num.treeMRF(postOperator)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `postOperator` | e | `IDENTITY` | <code><abbr title="io.github.ericmedvet.jsdynsym.core.numerical.ann.MultiLayerPerceptron$ActivationFunction">MultiLayerPerceptron$ActivationFunction</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.jsdynsym.buildable.builders.NumericalDynamicalSystems$Builder">NumericalDynamicalSystems$Builder</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.representation.NamedMultivariateRealFunction">NamedMultivariateRealFunction</abbr>, <abbr title="io.github.ericmedvet.jsdynsym.core.StatelessSystem$State">StatelessSystem$State</abbr>&gt;</code>; built from `io.github.ericmedvet.robotevo2d.main.builders.NumericalDynamicalSystems.treeMRF()` by robotevo2d-main:1.3.2:2023-10-20T07:31:43Z

## Package `evorobots.listener`

Aliases: `er.l`, `er.listener`, `evorobots.l`, `evorobots.listener`

### Builder `evorobots.listener.videoSaver()`

`er.l.videoSaver(videos)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `videos` | npm[] | `[]` | <code><abbr title="java.util.List">List</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.listener.AccumulatorFactory">AccumulatorFactory</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr>&lt;?, A, ?&gt;, <abbr title="java.io.File">File</abbr>, <abbr title="io.github.ericmedvet.jgea.experimenter.Run">Run</abbr>&lt;?, ?, A, ?&gt;&gt;&gt;</code> |

Produces <code><abbr title="java.util.function.BiFunction">BiFunction</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.experimenter.Experiment">Experiment</abbr>, <abbr title="java.util.concurrent.ExecutorService">ExecutorService</abbr>, <abbr title="io.github.ericmedvet.jgea.core.listener.ListenerFactory">ListenerFactory</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr>&lt;?, A, ?&gt;, <abbr title="io.github.ericmedvet.jgea.experimenter.Run">Run</abbr>&lt;?, ?, A, ?&gt;&gt;&gt;</code>; built from `io.github.ericmedvet.robotevo2d.main.builders.Listeners.videoSaver()` by robotevo2d-main:1.3.2:2023-10-20T07:31:43Z

## Package `evorobots.mapper`

Aliases: `er.m`, `er.mapper`, `evorobots.m`, `evorobots.mapper`

### Builder `evorobots.mapper.intStringReactiveGridVSR()`

`er.m.intStringReactiveGridVSR(w; h; availableVoxels)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `w` | i |  | <code>int</code> |
| `h` | i |  | <code>int</code> |
| `availableVoxels` | npm[] | `[]` | <code><abbr title="java.util.List">List</abbr>&lt;<abbr title="java.util.function.Supplier">Supplier</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.agents.gridvsr.ReactiveGridVSR$ReactiveVoxel">ReactiveGridVSR$ReactiveVoxel</abbr>&gt;&gt;</code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.experimenter.InvertibleMapper">InvertibleMapper</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.representation.sequence.integer.IntString">IntString</abbr>, <abbr title="java.util.function.Supplier">Supplier</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.agents.gridvsr.ReactiveGridVSR">ReactiveGridVSR</abbr>&gt;&gt;</code>; built from `io.github.ericmedvet.robotevo2d.main.builders.Mappers.intStringReactiveGridVSR()` by robotevo2d-main:1.3.2:2023-10-20T07:31:43Z

### Builder `evorobots.mapper.nmrfReactiveGridVSR()`

`er.m.nmrfReactiveGridVSR(w; h; availableVoxels)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `w` | i |  | <code>int</code> |
| `h` | i |  | <code>int</code> |
| `availableVoxels` | npm[] | `[]` | <code><abbr title="java.util.List">List</abbr>&lt;<abbr title="java.util.function.Supplier">Supplier</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.agents.gridvsr.ReactiveGridVSR$ReactiveVoxel">ReactiveGridVSR$ReactiveVoxel</abbr>&gt;&gt;</code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.experimenter.InvertibleMapper">InvertibleMapper</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.representation.NamedMultivariateRealFunction">NamedMultivariateRealFunction</abbr>, <abbr title="java.util.function.Supplier">Supplier</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.agents.gridvsr.ReactiveGridVSR">ReactiveGridVSR</abbr>&gt;&gt;</code>; built from `io.github.ericmedvet.robotevo2d.main.builders.Mappers.nmrfReactiveGridVSR()` by robotevo2d-main:1.3.2:2023-10-20T07:31:43Z

### Builder `evorobots.mapper.numericalParametrizedHeteroBrains()`

`er.m.numericalParametrizedHeteroBrains(target)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `target` | npm |  | <code>T</code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.experimenter.InvertibleMapper">InvertibleMapper</abbr>&lt;<abbr title="java.util.List">List</abbr>&lt;<abbr title="java.lang.Double">Double</abbr>&gt;, <abbr title="java.util.function.Supplier">Supplier</abbr>&lt;T&gt;&gt;</code>; built from `io.github.ericmedvet.robotevo2d.main.builders.Mappers.numericalParametrizedHeteroBrains()` by robotevo2d-main:1.3.2:2023-10-20T07:31:43Z

### Builder `evorobots.mapper.numericalParametrizedHomoBrains()`

`er.m.numericalParametrizedHomoBrains(target)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `target` | npm |  | <code>T</code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.experimenter.InvertibleMapper">InvertibleMapper</abbr>&lt;<abbr title="java.util.List">List</abbr>&lt;<abbr title="java.lang.Double">Double</abbr>&gt;, <abbr title="java.util.function.Supplier">Supplier</abbr>&lt;T&gt;&gt;</code>; built from `io.github.ericmedvet.robotevo2d.main.builders.Mappers.numericalParametrizedHomoBrains()` by robotevo2d-main:1.3.2:2023-10-20T07:31:43Z

### Builder `evorobots.mapper.oGraphParametrizedHomoBrains()`

`er.m.oGraphParametrizedHomoBrains(target)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `target` | npm |  | <code>T</code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.experimenter.InvertibleMapper">InvertibleMapper</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.representation.graph.Graph">Graph</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.representation.graph.Node">Node</abbr>, <abbr title="io.github.ericmedvet.jgea.core.representation.graph.numeric.operatorgraph.OperatorGraph$NonValuedArc">OperatorGraph$NonValuedArc</abbr>&gt;, <abbr title="java.util.function.Supplier">Supplier</abbr>&lt;T&gt;&gt;</code>; built from `io.github.ericmedvet.robotevo2d.main.builders.Mappers.oGraphParametrizedHomoBrains()` by robotevo2d-main:1.3.2:2023-10-20T07:31:43Z

### Builder `evorobots.mapper.treeParametrizedHomoBrains()`

`er.m.treeParametrizedHomoBrains(target)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `target` | npm |  | <code>T</code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.experimenter.InvertibleMapper">InvertibleMapper</abbr>&lt;<abbr title="java.util.List">List</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.representation.tree.Tree">Tree</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.representation.tree.numeric.Element">Element</abbr>&gt;&gt;, <abbr title="java.util.function.Supplier">Supplier</abbr>&lt;T&gt;&gt;</code>; built from `io.github.ericmedvet.robotevo2d.main.builders.Mappers.treeParametrizedHomoBrains()` by robotevo2d-main:1.3.2:2023-10-20T07:31:43Z

## Package `evorobots.namedFunction`

Aliases: `er.namedFunction`, `er.nf`, `evorobots.namedFunction`, `evorobots.nf`

### Builder `evorobots.namedFunction.compactness()`

`er.nf.compactness(f)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `f` | npm |  | <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;X, <abbr title="io.github.ericmedvet.jsdynsym.grid.Grid">Grid</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.agents.gridvsr.GridBody$Element">GridBody$Element</abbr>&gt;&gt;</code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;X, <abbr title="java.lang.Double">Double</abbr>&gt;</code>; built from `io.github.ericmedvet.robotevo2d.main.builders.NamedFunctions.compactness()` by robotevo2d-main:1.3.2:2023-10-20T07:31:43Z

### Builder `evorobots.namedFunction.count()`

`er.nf.count(f)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `f` | npm |  | <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;X, <abbr title="io.github.ericmedvet.jsdynsym.grid.Grid">Grid</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.agents.gridvsr.GridBody$Element">GridBody$Element</abbr>&gt;&gt;</code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;X, <abbr title="java.lang.Integer">Integer</abbr>&gt;</code>; built from `io.github.ericmedvet.robotevo2d.main.builders.NamedFunctions.count()` by robotevo2d-main:1.3.2:2023-10-20T07:31:43Z

### Builder `evorobots.namedFunction.elongation()`

`er.nf.elongation(f)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `f` | npm |  | <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;X, <abbr title="io.github.ericmedvet.jsdynsym.grid.Grid">Grid</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.agents.gridvsr.GridBody$Element">GridBody$Element</abbr>&gt;&gt;</code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;X, <abbr title="java.lang.Double">Double</abbr>&gt;</code>; built from `io.github.ericmedvet.robotevo2d.main.builders.NamedFunctions.elongation()` by robotevo2d-main:1.3.2:2023-10-20T07:31:43Z

### Builder `evorobots.namedFunction.f()`

`er.nf.f(inner; name; s)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `inner` | npm |  | <code><abbr title="java.util.function.Function">Function</abbr>&lt;T, R&gt;</code> |
| `name` | s |  | <code><abbr title="java.lang.String">String</abbr></code> |
| `s` | s | `%s` | <code><abbr title="java.lang.String">String</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;T, R&gt;</code>; built from `io.github.ericmedvet.robotevo2d.main.builders.NamedFunctions.f()` by robotevo2d-main:1.3.2:2023-10-20T07:31:43Z

### Builder `evorobots.namedFunction.gridBody()`

`er.nf.gridBody(f)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `f` | npm |  | <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;X, <abbr title="java.util.function.Supplier">Supplier</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.agents.gridvsr.AbstractGridVSR">AbstractGridVSR</abbr>&gt;&gt;</code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;X, <abbr title="io.github.ericmedvet.jsdynsym.grid.Grid">Grid</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.agents.gridvsr.GridBody$Element">GridBody$Element</abbr>&gt;&gt;</code>; built from `io.github.ericmedvet.robotevo2d.main.builders.NamedFunctions.gridBody()` by robotevo2d-main:1.3.2:2023-10-20T07:31:43Z

### Builder `evorobots.namedFunction.h()`

`er.nf.h(f)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `f` | npm |  | <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;X, <abbr title="io.github.ericmedvet.jsdynsym.grid.Grid">Grid</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.agents.gridvsr.GridBody$Element">GridBody$Element</abbr>&gt;&gt;</code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;X, <abbr title="java.lang.Integer">Integer</abbr>&gt;</code>; built from `io.github.ericmedvet.robotevo2d.main.builders.NamedFunctions.h()` by robotevo2d-main:1.3.2:2023-10-20T07:31:43Z

### Builder `evorobots.namedFunction.stringBase64()`

`er.nf.stringBase64(f)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `f` | npm |  | <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;X, <abbr title="java.io.Serializable">Serializable</abbr>&gt;</code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;X, <abbr title="java.lang.String">String</abbr>&gt;</code>; built from `io.github.ericmedvet.robotevo2d.main.builders.NamedFunctions.stringBase64()` by robotevo2d-main:1.3.2:2023-10-20T07:31:43Z

### Builder `evorobots.namedFunction.w()`

`er.nf.w(f)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `f` | npm |  | <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;X, <abbr title="io.github.ericmedvet.jsdynsym.grid.Grid">Grid</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.agents.gridvsr.GridBody$Element">GridBody$Element</abbr>&gt;&gt;</code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;X, <abbr title="java.lang.Integer">Integer</abbr>&gt;</code>; built from `io.github.ericmedvet.robotevo2d.main.builders.NamedFunctions.w()` by robotevo2d-main:1.3.2:2023-10-20T07:31:43Z

## Package `sim`

Aliases: `s`, `sim`

### Builder `sim.defaultRG()`

`s.defaultRG(seed)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `seed` | i | `0` | <code>int</code> |

Produces <code><abbr title="java.util.random.RandomGenerator">RandomGenerator</abbr></code>; built from `io.github.ericmedvet.mrsim2d.buildable.builders.Misc.defaultRG()` by mrsim2d-buildable:1.0.2:2023-10-20T07:22:12Z

### Builder `sim.drawer()`

`s.drawer(enlargement; followTime; profilingTime; miniWorldEnlargement; miniWorld; miniAgents; engineProfiling; actions; nfc)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `enlargement` | d | `1.5` | <code>double</code> |
| `followTime` | d | `2.0` | <code>double</code> |
| `profilingTime` | d | `1.0` | <code>double</code> |
| `miniWorldEnlargement` | d | `10.0` | <code>double</code> |
| `miniWorld` | b | `false` | <code>boolean</code> |
| `miniAgents` | e | `BRAINS` | <code><abbr title="io.github.ericmedvet.mrsim2d.buildable.builders.Misc$MiniAgentInfo">Misc$MiniAgentInfo</abbr></code> |
| `engineProfiling` | b | `false` | <code>boolean</code> |
| `actions` | b | `false` | <code>boolean</code> |
| `nfc` | b | `false` | <code>boolean</code> |

Produces <code><abbr title="java.util.function.Function">Function</abbr>&lt;<abbr title="java.lang.String">String</abbr>, <abbr title="io.github.ericmedvet.mrsim2d.viewer.Drawer">Drawer</abbr>&gt;</code>; built from `io.github.ericmedvet.mrsim2d.buildable.builders.Misc.drawer()` by mrsim2d-buildable:1.0.2:2023-10-20T07:22:12Z

### Builder `sim.engine()`

`s.engine()`

Produces <code><abbr title="java.util.function.Supplier">Supplier</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.engine.Engine">Engine</abbr>&gt;</code>; built from `io.github.ericmedvet.mrsim2d.buildable.builders.Misc.engine()` by mrsim2d-buildable:1.0.2:2023-10-20T07:22:12Z

### Builder `sim.range()`

`s.range(min; max)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `min` | d |  | <code>double</code> |
| `max` | d |  | <code>double</code> |

Produces <code><abbr title="io.github.ericmedvet.jsdynsym.core.DoubleRange">DoubleRange</abbr></code>; built from `io.github.ericmedvet.mrsim2d.buildable.builders.Misc.range()` by mrsim2d-buildable:1.0.2:2023-10-20T07:22:12Z

### Builder `sim.supplier()`

`s.supplier(of)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `of` | npm |  | <code>T</code> |

Produces <code><abbr title="java.util.function.Supplier">Supplier</abbr>&lt;T&gt;</code>; built from `io.github.ericmedvet.mrsim2d.buildable.builders.Misc.supplier()` by mrsim2d-buildable:1.0.2:2023-10-20T07:22:12Z

### Builder `sim.taskRunner()`

`s.taskRunner(task; engine)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `task` | npm |  | <code><abbr title="io.github.ericmedvet.mrsim2d.core.tasks.Task">Task</abbr>&lt;A, O&gt;</code> |
| `engine` | npm | `sim.engine()` | <code><abbr title="java.util.function.Supplier">Supplier</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.engine.Engine">Engine</abbr>&gt;</code> |

Produces <code><abbr title="java.util.function.Function">Function</abbr>&lt;A, O&gt;</code>; built from `io.github.ericmedvet.mrsim2d.buildable.builders.Misc.taskRunner()` by mrsim2d-buildable:1.0.2:2023-10-20T07:22:12Z

## Package `sim.agent`

Aliases: `s.a`, `s.agent`, `sim.a`, `sim.agent`

### Builder `sim.agent.centralizedNumGridVSR()`

`s.a.centralizedNumGridVSR(body; function)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `body` | npm |  | <code><abbr title="io.github.ericmedvet.mrsim2d.core.agents.gridvsr.GridBody">GridBody</abbr></code> |
| `function` | npm |  | <code><abbr title="io.github.ericmedvet.jsdynsym.buildable.builders.NumericalDynamicalSystems$Builder">NumericalDynamicalSystems$Builder</abbr>&lt;?, ?&gt;</code> |

Produces <code><abbr title="io.github.ericmedvet.mrsim2d.core.agents.gridvsr.CentralizedNumGridVSR">CentralizedNumGridVSR</abbr></code>; built from `io.github.ericmedvet.mrsim2d.buildable.builders.Agents.centralizedNumGridVSR()` by mrsim2d-buildable:1.0.2:2023-10-20T07:22:12Z

### Builder `sim.agent.distributedNumGridVSR()`

`s.a.distributedNumGridVSR(body; function; signals; directional)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `body` | npm |  | <code><abbr title="io.github.ericmedvet.mrsim2d.core.agents.gridvsr.GridBody">GridBody</abbr></code> |
| `function` | npm |  | <code><abbr title="io.github.ericmedvet.jsdynsym.buildable.builders.NumericalDynamicalSystems$Builder">NumericalDynamicalSystems$Builder</abbr>&lt;?, ?&gt;</code> |
| `signals` | i |  | <code>int</code> |
| `directional` | b | `false` | <code>boolean</code> |

Produces <code><abbr title="io.github.ericmedvet.mrsim2d.core.agents.gridvsr.DistributedNumGridVSR">DistributedNumGridVSR</abbr></code>; built from `io.github.ericmedvet.mrsim2d.buildable.builders.Agents.distributedNumGridVSR()` by mrsim2d-buildable:1.0.2:2023-10-20T07:22:12Z

### Builder `sim.agent.numIndependentVoxel()`

`s.a.numIndependentVoxel(sensors; areaActuation; attachActuation; nOfNFCChannels; function)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `sensors` | npm[] | `[]` | <code><abbr title="java.util.List">List</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.Sensor">Sensor</abbr>&lt;? super <abbr title="io.github.ericmedvet.mrsim2d.core.bodies.Voxel">Voxel</abbr>&gt;&gt;</code> |
| `areaActuation` | e | `SIDES` | <code><abbr title="io.github.ericmedvet.mrsim2d.core.agents.independentvoxel.NumIndependentVoxel$AreaActuation">NumIndependentVoxel$AreaActuation</abbr></code> |
| `attachActuation` | b | `true` | <code>boolean</code> |
| `nOfNFCChannels` | i | `1` | <code>int</code> |
| `function` | npm |  | <code><abbr title="io.github.ericmedvet.jsdynsym.buildable.builders.NumericalDynamicalSystems$Builder">NumericalDynamicalSystems$Builder</abbr>&lt;?, ?&gt;</code> |

Produces <code><abbr title="io.github.ericmedvet.mrsim2d.core.agents.independentvoxel.NumIndependentVoxel">NumIndependentVoxel</abbr></code>; built from `io.github.ericmedvet.mrsim2d.buildable.builders.Agents.numIndependentVoxel()` by mrsim2d-buildable:1.0.2:2023-10-20T07:22:12Z

### Builder `sim.agent.numLeggedHybridModularRobot()`

`s.a.numLeggedHybridModularRobot(modules; function)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `modules` | npm[] | `[]` | <code><abbr title="java.util.List">List</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.agents.legged.AbstractLeggedHybridModularRobot$Module">AbstractLeggedHybridModularRobot$Module</abbr>&gt;</code> |
| `function` | npm |  | <code><abbr title="io.github.ericmedvet.jsdynsym.buildable.builders.NumericalDynamicalSystems$Builder">NumericalDynamicalSystems$Builder</abbr>&lt;?, ?&gt;</code> |

Produces <code><abbr title="io.github.ericmedvet.mrsim2d.core.agents.legged.NumLeggedHybridModularRobot">NumLeggedHybridModularRobot</abbr></code>; built from `io.github.ericmedvet.mrsim2d.buildable.builders.Agents.numLeggedHybridModularRobot()` by mrsim2d-buildable:1.0.2:2023-10-20T07:22:12Z

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

Produces <code><abbr title="io.github.ericmedvet.mrsim2d.core.agents.legged.NumLeggedHybridRobot">NumLeggedHybridRobot</abbr></code>; built from `io.github.ericmedvet.mrsim2d.buildable.builders.Agents.numLeggedHybridRobot()` by mrsim2d-buildable:1.0.2:2023-10-20T07:22:12Z

### Builder `sim.agent.reactiveGridVSR()`

`s.a.reactiveGridVSR(body)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `body` | npm |  | <code><abbr title="io.github.ericmedvet.jsdynsym.grid.Grid">Grid</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.agents.gridvsr.ReactiveGridVSR$ReactiveVoxel">ReactiveGridVSR$ReactiveVoxel</abbr>&gt;</code> |

Produces <code><abbr title="io.github.ericmedvet.mrsim2d.core.agents.gridvsr.ReactiveGridVSR">ReactiveGridVSR</abbr></code>; built from `io.github.ericmedvet.mrsim2d.buildable.builders.Agents.reactiveGridVSR()` by mrsim2d-buildable:1.0.2:2023-10-20T07:22:12Z

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

Produces <code><abbr title="io.github.ericmedvet.mrsim2d.core.agents.legged.AbstractLeggedHybridRobot$Leg">AbstractLeggedHybridRobot$Leg</abbr></code>; built from `io.github.ericmedvet.mrsim2d.buildable.builders.LeggedMisc.leg()` by mrsim2d-buildable:1.0.2:2023-10-20T07:22:12Z

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
| `activeAngleRange` | npm | `sim.range(min = -1.047; max = 1.047)` | <code><abbr title="io.github.ericmedvet.jsdynsym.core.DoubleRange">DoubleRange</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.mrsim2d.core.agents.legged.LegChunk">LegChunk</abbr></code>; built from `io.github.ericmedvet.mrsim2d.buildable.builders.LeggedMisc.legChunk()` by mrsim2d-buildable:1.0.2:2023-10-20T07:22:12Z

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

Produces <code><abbr title="io.github.ericmedvet.mrsim2d.core.agents.legged.AbstractLeggedHybridModularRobot$Module">AbstractLeggedHybridModularRobot$Module</abbr></code>; built from `io.github.ericmedvet.mrsim2d.buildable.builders.LeggedMisc.module()` by mrsim2d-buildable:1.0.2:2023-10-20T07:22:12Z

## Package `sim.agent.vsr`

Aliases: `s.a.vsr`, `s.agent.vsr`, `sim.a.vsr`, `sim.agent.vsr`

### Builder `sim.agent.vsr.gridBody()`

`s.a.vsr.gridBody(shape; sensorizingFunction)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `shape` | npm |  | <code><abbr title="io.github.ericmedvet.jsdynsym.grid.Grid">Grid</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.agents.gridvsr.GridBody$VoxelType">GridBody$VoxelType</abbr>&gt;</code> |
| `sensorizingFunction` | npm |  | <code><abbr title="java.util.function.Function">Function</abbr>&lt;<abbr title="io.github.ericmedvet.jsdynsym.grid.Grid">Grid</abbr>&lt;<abbr title="java.lang.Boolean">Boolean</abbr>&gt;, <abbr title="io.github.ericmedvet.jsdynsym.grid.Grid">Grid</abbr>&lt;<abbr title="java.util.List">List</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.Sensor">Sensor</abbr>&lt;? super <abbr title="io.github.ericmedvet.mrsim2d.core.bodies.Body">Body</abbr>&gt;&gt;&gt;&gt;</code> |

Produces <code><abbr title="io.github.ericmedvet.mrsim2d.core.agents.gridvsr.GridBody">GridBody</abbr></code>; built from `io.github.ericmedvet.mrsim2d.buildable.builders.VSRMisc.gridBody()` by mrsim2d-buildable:1.0.2:2023-10-20T07:22:12Z

## Package `sim.agent.vsr.reactiveVoxel`

Aliases: `s.a.vsr.reactiveVoxel`, `s.a.vsr.rv`, `s.agent.vsr.reactiveVoxel`, `s.agent.vsr.rv`, `sim.a.vsr.reactiveVoxel`, `sim.a.vsr.rv`, `sim.agent.vsr.reactiveVoxel`, `sim.agent.vsr.rv`

### Builder `sim.agent.vsr.reactiveVoxel.aa()`

`s.a.vsr.rv.aa(angle; action)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `angle` | d | `0.0` | <code>double</code> |
| `action` | e | `EXPAND` | <code><abbr title="io.github.ericmedvet.mrsim2d.buildable.builders.ReactiveVoxels$Action">ReactiveVoxels$Action</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.mrsim2d.core.agents.gridvsr.ReactiveGridVSR$ReactiveVoxel">ReactiveGridVSR$ReactiveVoxel</abbr></code>; built from `io.github.ericmedvet.mrsim2d.buildable.builders.ReactiveVoxels.aa()` by mrsim2d-buildable:1.0.2:2023-10-20T07:22:12Z

### Builder `sim.agent.vsr.reactiveVoxel.asin()`

`s.a.vsr.rv.asin(f)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `f` | d | `1.0` | <code>double</code> |

Produces <code><abbr title="io.github.ericmedvet.mrsim2d.core.agents.gridvsr.ReactiveGridVSR$ReactiveVoxel">ReactiveGridVSR$ReactiveVoxel</abbr></code>; built from `io.github.ericmedvet.mrsim2d.buildable.builders.ReactiveVoxels.asin()` by mrsim2d-buildable:1.0.2:2023-10-20T07:22:12Z

### Builder `sim.agent.vsr.reactiveVoxel.asld()`

`s.a.vsr.rv.asld(duration; threshold; action)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `duration` | d | `0.2` | <code>double</code> |
| `threshold` | d | `0.05` | <code>double</code> |
| `action` | e | `EXPAND` | <code><abbr title="io.github.ericmedvet.mrsim2d.buildable.builders.ReactiveVoxels$Action">ReactiveVoxels$Action</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.mrsim2d.core.agents.gridvsr.ReactiveGridVSR$ReactiveVoxel">ReactiveGridVSR$ReactiveVoxel</abbr></code>; built from `io.github.ericmedvet.mrsim2d.buildable.builders.ReactiveVoxels.asld()` by mrsim2d-buildable:1.0.2:2023-10-20T07:22:12Z

### Builder `sim.agent.vsr.reactiveVoxel.at()`

`s.a.vsr.rv.at(duration; range; side; action)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `duration` | d | `0.2` | <code>double</code> |
| `range` | d | `1.0` | <code>double</code> |
| `side` | e | `S` | <code><abbr title="io.github.ericmedvet.mrsim2d.core.bodies.Voxel$Side">Voxel$Side</abbr></code> |
| `action` | e | `EXPAND` | <code><abbr title="io.github.ericmedvet.mrsim2d.buildable.builders.ReactiveVoxels$Action">ReactiveVoxels$Action</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.mrsim2d.core.agents.gridvsr.ReactiveGridVSR$ReactiveVoxel">ReactiveGridVSR$ReactiveVoxel</abbr></code>; built from `io.github.ericmedvet.mrsim2d.buildable.builders.ReactiveVoxels.at()` by mrsim2d-buildable:1.0.2:2023-10-20T07:22:12Z

### Builder `sim.agent.vsr.reactiveVoxel.none()`

`s.a.vsr.rv.none()`

Produces <code><abbr title="io.github.ericmedvet.mrsim2d.core.agents.gridvsr.ReactiveGridVSR$ReactiveVoxel">ReactiveGridVSR$ReactiveVoxel</abbr></code>; built from `io.github.ericmedvet.mrsim2d.buildable.builders.ReactiveVoxels.none()` by mrsim2d-buildable:1.0.2:2023-10-20T07:22:12Z

### Builder `sim.agent.vsr.reactiveVoxel.ph()`

`s.a.vsr.rv.ph()`

Produces <code><abbr title="io.github.ericmedvet.mrsim2d.core.agents.gridvsr.ReactiveGridVSR$ReactiveVoxel">ReactiveGridVSR$ReactiveVoxel</abbr></code>; built from `io.github.ericmedvet.mrsim2d.buildable.builders.ReactiveVoxels.ph()` by mrsim2d-buildable:1.0.2:2023-10-20T07:22:12Z

### Builder `sim.agent.vsr.reactiveVoxel.ps()`

`s.a.vsr.rv.ps()`

Produces <code><abbr title="io.github.ericmedvet.mrsim2d.core.agents.gridvsr.ReactiveGridVSR$ReactiveVoxel">ReactiveGridVSR$ReactiveVoxel</abbr></code>; built from `io.github.ericmedvet.mrsim2d.buildable.builders.ReactiveVoxels.ps()` by mrsim2d-buildable:1.0.2:2023-10-20T07:22:12Z

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

Produces <code><abbr title="java.util.function.Function">Function</abbr>&lt;<abbr title="io.github.ericmedvet.jsdynsym.grid.Grid">Grid</abbr>&lt;<abbr title="java.lang.Boolean">Boolean</abbr>&gt;, <abbr title="io.github.ericmedvet.jsdynsym.grid.Grid">Grid</abbr>&lt;<abbr title="java.util.List">List</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.Sensor">Sensor</abbr>&lt;? super <abbr title="io.github.ericmedvet.mrsim2d.core.bodies.Voxel">Voxel</abbr>&gt;&gt;&gt;&gt;</code>; built from `io.github.ericmedvet.mrsim2d.buildable.builders.VSRSensorizingFunctions.directional()` by mrsim2d-buildable:1.0.2:2023-10-20T07:22:12Z

### Builder `sim.agent.vsr.sensorizingFunction.empty()`

`s.a.vsr.sf.empty()`

Produces <code><abbr title="java.util.function.Function">Function</abbr>&lt;<abbr title="io.github.ericmedvet.jsdynsym.grid.Grid">Grid</abbr>&lt;<abbr title="java.lang.Boolean">Boolean</abbr>&gt;, <abbr title="io.github.ericmedvet.jsdynsym.grid.Grid">Grid</abbr>&lt;<abbr title="java.util.List">List</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.Sensor">Sensor</abbr>&lt;? super <abbr title="io.github.ericmedvet.mrsim2d.core.bodies.Voxel">Voxel</abbr>&gt;&gt;&gt;&gt;</code>; built from `io.github.ericmedvet.mrsim2d.buildable.builders.VSRSensorizingFunctions.empty()` by mrsim2d-buildable:1.0.2:2023-10-20T07:22:12Z

### Builder `sim.agent.vsr.sensorizingFunction.uniform()`

`s.a.vsr.sf.uniform(sensors)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `sensors` | npm[] | `[]` | <code><abbr title="java.util.List">List</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.Sensor">Sensor</abbr>&lt;? super <abbr title="io.github.ericmedvet.mrsim2d.core.bodies.Voxel">Voxel</abbr>&gt;&gt;</code> |

Produces <code><abbr title="java.util.function.Function">Function</abbr>&lt;<abbr title="io.github.ericmedvet.jsdynsym.grid.Grid">Grid</abbr>&lt;<abbr title="java.lang.Boolean">Boolean</abbr>&gt;, <abbr title="io.github.ericmedvet.jsdynsym.grid.Grid">Grid</abbr>&lt;<abbr title="java.util.List">List</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.Sensor">Sensor</abbr>&lt;? super <abbr title="io.github.ericmedvet.mrsim2d.core.bodies.Voxel">Voxel</abbr>&gt;&gt;&gt;&gt;</code>; built from `io.github.ericmedvet.mrsim2d.buildable.builders.VSRSensorizingFunctions.uniform()` by mrsim2d-buildable:1.0.2:2023-10-20T07:22:12Z

## Package `sim.agent.vsr.shape`

Aliases: `s.a.vsr.s`, `s.a.vsr.shape`, `s.agent.vsr.s`, `s.agent.vsr.shape`, `sim.a.vsr.s`, `sim.a.vsr.shape`, `sim.agent.vsr.s`, `sim.agent.vsr.shape`

### Builder `sim.agent.vsr.shape.ball()`

`s.a.vsr.s.ball(d)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `d` | i |  | <code><abbr title="java.lang.Integer">Integer</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.jsdynsym.grid.Grid">Grid</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.agents.gridvsr.GridBody$VoxelType">GridBody$VoxelType</abbr>&gt;</code>; built from `io.github.ericmedvet.mrsim2d.buildable.builders.GridShapes.ball()` by mrsim2d-buildable:1.0.2:2023-10-20T07:22:12Z

### Builder `sim.agent.vsr.shape.biped()`

`s.a.vsr.s.biped(w; h)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `w` | i |  | <code><abbr title="java.lang.Integer">Integer</abbr></code> |
| `h` | i |  | <code><abbr title="java.lang.Integer">Integer</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.jsdynsym.grid.Grid">Grid</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.agents.gridvsr.GridBody$VoxelType">GridBody$VoxelType</abbr>&gt;</code>; built from `io.github.ericmedvet.mrsim2d.buildable.builders.GridShapes.biped()` by mrsim2d-buildable:1.0.2:2023-10-20T07:22:12Z

### Builder `sim.agent.vsr.shape.comb()`

`s.a.vsr.s.comb(w; h)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `w` | i |  | <code><abbr title="java.lang.Integer">Integer</abbr></code> |
| `h` | i |  | <code><abbr title="java.lang.Integer">Integer</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.jsdynsym.grid.Grid">Grid</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.agents.gridvsr.GridBody$VoxelType">GridBody$VoxelType</abbr>&gt;</code>; built from `io.github.ericmedvet.mrsim2d.buildable.builders.GridShapes.comb()` by mrsim2d-buildable:1.0.2:2023-10-20T07:22:12Z

### Builder `sim.agent.vsr.shape.free()`

`s.a.vsr.s.free(s)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `s` | s | `rsr-s.s` | <code><abbr title="java.lang.String">String</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.jsdynsym.grid.Grid">Grid</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.agents.gridvsr.GridBody$VoxelType">GridBody$VoxelType</abbr>&gt;</code>; built from `io.github.ericmedvet.mrsim2d.buildable.builders.GridShapes.free()` by mrsim2d-buildable:1.0.2:2023-10-20T07:22:12Z

### Builder `sim.agent.vsr.shape.t()`

`s.a.vsr.s.t(w; h)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `w` | i |  | <code><abbr title="java.lang.Integer">Integer</abbr></code> |
| `h` | i |  | <code><abbr title="java.lang.Integer">Integer</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.jsdynsym.grid.Grid">Grid</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.agents.gridvsr.GridBody$VoxelType">GridBody$VoxelType</abbr>&gt;</code>; built from `io.github.ericmedvet.mrsim2d.buildable.builders.GridShapes.t()` by mrsim2d-buildable:1.0.2:2023-10-20T07:22:12Z

### Builder `sim.agent.vsr.shape.triangle()`

`s.a.vsr.s.triangle(l)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `l` | i |  | <code><abbr title="java.lang.Integer">Integer</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.jsdynsym.grid.Grid">Grid</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.agents.gridvsr.GridBody$VoxelType">GridBody$VoxelType</abbr>&gt;</code>; built from `io.github.ericmedvet.mrsim2d.buildable.builders.GridShapes.triangle()` by mrsim2d-buildable:1.0.2:2023-10-20T07:22:12Z

### Builder `sim.agent.vsr.shape.tripod()`

`s.a.vsr.s.tripod(w; h)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `w` | i |  | <code><abbr title="java.lang.Integer">Integer</abbr></code> |
| `h` | i |  | <code><abbr title="java.lang.Integer">Integer</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.jsdynsym.grid.Grid">Grid</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.agents.gridvsr.GridBody$VoxelType">GridBody$VoxelType</abbr>&gt;</code>; built from `io.github.ericmedvet.mrsim2d.buildable.builders.GridShapes.tripod()` by mrsim2d-buildable:1.0.2:2023-10-20T07:22:12Z

### Builder `sim.agent.vsr.shape.worm()`

`s.a.vsr.s.worm(w; h)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `w` | i |  | <code><abbr title="java.lang.Integer">Integer</abbr></code> |
| `h` | i |  | <code><abbr title="java.lang.Integer">Integer</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.jsdynsym.grid.Grid">Grid</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.agents.gridvsr.GridBody$VoxelType">GridBody$VoxelType</abbr>&gt;</code>; built from `io.github.ericmedvet.mrsim2d.buildable.builders.GridShapes.worm()` by mrsim2d-buildable:1.0.2:2023-10-20T07:22:12Z

## Package `sim.sensors`

Aliases: `s.s`, `s.sensors`, `sim.s`, `sim.sensors`

### Builder `sim.sensors.a()`

`s.s.a()`

Produces <code><abbr title="io.github.ericmedvet.mrsim2d.core.Sensor">Sensor</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.bodies.Body">Body</abbr>&gt;</code>; built from `io.github.ericmedvet.mrsim2d.buildable.builders.Sensors.a()` by mrsim2d-buildable:1.0.2:2023-10-20T07:22:12Z

### Builder `sim.sensors.ar()`

`s.s.ar()`

Produces <code><abbr title="io.github.ericmedvet.mrsim2d.core.Sensor">Sensor</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.bodies.Body">Body</abbr>&gt;</code>; built from `io.github.ericmedvet.mrsim2d.buildable.builders.Sensors.ar()` by mrsim2d-buildable:1.0.2:2023-10-20T07:22:12Z

### Builder `sim.sensors.c()`

`s.s.c()`

Produces <code><abbr title="io.github.ericmedvet.mrsim2d.core.Sensor">Sensor</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.bodies.Body">Body</abbr>&gt;</code>; built from `io.github.ericmedvet.mrsim2d.buildable.builders.Sensors.c()` by mrsim2d-buildable:1.0.2:2023-10-20T07:22:12Z

### Builder `sim.sensors.d()`

`s.s.d(a; r)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `a` | d | `0.0` | <code><abbr title="java.lang.Double">Double</abbr></code> |
| `r` | d | `1.0` | <code><abbr title="java.lang.Double">Double</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.mrsim2d.core.Sensor">Sensor</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.bodies.Body">Body</abbr>&gt;</code>; built from `io.github.ericmedvet.mrsim2d.buildable.builders.Sensors.d()` by mrsim2d-buildable:1.0.2:2023-10-20T07:22:12Z

### Builder `sim.sensors.ja()`

`s.s.ja()`

Produces <code><abbr title="io.github.ericmedvet.mrsim2d.core.Sensor">Sensor</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.bodies.RotationalJoint">RotationalJoint</abbr>&gt;</code>; built from `io.github.ericmedvet.mrsim2d.buildable.builders.Sensors.ja()` by mrsim2d-buildable:1.0.2:2023-10-20T07:22:12Z

### Builder `sim.sensors.rv()`

`s.s.rv(a)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `a` | d | `0.0` | <code><abbr title="java.lang.Double">Double</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.mrsim2d.core.Sensor">Sensor</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.bodies.Body">Body</abbr>&gt;</code>; built from `io.github.ericmedvet.mrsim2d.buildable.builders.Sensors.rv()` by mrsim2d-buildable:1.0.2:2023-10-20T07:22:12Z

### Builder `sim.sensors.sa()`

`s.s.sa(s)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `s` | e |  | <code><abbr title="io.github.ericmedvet.mrsim2d.core.bodies.Voxel$Side">Voxel$Side</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.mrsim2d.core.Sensor">Sensor</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.bodies.Voxel">Voxel</abbr>&gt;</code>; built from `io.github.ericmedvet.mrsim2d.buildable.builders.Sensors.sa()` by mrsim2d-buildable:1.0.2:2023-10-20T07:22:12Z

### Builder `sim.sensors.sc()`

`s.s.sc(s)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `s` | e |  | <code><abbr title="io.github.ericmedvet.mrsim2d.core.bodies.Voxel$Side">Voxel$Side</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.mrsim2d.core.Sensor">Sensor</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.bodies.Voxel">Voxel</abbr>&gt;</code>; built from `io.github.ericmedvet.mrsim2d.buildable.builders.Sensors.sc()` by mrsim2d-buildable:1.0.2:2023-10-20T07:22:12Z

### Builder `sim.sensors.sin()`

`s.s.sin(f; p)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `f` | d | `1.0` | <code><abbr title="java.lang.Double">Double</abbr></code> |
| `p` | d | `0.0` | <code><abbr title="java.lang.Double">Double</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.mrsim2d.core.Sensor">Sensor</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.bodies.Body">Body</abbr>&gt;</code>; built from `io.github.ericmedvet.mrsim2d.buildable.builders.Sensors.sin()` by mrsim2d-buildable:1.0.2:2023-10-20T07:22:12Z

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

Produces <code><abbr title="io.github.ericmedvet.mrsim2d.core.tasks.balancing.Balancing">Balancing</abbr></code>; built from `io.github.ericmedvet.mrsim2d.buildable.builders.Tasks.balancing()` by mrsim2d-buildable:1.0.2:2023-10-20T07:22:12Z

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

Produces <code><abbr title="io.github.ericmedvet.mrsim2d.core.tasks.piling.FallPiling">FallPiling</abbr></code>; built from `io.github.ericmedvet.mrsim2d.buildable.builders.Tasks.fallPiling()` by mrsim2d-buildable:1.0.2:2023-10-20T07:22:12Z

### Builder `sim.task.jumping()`

`s.task.jumping(duration; initialYGap)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `duration` | d | `10.0` | <code>double</code> |
| `initialYGap` | d | `0.1` | <code>double</code> |

Produces <code><abbr title="io.github.ericmedvet.mrsim2d.core.tasks.jumping.Jumping">Jumping</abbr></code>; built from `io.github.ericmedvet.mrsim2d.buildable.builders.Tasks.jumping()` by mrsim2d-buildable:1.0.2:2023-10-20T07:22:12Z

### Builder `sim.task.locomotion()`

`s.task.locomotion(duration; terrain; initialXGap; initialYGap)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `duration` | d | `30.0` | <code>double</code> |
| `terrain` | npm | `sim.terrain.flat()` | <code><abbr title="io.github.ericmedvet.mrsim2d.core.geometry.Terrain">Terrain</abbr></code> |
| `initialXGap` | d | `1.0` | <code>double</code> |
| `initialYGap` | d | `0.1` | <code>double</code> |

Produces <code><abbr title="io.github.ericmedvet.mrsim2d.core.tasks.locomotion.Locomotion">Locomotion</abbr></code>; built from `io.github.ericmedvet.mrsim2d.buildable.builders.Tasks.locomotion()` by mrsim2d-buildable:1.0.2:2023-10-20T07:22:12Z

### Builder `sim.task.prebuiltIndependentLocomotion()`

`s.task.prebuiltIndependentLocomotion(duration; terrain; initialXGap; initialYGap; shape)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `duration` | d | `30.0` | <code>double</code> |
| `terrain` | npm | `sim.terrain.flat()` | <code><abbr title="io.github.ericmedvet.mrsim2d.core.geometry.Terrain">Terrain</abbr></code> |
| `initialXGap` | d | `1.0` | <code>double</code> |
| `initialYGap` | d | `0.1` | <code>double</code> |
| `shape` | npm |  | <code><abbr title="io.github.ericmedvet.jsdynsym.grid.Grid">Grid</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.agents.gridvsr.GridBody$VoxelType">GridBody$VoxelType</abbr>&gt;</code> |

Produces <code><abbr title="io.github.ericmedvet.mrsim2d.core.tasks.locomotion.PrebuiltIndependentLocomotion">PrebuiltIndependentLocomotion</abbr></code>; built from `io.github.ericmedvet.mrsim2d.buildable.builders.Tasks.prebuiltIndependentLocomotion()` by mrsim2d-buildable:1.0.2:2023-10-20T07:22:12Z

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

Produces <code><abbr title="io.github.ericmedvet.mrsim2d.core.tasks.piling.StandPiling">StandPiling</abbr></code>; built from `io.github.ericmedvet.mrsim2d.buildable.builders.Tasks.standPiling()` by mrsim2d-buildable:1.0.2:2023-10-20T07:22:12Z

## Package `sim.task.balancing`

Aliases: `s.task.b`, `s.task.balancing`, `sim.task.b`, `sim.task.balancing`

### Builder `sim.task.balancing.avgSwingAngle()`

`s.task.b.avgSwingAngle(transientTime)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `transientTime` | d | `5.0` | <code>double</code> |

Produces <code><abbr title="java.util.function.Function">Function</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.tasks.balancing.BalancingOutcome">BalancingOutcome</abbr>, <abbr title="java.lang.Double">Double</abbr>&gt;</code>; built from `io.github.ericmedvet.mrsim2d.buildable.builders.BalancingOutcomeFunctions.avgSwingAngle()` by mrsim2d-buildable:1.0.2:2023-10-20T07:22:12Z

### Builder `sim.task.balancing.avgSwingAngleWithMalus()`

`s.task.b.avgSwingAngleWithMalus(transientTime; malus)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `transientTime` | d | `5.0` | <code>double</code> |
| `malus` | d | `1.5707963267948966` | <code>double</code> |

Produces <code><abbr title="java.util.function.Function">Function</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.tasks.balancing.BalancingOutcome">BalancingOutcome</abbr>, <abbr title="java.lang.Double">Double</abbr>&gt;</code>; built from `io.github.ericmedvet.mrsim2d.buildable.builders.BalancingOutcomeFunctions.avgSwingAngleWithMalus()` by mrsim2d-buildable:1.0.2:2023-10-20T07:22:12Z

## Package `sim.task.jumping`

Aliases: `s.task.j`, `s.task.jumping`, `sim.task.j`, `sim.task.jumping`

### Builder `sim.task.jumping.avgBBMinY()`

`s.task.j.avgBBMinY(transientTime)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `transientTime` | d | `5.0` | <code>double</code> |

Produces <code><abbr title="java.util.function.Function">Function</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.tasks.Outcome">Outcome</abbr>&lt;?&gt;, <abbr title="java.lang.Double">Double</abbr>&gt;</code>; built from `io.github.ericmedvet.mrsim2d.buildable.builders.JumpingOutcomeFunctions.avgBBMinY()` by mrsim2d-buildable:1.0.2:2023-10-20T07:22:12Z

### Builder `sim.task.jumping.avgY()`

`s.task.j.avgY(transientTime)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `transientTime` | d | `5.0` | <code>double</code> |

Produces <code><abbr title="java.util.function.Function">Function</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.tasks.Outcome">Outcome</abbr>&lt;?&gt;, <abbr title="java.lang.Double">Double</abbr>&gt;</code>; built from `io.github.ericmedvet.mrsim2d.buildable.builders.JumpingOutcomeFunctions.avgY()` by mrsim2d-buildable:1.0.2:2023-10-20T07:22:12Z

### Builder `sim.task.jumping.maxBBMinY()`

`s.task.j.maxBBMinY(transientTime)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `transientTime` | d | `5.0` | <code>double</code> |

Produces <code><abbr title="java.util.function.Function">Function</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.tasks.Outcome">Outcome</abbr>&lt;?&gt;, <abbr title="java.lang.Double">Double</abbr>&gt;</code>; built from `io.github.ericmedvet.mrsim2d.buildable.builders.JumpingOutcomeFunctions.maxBBMinY()` by mrsim2d-buildable:1.0.2:2023-10-20T07:22:12Z

### Builder `sim.task.jumping.maxMaxRelJumpH()`

`s.task.j.maxMaxRelJumpH(transientTime)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `transientTime` | d | `5.0` | <code>double</code> |

Produces <code><abbr title="java.util.function.Function">Function</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.tasks.Outcome">Outcome</abbr>&lt;?&gt;, <abbr title="java.lang.Double">Double</abbr>&gt;</code>; built from `io.github.ericmedvet.mrsim2d.buildable.builders.JumpingOutcomeFunctions.maxMaxRelJumpH()` by mrsim2d-buildable:1.0.2:2023-10-20T07:22:12Z

### Builder `sim.task.jumping.maxY()`

`s.task.j.maxY(transientTime)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `transientTime` | d | `5.0` | <code>double</code> |

Produces <code><abbr title="java.util.function.Function">Function</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.tasks.Outcome">Outcome</abbr>&lt;?&gt;, <abbr title="java.lang.Double">Double</abbr>&gt;</code>; built from `io.github.ericmedvet.mrsim2d.buildable.builders.JumpingOutcomeFunctions.maxY()` by mrsim2d-buildable:1.0.2:2023-10-20T07:22:12Z

## Package `sim.task.locomotion`

Aliases: `s.task.l`, `s.task.locomotion`, `sim.task.l`, `sim.task.locomotion`

### Builder `sim.task.locomotion.avgArea()`

`s.task.l.avgArea(transientTime)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `transientTime` | d | `0.0` | <code>double</code> |

Produces <code><abbr title="java.util.function.Function">Function</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.tasks.Outcome">Outcome</abbr>&lt;?&gt;, <abbr title="java.lang.Double">Double</abbr>&gt;</code>; built from `io.github.ericmedvet.mrsim2d.buildable.builders.LocomotionOutcomeFunctions.avgArea()` by mrsim2d-buildable:1.0.2:2023-10-20T07:22:12Z

### Builder `sim.task.locomotion.avgTerrainHeight()`

`s.task.l.avgTerrainHeight(transientTime)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `transientTime` | d | `0.0` | <code>double</code> |

Produces <code><abbr title="java.util.function.Function">Function</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.tasks.Outcome">Outcome</abbr>&lt;?&gt;, <abbr title="java.lang.Double">Double</abbr>&gt;</code>; built from `io.github.ericmedvet.mrsim2d.buildable.builders.LocomotionOutcomeFunctions.avgTerrainHeight()` by mrsim2d-buildable:1.0.2:2023-10-20T07:22:12Z

### Builder `sim.task.locomotion.xDistance()`

`s.task.l.xDistance(transientTime)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `transientTime` | d | `0.0` | <code>double</code> |

Produces <code><abbr title="java.util.function.Function">Function</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.tasks.Outcome">Outcome</abbr>&lt;?&gt;, <abbr title="java.lang.Double">Double</abbr>&gt;</code>; built from `io.github.ericmedvet.mrsim2d.buildable.builders.LocomotionOutcomeFunctions.xDistance()` by mrsim2d-buildable:1.0.2:2023-10-20T07:22:12Z

### Builder `sim.task.locomotion.xVelocity()`

`s.task.l.xVelocity(transientTime)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `transientTime` | d | `0.0` | <code>double</code> |

Produces <code><abbr title="java.util.function.Function">Function</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.tasks.Outcome">Outcome</abbr>&lt;?&gt;, <abbr title="java.lang.Double">Double</abbr>&gt;</code>; built from `io.github.ericmedvet.mrsim2d.buildable.builders.LocomotionOutcomeFunctions.xVelocity()` by mrsim2d-buildable:1.0.2:2023-10-20T07:22:12Z

## Package `sim.task.piling`

Aliases: `s.task.p`, `s.task.piling`, `sim.task.p`, `sim.task.piling`

### Builder `sim.task.piling.avgH()`

`s.task.p.avgH(transientTime)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `transientTime` | d | `0.0` | <code>double</code> |

Produces <code><abbr title="java.util.function.Function">Function</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.tasks.Outcome">Outcome</abbr>&lt;?&gt;, <abbr title="java.lang.Double">Double</abbr>&gt;</code>; built from `io.github.ericmedvet.mrsim2d.buildable.builders.PilingOutcomeFunctions.avgH()` by mrsim2d-buildable:1.0.2:2023-10-20T07:22:12Z

### Builder `sim.task.piling.avgW()`

`s.task.p.avgW(transientTime)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `transientTime` | d | `0.0` | <code>double</code> |

Produces <code><abbr title="java.util.function.Function">Function</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.tasks.Outcome">Outcome</abbr>&lt;?&gt;, <abbr title="java.lang.Double">Double</abbr>&gt;</code>; built from `io.github.ericmedvet.mrsim2d.buildable.builders.PilingOutcomeFunctions.avgW()` by mrsim2d-buildable:1.0.2:2023-10-20T07:22:12Z

### Builder `sim.task.piling.maxH()`

`s.task.p.maxH(transientTime)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `transientTime` | d | `0.0` | <code>double</code> |

Produces <code><abbr title="java.util.function.Function">Function</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.tasks.Outcome">Outcome</abbr>&lt;?&gt;, <abbr title="java.lang.Double">Double</abbr>&gt;</code>; built from `io.github.ericmedvet.mrsim2d.buildable.builders.PilingOutcomeFunctions.maxH()` by mrsim2d-buildable:1.0.2:2023-10-20T07:22:12Z

### Builder `sim.task.piling.maxW()`

`s.task.p.maxW(transientTime)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `transientTime` | d | `0.0` | <code>double</code> |

Produces <code><abbr title="java.util.function.Function">Function</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.tasks.Outcome">Outcome</abbr>&lt;?&gt;, <abbr title="java.lang.Double">Double</abbr>&gt;</code>; built from `io.github.ericmedvet.mrsim2d.buildable.builders.PilingOutcomeFunctions.maxW()` by mrsim2d-buildable:1.0.2:2023-10-20T07:22:12Z

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

Produces <code><abbr title="io.github.ericmedvet.mrsim2d.core.geometry.Terrain">Terrain</abbr></code>; built from `io.github.ericmedvet.mrsim2d.buildable.builders.Terrains.downhill()` by mrsim2d-buildable:1.0.2:2023-10-20T07:22:12Z

### Builder `sim.terrain.flat()`

`s.t.flat(w; h; borderW; borderH)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `w` | d | `500.0` | <code><abbr title="java.lang.Double">Double</abbr></code> |
| `h` | d | `25.0` | <code><abbr title="java.lang.Double">Double</abbr></code> |
| `borderW` | d | `10.0` | <code><abbr title="java.lang.Double">Double</abbr></code> |
| `borderH` | d | `100.0` | <code><abbr title="java.lang.Double">Double</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.mrsim2d.core.geometry.Terrain">Terrain</abbr></code>; built from `io.github.ericmedvet.mrsim2d.buildable.builders.Terrains.flat()` by mrsim2d-buildable:1.0.2:2023-10-20T07:22:12Z

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

Produces <code><abbr title="io.github.ericmedvet.mrsim2d.core.geometry.Terrain">Terrain</abbr></code>; built from `io.github.ericmedvet.mrsim2d.buildable.builders.Terrains.hilly()` by mrsim2d-buildable:1.0.2:2023-10-20T07:22:12Z

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

Produces <code><abbr title="io.github.ericmedvet.mrsim2d.core.geometry.Terrain">Terrain</abbr></code>; built from `io.github.ericmedvet.mrsim2d.buildable.builders.Terrains.steppy()` by mrsim2d-buildable:1.0.2:2023-10-20T07:22:12Z

### Builder `sim.terrain.uphill()`

`s.t.uphill(w; h; borderW; borderH; a)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `w` | d | `500.0` | <code><abbr title="java.lang.Double">Double</abbr></code> |
| `h` | d | `25.0` | <code><abbr title="java.lang.Double">Double</abbr></code> |
| `borderW` | d | `10.0` | <code><abbr title="java.lang.Double">Double</abbr></code> |
| `borderH` | d | `100.0` | <code><abbr title="java.lang.Double">Double</abbr></code> |
| `a` | d | `10.0` | <code><abbr title="java.lang.Double">Double</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.mrsim2d.core.geometry.Terrain">Terrain</abbr></code>; built from `io.github.ericmedvet.mrsim2d.buildable.builders.Terrains.uphill()` by mrsim2d-buildable:1.0.2:2023-10-20T07:22:12Z

