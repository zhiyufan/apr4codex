package com.codex;

import java.util.*;

public class Solution {
    public static int wateringPlants(int[] plants, int capacity) {
        
        int steps = 0;
        int currWater = capacity;
        int currPos = 0;

        for (int i = 0; i < plants.length; i++) {
            steps++;
            if (plants[i] > currWater) {
                steps += (i - currPos - 1) * 2;
                currPos = i;
                currWater = capacity;
            } else {
                currWater -= plants[i];
            }
        }
        return steps;
    }


    
}