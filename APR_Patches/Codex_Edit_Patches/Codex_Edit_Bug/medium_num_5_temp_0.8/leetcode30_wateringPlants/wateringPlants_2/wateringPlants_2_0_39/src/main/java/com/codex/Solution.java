package com.codex;

import java.util.*;

public class Solution {
    public static int wateringPlants(int[] plants, int capacity) {
        
        int steps = 0;
        int i = 0;
        int x = -1;
        int water = capacity;
        while (i < plants.length) {
			if (water < plants[i]) {
				steps++;
				water = capacity;
				x = -1;
			}
            if (x >= 0) {
                steps++;
                water -= plants[i];
                i++;
                x++;
            } else {
                water = capacity;
                steps++;
                x = 0;
            }
        }
        return steps;
    }
}