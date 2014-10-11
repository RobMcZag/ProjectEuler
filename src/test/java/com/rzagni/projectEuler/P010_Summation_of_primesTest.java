package com.rzagni.projectEuler;

import static org.junit.Assert.*;

import org.junit.Test;

public class P010_Summation_of_primesTest {

	public P010_Summation_of_primesTest() {
	}

	@Test
	public void testSumPrimesLowerThanXXX() {
		assertEquals(0, P010_Summation_of_primes.sumPrimes(0L));

		assertEquals(0, P010_Summation_of_primes.sumPrimes(1L));

		assertEquals(2, P010_Summation_of_primes.sumPrimes(2L));

		assertEquals(2+3, P010_Summation_of_primes.sumPrimes(3L));

		assertEquals(2+3+5, P010_Summation_of_primes.sumPrimes(5L));

		assertEquals(17, P010_Summation_of_primes.sumPrimes(10L));

		assertEquals((17+11+13+17+19), P010_Summation_of_primes.sumPrimes(20L));
}

	@Test
	public void testIsPrime() {
		// Zero is not prime
		assertFalse(P010_Summation_of_primes.isPrime(0));
		
		// One is not prime
		assertFalse(P010_Summation_of_primes.isPrime(1));
		
		// Two is prime
		assertTrue(P010_Summation_of_primes.isPrime(2));
		
		// Tre is prime
		assertTrue(P010_Summation_of_primes.isPrime(3));
		
		// Four is not prime
		assertFalse(P010_Summation_of_primes.isPrime(4));
		
		// Five is prime
		assertTrue(P010_Summation_of_primes.isPrime(5));
		
		// Six is not prime
		assertFalse(P010_Summation_of_primes.isPrime(6));
		
		// Seven is prime
		assertTrue(P010_Summation_of_primes.isPrime(7));
		
		// Eleven is prime
		assertTrue(P010_Summation_of_primes.isPrime(11));
		
		// 23 is prime
		assertTrue(P010_Summation_of_primes.isPrime(23));
		
		// 7*11 is not prime
		assertFalse(P010_Summation_of_primes.isPrime(7*11));
		
		// 3559 is prime
		assertTrue(P010_Summation_of_primes.isPrime(3559));
		
		// 3571 is prime
		assertTrue(P010_Summation_of_primes.isPrime(3571));
		
		// 16769023 is prime
		assertTrue(P010_Summation_of_primes.isPrime(16769023));
		
		// 1073676287 is prime
		assertTrue(P010_Summation_of_primes.isPrime(1073676287));
		
		// 3559 +1 is NOT prime
		assertFalse(P010_Summation_of_primes.isPrime(3559 +1 ));

		// 3559 -1 is NOT prime
		assertFalse(P010_Summation_of_primes.isPrime(3559 -1 ));

		// (3559*3559) +1 is NOT prime
		assertFalse(P010_Summation_of_primes.isPrime( (3559*3559) +1) );
		
		// 349 is prime
		assertTrue(P010_Summation_of_primes.isPrime(349));
				
	}

	@Test
	public void testIsPrimeFast() {
		// Zero is not prime
		assertFalse(P010_Summation_of_primes.isPrimeFast(0));
		
		// One is not prime
		assertFalse(P010_Summation_of_primes.isPrimeFast(1));
		
		// Two is prime
		assertTrue(P010_Summation_of_primes.isPrimeFast(2));
		
		// Tre is prime
		assertTrue(P010_Summation_of_primes.isPrimeFast(3));
		
		// Four is not prime
		assertFalse(P010_Summation_of_primes.isPrimeFast(4));
		
		// Five is prime
		assertTrue(P010_Summation_of_primes.isPrimeFast(5));
		
		// Six is not prime
		assertFalse(P010_Summation_of_primes.isPrimeFast(6));
		
		// Seven is prime
		assertTrue(P010_Summation_of_primes.isPrimeFast(7));
		
		// Eleven is prime
		assertTrue(P010_Summation_of_primes.isPrimeFast(11));
		
		// 23 is prime
		assertTrue(P010_Summation_of_primes.isPrimeFast(23));
		
		// 7*11 is not prime
		assertFalse(P010_Summation_of_primes.isPrimeFast(7*11));
		
		// 3559 is prime
		assertTrue(P010_Summation_of_primes.isPrimeFast(3559));
		
		// 3571 is prime
		assertTrue(P010_Summation_of_primes.isPrimeFast(3571));
		
		// 16769023 is prime
		assertTrue(P010_Summation_of_primes.isPrimeFast(16769023));
		
		// 1073676287 is prime
		assertTrue(P010_Summation_of_primes.isPrimeFast(1073676287));
		
		// 3559 +1 is NOT prime
		assertFalse(P010_Summation_of_primes.isPrimeFast(3559 +1 ));

		// 3559 -1 is NOT prime
		assertFalse(P010_Summation_of_primes.isPrimeFast(3559 -1 ));

		// (3559*3559) +1 is NOT prime
		assertFalse(P010_Summation_of_primes.isPrimeFast( (3559*3559) +1) );
		
		// 349 is prime
		assertTrue(P010_Summation_of_primes.isPrimeFast(349));
				
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

}
