package org.codingdojo.yatzy3;

import java.util.List;

public class YatzyPointsScorer implements Scorer{
	
    @Override
    public int calculateScore(List<Integer> dice) {
        if (ScoringUtils.frequencies(dice).containsValue(5)) {
            return 50;
        }
        return 0;
    }
}
