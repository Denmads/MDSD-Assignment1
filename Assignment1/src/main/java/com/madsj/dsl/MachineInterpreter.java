package com.madsj.dsl;

import com.madsj.dsl.metamodel.Machine;
import com.madsj.dsl.metamodel.State;
import com.madsj.dsl.metamodel.Transition;

public class MachineInterpreter {

	private RuntimeContext runtimeState;
	private Machine model;

	public void run(Machine m) {
		runtimeState = new RuntimeContext(m);
		model = m;
	}

	public State getCurrentState() {
		return runtimeState.getCurrentState();
	}

	public void processEvent(String event) {
		for (Transition t : getCurrentState().getTransitionsByEvent(event)) {
			if (t.isConditional() && t.isConditionFulfilled(runtimeState)) {
				if (t.hasOperation())
					t.doOperation(runtimeState);
				runtimeState.setCurrentState(model.getState(t.getTarget()));
				return;
			}
			else if (!t.isConditional()) {
				if (t.hasOperation())
					t.doOperation(runtimeState);
				runtimeState.setCurrentState(model.getState(t.getTarget()));
				return;
			}
		}
		
	}

	public int getVariable(String name) {
		return runtimeState.getVar(name);
	}

}
