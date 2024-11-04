package org.codingdojo;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.codingdojo.yatzy3.ChanceScorer;
import org.junit.Test;

public class ChanceScorerTest {
	
	@Test
	public void testCalculateScore() {
		
		ChanceScorer scorer = new ChanceScorer();
		assertEquals(15, scorer.calculateScore(Arrays.asList(2,3,4,5,1)));
		assertEquals(16, scorer.calculateScore(Arrays.asList(3,3,4,5,1))); 
	}

}
