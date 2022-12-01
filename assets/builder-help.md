## Package `ea`

### Builder `ea.experiment()`

`ea.experiment(name; runs; listeners)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `name` | s |  | <code><abbr title="java.lang.String">String</abbr></code> |
| `runs` | npm[] | `[]` | <code><abbr title="java.util.List">List</abbr><<abbr title="it.units.malelab.jgea.experimenter.Run">Run</abbr><?, ?, ?, ?>></code> |
| `listeners` | npm[] | `[ea.l.console()]` | <code><abbr title="java.util.List">List</abbr><<abbr title="java.util.function.BiFunction">BiFunction</abbr><<abbr title="it.units.malelab.jgea.experimenter.Experiment">Experiment</abbr>, <abbr title="java.util.concurrent.ExecutorService">ExecutorService</abbr>, <abbr title="it.units.malelab.jgea.core.listener.ListenerFactory">ListenerFactory</abbr><? super <abbr title="it.units.malelab.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr><?, ?, ?>, <abbr title="it.units.malelab.jgea.experimenter.Run">Run</abbr><?, ?, ?, ?>>>></code> |

Produces <code><abbr title="it.units.malelab.jgea.experimenter.Experiment">Experiment</abbr></code>

### Builder `ea.run()`

`ea.run(solver; problem; randomGenerator; )`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `solver` | npm |  | <code><abbr title="it.units.malelab.jgea.core.solver.AbstractPopulationBasedIterativeSolver">AbstractPopulationBasedIterativeSolver</abbr><? extends <abbr title="it.units.malelab.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr><G, S, Q>, P, G, S, Q></code> |
| `problem` | npm |  | <code>P</code> |
| `randomGenerator` | npm |  | <code><abbr title="java.util.random.RandomGenerator">RandomGenerator</abbr></code> |

Produces <code><abbr title="it.units.malelab.jgea.experimenter.Run">Run</abbr></code>

## Package `ea.function`

Aliases: `ea.f`, `ea.function`

### Builder `ea.function.identity()`

`ea.f.identity()`

Produces <code><abbr title="java.util.function.Function">Function</abbr><T, T></code>

## Package `ea.listener`

Aliases: `ea.l`, `ea.listener`

### Builder `ea.listener.allCsv()`

`ea.l.allCsv(filePath; defaultFunctions; functions; individualFunctions; runKeys; deferred; onlyLast)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `filePath` | s |  | <code><abbr title="java.lang.String">String</abbr></code> |
| `defaultFunctions` | npm[] | `[ea.nf.iterations()]` | <code><abbr title="java.util.List">List</abbr><<abbr title="it.units.malelab.jgea.core.listener.NamedFunction">NamedFunction</abbr><? super <abbr title="it.units.malelab.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr><G, S, Q>, ?>></code> |
| `functions` | npm[] | `[]` | <code><abbr title="java.util.List">List</abbr><<abbr title="it.units.malelab.jgea.core.listener.NamedFunction">NamedFunction</abbr><? super <abbr title="it.units.malelab.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr><G, S, Q>, ?>></code> |
| `individualFunctions` | npm[] | `[]` | <code><abbr title="java.util.List">List</abbr><<abbr title="it.units.malelab.jgea.core.listener.NamedFunction">NamedFunction</abbr><? super <abbr title="it.units.malelab.jgea.core.solver.Individual">Individual</abbr><G, S, Q>, ?>></code> |
| `runKeys` | s[] | `[]` | <code><abbr title="java.util.List">List</abbr><<abbr title="java.lang.String">String</abbr>></code> |
| `deferred` | b | `false` | <code>boolean</code> |
| `onlyLast` | b | `false` | <code>boolean</code> |

Produces <code><abbr title="java.util.function.BiFunction">BiFunction</abbr><<abbr title="it.units.malelab.jgea.experimenter.Experiment">Experiment</abbr>, <abbr title="java.util.concurrent.ExecutorService">ExecutorService</abbr>, <abbr title="it.units.malelab.jgea.core.listener.ListenerFactory">ListenerFactory</abbr><? super <abbr title="it.units.malelab.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr><G, S, Q>, <abbr title="it.units.malelab.jgea.experimenter.Run">Run</abbr><?, G, S, Q>>></code>

### Builder `ea.listener.bestCsv()`

`ea.l.bestCsv(filePath; defaultFunctions; functions; runKeys; deferred; onlyLast)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `filePath` | s |  | <code><abbr title="java.lang.String">String</abbr></code> |
| `defaultFunctions` | npm[] | `[ea.nf.iterations(), ea.nf.evals(), ea.nf.births(), ea.nf.elapsed(), ea.nf.size(f=ea.nf.all()), ea.nf.size(f=ea.nf.firsts()), ea.nf.size(f=ea.nf.lasts()), ea.nf.uniqueness(collection=ea.nf.each(collection=ea.nf.all();map=ea.nf.genotype())), ea.nf.uniqueness(collection=ea.nf.each(collection=ea.nf.all();map=ea.nf.solution())), ea.nf.uniqueness(collection=ea.nf.each(collection=ea.nf.all();map=ea.nf.fitness()))]` | <code><abbr title="java.util.List">List</abbr><<abbr title="it.units.malelab.jgea.core.listener.NamedFunction">NamedFunction</abbr><? super <abbr title="it.units.malelab.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr><G, S, Q>, ?>></code> |
| `functions` | npm[] | `[]` | <code><abbr title="java.util.List">List</abbr><<abbr title="it.units.malelab.jgea.core.listener.NamedFunction">NamedFunction</abbr><? super <abbr title="it.units.malelab.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr><G, S, Q>, ?>></code> |
| `runKeys` | s[] | `[]` | <code><abbr title="java.util.List">List</abbr><<abbr title="java.lang.String">String</abbr>></code> |
| `deferred` | b | `false` | <code>boolean</code> |
| `onlyLast` | b | `false` | <code>boolean</code> |

Produces <code><abbr title="java.util.function.BiFunction">BiFunction</abbr><<abbr title="it.units.malelab.jgea.experimenter.Experiment">Experiment</abbr>, <abbr title="java.util.concurrent.ExecutorService">ExecutorService</abbr>, <abbr title="it.units.malelab.jgea.core.listener.ListenerFactory">ListenerFactory</abbr><? super <abbr title="it.units.malelab.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr><G, S, Q>, <abbr title="it.units.malelab.jgea.experimenter.Run">Run</abbr><?, G, S, Q>>></code>

### Builder `ea.listener.console()`

`ea.l.console(defaultFunctions; functions; runKeys; deferred; onlyLast)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `defaultFunctions` | npm[] | `[ea.nf.iterations(), ea.nf.evals(), ea.nf.births(), ea.nf.elapsed(), ea.nf.size(f=ea.nf.all()), ea.nf.size(f=ea.nf.firsts()), ea.nf.size(f=ea.nf.lasts()), ea.nf.uniqueness(collection=ea.nf.each(collection=ea.nf.all();map=ea.nf.genotype())), ea.nf.uniqueness(collection=ea.nf.each(collection=ea.nf.all();map=ea.nf.solution())), ea.nf.uniqueness(collection=ea.nf.each(collection=ea.nf.all();map=ea.nf.fitness()))]` | <code><abbr title="java.util.List">List</abbr><<abbr title="it.units.malelab.jgea.core.listener.NamedFunction">NamedFunction</abbr><? super <abbr title="it.units.malelab.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr><G, S, Q>, ?>></code> |
| `functions` | npm[] | `[]` | <code><abbr title="java.util.List">List</abbr><<abbr title="it.units.malelab.jgea.core.listener.NamedFunction">NamedFunction</abbr><? super <abbr title="it.units.malelab.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr><G, S, Q>, ?>></code> |
| `runKeys` | s[] | `[]` | <code><abbr title="java.util.List">List</abbr><<abbr title="java.lang.String">String</abbr>></code> |
| `deferred` | b | `false` | <code>boolean</code> |
| `onlyLast` | b | `false` | <code>boolean</code> |

