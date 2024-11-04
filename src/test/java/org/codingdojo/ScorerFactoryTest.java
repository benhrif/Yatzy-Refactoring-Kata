package org.codingdojo;

import static org.junit.Assert.assertThrows;

import org.codingdojo.yatzy3.ScorerFactory;
import org.junit.Test;

public class ScorerFactoryTest {
	
	@Test
	public void testCreateScorerWithInvalidCategory() {
		
		String invalidCategory = "INVALID_CATEGORY";
	
		assertThrows(IllegalArgumentException.class, () -> {
			ScorerFactory.createScorer(invalidCategory);
		});
	}

}
