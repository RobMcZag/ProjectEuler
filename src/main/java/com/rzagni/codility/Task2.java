package com.rzagni.codility;

/**
* A chessboard of size N * M (i.e. N rows and M columns) is given. Each field
* of the chessboard can be indexed using a pair of integers (P, Q) where and .
*
* On each field of the chessboard there lies a number of rice grains. A pawn is
* initially located at field (0, 0). It can perform two kinds of moves:
*
* - move from field (P, Q) to field (P+1, Q) or - move from field (P, Q) to
* field (P, Q+1). After N+M-2 moves the pawn will arrive at field (N-1, M-1).
* During its movement through the chessboard it collects all the rice grains
* from the fields it stands on.
*
* Write a function that given a matrix of size N * M describing the number of
* rice grains lying on each field of a N * M chessboard returns the maximal
* number of rice grains a pawn can collect while moving from the field (0, 0)
* to the field (N-1, M-1) in the manner specified above. Assume that . Assume
* that each element of the matrix is a non-negative integer not exceeding 200.
*/

public class Task2 {

    public int solution(int[][] A) {
    	
    	int [][] T = new int[A.length][A[0].length];
    	for (int i = 0; i < A.length; i++) {
    		for (int j = 0; j < A[i].length; j++) {
    			if (i > 0 && j > 0) {
    				T[i][j] = A[i][j] + Math.max(T[i - 1][j], T[i][j - 1]);
    			} else if (i == 0 && j > 0) {
    				T[i][j] = A[i][j] + T[i][j - 1];
    			} else if (j == 0 && i > 0) {
    				T[i][j] = A[i][j] + T[i - 1][j];
    			} else if (j == 0 && i == 0) {
    				T[i][j] = A[i][j] ;
    			}
    		}
    	}
    	return T[A.length-1][A[0].length-1];
    }

    public int solution2(int[][] A) {
    	
    	int [][] T = new int[A.length][A[0].length];
    	for (int i = 0; i < A.length; i++) {
    		for (int j = 0; j < A[i].length; j++) {
    				T[i][j] = A[i][j] + Math.max(
    						(i==0) ? 0 : T[i - 1][j], 
    						(j==0) ? 0 : T[i][j - 1]
    						);
    		}
    	}
    	return T[A.length-1][A[0].length-1];
    }

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[][] m1 = { 
				{ 2, 2, 4, 5 }, 
				{ 0, 3, 0, 1 }, 
				{ 1, 2, 2, 1 },
				{ 4, 1, 2, 2 } };
		int[][] m12 = { 
				{ 2, 2, 4, 5 }, 
				{ 0, 3, 0, 1 }, 
				{ 1, 2, 2, 1 },
				{ 4, 1, 2, 2 } };
		int[][] m2 = { 
				{ 2, 2, 3, 0 }, 
				{ 0, 3, 1, 1 }, 
				{ 1, 2, 2, 1 },
				{ 0, 3, 1, 1 }, 
				{ 1, 2, 2, 1 },
				{ 0, 3, 1, 1 }, 
				{ 1, 2, 2, 1 },
				{ 4, 1, 2, 2 } };
		
		Task2 solver = new Task2();

		System.out.format(
				"Solution 1 is: %s %n",
				solver.solution(m1)
			);

		System.out.format(
				"Solution 2 is: %s %n",
				solver.solution2(m1)
			);

		System.out.format(
				"m2[%s][%s] <1> max is %s %n",
				m2.length, m2[0].length, solver.solution(m2) 
				);

		System.out.format(
				"m2[%s][%s] <2> max is %s %n",
				m2.length, m2[0].length, solver.solution2(m2) 
				);
	}

}
