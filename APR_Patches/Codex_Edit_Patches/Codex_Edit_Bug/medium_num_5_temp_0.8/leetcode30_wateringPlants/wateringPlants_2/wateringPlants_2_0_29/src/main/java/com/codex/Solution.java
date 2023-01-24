package com.codex;

import java.util.*;

public class Solution {
public static int wateringPlants(int[] plants, int capacity) {
	if (plants.length == 0) {
		return -1;
	}
	if (plants.length == 1) {
		return 1;
	}

	int steps;
	int i;
	int x;
	int water;
	steps = 0;
	i = 0;
	x = -1;
	water = capacity;
	while (i < plants.length) {
		if (x >= 0) {
			if (water < plants[i]) {
				steps++;
				water = capacity;
				x = -1;
			} else {
				steps++;
				water -= plants[i];
				i++;
				x++;
			}
		} else {
			water = capacity;
			steps++;
			x = 0;
		}
	}
	return steps;
}
}