package libx21;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Abstract implementation of the ComputeNode interface:
 * a node that processes an input stream using a function,
 * and sends the result to multiple output nodes
 * @author ups
 *
 * @param <Input> the type of the input stream
 * @param <Output> the input type of all the output nodes
 */
public abstract class AbstractComputeNode<Input,Output> implements ComputeNode<Input,Output> {
	/**
	 * Queue containing inputs to the node
	 */
	private BlockingQueue<Input> input = new LinkedBlockingQueue<>();
	/**
	 * The nodes receiving the computed outputs
	 */
	private List<ComputeNode<Output,?>> outputs = new ArrayList<>();
	/**
	 * Compute method representing the function
	 * @param input the input to the function
	 * @return the computed return value of the function
	 */
	protected abstract Output function(Input input);
	/**
	 * Start computation of this node
	 */
	public void compute() {
		new Thread() {
			public void run() {
				while(true) {
					try {
						Input in = input.take();
						Output out = function(in);
						if(out==null) continue;
						for(ComputeNode<Output,?> node: outputs)
							node.put(out);
					} catch (InterruptedException e) {
						throw new Error("Node execution failed");
					}
				}
			}
		}.start();
	}
	/**
	 * Add an output node
	 */
	public void addOutputNode(ComputeNode<Output,?> node) {
		outputs.add(node);
	}
	/**
	 * Start computation of this node
	 */
	public void put(Input data) {
		input.add(data);
	}
}
