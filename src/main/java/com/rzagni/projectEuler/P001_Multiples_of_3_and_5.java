package com.rzagni.projectEuler;

public class P001_Multiples_of_3_and_5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i < 1000; i++) {
			if ( (i % 3 == 0) || (i % 5 == 0) ) {
				sum += i;
			}
		}
		
		System.out.format("%nThe sum is %s%n", sum);

	}

}
