package com.codex;

import java.util.*;

public class Solution {
public static int wateringPlants(int[] plants, int capacity) {
    // Initialize steps needed
	int steps = 1;
    // Initialize the current capacity with the maximum capacity
	int currentCapacity = capacity;
    // Loop through plants forward
	for (int i = 0; i < plants.length; i++) {
        // If current plant requires more water than the current capacity
		if (plants[i] > currentCapacity) {
            // If there are more plants in the array
			if (i + 1 < plants.length) {
                // Set current capacity to maximum capacity
				currentCapacity = capacity;
                // Set current plant to the first plant
				i = -1;
                // Increase the steps needed
				steps += 1;
                // If this is the last plant in the array
			} else {
                // There is no need to go back because we are at the end of the array
				break;
            }
        }
		}
        // Decrease water capacity by the amount of water that the current plant requires
		currentCapacity -= plants[i];
	}
    // Return the steps needed
	return steps;
}
}