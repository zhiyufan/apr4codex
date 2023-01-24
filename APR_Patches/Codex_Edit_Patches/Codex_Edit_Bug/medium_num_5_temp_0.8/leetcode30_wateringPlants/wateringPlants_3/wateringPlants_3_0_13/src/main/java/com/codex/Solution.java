package com.codex;

import java.util.*;

public class Solution {
    public static int wateringPlants(int[] plants, int capacity) {
        if (plants.length == 0) {
            return 0;
        }

        int currentWater = capacity;
        int nextStopIndex = 0;
        int refillStop = 0;
        int steps = 1;

        while(nextStopIndex < plants.length) {
            while(nextStopIndex < plants.length && currentWater >= plants[nextStopIndex]) {
                currentWater -= plants[nextStopIndex];
                nextStopIndex++;
            }
        }
        return steps;
    }


    
}