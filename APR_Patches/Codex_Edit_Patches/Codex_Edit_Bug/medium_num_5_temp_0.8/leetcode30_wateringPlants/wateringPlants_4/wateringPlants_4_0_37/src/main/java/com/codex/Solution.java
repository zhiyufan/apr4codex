package com.codex;

import java.util.*;

public class Solution {
    public static int wateringPlants(int[] plants, int capacity) {
        
        int steps = 0;
        int curCap = capacity;
        int n = plants.length;

        for (int i = 0; i < n; i++) {

            if (curCap < plants[i]) {
                curCap = capacity;
                steps++;
            }
            curCap -= plants[i];
            steps++;

            if (i + 1 < n && (plants[i + 1] > curCap)) {
                curCap = capacity;
                steps++;
            }
        }

        return steps;
    }


        public static int wateringPlants(int[] plants, int capacity) {
        

        int steps = 0;
        int curCap = capacity;

        for (int i = 0; i < plants.length; i++) {
            if (curCap < plants[i]) {
                curCap = capacity;
                steps++;
            }

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