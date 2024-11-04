package org.codingdojo;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.codingdojo.yatzy3.Yatzy3;
import org.junit.Before;
import org.junit.Test;

public class YatzyIntegrationTest {
	
	private Yatzy3 yatzy;

	@Before
	public void setUp() {
		yatzy = new Yatzy3();
	}

	@Test
	public void testScoreCalculationForChance() {
		List<Integer> dice = Arrays.asList(2, 3, 4, 5, 1);
		int score = yatzy.score(dice, "CHANCE");
		assertEquals(15, score); 
	}

	@Test
	public void testScoreCalculationForYatzy() {
		List<Integer> dice = Arrays.asList(6, 6, 6, 6, 6);
		int score = yatzy.score(dice, "YATZY");
		assertEquals(50, score); 
	}

	@Test
	public void testScoreCalculationForFullHouse() {
		List<Integer> dice = Arrays.asList(6,2,2,2,6);
		int score = yatzy.score(dice, "FULL_HOUSE");
		assertEquals(18, score); 
	}

	@Test
	public void testScoreCalculationForTwoPairs() {
		List<Integer> dice = Arrays.asList(3, 3, 4, 4, 5);
		int score = yatzy.score(dice, "TWO_PAIRS");
		assertEquals(14, score); 
	}

}
