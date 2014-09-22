package com.rzagni.projectEuler;

public class P004_largestPalindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int maxPalindrome = 1;
		for (int i = 100; i <= 999; i++) {
			for (int j = i; j <= 999; j++) {
				if (isPalindrome((long) i * j) && ( i*j > maxPalindrome)) {
					maxPalindrome = i * j;
				}
			}
		}
		System.out.format("%nmaxPalindrome %s%n", maxPalindrome);
	}

	public static boolean isPalindrome(Long n) {
		String number = n.toString();
		int len = number.length();
		for (int i = 0; i < (len / 2); i++) {
			if(number.charAt(i) != number.charAt(len-i-1)) {
				return false;
			}
		}
		System.out.format("|%s", number);
		return true;
	}
}
