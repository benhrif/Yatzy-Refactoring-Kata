package org.codingdojo.yatzy3;

import java.util.List;

public class ChanceScorer implements Scorer{
	
    @Override
    public int calculateScore(List<Integer> dice) {
        return ScoringUtils.sum(dice);
    }
}
