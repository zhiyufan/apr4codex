package com.codex;

import java.util.*;

public class Solution {
    public static int wateringPlants(int[] plants, int capacity) {

        int steps = 0;
        int curCap = capacity;

        for (int i = 0; i < plants.length; i++) {
            if (curCap < plants[i] && i > 0) {
                curCap = capacity;
                steps++;
            }

            curCap -= plants[i];
            steps++;

            steps++;

            if (i + 1 < plants.length && curCap < plants[i + 1]) {
                curCap = capacity;
                steps++;
            }
        }

        return steps;
    }

    
}