Produces <code><abbr title="java.util.function.BiFunction">BiFunction</abbr><<abbr title="it.units.malelab.jgea.experimenter.Experiment">Experiment</abbr>, <abbr title="java.util.concurrent.ExecutorService">ExecutorService</abbr>, <abbr title="it.units.malelab.jgea.core.listener.ListenerFactory">ListenerFactory</abbr><<abbr title="it.units.malelab.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr><G, S, Q>, <abbr title="it.units.malelab.jgea.experimenter.Run">Run</abbr><?, G, S, Q>>></code>

### Builder `ea.listener.telegram()`

`ea.l.telegram(chatId; botIdFilePath; defaultPlots; plots; accumulators; deferred; onlyLast)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `chatId` | s |  | <code><abbr title="java.lang.String">String</abbr></code> |
| `botIdFilePath` | s |  | <code><abbr title="java.lang.String">String</abbr></code> |
| `defaultPlots` | npm[] | `[ea.plot.elapsed(), ea.plot.uniqueness()]` | <code><abbr title="java.util.List">List</abbr><<abbr title="it.units.malelab.jgea.core.listener.PlotTableBuilder">PlotTableBuilder</abbr><? super <abbr title="it.units.malelab.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr><G, S, Q>>></code> |
| `plots` | npm[] | `[]` | <code><abbr title="java.util.List">List</abbr><<abbr title="it.units.malelab.jgea.core.listener.PlotTableBuilder">PlotTableBuilder</abbr><? super <abbr title="it.units.malelab.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr><G, S, Q>>></code> |
| `accumulators` | npm[] | `[]` | <code><abbr title="java.util.List">List</abbr><<abbr title="it.units.malelab.jgea.core.listener.AccumulatorFactory">AccumulatorFactory</abbr><? super <abbr title="it.units.malelab.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr><G, S, Q>, ?, <abbr title="it.units.malelab.jgea.experimenter.Run">Run</abbr><?, G, S, Q>>></code> |
| `deferred` | b | `true` | <code>boolean</code> |
| `onlyLast` | b | `false` | <code>boolean</code> |

Produces <code><abbr title="java.util.function.BiFunction">BiFunction</abbr><<abbr title="it.units.malelab.jgea.experimenter.Experiment">Experiment</abbr>, <abbr title="java.util.concurrent.ExecutorService">ExecutorService</abbr>, <abbr title="it.units.malelab.jgea.core.listener.ListenerFactory">ListenerFactory</abbr><<abbr title="it.units.malelab.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr><G, S, Q>, <abbr title="it.units.malelab.jgea.experimenter.Run">Run</abbr><?, G, S, Q>>></code>

### Builder `ea.listener.tui()`

`ea.l.tui(defaultFunctions; functions; runKeys; defaultPlots; plots; deferred; onlyLast)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `defaultFunctions` | npm[] | `[ea.nf.iterations(), ea.nf.evals(), ea.nf.births(), ea.nf.elapsed(), ea.nf.size(f=ea.nf.all()), ea.nf.size(f=ea.nf.firsts()), ea.nf.size(f=ea.nf.lasts()), ea.nf.uniqueness(collection=ea.nf.each(collection=ea.nf.all();map=ea.nf.genotype())), ea.nf.uniqueness(collection=ea.nf.each(collection=ea.nf.all();map=ea.nf.solution())), ea.nf.uniqueness(collection=ea.nf.each(collection=ea.nf.all();map=ea.nf.fitness()))]` | <code><abbr title="java.util.List">List</abbr><<abbr title="it.units.malelab.jgea.core.listener.NamedFunction">NamedFunction</abbr><? super <abbr title="it.units.malelab.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr><G, S, Q>, ?>></code> |
| `functions` | npm[] | `[]` | <code><abbr title="java.util.List">List</abbr><<abbr title="it.units.malelab.jgea.core.listener.NamedFunction">NamedFunction</abbr><? super <abbr title="it.units.malelab.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr><G, S, Q>, ?>></code> |
| `runKeys` | s[] | `[]` | <code><abbr title="java.util.List">List</abbr><<abbr title="java.lang.String">String</abbr>></code> |
| `defaultPlots` | npm[] | `[ea.plot.elapsed(), ea.plot.uniqueness()]` | <code><abbr title="java.util.List">List</abbr><<abbr title="it.units.malelab.jgea.core.listener.PlotTableBuilder">PlotTableBuilder</abbr><? super <abbr title="it.units.malelab.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr><G, S, Q>>></code> |
| `plots` | npm[] | `[]` | <code><abbr title="java.util.List">List</abbr><<abbr title="it.units.malelab.jgea.core.listener.PlotTableBuilder">PlotTableBuilder</abbr><? super <abbr title="it.units.malelab.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr><G, S, Q>>></code> |
| `deferred` | b | `false` | <code>boolean</code> |
| `onlyLast` | b | `false` | <code>boolean</code> |

Produces <code><abbr title="java.util.function.BiFunction">BiFunction</abbr><<abbr title="it.units.malelab.jgea.experimenter.Experiment">Experiment</abbr>, <abbr title="java.util.concurrent.ExecutorService">ExecutorService</abbr>, <abbr title="it.units.malelab.jgea.core.listener.ListenerFactory">ListenerFactory</abbr><<abbr title="it.units.malelab.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr><G, S, Q>, <abbr title="it.units.malelab.jgea.experimenter.Run">Run</abbr><?, G, S, Q>>></code>

## Package `ea.namedFunction`

Aliases: `ea.namedFunction`, `ea.nf`

### Builder `ea.namedFunction.all()`

`ea.nf.all()`

Produces <code><abbr title="it.units.malelab.jgea.core.listener.NamedFunction">NamedFunction</abbr><<abbr title="it.units.malelab.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr><G, S, Q>, <abbr title="java.util.Collection">Collection</abbr><<abbr title="it.units.malelab.jgea.core.solver.Individual">Individual</abbr><G, S, Q>>></code>

### Builder `ea.namedFunction.base64()`

`ea.nf.base64(f)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `f` | npm |  | <code><abbr title="it.units.malelab.jgea.core.listener.NamedFunction">NamedFunction</abbr><X, <abbr title="java.io.Serializable">Serializable</abbr>></code> |

Produces <code><abbr title="it.units.malelab.jgea.core.listener.NamedFunction">NamedFunction</abbr><X, <abbr title="java.lang.String">String</abbr>></code>

### Builder `ea.namedFunction.best()`

`ea.nf.best()`

Produces <code><abbr title="it.units.malelab.jgea.core.listener.NamedFunction">NamedFunction</abbr><<abbr title="it.units.malelab.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr><G, S, Q>, <abbr title="it.units.malelab.jgea.core.solver.Individual">Individual</abbr><G, S, Q>></code>

### Builder `ea.namedFunction.bestFitness()`

`ea.nf.bestFitness(f; s)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `f` | npm | `ea.nf.identity()` | <code><abbr title="it.units.malelab.jgea.core.listener.NamedFunction">NamedFunction</abbr><Q, T></code> |
| `s` | s | `%s` | <code><abbr title="java.lang.String">String</abbr></code> |

