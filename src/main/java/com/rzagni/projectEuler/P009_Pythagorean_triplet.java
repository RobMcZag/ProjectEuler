package com.rzagni.projectEuler;

import java.math.BigInteger;

public class P009_Pythagorean_triplet {

	/**
	 * Pitagorean triplet
	 * a^2 + b^2 = c^2
	 *  a < b < c
	 *  
	 *  Vincolo di specialità
	 *  a+b+c = 1000
	 *  
	 *  da queste due deriva che
	 *  3a < a+b+c = 1000 
	 *  a < 1000 / 3 = 333
	 *  
	 *  Complicandoci di più la vita
	 *  0 < a^2 < (c^2 / 2) = (1000 -a -b)^2 / 2 
	 *  a < (1000 -a -b) / sqrt(2)
	 *  a < (1000 -2a) / sqrt(2) 
	 *  a < 1000 / (2+sqrt(2)) = 292
	 *  
	 *  Per b abbiamo 
	 *  b < c < 1000   e c = 1000 -a -b
	 *  Bmax si ha per b = c
	 *  Bmax < 1000 -a -Bmax
	 *  Bmax < (1000 -a) / 2
	 */
	
	private static int SPECIAL_SUM = 1000; //1000000; //148140; //1000;	//3+4+5;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int aMax1 = SPECIAL_SUM / 3;
		int aMax2 = (int) (SPECIAL_SUM / ( 2 + Math.sqrt(2.0)));
		
		for (int a = 1; a <= aMax2; a++) {
			int bMax = (SPECIAL_SUM -a ) / 2;
			for (int b = a+1; b <= bMax; b++) {
				int c = SPECIAL_SUM -a -b;
				if (isPytagoreanTriplet(a, b, c)) {
					//long abc = a*b*c;
					BigInteger abc = BigInteger.valueOf(a).multiply(BigInteger.valueOf(b).multiply(BigInteger.valueOf(c)));
					System.out.format("Pytagorean triplet: %,9d, %,9d, %,9d | a*b*c = %,25d%n", a, b, c, abc);
					//System.exit(0);
				}
			}
			
		}

	}

	/*
	 * Check if it is a Pytagorean Triplet
	 */
	protected static boolean isPytagoreanTriplet(int a, int b, int c) {
		long aa_bb = a*a +b*b;
		long cc = c*c;
		return (aa_bb == cc);
	}

}
