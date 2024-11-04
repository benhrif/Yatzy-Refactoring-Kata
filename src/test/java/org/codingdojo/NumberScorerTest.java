package org.codingdojo;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.codingdojo.yatzy3.NumberScorer;
import org.junit.Test;

public class NumberScorerTest {
	
	@Test
	public void testCalculateScore() {
		
		NumberScorer onesScorer = new NumberScorer(1);
		assertEquals(2, onesScorer.calculateScore(Arrays.asList(1, 1, 2, 3, 4))); 
		assertEquals(0, onesScorer.calculateScore(Arrays.asList(2, 2, 3, 3, 4))); 
	}

}
