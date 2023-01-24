package com.codex;

import java.util.*;

public class Solution {
    public static int wateringPlants(int[] plants, int capacity) {
        
        int start = 0;
        int i = 0;
        int current = 0;
        int steps = 0;
        for (int plant : plants) {
            if (plant > capacity) {
                return -1; 
            }
            if (position < 0) {
                steps++;
                position = 0;
            }
            if (plants[i] > capacity - position) {
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