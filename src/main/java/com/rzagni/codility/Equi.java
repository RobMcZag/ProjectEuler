package com.rzagni.codility;

public class Equi {

    public int solution(int[] A) {
        // write your code in Java SE 8
    	for (int i = 0; i < A.length; i++) {
			int left = sum(A, 0, i);	// 
			int right = sum(A, i+1, A.length);
			System.out.format("%s | (% d)  (% d)%n", i, left, right);
			if (left == right) {
				return i;
			}
		}
    	return -1;
    }

    public int sum(int[] A, int start, int stop) {
    	int sum = 0;
    	for (int i = start; i < stop; i++) {
			sum += A[i];
		}
    	return sum;
    }
    
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] array = {-1, 2, -6, 5, 1, -6, 2, 1};
		//int[] array = {-1, 3, -4, 5, 1, -6, 2, 1};
		Equi solver = new Equi();
		int sol = solver.solution(array);
		
		System.out.format("Solution is: %s %n", sol);
	}

}
