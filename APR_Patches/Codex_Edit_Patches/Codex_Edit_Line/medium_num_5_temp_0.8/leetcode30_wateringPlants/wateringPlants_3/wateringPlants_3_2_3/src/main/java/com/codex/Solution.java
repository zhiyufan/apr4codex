package com.codex;

import java.util.*;

public class Solution {
    public static int wateringPlants(int[] plants, int capacity) {
        
        int steps = 0;
        int currWater = capacity;
        for (int i = 0; i < plants.length; i++) {
            steps++;
            if (plants[i] > currWater) {
                steps += (i - 1) * 2; //change this
                currWater = capacity;
                i--;
            } else {
                currWater -= plants[i];
            }
        }
        return steps;
    }


    
}