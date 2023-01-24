package com.codex;

import java.util.*;

public class Solution {
        public static int wateringPlants(int[] plants, int capacity) {
        
        int i = 0;
        int position = 0;
        int curr = 0;
        int steps = 0;
        int prev = 0;

        while (i < plants.length) {
            if (plants[i] > capacity) {
                return -1;
            }
            curr = plants[i];
            if (position < 0 || curr > capacity - position) {
                steps++;
                position = 0;
                prev = 0;
            }
            position += plants[i];

            if (prev != curr) {
                steps++;
                prev = curr;
            }
            i++;
        }
        return steps;
    }

    
}