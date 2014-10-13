package com.rzagni.projectEuler;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class P010_Summation_of_primesTest {

	@Test
	public void amIAssumingItRight() {
		assertEquals(2, (int) Math.sqrt(5));
		assertEquals(4, (int) Math.sqrt(24));
		assertEquals(5, (int) Math.sqrt(25));
	}

	@Test
	public void testSumPrimesLowerThanXXX() {
		assertEquals(0, P010_Summation_of_primes.sumPrimes(0));

		assertEquals(0, P010_Summation_of_primes.sumPrimes(1));

		assertEquals(2, P010_Summation_of_primes.sumPrimes(2));

		assertEquals(2+3, P010_Summation_of_primes.sumPrimes(3));

		assertEquals(2+3+5, P010_Summation_of_primes.sumPrimes(5));

		assertEquals(17, P010_Summation_of_primes.sumPrimes(10));

		assertEquals((17+11+13+17+19), P010_Summation_of_primes.sumPrimes(20));
		
		//assertEquals(8720682138632L, P010_Summation_of_primes.sumPrimes(16769023));

}

	@Test
	public void testSumPrimesSiege() {
		assertEquals(0, P010_Summation_of_primes.sumPrimesSiege(0));

		assertEquals(0, P010_Summation_of_primes.sumPrimesSiege(1));

		assertEquals(2, P010_Summation_of_primes.sumPrimesSiege(2));

		assertEquals(2+3, P010_Summation_of_primes.sumPrimesSiege(3));

		assertEquals(2+3+5, P010_Summation_of_primes.sumPrimesSiege(5));

		assertEquals(17, P010_Summation_of_primes.sumPrimesSiege(10));

		assertEquals((17+11+13+17+19), P010_Summation_of_primes.sumPrimesSiege(20));
		
		//assertEquals(8720682138632L, P010_Summation_of_primes.sumPrimesSiege(16769023));
		
}

	@Test
	public void testIsPrimeAdaptative() {
		// Zero is not prime
		assertFalse(P010_Summation_of_primes.isPrimeAdaptative(0));
		
		// One is not prime
		assertFalse(P010_Summation_of_primes.isPrimeAdaptative(1));
		
		// Two is prime
		assertTrue(P010_Summation_of_primes.isPrimeAdaptative(2));
		
		// Tre is prime
		assertTrue(P010_Summation_of_primes.isPrimeAdaptative(3));
		
		// Four is not prime
		assertFalse(P010_Summation_of_primes.isPrimeAdaptative(4));
		
		// Five is prime
		assertTrue(P010_Summation_of_primes.isPrimeAdaptative(5));
		
		// Six is not prime
		assertFalse(P010_Summation_of_primes.isPrimeAdaptative(6));
		
		// Seven is prime
		assertTrue(P010_Summation_of_primes.isPrimeAdaptative(7));
		
		// Eleven is prime
		assertTrue(P010_Summation_of_primes.isPrimeAdaptative(11));
		
		// 23 is prime
		assertTrue(P010_Summation_of_primes.isPrimeAdaptative(23));
		
		// 7*11 is not prime
		assertFalse(P010_Summation_of_primes.isPrimeAdaptative(7*11));
		
		// 3559 is prime
		assertTrue(P010_Summation_of_primes.isPrimeAdaptative(3559));
		
		// 3571 is prime
		assertTrue(P010_Summation_of_primes.isPrimeAdaptative(3571));
		
		// 16769023 is prime
		assertTrue(P010_Summation_of_primes.isPrimeAdaptative(16769023));
		
		// 1073676287 is prime
		assertTrue(P010_Summation_of_primes.isPrimeAdaptative(1073676287));
		
		// 3559 +1 is NOT prime
		assertFalse(P010_Summation_of_primes.isPrimeAdaptative(3559 +1 ));

		// 3559 -1 is NOT prime
		assertFalse(P010_Summation_of_primes.isPrimeAdaptative(3559 -1 ));

		// (3559*3559) +1 is NOT prime
		assertFalse(P010_Summation_of_primes.isPrimeAdaptative( (3559*3559) +1) );
		
		// 349 is prime
		assertTrue(P010_Summation_of_primes.isPrimeAdaptative(349));
				
	}

	@Test
	public void testIsPrimeSqrt() {
		// Zero is not prime
		assertFalse(P010_Summation_of_primes.isPrimeSqrt(0));
		
		// One is not prime
		assertFalse(P010_Summation_of_primes.isPrimeSqrt(1));
		
		// Two is prime
		assertTrue(P010_Summation_of_primes.isPrimeSqrt(2));
		
		// Tre is prime
		assertTrue(P010_Summation_of_primes.isPrimeSqrt(3));
		
		// Four is not prime
		assertFalse(P010_Summation_of_primes.isPrimeSqrt(4));
		
		// Five is prime
		assertTrue(P010_Summation_of_primes.isPrimeSqrt(5));
		
		// Six is not prime
		assertFalse(P010_Summation_of_primes.isPrimeSqrt(6));
		
		// Seven is prime
		assertTrue(P010_Summation_of_primes.isPrimeSqrt(7));
		
		// Eleven is prime
		assertTrue(P010_Summation_of_primes.isPrimeSqrt(11));
		
		// 23 is prime
		assertTrue(P010_Summation_of_primes.isPrimeSqrt(23));
		
		// 7*11 is not prime
		assertFalse(P010_Summation_of_primes.isPrimeSqrt(7*11));
		
		// 3559 is prime
		assertTrue(P010_Summation_of_primes.isPrimeSqrt(3559));
		
		// 3571 is prime
		assertTrue(P010_Summation_of_primes.isPrimeSqrt(3571));
		
		// 16769023 is prime
		assertTrue(P010_Summation_of_primes.isPrimeSqrt(16769023));
		
		// 1073676287 is prime
		assertTrue(P010_Summation_of_primes.isPrimeSqrt(1073676287));
		
		// 3559 +1 is NOT prime
		assertFalse(P010_Summation_of_primes.isPrimeSqrt(3559 +1 ));

		// 3559 -1 is NOT prime
		assertFalse(P010_Summation_of_primes.isPrimeSqrt(3559 -1 ));

		// (3559*3559) +1 is NOT prime
		assertFalse(P010_Summation_of_primes.isPrimeSqrt( (3559*3559) +1) );
		
		// 349 is prime
		assertTrue(P010_Summation_of_primes.isPrimeSqrt(349));
				
	}

	@Test
	public void testIsEven() {
		// Zero is Even
		assertTrue(P010_Summation_of_primes.isEven(0));
		
		// One is not Even
		assertFalse(P010_Summation_of_primes.isEven(1));
		
		// Two is Even
		assertTrue(P010_Summation_of_primes.isEven(2));
		
		// Tre is not Even
		assertFalse(P010_Summation_of_primes.isEven(3));
		
		// Four is Even
		assertTrue(P010_Summation_of_primes.isEven(4));
		
		// Five is not Even
		assertFalse(P010_Summation_of_primes.isEven(5));
		
		// 100 is Even
		assertTrue(P010_Summation_of_primes.isEven(100));
		
		// 101 is not Even
		assertFalse(P010_Summation_of_primes.isEven(101));
		
	}

	@Test
	public void testRuleOutZeroAndOne() {
		boolean[] array = new boolean[5];
		Arrays.fill(array, true);
		P010_Summation_of_primes.ruleOutZeroAndOne(array);
		
		assertFalse(array[0]);
		assertFalse(array[1]);
	}

	@Test
	public void testRuleOutEvenOverTwo() {
		boolean[] array = new boolean[100];
		Arrays.fill(array, true);

		P010_Summation_of_primes.ruleOutEvenOverTwo(array);		
		assertTrue(array[2]);
		assertFalse(array[4]);
		assertFalse(array[8]);
		assertFalse(array[50]);
		assertFalse(array[98]);
	}

	@Test
	public void testRuleOutMultiplesOfPrimThree() {
		boolean[] array = new boolean[100];
		Arrays.fill(array, true);

		P010_Summation_of_primes.ruleOutMultiplesOfPrime(3, array);		
		assertTrue(array[3]);
		assertTrue(array[6]);	// We just rule out odd multiples of the prime
		assertFalse(array[9]);	
		assertFalse(array[93]);	// 3 * 31
		assertTrue(array[96]);	// We just rule out odd multiples of the prime
	}

	@Test
	public void testRuleOutMultiplesOfPrimeEleven() {
		boolean[] array = new boolean[1000];
		Arrays.fill(array, true);

		P010_Summation_of_primes.ruleOutMultiplesOfPrime(11, array);		
		assertTrue(array[11]);
		assertTrue(array[22]);			// 11 *  2 We just rule out odd multiples of the prime
		assertTrue(array[33]);			// 11 *  3 Should be ruled out when ruling out 3
		assertFalse(array[121]);		// 11 * 11 The first number to be ruled out
		assertTrue(array[121+11]);		// 11 * 12 We just rule out odd multiples of the prime
		assertFalse(array[121+11+11]);	// 11 * 13 
	}

	@Test
	public void testBuildArrayOfPrimes() {
		boolean[] array = P010_Summation_of_primes.buildArrayOfPrimes(1000);
		
		assertTrue(array[2]);
		assertTrue(array[3]);
		assertTrue(array[5]);
		assertTrue(array[7]);
		assertTrue(array[11]);
		assertTrue(array[31]);	// sqrt(1000) = 31.xxx
		
		assertFalse(array[4]);
		assertFalse(array[30]);
	}

	@Test
	public void testIsPrimeSiege() {
		//boolean[] isPrime = P010_Summation_of_primes.buildArrayOfPrimes(2000000);	// 1073676287 is too much, no heap
			
		// Zero is not prime
		assertFalse(P010_Summation_of_primes.isPrimeSiege(0));
		
		// One is not prime
		assertFalse(P010_Summation_of_primes.isPrimeSiege(1));
		
		// Two is prime
		assertTrue(P010_Summation_of_primes.isPrimeSiege(2));
		
		// Tre is prime
		assertTrue(P010_Summation_of_primes.isPrimeSiege(3));
		
		// Four is not prime
		assertFalse(P010_Summation_of_primes.isPrimeSiege(4));
		
		// Five is prime
		assertTrue(P010_Summation_of_primes.isPrimeSiege(5));
		
		// Six is not prime
		assertFalse(P010_Summation_of_primes.isPrimeSiege(6));
		
		// Seven is prime
		assertTrue(P010_Summation_of_primes.isPrimeSiege(7));
		
		// Eleven is prime
		assertTrue(P010_Summation_of_primes.isPrimeSiege(11));
		
		// 23 is prime
		assertTrue(P010_Summation_of_primes.isPrimeSiege(23));
		
		// 7*11 is not prime
		assertFalse(P010_Summation_of_primes.isPrimeSiege(7*11));
		
		// 3559 is prime
		assertTrue(P010_Summation_of_primes.isPrimeSiege(3559));
		
		// 3571 is prime
		assertTrue(P010_Summation_of_primes.isPrimeSiege(3571));
		
		// 16769023 is prime
		assertTrue(P010_Summation_of_primes.isPrimeSiege(16769023));
		
		// 1073676287 is prime
		//assertTrue(P010_Summation_of_primes.isPrimeSiege(1073676287)); // NO HEAP SPACE 1.073.676.287
		
		// 3559 +1 is NOT prime
		assertFalse(P010_Summation_of_primes.isPrimeSiege(3559 +1 ));

		// 3559 -1 is NOT prime
		assertFalse(P010_Summation_of_primes.isPrimeSiege(3559 -1 ));

		// (3559*3559) +1 is NOT prime
		assertFalse(P010_Summation_of_primes.isPrimeSiege( (3559*3559) +1));
		
		// 349 is prime
		assertTrue(P010_Summation_of_primes.isPrimeSiege(349));
				
	}

}
