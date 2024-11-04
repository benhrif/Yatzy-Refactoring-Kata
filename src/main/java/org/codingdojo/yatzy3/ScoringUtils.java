package org.codingdojo.yatzy3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ScoringUtils {

	
	public static Map<Integer, Integer> frequencies(List<Integer> dice) {
		
		Map<Integer, Integer> frequencies = new HashMap<>();
		for (int i = 1; i <= 6; i++) {
			frequencies.put(i, 0);     
		}        
		
		for (int die : dice) {
				
			frequencies.put(die, frequencies.get(die) + 1);        
		}   
		
		return frequencies;    
	}
	
	
	
	public static int sum(List<Integer> dice) {
		return dice.stream().mapToInt(Integer::intValue).sum();    
	}
}
