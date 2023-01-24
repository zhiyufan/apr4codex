package com.codex;

import java.util.*;

public class Solution {
    // Time: O(n)
    // Space: O(1)
    public static int wateringPlants(int[] plants, int capacity) {
        
        int steps = 0;
        int currWater = capacity;
        for (int i = 0; i < plants.length; i++) {
            steps++;
            if (plants[i] > currWater) {
                steps += (i - 1) * 2;
                currWater = capacity;
                i = i - 1;
            } else {
                currWater -= plants[i];
            }
        }
        return steps;
    }


    
}