Produces <code><abbr title="it.units.malelab.jgea.core.listener.NamedFunction">NamedFunction</abbr><<abbr title="it.units.malelab.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr><?, ?, Q>, T></code>

### Builder `ea.namedFunction.births()`

`ea.nf.births()`

Produces <code><abbr title="it.units.malelab.jgea.core.listener.NamedFunction">NamedFunction</abbr><<abbr title="it.units.malelab.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr><?, ?, ?>, <abbr title="java.lang.Long">Long</abbr>></code>

### Builder `ea.namedFunction.each()`

`ea.nf.each(map; collection; s)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `map` | npm |  | <code><abbr title="it.units.malelab.jgea.core.listener.NamedFunction">NamedFunction</abbr><T, R></code> |
| `collection` | npm |  | <code><abbr title="it.units.malelab.jgea.core.listener.NamedFunction">NamedFunction</abbr><X, <abbr title="java.util.Collection">Collection</abbr><T>></code> |
| `s` | s | `%s` | <code><abbr title="java.lang.String">String</abbr></code> |

Produces <code><abbr title="it.units.malelab.jgea.core.listener.NamedFunction">NamedFunction</abbr><X, <abbr title="java.util.Collection">Collection</abbr><R>></code>

### Builder `ea.namedFunction.elapsed()`

`ea.nf.elapsed()`

Produces <code><abbr title="it.units.malelab.jgea.core.listener.NamedFunction">NamedFunction</abbr><<abbr title="it.units.malelab.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr><?, ?, ?>, <abbr title="java.lang.Double">Double</abbr>></code>

### Builder `ea.namedFunction.evals()`

`ea.nf.evals()`

Produces <code><abbr title="it.units.malelab.jgea.core.listener.NamedFunction">NamedFunction</abbr><<abbr title="it.units.malelab.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr><?, ?, ?>, <abbr title="java.lang.Long">Long</abbr>></code>

### Builder `ea.namedFunction.expr()`

`ea.nf.expr(f1; f2; op)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `f1` | npm |  | <code><abbr title="it.units.malelab.jgea.core.listener.NamedFunction">NamedFunction</abbr><X, <abbr title="java.lang.Number">Number</abbr>></code> |
| `f2` | npm |  | <code><abbr title="it.units.malelab.jgea.core.listener.NamedFunction">NamedFunction</abbr><X, <abbr title="java.lang.Number">Number</abbr>></code> |
| `op` | e |  | <code><abbr title="it.units.malelab.jgea.experimenter.builders.NamedFunctions$Op">NamedFunctions$Op</abbr></code> |

Produces <code><abbr title="it.units.malelab.jgea.core.listener.NamedFunction">NamedFunction</abbr><X, <abbr title="java.lang.Double">Double</abbr>></code>

### Builder `ea.namedFunction.f()`

`ea.nf.f(outerF; innerF; name; s; )`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `outerF` | npm |  | <code><abbr title="java.util.function.Function">Function</abbr><T, R></code> |
| `innerF` | npm | `ea.nf.identity()` | <code><abbr title="it.units.malelab.jgea.core.listener.NamedFunction">NamedFunction</abbr><X, T></code> |
| `name` | s |  | <code><abbr title="java.lang.String">String</abbr></code> |
| `s` | s | `%s` | <code><abbr title="java.lang.String">String</abbr></code> |

Produces <code><abbr title="it.units.malelab.jgea.core.listener.NamedFunction">NamedFunction</abbr><X, R></code>

### Builder `ea.namedFunction.firsts()`

`ea.nf.firsts()`

Produces <code><abbr title="it.units.malelab.jgea.core.listener.NamedFunction">NamedFunction</abbr><<abbr title="it.units.malelab.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr><G, S, Q>, <abbr title="java.util.Collection">Collection</abbr><<abbr title="it.units.malelab.jgea.core.solver.Individual">Individual</abbr><G, S, Q>>></code>

### Builder `ea.namedFunction.fitness()`

`ea.nf.fitness(individual; s)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `individual` | npm | `ea.nf.identity()` | <code><abbr title="it.units.malelab.jgea.core.listener.NamedFunction">NamedFunction</abbr><X, <abbr title="it.units.malelab.jgea.core.solver.Individual">Individual</abbr><?, ?, F>></code> |
| `s` | s | `%s` | <code><abbr title="java.lang.String">String</abbr></code> |

Produces <code><abbr title="it.units.malelab.jgea.core.listener.NamedFunction">NamedFunction</abbr><X, F></code>

### Builder `ea.namedFunction.fitnessHist()`

`ea.nf.fitnessHist(f; nBins)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `f` | npm | `ea.nf.identity()` | <code><abbr title="it.units.malelab.jgea.core.listener.NamedFunction">NamedFunction</abbr><Q, <abbr title="java.lang.Number">Number</abbr>></code> |
| `nBins` | i | `8` | <code>int</code> |

Produces <code><abbr title="it.units.malelab.jgea.core.listener.NamedFunction">NamedFunction</abbr><<abbr title="it.units.malelab.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr><?, ?, Q>, <abbr title="java.lang.String">String</abbr>></code>

### Builder `ea.namedFunction.formatted()`

`ea.nf.formatted(s; f)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `s` | s |  | <code><abbr title="java.lang.String">String</abbr></code> |
| `f` | npm |  | <code><abbr title="it.units.malelab.jgea.core.listener.NamedFunction">NamedFunction</abbr><T, R></code> |

Produces <code><abbr title="it.units.malelab.jgea.core.listener.NamedFunction">NamedFunction</abbr><T, R></code>

### Builder `ea.namedFunction.genotype()`

`ea.nf.genotype(individual; s)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `individual` | npm | `ea.nf.identity()` | <code><abbr title="it.units.malelab.jgea.core.listener.NamedFunction">NamedFunction</abbr><X, <abbr title="it.units.malelab.jgea.core.solver.Individual">Individual</abbr><G, ?, ?>></code> |
| `s` | s | `%s` | <code><abbr title="java.lang.String">String</abbr></code> |

Produces <code><abbr title="it.units.malelab.jgea.core.listener.NamedFunction">NamedFunction</abbr><X, G></code>

### Builder `ea.namedFunction.hist()`

`ea.nf.hist(collection; nBins)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `collection` | npm |  | <code><abbr title="it.units.malelab.jgea.core.listener.NamedFunction">NamedFunction</abbr><X, <abbr title="java.util.Collection">Collection</abbr><<abbr title="java.lang.Number">Number</abbr>>></code> |
| `nBins` | i | `8` | <code>int</code> |

Produces <code><abbr title="it.units.malelab.jgea.core.listener.NamedFunction">NamedFunction</abbr><X, <abbr title="java.lang.String">String</abbr>></code>

### Builder `ea.namedFunction.identity()`

`ea.nf.identity()`

Produces <code><abbr title="it.units.malelab.jgea.core.listener.NamedFunction">NamedFunction</abbr><T, T></code>

### Builder `ea.namedFunction.iterations()`

`ea.nf.iterations()`

Produces <code><abbr title="it.units.malelab.jgea.core.listener.NamedFunction">NamedFunction</abbr><<abbr title="it.units.malelab.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr><?, ?, ?>, <abbr title="java.lang.Long">Long</abbr>></code>

### Builder `ea.namedFunction.lasts()`

`ea.nf.lasts()`

Produces <code><abbr title="it.units.malelab.jgea.core.listener.NamedFunction">NamedFunction</abbr><<abbr title="it.units.malelab.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr><G, S, Q>, <abbr title="java.util.Collection">Collection</abbr><<abbr title="it.units.malelab.jgea.core.solver.Individual">Individual</abbr><G, S, Q>>></code>

### Builder `ea.namedFunction.max()`

`ea.nf.max(collection; s)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `collection` | npm |  | <code><abbr title="it.units.malelab.jgea.core.listener.NamedFunction">NamedFunction</abbr><X, <abbr title="java.util.Collection">Collection</abbr><T>></code> |
| `s` | s | `%s` | <code><abbr title="java.lang.String">String</abbr></code> |

