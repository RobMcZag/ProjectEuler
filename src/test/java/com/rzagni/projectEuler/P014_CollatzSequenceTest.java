package com.rzagni.projectEuler;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class P014_CollatzSequenceTest {

	public P014_CollatzSequenceTest() {
	}

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test(expected=IllegalArgumentException.class)
	public void testCollatzOfZero() {

		P014_CollatzSequence.getNextCollatzValue(0);
		fail("Should throw an IllegalArgumentException!");
	}
	@Test
	public void testCollatzValues() {

		assertEquals(1 , P014_CollatzSequence.getNextCollatzValue(1));
		assertEquals(1 , P014_CollatzSequence.getNextCollatzValue(2));
		assertEquals(10 , P014_CollatzSequence.getNextCollatzValue(3));
		assertEquals(2 , P014_CollatzSequence.getNextCollatzValue(4));
		assertEquals(16 , P014_CollatzSequence.getNextCollatzValue(5));
		assertEquals(3 , P014_CollatzSequence.getNextCollatzValue(6));
		assertEquals(22 , P014_CollatzSequence.getNextCollatzValue(7));
		assertEquals(4 , P014_CollatzSequence.getNextCollatzValue(8));
		
	}

	@Test(expected=IllegalArgumentException.class)
	public void testCollatzSequenceLenghtOfZero() {

		P014_CollatzSequence.getCollatzSequenceLenght(0);
		fail("Should throw an IllegalArgumentException!");
	}
	@Test
	public void testCollatzSequenceLenght() {
		assertEquals(1 , P014_CollatzSequence.getCollatzSequenceLenght(1));
		assertEquals(2 , P014_CollatzSequence.getCollatzSequenceLenght(2));
		assertEquals(8 , P014_CollatzSequence.getCollatzSequenceLenght(3));
		assertEquals(3 , P014_CollatzSequence.getCollatzSequenceLenght(4));
		assertEquals(6 , P014_CollatzSequence.getCollatzSequenceLenght(5));
		assertEquals(9 , P014_CollatzSequence.getCollatzSequenceLenght(6));
		assertEquals(20 , P014_CollatzSequence.getCollatzSequenceLenght(9));
		assertEquals(10 , P014_CollatzSequence.getCollatzSequenceLenght(13));
	}

	@Test(expected=IllegalArgumentException.class)
	public void testFindMaxCollatzSequenceLenghtOfZero() {

		P014_CollatzSequence.findMaxCollatzSequenceLenght(0);
		fail("Should throw an IllegalArgumentException!");
	}
	@Test
	public void testFindMaxCollatzSequenceLenght() {
		assertEquals(1 , P014_CollatzSequence.findMaxCollatzSequenceLenght(1));
		assertEquals(2 , P014_CollatzSequence.findMaxCollatzSequenceLenght(2));
		assertEquals(3 , P014_CollatzSequence.findMaxCollatzSequenceLenght(3));
		assertEquals(3 , P014_CollatzSequence.findMaxCollatzSequenceLenght(4));
		assertEquals(6 , P014_CollatzSequence.findMaxCollatzSequenceLenght(6));
		assertEquals(9 , P014_CollatzSequence.findMaxCollatzSequenceLenght(13));
		
	}
	
}
