## Package `dynamicalSystem`

Aliases: `ds`, `dynSys`, `dynamicalSystem`

### Builder `dynamicalSystem.defaultRG()`

`ds.defaultRG(seed)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `seed` | i | `0` | <code>int</code> |

Produces <code><abbr title="java.util.random.RandomGenerator">RandomGenerator</abbr></code>

### Builder `dynamicalSystem.range()`

`ds.range(min; max)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `min` | d |  | <code>double</code> |
| `max` | d |  | <code>double</code> |

Produces <code><abbr title="io.github.ericmedvet.jsdynsym.core.DoubleRange">DoubleRange</abbr></code>

## Package `dynamicalSystem.numerical`

Aliases: `ds.num`, `ds.numerical`, `dynSys.num`, `dynSys.numerical`, `dynamicalSystem.num`, `dynamicalSystem.numerical`

### Builder `dynamicalSystem.numerical.drn()`

`ds.num.drn(timeRange; innerNeuronsRatio; activationFunction; threshold; timeResolution)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `timeRange` | npm | `ds.range(max=1.0;min=0.0)` | <code><abbr title="io.github.ericmedvet.jsdynsym.core.DoubleRange">DoubleRange</abbr></code> |
| `innerNeuronsRatio` | d | `1.0` | <code>double</code> |
| `activationFunction` | e | `TANH` | <code><abbr title="io.github.ericmedvet.jsdynsym.core.numerical.ann.MultiLayerPerceptron$ActivationFunction">MultiLayerPerceptron$ActivationFunction</abbr></code> |
| `threshold` | d | `0.1` | <code>double</code> |
| `timeResolution` | d | `0.16666` | <code>double</code> |

Produces <code><abbr title="io.github.ericmedvet.jsdynsym.buildable.builders.NumericalDynamicalSystems$Builder">NumericalDynamicalSystems$Builder</abbr>&lt;<abbr title="io.github.ericmedvet.jsdynsym.core.numerical.ann.DelayedRecurrentNetwork">DelayedRecurrentNetwork</abbr>, <abbr title="io.github.ericmedvet.jsdynsym.core.numerical.ann.DelayedRecurrentNetwork$State">DelayedRecurrentNetwork$State</abbr>&gt;</code>

### Builder `dynamicalSystem.numerical.enhanced()`

`ds.num.enhanced(windowT; inner; types)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `windowT` | d |  | <code>double</code> |
| `inner` | npm |  | <code><abbr title="io.github.ericmedvet.jsdynsym.buildable.builders.NumericalDynamicalSystems$Builder">NumericalDynamicalSystems$Builder</abbr>&lt;? extends <abbr title="io.github.ericmedvet.jsdynsym.core.numerical.NumericalDynamicalSystem">NumericalDynamicalSystem</abbr>&lt;S&gt;, S&gt;</code> |
| `types` | e[] | `[CURRENT, TREND, AVG]` | <code><abbr title="java.util.List">List</abbr>&lt;<abbr title="io.github.ericmedvet.jsdynsym.core.numerical.EnhancedInput$Type">EnhancedInput$Type</abbr>&gt;</code> |

Produces <code><abbr title="io.github.ericmedvet.jsdynsym.buildable.builders.NumericalDynamicalSystems$Builder">NumericalDynamicalSystems$Builder</abbr>&lt;<abbr title="io.github.ericmedvet.jsdynsym.core.numerical.EnhancedInput">EnhancedInput</abbr>&lt;S&gt;, S&gt;</code>

### Builder `dynamicalSystem.numerical.inStepped()`

`ds.num.inStepped(stepT; inner)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `stepT` | d | `1.0` | <code>double</code> |
| `inner` | npm |  | <code><abbr title="io.github.ericmedvet.jsdynsym.buildable.builders.NumericalDynamicalSystems$Builder">NumericalDynamicalSystems$Builder</abbr>&lt;? extends <abbr title="io.github.ericmedvet.jsdynsym.core.numerical.NumericalDynamicalSystem">NumericalDynamicalSystem</abbr>&lt;S&gt;, S&gt;</code> |

Produces <code><abbr title="io.github.ericmedvet.jsdynsym.buildable.builders.NumericalDynamicalSystems$Builder">NumericalDynamicalSystems$Builder</abbr>&lt;<abbr title="io.github.ericmedvet.jsdynsym.core.numerical.NumericalDynamicalSystem">NumericalDynamicalSystem</abbr>&lt;<abbr title="io.github.ericmedvet.jsdynsym.core.composed.Stepped$State">Stepped$State</abbr>&lt;S&gt;&gt;, <abbr title="io.github.ericmedvet.jsdynsym.core.composed.Stepped$State">Stepped$State</abbr>&lt;S&gt;&gt;</code>

### Builder `dynamicalSystem.numerical.mlp()`

`ds.num.mlp(innerLayerRatio; nOfInnerLayers; activationFunction)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `innerLayerRatio` | d | `0.65` | <code>double</code> |
| `nOfInnerLayers` | i | `1` | <code>int</code> |
| `activationFunction` | e | `TANH` | <code><abbr title="io.github.ericmedvet.jsdynsym.core.numerical.ann.MultiLayerPerceptron$ActivationFunction">MultiLayerPerceptron$ActivationFunction</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.jsdynsym.buildable.builders.NumericalDynamicalSystems$Builder">NumericalDynamicalSystems$Builder</abbr>&lt;<abbr title="io.github.ericmedvet.jsdynsym.core.numerical.ann.MultiLayerPerceptron">MultiLayerPerceptron</abbr>, <abbr title="io.github.ericmedvet.jsdynsym.core.StatelessSystem$State">StatelessSystem$State</abbr>&gt;</code>

### Builder `dynamicalSystem.numerical.noised()`

`ds.num.noised(inputSigma; outputSigma; randomGenerator; inner)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `inputSigma` | d | `0.0` | <code>double</code> |
| `outputSigma` | d | `0.0` | <code>double</code> |
| `randomGenerator` | npm | `ds.defaultRG()` | <code><abbr title="java.util.random.RandomGenerator">RandomGenerator</abbr></code> |
| `inner` | npm |  | <code><abbr title="io.github.ericmedvet.jsdynsym.buildable.builders.NumericalDynamicalSystems$Builder">NumericalDynamicalSystems$Builder</abbr>&lt;? extends <abbr title="io.github.ericmedvet.jsdynsym.core.numerical.NumericalDynamicalSystem">NumericalDynamicalSystem</abbr>&lt;S&gt;, S&gt;</code> |

Produces <code><abbr title="io.github.ericmedvet.jsdynsym.buildable.builders.NumericalDynamicalSystems$Builder">NumericalDynamicalSystems$Builder</abbr>&lt;<abbr title="io.github.ericmedvet.jsdynsym.core.numerical.Noised">Noised</abbr>&lt;S&gt;, S&gt;</code>

### Builder `dynamicalSystem.numerical.outStepped()`

`ds.num.outStepped(stepT; inner)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `stepT` | d | `1.0` | <code>double</code> |
| `inner` | npm |  | <code><abbr title="io.github.ericmedvet.jsdynsym.buildable.builders.NumericalDynamicalSystems$Builder">NumericalDynamicalSystems$Builder</abbr>&lt;? extends <abbr title="io.github.ericmedvet.jsdynsym.core.numerical.NumericalDynamicalSystem">NumericalDynamicalSystem</abbr>&lt;S&gt;, S&gt;</code> |

Produces <code><abbr title="io.github.ericmedvet.jsdynsym.buildable.builders.NumericalDynamicalSystems$Builder">NumericalDynamicalSystems$Builder</abbr>&lt;<abbr title="io.github.ericmedvet.jsdynsym.core.numerical.NumericalDynamicalSystem">NumericalDynamicalSystem</abbr>&lt;<abbr title="io.github.ericmedvet.jsdynsym.core.composed.Stepped$State">Stepped$State</abbr>&lt;S&gt;&gt;, <abbr title="io.github.ericmedvet.jsdynsym.core.composed.Stepped$State">Stepped$State</abbr>&lt;S&gt;&gt;</code>

### Builder `dynamicalSystem.numerical.sin()`

`ds.num.sin(p; f; a; b)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `p` | npm | `ds.range(max=1.57;min=-1.57)` | <code><abbr title="io.github.ericmedvet.jsdynsym.core.DoubleRange">DoubleRange</abbr></code> |
| `f` | npm | `ds.range(max=1.0;min=0.0)` | <code><abbr title="io.github.ericmedvet.jsdynsym.core.DoubleRange">DoubleRange</abbr></code> |
| `a` | npm | `ds.range(max=1.0;min=0.0)` | <code><abbr title="io.github.ericmedvet.jsdynsym.core.DoubleRange">DoubleRange</abbr></code> |
| `b` | npm | `ds.range(max=0.5;min=-0.5)` | <code><abbr title="io.github.ericmedvet.jsdynsym.core.DoubleRange">DoubleRange</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.jsdynsym.buildable.builders.NumericalDynamicalSystems$Builder">NumericalDynamicalSystems$Builder</abbr>&lt;<abbr title="io.github.ericmedvet.jsdynsym.core.numerical.Sinusoidal">Sinusoidal</abbr>, <abbr title="io.github.ericmedvet.jsdynsym.core.StatelessSystem$State">StatelessSystem$State</abbr>&gt;</code>

### Builder `dynamicalSystem.numerical.stepped()`

`ds.num.stepped(stepT; inner)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `stepT` | d | `1.0` | <code>double</code> |
| `inner` | npm |  | <code><abbr title="io.github.ericmedvet.jsdynsym.buildable.builders.NumericalDynamicalSystems$Builder">NumericalDynamicalSystems$Builder</abbr>&lt;? extends <abbr title="io.github.ericmedvet.jsdynsym.core.numerical.NumericalDynamicalSystem">NumericalDynamicalSystem</abbr>&lt;S&gt;, S&gt;</code> |

Produces <code><abbr title="io.github.ericmedvet.jsdynsym.buildable.builders.NumericalDynamicalSystems$Builder">NumericalDynamicalSystems$Builder</abbr>&lt;<abbr title="io.github.ericmedvet.jsdynsym.core.numerical.NumericalDynamicalSystem">NumericalDynamicalSystem</abbr>&lt;<abbr title="io.github.ericmedvet.jsdynsym.core.composed.Stepped$State">Stepped$State</abbr>&lt;S&gt;&gt;, <abbr title="io.github.ericmedvet.jsdynsym.core.composed.Stepped$State">Stepped$State</abbr>&lt;S&gt;&gt;</code>

## Package `ea`

### Builder `ea.experiment()`

