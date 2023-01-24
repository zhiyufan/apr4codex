package com.codex;

import java.util.*;

public class Solution {
    public static int wateringPlants(int[] plants, int capacity) {
        
        int steps = 0;
        int currWater = capacity;
        for (int i = 0; i < plants.length - 1; i++) {
            steps++;
            if (plants[i] > currWater) {
                steps += (i - 1) * 2;
                currWater = capacity;
                i--;
            }
            currWater -= plants[i];
        }

        if (plants[plants.length - 1] <= currWater) {
            return steps;
        } else {
            steps += (plants.length - 1) * 2;
            return steps;
        }
    }


    
}