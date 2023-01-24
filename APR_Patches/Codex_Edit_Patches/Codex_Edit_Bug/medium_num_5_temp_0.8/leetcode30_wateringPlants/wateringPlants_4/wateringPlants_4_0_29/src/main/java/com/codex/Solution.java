package com.codex;

import java.util.*;

public class Solution {
public static int wateringPlants(int[] plants, int capacity) {
        int steps = 0;
        int curCap = capacity;

        for (int i = 0; i < plants.length; i++) {
            curCap = curCap - plants[i];
            steps++;

            if (i + 1 < plants.length) {
                if (curCap < plants[i + 1] && plants[i] != 0) {
                    curCap = capacity;
                    steps++;
                }

                curCap = curCap - plants[i];
            }

            if (curCap < 0)
                steps -= 1;

        }
        return steps;
    }

    
}