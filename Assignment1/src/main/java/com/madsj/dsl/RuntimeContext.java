package com.madsj.dsl;

import com.madsj.dsl.metamodel.Machine;
import com.madsj.dsl.metamodel.State;

import java.util.HashMap;
import java.util.Map;

public class RuntimeContext {
    private Map<String, Integer> variables = new HashMap<>();
    private State currentState;

    public RuntimeContext(Machine machine) {
        for (String name : machine.getVariablesNames()) {
            setVar(name, 0);
        }
        setCurrentState(machine.getInitialState());
    }

    public void setVar(String name, int value) {
        variables.put(name, value);
    }

    public int getVar(String name) {
        return variables.get(name);
    }

    public void modifyVar(String name, int value) {
        variables.put(name, variables.get(name) + value);
    }

    public State getCurrentState() {
        return currentState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }
}