`ea.experiment(name; runs; listeners)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `name` | s |  | <code><abbr title="java.lang.String">String</abbr></code> |
| `runs` | npm[] | `[]` | <code><abbr title="java.util.List">List</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.experimenter.Run">Run</abbr>&lt;?, ?, ?, ?&gt;&gt;</code> |
| `listeners` | npm[] | `[ea.l.console()]` | <code><abbr title="java.util.List">List</abbr>&lt;<abbr title="java.util.function.BiFunction">BiFunction</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.experimenter.Experiment">Experiment</abbr>, <abbr title="java.util.concurrent.ExecutorService">ExecutorService</abbr>, <abbr title="io.github.ericmedvet.jgea.core.listener.ListenerFactory">ListenerFactory</abbr>&lt;? super <abbr title="io.github.ericmedvet.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr>&lt;?, ?, ?&gt;, <abbr title="io.github.ericmedvet.jgea.experimenter.Run">Run</abbr>&lt;?, ?, ?, ?&gt;&gt;&gt;&gt;</code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.experimenter.Experiment">Experiment</abbr></code>

### Builder `ea.run()`

`ea.run(name; solver; problem; randomGenerator)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `name` | s |  | <code><abbr title="java.lang.String">String</abbr></code> |
| `solver` | npm |  | <code><abbr title="io.github.ericmedvet.jgea.core.solver.AbstractPopulationBasedIterativeSolver">AbstractPopulationBasedIterativeSolver</abbr>&lt;? extends <abbr title="io.github.ericmedvet.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr>&lt;G, S, Q&gt;, P, G, S, Q&gt;</code> |
| `problem` | npm |  | <code>P</code> |
| `randomGenerator` | npm |  | <code><abbr title="java.util.random.RandomGenerator">RandomGenerator</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.experimenter.Run">Run</abbr></code>

### Builder `ea.runOutcome()`

`ea.runOutcome(index; run; serializedGenotypes)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `index` | s |  | <code><abbr title="java.lang.String">String</abbr></code> |
| `run` | npm |  | <code><abbr title="io.github.ericmedvet.jgea.experimenter.Run">Run</abbr>&lt;?, ?, ?, ?&gt;</code> |
| `serializedGenotypes` | s[] | `[]` | <code><abbr title="java.util.List">List</abbr>&lt;<abbr title="java.lang.String">String</abbr>&gt;</code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.experimenter.RunOutcome">RunOutcome</abbr></code>

## Package `ea.dataset.numerical`

Aliases: `ea.d.num`, `ea.d.numerical`, `ea.dataset.num`, `ea.dataset.numerical`

### Builder `ea.dataset.numerical.empty()`

`ea.d.num.empty(xVars; yVars)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `xVars` | s[] | `[]` | <code><abbr title="java.util.List">List</abbr>&lt;<abbr title="java.lang.String">String</abbr>&gt;</code> |
| `yVars` | s[] | `[]` | <code><abbr title="java.util.List">List</abbr>&lt;<abbr title="java.lang.String">String</abbr>&gt;</code> |

Produces <code><abbr title="java.util.function.Supplier">Supplier</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.problem.regression.NumericalDataset">NumericalDataset</abbr>&gt;</code>

### Builder `ea.dataset.numerical.fromFile()`

`ea.d.num.fromFile(filePath; folds; nFolds; xVarNamePattern; yVarNamePattern)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `filePath` | s |  | <code><abbr title="java.lang.String">String</abbr></code> |
| `folds` | i[] | `[0]` | <code><abbr title="java.util.List">List</abbr>&lt;<abbr title="java.lang.Integer">Integer</abbr>&gt;</code> |
| `nFolds` | i | `1` | <code>int</code> |
| `xVarNamePattern` | s | `x.*` | <code><abbr title="java.lang.String">String</abbr></code> |
| `yVarNamePattern` | s | `y.*` | <code><abbr title="java.lang.String">String</abbr></code> |

Produces <code><abbr title="java.util.function.Supplier">Supplier</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.problem.regression.NumericalDataset">NumericalDataset</abbr>&gt;</code>

### Builder `ea.dataset.numerical.fromProblem()`

`ea.d.num.fromProblem(problem)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `problem` | npm |  | <code><abbr title="io.github.ericmedvet.jgea.problem.regression.univariate.UnivariateRegressionProblem">UnivariateRegressionProblem</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.problem.regression.univariate.UnivariateRegressionFitness">UnivariateRegressionFitness</abbr>&gt;</code> |

Produces <code><abbr title="java.util.function.Supplier">Supplier</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.problem.regression.NumericalDataset">NumericalDataset</abbr>&gt;</code>

## Package `ea.function`

Aliases: `ea.f`, `ea.function`

### Builder `ea.function.fromBase64()`

`ea.f.fromBase64()`

Produces <code><abbr title="java.util.function.Function">Function</abbr>&lt;<abbr title="java.lang.String">String</abbr>, <abbr title="java.lang.Object">Object</abbr>&gt;</code>

### Builder `ea.function.identity()`

`ea.f.identity()`

Produces <code><abbr title="java.util.function.Function">Function</abbr>&lt;T, T&gt;</code>

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

Produces <code><abbr title="java.util.function.BiFunction">BiFunction</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.experimenter.Experiment">Experiment</abbr>, <abbr title="java.util.concurrent.ExecutorService">ExecutorService</abbr>, <abbr title="io.github.ericmedvet.jgea.core.listener.ListenerFactory">ListenerFactory</abbr>&lt;? super <abbr title="io.github.ericmedvet.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr>&lt;G, S, Q&gt;, <abbr title="io.github.ericmedvet.jgea.experimenter.Run">Run</abbr>&lt;?, G, S, Q&gt;&gt;&gt;</code>

### Builder `ea.listener.bestCsv()`

`ea.l.bestCsv(filePath; defaultFunctions; functions; runKeys; deferred; onlyLast)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `filePath` | s |  | <code><abbr title="java.lang.String">String</abbr></code> |
| `defaultFunctions` | npm[] | `[ea.nf.iterations(), ea.nf.evals(), ea.nf.births(), ea.nf.elapsed(), ea.nf.size(f=ea.nf.all()), ea.nf.size(f=ea.nf.firsts()), ea.nf.size(f=ea.nf.lasts()), ea.nf.uniqueness(collection=ea.nf.each(collection=ea.nf.all();map=ea.nf.genotype())), ea.nf.uniqueness(collection=ea.nf.each(collection=ea.nf.all();map=ea.nf.solution())), ea.nf.uniqueness(collection=ea.nf.each(collection=ea.nf.all();map=ea.nf.fitness()))]` | <code><abbr title="java.util.List">List</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;? super <abbr title="io.github.ericmedvet.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr>&lt;G, S, Q&gt;, ?&gt;&gt;</code> |
| `functions` | npm[] | `[]` | <code><abbr title="java.util.List">List</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;? super <abbr title="io.github.ericmedvet.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr>&lt;G, S, Q&gt;, ?&gt;&gt;</code> |
| `runKeys` | s[] | `[]` | <code><abbr title="java.util.List">List</abbr>&lt;<abbr title="java.lang.String">String</abbr>&gt;</code> |
| `deferred` | b | `false` | <code>boolean</code> |
| `onlyLast` | b | `false` | <code>boolean</code> |

Produces <code><abbr title="java.util.function.BiFunction">BiFunction</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.experimenter.Experiment">Experiment</abbr>, <abbr title="java.util.concurrent.ExecutorService">ExecutorService</abbr>, <abbr title="io.github.ericmedvet.jgea.core.listener.ListenerFactory">ListenerFactory</abbr>&lt;? super <abbr title="io.github.ericmedvet.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr>&lt;G, S, Q&gt;, <abbr title="io.github.ericmedvet.jgea.experimenter.Run">Run</abbr>&lt;?, G, S, Q&gt;&gt;&gt;</code>

### Builder `ea.listener.console()`

`ea.l.console(defaultFunctions; functions; runKeys; deferred; onlyLast)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `defaultFunctions` | npm[] | `[ea.nf.iterations(), ea.nf.evals(), ea.nf.births(), ea.nf.elapsed(), ea.nf.size(f=ea.nf.all()), ea.nf.size(f=ea.nf.firsts()), ea.nf.size(f=ea.nf.lasts()), ea.nf.uniqueness(collection=ea.nf.each(collection=ea.nf.all();map=ea.nf.genotype())), ea.nf.uniqueness(collection=ea.nf.each(collection=ea.nf.all();map=ea.nf.solution())), ea.nf.uniqueness(collection=ea.nf.each(collection=ea.nf.all();map=ea.nf.fitness()))]` | <code><abbr title="java.util.List">List</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;? super <abbr title="io.github.ericmedvet.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr>&lt;G, S, Q&gt;, ?&gt;&gt;</code> |
| `functions` | npm[] | `[]` | <code><abbr title="java.util.List">List</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;? super <abbr title="io.github.ericmedvet.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr>&lt;G, S, Q&gt;, ?&gt;&gt;</code> |
| `runKeys` | s[] | `[]` | <code><abbr title="java.util.List">List</abbr>&lt;<abbr title="java.lang.String">String</abbr>&gt;</code> |
| `deferred` | b | `false` | <code>boolean</code> |
| `onlyLast` | b | `false` | <code>boolean</code> |

Produces <code><abbr title="java.util.function.BiFunction">BiFunction</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.experimenter.Experiment">Experiment</abbr>, <abbr title="java.util.concurrent.ExecutorService">ExecutorService</abbr>, <abbr title="io.github.ericmedvet.jgea.core.listener.ListenerFactory">ListenerFactory</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr>&lt;G, S, Q&gt;, <abbr title="io.github.ericmedvet.jgea.experimenter.Run">Run</abbr>&lt;?, G, S, Q&gt;&gt;&gt;</code>

### Builder `ea.listener.net()`

`ea.l.net(defaultFunctions; functions; defaultPlots; plots; deferred; onlyLast; serverAddress; serverPort; serverKeyFilePath; pollInterval)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `defaultFunctions` | npm[] | `[ea.nf.iterations(), ea.nf.evals(), ea.nf.births(), ea.nf.elapsed(), ea.nf.size(f=ea.nf.all()), ea.nf.size(f=ea.nf.firsts()), ea.nf.size(f=ea.nf.lasts()), ea.nf.uniqueness(collection=ea.nf.each(collection=ea.nf.all();map=ea.nf.genotype())), ea.nf.uniqueness(collection=ea.nf.each(collection=ea.nf.all();map=ea.nf.solution())), ea.nf.uniqueness(collection=ea.nf.each(collection=ea.nf.all();map=ea.nf.fitness()))]` | <code><abbr title="java.util.List">List</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;? super <abbr title="io.github.ericmedvet.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr>&lt;G, S, Q&gt;, ?&gt;&gt;</code> |
| `functions` | npm[] | `[]` | <code><abbr title="java.util.List">List</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;? super <abbr title="io.github.ericmedvet.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr>&lt;G, S, Q&gt;, ?&gt;&gt;</code> |
| `defaultPlots` | npm[] | `[]` | <code><abbr title="java.util.List">List</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.listener.PlotTableBuilder">PlotTableBuilder</abbr>&lt;? super <abbr title="io.github.ericmedvet.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr>&lt;G, S, Q&gt;&gt;&gt;</code> |
| `plots` | npm[] | `[]` | <code><abbr title="java.util.List">List</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.listener.PlotTableBuilder">PlotTableBuilder</abbr>&lt;? super <abbr title="io.github.ericmedvet.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr>&lt;G, S, Q&gt;&gt;&gt;</code> |
| `deferred` | b | `false` | <code>boolean</code> |
| `onlyLast` | b | `false` | <code>boolean</code> |
| `serverAddress` | s | `127.0.0.1` | <code><abbr title="java.lang.String">String</abbr></code> |
| `serverPort` | i | `10979` | <code>int</code> |
| `serverKeyFilePath` | s |  | <code><abbr title="java.lang.String">String</abbr></code> |
| `pollInterval` | d | `2.0` | <code>double</code> |

Produces <code><abbr title="java.util.function.BiFunction">BiFunction</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.experimenter.Experiment">Experiment</abbr>, <abbr title="java.util.concurrent.ExecutorService">ExecutorService</abbr>, <abbr title="io.github.ericmedvet.jgea.core.listener.ListenerFactory">ListenerFactory</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr>&lt;G, S, Q&gt;, <abbr title="io.github.ericmedvet.jgea.experimenter.Run">Run</abbr>&lt;?, G, S, Q&gt;&gt;&gt;</code>

### Builder `ea.listener.outcomeSaver()`

`ea.l.outcomeSaver(fileNameTemplate; deferred)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `fileNameTemplate` | s | `run-outcome-%03d.txt` | <code><abbr title="java.lang.String">String</abbr></code> |
| `deferred` | b | `true` | <code>boolean</code> |

