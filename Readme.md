

# Design and Implementation of Wind Tunnel Deisgn Domain Specific Language: pipeflow

## Working process with backward!
1. write for press conference
2. write manual
3. write requirements
4. write test suites
5. write libraries
6. write GUI

## Press Conference
Here we proudly anounce a DSL for wind tunnel aerodynamic design, pipeflow.

It represents excellent aerodyanmic deisgn of wind tunnels as compilable & runnable program!
It enables systematically exploring design space of wind tunnels.
It boosts robustness and edgeness of next generation wind tunnel design.

Wind tunnel design to run!
Wind tunnel design to git!
Wind tunnel design to reuse!

## Kotlin toolbox for DSL implementation
How Kotlin utilities help to implement a DSL will definitely affect the way we design the DSL.

## Domain analysis
Wind tunnel design results are geometric definitions fo a tunnel circuit, where wind tunnel components are defined, the geometric parameters are specified for each components, the connection relationship between components is defined. For all the operational conditions, the performance of the tunnel circuit and components will be prodicted to specified design requirements of the fan/compressor. At some point, the fan map wille be presented as the start point to design the fan. At the first design phase, the aerodynamic design of the fan will not be included.

But fan map must be specified with the design of the circuit.





## User Manual

### Define design
Define wind tunnel aerodynamic design with kotlin as follows:

```kotlin
windtunnel("0.5m teaching wind tunnel") {
    testsection("#1")  {}

    diffuser("#1 diffuser") {}

    fan("#fan") {}
    
    diffuser("#2 diffuser") {}

    collector("#collector") {}

    settlingchamber("#sc") {}

    contraction("#ctr") {}

    openCircuit("# collector", "#sc", "#ctr", "#1", "#1 diffuser", "#fan", "#2 diffuser")
}

```

### Evaluate performance

For database, load performance data, and predict the performance of current design.



## Developer Manual


## Requirements


## Test suites


## Libraries


## UI/UX development

