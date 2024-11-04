package org.codingdojo;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.codingdojo.yatzy3.Yatzy3;
import org.junit.Before;
import org.junit.Test;

public class YatzyEndToEndTest {
	
	private Yatzy3 yatzy;

	@Before
	public void setUp() {
	yatzy = new Yatzy3();
	}

	@Test
	public void testFullGamePlay() {

	int totalScore = 0;

	// Tour 1 : Chance
	List<Integer> dice1 = Arrays.asList(3,3,4,5,1);
	totalScore += yatzy.score(dice1, "CHANCE");

	// Tour 2 : Yatzy
	List<Integer> dice2 = Arrays.asList(6, 6, 6, 6, 6);
	totalScore += yatzy.score(dice2, "YATZY");

	// Tour 3 : Full House
	List<Integer> dice3 = Arrays.asList(6,2,2,2,6);
	totalScore += yatzy.score(dice3, "FULL_HOUSE");

	// Tour 4 : Two Pairs
	List<Integer> dice4 = Arrays.asList(3,3,5,4,5);
	totalScore += yatzy.score(dice4, "TWO_PAIRS");

	// Vérifier le score total
	assertEquals(16 + 50 + 18 + 16, totalScore);
	}

}