Produces <code><abbr title="java.util.function.BiFunction">BiFunction</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.experimenter.Experiment">Experiment</abbr>, <abbr title="java.util.concurrent.ExecutorService">ExecutorService</abbr>, <abbr title="io.github.ericmedvet.jgea.core.listener.ListenerFactory">ListenerFactory</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr>&lt;G, S, Q&gt;, <abbr title="io.github.ericmedvet.jgea.experimenter.Run">Run</abbr>&lt;?, G, S, Q&gt;&gt;&gt;</code>

### Builder `ea.listener.telegram()`

`ea.l.telegram(chatId; botIdFilePath; defaultPlots; plots; accumulators; deferred; onlyLast)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `chatId` | s |  | <code><abbr title="java.lang.String">String</abbr></code> |
| `botIdFilePath` | s |  | <code><abbr title="java.lang.String">String</abbr></code> |
| `defaultPlots` | npm[] | `[ea.plot.elapsed()]` | <code><abbr title="java.util.List">List</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.listener.PlotTableBuilder">PlotTableBuilder</abbr>&lt;? super <abbr title="io.github.ericmedvet.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr>&lt;G, S, Q&gt;&gt;&gt;</code> |
| `plots` | npm[] | `[]` | <code><abbr title="java.util.List">List</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.listener.PlotTableBuilder">PlotTableBuilder</abbr>&lt;? super <abbr title="io.github.ericmedvet.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr>&lt;G, S, Q&gt;&gt;&gt;</code> |
| `accumulators` | npm[] | `[]` | <code><abbr title="java.util.List">List</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.listener.AccumulatorFactory">AccumulatorFactory</abbr>&lt;? super <abbr title="io.github.ericmedvet.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr>&lt;G, S, Q&gt;, ?, <abbr title="io.github.ericmedvet.jgea.experimenter.Run">Run</abbr>&lt;?, G, S, Q&gt;&gt;&gt;</code> |
| `deferred` | b | `true` | <code>boolean</code> |
| `onlyLast` | b | `false` | <code>boolean</code> |

Produces <code><abbr title="java.util.function.BiFunction">BiFunction</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.experimenter.Experiment">Experiment</abbr>, <abbr title="java.util.concurrent.ExecutorService">ExecutorService</abbr>, <abbr title="io.github.ericmedvet.jgea.core.listener.ListenerFactory">ListenerFactory</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr>&lt;G, S, Q&gt;, <abbr title="io.github.ericmedvet.jgea.experimenter.Run">Run</abbr>&lt;?, G, S, Q&gt;&gt;&gt;</code>

### Builder `ea.listener.tui()`

`ea.l.tui(defaultFunctions; functions; runKeys; defaultPlots; plots; deferred; onlyLast)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `defaultFunctions` | npm[] | `[ea.nf.iterations(), ea.nf.evals(), ea.nf.births(), ea.nf.elapsed(), ea.nf.size(f=ea.nf.all()), ea.nf.size(f=ea.nf.firsts()), ea.nf.size(f=ea.nf.lasts()), ea.nf.uniqueness(collection=ea.nf.each(collection=ea.nf.all();map=ea.nf.genotype())), ea.nf.uniqueness(collection=ea.nf.each(collection=ea.nf.all();map=ea.nf.solution())), ea.nf.uniqueness(collection=ea.nf.each(collection=ea.nf.all();map=ea.nf.fitness()))]` | <code><abbr title="java.util.List">List</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;? super <abbr title="io.github.ericmedvet.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr>&lt;G, S, Q&gt;, ?&gt;&gt;</code> |
| `functions` | npm[] | `[]` | <code><abbr title="java.util.List">List</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;? super <abbr title="io.github.ericmedvet.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr>&lt;G, S, Q&gt;, ?&gt;&gt;</code> |
| `runKeys` | s[] | `[]` | <code><abbr title="java.util.List">List</abbr>&lt;<abbr title="java.lang.String">String</abbr>&gt;</code> |
| `defaultPlots` | npm[] | `[ea.plot.elapsed()]` | <code><abbr title="java.util.List">List</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.listener.PlotTableBuilder">PlotTableBuilder</abbr>&lt;? super <abbr title="io.github.ericmedvet.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr>&lt;G, S, Q&gt;&gt;&gt;</code> |
| `plots` | npm[] | `[]` | <code><abbr title="java.util.List">List</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.listener.PlotTableBuilder">PlotTableBuilder</abbr>&lt;? super <abbr title="io.github.ericmedvet.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr>&lt;G, S, Q&gt;&gt;&gt;</code> |
| `deferred` | b | `false` | <code>boolean</code> |
| `onlyLast` | b | `false` | <code>boolean</code> |

Produces <code><abbr title="java.util.function.BiFunction">BiFunction</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.experimenter.Experiment">Experiment</abbr>, <abbr title="java.util.concurrent.ExecutorService">ExecutorService</abbr>, <abbr title="io.github.ericmedvet.jgea.core.listener.ListenerFactory">ListenerFactory</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr>&lt;G, S, Q&gt;, <abbr title="io.github.ericmedvet.jgea.experimenter.Run">Run</abbr>&lt;?, G, S, Q&gt;&gt;&gt;</code>

## Package `ea.mapper`

Aliases: `ea.m`, `ea.mapper`

### Builder `ea.mapper.fGraphMRF()`

`ea.m.fGraphMRF(dataset; postOperator)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `dataset` | npm |  | <code><abbr title="java.util.function.Supplier">Supplier</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.problem.regression.NumericalDataset">NumericalDataset</abbr>&gt;</code> |
| `postOperator` | e | `IDENTITY` | <code><abbr title="io.github.ericmedvet.jsdynsym.core.numerical.ann.MultiLayerPerceptron$ActivationFunction">MultiLayerPerceptron$ActivationFunction</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.experimenter.InvertibleMapper">InvertibleMapper</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.representation.graph.Graph">Graph</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.representation.graph.Node">Node</abbr>, <abbr title="java.lang.Double">Double</abbr>&gt;, <abbr title="io.github.ericmedvet.jgea.core.representation.NamedMultivariateRealFunction">NamedMultivariateRealFunction</abbr>&gt;</code>

### Builder `ea.mapper.mlpMRF()`

`ea.m.mlpMRF(dataset; innerLayerRatio; nOfInnerLayers; activationFunction)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `dataset` | npm |  | <code><abbr title="java.util.function.Supplier">Supplier</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.problem.regression.NumericalDataset">NumericalDataset</abbr>&gt;</code> |
| `innerLayerRatio` | d | `0.65` | <code>double</code> |
| `nOfInnerLayers` | i | `1` | <code>int</code> |
| `activationFunction` | e | `TANH` | <code><abbr title="io.github.ericmedvet.jsdynsym.core.numerical.ann.MultiLayerPerceptron$ActivationFunction">MultiLayerPerceptron$ActivationFunction</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.experimenter.InvertibleMapper">InvertibleMapper</abbr>&lt;<abbr title="java.util.List">List</abbr>&lt;<abbr title="java.lang.Double">Double</abbr>&gt;, <abbr title="io.github.ericmedvet.jgea.core.representation.NamedMultivariateRealFunction">NamedMultivariateRealFunction</abbr>&gt;</code>

### Builder `ea.mapper.numericalParametrizedMRF()`

`ea.m.numericalParametrizedMRF(dataset; function)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `dataset` | npm |  | <code><abbr title="java.util.function.Supplier">Supplier</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.problem.regression.NumericalDataset">NumericalDataset</abbr>&gt;</code> |
| `function` | npm |  | <code><abbr title="io.github.ericmedvet.jsdynsym.buildable.builders.NumericalDynamicalSystems$Builder">NumericalDynamicalSystems$Builder</abbr>&lt;<abbr title="io.github.ericmedvet.jsdynsym.core.numerical.MultivariateRealFunction">MultivariateRealFunction</abbr>, <abbr title="io.github.ericmedvet.jsdynsym.core.StatelessSystem$State">StatelessSystem$State</abbr>&gt;</code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.experimenter.InvertibleMapper">InvertibleMapper</abbr>&lt;<abbr title="java.util.List">List</abbr>&lt;<abbr title="java.lang.Double">Double</abbr>&gt;, <abbr title="io.github.ericmedvet.jgea.core.representation.NamedMultivariateRealFunction">NamedMultivariateRealFunction</abbr>&gt;</code>

### Builder `ea.mapper.oGraphMRF()`

`ea.m.oGraphMRF(dataset; postOperator)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `dataset` | npm |  | <code><abbr title="java.util.function.Supplier">Supplier</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.problem.regression.NumericalDataset">NumericalDataset</abbr>&gt;</code> |
| `postOperator` | e | `IDENTITY` | <code><abbr title="io.github.ericmedvet.jsdynsym.core.numerical.ann.MultiLayerPerceptron$ActivationFunction">MultiLayerPerceptron$ActivationFunction</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.experimenter.InvertibleMapper">InvertibleMapper</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.representation.graph.Graph">Graph</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.representation.graph.Node">Node</abbr>, <abbr title="io.github.ericmedvet.jgea.core.representation.graph.numeric.operatorgraph.OperatorGraph$NonValuedArc">OperatorGraph$NonValuedArc</abbr>&gt;, <abbr title="io.github.ericmedvet.jgea.core.representation.NamedMultivariateRealFunction">NamedMultivariateRealFunction</abbr>&gt;</code>

### Builder `ea.mapper.toURF()`

`ea.m.toURF(inner)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `inner` | npm |  | <code><abbr title="io.github.ericmedvet.jgea.experimenter.InvertibleMapper">InvertibleMapper</abbr>&lt;T, <abbr title="io.github.ericmedvet.jgea.core.representation.NamedMultivariateRealFunction">NamedMultivariateRealFunction</abbr>&gt;</code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.experimenter.InvertibleMapper">InvertibleMapper</abbr>&lt;T, <abbr title="io.github.ericmedvet.jgea.core.representation.NamedUnivariateRealFunction">NamedUnivariateRealFunction</abbr>&gt;</code>

### Builder `ea.mapper.treeMRF()`

`ea.m.treeMRF(dataset; postOperator)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `dataset` | npm |  | <code><abbr title="java.util.function.Supplier">Supplier</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.problem.regression.NumericalDataset">NumericalDataset</abbr>&gt;</code> |
| `postOperator` | e | `IDENTITY` | <code><abbr title="io.github.ericmedvet.jsdynsym.core.numerical.ann.MultiLayerPerceptron$ActivationFunction">MultiLayerPerceptron$ActivationFunction</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.experimenter.InvertibleMapper">InvertibleMapper</abbr>&lt;<abbr title="java.util.List">List</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.representation.tree.Tree">Tree</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.representation.tree.numeric.Element">Element</abbr>&gt;&gt;, <abbr title="io.github.ericmedvet.jgea.core.representation.NamedMultivariateRealFunction">NamedMultivariateRealFunction</abbr>&gt;</code>