Produces <code><abbr title="it.units.malelab.jgea.core.listener.NamedFunction">NamedFunction</abbr><X, T></code>

### Builder `ea.namedFunction.median()`

`ea.nf.median(collection; s)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `collection` | npm |  | <code><abbr title="it.units.malelab.jgea.core.listener.NamedFunction">NamedFunction</abbr><X, <abbr title="java.util.Collection">Collection</abbr><T>></code> |
| `s` | s | `%s` | <code><abbr title="java.lang.String">String</abbr></code> |

Produces <code><abbr title="it.units.malelab.jgea.core.listener.NamedFunction">NamedFunction</abbr><X, T></code>

### Builder `ea.namedFunction.min()`

`ea.nf.min(collection; s)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `collection` | npm |  | <code><abbr title="it.units.malelab.jgea.core.listener.NamedFunction">NamedFunction</abbr><X, <abbr title="java.util.Collection">Collection</abbr><T>></code> |
| `s` | s | `%s` | <code><abbr title="java.lang.String">String</abbr></code> |

Produces <code><abbr title="it.units.malelab.jgea.core.listener.NamedFunction">NamedFunction</abbr><X, T></code>

### Builder `ea.namedFunction.percentile()`

`ea.nf.percentile(collection; p; s)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `collection` | npm |  | <code><abbr title="it.units.malelab.jgea.core.listener.NamedFunction">NamedFunction</abbr><X, <abbr title="java.util.Collection">Collection</abbr><T>></code> |
| `p` | d |  | <code>double</code> |
| `s` | s | `%s` | <code><abbr title="java.lang.String">String</abbr></code> |

Produces <code><abbr title="it.units.malelab.jgea.core.listener.NamedFunction">NamedFunction</abbr><X, T></code>

### Builder `ea.namedFunction.size()`

`ea.nf.size(f)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `f` | npm |  | <code><abbr title="it.units.malelab.jgea.core.listener.NamedFunction">NamedFunction</abbr><X, ?></code> |

Produces <code><abbr title="it.units.malelab.jgea.core.listener.NamedFunction">NamedFunction</abbr><X, <abbr title="java.lang.Integer">Integer</abbr>></code>

### Builder `ea.namedFunction.solution()`

`ea.nf.solution(individual; s)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `individual` | npm | `ea.nf.identity()` | <code><abbr title="it.units.malelab.jgea.core.listener.NamedFunction">NamedFunction</abbr><X, <abbr title="it.units.malelab.jgea.core.solver.Individual">Individual</abbr><?, S, ?>></code> |
| `s` | s | `%s` | <code><abbr title="java.lang.String">String</abbr></code> |

Produces <code><abbr title="it.units.malelab.jgea.core.listener.NamedFunction">NamedFunction</abbr><X, S></code>

### Builder `ea.namedFunction.uniqueness()`

`ea.nf.uniqueness(collection)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `collection` | npm |  | <code><abbr title="it.units.malelab.jgea.core.listener.NamedFunction">NamedFunction</abbr><X, <abbr title="java.util.Collection">Collection</abbr><T>></code> |

Produces <code><abbr title="it.units.malelab.jgea.core.listener.NamedFunction">NamedFunction</abbr><X, <abbr title="java.lang.Double">Double</abbr>></code>

## Package `ea.plot`

### Builder `ea.plot.dyPlot()`

`ea.plot.dyPlot(x; y; w; h; minX; maxX; minY; maxY)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `x` | npm | `ea.nf.iterations()` | <code><abbr title="it.units.malelab.jgea.core.listener.NamedFunction">NamedFunction</abbr><? super <abbr title="it.units.malelab.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr><G, S, Q>, ? extends <abbr title="java.lang.Number">Number</abbr>></code> |
| `y` | npm |  | <code><abbr title="it.units.malelab.jgea.core.listener.NamedFunction">NamedFunction</abbr><? super <abbr title="it.units.malelab.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr><G, S, Q>, ? extends <abbr title="java.lang.Number">Number</abbr>></code> |
| `w` | i | `600` | <code>int</code> |
| `h` | i | `400` | <code>int</code> |
| `minX` | d | `-Infinity` | <code>double</code> |
| `maxX` | d | `-Infinity` | <code>double</code> |
| `minY` | d | `-Infinity` | <code>double</code> |
| `maxY` | d | `-Infinity` | <code>double</code> |

Produces <code><abbr title="it.units.malelab.jgea.core.listener.XYPlotTableBuilder">XYPlotTableBuilder</abbr><<abbr title="it.units.malelab.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr><G, S, Q>></code>

### Builder `ea.plot.elapsed()`

`ea.plot.elapsed(x; y; w; h; minX; maxX; minY; maxY)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `x` | npm | `ea.nf.iterations()` | <code><abbr title="it.units.malelab.jgea.core.listener.NamedFunction">NamedFunction</abbr><? super <abbr title="it.units.malelab.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr><G, S, Q>, ? extends <abbr title="java.lang.Number">Number</abbr>></code> |
| `y` | npm | `ea.nf.elapsed()` | <code><abbr title="it.units.malelab.jgea.core.listener.NamedFunction">NamedFunction</abbr><? super <abbr title="it.units.malelab.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr><G, S, Q>, ? extends <abbr title="java.lang.Number">Number</abbr>></code> |
| `w` | i | `600` | <code>int</code> |
| `h` | i | `400` | <code>int</code> |
| `minX` | d | `-Infinity` | <code>double</code> |
| `maxX` | d | `-Infinity` | <code>double</code> |
| `minY` | d | `0.0` | <code>double</code> |
| `maxY` | d | `-Infinity` | <code>double</code> |

Produces <code><abbr title="it.units.malelab.jgea.core.listener.XYPlotTableBuilder">XYPlotTableBuilder</abbr><<abbr title="it.units.malelab.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr><G, S, Q>></code>

### Builder `ea.plot.fitness()`

