package com.codex;

import java.util.*;

public class Solution {
    public static int wateringPlants(int[] plants, int capacity, int from = 0){
        
        int steps = 0;
        int i = from;
        int x = -1;
        int water = capacity;
        while (i < plants.length) {
            if (x >= 0) {
                if (water < plants[i]) {
                    steps++;
                    water = capacity;
                    x = -1;
                } else {
                    if (i != plants.length - 1) {
                        steps++;
                    }
                    water -= plants[i];
                    i++;
                    x++;
                }
            } else {
                water = capacity;
                steps++;
                x = 0;
            }
        }
        if (x != -1) {
            return wateringPlants(plants, capacity, plants.length);
        }
        return Math.max(wateringPlants(plants, capacity), wateringPlants(plants, capacity, plants.length));
    }
}