### Builder `ea.mapper.treeURF()`

`ea.m.treeURF(dataset; postOperator)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `dataset` | npm |  | <code><abbr title="java.util.function.Supplier">Supplier</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.problem.regression.NumericalDataset">NumericalDataset</abbr>&gt;</code> |
| `postOperator` | e | `IDENTITY` | <code><abbr title="io.github.ericmedvet.jsdynsym.core.numerical.ann.MultiLayerPerceptron$ActivationFunction">MultiLayerPerceptron$ActivationFunction</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.experimenter.InvertibleMapper">InvertibleMapper</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.representation.tree.Tree">Tree</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.representation.tree.numeric.Element">Element</abbr>&gt;, <abbr title="io.github.ericmedvet.jgea.core.representation.NamedUnivariateRealFunction">NamedUnivariateRealFunction</abbr>&gt;</code>

## Package `ea.namedFunction`

Aliases: `ea.namedFunction`, `ea.nf`

### Builder `ea.namedFunction.all()`

`ea.nf.all()`

Produces <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr>&lt;G, S, Q&gt;, <abbr title="java.util.Collection">Collection</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.solver.Individual">Individual</abbr>&lt;G, S, Q&gt;&gt;&gt;</code>

### Builder `ea.namedFunction.base64()`

`ea.nf.base64(f)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `f` | npm |  | <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;X, <abbr title="java.io.Serializable">Serializable</abbr>&gt;</code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;X, <abbr title="java.lang.String">String</abbr>&gt;</code>

### Builder `ea.namedFunction.best()`

`ea.nf.best()`

Produces <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr>&lt;G, S, Q&gt;, <abbr title="io.github.ericmedvet.jgea.core.solver.Individual">Individual</abbr>&lt;G, S, Q&gt;&gt;</code>

### Builder `ea.namedFunction.bestFitness()`

`ea.nf.bestFitness(f; s)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `f` | npm | `ea.nf.identity()` | <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;Q, T&gt;</code> |
| `s` | s | `%s` | <code><abbr title="java.lang.String">String</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr>&lt;?, ?, Q&gt;, T&gt;</code>

### Builder `ea.namedFunction.births()`

`ea.nf.births()`

Produces <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr>&lt;?, ?, ?&gt;, <abbr title="java.lang.Long">Long</abbr>&gt;</code>

### Builder `ea.namedFunction.each()`

`ea.nf.each(map; collection; s)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `map` | npm |  | <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;T, R&gt;</code> |
| `collection` | npm |  | <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;X, <abbr title="java.util.Collection">Collection</abbr>&lt;T&gt;&gt;</code> |
| `s` | s | `%s` | <code><abbr title="java.lang.String">String</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;X, <abbr title="java.util.Collection">Collection</abbr>&lt;R&gt;&gt;</code>

### Builder `ea.namedFunction.elapsed()`

`ea.nf.elapsed()`

Produces <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr>&lt;?, ?, ?&gt;, <abbr title="java.lang.Double">Double</abbr>&gt;</code>

### Builder `ea.namedFunction.evals()`

`ea.nf.evals()`

Produces <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr>&lt;?, ?, ?&gt;, <abbr title="java.lang.Long">Long</abbr>&gt;</code>

### Builder `ea.namedFunction.expr()`

`ea.nf.expr(f1; f2; op)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `f1` | npm |  | <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;X, <abbr title="java.lang.Number">Number</abbr>&gt;</code> |
| `f2` | npm |  | <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;X, <abbr title="java.lang.Number">Number</abbr>&gt;</code> |
| `op` | e |  | <code><abbr title="io.github.ericmedvet.jgea.experimenter.builders.NamedFunctions$Op">NamedFunctions$Op</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;X, <abbr title="java.lang.Double">Double</abbr>&gt;</code>

### Builder `ea.namedFunction.f()`

`ea.nf.f(outerF; innerF; name; s)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `outerF` | npm |  | <code><abbr title="java.util.function.Function">Function</abbr>&lt;T, R&gt;</code> |
| `innerF` | npm | `ea.nf.identity()` | <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;X, T&gt;</code> |
| `name` | s |  | <code><abbr title="java.lang.String">String</abbr></code> |
| `s` | s | `%s` | <code><abbr title="java.lang.String">String</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;X, R&gt;</code>

### Builder `ea.namedFunction.firsts()`

`ea.nf.firsts()`

Produces <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr>&lt;G, S, Q&gt;, <abbr title="java.util.Collection">Collection</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.solver.Individual">Individual</abbr>&lt;G, S, Q&gt;&gt;&gt;</code>

### Builder `ea.namedFunction.fitness()`

`ea.nf.fitness(individual; s)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `individual` | npm | `ea.nf.identity()` | <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;X, <abbr title="io.github.ericmedvet.jgea.core.solver.Individual">Individual</abbr>&lt;?, ?, F&gt;&gt;</code> |
| `s` | s | `%s` | <code><abbr title="java.lang.String">String</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;X, F&gt;</code>

### Builder `ea.namedFunction.fitnessHist()`

`ea.nf.fitnessHist(f; nBins)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `f` | npm | `ea.nf.identity()` | <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;Q, <abbr title="java.lang.Number">Number</abbr>&gt;</code> |
| `nBins` | i | `8` | <code>int</code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr>&lt;?, ?, Q&gt;, <abbr title="java.lang.String">String</abbr>&gt;</code>

### Builder `ea.namedFunction.formatted()`

`ea.nf.formatted(s; f)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `s` | s |  | <code><abbr title="java.lang.String">String</abbr></code> |
| `f` | npm |  | <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;T, R&gt;</code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;T, R&gt;</code>

### Builder `ea.namedFunction.genotype()`

`ea.nf.genotype(individual; s)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `individual` | npm | `ea.nf.identity()` | <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;X, <abbr title="io.github.ericmedvet.jgea.core.solver.Individual">Individual</abbr>&lt;G, ?, ?&gt;&gt;</code> |
| `s` | s | `%s` | <code><abbr title="java.lang.String">String</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;X, G&gt;</code>

### Builder `ea.namedFunction.hist()`

`ea.nf.hist(collection; nBins)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `collection` | npm |  | <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;X, <abbr title="java.util.Collection">Collection</abbr>&lt;<abbr title="java.lang.Number">Number</abbr>&gt;&gt;</code> |
| `nBins` | i | `8` | <code>int</code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;X, <abbr title="java.lang.String">String</abbr>&gt;</code>

### Builder `ea.namedFunction.identity()`

`ea.nf.identity()`

Produces <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;T, T&gt;</code>

### Builder `ea.namedFunction.iterations()`

`ea.nf.iterations()`

Produces <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr>&lt;?, ?, ?&gt;, <abbr title="java.lang.Long">Long</abbr>&gt;</code>

### Builder `ea.namedFunction.lasts()`

`ea.nf.lasts()`

Produces <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr>&lt;G, S, Q&gt;, <abbr title="java.util.Collection">Collection</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.solver.Individual">Individual</abbr>&lt;G, S, Q&gt;&gt;&gt;</code>

### Builder `ea.namedFunction.max()`

`ea.nf.max(collection; s)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `collection` | npm |  | <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;X, <abbr title="java.util.Collection">Collection</abbr>&lt;T&gt;&gt;</code> |
| `s` | s | `%s` | <code><abbr title="java.lang.String">String</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;X, T&gt;</code>

### Builder `ea.namedFunction.median()`

`ea.nf.median(collection; s)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `collection` | npm |  | <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;X, <abbr title="java.util.Collection">Collection</abbr>&lt;T&gt;&gt;</code> |
| `s` | s | `%s` | <code><abbr title="java.lang.String">String</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;X, T&gt;</code>

### Builder `ea.namedFunction.min()`

`ea.nf.min(collection; s)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `collection` | npm |  | <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;X, <abbr title="java.util.Collection">Collection</abbr>&lt;T&gt;&gt;</code> |
| `s` | s | `%s` | <code><abbr title="java.lang.String">String</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;X, T&gt;</code>

### Builder `ea.namedFunction.percentile()`

`ea.nf.percentile(collection; p; s)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `collection` | npm |  | <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;X, <abbr title="java.util.Collection">Collection</abbr>&lt;T&gt;&gt;</code> |
| `p` | d |  | <code>double</code> |
| `s` | s | `%s` | <code><abbr title="java.lang.String">String</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;X, T&gt;</code>

### Builder `ea.namedFunction.progress()`

`ea.nf.progress()`

Produces <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr>&lt;?, ?, ?&gt;, <abbr title="java.lang.Double">Double</abbr>&gt;</code>

### Builder `ea.namedFunction.size()`

`ea.nf.size(f; s)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `f` | npm |  | <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;X, ?&gt;</code> |
| `s` | s | `%s` | <code><abbr title="java.lang.String">String</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;X, <abbr title="java.lang.Integer">Integer</abbr>&gt;</code>

### Builder `ea.namedFunction.solution()`

`ea.nf.solution(individual; s)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `individual` | npm | `ea.nf.identity()` | <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;X, <abbr title="io.github.ericmedvet.jgea.core.solver.Individual">Individual</abbr>&lt;?, S, ?&gt;&gt;</code> |
| `s` | s | `%s` | <code><abbr title="java.lang.String">String</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;X, S&gt;</code>

### Builder `ea.namedFunction.uniqueness()`

`ea.nf.uniqueness(collection)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `collection` | npm |  | <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;X, <abbr title="java.util.Collection">Collection</abbr>&lt;T&gt;&gt;</code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;X, <abbr title="java.lang.Double">Double</abbr>&gt;</code>

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

Produces <code><abbr title="io.github.ericmedvet.jgea.core.listener.XYPlotTableBuilder">XYPlotTableBuilder</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr>&lt;G, S, Q&gt;&gt;</code>

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

Produces <code><abbr title="io.github.ericmedvet.jgea.core.listener.XYPlotTableBuilder">XYPlotTableBuilder</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr>&lt;G, S, Q&gt;&gt;</code>

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

Produces <code><abbr title="io.github.ericmedvet.jgea.core.listener.XYPlotTableBuilder">XYPlotTableBuilder</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr>&lt;G, S, Q&gt;&gt;</code>

### Builder `ea.plot.uniqueness()`

