package org.codingdojo;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.codingdojo.yatzy3.StraightScorer;
import org.junit.Test;

public class StraightScorerTest {
	
	@Test
	public void testSmallStraight() {
		
		StraightScorer smallStraightScorer = new StraightScorer(1); 
		assertEquals(15, smallStraightScorer.calculateScore(Arrays.asList(1,2,3,4,5))); 
		assertEquals(15, smallStraightScorer.calculateScore(Arrays.asList(2,3,4,5,1)));
		assertEquals(0, smallStraightScorer.calculateScore(Arrays.asList(1,2,2,4,5)));
		
	}

	@Test
	public void testLargeStraight() {
		
		StraightScorer largeStraightScorer = new StraightScorer(6); 
		assertEquals(20, largeStraightScorer.calculateScore(Arrays.asList(6,2,3,4,5))); 
		assertEquals(20, largeStraightScorer.calculateScore(Arrays.asList(2,3,4,5,6))); 
		assertEquals(0, largeStraightScorer.calculateScore(Arrays.asList(1,2,2,4,5))); 
	}

}
