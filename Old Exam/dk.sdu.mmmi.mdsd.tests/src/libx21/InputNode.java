package libx21;

import java.util.ArrayList;
import java.util.List;

/**
 * Special non-computing node representing input to the network
 * @author ups
 *
 * @param <Type> the type of the input
 */
public class InputNode<Type> implements ComputeNode<Type,Type> {
	/**
	 * The output nodes
	 */
	private List<ComputeNode<Type,?>> outputs = new ArrayList<>();

	@Override
	public void put(Type data) {
		for(ComputeNode<Type,?> node: outputs)
			node.put(data);
	}

	@Override
	public void addOutputNode(ComputeNode<Type,?> node) {
		outputs.add(node);
	}

	@Override
	public void compute() { }

}
