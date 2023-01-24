package com.codex;

import java.util.*;

public class Solution {
    public static int wateringPlants(int[] plants, int capacity) {

        int steps = 0;
        int i = 0;
        int water = capacity;
        while (i < plants.length) {
            if (water >= plants[i]) {
                water -= plants[i];
                i++;
            } else {
                water = capacity;
                steps++;
                water = capacity;
            }
        }
        return steps;
    }
}