`ea.plot.fitness(x; collection; f; w; h; minX; maxX; minY; maxY; sort; s)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `x` | npm | `ea.nf.iterations()` | <code><abbr title="it.units.malelab.jgea.core.listener.NamedFunction">NamedFunction</abbr><? super <abbr title="it.units.malelab.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr><G, S, Q>, ? extends <abbr title="java.lang.Number">Number</abbr>></code> |
| `collection` | npm | `ea.nf.all()` | <code><abbr title="it.units.malelab.jgea.core.listener.NamedFunction">NamedFunction</abbr><<abbr title="it.units.malelab.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr><G, S, Q>, <abbr title="java.util.Collection">Collection</abbr><<abbr title="it.units.malelab.jgea.core.solver.Individual">Individual</abbr><G, S, Q>>></code> |
| `f` | npm | `ea.nf.identity()` | <code><abbr title="it.units.malelab.jgea.core.listener.NamedFunction">NamedFunction</abbr><Q, <abbr title="java.lang.Double">Double</abbr>></code> |
| `w` | i | `600` | <code>int</code> |
| `h` | i | `400` | <code>int</code> |
| `minX` | d | `-Infinity` | <code>double</code> |
| `maxX` | d | `-Infinity` | <code>double</code> |
| `minY` | d | `-Infinity` | <code>double</code> |
| `maxY` | d | `-Infinity` | <code>double</code> |
| `sort` | e | `MIN` | <code><abbr title="it.units.malelab.jgea.experimenter.builders.Plots$Sorting">Plots$Sorting</abbr></code> |
| `s` | s | `%.2f` | <code><abbr title="java.lang.String">String</abbr></code> |

Produces <code><abbr title="it.units.malelab.jgea.core.listener.XYPlotTableBuilder">XYPlotTableBuilder</abbr><<abbr title="it.units.malelab.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr><G, S, Q>></code>

### Builder `ea.plot.uniqueness()`

`ea.plot.uniqueness(x; ys; w; h; minX; maxX; minY; maxY)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `x` | npm | `ea.nf.iterations()` | <code><abbr title="it.units.malelab.jgea.core.listener.NamedFunction">NamedFunction</abbr><? super <abbr title="it.units.malelab.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr><G, S, Q>, ? extends <abbr title="java.lang.Number">Number</abbr>></code> |
| `ys` | npm[] | `[ea.nf.uniqueness(collection=ea.nf.each(collection=ea.nf.all();map=ea.nf.genotype())), ea.nf.uniqueness(collection=ea.nf.each(collection=ea.nf.all();map=ea.nf.solution())), ea.nf.uniqueness(collection=ea.nf.each(collection=ea.nf.all();map=ea.nf.fitness()))]` | <code><abbr title="java.util.List">List</abbr><<abbr title="it.units.malelab.jgea.core.listener.NamedFunction">NamedFunction</abbr><? super <abbr title="it.units.malelab.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr><G, S, Q>, ? extends <abbr title="java.lang.Number">Number</abbr>>></code> |
| `w` | i | `600` | <code>int</code> |
| `h` | i | `400` | <code>int</code> |
| `minX` | d | `-Infinity` | <code>double</code> |
| `maxX` | d | `-Infinity` | <code>double</code> |
| `minY` | d | `0.0` | <code>double</code> |
| `maxY` | d | `1.0` | <code>double</code> |

Produces <code><abbr title="it.units.malelab.jgea.core.listener.XYPlotTableBuilder">XYPlotTableBuilder</abbr><<abbr title="it.units.malelab.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr><G, S, Q>></code>

### Builder `ea.plot.xyPlot()`

`ea.plot.xyPlot(x; y; w; h; minX; maxX; minY; maxY)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `x` | npm |  | <code><abbr title="it.units.malelab.jgea.core.listener.NamedFunction">NamedFunction</abbr><? super E, ? extends <abbr title="java.lang.Number">Number</abbr>></code> |
| `y` | npm |  | <code><abbr title="it.units.malelab.jgea.core.listener.NamedFunction">NamedFunction</abbr><? super E, ? extends <abbr title="java.lang.Number">Number</abbr>></code> |
| `w` | i | `600` | <code>int</code> |
| `h` | i | `400` | <code>int</code> |
| `minX` | d | `-Infinity` | <code>double</code> |
| `maxX` | d | `-Infinity` | <code>double</code> |
| `minY` | d | `-Infinity` | <code>double</code> |
| `maxY` | d | `-Infinity` | <code>double</code> |

Produces <code><abbr title="it.units.malelab.jgea.core.listener.XYPlotTableBuilder">XYPlotTableBuilder</abbr><E></code>

### Builder `ea.plot.xysPlot()`

`ea.plot.xysPlot(x; ys; w; h; minX; maxX; minY; maxY)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `x` | npm |  | <code><abbr title="it.units.malelab.jgea.core.listener.NamedFunction">NamedFunction</abbr><? super E, ? extends <abbr title="java.lang.Number">Number</abbr>></code> |
| `ys` | npm[] | `[]` | <code><abbr title="java.util.List">List</abbr><<abbr title="it.units.malelab.jgea.core.listener.NamedFunction">NamedFunction</abbr><? super E, ? extends <abbr title="java.lang.Number">Number</abbr>>></code> |
| `w` | i | `600` | <code>int</code> |
| `h` | i | `400` | <code>int</code> |
| `minX` | d | `-Infinity` | <code>double</code> |
| `maxX` | d | `-Infinity` | <code>double</code> |
| `minY` | d | `-Infinity` | <code>double</code> |
| `maxY` | d | `-Infinity` | <code>double</code> |

Produces <code><abbr title="it.units.malelab.jgea.core.listener.XYPlotTableBuilder">XYPlotTableBuilder</abbr><E></code>

### Builder `ea.plot.yPlot()`

`ea.plot.yPlot(x; y; w; h; minX; maxX; minY; maxY)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `x` | npm | `ea.nf.iterations()` | <code><abbr title="it.units.malelab.jgea.core.listener.NamedFunction">NamedFunction</abbr><? super <abbr title="it.units.malelab.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr><G, S, Q>, ? extends <abbr title="java.lang.Number">Number</abbr>></code> |
| `y` | npm |  | <code><abbr title="it.units.malelab.jgea.core.listener.NamedFunction">NamedFunction</abbr><? super <abbr title="it.units.malelab.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr><G, S, Q>, ? extends <abbr title="java.lang.Number">Number</abbr>></code> |
| `w` | i | `600` | <code>int</code> |
| `h` | i | `400` | <code>int</code> |
| `minX` | d | `-Infinity` | <code>double</code> |
| `maxX` | d | `-Infinity` | <code>double</code> |
| `minY` | d | `-Infinity` | <code>double</code> |
| `maxY` | d | `-Infinity` | <code>double</code> |

Produces <code><abbr title="it.units.malelab.jgea.core.listener.XYPlotTableBuilder">XYPlotTableBuilder</abbr><<abbr title="it.units.malelab.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr><G, S, Q>></code>

### Builder `ea.plot.ysPlot()`

`ea.plot.ysPlot(x; ys; w; h; minX; maxX; minY; maxY)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `x` | npm | `ea.nf.iterations()` | <code><abbr title="it.units.malelab.jgea.core.listener.NamedFunction">NamedFunction</abbr><? super <abbr title="it.units.malelab.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr><G, S, Q>, ? extends <abbr title="java.lang.Number">Number</abbr>></code> |
| `ys` | npm[] | `[]` | <code><abbr title="java.util.List">List</abbr><<abbr title="it.units.malelab.jgea.core.listener.NamedFunction">NamedFunction</abbr><? super <abbr title="it.units.malelab.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr><G, S, Q>, ? extends <abbr title="java.lang.Number">Number</abbr>>></code> |
| `w` | i | `600` | <code>int</code> |
| `h` | i | `400` | <code>int</code> |
| `minX` | d | `-Infinity` | <code>double</code> |
| `maxX` | d | `-Infinity` | <code>double</code> |
| `minY` | d | `-Infinity` | <code>double</code> |
| `maxY` | d | `-Infinity` | <code>double</code> |

Produces <code><abbr title="it.units.malelab.jgea.core.listener.XYPlotTableBuilder">XYPlotTableBuilder</abbr><<abbr title="it.units.malelab.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr><G, S, Q>></code>

## Package `ea.problem`

Aliases: `ea.p`, `ea.problem`

### Builder `ea.problem.totalOrder()`

