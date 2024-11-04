package org.codingdojo;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.codingdojo.yatzy3.YatzyPointsScorer;
import org.junit.Test;

public class YatzyPointsScorerTest {
	
	@Test
	public void testCalculateScore() {
		
		YatzyPointsScorer scorer = new YatzyPointsScorer();
		assertEquals(50, scorer.calculateScore(Arrays.asList(1, 1, 1, 1, 1))); 
		assertEquals(0, scorer.calculateScore(Arrays.asList(1, 2, 3, 4, 5))); 
		assertEquals(50, scorer.calculateScore(Arrays.asList(6, 6, 6, 6, 6)));
	}

}
