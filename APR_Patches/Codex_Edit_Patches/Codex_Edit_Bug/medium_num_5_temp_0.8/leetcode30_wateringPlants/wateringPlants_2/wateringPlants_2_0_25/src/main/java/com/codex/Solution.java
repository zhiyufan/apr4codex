package com.codex;

import java.util.*;

public class Solution {
    public static int wateringPlants(int[] plants, int capacity) {
        
        int steps = 0;
        int i = 0;
        int x = -1;
        int water = capacity;
        while (i < plants.length) {
            System.out.println(water);
            if (x >= 0) {
                if (water - plants[i] < 0) {
                    steps++;
                    water = capacity;
                    x = -1;
                } else {
                    steps++;
                    if (water - plants[i] > 0) {
                        water -= plants[i];
                    } else {
                        water = 0;
                    }
                    
                    i++;
                    x++;
                }
            } else {
                water = capacity;
                steps++;
                x = 0;
            }
        }
        return steps;
    }
}