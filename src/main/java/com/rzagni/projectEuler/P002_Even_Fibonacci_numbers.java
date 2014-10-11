package com.rzagni.projectEuler;

public class P002_Even_Fibonacci_numbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int MAX = 4000000; // 4 milions
		
		int n1 = 1;
		int n2 = 2;
		int sum = 2;
		
		while ( n2 <= MAX) {
			int fib = n1 + n2;
			if (fib % 2 == 0) {
				sum += fib;
			}
			n1 = n2;
			n2 = fib;
		}
		System.out.format("%nThe sum is %s%n", sum);


	}
	

}
