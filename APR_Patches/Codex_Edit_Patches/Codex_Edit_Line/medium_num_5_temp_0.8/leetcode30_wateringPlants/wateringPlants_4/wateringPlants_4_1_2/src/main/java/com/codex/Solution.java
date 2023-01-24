package com.codex;

import java.util.*;

public class Solution {
public static int wateringPlants(int[] plants, int capacity) {
        int steps = 0;
        int curCap = capacity;

        for (int i = 0; i < plants.length; i++) {
            curCap = Math.max(0, curCap - plants[i]);
            steps++;

            if (i + 1 < plants.length) {
                curCap = Math.max(0, curCap - plants[i + 1]);
                steps++;
            }
        }
        return steps;
    }

    
}