`ea.plot.uniqueness(x; ys; w; h; minX; maxX; minY; maxY)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `x` | npm | `ea.nf.iterations()` | <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;? super <abbr title="io.github.ericmedvet.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr>&lt;G, S, Q&gt;, ? extends <abbr title="java.lang.Number">Number</abbr>&gt;</code> |
| `ys` | npm[] | `[ea.nf.uniqueness(collection=ea.nf.each(collection=ea.nf.all();map=ea.nf.genotype())), ea.nf.uniqueness(collection=ea.nf.each(collection=ea.nf.all();map=ea.nf.solution())), ea.nf.uniqueness(collection=ea.nf.each(collection=ea.nf.all();map=ea.nf.fitness()))]` | <code><abbr title="java.util.List">List</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;? super <abbr title="io.github.ericmedvet.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr>&lt;G, S, Q&gt;, ? extends <abbr title="java.lang.Number">Number</abbr>&gt;&gt;</code> |
| `w` | i | `600` | <code>int</code> |
| `h` | i | `400` | <code>int</code> |
| `minX` | d | `-Infinity` | <code>double</code> |
| `maxX` | d | `-Infinity` | <code>double</code> |
| `minY` | d | `0.0` | <code>double</code> |
| `maxY` | d | `1.0` | <code>double</code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.core.listener.XYPlotTableBuilder">XYPlotTableBuilder</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr>&lt;G, S, Q&gt;&gt;</code>

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

Produces <code><abbr title="io.github.ericmedvet.jgea.core.listener.XYPlotTableBuilder">XYPlotTableBuilder</abbr>&lt;E&gt;</code>

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

Produces <code><abbr title="io.github.ericmedvet.jgea.core.listener.XYPlotTableBuilder">XYPlotTableBuilder</abbr>&lt;E&gt;</code>

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

Produces <code><abbr title="io.github.ericmedvet.jgea.core.listener.XYPlotTableBuilder">XYPlotTableBuilder</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr>&lt;G, S, Q&gt;&gt;</code>

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

Produces <code><abbr title="io.github.ericmedvet.jgea.core.listener.XYPlotTableBuilder">XYPlotTableBuilder</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr>&lt;G, S, Q&gt;&gt;</code>

## Package `ea.problem`

Aliases: `ea.p`, `ea.problem`

### Builder `ea.problem.totalOrder()`

`ea.p.totalOrder(qFunction; cFunction; type)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `qFunction` | npm |  | <code><abbr title="java.util.function.Function">Function</abbr>&lt;S, Q&gt;</code> |
| `cFunction` | npm | `ea.f.identity()` | <code><abbr title="java.util.function.Function">Function</abbr>&lt;Q, C&gt;</code> |
| `type` | e | `MINIMIZE` | <code><abbr title="io.github.ericmedvet.jgea.experimenter.builders.Problems$OptimizationType">Problems$OptimizationType</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.core.TotalOrderQualityBasedProblem">TotalOrderQualityBasedProblem</abbr>&lt;S, Q&gt;</code>

## Package `ea.problem.multivariateRegression`

Aliases: `ea.p.mr`, `ea.p.multivariateRegression`, `ea.problem.mr`, `ea.problem.multivariateRegression`

### Builder `ea.problem.multivariateRegression.fromData()`

`ea.p.mr.fromData(trainingDataset; testDataset; metric)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `trainingDataset` | npm |  | <code><abbr title="java.util.function.Supplier">Supplier</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.problem.regression.NumericalDataset">NumericalDataset</abbr>&gt;</code> |
| `testDataset` | npm | `ea.d.num.empty()` | <code><abbr title="java.util.function.Supplier">Supplier</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.problem.regression.NumericalDataset">NumericalDataset</abbr>&gt;</code> |
| `metric` | e | `MSE` | <code><abbr title="io.github.ericmedvet.jgea.problem.regression.univariate.UnivariateRegressionFitness$Metric">UnivariateRegressionFitness$Metric</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.problem.regression.multivariate.MultivariateRegressionProblem">MultivariateRegressionProblem</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.problem.regression.multivariate.MultivariateRegressionFitness">MultivariateRegressionFitness</abbr>&gt;</code>

## Package `ea.problem.univariateRegression`

Aliases: `ea.p.univariateRegression`, `ea.p.ur`, `ea.problem.univariateRegression`, `ea.problem.ur`

### Builder `ea.problem.univariateRegression.bundled()`

`ea.p.ur.bundled(name; metric)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `name` | s |  | <code><abbr title="java.lang.String">String</abbr></code> |
| `metric` | e | `MSE` | <code><abbr title="io.github.ericmedvet.jgea.problem.regression.univariate.UnivariateRegressionFitness$Metric">UnivariateRegressionFitness$Metric</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.problem.regression.univariate.UnivariateRegressionProblem">UnivariateRegressionProblem</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.problem.regression.univariate.UnivariateRegressionFitness">UnivariateRegressionFitness</abbr>&gt;</code>

### Builder `ea.problem.univariateRegression.fromData()`

`ea.p.ur.fromData(trainingDataset; testDataset; metric)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `trainingDataset` | npm |  | <code><abbr title="java.util.function.Supplier">Supplier</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.problem.regression.NumericalDataset">NumericalDataset</abbr>&gt;</code> |
| `testDataset` | npm | `ea.d.num.empty()` | <code><abbr title="java.util.function.Supplier">Supplier</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.problem.regression.NumericalDataset">NumericalDataset</abbr>&gt;</code> |
| `metric` | e | `MSE` | <code><abbr title="io.github.ericmedvet.jgea.problem.regression.univariate.UnivariateRegressionFitness$Metric">UnivariateRegressionFitness$Metric</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.problem.regression.univariate.UnivariateRegressionProblem">UnivariateRegressionProblem</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.problem.regression.univariate.UnivariateRegressionFitness">UnivariateRegressionFitness</abbr>&gt;</code>

### Builder `ea.problem.univariateRegression.synthetic()`

`ea.p.ur.synthetic(name; metric; seed)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `name` | s |  | <code><abbr title="java.lang.String">String</abbr></code> |
| `metric` | e | `MSE` | <code><abbr title="io.github.ericmedvet.jgea.problem.regression.univariate.UnivariateRegressionFitness$Metric">UnivariateRegressionFitness$Metric</abbr></code> |
| `seed` | i | `1` | <code>int</code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.problem.regression.univariate.synthetic.SyntheticUnivariateRegressionProblem">SyntheticUnivariateRegressionProblem</abbr></code>

## Package `ea.randomGenerator`

Aliases: `ea.randomGenerator`, `ea.rg`

### Builder `ea.randomGenerator.defaultRG()`

`ea.rg.defaultRG(seed)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `seed` | i | `0` | <code>int</code> |

Produces <code><abbr title="java.util.random.RandomGenerator">RandomGenerator</abbr></code>

## Package `ea.solver`

Aliases: `ea.s`, `ea.solver`

### Builder `ea.solver.multiSRTreeGP()`

`ea.s.multiSRTreeGP(mapper; minConst; maxConst; nConst; operators; minTreeH; maxTreeH; crossoverP; tournamentRate; minNTournament; nPop; nEval; diversity; nAttemptsDiversity; remap)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `mapper` | npm |  | <code><abbr title="io.github.ericmedvet.jgea.experimenter.InvertibleMapper">InvertibleMapper</abbr>&lt;<abbr title="java.util.List">List</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.representation.tree.Tree">Tree</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.representation.tree.numeric.Element">Element</abbr>&gt;&gt;, S&gt;</code> |
| `minConst` | d | `0.0` | <code>double</code> |
| `maxConst` | d | `5.0` | <code>double</code> |
| `nConst` | i | `10` | <code>int</code> |
| `operators` | e[] | `[+, -, *, p/]` | <code><abbr title="java.util.List">List</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.representation.tree.numeric.Element$Operator">Element$Operator</abbr>&gt;</code> |
| `minTreeH` | i | `3` | <code>int</code> |
| `maxTreeH` | i | `8` | <code>int</code> |
| `crossoverP` | d | `0.8` | <code>double</code> |
| `tournamentRate` | d | `0.05` | <code>double</code> |
| `minNTournament` | i | `3` | <code>int</code> |
| `nPop` | i | `100` | <code>int</code> |
| `nEval` | i |  | <code>int</code> |
| `diversity` | b | `true` | <code>boolean</code> |
| `nAttemptsDiversity` | i | `100` | <code>int</code> |
| `remap` | b | `false` | <code>boolean</code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.core.solver.StandardEvolver">StandardEvolver</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr>&lt;<abbr title="java.util.List">List</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.representation.tree.Tree">Tree</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.representation.tree.numeric.Element">Element</abbr>&gt;&gt;, S, Q&gt;, <abbr title="io.github.ericmedvet.jgea.core.QualityBasedProblem">QualityBasedProblem</abbr>&lt;S, Q&gt;, <abbr title="java.util.List">List</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.representation.tree.Tree">Tree</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.representation.tree.numeric.Element">Element</abbr>&gt;&gt;, S, Q&gt;</code>

### Builder `ea.solver.numGA()`

`ea.s.numGA(mapper; initialMinV; initialMaxV; crossoverP; sigmaMut; tournamentRate; minNTournament; nPop; nEval; diversity; remap)`

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

Produces <code><abbr title="io.github.ericmedvet.jgea.core.solver.StandardEvolver">StandardEvolver</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr>&lt;<abbr title="java.util.List">List</abbr>&lt;<abbr title="java.lang.Double">Double</abbr>&gt;, S, Q&gt;, <abbr title="io.github.ericmedvet.jgea.core.QualityBasedProblem">QualityBasedProblem</abbr>&lt;S, Q&gt;, <abbr title="java.util.List">List</abbr>&lt;<abbr title="java.lang.Double">Double</abbr>&gt;, S, Q&gt;</code>

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

Produces <code><abbr title="io.github.ericmedvet.jgea.core.solver.speciation.SpeciatedEvolver">SpeciatedEvolver</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.QualityBasedProblem">QualityBasedProblem</abbr>&lt;S, Q&gt;, <abbr title="io.github.ericmedvet.jgea.core.representation.graph.Graph">Graph</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.representation.graph.Node">Node</abbr>, <abbr title="io.github.ericmedvet.jgea.core.representation.graph.numeric.operatorgraph.OperatorGraph$NonValuedArc">OperatorGraph$NonValuedArc</abbr>&gt;, S, Q&gt;</code>

### Builder `ea.solver.openAIES()`

`ea.s.openAIES(mapper; initialMinV; initialMaxV; sigma; batchSize; nEval)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `mapper` | npm |  | <code><abbr title="io.github.ericmedvet.jgea.experimenter.InvertibleMapper">InvertibleMapper</abbr>&lt;<abbr title="java.util.List">List</abbr>&lt;<abbr title="java.lang.Double">Double</abbr>&gt;, S&gt;</code> |
| `initialMinV` | d | `-1.0` | <code>double</code> |
| `initialMaxV` | d | `1.0` | <code>double</code> |
| `sigma` | d | `0.35` | <code>double</code> |
| `batchSize` | i | `15` | <code>int</code> |
| `nEval` | i |  | <code>int</code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.core.solver.OpenAIEvolutionaryStrategy">OpenAIEvolutionaryStrategy</abbr>&lt;S, Q&gt;</code>

### Builder `ea.solver.simpleES()`

`ea.s.simpleES(mapper; initialMinV; initialMaxV; sigma; parentsRate; nOfElites; nPop; nEval; remap)`

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

Produces <code><abbr title="io.github.ericmedvet.jgea.core.solver.SimpleEvolutionaryStrategy">SimpleEvolutionaryStrategy</abbr>&lt;S, Q&gt;</code>

### Builder `ea.solver.srTreeGP()`

`ea.s.srTreeGP(mapper; minConst; maxConst; nConst; operators; minTreeH; maxTreeH; crossoverP; tournamentRate; minNTournament; nPop; nEval; diversity; nAttemptsDiversity; remap)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `mapper` | npm |  | <code><abbr title="io.github.ericmedvet.jgea.experimenter.InvertibleMapper">InvertibleMapper</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.representation.tree.Tree">Tree</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.representation.tree.numeric.Element">Element</abbr>&gt;, S&gt;</code> |
| `minConst` | d | `0.0` | <code>double</code> |
| `maxConst` | d | `5.0` | <code>double</code> |
| `nConst` | i | `10` | <code>int</code> |
| `operators` | e[] | `[+, -, *, p/, plog]` | <code><abbr title="java.util.List">List</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.representation.tree.numeric.Element$Operator">Element$Operator</abbr>&gt;</code> |
| `minTreeH` | i | `3` | <code>int</code> |
| `maxTreeH` | i | `8` | <code>int</code> |
| `crossoverP` | d | `0.8` | <code>double</code> |
| `tournamentRate` | d | `0.05` | <code>double</code> |
| `minNTournament` | i | `3` | <code>int</code> |
| `nPop` | i | `100` | <code>int</code> |
| `nEval` | i |  | <code>int</code> |
| `diversity` | b | `true` | <code>boolean</code> |
| `nAttemptsDiversity` | i | `100` | <code>int</code> |
| `remap` | b | `false` | <code>boolean</code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.core.solver.StandardEvolver">StandardEvolver</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.representation.tree.Tree">Tree</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.representation.tree.numeric.Element">Element</abbr>&gt;, S, Q&gt;, <abbr title="io.github.ericmedvet.jgea.core.QualityBasedProblem">QualityBasedProblem</abbr>&lt;S, Q&gt;, <abbr title="io.github.ericmedvet.jgea.core.representation.tree.Tree">Tree</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.representation.tree.numeric.Element">Element</abbr>&gt;, S, Q&gt;</code>

