package com.codex;

import java.util.*;

public class Solution {
    public static int wateringPlants(int[] plants, int capacity) {
        
        int steps = 0;
        int i = 0;
        int water = capacity;
        while (i < plants.length) {
            if (water < plants[i]) {
                steps++;
                water = capacity;
            } else {
                steps++;
                water -= plants[i];
            }
            if (i + 1 < plants.length && water < plants[i + 1]) {
                water = capacity;
                steps++;
            } else {
                water = capacity;
                steps++;
                x = 0;
            }
        }
        return steps;
    }
}