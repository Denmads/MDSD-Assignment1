package com.madsj.dsl.metamodel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class Machine {

	private Map<String, State> states;
	private String initialState;

	private List<String> variablesNames;

	public Machine(Map<String, State> states, String initialState, List<String> variablesNames) {
		this.states = states;
		this.initialState = initialState;
		this.variablesNames = variablesNames;
	}

	public List<State> getStates() {
		return new ArrayList<>(states.values());
	}

	public State getInitialState() {
		return states.get(initialState);
	}

	public State getState(String state) {
		return states.get(state);
	}

	public List<String> getVariablesNames() {
		return variablesNames;
	}

	public int numberOfIntegers() {
		return variablesNames.size();
	}

	public boolean hasInteger(String name) {
		return variablesNames.contains(name);
	}

}
