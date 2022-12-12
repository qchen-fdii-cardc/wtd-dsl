

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

