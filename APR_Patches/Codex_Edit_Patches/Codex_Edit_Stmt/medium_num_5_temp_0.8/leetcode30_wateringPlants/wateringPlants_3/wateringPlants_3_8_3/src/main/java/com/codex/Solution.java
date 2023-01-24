package com.codex;

import java.util.*;

public class Solution {
    public static int wateringPlants(int[] plants, int capacity) {
        
        int steps = 0;
        for (int i = 0; i < plants.length; i++) {
            steps++;
            if (plants[i] > capacity) {
                steps += (i - 1) * 2;
                i--;
            } else {
                capacity -= plants[i];
            }
        }
        return steps;
    }


    
}