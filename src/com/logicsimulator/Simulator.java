package com.logicsimulator;

public abstract class Simulator {

	protected Netlist nl;
	protected int maxTransitions, transition;

	public Simulator(Netlist nl) {
		this.nl = nl;
		maxTransitions = 1000;
		transition = 0;
	}

	public abstract void simulate();

}