## Package `evorobots`

Aliases: `er`, `evorobots`

### Builder `evorobots.doublesRandomizer()`

`er.doublesRandomizer(randomGenerator; range)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `randomGenerator` | npm | `sim.defaultRG()` | <code><abbr title="java.util.random.RandomGenerator">RandomGenerator</abbr></code> |
| `range` | npm | `sim.range(max=1.0;min=-1.0)` | <code><abbr title="io.github.ericmedvet.jsdynsym.core.DoubleRange">DoubleRange</abbr></code> |

Produces <code><abbr title="java.util.function.Function">Function</abbr>&lt;<abbr title="java.util.List">List</abbr>&lt;<abbr title="java.lang.Double">Double</abbr>&gt;, <abbr title="java.util.List">List</abbr>&lt;<abbr title="java.lang.Double">Double</abbr>&gt;&gt;</code>

### Builder `evorobots.fromBase64()`

`er.fromBase64(s)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `s` | s |  | <code><abbr title="java.lang.String">String</abbr></code> |

Produces <code><abbr title="java.util.function.Function">Function</abbr>&lt;<abbr title="java.lang.Object">Object</abbr>, <abbr title="java.lang.Object">Object</abbr>&gt;</code>

### Builder `evorobots.fromRunOutcome()`

`er.fromRunOutcome(filePath; index)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `filePath` | s |  | <code><abbr title="java.lang.String">String</abbr></code> |
| `index` | i | `0` | <code>int</code> |

Produces <code><abbr title="java.util.function.Function">Function</abbr>&lt;<abbr title="java.lang.Object">Object</abbr>, <abbr title="java.lang.Object">Object</abbr>&gt;</code>

### Builder `evorobots.play()`

`er.play(name; genotype; mapper; task; drawer; w; h; frameRate; startTime; endTime; codec; engine; videoFilePath)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `name` | s |  | <code><abbr title="java.lang.String">String</abbr></code> |
| `genotype` | npm | `ea.f.identity()` | <code><abbr title="java.util.function.Function">Function</abbr>&lt;G, G&gt;</code> |
| `mapper` | npm |  | <code><abbr title="io.github.ericmedvet.jgea.experimenter.InvertibleMapper">InvertibleMapper</abbr>&lt;G, S&gt;</code> |
| `task` | npm |  | <code><abbr title="io.github.ericmedvet.mrsim2d.core.tasks.Task">Task</abbr>&lt;S, O&gt;</code> |
| `drawer` | npm | `sim.drawer()` | <code><abbr title="java.util.function.Function">Function</abbr>&lt;<abbr title="java.lang.String">String</abbr>, <abbr title="io.github.ericmedvet.mrsim2d.viewer.Drawer">Drawer</abbr>&gt;</code> |
| `w` | i | `600` | <code>int</code> |
| `h` | i | `400` | <code>int</code> |
| `frameRate` | d | `30.0` | <code>double</code> |
| `startTime` | d | `0.0` | <code>double</code> |
| `endTime` | d | `30.0` | <code>double</code> |
| `codec` | e | `JCODEC` | <code><abbr title="io.github.ericmedvet.mrsim2d.viewer.VideoUtils$EncoderFacility">VideoUtils$EncoderFacility</abbr></code> |
| `engine` | npm | `sim.engine()` | <code><abbr title="java.util.function.Supplier">Supplier</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.engine.Engine">Engine</abbr>&gt;</code> |
| `videoFilePath` | s |  | <code><abbr title="java.lang.String">String</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.robotevo2d.main.Play">Play</abbr></code>

### Builder `evorobots.video()`

`er.video(dirPath; fileNameTemplate; w; h; frameRate; startTime; endTime; codec; drawer; task; engine; individual)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `dirPath` | s |  | <code><abbr title="java.lang.String">String</abbr></code> |
| `fileNameTemplate` | s | `video-%s.mp4` | <code><abbr title="java.lang.String">String</abbr></code> |
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

Produces <code><abbr title="io.github.ericmedvet.jgea.core.listener.AccumulatorFactory">AccumulatorFactory</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr>&lt;?, A, ?&gt;, <abbr title="java.io.File">File</abbr>, <abbr title="io.github.ericmedvet.jgea.experimenter.Run">Run</abbr>&lt;?, ?, A, ?&gt;&gt;</code>

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

Produces <code><abbr title="io.github.ericmedvet.jsdynsym.buildable.builders.NumericalDynamicalSystems$Builder">NumericalDynamicalSystems$Builder</abbr>&lt;<abbr title="io.github.ericmedvet.robotevo2d.main.dynamicalsystems.IOSaver">IOSaver</abbr>&lt;S&gt;, S&gt;</code>

### Builder `evorobots.dynamicalSystem.numerical.oGraphMRF()`

`er.ds.num.oGraphMRF(postOperator)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `postOperator` | e | `IDENTITY` | <code><abbr title="io.github.ericmedvet.jsdynsym.core.numerical.ann.MultiLayerPerceptron$ActivationFunction">MultiLayerPerceptron$ActivationFunction</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.jsdynsym.buildable.builders.NumericalDynamicalSystems$Builder">NumericalDynamicalSystems$Builder</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.representation.NamedMultivariateRealFunction">NamedMultivariateRealFunction</abbr>, <abbr title="io.github.ericmedvet.jsdynsym.core.StatelessSystem$State">StatelessSystem$State</abbr>&gt;</code>

### Builder `evorobots.dynamicalSystem.numerical.treeMRF()`

`er.ds.num.treeMRF(postOperator)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `postOperator` | e | `IDENTITY` | <code><abbr title="io.github.ericmedvet.jsdynsym.core.numerical.ann.MultiLayerPerceptron$ActivationFunction">MultiLayerPerceptron$ActivationFunction</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.jsdynsym.buildable.builders.NumericalDynamicalSystems$Builder">NumericalDynamicalSystems$Builder</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.representation.NamedMultivariateRealFunction">NamedMultivariateRealFunction</abbr>, <abbr title="io.github.ericmedvet.jsdynsym.core.StatelessSystem$State">StatelessSystem$State</abbr>&gt;</code>

## Package `evorobots.listener`

Aliases: `er.l`, `er.listener`, `evorobots.l`, `evorobots.listener`

### Builder `evorobots.listener.videoSaver()`

`er.l.videoSaver(videos)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `videos` | npm[] | `[]` | <code><abbr title="java.util.List">List</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.listener.AccumulatorFactory">AccumulatorFactory</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr>&lt;?, A, ?&gt;, <abbr title="java.io.File">File</abbr>, <abbr title="io.github.ericmedvet.jgea.experimenter.Run">Run</abbr>&lt;?, ?, A, ?&gt;&gt;&gt;</code> |

Produces <code><abbr title="java.util.function.BiFunction">BiFunction</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.experimenter.Experiment">Experiment</abbr>, <abbr title="java.util.concurrent.ExecutorService">ExecutorService</abbr>, <abbr title="io.github.ericmedvet.jgea.core.listener.ListenerFactory">ListenerFactory</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr>&lt;?, A, ?&gt;, <abbr title="io.github.ericmedvet.jgea.experimenter.Run">Run</abbr>&lt;?, ?, A, ?&gt;&gt;&gt;</code>

## Package `evorobots.mapper`

Aliases: `er.m`, `er.mapper`, `evorobots.m`, `evorobots.mapper`

### Builder `evorobots.mapper.numericalParametrizedHeteroBrains()`

`er.m.numericalParametrizedHeteroBrains(target)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `target` | npm |  | <code>T</code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.experimenter.InvertibleMapper">InvertibleMapper</abbr>&lt;<abbr title="java.util.List">List</abbr>&lt;<abbr title="java.lang.Double">Double</abbr>&gt;, <abbr title="java.util.function.Supplier">Supplier</abbr>&lt;T&gt;&gt;</code>

### Builder `evorobots.mapper.numericalParametrizedHomoBrains()`

`er.m.numericalParametrizedHomoBrains(target)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `target` | npm |  | <code>T</code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.experimenter.InvertibleMapper">InvertibleMapper</abbr>&lt;<abbr title="java.util.List">List</abbr>&lt;<abbr title="java.lang.Double">Double</abbr>&gt;, <abbr title="java.util.function.Supplier">Supplier</abbr>&lt;T&gt;&gt;</code>

### Builder `evorobots.mapper.oGraphParametrizedHomoBrains()`

`er.m.oGraphParametrizedHomoBrains(target)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `target` | npm |  | <code>T</code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.experimenter.InvertibleMapper">InvertibleMapper</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.representation.graph.Graph">Graph</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.representation.graph.Node">Node</abbr>, <abbr title="io.github.ericmedvet.jgea.core.representation.graph.numeric.operatorgraph.OperatorGraph$NonValuedArc">OperatorGraph$NonValuedArc</abbr>&gt;, <abbr title="java.util.function.Supplier">Supplier</abbr>&lt;T&gt;&gt;</code>

### Builder `evorobots.mapper.treeParametrizedHomoBrains()`

`er.m.treeParametrizedHomoBrains(target)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `target` | npm |  | <code>T</code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.experimenter.InvertibleMapper">InvertibleMapper</abbr>&lt;<abbr title="java.util.List">List</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.representation.tree.Tree">Tree</abbr>&lt;<abbr title="io.github.ericmedvet.jgea.core.representation.tree.numeric.Element">Element</abbr>&gt;&gt;, <abbr title="java.util.function.Supplier">Supplier</abbr>&lt;T&gt;&gt;</code>

## Package `evorobots.namedFunction`

Aliases: `er.namedFunction`, `er.nf`, `evorobots.namedFunction`, `evorobots.nf`

### Builder `evorobots.namedFunction.stringBase64()`