`ea.p.totalOrder(qFunction; cFunction; type)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `qFunction` | npm |  | <code><abbr title="java.util.function.Function">Function</abbr><S, Q></code> |
| `cFunction` | npm | `ea.f.identity()` | <code><abbr title="java.util.function.Function">Function</abbr><Q, C></code> |
| `type` | e | `MINIMIZE` | <code><abbr title="it.units.malelab.jgea.experimenter.builders.Problems$OptimizationType">Problems$OptimizationType</abbr></code> |

Produces <code><abbr title="it.units.malelab.jgea.core.TotalOrderQualityBasedProblem">TotalOrderQualityBasedProblem</abbr><S, Q></code>

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

### Builder `ea.solver.numGA()`

`ea.s.numGA(mapper; initialMinV; initialMaxV; crossoverP; sigmaMut; tournamentRate; minNTournament; nPop; nEval; diversity; remap)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `mapper` | npm |  | <code><abbr title="it.units.malelab.jgea.experimenter.InvertibleMapper">InvertibleMapper</abbr><<abbr title="java.util.List">List</abbr><<abbr title="java.lang.Double">Double</abbr>>, S></code> |
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

Produces <code><abbr title="it.units.malelab.jgea.core.solver.StandardEvolver">StandardEvolver</abbr><<abbr title="it.units.malelab.jgea.core.solver.state.POSetPopulationState">POSetPopulationState</abbr><<abbr title="java.util.List">List</abbr><<abbr title="java.lang.Double">Double</abbr>>, S, Q>, <abbr title="it.units.malelab.jgea.core.QualityBasedProblem">QualityBasedProblem</abbr><S, Q>, <abbr title="java.util.List">List</abbr><<abbr title="java.lang.Double">Double</abbr>>, S, Q></code>

### Builder `ea.solver.simpleES()`

`ea.s.simpleES(mapper; initialMinV; initialMaxV; sigma; parentsRate; nOfElites; nPop; nEval; remap)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `mapper` | npm |  | <code><abbr title="it.units.malelab.jgea.experimenter.InvertibleMapper">InvertibleMapper</abbr><<abbr title="java.util.List">List</abbr><<abbr title="java.lang.Double">Double</abbr>>, S></code> |
| `initialMinV` | d | `-1.0` | <code>double</code> |
| `initialMaxV` | d | `1.0` | <code>double</code> |
| `sigma` | d | `0.35` | <code>double</code> |
| `parentsRate` | d | `0.33` | <code>double</code> |
| `nOfElites` | i | `1` | <code>int</code> |
| `nPop` | i | `30` | <code>int</code> |
| `nEval` | i |  | <code>int</code> |
| `remap` | b | `false` | <code>boolean</code> |

Produces <code><abbr title="it.units.malelab.jgea.core.solver.SimpleEvolutionaryStrategy">SimpleEvolutionaryStrategy</abbr><S, Q></code>

## Package `evorobots.mapper`

Aliases: `er.m`, `er.mapper`, `evorobots.m`, `evorobots.mapper`

### Builder `evorobots.mapper.parametrized()`

`er.m.parametrized(target; ; )`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `target` | npm |  | <code>T</code> |

Produces <code><abbr title="it.units.malelab.jgea.experimenter.InvertibleMapper">InvertibleMapper</abbr><<abbr title="java.util.List">List</abbr><<abbr title="java.lang.Double">Double</abbr>>, <abbr title="java.util.function.Supplier">Supplier</abbr><T>></code>

## Package `sim`

Aliases: `s`, `sim`

### Builder `sim.drawer()`

`s.drawer(enlargement; followTime; profilingTime; miniWorldEnlargement; miniWorld; miniAgents; engineProfiling; actions)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `enlargement` | d | `1.5` | <code>double</code> |
| `followTime` | d | `2.0` | <code>double</code> |
| `profilingTime` | d | `1.0` | <code>double</code> |
| `miniWorldEnlargement` | d | `10.0` | <code>double</code> |
| `miniWorld` | b | `false` | <code>boolean</code> |
| `miniAgents` | b | `true` | <code>boolean</code> |
| `engineProfiling` | b | `false` | <code>boolean</code> |
| `actions` | b | `false` | <code>boolean</code> |

Produces <code><abbr title="java.util.function.Function">Function</abbr><<abbr title="java.lang.String">String</abbr>, <abbr title="it.units.erallab.mrsim2d.viewer.Drawer">Drawer</abbr>></code>

### Builder `sim.engine()`

`s.engine()`

Produces <code><abbr title="java.util.function.Supplier">Supplier</abbr><<abbr title="it.units.erallab.mrsim2d.core.engine.Engine">Engine</abbr>></code>

### Builder `sim.range()`

`s.range(min; max)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `min` | d |  | <code>double</code> |
| `max` | d |  | <code>double</code> |

Produces <code><abbr title="it.units.erallab.mrsim2d.core.util.DoubleRange">DoubleRange</abbr></code>

### Builder `sim.supplier()`

`s.supplier(of; ; )`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `of` | npm |  | <code>T</code> |

Produces <code><abbr title="java.util.function.Supplier">Supplier</abbr><T></code>

### Builder `sim.taskRunner()`

`s.taskRunner(task; engine)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `task` | npm |  | <code><abbr title="it.units.erallab.mrsim2d.core.tasks.Task">Task</abbr><A, O></code> |
| `engine` | npm | `sim.engine()` | <code><abbr title="java.util.function.Supplier">Supplier</abbr><<abbr title="it.units.erallab.mrsim2d.core.engine.Engine">Engine</abbr>></code> |

Produces <code><abbr title="java.util.function.Function">Function</abbr><A, O></code>

## Package `sim.agent`

Aliases: `s.a`, `s.agent`, `sim.a`, `sim.agent`

### Builder `sim.agent.centralizedNumGridVSR()`

`s.a.centralizedNumGridVSR(body; function)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `body` | npm |  | <code><abbr title="it.units.erallab.mrsim2d.core.agents.gridvsr.GridBody">GridBody</abbr></code> |
| `function` | npm |  | <code><abbr title="it.units.erallab.mrsim2d.buildable.builders.TimedRealFunctions$Builder">TimedRealFunctions$Builder</abbr><?></code> |

Produces <code><abbr title="it.units.erallab.mrsim2d.core.agents.gridvsr.CentralizedNumGridVSR">CentralizedNumGridVSR</abbr></code>

### Builder `sim.agent.heteroDistributedNumGridVSR()`

`s.a.heteroDistributedNumGridVSR(body; function; signals; directional)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `body` | npm |  | <code><abbr title="it.units.erallab.mrsim2d.core.agents.gridvsr.GridBody">GridBody</abbr></code> |
| `function` | npm |  | <code><abbr title="it.units.erallab.mrsim2d.buildable.builders.TimedRealFunctions$Builder">TimedRealFunctions$Builder</abbr><?></code> |
| `signals` | i |  | <code>int</code> |
| `directional` | b | `false` | <code>boolean</code> |

Produces <code><abbr title="it.units.erallab.mrsim2d.core.agents.gridvsr.HeteroDistributedNumGridVSR">HeteroDistributedNumGridVSR</abbr></code>

### Builder `sim.agent.homoDistributedNumGridVSR()`

