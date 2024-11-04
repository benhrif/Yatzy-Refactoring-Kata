package org.codingdojo;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.codingdojo.yatzy3.TwoPairsScorer;
import org.junit.Test;

public class TwoPairsScorerTest {
	
	@Test
	public void testCalculateScore() {
		
		TwoPairsScorer scorer = new TwoPairsScorer();
		assertEquals(16, scorer.calculateScore(Arrays.asList(3,3,5,4,5))); 
		assertEquals(16, scorer.calculateScore(Arrays.asList(3,3,5,5,5))); 

}
}
