package com.rzagni.projectEuler;

import java.util.Arrays;

public class P010_Summation_of_primes {

	public static void main(String[] args) {
		long LIMIT =  2000000;	// 10; => 17
		long result = sumPrimes(LIMIT);
		
		System.out.format(
				"Sum of primes lower than %,d is %,d", 
				LIMIT, result
			);
	}

	protected static long sumPrimes(long limit) {
		long sum = 0;
		if (limit >= 2) {
			sum += 2;
		}
		for (long i = 3; i <= limit; i+=2) {
			if (isPrimeSqrt(i)){
				sum += i;
			}
		}
		return sum;
	}
	
	protected static boolean isPrimeAdaptative(long number) {
		
		if (number == 1) {
			return false;
		}
		
		if (isEven(number)) {
			return (number == 2) ? true : false;
		}
		
		for (long i = 3; i <= (number / i); i+=2) {
			if ((number % i) == 0 ) {
				return false;
			}
		}
		return true;
	}

	protected static boolean isPrimeSqrt(long number) {
		
		if (number == 1) {
			return false;
		}
		
		if (isEven(number)) {
			return (number == 2) ? true : false;
		}
		
		if ((number % 3) == 0) {
			return (number == 3) ? true : false;
		}
		
		if ((number % 5) == 0) {
			return (number == 5) ? true : false;
		}
		
		int numSqrt = (int) Math.sqrt(number);
		
		for (long i = 7; i <= (numSqrt); i+=2) {
			if ((number % i) == 0 ) {
				return false;
			}
		}
		return true;
	}

	protected static long sumPrimesSiege(int limit) {
		
		boolean[] isPrime = buildArrayOfPrimes(limit);
		
		long sum = 0;
		if (limit >= 2) {
			sum += 2;
		}
		for (long i = 3; i <= limit; i+=2) {
			if (isPrimeSiege(i, isPrime)){
				sum += i;
			}
		}
		return sum;
	}
	
	protected static boolean isPrimeSiege(long number, boolean[] isPrime) {

		if ( (number == 0) || (number == 1)) {
			return false;
		}
		
		if (isEven(number)) {
			return (number == 2) ? true : false;
		}
		
		int numSqrt = (int) Math.sqrt(number);
		
		for (int i = 3; i <= numSqrt; i+=2) {
			if ( (isPrime[i]) & ((number % i) == 0) ) {
				return false;
			}
		}
		return true;
	}

	/**
	 * @param maxPrimeToCheck
	 * @return
	 */
	protected static boolean[] buildArrayOfPrimes(int maxPrimeToCheck) {
		
		boolean[] isPrime = new boolean[maxPrimeToCheck+1];
		Arrays.fill(isPrime, true);
		
		ruleOutZeroAndOne(isPrime);
		ruleOutEven(isPrime);
		
		for (int i = 3; i < isPrime.length; i+=2) {
			if (isPrime[i] == true) {
				ruleOutMultiples(i, isPrime);
			}
		}		
		return isPrime;
	}


	/**
	 * Marks positions 0 and 1 of the array as not primes.
	 * @param isPrime a boolean array recording if the number specified from the index is a prime number or not.
	 */
	protected static void ruleOutZeroAndOne(boolean[] isPrime) {
		isPrime[0] = isPrime[1] = false;
	}

	/**
	 * Rules out from the prime array all the even numbers higher than 2.
	 * @param isPrime the array of primes
	 */
	protected static void ruleOutEven(boolean[] isPrime) {
		int upperLimit = isPrime.length;
		for (int i = 4; i < upperLimit; i+=2) {
			isPrime[i] = false;
		}
	}
	
	/**
	 * Rules out from the prime array all the multiplies of the given number.
	 * @param numero the number for which to rule out the multiplies
	 * @param isPrime the array of primes
	 */
	protected static void ruleOutMultiples(int numero, boolean[] isPrime) {
		int upperLimit = isPrime.length;

		if (numero > Math.sqrt(upperLimit)) {
			return;
		}
		
		for (int i = (numero*numero); i < upperLimit; i+=(numero * 2)) {
			isPrime[i] = false;
		}
	}
	
	/**
	 * Checks if a number is Even or Odd
	 * @param number the number to check
	 * @return true if number is even, false otherwise
	 */
	protected static boolean isEven(long number) {
		return (number % 2) == 0;
	}
	
}