`s.a.homoDistributedNumGridVSR(body; function; signals; directional)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `body` | npm |  | <code><abbr title="it.units.erallab.mrsim2d.core.agents.gridvsr.GridBody">GridBody</abbr></code> |
| `function` | npm |  | <code><abbr title="it.units.erallab.mrsim2d.buildable.builders.TimedRealFunctions$Builder">TimedRealFunctions$Builder</abbr><?></code> |
| `signals` | i |  | <code>int</code> |
| `directional` | b | `false` | <code>boolean</code> |

Produces <code><abbr title="it.units.erallab.mrsim2d.core.agents.gridvsr.HomoDistributedNumGridVSR">HomoDistributedNumGridVSR</abbr></code>

### Builder `sim.agent.numIndependentVoxel()`

`s.a.numIndependentVoxel(sensors; function)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `sensors` | npm[] | `[]` | <code><abbr title="java.util.List">List</abbr><<abbr title="it.units.erallab.mrsim2d.core.Sensor">Sensor</abbr><? super <abbr title="it.units.erallab.mrsim2d.core.bodies.Voxel">Voxel</abbr>>></code> |
| `function` | npm |  | <code><abbr title="it.units.erallab.mrsim2d.buildable.builders.TimedRealFunctions$Builder">TimedRealFunctions$Builder</abbr><?></code> |

Produces <code><abbr title="it.units.erallab.mrsim2d.core.agents.independentvoxel.NumIndependentVoxel">NumIndependentVoxel</abbr></code>

### Builder `sim.agent.numLeggedHybridModularRobot()`

`s.a.numLeggedHybridModularRobot(modules; function)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `modules` | npm[] | `[]` | <code><abbr title="java.util.List">List</abbr><<abbr title="it.units.erallab.mrsim2d.core.agents.legged.AbstractLeggedHybridModularRobot$Module">AbstractLeggedHybridModularRobot$Module</abbr>></code> |
| `function` | npm |  | <code><abbr title="it.units.erallab.mrsim2d.buildable.builders.TimedRealFunctions$Builder">TimedRealFunctions$Builder</abbr><?></code> |

Produces <code><abbr title="it.units.erallab.mrsim2d.core.agents.legged.NumLeggedHybridModularRobot">NumLeggedHybridModularRobot</abbr></code>

## Package `sim.function`

Aliases: `s.f`, `s.function`, `sim.f`, `sim.function`

### Builder `sim.function.diffIn()`

`s.f.diffIn(windowT; innerFunction; types)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `windowT` | d |  | <code>double</code> |
| `innerFunction` | npm |  | <code><abbr title="java.util.function.BiFunction">BiFunction</abbr><<abbr title="java.lang.Integer">Integer</abbr>, <abbr title="java.lang.Integer">Integer</abbr>, ? extends <abbr title="it.units.erallab.mrsim2d.core.functions.TimedRealFunction">TimedRealFunction</abbr>></code> |
| `types` | e[] | `[CURRENT, TREND, AVG]` | <code><abbr title="java.util.List">List</abbr><<abbr title="it.units.erallab.mrsim2d.core.functions.DiffInputTRF$Type">DiffInputTRF$Type</abbr>></code> |

Produces <code><abbr title="it.units.erallab.mrsim2d.buildable.builders.TimedRealFunctions$Builder">TimedRealFunctions$Builder</abbr><<abbr title="it.units.erallab.mrsim2d.core.functions.DiffInputTRF">DiffInputTRF</abbr>></code>

### Builder `sim.function.mlp()`

`s.f.mlp(innerLayerRatio; nOfInnerLayers; activationFunction)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `innerLayerRatio` | d | `0.65` | <code>double</code> |
| `nOfInnerLayers` | i | `1` | <code>int</code> |
| `activationFunction` | e | `TANH` | <code><abbr title="it.units.erallab.mrsim2d.core.functions.MultiLayerPerceptron$ActivationFunction">MultiLayerPerceptron$ActivationFunction</abbr></code> |

Produces <code><abbr title="it.units.erallab.mrsim2d.buildable.builders.TimedRealFunctions$Builder">TimedRealFunctions$Builder</abbr><<abbr title="it.units.erallab.mrsim2d.core.functions.MultiLayerPerceptron">MultiLayerPerceptron</abbr>></code>

### Builder `sim.function.sinP()`

`s.f.sinP(p; f; a)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `p` | npm | `sim.doubleRange(max=1.57;min=-1.57)` | <code><abbr title="it.units.erallab.mrsim2d.core.util.DoubleRange">DoubleRange</abbr></code> |
| `f` | npm | `sim.doubleRange(max=1.0;min=0.0)` | <code><abbr title="it.units.erallab.mrsim2d.core.util.DoubleRange">DoubleRange</abbr></code> |
| `a` | npm | `sim.doubleRange(max=1.0;min=0.0)` | <code><abbr title="it.units.erallab.mrsim2d.core.util.DoubleRange">DoubleRange</abbr></code> |

Produces <code><abbr title="it.units.erallab.mrsim2d.buildable.builders.TimedRealFunctions$Builder">TimedRealFunctions$Builder</abbr><<abbr title="it.units.erallab.mrsim2d.core.functions.Sinusoidal">Sinusoidal</abbr>></code>

### Builder `sim.function.sinPA()`

`s.f.sinPA(p; f; a)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `p` | npm | `sim.doubleRange(max=1.57;min=-1.57)` | <code><abbr title="it.units.erallab.mrsim2d.core.util.DoubleRange">DoubleRange</abbr></code> |
| `f` | npm | `sim.doubleRange(max=1.0;min=0.0)` | <code><abbr title="it.units.erallab.mrsim2d.core.util.DoubleRange">DoubleRange</abbr></code> |
| `a` | npm | `sim.doubleRange(max=1.0;min=0.0)` | <code><abbr title="it.units.erallab.mrsim2d.core.util.DoubleRange">DoubleRange</abbr></code> |

Produces <code><abbr title="it.units.erallab.mrsim2d.buildable.builders.TimedRealFunctions$Builder">TimedRealFunctions$Builder</abbr><<abbr title="it.units.erallab.mrsim2d.core.functions.Sinusoidal">Sinusoidal</abbr>></code>

### Builder `sim.function.sinPF()`

`s.f.sinPF(p; f; a)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `p` | npm | `sim.doubleRange(max=1.57;min=-1.57)` | <code><abbr title="it.units.erallab.mrsim2d.core.util.DoubleRange">DoubleRange</abbr></code> |
| `f` | npm | `sim.doubleRange(max=1.0;min=0.0)` | <code><abbr title="it.units.erallab.mrsim2d.core.util.DoubleRange">DoubleRange</abbr></code> |
| `a` | npm | `sim.doubleRange(max=1.0;min=0.0)` | <code><abbr title="it.units.erallab.mrsim2d.core.util.DoubleRange">DoubleRange</abbr></code> |

Produces <code><abbr title="it.units.erallab.mrsim2d.buildable.builders.TimedRealFunctions$Builder">TimedRealFunctions$Builder</abbr><<abbr title="it.units.erallab.mrsim2d.core.functions.Sinusoidal">Sinusoidal</abbr>></code>

### Builder `sim.function.sinPFA()`

