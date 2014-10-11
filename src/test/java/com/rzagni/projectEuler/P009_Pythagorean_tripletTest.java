package com.rzagni.projectEuler;

import static org.junit.Assert.*;

import org.junit.Test;


public class P009_Pythagorean_tripletTest {

	@Test
	public void shouldBePytagoreanTriplet() {
		assertTrue(P009_Pythagorean_triplet.isPytagoreanTriplet(0, 0, 0));
		
		assertTrue(P009_Pythagorean_triplet.isPytagoreanTriplet(3, 4, 5));
		
		assertTrue(P009_Pythagorean_triplet.isPytagoreanTriplet(200, 375, 425));
	}

	@Test
	public void shouldNotBePytagoreanTriplet() {
		assertFalse(P009_Pythagorean_triplet.isPytagoreanTriplet(0, 1, 2));
		
		assertFalse(P009_Pythagorean_triplet.isPytagoreanTriplet(3, 3, 5));
		
		assertFalse(P009_Pythagorean_triplet.isPytagoreanTriplet(201, 375, 425));
	}

}
