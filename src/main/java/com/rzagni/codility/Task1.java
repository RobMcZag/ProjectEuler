package com.rzagni.codility;

public class Task1 {

	
    public int solution(int[] A) {
    	
    	int minDist = 1000000;
    	for (int i = 0; i < A.length; i++) {
    		for (int j = i+1; j < A.length; j++) {
    			int d = distance(A[i], A[j]);
    			if (d == 0) {
    				return 0;
    			}
				if (d < minDist) {
					minDist = d;
				}
			}
		}
    	return minDist;
    }
    
    public int distance( int a, int b) {
    	int d = a - b;
    	if (d >= 0) {
    		return d;
    	}
    	return -d;
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] array1 = {8, 24, 3, 20, 1, 17};
		int[] array2 = {7, 21, 3, 42, 3, 7};
		
		Task1 solver = new Task1();
	
		System.out.format(
				"d (123,1123) = %s%n",
				solver.distance(123, 1123)
				);
		
		System.out.format(
				"Solution 1 is: %s %n",
				solver.solution(array1)
			);

		System.out.format(
				"Solution 2 is: %s %n",
				solver.solution(array2)
			);
	}

}
