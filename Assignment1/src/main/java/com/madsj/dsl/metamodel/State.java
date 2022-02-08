package com.madsj.dsl.metamodel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class State {
	
	/**
     * The name of the state
     */
    private String name;
    /**
     * Transitions associated with this state
     */
    private Map<String,List<Transition>> transitions = new HashMap<String,List<Transition>>();

	public State(String name) {
		this.name = name;
	}

	public Object getName() {
		return name;
	}

	public void addTransition(Transition transition) {
		String event = (String)transition.getEvent();

		if (!transitions.containsKey(event)) {
			transitions.put(event, new ArrayList<>());
		}
		transitions.get(event).add(transition);
	}

	public List<Transition> getTransitions() {
		return transitions.values().stream().reduce(new ArrayList<>(), (a, b) -> {
			a.addAll(b);
			return a;
		});
	}

	public List<Transition> getTransitionsByEvent(String string) {
		return transitions.getOrDefault(string, new ArrayList<>());
	}

}
