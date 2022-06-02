package tests;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import p2.P2Main;

public class TestP2 {
	public static void main(String argv[]) throws InterruptedException {
		P2Main p = new P2Main();
		// Set parameters and start the network
		p.setParameterZ(100);
		p.setParameterMax(3);
		p.compute();
		// Generate inputs
		p.inputNumber(1);
		p.inputNumber(2);
		p.inputNumber(3);
		p.inputNumber(4);
		// Wait for computations to finish
		Thread.sleep(1000);
		// Print outputs
		System.out.println("out="+p.getOut());
		System.out.println("ceiling="+p.getCeiling());
		// Check outputs (using Set for nondeterministic outputs)
		Set<Integer> v1 = new HashSet<>(Arrays.asList(10404, 10404, 10609, 10816, 11025, 10609, 10816, 11025));
		List<Integer> v2 = Arrays.asList(1, 2, 3, 3);
		if(v1.equals(new HashSet<>(p.getOut())) && v2.equals(p.getCeiling()))
			System.out.println("OK");
		else
			System.out.println("FAIL");
	}
}
