# Digital logic compiler and simulator

Computer simulator and compiler for digital logic, which is described in a simplification of Verilog.

### How to use it ###

If you have you own pseudo-Verilog files you can process them by first storing the files containing the hardware description and the input stimuli (if any) in the `test_cases/` folder and passing the name of the description to `com.logicsimulator.MainProgram`. This will generate the file `<file_name>.tokens`, `<file_name>.netlist`, `<file_name>.syntax` and `<file_name>.sim_out`. The first three generated files are mostly for debugging purposes, they are just a representation of the architecture created by the program to process and simulate the hardware description and behavior. The last one `sim_out` contains the output generated by the circuit.

The `golden.*` files contain the verified output of the set of files for testing purposes.
