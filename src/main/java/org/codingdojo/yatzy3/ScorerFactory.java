package org.codingdojo.yatzy3;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

import org.codingdojo.YatzyCategory;

public class ScorerFactory {

	private static final Map<YatzyCategory, Supplier<Scorer>> scorerMap = new HashMap<>();

	static {
		scorerMap.put(YatzyCategory.CHANCE, ChanceScorer::new);
		scorerMap.put(YatzyCategory.YATZY, YatzyPointsScorer::new);
		scorerMap.put(YatzyCategory.ONES, () -> new NumberScorer(1));
		scorerMap.put(YatzyCategory.TWOS, () -> new NumberScorer(2));
		scorerMap.put(YatzyCategory.THREES, () -> new NumberScorer(3));
		scorerMap.put(YatzyCategory.FOURS, () -> new NumberScorer(4));
		scorerMap.put(YatzyCategory.FIVES, () -> new NumberScorer(5));
		scorerMap.put(YatzyCategory.SIXES, () -> new NumberScorer(6));
		scorerMap.put(YatzyCategory.PAIR, () -> new RepeatedCountScorer(2));
		scorerMap.put(YatzyCategory.THREE_OF_A_KIND, () -> new RepeatedCountScorer(3));
		scorerMap.put(YatzyCategory.FOUR_OF_A_KIND, () -> new RepeatedCountScorer(4));
		scorerMap.put(YatzyCategory.SMALL_STRAIGHT, () -> new StraightScorer(1));
		scorerMap.put(YatzyCategory.LARGE_STRAIGHT, () -> new StraightScorer(6));
		scorerMap.put(YatzyCategory.TWO_PAIRS, TwoPairsScorer::new);
		scorerMap.put(YatzyCategory.FULL_HOUSE, FullHouseScorer::new);
	}

	public static Scorer createScorer(String categoryName) {
		YatzyCategory category = YatzyCategory.valueOf(categoryName);
		Supplier<Scorer> scorerSupplier = scorerMap.get(category);
		if (scorerSupplier != null) {
			return scorerSupplier.get();
		}
		throw new IllegalArgumentException("Invalid category: " + categoryName);
	}
}
