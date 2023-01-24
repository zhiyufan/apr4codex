package com.codex;

import java.util.*;

public class Solution {
    public static int wateringPlants(int[] plants, int capacity) {
        
        int steps = 0;
        int currCapacity = capacity;
        for (int i = 0; i < plants.length; i++) {
            steps++;
            if (plants[i] > currCapacity) {
                steps += (i - 1) * 2;
                currCapacity = capacity;
                i--;
            } else {
                currCapacity -= plants[i];
            }
        }
        return steps;
    }


    
}