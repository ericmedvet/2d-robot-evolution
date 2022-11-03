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
java -cp "2d-robot-evolution/it.units.erallab.robotevo2d.assembly/target/robotevo2d.assembly-bin/modules/*" it.units.erallab.robotevo2d.main.singleagent.Starter --expFile EXP_FILE --nOfThreads N
```
where `EXP_FILE` is the path to a file with an **experiment description** and `N` is the **number of threads** to be used for running the experiment.

Once started, `Starter` shows a text-based UI giving information about overall progress of the experiment, the current run, logs, and resources usage.
`Starter` may be stopped (before conclusion) with `ctrl+C`.

![The text-based UI of `Starter`](assets/images/sample-run.png)

For the number of threads `N`, it is suggested to use a number lower or equal to the number of cores on the machine you run the experiment on.
The actual degree of concurrency will depend on `N` and on the evolutionary algorithm being used: e.g., a GA with a population of `npop=30` will do at most `min(30,N)` fitness evaluations at the same time.

The help about what other parameters can be set while invoking `Starter` may be obtained with:
```shell
java -cp "2d-robot-evolution/it.units.erallab.robotevo2d.assembly/target/robotevo2d.assembly-bin/modules/*" it.units.erallab.robotevo2d.main.singleagent.Starter --help
```

### The experiment description

An *experiment* consists of one or more *runs*.

Each *run* is an evolutionary optimization using a `Solver` (obtained with a `SolverBuilder`) and a `Mapper` (obtained with a `MapperBuilder`), that maps a genotype into a target robot, for solving a `Task`.
A run is described in `Run`, which also includes other key information as, e.g., the `RandomGenerator`.

An experiment is described in `Experiment`.
The description also includes information on if/how/where to store the info about ongoing runs: one reasonable choice is to save one line of a CSV file for each iteration of each run.

You can describe an experiment through an experiment file containing a textual description of the experiment.
The description must contain a *named parameter map* for an experiment, i.e., its content has to be something like `experiment(...)` (see the [`experiment()`](assets/builder-help.md#builder-experiment)) builder documentation=. 

#### Named parameter map format

A *named parameter map* is a string adhering the following human- and machine-readable format described by the following grammar:
```
<e> ::= <n>(<nps>)
<nps> ::= ∅ | <np> | <nps>;<np>
<np> ::= <n>=<e> | <n>=<d> | <n>=<s> | <n>=<le> | <n>=<ld> | <n>=<ls>
<le> ::= (<np>)*<le> | <i>*[<es>] | [<es>]
<ld> ::= [<d>:<d>:<d>] | [<ds>]
<ls> ::= [<ss>]
<es> ::= ∅ | <e> | <es>;<e>
<ds> ::= ∅ | <d> | <ds>;<d>
<ss> ::= ∅ | <s> | <ss>;<s>
```
where `<s>` are strings, `<d>` are numbers, and `<e>` are named parameter maps.
The format is reasonably robust to spaces and line-breaks.

An example of a syntactically valid named parameter map is:
```
car(dealer=Ferrari;price=45000)
```
where `dealer` and `price` are parameter names and `Ferrari` and `45000` are parameter values.
`car()` refers to a builder taking `dealer` and `price` as parameters.

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

##### `*` operator

Note the possible use of `*` for specifying arrays (broadly speaking, collection of values) in a more compact way.
For example, `3 * [1; 2]` corresponds to `[1; 2; 1; 2; 1; 2]`.
A more complex case is the one of left-product:
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

The complete specifications for available parameters and corresponding values for a valid description of an experiment is available [here](assets/builder-help.md).

In the following sections, we describe the key elements.

##### Embodied agents

There are five available embodied agents (i.e., *robots*).
Their builders are described [here](assets/builder-help.md#package-simagent).
The two most significant follows.

[`sim.agent.centralizedNumGridVSR()`](assets/builder-help.md#builder-simagentcentralizednumgridvsr) corresponds to a VSR with a single closed-loop controller taking as input the sensor readings and giving as output the activation values, as described in [[1]](#2020-c-mbdf-evolution).
The controller is a `TimedRealFunction`, i.e., a multivariate function taking the current time $t$ and $m$ real values and giving $n$ real values; formally, it is a $f: \mathbb{R} \times \mathbb{R}^m \to \mathbb{R}^n$.
Available functions are described [here](assets/builder-help.md#package-simfunction).

[`sim.agent.heteroDistributedNumGridVSR()`](assets/builder-help.md#builder-simagentheterodistributednumgridvsr) and [`sim.agent.homoDistributedNumGridVSR()`](assets/builder-help.md#builder-simagenthomodistributednumgridvsr) correspond to a VSR with one `TimedRealFunction` inside each one of the voxels.
Each `TimedRealFunction` takes as input the local sensor readings and some (exactly `signals`) values coming from adjacent voxels and gives as output the local activation value and some values going to adjacent voxels, as described in [[1]](#2020-c-mbdf-evolution).
For `sim.agent.homoDistributedNumGridVSR()`, the same function is used in each voxel; for `sim.agent.heteroDistributedNumGridVSR()` different functions are used.
I.e., they for the former case, the function share the parameters: for using `sim.agent.homoDistributedNumGridVSR()`, each voxel in the body has to have the same number of sensors.

##### Tasks

There are three available tasks.
Their builders are described [here](assets/builder-help.md#package-simtask).

The most significant is [`sim.task.locomotion()`](assets/builder-help.md#builder-simtasklocomotion).
Here, the robot is put on a `Terrain` (see [here](assets/builder-help.md#package-simterrain) for the options) and let move for `duration` simulated seconds.
The usual goal in terms of optimization is to maximize the velocity of the robot, that can be extracted from the task outcome with [`extractor.locomotionXVelocity()`](assets/builder-help.md#builder-extractorlocomotionxvelocity).

##### Solvers

Solvers correspond to evolutionary algorithms.
In principle, any solver implemented in JGEA might be used.
In practice, a few are available here.
Their builders are described [here](assets/builder-help.md#package-solver).

A solver must be compatible with a mapper, since the solver search a given space $G$, the mapper maps a $g \in G$ to a robot, and the robot fitness is evaluated and used by the solver to drive the search.
See [[2]](#2022-c-mnm-jgea) for a more detailed description.
The two most significant solvers are GA and ES: both are able to work with real numbers, i.e., $G = \mathbb{R}^p$.
Note that you are not required to say what's the value of $p$: it is inferred automatically from the `target` of a run using the `mapper` in inverted mode (i.e., given a robot, it gives a genotype $g \in \mathbb{R}^p$, and hence it gives $p$).

[`solver.doublesStandard()`](assets/builder-help.md#builder-solverdoublesstandard) is a standard GA working on $\mathbb{R}^p$.
It iteratively evolves `nPop` individuals until `nEval` fitness evaluations have been done.
Individual genotypes are initially generated randomly with each element in `[initialMinV,initialMaxV]`; then, they are modified by applying a Gaussian mutation with `sigmaMut` and a uniform crossover.
Selection is done through a tournament with size `tournamentRate*nPop` (clipped to the lowest value of `minNTournament`).

[`solver.simpleES()`](assets/builder-help.md#builder-solversimplees) is a simple version of Evolutionary Strategy (ES).
After the same initialization of `solver.doublesStandard()`, it evolves by taking, at each iteration, the best `parentsRate` rate of the population, computing their mean value, and producing the next generation by sampling a multivariate Gaussian distribution with the computed mean and `sigma`.
At each iteration, the `nOfElites` individuals are copied to the next generation.

##### Mappers

The mapper maps a genotype to a robot, using the `target` of the rub "as the starting point".
Available mappers are described [here](assets/builder-help.md#package-mapper).

The most significant one is [`mapper.toParametrized()`](assets/builder-help.md#builder-mappertoparametrized).
It maps a numerical vector to a robot whose controller can be parametrized by a numerical vector.
In general, all the available robots meet this requirement and delegate its actual implementation to the internal `TimedRealFunction` (or the internal functions, if more than one).
A significant case is [`sim.function.mlp()`](assets/builder-help.md#builder-simfunctionmlp).

##### Listeners

Listeners are notified at each iteration during the evolution and at the end of each run.
They can be used to save, typically on a file, useful information concerning the evolution.
Their builders are described [here](assets/builder-help.md#package-listener).
The most significant follows.

[`listener.bestCsv()`](assets/builder-help.md#builder-listenerbestcsv) writes a single CSV file for the experiment.
If the file at `filePath` already exists, a new file with similar name is used, without overwriting the existing file.
The CSV will have one row for each iteration of each run and one column for each of the elements of `popFunctions`, `individualFunctions`, and `runKeys` (plus a few standard columns).
Values for `popFunctions` and `individualFunctions` are of type `NamedFunction` (i.e., functions with a name) and can be built as described [here](assets/builder-help.md#package-namedfunction).
Each function in `popFunctions` is applied to the population at the given EA iteration, whereas each function in `individualFunctions` is applied to the best individual of the population.

[`listener.telegram()`](assets/builder-help.md#builder-listenertelegram) sends updates about the current run via Telegram.
In particular, at the end of each run it sends a plot of the fitness during the evolution and zero or more videos of the best individual found upon the evolution performing the tasks described in `tasks`, not necessarily including the one using to drive the evolution.
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
Instead of specifying three times the full content of a `run(...)` (that would have been different in just the random seed), here the [`*` operator](#-operator) is used.

The target robot is a $4 x 3$ biped with a centralized brain consisting of an MLP; the brain exploits the sensors installed in the body: here distance (`s.s.d()`), area ratio (`s.s.ar()`), rotated velocity (`s.s.rv()`).
The list of all available sensors is [here](assets/builder-help.md#package-simsensor) (corresponding to methods of the utility class `SensorBuilder`.)
The solver is a simple GA with a population of 25 individuals.
The task is the one of locomotion on a flat terrain, lasting 15 simulated seconds.

The experiment produces a CSV file located at `experiments/best-biped-mlp.txt`.
The file will include also a column named `randomGenerator.seed` with the random seed of the run and a column `solver` with the solver (with a constant value, here).
Moreover, it'll contain a column named `best→genotype→base64` with a base64 serialization of the genotype, i.e., the parameters of the MLP.
This can be reused for later re-use of the best individuals.

The experiment also notifies about its progresses via Telegram.
In particular, after each run, it takes the best individual and let it rub on a different terrain than the one it was evolved on (`s.t.hilly()` instead of `s.t.flat()`): the resulting video is sent on a chat with `chatId=207490209` (the double quotes are needed to let interpret it as a string).
The received video might look as this one:
![The text-based UI of `Starter`](assets/images/biped.gif)

Note that this is the result of a rather short (`nEval = 500`) evolution; moreover, the best robot is here facing a terrain "it never saw" (more precisely, it and its entire ancestry never saw) during the evolution.

#### Example 1: 10 runs with a 3 VSR bodies on 2 terrains

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

Here there are no listeners, for simplification of the example; in practice it would be weird to run such a big experiment without saving any data.

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