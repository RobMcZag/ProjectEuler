package com.rzagni.projectEuler;

public class P006_Sum_Square_Difference {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int MAX = 100;
		
		mathWay(MAX);
		bruteForce(MAX);

	}

	public static long mathWay(int n) {
	
		long sum = n * ( n + 1 ) / 2;
		long squareOfSum = sum * sum;
		
		long sumOfSquares = n * ( n + 1 ) * ( 2 * n + 1) / 6 ;
		/*
		 * f(n) = 1^2+2^2+... + n^2 = a n^3 + b n^2 + c n + d
		 * f(n+1) = f(n) + (n+1)^2
		 * f(0) = 0 = d
		 * f(1) = 1 = a + b + c + d
		 * f(2) = 9 = a  8 + b 4 + c 2 + d
		 * f(3) =36 = a 27 + b 9 + c 3 + d
		 * => a = 1/3, b = 1/2; c = 1/6; d = 0 
		 */
		
		System.out.format(
				"MATH WAY%n"+
				"Square of sum = %s%n"+
				"- Sum of squares = %s%n"+
				"Difference = %s%n",
				squareOfSum, sumOfSquares, squareOfSum - sumOfSquares 
				);
		return squareOfSum - sumOfSquares;
	}
		
	public static long bruteForce(int MAX) {
		long sumOfSquares = 0;
		long sum = 0;
		
		for (int i = 0; i <= MAX; i++) {
			sum += i;
			sumOfSquares += i*i;
		}
		long squareOfSum = sum * sum;
		
		System.out.format(
				"BRUTE FORCE%n"+
				"Square of sum = %s%n"+
				"- Sum of squares = %s%n"+
				"Difference = %s%n",
				squareOfSum, sumOfSquares, squareOfSum - sumOfSquares 
				);
		return squareOfSum - sumOfSquares;
	}
}
