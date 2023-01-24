package com.codex;

import java.util.*;

public class Solution {
    public static int wateringPlants(int[] plants, int capacity, int start) {
        
        int steps = 0;
        int i = 0;
        int x = -1;
        int water = capacity;
        int start = start;
        while (i < plants.length) {
            if (start >= 0) {
                if (water < plants[i]) {
                    steps++;
                    water = capacity;
                    x = -1;
                } else {
                    steps++;
                    water -= plants[i];
                    i++;
                    start++;
                }
            } else {
                water = capacity;
                steps++;
                start = 0;
            }
        }
        return steps;
    }
}