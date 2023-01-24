package com.codex;

import java.util.*;

public class Solution {
    public static int wateringPlants(int[] plants, int capacity) {

        int steps = 0;
                if (capacity >= plants[i]) {
                    curCap = capacity - plants[i];
                } else {
                    curCap = capacity;
                    steps++;
                }
            } else {
        int curCap = capacity;

        for (int i = 0; i < plants.length; i++) {
            curCap -= plants[i];
            steps++;

            if (i + 1 < plants.length) {
                if (curCap < plants[i + 1]) {
                    curCap = capacity;
                    steps++;
                }
            }
        }

        return steps;
    }

    
}