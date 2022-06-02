package libx21;

import java.util.ArrayList;
import java.util.List;

/**
 * Special non-computing node representing output from the network
 * @author ups
 *
 * @param <Type> the type of the input
 */
public class OutputNode<Type> implements ComputeNode<Type,Object> {
	/**
	 * List that stores all outputs generated
	 */
	private List<Type> outputs = new ArrayList<>();

	@Override
	public synchronized void put(Type data) {
		outputs.add(data);
	}

	@Override
	public void addOutputNode(ComputeNode<Object,?> node) {
		throw new Error("Illegal operation: cannot add output nodes to an output node");
	}

	@Override
	public void compute() { }
	
	/**
	 * Get the data generated on this output
	 */
	public synchronized List<Type> getData() {
		return new ArrayList<Type>(outputs);
	}
}