`er.nf.stringBase64(f)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `f` | npm |  | <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;X, <abbr title="java.io.Serializable">Serializable</abbr>&gt;</code> |

Produces <code><abbr title="io.github.ericmedvet.jgea.core.listener.NamedFunction">NamedFunction</abbr>&lt;X, <abbr title="java.lang.String">String</abbr>&gt;</code>

## Package `sim`

Aliases: `s`, `sim`

### Builder `sim.defaultRG()`

`s.defaultRG(seed)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `seed` | i | `0` | <code>int</code> |

Produces <code><abbr title="java.util.random.RandomGenerator">RandomGenerator</abbr></code>

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

Produces <code><abbr title="java.util.function.Function">Function</abbr>&lt;<abbr title="java.lang.String">String</abbr>, <abbr title="io.github.ericmedvet.mrsim2d.viewer.Drawer">Drawer</abbr>&gt;</code>

### Builder `sim.engine()`

`s.engine()`

Produces <code><abbr title="java.util.function.Supplier">Supplier</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.engine.Engine">Engine</abbr>&gt;</code>

### Builder `sim.range()`

`s.range(min; max)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `min` | d |  | <code>double</code> |
| `max` | d |  | <code>double</code> |

Produces <code><abbr title="io.github.ericmedvet.jsdynsym.core.DoubleRange">DoubleRange</abbr></code>

### Builder `sim.supplier()`

`s.supplier(of)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `of` | npm |  | <code>T</code> |

Produces <code><abbr title="java.util.function.Supplier">Supplier</abbr>&lt;T&gt;</code>

### Builder `sim.taskRunner()`

`s.taskRunner(task; engine)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `task` | npm |  | <code><abbr title="io.github.ericmedvet.mrsim2d.core.tasks.Task">Task</abbr>&lt;A, O&gt;</code> |
| `engine` | npm | `sim.engine()` | <code><abbr title="java.util.function.Supplier">Supplier</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.engine.Engine">Engine</abbr>&gt;</code> |

Produces <code><abbr title="java.util.function.Function">Function</abbr>&lt;A, O&gt;</code>

## Package `sim.agent`

Aliases: `s.a`, `s.agent`, `sim.a`, `sim.agent`

### Builder `sim.agent.centralizedNumGridVSR()`

`s.a.centralizedNumGridVSR(body; function)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `body` | npm |  | <code><abbr title="io.github.ericmedvet.mrsim2d.core.agents.gridvsr.GridBody">GridBody</abbr></code> |
| `function` | npm |  | <code><abbr title="io.github.ericmedvet.jsdynsym.buildable.builders.NumericalDynamicalSystems$Builder">NumericalDynamicalSystems$Builder</abbr>&lt;?, ?&gt;</code> |

Produces <code><abbr title="io.github.ericmedvet.mrsim2d.core.agents.gridvsr.CentralizedNumGridVSR">CentralizedNumGridVSR</abbr></code>

### Builder `sim.agent.distributedNumGridVSR()`

`s.a.distributedNumGridVSR(body; function; signals; directional)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `body` | npm |  | <code><abbr title="io.github.ericmedvet.mrsim2d.core.agents.gridvsr.GridBody">GridBody</abbr></code> |
| `function` | npm |  | <code><abbr title="io.github.ericmedvet.jsdynsym.buildable.builders.NumericalDynamicalSystems$Builder">NumericalDynamicalSystems$Builder</abbr>&lt;?, ?&gt;</code> |
| `signals` | i |  | <code>int</code> |
| `directional` | b | `false` | <code>boolean</code> |

Produces <code><abbr title="io.github.ericmedvet.mrsim2d.core.agents.gridvsr.DistributedNumGridVSR">DistributedNumGridVSR</abbr></code>

### Builder `sim.agent.numIndependentVoxel()`

`s.a.numIndependentVoxel(sensors; areaActuation; attachActuation; nOfNFCChannels; function)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `sensors` | npm[] | `[]` | <code><abbr title="java.util.List">List</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.Sensor">Sensor</abbr>&lt;? super <abbr title="io.github.ericmedvet.mrsim2d.core.bodies.Voxel">Voxel</abbr>&gt;&gt;</code> |
| `areaActuation` | e | `SIDES` | <code><abbr title="io.github.ericmedvet.mrsim2d.core.agents.independentvoxel.NumIndependentVoxel$AreaActuation">NumIndependentVoxel$AreaActuation</abbr></code> |
| `attachActuation` | b | `true` | <code>boolean</code> |
| `nOfNFCChannels` | i | `1` | <code>int</code> |
| `function` | npm |  | <code><abbr title="io.github.ericmedvet.jsdynsym.buildable.builders.NumericalDynamicalSystems$Builder">NumericalDynamicalSystems$Builder</abbr>&lt;?, ?&gt;</code> |

Produces <code><abbr title="io.github.ericmedvet.mrsim2d.core.agents.independentvoxel.NumIndependentVoxel">NumIndependentVoxel</abbr></code>

### Builder `sim.agent.numLeggedHybridModularRobot()`

`s.a.numLeggedHybridModularRobot(modules; function)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `modules` | npm[] | `[]` | <code><abbr title="java.util.List">List</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.agents.legged.AbstractLeggedHybridModularRobot$Module">AbstractLeggedHybridModularRobot$Module</abbr>&gt;</code> |
| `function` | npm |  | <code><abbr title="io.github.ericmedvet.jsdynsym.buildable.builders.NumericalDynamicalSystems$Builder">NumericalDynamicalSystems$Builder</abbr>&lt;?, ?&gt;</code> |

Produces <code><abbr title="io.github.ericmedvet.mrsim2d.core.agents.legged.NumLeggedHybridModularRobot">NumLeggedHybridModularRobot</abbr></code>

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

Produces <code><abbr title="io.github.ericmedvet.mrsim2d.core.agents.legged.NumLeggedHybridRobot">NumLeggedHybridRobot</abbr></code>

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

Produces <code><abbr title="io.github.ericmedvet.mrsim2d.core.agents.legged.AbstractLeggedHybridRobot$Leg">AbstractLeggedHybridRobot$Leg</abbr></code>

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
| `activeAngleRange` | npm | `sim.range(max=1.047;min=-1.047)` | <code><abbr title="io.github.ericmedvet.jsdynsym.core.DoubleRange">DoubleRange</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.mrsim2d.core.agents.legged.LegChunk">LegChunk</abbr></code>

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

Produces <code><abbr title="io.github.ericmedvet.mrsim2d.core.agents.legged.AbstractLeggedHybridModularRobot$Module">AbstractLeggedHybridModularRobot$Module</abbr></code>

## Package `sim.agent.vsr`

Aliases: `s.a.vsr`, `s.agent.vsr`, `sim.a.vsr`, `sim.agent.vsr`

### Builder `sim.agent.vsr.gridBody()`

`s.a.vsr.gridBody(shape; sensorizingFunction)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `shape` | npm |  | <code><abbr title="io.github.ericmedvet.mrsim2d.core.util.Grid">Grid</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.agents.gridvsr.GridBody$VoxelType">GridBody$VoxelType</abbr>&gt;</code> |
| `sensorizingFunction` | npm |  | <code><abbr title="java.util.function.Function">Function</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.util.Grid">Grid</abbr>&lt;<abbr title="java.lang.Boolean">Boolean</abbr>&gt;, <abbr title="io.github.ericmedvet.mrsim2d.core.util.Grid">Grid</abbr>&lt;<abbr title="java.util.List">List</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.Sensor">Sensor</abbr>&lt;? super <abbr title="io.github.ericmedvet.mrsim2d.core.bodies.Body">Body</abbr>&gt;&gt;&gt;&gt;</code> |

Produces <code><abbr title="io.github.ericmedvet.mrsim2d.core.agents.gridvsr.GridBody">GridBody</abbr></code>

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

Produces <code><abbr title="java.util.function.Function">Function</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.util.Grid">Grid</abbr>&lt;<abbr title="java.lang.Boolean">Boolean</abbr>&gt;, <abbr title="io.github.ericmedvet.mrsim2d.core.util.Grid">Grid</abbr>&lt;<abbr title="java.util.List">List</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.Sensor">Sensor</abbr>&lt;? super <abbr title="io.github.ericmedvet.mrsim2d.core.bodies.Voxel">Voxel</abbr>&gt;&gt;&gt;&gt;</code>

### Builder `sim.agent.vsr.sensorizingFunction.empty()`

`s.a.vsr.sf.empty()`

Produces <code><abbr title="java.util.function.Function">Function</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.util.Grid">Grid</abbr>&lt;<abbr title="java.lang.Boolean">Boolean</abbr>&gt;, <abbr title="io.github.ericmedvet.mrsim2d.core.util.Grid">Grid</abbr>&lt;<abbr title="java.util.List">List</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.Sensor">Sensor</abbr>&lt;? super <abbr title="io.github.ericmedvet.mrsim2d.core.bodies.Voxel">Voxel</abbr>&gt;&gt;&gt;&gt;</code>

### Builder `sim.agent.vsr.sensorizingFunction.uniform()`

`s.a.vsr.sf.uniform(sensors)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `sensors` | npm[] | `[]` | <code><abbr title="java.util.List">List</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.Sensor">Sensor</abbr>&lt;? super <abbr title="io.github.ericmedvet.mrsim2d.core.bodies.Voxel">Voxel</abbr>&gt;&gt;</code> |

Produces <code><abbr title="java.util.function.Function">Function</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.util.Grid">Grid</abbr>&lt;<abbr title="java.lang.Boolean">Boolean</abbr>&gt;, <abbr title="io.github.ericmedvet.mrsim2d.core.util.Grid">Grid</abbr>&lt;<abbr title="java.util.List">List</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.Sensor">Sensor</abbr>&lt;? super <abbr title="io.github.ericmedvet.mrsim2d.core.bodies.Voxel">Voxel</abbr>&gt;&gt;&gt;&gt;</code>

## Package `sim.agent.vsr.shape`

Aliases: `s.a.vsr.s`, `s.a.vsr.shape`, `s.agent.vsr.s`, `s.agent.vsr.shape`, `sim.a.vsr.s`, `sim.a.vsr.shape`, `sim.agent.vsr.s`, `sim.agent.vsr.shape`

### Builder `sim.agent.vsr.shape.ball()`

`s.a.vsr.s.ball(d)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `d` | i |  | <code><abbr title="java.lang.Integer">Integer</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.mrsim2d.core.util.Grid">Grid</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.agents.gridvsr.GridBody$VoxelType">GridBody$VoxelType</abbr>&gt;</code>

### Builder `sim.agent.vsr.shape.biped()`

`s.a.vsr.s.biped(w; h)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `w` | i |  | <code><abbr title="java.lang.Integer">Integer</abbr></code> |
| `h` | i |  | <code><abbr title="java.lang.Integer">Integer</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.mrsim2d.core.util.Grid">Grid</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.agents.gridvsr.GridBody$VoxelType">GridBody$VoxelType</abbr>&gt;</code>

### Builder `sim.agent.vsr.shape.comb()`

`s.a.vsr.s.comb(w; h)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `w` | i |  | <code><abbr title="java.lang.Integer">Integer</abbr></code> |
| `h` | i |  | <code><abbr title="java.lang.Integer">Integer</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.mrsim2d.core.util.Grid">Grid</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.agents.gridvsr.GridBody$VoxelType">GridBody$VoxelType</abbr>&gt;</code>

