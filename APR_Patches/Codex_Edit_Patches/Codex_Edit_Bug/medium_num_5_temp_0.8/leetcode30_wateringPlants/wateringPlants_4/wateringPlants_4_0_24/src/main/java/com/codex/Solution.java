package com.codex;

import java.util.*;

public class Solution {
public static int wateringPlants(int[] plants, int capacity) {

        int steps = 0;
        int curCap = capacity;

        int back = 0;
        int i = 0;

        while (i < plants.length) {
            if (back == -1) {
                curCap = capacity - plants[i];
                i++;
                back = 0;
                steps += 2;
            }

            if (curCap < plants[i]) {
                i--;
                curCap = capacity;
                back = -1;
                steps++;
            } else {
                curCap -= plants[i];
                i++;
                steps++;
            }

          
        }

        return steps;
    }

    
}