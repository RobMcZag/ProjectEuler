package com.rzagni.projectEuler;

public class P014_CollatzSequence {

	public P014_CollatzSequence() {
	}

	/**
	 * Calculates next Collatz number from this number.
	 * @param n The number to calculate the next Collatz number.
	 * @return The next Collatz number from this number.
	 */
	public static long getNextCollatzValue(long n) {
		checkInputIsGreaterThanZero(n);
		if (isEven(n)) {
			return n / 2;
		} else {
			return n == 1 ? 1 : 3 * n + 1;
		}
		
	}

	private static boolean isEven(long n) {
		return (n % 2) == 0;
	}

	/**
	 * Calculates the length of the Collatz sequence generated from this number.
	 * @param n The number to calculate the length of the Collatz sequence.
	 * @return The length of the Collatz sequence generated from this number.
	 */
	public static int getCollatzSequenceLenght(int n) {
		checkInputIsGreaterThanZero(n);
		int len = 1;
		long nextVal = n;
		while (nextVal > 1) {
			nextVal = getNextCollatzValue(nextVal);
			len++;
		}
		return len;
	}

	/**
	 * Checks if the parameter passed is greater than zero.
	 * @param n The parameter to be checked.
	 * @throws IllegalArgumentException if the parameter is not valid.
	 */
	protected static void checkInputIsGreaterThanZero(long n) throws IllegalArgumentException {
		if (n < 1) {
			throw new IllegalArgumentException("Number should be greter than 0");
		}
	}

	/**
	 * Finds the number, lower or equal than the one passed, that generates the longest Collatz sequence.
	 * @param n The number to start looking for the longest Collatz sequence.
	 * @return The length that generates the longest Collatz sequence.
	 */
	public static int findMaxCollatzSequenceLenght(int n) {
		checkInputIsGreaterThanZero(n);
		int maxLength = 0;
		int maxLengthNumber = 0;		
		for (int i = 1; i <= n; i++) {
			int len = getCollatzSequenceLenght(i);
			if (len > maxLength) {
				maxLength = len;
				maxLengthNumber = i;
				System.out.format("Nex MAX length is %s for N = %s%n", maxLength, maxLengthNumber);
			}
		}
		return maxLengthNumber;
	}

	public static void main(String[] args) {
		int n = findMaxCollatzSequenceLenght(1000000);
		System.out.format("MAX length is %s for N = %s%n", getCollatzSequenceLenght(n), n);
	}
}

