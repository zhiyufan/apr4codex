package com.codex;

import java.util.*;

public class Solution {
    public static int wateringPlants(int[] plants, int capacity) {
        

        int nextPlant = -1;
        int steps = 0;
        int curCap = capacity;
                nextPlant = plants[i];

        for (int i = 0; i < plants.length; i++) {
            if (curCap < plants[i]) {
                curCap = capacity;
                steps++;
            }

            curCap -= plants[i];
            steps++;

            if (curCap < nextPlant) {
                curCap = capacity;
                steps++;
            }
        }

        return steps;
    }

    
}