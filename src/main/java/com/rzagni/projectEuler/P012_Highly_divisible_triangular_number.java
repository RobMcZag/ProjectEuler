package com.rzagni.projectEuler;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class P012_Highly_divisible_triangular_number {

	public static void main(String[] args) {
		
		int TARGET_DIVISORI = 500;

		boolean[] primeArray = P010_Summation_of_primes.buildArrayOfPrimes(1000000);
		
		int[] triangleNumbers = buildArrayOfTriangleNumbers(100000);
		
		int numeroDivisori = 0; 
		int trianglePos = 2;
		while( (numeroDivisori < TARGET_DIVISORI) &&  (trianglePos < triangleNumbers.length)) {
			numeroDivisori = countDivisors(triangleNumbers[trianglePos], primeArray);
			System.out.format(
					"Pos: %,d | Triangle Number = %,d (numDiv = %,d)%n", trianglePos, triangleNumbers[trianglePos], numeroDivisori);
			trianglePos++;
		}
		System.out.format(
				"%n%n *** RISULTATO *** %n"+
				"Triangle Number = %,d (numDiv = %,d)%n", triangleNumbers[trianglePos-1], numeroDivisori);
	}

	protected static int countDivisors(int number, boolean[] primeArray) {
		HashSet<Integer> divisorSet = new HashSet<Integer>();
		divisorSet.add(1);
		divisorSet.add(number);
		
		int remainingPrimes = number;
		int currentPrime = 1;
		do {
			currentPrime = getNextPrime(currentPrime, primeArray);
			divisorSet.addAll(divisorsFromPrime(number, currentPrime, remainingPrimes));
			remainingPrimes = removePrime(remainingPrimes, currentPrime);
			
		} while (remainingPrimes >= currentPrime); 
		return divisorSet.size();
	}

	protected static Set<Integer> divisorsFromPrime(int number, int currentPrime, int remainingPrimes) {
		HashSet<Integer> divisorSet = new HashSet<Integer>();
		for (int i = currentPrime; i <= (remainingPrimes); i+= currentPrime) {
			if ((number % i) == 0) {
				divisorSet.add(i);
			}
		}
		return divisorSet;
	}

	protected static int getNextPrime(int currentPrime, boolean[] primeArray) {
		for (int i = currentPrime+1; i < primeArray.length; i++) {
			if (primeArray[i]) {
				return i;
			}
		}
		return currentPrime+2;	// Maybe not a prime, but we keep moving forward...
	}

	/**
	 * Removes from the remaining prime part of the number all the powers of the specified prime
	 * @param remainingPrimes the remaining prime part of the number 
	 * @param currentPrime the prime to remove from the remaining prime part
	 * @return the prime part remaining after removing all the powers of the specified prime
	 */
	protected static int removePrime(int remainingPrimes, int currentPrime) {
		while ((currentPrime != 1) && (remainingPrimes % currentPrime) == 0) {
			remainingPrimes /= currentPrime;
		}
		return remainingPrimes;
	}

	/**
	 * Builds an array with the n.th triangular number in position n, stopping at the requested position.
	 * @param howManyNumbers The max position to calculate the triangular number for.
	 * @return An array with as many triangular numbers as requested
	 */
	protected static int[] buildArrayOfTriangleNumbers(int howManyNumbers) {
		int[] triangleNumbers = new int[howManyNumbers+1];
		
		for (int i = 1; i < triangleNumbers.length; i++) {
			triangleNumbers[i] = triangleNumbers[i-1] + i; 
		}
		return triangleNumbers;
	}

	
}
