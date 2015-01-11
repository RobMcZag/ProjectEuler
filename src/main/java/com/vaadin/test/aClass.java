package com.vaadin.test;

import javax.swing.text.StyleContext.SmallAttributeSet;

public class aClass {
	// An array of positive integers is given. 
	// Implement a function that
	// returns the smallest sum of pairs in the array, so that
	// - Neither number in the pair can be the first or last number in the array
	// - The numbers can't be next to each other in the array
	public static void main(String[] args) {
	 int[] chain = new int[] { 1, 2, 3, 9, 6, 4, 7 };
	 
	 System.out.println(smallestSum(chain)); // What should this print?
	}
	
	static int smallestSum(int[] numbers) {
		
		int minSum = Integer.MAX_VALUE;
		for (int i = 1; i < numbers.length-1; i++) {
			for (int j = i+2; j < numbers.length; j++) {
				int sum = numbers[i]+numbers[j];
				if (sum < minSum) {
					minSum = sum;
				}
			}
		}
		return minSum;
	}
}
