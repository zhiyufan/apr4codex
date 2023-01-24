package com.codex;

import java.util.*;

public class Solution {
    public static int wateringPlants(int[] plants, int capacity) {
        
        int count = 0;
        int justFilled = capacity;
        for (int i = 0; i < plants.length; i++) {
            if (justFilled < plants[i]) {
                count++;
                justFilled = capacity;
            } else {
                justFilled -= plants[i];
            } else {
                water = capacity;
                steps++;
                x = 0;
            }
        }
        return steps;
    }
}