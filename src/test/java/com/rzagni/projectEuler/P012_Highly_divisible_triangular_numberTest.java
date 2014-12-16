package com.rzagni.projectEuler;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.Ignore;
import org.junit.Test;

public class P012_Highly_divisible_triangular_numberTest {

	public P012_Highly_divisible_triangular_numberTest() {
	}

	@Test
	public void testRemovePrime() {
		assertEquals(28, P012_Highly_divisible_triangular_number.removePrime(28, 1));
		
		assertEquals(7, P012_Highly_divisible_triangular_number.removePrime(28, 2));
		assertEquals(1, P012_Highly_divisible_triangular_number.removePrime(7, 7));

		assertEquals(9, P012_Highly_divisible_triangular_number.removePrime(36, 2));
		assertEquals(4, P012_Highly_divisible_triangular_number.removePrime(36, 3));
		assertEquals(1, P012_Highly_divisible_triangular_number.removePrime(9, 3));
	}
	
	@Test
	public void testBuildArrayOfTriangleNumbers() {
		int[] triangNum = P012_Highly_divisible_triangular_number.buildArrayOfTriangleNumbers(10);
		
		assertEquals(11, triangNum.length);
		assertEquals(0, triangNum[0]);
		assertEquals(1, triangNum[1]);
		assertEquals(28, triangNum[7]);
		assertEquals(55, triangNum[10]);
	}
	
	@Test
	public void testGetNextPrime() {
		boolean[] primeArray = P010_Summation_of_primes.buildArrayOfPrimes(30);
		
		assertEquals(3, P012_Highly_divisible_triangular_number.getNextPrime(2, primeArray));
		assertEquals(5, P012_Highly_divisible_triangular_number.getNextPrime(3, primeArray));
		assertEquals(29, P012_Highly_divisible_triangular_number.getNextPrime(23, primeArray));
		assertEquals(29, P012_Highly_divisible_triangular_number.getNextPrime(25, primeArray));
		
	}
	
	@Test
	public void testDivisorsFromPrimeFor28() {
		Set<Integer> divisorSet = P012_Highly_divisible_triangular_number.divisorsFromPrime(28, 2, 28);
		assertEquals(4, divisorSet.size());
		assertTrue(divisorSet.contains(2));
		assertTrue(divisorSet.contains(4));
		assertTrue(divisorSet.contains(14));
		assertTrue(divisorSet.contains(28));

		divisorSet = P012_Highly_divisible_triangular_number.divisorsFromPrime(28, 7, 7);
		assertEquals(1, divisorSet.size());
		assertTrue(divisorSet.contains(7));
	}

	@Test
	public void testDivisorsFromPrimeFor36() {
		Set<Integer> divisorSet = P012_Highly_divisible_triangular_number.divisorsFromPrime(36, 2, 36);
		assertEquals(6, divisorSet.size());
		assertTrue(divisorSet.contains(2));
		assertTrue(divisorSet.contains(4));
		assertTrue(divisorSet.contains(6));
		assertTrue(divisorSet.contains(12));
		assertTrue(divisorSet.contains(18));
		assertTrue(divisorSet.contains(36));

		divisorSet = P012_Highly_divisible_triangular_number.divisorsFromPrime(36, 3, 9);
		assertEquals(3, divisorSet.size());
		assertTrue(divisorSet.contains(3));
		assertTrue(divisorSet.contains(6));
		assertTrue(divisorSet.contains(9));
	}

	@Test
	public void testCountDivisors() {
		boolean[] primeArray = P010_Summation_of_primes.buildArrayOfPrimes(30);
		assertEquals(6, P012_Highly_divisible_triangular_number.countDivisors(28, primeArray));
	}

}
