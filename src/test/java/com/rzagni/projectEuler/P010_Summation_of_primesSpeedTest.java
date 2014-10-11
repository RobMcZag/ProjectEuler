package com.rzagni.projectEuler;

import java.util.Date;

public class P010_Summation_of_primesSpeedTest {

	public static void main(String[] args) {
		long[] results = null;

		results = testForNumber(11 * 13, 1000000);
		System.out.format("Time for '11 * 13'     => isPrime: %,d | isPrimeFast: %,d%n", results[0], results[1]);

		results = testForNumber(3559 * 3571, 10000);	
		System.out.format("Time for '3559 * 3571' => isPrime: %,d | isPrimeFast: %,d%n", results[0], results[1]);

		results = testForNumber(16769023, 10000);	
		System.out.format("Time for '16769023'    => isPrime: %,d | isPrimeFast: %,d%n", results[0], results[1]);

		results = testForNumber(1073676287, 1000);	
		System.out.format("Time for '1073676287'  => isPrime: %,d | isPrimeFast: %,d%n", results[0], results[1]);
	}
	
	protected static long[] testForNumber(long number, int numberOfTests) {
		long[] results = new long[2];
		
		long ts2 = new Date().getTime();
		for (int i = 0; i < numberOfTests; i++) {
			P010_Summation_of_primes.isPrimeFast(number);
		}
		long te2 = new Date().getTime();
		results[1] += (te2 - ts2);
		
		long ts1 = new Date().getTime();
		for (int i = 0; i < numberOfTests; i++) {
			P010_Summation_of_primes.isPrime(number);
		}
		long te1 = new Date().getTime();
		results[0] += (te1 - ts1);
			
		return results;
	}

}
