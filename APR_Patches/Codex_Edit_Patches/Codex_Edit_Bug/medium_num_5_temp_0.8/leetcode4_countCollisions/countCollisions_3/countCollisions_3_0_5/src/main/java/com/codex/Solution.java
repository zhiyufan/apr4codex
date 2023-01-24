package com.codex;

import java.util.*;

public class Solution {
public static int countCollisions(String directions) {
		
		int collisions = 0;
		if (directions == null || directions.length() == 0)
			return collisions;
		int i = 0;
		while (i < directions.length() - 1) {
			for (int j = i + 1; j < directions.length(); j++) {
				if (directions.charAt(i) == 'L' && directions.charAt(j) == 'L') {
					collisions++;
				} else if (directions.charAt(i) == 'R' && directions.charAt(j) == 'R') {
					collisions++;
				}
			}
			
			i++;
		}

		return collisions;
	}
	
    
}