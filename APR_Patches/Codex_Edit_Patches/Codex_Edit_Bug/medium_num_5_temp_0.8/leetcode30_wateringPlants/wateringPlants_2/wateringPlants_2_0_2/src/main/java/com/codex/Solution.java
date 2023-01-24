package com.codex;

import java.util.*;

public class Solution {
    public static int wateringPlants(int[] plants, int capacity) {
        
        int steps = 0;//keep track of steps
        int i = 0;//index of the plants array
        int x = -1;//keep track of whether this is the first plant of the two
        int water = capacity;//remaining capacity
        while (i < plants.length) {//iterate through plants array
            if (x >= 0) {//if this is the second plant of the two
                if (water < plants[i]) {//if not enough water, then refill and stop watering the first plant
                    steps++;
                    water = capacity;
                    x = -1;
                } else {
                    steps++;
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
        return steps;
    }
}