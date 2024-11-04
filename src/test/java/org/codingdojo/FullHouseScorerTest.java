package org.codingdojo;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.codingdojo.yatzy3.FullHouseScorer;
import org.junit.Test;

public class FullHouseScorerTest {
	
	@Test
	public void testCalculateScore() {
		
		FullHouseScorer scorer = new FullHouseScorer();
		assertEquals(18, scorer.calculateScore(Arrays.asList(6,2,2,2,6))); 
		assertEquals(0, scorer.calculateScore(Arrays.asList(2,3,4,5,6))); 
		
	}

}
