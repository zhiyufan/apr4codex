package com.codex;

import java.util.*;

public class Solution {
    public static int wateringPlants(int[] plants, int capacity) {
        
        int steps = 0;
        int currWater = capacity;
        for (int i = 0; i < plants.length; i++) {
            
            if (plants[i] > currWater) {
                steps += (i) * 2;
                currWater = capacity;
                i--;
                steps++;
            } else {
                steps++;
                currWater -= plants[i];
            }
        }
        return steps;
    }


    
}