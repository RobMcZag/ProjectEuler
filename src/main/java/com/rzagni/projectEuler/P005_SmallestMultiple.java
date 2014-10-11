package com.rzagni.projectEuler;

import java.math.BigDecimal;
import java.math.BigInteger;

public class P005_SmallestMultiple {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long max = 55L;
		BigInteger prod = BigInteger.ONE;
		for (long i = 2L; i <= max; i++) {
			if (isPrime(i)) {
				System.out.format("%s>", i);
				long maxPower = i;
				while (maxPower * i <= max) {
					maxPower *= i; 
				}
				System.out.format("%s|", maxPower);
				prod = prod.multiply(BigInteger.valueOf(maxPower));
			}
		}
		System.out.format("%n product is %,d%n", prod);
		BigInteger mille = BigInteger.valueOf(1000L);
		int exp = 0;
		while (prod.compareTo(mille) > 0 ) {
			prod = prod.divide(mille);
			exp += 3;
		}
		System.out.format("product is in the order of %,d E %d %n", prod, exp);
	}

	public static boolean isPrime(long n) {
		for (long i = 2; i < n; i++) {
			if(n % i == 0) {
				return false;
			}
		}
		System.out.format("*");
		return true;
	}
}
