package com.codex;

import java.util.*;

public class Solution {
    public static int wateringPlants(int[] plants, int capacity) {
        
        int i = 0;
        int position = 0;
        int steps = 0;
        while (i < plants.length) {
            if (plants[i] > capacity) {
                return -1;
            }
            if (position < 0) {
                steps++;
                position = 0;
            }
            if (plants[i] > capacity) {
                steps++;
                position = 0;
            }
            position += plants[i];
            steps++;
            i++;
        }
        return steps;
    }

    
}