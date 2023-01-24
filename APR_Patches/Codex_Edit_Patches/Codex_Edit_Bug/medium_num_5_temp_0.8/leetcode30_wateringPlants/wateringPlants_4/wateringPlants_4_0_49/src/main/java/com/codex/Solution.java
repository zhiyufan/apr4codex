package com.codex;

import java.util.*;

public class Solution {
    public static int wateringPlants(int[] plants, int cap) {
        

        int steps = 0;
        int curCap = capacity;

        for (int i = 0; i < plants.length; i++) {

            curCap = Math.max(curCap - plants[i], 0);
            steps++;

            if (i + 1 < plants.length) {
                curCap = Math.max(curCap - plants[i + 1], 0);
            }
        }

        return steps;
    }

    
}