package com.codex;

import java.util.*;

public class Solution {
    public static int wateringPlants(int[] plants, int capacity) {
        
        int steps = 0;
        int i = 0;
        int availableWater = capacity;
        int requiredWater = 0;
        while (i < plants.length) {
            requiredWater += plants[i];
            if (availableWater < requiredWater) {
                steps++;
                availableWater = capacity;
                requiredWater = 0;
            } else if (availableWater >= requiredWater && i == plants.length - 1) {
                steps++;
            } else {
                availableWater -= plants[i];
                i++;
            }
                
        }
        return steps;
    }
}