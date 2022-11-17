# 2D-Robot-Evolution
A Java framework for experimenting with the evolutionary optimization of 2D simulated robotic agents.

Based on [JGEA](https://github.com/ericmedvet/jgea) and [2D-MR-Sim](https://github.com/ericmedvet/2dmrsim).

## Installation

### Dependencies

This software requires JDK 18 and Maven: if you are using a Unix based system, you can install both easily using [sdkman](https://sdkman.io/).

This software also depends on the following other dependencies: [JGEA](https://github.com/ericmedvet/jgea) and [2D-MR-Sim](https://github.com/ericmedvet/2dmrsim).
The specific versions are the ones shown in the [pom.xml](pom.xml) at the nodes `<jgea.version>...</jgea.version>` and `<mrsim2d.version>...</mrsim2d.version>`.

At the moment, the two Maven dependencies are not hosted in the central repository.
You hence need to make them available in your local repository, building them on your machine, before building this software.
In practice, you need to execute the following commands.

For JGEA:
```shell
git clone --depth 1 --branch <tag_name> https://github.com/ericmedvet/jgea.git
cd jgea
mvn install
```

For 2D-MR-Sim (in a different directory than the one in which you cloned JGEA):
```shell
git clone --depth 1 --branch <tag_name> https://github.com/ericmedvet/2dmrsim.git
cd 2dmrsim
mvn install
```

Where `<tag_name>` is the tag of the version you need (i.e., `v` followed by the version number), e.g., `v2.2.1`.

### Clone and build

Now you can clone this project and build it:
```shell
git clone --depth 1 https://github.com/ericmedvet/2d-robot-evolution.git
cd 2d-robot-evolution
mvn package
```

At this point, if everything worked smoothly, you should be able to run a first short evolutionary optimization (assume you are in the parent directory of the `2d-robot-evolution` one that has been created after the last clone; this is suggested for real runs, so that you don't pollute your git branch with outcome files):
```shell
java -cp "2d-robot-evolution/it.units.erallab.robotevo2d.assembly/target/robotevo2d.assembly-bin/modules/*" it.units.erallab.robotevo2d.main.singleagent.Starter
```

## Usage

### In a nutshell

An experiment can be started by invoking:
```shell
java -cp "2d-robot-evolution/it.units.erallab.robotevo2d.assembly/target/robotevo2d.assembly-bin/modules/*" it.units.erallab.robotevo2d.main.singleagent.Starter --expFile <exp-file> --nOfThreads <n>
```
where `<exp-file>` is the path to a file with an **experiment description** and `<n>` is the **number of threads** to be used for running the experiment.

Once started, `Starter` shows a text-based UI giving information about the overall progress of the experiment, the current run, logs, and resources usage.
`Starter` may be stopped (before conclusion) with <kbd>Ctrl</kbd> + <kbd>C</kbd>.

![The text-based UI of `Starter`](assets/images/sample-run.png)

For the number of threads `<n>`, it is suggested to use a number $n$ lower or equal to the number of cores on the machine you run the experiment on.
The actual degree of concurrency will depend on $n$ and on the evolutionary algorithm being used: e.g., a GA with a population of `npop=30` will do at most $\min(30,n)$ fitness evaluations at the same time.

You can have an overview on the other (few) parameters of `Starter` with:
```shell
java -cp "2d-robot-evolution/it.units.erallab.robotevo2d.assembly/target/robotevo2d.assembly-bin/modules/*" it.units.erallab.robotevo2d.main.singleagent.Starter --help
```

### The experiment description

An **experiment** consists of one or more runs.

Each **run** is an evolutionary optimization using a **solver** (obtained with a `SolverBuilder`) and a **mapper** (obtained with a `MapperBuilder`), that maps a genotype into a target robot, for solving a `Task`.
A run is described in `Run`, which also includes other key information as, e.g., the `RandomGenerator`.

An experiment is described in `Experiment`.
The description also includes information on if/how/where to store the info about ongoing runs: one reasonable choice is to save one line of a CSV file for each iteration of each run.
This way you can process the results of the experiment offline after it ended using, e.g., R or Python.

You can describe an experiment through an experiment file containing a textual description of the experiment.
The description must contain a **named parameter map** for an experiment, i.e., its content has to be something like `experiment(...)` (see the [`experiment()`](assets/builder-help.md#builder-experiment) builder documentation and the [examples](#examples-of-experiment-files) given below). 

#### Named parameter map format

A **named parameter map** is a map (or dictionary, in other terms) with a name.
It can be described with a string adhering the following human- and machine-readable format described by the following grammar:
```
<npm> ::= <n>(<nps>)
<nps> ::= ∅ | <np> | <nps>;<np>
<np> ::= <n>=<e> | <n>=<d> | <n>=<s> | <n>=<le> | <n>=<ld> | <n>=<ls>
<lnmp> ::= (<np>)*<lnpm> | <i>*[<npms>] | [<npms>]
<ld> ::= [<d>:<d>:<d>] | [<ds>]
<ls> ::= [<ss>]
<npms> ::= ∅ | <npm> | <npms>;<npm>
<ds> ::= ∅ | <d> | <ds>;<d>
<ss> ::= ∅ | <s> | <ss>;<s>
```
where:
- `<npm>` is a named parameter map;
- `<s>` is a string in the format `([A-Za-z][A-Za-z0-9_]*)|(\"[./:\-\w]+\")`;
- `<d>` is a number in the format `-?[0-9]+(\.[0-9]+)?`;
- `∅` is the empty string.

The format is reasonably robust to spaces and line-breaks.

An example of a syntactically valid named parameter map is:
```
car(dealer=Ferrari;price=45000)
```
where `dealer` and `price` are parameter names and `Ferrari` and `45000` are parameter values.
`car` is the name of the map.

Another, more complex example is:
```
office(
  head = person(name = "Mario Rossi"; age = 43);
  staff = [
    person(name = Alice; age = 33);
    person(name = Bob; age = 25);
    person(name = Charlie; age = 38)
  ];
  roomNumbers = [1:2:10]  
)
```
In this case, the `head` parameter of `office` is valued with another named parameter map: `person(name = "Mario Rossi"; age = 43)`.

##### The `*` operator

Note the possible use of `*` for specifying arrays of named parameter maps (broadly speaking, collections of them) in a more compact way.
For example, `2 * [dog(name = simba); dog(name = gass)]` corresponds to `[dog(name = simba); dog(name = gass); dog(name = simba); dog(name = gass)]`.
A more complex case is the one of left-product that takes a parameter $p$ valued with an array $v_1, \dots, v_k$ (on the left) and an array $m_1, \dots, m_n$ of named parameter maps (on the right) and results in the array of named parameter maps $m^\prime_{1,1}, \dots, m^\prime_{1,k}, \dots, m^\prime_{n,1}, \dots, m^\prime_{n,k}$ where each $m'_{i,j}$ is the map $m_i$ with a parameter $p$ valued $v_k$.
```
(size = [m; s; xxs]) * [hoodie(color = red)]
```
corresponds to:
```
[
  hoodie(color = red; size = m);
  hoodie(color = red; size = s);
  hoodie(color = red; size = xxs)
]
```

#### Specification for the experiment file

You describe an experiment and its components using a named parameter map in a text file: in practice, each map describes a **builder** of a component along with its parameters.
The complete specification for available maps, parameters, and corresponding values for a valid description of an experiment is available [here](assets/builder-help.md).

In the following sections, we describe the key elements.
For better organizing them, the builders are grouped in **packages**, whose name are something like `sim.agent`.

##### Embodied agents

There are five available embodied agents (i.e., **robots**).
Their builders are grouped in the [`sim.agent`](assets/builder-help.md#package-simagent) package.
Here we describe the most significant ones.

[`sim.agent.centralizedNumGridVSR()`](assets/builder-help.md#builder-simagentcentralizednumgridvsr) corresponds to a VSR with a single closed-loop controller taking as input the sensor readings and giving as output the activation values, as described in [[1]](#2020-c-mbdf-evolution).
The controller is a `TimedRealFunction`, i.e., a multivariate function taking the current time $t$ and $m$ real values and giving $n$ real values; formally, it is a $f: \mathbb{R} \times \mathbb{R}^m \to \mathbb{R}^n$.
Available functions are grouped in the [`sim.function`](assets/builder-help.md#package-simfunction) package: the key ones are described [below](#functions).

[`sim.agent.heteroDistributedNumGridVSR()`](assets/builder-help.md#builder-simagentheterodistributednumgridvsr) and [`sim.agent.homoDistributedNumGridVSR()`](assets/builder-help.md#builder-simagenthomodistributednumgridvsr) correspond to a VSR with one `TimedRealFunction` inside each one of the voxels.
Each `TimedRealFunction` takes as input the local sensor readings and some (exactly `signals`) values coming from adjacent voxels and gives as output the local activation value and some values going to adjacent voxels, as described in [[1]](#2020-c-mbdf-evolution).
For `sim.agent.homoDistributedNumGridVSR()`, the same function is used in each voxel; for `sim.agent.heteroDistributedNumGridVSR()` different functions are used.
That is, they for the former case, the functions share the parameters: for using `sim.agent.homoDistributedNumGridVSR()`, each voxel in the body has to have the same number of sensors.

##### Functions

Functions are multivariate functions taking the current time $t$ and $m$ real values and giving $n$ real values (i.e., $f: \mathbb{R} \times \mathbb{R}^m \to \mathbb{R}^n$) and are used inside robots as controllers (or brains).
Their builders are grouped in the [`sim.function`](assets/builder-help.md#package-simfunction) package.
Here we describe the most significant ones.

[`sim.function.mlp()`](assets/builder-help.md#builder-simfunctionmlp) is a Multi-layer Perceptron consisting of `nOfInnerLayers` inner layers in which each neuron has the same `activationFunction`.
The size (number of neurons) inside each layer is computed based on the size of the first (*input*) and last (*output*) layers using the parameter `innerLayerRatio`: in brief, the $j+1$-th layer size is `innerLayerRatio` times the size of the $j$-th layer.
As explained above, the size of the first and last layer are determined based on the context the function is used in (this holds for all the functions in this package).
In facts, their builders return a `BiFunction<Integer, Integer, TimedRealFunction>`, where the two `Integer` parameters of the `BiFunction` are the dimension $m$ and $n$ of the input and output space.
`sim.function.mlp()` is a `Parametrized` function: its parameters are the weigths of the MLP.
Usually, they are exactly what you want to optimize using an evolutionary algorithm.

[`sim.function.sinP()`](assets/builder-help.md#builder-simfunctionsinp), [`sim.function.sinPA()`](assets/builder-help.md#builder-simfunctionsinpa), [`sim.function.sinPF()`](assets/builder-help.md#builder-simfunctionsinpf), and [`sim.function.sinPFA()`](assets/builder-help.md#builder-simfunctionsinpfa) are simple functions that determine the output in $\mathbb{R}^n$ using an array of $n$ sinusoidal functions, i.e., $a \sin(2 \pi f t + \phi)$.
Note that the input is not used when computing the output: that is, controllers employing (only) these functions are open-loop controllers, since they do not use the sensor readings.
The four variants are all `Parametrized` but differ in what is actually an evolvable parameter: for `sinP()`, just the phase $\phi$ for each of the $n$ sinusoidal functions, for `sinPF()`, phase $\phi$ and frequency $f$, and so on.
When a parameter is evolvable, it is mapped with min-max normalization in the corresponding range; when it is not, it is statically set to the mid point of the corresponding range.

[`sim.function.diffIn()`](assets/builder-help.md#builder-simfunctiondiffin) is a composite function that wraps another `innerFunction`.
It takes a input of $n$ values and delivers to the inner function an enlarged input of (up to, depending on `types` parameter) $3n$ values, consisting of current (at $t$) values (i.e., exactly its $n$ input values), average values in the last `windowT` simulated seconds, and trend values (i.e., newest minus oldest) in the same time window.
Actually, `diffIn()` is a *dynamical system* rather than a *function*, since it has a state.

[`sim.function.stepOut()`](assets/builder-help.md#builder-simfunctionstepout) is a composite function that wraps another `innerFunction`.
It acts similarly to `diffIn()` but operates on the output instead of on the input.
It lets `innerFunction` compute the output $\vec{x}$ of $m$ values passing it the untouched input and delivers as output $\vec{x}$ kept constant for consecutive time windows of `stepT` seconds.
In other words, `stepOut()` makes `innerFunction` a step function.
It may be useful for avoiding high-frequency behaviors, like in [[3]](#2022-c-mr-impact), where `stepT` was set to 0.2.

##### Tasks

There are three available tasks.
Their builders are grouped in the [`sim.task`](assets/builder-help.md#package-simtask) package.

The most significant is [`sim.task.locomotion()`](assets/builder-help.md#builder-simtasklocomotion).
Here, the robot is put on a `terrain` (see [here](assets/builder-help.md#package-simterrain) for the options) and let move for `duration` simulated seconds.
The usual goal in terms of optimization is to maximize the velocity of the robot, that can be extracted from the task outcome with [`extractor.locomotionXVelocity()`](assets/builder-help.md#builder-extractorlocomotionxvelocity).

##### Solvers

Solvers correspond to evolutionary algorithms.
In principle, any solver implemented in JGEA might be used.
In practice, a few are available here.
Their builders are grouped in the [`solver`](assets/builder-help.md#package-solver) package.

A solver must be compatible with a mapper, since the solver searches a given space $G$, the mapper maps a genotype $g \in G$ to a robot, and the robot fitness is evaluated (through simulation in a task) and used by the solver to drive the search.
See [[2]](#2022-c-mnm-jgea) for a more detailed description of the abstractions of search, solution, and fitness spaces.
The two most significant solvers are GA and ES: both are able to work with real numbers, i.e., with $G = \mathbb{R}^p$.
Note that you are not required to say what's the value of $p$: it is inferred automatically from the `target` of a run using the mapper in inverted mode (i.e., given a robot, it gives a prototype genotype $g \in \mathbb{R}^p$, and hence it gives $p$).

[`solver.doublesStandard()`](assets/builder-help.md#builder-solverdoublesstandard) is a standard GA working on $\mathbb{R}^p$.
It iteratively evolves `nPop` individuals until `nEval` fitness evaluations have been done.
Individual genotypes are initially generated randomly with each element in `[initialMinV,initialMaxV]`; then, they are modified by applying a Gaussian mutation with `sigmaMut` after a uniform crossover.
Selection is done through a tournament with size `tournamentRate*nPop` (clipped to the lowest value of `minNTournament`).

[`solver.simpleES()`](assets/builder-help.md#builder-solversimplees) is a simple version of Evolutionary Strategy (ES).
After the same initialization of `solver.doublesStandard()`, it evolves by taking, at each iteration, the best `parentsRate` rate of the population, computing their mean value, and producing the next generation by sampling a multivariate Gaussian distribution with the computed mean and `sigma`.
At each iteration, the `nOfElites` individuals are copied to the next generation.

##### Mappers

The mapper maps a genotype to a robot, using the `target` of the run "as the starting point".
Available mappers are in the [`mapper`](assets/builder-help.md#package-mapper) package.

The most significant one is [`mapper.toParametrized()`](assets/builder-help.md#builder-mappertoparametrized).
It maps a numerical vector to a robot whose controller can be parametrized by a numerical vector, i.e., whose controller is `Parametrized`.
In general, all the available robots meet this requirement and delegate its actual implementation to the internal `TimedRealFunction` (or the internal functions, if more than one).
A significant case is [`sim.function.mlp()`](assets/builder-help.md#builder-simfunctionmlp).

##### Listeners

Listeners are notified at each iteration during the evolution and at the end of each run.
They can be used to save, typically on a file, useful information concerning the evolution.
Their builders are grouped in the [`listener`](assets/builder-help.md#package-listener) package.
Here we describe the most significant ones.

[`listener.bestCsv()`](assets/builder-help.md#builder-listenerbestcsv) writes a single CSV file for the experiment.
If the file at `filePath` already exists, a new file with a similar name is used, without overwriting the existing file.
The CSV will have one row for each iteration of each run and one column for each of the elements of `popFunctions`, `individualFunctions`, and `runKeys` (plus a few standard columns).
Values for `popFunctions` and `individualFunctions` are of type `NamedFunction` (i.e., functions with a name) whose builders are in the [`namedFunction`](assets/builder-help.md#package-namedfunction) package.
Each function in `popFunctions` is applied to the population at the given EA iteration, whereas each function in `individualFunctions` is applied to the best individual of the population.
`runKeys` are strings specifying elements of the run descritpion to be extracted as cell values, e.g., `target.body.shape`, `randomGenerator.seed`, or `task.terrain`.

[`listener.telegram()`](assets/builder-help.md#builder-listenertelegram) sends updates about the current run via Telegram.
In particular, at the end of each run it sends a plot of the fitness during the evolution and zero or more videos of the best individual found upon the evolution performing the tasks described in `tasks`, not necessarily including the one used to drive the evolution.
This listener requires a `chatId` and a Telegram botId that has to be the only content of a text file located at `botIdFilePath`.

#### Examples of experiment files

#### Example 1: 3 runs with a VSR biped

```
experiment(
  runs = (randomGenerator = (seed = [1:1:3]) * [rg.defaultRG()]) * [
    run(
      target = s.a.centralizedNumGridVSR(
        function = s.f.mlp();
        body = s.vsr.gridBody(
          shape = s.vsr.s.biped(w = 4; h = 3);
          sensorizingFunction = s.vsr.sf.directional(
            headSensors = [s.s.sin(f = 0);s.s.d(a = -15; r = 5)];
            nSensors = [s.s.ar(); s.s.rv(a = 0); s.s.rv(a = 90)];
            sSensors = [s.s.d(a = -90)]
          )
        )
      );
      solver = so.doublesStandard(nEval = 500; nPop = 25);
      mapper = m.toParametrized();
      task = s.task.locomotion(terrain = s.t.flat(); duration = 15);
      comparator = c.max(of = e.locomotionXVelocity())
    )
  ];
  qExtractor = e.locomotionXVelocity();
  listeners = [
    l.bestCsv(
      filePath = "experiments/best-biped-mlp.txt";
      individualFunctions = [
        nf.composition(first = nf.genotype(); second = nf.base64Serializer())
      ];
      runKeys = ["randomGenerator.seed"; solver]
    );
    l.telegram(
      chatId = "207490209";
      botIdFilePath = "experiments/2dmrsim/tlg.txt";
      tasks = [
        namedTask(task = s.task.locomotion(terrain = s.t.hilly(); duration = 10))
      ]
    )
  ]
)
```
This experiment consists of 3 runs differing only in the randomSeed (`seed = [1:1:3]`).
Instead of specifying three times the full content of a `run(...)` (that would have been different in just the random seed), here the [`*` operator](#the--operator) is used.

The target robot is a $4 \times 3$ biped with a centralized brain consisting of an MLP; the brain exploits the sensors installed in the body: here distance (`s.s.d()`), area ratio (`s.s.ar()`), rotated velocity (`s.s.rv()`).
The available sensor builders are grouped in the [`sim.sensor`](assets/builder-help.md#package-simsensor) package (they correspond to methods of the utility class `SensorBuilder` of 2dmrsim.)
The solver is a simple GA with a population of 25 individuals.
The task is the one of locomotion on a flat terrain, lasting 15 simulated seconds.

The experiment produces a CSV file located at `experiments/best-biped-mlp.txt`.
The file will include also a column named `randomGenerator.seed` with the random seed of the run and a column `solver` with the solver (with a constant value, here).
Moreover, it'll contain a column named `best→genotype→base64` with a base64 serialization of the genotype, i.e., the parameters of the MLP.
This can be reused later for further analysis of the best individuals.

The experiment also notifies about its progresses via Telegram.
In particular, after each run, it takes the best individual and lets it run on a different terrain than the one it was evolved on (`s.t.hilly()` instead of `s.t.flat()`): the resulting video is sent on a chat with `chatId = "207490209"` (the double quotes are needed to let interpret it as a string).
The received video might look like this:
![The text-based UI of `Starter`](assets/images/biped.gif)

Note that this is the result of a rather short (`nEval = 500`) evolution; moreover, the best robot is here facing a terrain "it never saw" (more precisely, it and its entire ancestry never saw it) during the evolution.

#### Example 2: 10 runs with 3 VSR bodies on 2 terrains

```
experiment(
  runs =
    (randomGenerator = (seed = [1:1:10]) * [rg.defaultRG()])
    * (target =
        (body =
          (shape =
            [
              s.vsr.s.biped(w = 4; h = 3);
              s.vsr.s.free(s = "111110-110011");
              s.vsr.s.worm(w = 5; h = 2)
            ]
          ) * [s.vsr.gridBody(
                 sensorizingFunction = s.vsr.sf.directional(
                   headSensors = [s.s.sin(f = 0);s.s.d(a = -15; r = 5)];
                   nSensors = [s.s.ar(); s.s.rv(a = 0); s.s.rv(a = 90)];
                   sSensors = [s.s.d(a = -90)]
                 )
               )]
        ) * [s.a.centralizedNumGridVSR(function = s.f.mlp())])
    * (task =
        [
          s.task.locomotion(terrain = s.t.flat(); duration = 15);
          s.task.locomotion(terrain = s.t.hilly(); duration = 15)
        ]
      )
    * [run(
        solver = so.doublesStandard(nEval = 100; nPop = 25);
        mapper = m.toParametrized();
        comparator = c.max(of = e.locomotionXVelocity())
      )];
  qExtractor = e.locomotionXVelocity()
)
```

Here there are no listeners, just for simplifying the example; in practice it would be weird to run such a big experiment without saving any data.

A single solver is used to solve two tasks:
- `s.task.locomotion(terrain = s.t.flat(); duration = 15)`
- `s.task.locomotion(terrain = s.t.hilly(); duration = 15)`

with three robot shapes:
- `s.vsr.s.biped(w = 4; h = 3)`
- `s.vsr.s.free(s = "111110-110011")`
- `s.vsr.s.worm(w = 5; h = 2)`

each time with 10 different random seeds.
There will hence be 60 runs.

## References

1. <a name="2020-c-mbdf-evolution"></a> Medvet, Bartoli, De Lorenzo, Fidel; [Evolution of Distributed Neural Controllers for Voxel-based Soft Robots](https://medvet.inginf.units.it/publications/2020-c-mbdf-evolution/); ACM Genetic and Evolutionary Computation Conference (GECCO); 2020
2. <a name="2022-c-mnm-jgea"></a>Medvet, Nadizar, Manzoni; [JGEA: a Modular Java Framework for Experimenting with Evolutionary Computation](https://medvet.inginf.units.it/publications/2022-c-mnm-jgea/); Workshop Evolutionary Computation Software Systems (EvoSoft@GECCO); 2022
3. <a name="2022-c-mr-impact"></a>Medvet, Rusin; [Impact of Morphology Variations on Evolved Neural Controllers for Modular Robots](https://medvet.inginf.units.it/publications/2022-c-mr-impact/); XVI International Workshop on Artificial Life and Evolutionary Computation (WIVACE); 2022
