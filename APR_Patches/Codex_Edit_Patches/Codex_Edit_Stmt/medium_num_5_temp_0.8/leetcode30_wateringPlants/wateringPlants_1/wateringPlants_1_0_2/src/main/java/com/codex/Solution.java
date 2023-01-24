package com.codex;

import java.util.*;

public class Solution {
    public static int wateringPlants(int[] plants, int capacity) {
        
        int i = 0;
        int waterLevel = 0;
        int steps = 0;
        while (i < plants.length) {
            if (plants[i] > capacity) {
                return -1;
            }
            if (waterLevel < 0) {
                steps++;
                waterLevel = 0;
            }
            if (plants[i] > capacity - waterLevel) {
                steps++;
                waterLevel = 0;
            }
            waterLevel += plants[i];
            steps++;
            i++;
        }
        return steps - 1;
    }

    
}