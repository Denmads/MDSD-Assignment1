package tests;

import p4.P4Main;

import java.util.Arrays;
import java.util.List;

import p4.DataInt_pair;

public class TestP4 {
	public static void main(String argv[]) throws InterruptedException {
		P4Main p = new P4Main();
		// Set parameters and start network
		p.setParameterZ(3);
		p.compute();
		// Generate inputs
		p.inputNumber(1);
		p.inputNumber(2);
		p.inputNumber(3);
		p.inputNumber(4);
		p.inputNumber(5);
		p.inputNumber2(new DataInt_pair(1,2));
		p.inputNumber2(new DataInt_pair(3,3));
		p.inputNumber2(new DataInt_pair(5,4));
		p.inputNumber2(new DataInt_pair(7,5));
		p.inputNumber2(new DataInt_pair(9,6));
		// Wait for computations to finish
		Thread.sleep(1000);
		// Print outputs
		System.out.println("not_dup="+p.getNot_duplicates());
		System.out.println("added="+p.getNumber2added());
		// Check outputs
		List<DataInt_pair> nd = Arrays.asList(p(1,3),p(1,3),p(2,3),p(2,3),p(4,3),p(4,3),p(5,3),p(5,3));
		List<Integer> a = Arrays.asList(3, 6, 9, 12, 15);
		if(nd.equals(p.getNot_duplicates()) && a.equals(p.getNumber2added()))
			System.out.println("OK");
		else
			System.out.println("FAIL");
	}

	private static DataInt_pair p(int i, int j) { return new DataInt_pair(i,j); }
}
