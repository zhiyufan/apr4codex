package com.codex;

import java.util.*;

public class Solution {
    public static int wateringPlants(int[] plants, int capacity) {
        
        int steps = 0;
        int currWater = capacity; 
        for (int i = 0; i < plants.length; i++) {
            steps++;
            if (plants[i] <= currWater) {
                currWater -= plants[i];
                continue;
            }

            if (i == 0) {
                return -1;
            }

            steps += (i - 1) * 2;
            currWater = capacity - plants[i];
            i--;
        }
        return steps;
    }

/*        int steps = 0;
        int currWater = capacity; 
        for (int i = 0; i < plants.length; i++) {
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