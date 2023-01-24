package com.codex;

import java.util.*;

public class Solution {
public int wateringPlants(int[] plants, int capacity) {
        int res = 0;
        for (int i = 0; i < plants.length; ) {
            int water = capacity;
            while (i < plants.length && water >= plants[i]) {
                water -= plants[i];
                i++;
            }
            res++;
            if(i < plants.length && water < plants[i]) {
                i--;
            }
        }
        return res;
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