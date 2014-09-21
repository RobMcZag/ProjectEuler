package com.rz.projectEuler;

import java.util.Arrays;

public class P008_Largest_product_in_a_series {

	private static String numeroDaScorrere = 
			"73167176531330624919225119674426574742355349194934"+
			"96983520312774506326239578318016984801869478851843"+
			"85861560789112949495459501737958331952853208805511"+
			"12540698747158523863050715693290963295227443043557"+
			"66896648950445244523161731856403098711121722383113"+
			"62229893423380308135336276614282806444486645238749"+
			"30358907296290491560440772390713810515859307960866"+
			"70172427121883998797908792274921901699720888093776"+
			"65727333001053367881220235421809751254540594752243"+
			"52584907711670556013604839586446706324415722155397"+
			"53697817977846174064955149290862569321978468622482"+
			"83972241375657056057490261407972968652414535100474"+
			"82166370484403199890008895243450658541227588666881"+
			"16427171479924442928230863465674813919123162824586"+
			"17866458359124566529476545682848912883142607690042"+
			"24219022671055626321111109370544217506941658960408"+
			"07198403850962455444362981230987879927244284909188"+
			"84580156166097919133875499200524063689912560717606"+
			"05886116467109405077541002256983155200055935729725"+
			"71636269561882670428252483600823257530420752963450";
	
	private static int numeroCifreDaMoltiplicare = 13;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Current scanning point
		int[] cifre = new int[numeroCifreDaMoltiplicare];
		Arrays.fill(cifre, 1);  // should put the real digits, but if result is > 0 then it is fine all 1s
		long prod = 1;
		
		// Keep current solution
		long maxProd = 0;
		int posMax = 0;
		int[] cifreMax = null;
		
		for (int i = 0; i < numeroDaScorrere.length(); i++) { 

			int pos = i % numeroCifreDaMoltiplicare;
			int cifraIn = Integer.valueOf(numeroDaScorrere.substring(i, i+1));
			int cifraOut = cifre[pos];
			cifre[pos] = cifraIn;

			if (cifraOut == 0) {
				prod = 1;
				for (int j = 0; j < cifre.length; j++) {
					prod *= cifre[j];
				}
			} else {
				prod = prod / cifraOut * cifraIn;
			}
			
			if (prod > maxProd) {
				maxProd = prod;
				cifreMax = Arrays.copyOf(cifre, cifre.length);
				posMax = pos;
			}
			
		} // for
		System.out.format("Max is %s", maxProd);
		
		String moltiplicazione = "";
		for (int i = 0; i < cifreMax.length; i++) {
			if (i <= posMax) {
				moltiplicazione = moltiplicazione + cifreMax[i];
				if (i < posMax) {
					moltiplicazione = moltiplicazione + " x ";
				}
			} else {
				moltiplicazione = cifreMax[i] + " x " + moltiplicazione ;
			}
		}
		System.out.format(" from %s", moltiplicazione);
		
	}

}
