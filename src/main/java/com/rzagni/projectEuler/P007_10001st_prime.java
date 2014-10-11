package com.rzagni.projectEuler;

public class P007_10001st_prime {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//int MAX = 9; 
		int MAX = 10001;
		
		System.out.format("%s|", 2);
		int countPrimes = 1;
		
		int currentNumber = 3;
		
		while( countPrimes < MAX) {
			if (isPrime(currentNumber)) {
				countPrimes++;
				System.out.format("%s|", currentNumber);
			}
			if (countPrimes == MAX) {
				break;
			}
			currentNumber += 2;
		}
		
		System.out.format("%n%nCount %s| Prime is: %s%n", countPrimes, currentNumber);

	}

	private static boolean isPrime(int n) {
		for (int i = 2; (i * i) <= n; i++) {
			if ( (n % i ) == 0) {
				return false;
			}
		}
		return true;
	}

}
