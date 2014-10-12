package com.rzagni.projectEuler;

import java.util.Date;

public class P010_Summation_of_primesSpeedTest {

	public static void main(String[] args) {
		long[] results = null;

		results = speedTestForNumber(11 * 13, 1000000);
		System.out.format("Time for '11 * 13'     => isPrimeAdaptative: %,5d | isPrimeSqrt: %,5d%n", results[0], results[1]);

		results = speedTestForNumber(3559 * 3571, 10000);	
		System.out.format("Time for '3559 * 3571' => isPrimeAdaptative: %,5d | isPrimeSqrt: %,5d%n", results[0], results[1]);

		results = speedTestForNumber(16769023, 10000);	
		System.out.format("Time for '16769023'    => isPrimeAdaptative: %,5d | isPrimeSqrt: %,5d%n", results[0], results[1]);

		results = speedTestForNumber(1073676287, 1000);	
		System.out.format("Time for '1073676287'  => isPrimeAdaptative: %,5d | isPrimeSqrt: %,5d%n", results[0], results[1]);
		System.out.println();

		results = speedTestForInterval(16700000, 16769023);	
		System.out.format("Time for '   16.700.000 =>    16.769.023' (%,6d) => isPrimeAdaptative: %,6d | isPrimeSqrt: %,6d%n", 16769023 - 16700000 , results[0], results[1]);

		results = speedTestForInterval(1073600000, 1073676287);
		System.out.format("Time for '1.073.600.000 => 1.073.676.287' (%,6d) => isPrimeAdaptative: %,6d | isPrimeSqrt: %,6d%n", 1073676287 - 1073600000, results[0], results[1]);
	}
	
	protected static long[] speedTestForNumber(long number, int numberOfTests) {
		long[] results = new long[2];
		
		long ts2 = new Date().getTime();
		for (int i = 0; i < numberOfTests; i++) {
			P010_Summation_of_primes.isPrimeSqrt(number);
		}
		long te2 = new Date().getTime();
		results[1] += (te2 - ts2);
		
		long ts1 = new Date().getTime();
		for (int i = 0; i < numberOfTests; i++) {
			P010_Summation_of_primes.isPrimeAdaptative(number);
		}
		long te1 = new Date().getTime();
		results[0] += (te1 - ts1);
			
		return results;
	}

	protected static long[] speedTestForInterval(long fromNumber, long toNumber) {
		long[] results = new long[2];
		
		if (fromNumber > toNumber) {
			return results;
		}
		
		long ts2 = new Date().getTime();
		for (long n = fromNumber; n <= toNumber; n++) {
			P010_Summation_of_primes.isPrimeSqrt(n);
		}
		long te2 = new Date().getTime();
		results[1] += (te2 - ts2);
		
		long ts1 = new Date().getTime();
		for (long n = fromNumber; n <= toNumber; n++) {
			P010_Summation_of_primes.isPrimeAdaptative(n);
		}
		long te1 = new Date().getTime();
		results[0] += (te1 - ts1);
			
		return results;
	}

}
