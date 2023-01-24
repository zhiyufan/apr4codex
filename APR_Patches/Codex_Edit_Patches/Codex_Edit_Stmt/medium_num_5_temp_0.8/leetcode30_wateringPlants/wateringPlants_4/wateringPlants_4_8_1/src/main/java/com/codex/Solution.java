package com.codex;

import java.util.*;

public class Solution {
    public static int wateringPlants(int[] plants, int capacity) {

        int steps = 0;
        int curCap = capacity;

        int i = 0;
        while (i < plants.length) {
            int consecutive = 0;

            while (i < plants.length && curCap >= plants[i]) {
                curCap -= plants[i];

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