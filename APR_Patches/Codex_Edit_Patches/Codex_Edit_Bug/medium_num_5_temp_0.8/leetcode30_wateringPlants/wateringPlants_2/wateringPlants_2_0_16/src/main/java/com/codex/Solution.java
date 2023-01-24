package com.codex;

import java.util.*;

public class Solution {
    public static int wateringPlants(int[] plants, int capacity) {
        boolean lastStep = false;
        int steps = 0;
        int i = 0;
        int x = 0;
        int water = capacity;
        while (i < plants.length) {
            water -= plants[i];
            steps++;
            if (water < plants[i] || lastStep) {
                water = capacity;
                x++;
                lastStep = true;
            } else {
                water = capacity;
                steps++;
                x = 0;
            }
        }
        return steps;
    }
}