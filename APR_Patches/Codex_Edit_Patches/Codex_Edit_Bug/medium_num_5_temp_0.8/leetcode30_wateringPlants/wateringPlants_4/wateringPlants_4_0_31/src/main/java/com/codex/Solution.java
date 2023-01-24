package com.codex;

import java.util.*;

public class Solution {
import java.util.*;

public class WaterPlants2 {

    public static int wateringPlants(int[] plants, int capacity1, int capacity2) {

        int steps = 0;
        int curCap1 = capacity1;
        int curCap2 = capacity2;
        int numJugs = 2;

        for (int i = 0; i < plants.length; i++) {
            if (curCap1 < plants[i]) {
                curCap1 = capacity1;
                steps++;
            }


            curCap1 -= plants[i];

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