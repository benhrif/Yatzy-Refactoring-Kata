package org.codingdojo.yatzy3;

import java.util.List;

public class StraightScorer implements Scorer{
    private final int straightIncludes;

    public StraightScorer(int straightIncludes) {
        this.straightIncludes = straightIncludes;
    }

    boolean isStraight(List<Integer> dice) {
        return ScoringUtils.frequencies(dice).values().stream().filter(f -> f == 1).toList().size() == 5;
    }
    
    @Override
    public int calculateScore(List<Integer> dice) {
        if (isStraight(dice) && ScoringUtils.frequencies(dice).get(straightIncludes) != 0) {
            return ScoringUtils.sum(dice);
        }
        return 0;
    }
}
