package com.rzagni.projectEuler;

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
			if (isPrimeFast(i)){
				sum += i;
			}
		}
		return sum;
	}
	
	protected static boolean isPrime(long number) {
		
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

	protected static boolean isPrimeFast(long number) {
		
		if (number == 1) {
			return false;
		}
		
		if (isEven(number)) {
			return (number == 2) ? true : false;
		}
		
		int numSqrt = (int) Math.sqrt(number);
		
		for (long i = 3; i <= (numSqrt); i+=2) {
			if ((number % i) == 0 ) {
				return false;
			}
		}
		return true;
	}

	protected static boolean isEven(long number) {
		return (number % 2) == 0;
	}
	
}
