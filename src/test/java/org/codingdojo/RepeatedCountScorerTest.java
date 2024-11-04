package org.codingdojo;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.codingdojo.yatzy3.RepeatedCountScorer;
import org.junit.Test;

public class RepeatedCountScorerTest {
	
	@Test
	public void testCalculateScore() {
		
		RepeatedCountScorer pairScorer = new RepeatedCountScorer(2);
		assertEquals(4, pairScorer.calculateScore(Arrays.asList(2, 2, 3, 4, 5)));
		assertEquals(6, pairScorer.calculateScore(Arrays.asList(3, 3, 3, 4, 5)));
	}

}
