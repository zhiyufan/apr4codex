package com.codex;

import java.util.*;

public class Solution {
//Complete the function below.
    public static int wateringPlants(int[] plants, int capacity) {

        int steps = 0;
        int water = capacity;

        for (int i = 0; i < plants.length; i++) {
            if (plants[i] <= water) {
                water -= plants[i];
            } else {
                steps += 2;
                i--;
                water = capacity;
            }
        }
        return steps;
    }

    
}