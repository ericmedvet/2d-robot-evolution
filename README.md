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
mvn clean install
```

For 2D-MR-Sim (in a different directory than the one in which you cloned JGEA):
```shell
git clone --depth 1 --branch <tag_name> https://github.com/ericmedvet/2dmrsim.git
cd 2dmrsim
mvn clean install
```

Where `<tag_name>` is the tag of the version you need (i.e., `v` followed by the version number), e.g., `v2.2.1`.

### Clone and build

Now you can clone this project and build it:
```shell
git clone --depth 1 https://github.com/ericmedvet/2d-robot-evolution.git
cd 2d-robot-evolution
mvn clean package
```

At this point, if everything worked smoothly, you should be able to run a first short evolutionary optimization (assume you are in the parent directory of the `2d-robot-evolution` one that has been created after the last clone):
```shell
java -cp "2d-robot-evolution/it.units.erallab.robotevo2d.assembly/target/robotevo2d.assembly-bin/modules/*" it.units.erallab.robotevo2d.main.singleagent.Starter
```

## Usage