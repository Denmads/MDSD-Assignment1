package libx21;

/**
 * Node that processes an input stream using a function,
 * and sends the result to multiple output nodes
 * @author ups
 *
 * @param <Input> the type of the input stream
 * @param <Output> the input type of all the output nodes
 */

public interface ComputeNode<Input,Output> {
	/**
	 * Start computation of this node
	 */
	void put(Input data);
	/**
	 * Add an output node
	 */
	void addOutputNode(ComputeNode<Output,?> node);
	/**
	 * Start computation of this node
	 */
	void compute();
}