`s.f.sinPFA(p; f; a)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `p` | npm | `sim.doubleRange(max=1.57;min=-1.57)` | <code><abbr title="it.units.erallab.mrsim2d.core.util.DoubleRange">DoubleRange</abbr></code> |
| `f` | npm | `sim.doubleRange(max=1.0;min=0.0)` | <code><abbr title="it.units.erallab.mrsim2d.core.util.DoubleRange">DoubleRange</abbr></code> |
| `a` | npm | `sim.doubleRange(max=1.0;min=0.0)` | <code><abbr title="it.units.erallab.mrsim2d.core.util.DoubleRange">DoubleRange</abbr></code> |

Produces <code><abbr title="it.units.erallab.mrsim2d.buildable.builders.TimedRealFunctions$Builder">TimedRealFunctions$Builder</abbr><<abbr title="it.units.erallab.mrsim2d.core.functions.Sinusoidal">Sinusoidal</abbr>></code>

### Builder `sim.function.stepOut()`

`s.f.stepOut(stepT; innerFunction)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `stepT` | d |  | <code>double</code> |
| `innerFunction` | npm |  | <code><abbr title="java.util.function.BiFunction">BiFunction</abbr><<abbr title="java.lang.Integer">Integer</abbr>, <abbr title="java.lang.Integer">Integer</abbr>, ? extends <abbr title="it.units.erallab.mrsim2d.core.functions.TimedRealFunction">TimedRealFunction</abbr>></code> |

Produces <code><abbr title="it.units.erallab.mrsim2d.buildable.builders.TimedRealFunctions$Builder">TimedRealFunctions$Builder</abbr><<abbr title="it.units.erallab.mrsim2d.core.functions.SteppedOutputTRF">SteppedOutputTRF</abbr>></code>

## Package `sim.legged`

Aliases: `s.legged`, `sim.legged`

### Builder `sim.legged.legChunk()`

`s.legged.legChunk(trunkLength; width; mass; upConnector)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `trunkLength` | d | `1.5` | <code>double</code> |
| `width` | d | `1.0` | <code>double</code> |
| `mass` | d | `0.375` | <code>double</code> |
| `upConnector` | e | `RIGID` | <code><abbr title="it.units.erallab.mrsim2d.core.agents.legged.AbstractLeggedHybridModularRobot$Connector">AbstractLeggedHybridModularRobot$Connector</abbr></code> |

Produces <code><abbr title="it.units.erallab.mrsim2d.core.agents.legged.AbstractLeggedHybridModularRobot$LegChunk">AbstractLeggedHybridModularRobot$LegChunk</abbr></code>

### Builder `sim.legged.module()`

`s.legged.module(trunkLength; trunkWidth; trunkMass; legChunks; downConnector; rightConnector)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `trunkLength` | d | `4.0` | <code>double</code> |
| `trunkWidth` | d | `1.0` | <code>double</code> |
| `trunkMass` | d | `1.0` | <code>double</code> |
| `legChunks` | npm[] | `[]` | <code><abbr title="java.util.List">List</abbr><<abbr title="it.units.erallab.mrsim2d.core.agents.legged.AbstractLeggedHybridModularRobot$LegChunk">AbstractLeggedHybridModularRobot$LegChunk</abbr>></code> |
| `downConnector` | e | `RIGID` | <code><abbr title="it.units.erallab.mrsim2d.core.agents.legged.AbstractLeggedHybridModularRobot$Connector">AbstractLeggedHybridModularRobot$Connector</abbr></code> |
| `rightConnector` | e | `RIGID` | <code><abbr title="it.units.erallab.mrsim2d.core.agents.legged.AbstractLeggedHybridModularRobot$Connector">AbstractLeggedHybridModularRobot$Connector</abbr></code> |

Produces <code><abbr title="it.units.erallab.mrsim2d.core.agents.legged.AbstractLeggedHybridModularRobot$Module">AbstractLeggedHybridModularRobot$Module</abbr></code>

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

`s.task.fallPiling(duration; fallInterval; nOfAgents; xSigmaRatio; randomGenerator; terrain; yGapRatio; xGap)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `duration` | d | `45.0` | <code>double</code> |
| `fallInterval` | d | `5.0` | <code>double</code> |
| `nOfAgents` | i |  | <code>int</code> |
| `xSigmaRatio` | d | `0.1` | <code>double</code> |
| `randomGenerator` | npm |  | <code><abbr title="java.util.random.RandomGenerator">RandomGenerator</abbr></code> |
| `terrain` | npm | `sim.terrain.flat()` | <code><abbr title="it.units.erallab.mrsim2d.core.geometry.Terrain">Terrain</abbr></code> |
| `yGapRatio` | d | `1.0` | <code>double</code> |
| `xGap` | d | `10.0` | <code>double</code> |

Produces <code><abbr title="it.units.erallab.mrsim2d.core.tasks.piling.FallPiling">FallPiling</abbr></code>

### Builder `sim.task.locomotion()`

`s.task.locomotion(duration; terrain; initialXGap; initialYGap)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `duration` | d | `30.0` | <code>double</code> |
| `terrain` | npm | `sim.terrain.flat()` | <code><abbr title="it.units.erallab.mrsim2d.core.geometry.Terrain">Terrain</abbr></code> |
| `initialXGap` | d | `1.0` | <code>double</code> |
| `initialYGap` | d | `1.0` | <code>double</code> |

Produces <code><abbr title="it.units.erallab.mrsim2d.core.tasks.locomotion.Locomotion">Locomotion</abbr></code>

### Builder `sim.task.standPiling()`

`s.task.standPiling(duration; nOfAgents; xGapRatio; terrain; firstXGap; initialYGap)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `duration` | d | `45.0` | <code>double</code> |
| `nOfAgents` | i |  | <code>int</code> |
| `xGapRatio` | d | `1.0` | <code>double</code> |
| `terrain` | npm | `sim.terrain.flat()` | <code><abbr title="it.units.erallab.mrsim2d.core.geometry.Terrain">Terrain</abbr></code> |
| `firstXGap` | d | `10.0` | <code>double</code> |
| `initialYGap` | d | `0.1` | <code>double</code> |

Produces <code><abbr title="it.units.erallab.mrsim2d.core.tasks.piling.StandPiling">StandPiling</abbr></code>

## Package `sim.task.locomotion`

Aliases: `s.task.l`, `s.task.locomotion`, `sim.task.l`, `sim.task.locomotion`

### Builder `sim.task.locomotion.xDistance()`

`s.task.l.xDistance(transientTime)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `transientTime` | d | `0.0` | <code>double</code> |

Produces <code><abbr title="java.util.function.Function">Function</abbr><<abbr title="it.units.erallab.mrsim2d.core.tasks.locomotion.Outcome">Outcome</abbr>, <abbr title="java.lang.Double">Double</abbr>></code>

### Builder `sim.task.locomotion.xVelocity()`

`s.task.l.xVelocity(transientTime)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `transientTime` | d | `0.0` | <code>double</code> |

Produces <code><abbr title="java.util.function.Function">Function</abbr><<abbr title="it.units.erallab.mrsim2d.core.tasks.locomotion.Outcome">Outcome</abbr>, <abbr title="java.lang.Double">Double</abbr>></code>

## Package `sim.task.piling`

Aliases: `s.task.p`, `s.task.piling`, `sim.task.p`, `sim.task.piling`

### Builder `sim.task.piling.avgH()`

`s.task.p.avgH(transientTime)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `transientTime` | d | `0.0` | <code>double</code> |

Produces <code><abbr title="java.util.function.Function">Function</abbr><<abbr title="it.units.erallab.mrsim2d.core.tasks.piling.Outcome">Outcome</abbr>, <abbr title="java.lang.Double">Double</abbr>></code>

### Builder `sim.task.piling.maxH()`

`s.task.p.maxH(transientTime)`

| Param | Type | Default | Java type |
| --- | --- | --- | --- |
| `transientTime` | d | `0.0` | <code>double</code> |

Produces <code><abbr title="java.util.function.Function">Function</abbr><<abbr title="it.units.erallab.mrsim2d.core.tasks.piling.Outcome">Outcome</abbr>, <abbr title="java.lang.Double">Double</abbr>></code>

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