### Builder `sim.agent.vsr.shape.free()`

`s.a.vsr.s.free(s)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `s` | s | `rsr-s.s` | <code><abbr title="java.lang.String">String</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.mrsim2d.core.util.Grid">Grid</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.agents.gridvsr.GridBody$VoxelType">GridBody$VoxelType</abbr>&gt;</code>

### Builder `sim.agent.vsr.shape.t()`

`s.a.vsr.s.t(w; h)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `w` | i |  | <code><abbr title="java.lang.Integer">Integer</abbr></code> |
| `h` | i |  | <code><abbr title="java.lang.Integer">Integer</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.mrsim2d.core.util.Grid">Grid</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.agents.gridvsr.GridBody$VoxelType">GridBody$VoxelType</abbr>&gt;</code>

### Builder `sim.agent.vsr.shape.triangle()`

`s.a.vsr.s.triangle(l)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `l` | i |  | <code><abbr title="java.lang.Integer">Integer</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.mrsim2d.core.util.Grid">Grid</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.agents.gridvsr.GridBody$VoxelType">GridBody$VoxelType</abbr>&gt;</code>

### Builder `sim.agent.vsr.shape.tripod()`

`s.a.vsr.s.tripod(w; h)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `w` | i |  | <code><abbr title="java.lang.Integer">Integer</abbr></code> |
| `h` | i |  | <code><abbr title="java.lang.Integer">Integer</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.mrsim2d.core.util.Grid">Grid</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.agents.gridvsr.GridBody$VoxelType">GridBody$VoxelType</abbr>&gt;</code>

### Builder `sim.agent.vsr.shape.worm()`

`s.a.vsr.s.worm(w; h)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `w` | i |  | <code><abbr title="java.lang.Integer">Integer</abbr></code> |
| `h` | i |  | <code><abbr title="java.lang.Integer">Integer</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.mrsim2d.core.util.Grid">Grid</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.agents.gridvsr.GridBody$VoxelType">GridBody$VoxelType</abbr>&gt;</code>

## Package `sim.sensor`

Aliases: `s.s`, `s.sensor`, `sim.s`, `sim.sensor`

### Builder `sim.sensor.a()`

`s.s.a()`

Produces <code><abbr title="io.github.ericmedvet.mrsim2d.core.Sensor">Sensor</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.bodies.Body">Body</abbr>&gt;</code>

### Builder `sim.sensor.ar()`

`s.s.ar()`

Produces <code><abbr title="io.github.ericmedvet.mrsim2d.core.Sensor">Sensor</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.bodies.Body">Body</abbr>&gt;</code>

### Builder `sim.sensor.c()`

`s.s.c()`

Produces <code><abbr title="io.github.ericmedvet.mrsim2d.core.Sensor">Sensor</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.bodies.Body">Body</abbr>&gt;</code>

### Builder `sim.sensor.d()`

`s.s.d(a; r)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `a` | d | `0.0` | <code><abbr title="java.lang.Double">Double</abbr></code> |
| `r` | d | `1.0` | <code><abbr title="java.lang.Double">Double</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.mrsim2d.core.Sensor">Sensor</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.bodies.Body">Body</abbr>&gt;</code>

### Builder `sim.sensor.ja()`

`s.s.ja()`

Produces <code><abbr title="io.github.ericmedvet.mrsim2d.core.Sensor">Sensor</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.bodies.RotationalJoint">RotationalJoint</abbr>&gt;</code>

### Builder `sim.sensor.rv()`

`s.s.rv(a)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `a` | d | `0.0` | <code><abbr title="java.lang.Double">Double</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.mrsim2d.core.Sensor">Sensor</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.bodies.Body">Body</abbr>&gt;</code>

### Builder `sim.sensor.sa()`

`s.s.sa(s)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `s` | e |  | <code><abbr title="io.github.ericmedvet.mrsim2d.core.bodies.Voxel$Side">Voxel$Side</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.mrsim2d.core.Sensor">Sensor</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.bodies.Voxel">Voxel</abbr>&gt;</code>

### Builder `sim.sensor.sc()`

`s.s.sc(s)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `s` | e |  | <code><abbr title="io.github.ericmedvet.mrsim2d.core.bodies.Voxel$Side">Voxel$Side</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.mrsim2d.core.Sensor">Sensor</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.bodies.Voxel">Voxel</abbr>&gt;</code>

### Builder `sim.sensor.sin()`

`s.s.sin(f; p)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `f` | d | `1.0` | <code><abbr title="java.lang.Double">Double</abbr></code> |
| `p` | d | `0.0` | <code><abbr title="java.lang.Double">Double</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.mrsim2d.core.Sensor">Sensor</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.bodies.Body">Body</abbr>&gt;</code>

## Package `sim.task`

Aliases: `s.task`, `sim.task`

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

Produces <code><abbr title="io.github.ericmedvet.mrsim2d.core.tasks.piling.FallPiling">FallPiling</abbr></code>

### Builder `sim.task.locomotion()`

`s.task.locomotion(duration; terrain; initialXGap; initialYGap)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `duration` | d | `30.0` | <code>double</code> |
| `terrain` | npm | `sim.terrain.flat()` | <code><abbr title="io.github.ericmedvet.mrsim2d.core.geometry.Terrain">Terrain</abbr></code> |
| `initialXGap` | d | `1.0` | <code>double</code> |
| `initialYGap` | d | `0.1` | <code>double</code> |

Produces <code><abbr title="io.github.ericmedvet.mrsim2d.core.tasks.locomotion.Locomotion">Locomotion</abbr></code>

### Builder `sim.task.prebuiltIndependentLocomotion()`

`s.task.prebuiltIndependentLocomotion(duration; terrain; initialXGap; initialYGap; shape)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `duration` | d | `30.0` | <code>double</code> |
| `terrain` | npm | `sim.terrain.flat()` | <code><abbr title="io.github.ericmedvet.mrsim2d.core.geometry.Terrain">Terrain</abbr></code> |
| `initialXGap` | d | `1.0` | <code>double</code> |
| `initialYGap` | d | `0.1` | <code>double</code> |
| `shape` | npm |  | <code><abbr title="io.github.ericmedvet.mrsim2d.core.util.Grid">Grid</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.agents.gridvsr.GridBody$VoxelType">GridBody$VoxelType</abbr>&gt;</code> |

Produces <code><abbr title="io.github.ericmedvet.mrsim2d.core.tasks.locomotion.PrebuiltIndependentLocomotion">PrebuiltIndependentLocomotion</abbr></code>

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

Produces <code><abbr title="io.github.ericmedvet.mrsim2d.core.tasks.piling.StandPiling">StandPiling</abbr></code>

## Package `sim.task.locomotion`

Aliases: `s.task.l`, `s.task.locomotion`, `sim.task.l`, `sim.task.locomotion`

### Builder `sim.task.locomotion.avgArea()`

`s.task.l.avgArea(transientTime)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `transientTime` | d | `0.0` | <code>double</code> |

Produces <code><abbr title="java.util.function.Function">Function</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.tasks.Outcome">Outcome</abbr>, <abbr title="java.lang.Double">Double</abbr>&gt;</code>

### Builder `sim.task.locomotion.avgTerrainHeight()`

`s.task.l.avgTerrainHeight(transientTime)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `transientTime` | d | `0.0` | <code>double</code> |

Produces <code><abbr title="java.util.function.Function">Function</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.tasks.Outcome">Outcome</abbr>, <abbr title="java.lang.Double">Double</abbr>&gt;</code>

### Builder `sim.task.locomotion.xDistance()`

`s.task.l.xDistance(transientTime)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `transientTime` | d | `0.0` | <code>double</code> |

Produces <code><abbr title="java.util.function.Function">Function</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.tasks.Outcome">Outcome</abbr>, <abbr title="java.lang.Double">Double</abbr>&gt;</code>

### Builder `sim.task.locomotion.xVelocity()`

`s.task.l.xVelocity(transientTime)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `transientTime` | d | `0.0` | <code>double</code> |

Produces <code><abbr title="java.util.function.Function">Function</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.tasks.Outcome">Outcome</abbr>, <abbr title="java.lang.Double">Double</abbr>&gt;</code>

## Package `sim.task.piling`

Aliases: `s.task.p`, `s.task.piling`, `sim.task.p`, `sim.task.piling`

### Builder `sim.task.piling.avgH()`

`s.task.p.avgH(transientTime)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `transientTime` | d | `0.0` | <code>double</code> |

Produces <code><abbr title="java.util.function.Function">Function</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.tasks.Outcome">Outcome</abbr>, <abbr title="java.lang.Double">Double</abbr>&gt;</code>

### Builder `sim.task.piling.avgW()`

`s.task.p.avgW(transientTime)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `transientTime` | d | `0.0` | <code>double</code> |

Produces <code><abbr title="java.util.function.Function">Function</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.tasks.Outcome">Outcome</abbr>, <abbr title="java.lang.Double">Double</abbr>&gt;</code>

### Builder `sim.task.piling.maxH()`

`s.task.p.maxH(transientTime)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `transientTime` | d | `0.0` | <code>double</code> |

Produces <code><abbr title="java.util.function.Function">Function</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.tasks.Outcome">Outcome</abbr>, <abbr title="java.lang.Double">Double</abbr>&gt;</code>

### Builder `sim.task.piling.maxW()`

`s.task.p.maxW(transientTime)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `transientTime` | d | `0.0` | <code>double</code> |

Produces <code><abbr title="java.util.function.Function">Function</abbr>&lt;<abbr title="io.github.ericmedvet.mrsim2d.core.tasks.Outcome">Outcome</abbr>, <abbr title="java.lang.Double">Double</abbr>&gt;</code>

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

Produces <code><abbr title="io.github.ericmedvet.mrsim2d.core.geometry.Terrain">Terrain</abbr></code>

### Builder `sim.terrain.flat()`

`s.t.flat(w; h; borderW; borderH)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `w` | d | `500.0` | <code><abbr title="java.lang.Double">Double</abbr></code> |
| `h` | d | `25.0` | <code><abbr title="java.lang.Double">Double</abbr></code> |
| `borderW` | d | `10.0` | <code><abbr title="java.lang.Double">Double</abbr></code> |
| `borderH` | d | `100.0` | <code><abbr title="java.lang.Double">Double</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.mrsim2d.core.geometry.Terrain">Terrain</abbr></code>

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

Produces <code><abbr title="io.github.ericmedvet.mrsim2d.core.geometry.Terrain">Terrain</abbr></code>

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

Produces <code><abbr title="io.github.ericmedvet.mrsim2d.core.geometry.Terrain">Terrain</abbr></code>

### Builder `sim.terrain.uphill()`

`s.t.uphill(w; h; borderW; borderH; a)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `w` | d | `500.0` | <code><abbr title="java.lang.Double">Double</abbr></code> |
| `h` | d | `25.0` | <code><abbr title="java.lang.Double">Double</abbr></code> |
| `borderW` | d | `10.0` | <code><abbr title="java.lang.Double">Double</abbr></code> |
| `borderH` | d | `100.0` | <code><abbr title="java.lang.Double">Double</abbr></code> |
| `a` | d | `10.0` | <code><abbr title="java.lang.Double">Double</abbr></code> |

Produces <code><abbr title="io.github.ericmedvet.mrsim2d.core.geometry.Terrain">Terrain</abbr></code>

