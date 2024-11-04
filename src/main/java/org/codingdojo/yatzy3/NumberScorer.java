package org.codingdojo.yatzy3;

import java.util.List;

public class NumberScorer implements Scorer{
	
    private final int number;

    public NumberScorer(int number) {
        this.number = number;
    }

    @Override
    public int calculateScore(List<Integer> dice) {
        return ScoringUtils.frequencies(dice).get(number) * number;
    }
}
