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

![The text-based UI of `Starter`](assets/sample-run.png)

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

#### Specification for the experiment file

The complete specifications for available parameters and corresponding values for a valid description of an experiment is available [here](assets/builder-help.md).

In the following sections, we describe the key elements.

##### Embodied agents

There are five available embodied agents (i.e., *robots*).
Their builders are described [here](assets/builder-help.md#package-simagent).

- `sim.agent.centralizedNumGridVSR()` corresponds to a VSR with a single closed-loop controller taking as input the sensor readings and giving as output the activation values, as described in [[1]](#2020-c-mbdf-evolution).

##### Tasks

##### Solvers

##### Mappers

##### Listeners

#### Examples of experiment files

## References
1. <a name="2020-c-mbdf-evolution"></a> Medvet, Bartoli, De Lorenzo, Fidel; [Evolution of Distributed Neural Controllers for Voxel-based Soft Robots](https://medvet.inginf.units.it/publications/2020-c-mbdf-evolution/); ACM Genetic and Evolutionary Computation Conference (GECCO); 2020