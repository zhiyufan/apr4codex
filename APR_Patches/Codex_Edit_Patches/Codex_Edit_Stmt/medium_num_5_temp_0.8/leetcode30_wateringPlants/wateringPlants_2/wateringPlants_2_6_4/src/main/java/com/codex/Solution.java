package com.codex;

import java.util.*;

public class Solution {
    public static int wateringPlants(int[] plants, int capacity) {

        int steps = 0;
		int i = 0;
		int movingBackCapacity = 0;
		int nextPos = 0;
        
		while (i < plants.length) {
			if (movingBackCapacity > 0) {
				if (movingBackCapacity < plants[i]) {
					steps++;
					movingBackCapacity = capacity;
					nextPos = i - 1;
				} else {
					nextPos = i;
					i++;
				}
				movingBackCapacity -= plants[nextPos];
			} else {
				steps++;
				movingBackCapacity = capacity;
			}
		}
		return steps;
    }
}