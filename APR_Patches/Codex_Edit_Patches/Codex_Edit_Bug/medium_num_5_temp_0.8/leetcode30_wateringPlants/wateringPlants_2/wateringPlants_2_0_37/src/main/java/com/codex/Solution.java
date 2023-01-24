package com.codex;

import java.util.*;

public class Solution {
    public static int wateringPlants(int[] plants, int capacity) {
        
        int steps = 1;
        int i = 0;
        int x = 0;
        int water = capacity;
        while (i < plants.length) {
            if (water < plants[i] && x == 0) {
                steps++;
                water = capacity;
            }
            if (x >= 0) {
                if (water < plants[i]) {
                    steps++;
                    water = capacity;
                }
                water -= plants[i];
                i++;
                x++;
            }
        }
        return steps;
    }
}