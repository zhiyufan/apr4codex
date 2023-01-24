package com.codex;

import java.util.*;

public class Solution {
    public static int wateringPlants(int[] plants, int capacity) {
        
        int steps = 0;
        int currWater = capacity;
        for (int i = 0; i < plants.length; i++) {
            if (i != 0 && plants[i] > currWater) {
                steps += (i - 1) * 2;
                steps++;
                currWater = capacity;
            } else {
                currWater -= plants[i];
            }

            steps++;
            if (plants[i] > currWater) {
                steps += (i - 1) * 2;
                currWater = capacity;
                i--;
            } else {
                currWater -= plants[i];
            }
        }
        return steps;
    }


    
}