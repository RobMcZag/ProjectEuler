package com.rzagni.projectEuler;

public class P003_LargestPrimeFactor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//long target = 600851475143L ;
		//long target = 2*3*29*1009*1471*6857L ;
		long target = 906609L; //987789L;
		
		long maxPrime = 1;
		long number = 1;
		
		while ( (++number * number) <= target){
			if (isFactor(target, number) && (isPrime(number))) {
				maxPrime = number;
			}
		}
		
		System.out.format("%nThe max prime is %s%n", maxPrime);
	}

	public static boolean isFactor(long target, long number) {
		if (target % number == 0) {
			System.out.format("|%s", number);
			return true;
		} 
		return false;
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
