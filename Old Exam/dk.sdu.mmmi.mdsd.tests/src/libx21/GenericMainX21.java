package libx21;

import java.util.ArrayList;
import java.util.List;

/**
 * Generic main class representing a network of nodes.
 * Abstract class which is to be subclassed by a concrete network.
 * @author ups
 */
public abstract class GenericMainX21 {
	/**
	 * All the nodes in the network
	 */
	private List<ComputeNode<?,?>> nodes = new ArrayList<>();
	/**
	 * Add a node to the network
	 */
	protected void addNode(ComputeNode<?,?> node) {
		nodes.add(node);
	}
	/**
	 * Initialize all the nodes, called prior to initializing the network
	 */
	protected abstract void initializeNodes();
	/**
	 * Initialize the network as a whole
	 */
	protected abstract void initializeNetwork();
	/**
	 * Initialize and compute
	 */
	public void compute() {
		initializeNodes();
		initializeNetwork();
		for(ComputeNode<?,?> n: nodes) n.compute();
	}

}
