package com.codex;

import java.util.*;

public class Solution {
    public static int wateringPlants(int[] plants, int capacity) {
        
        int steps = 0;
        int i = 0;
        int x = 0;
        int water = capacity;
        while (i < plants.length) {
            if (water < plants[i]) {
                steps++;
                water = capacity;
                x = 0;
            } else {
                water = capacity;
                steps++;
                x = 0;
            }
        }
        return steps;
    }
}