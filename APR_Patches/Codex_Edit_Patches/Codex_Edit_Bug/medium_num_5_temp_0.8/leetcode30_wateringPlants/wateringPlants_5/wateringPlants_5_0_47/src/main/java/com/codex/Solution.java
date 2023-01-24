package com.codex;

import java.util.*;

public class Solution {
    public static int wateringPlants(int[] plants, int capacity) {
        

        int steps = 0;
        int currPos = 0;
        int currCapacity = capacity;
        boolean end = false;
        while (currPos < plants.length && !end) {
            if (currCapacity < plants[currPos]) {
                end = true;
            }
            else {
                currCapacity -= plants[currPos];
                currPos++;
                steps++;
            }
            if (currPos == plants.length) {
                int smallestPlant = 0;
                for (int i = 0; i < plants.length; i++) {
                    if (plants[i] < plants[smallestPlant]) {
                        smallestPlant = i;
                    }
                }
                currPos = smallestPlant;
                if (currCapacity >= plants[currPos]) {
                    break;
                }
                currCapacity = capacity;
                steps++;
            }
            currCapacity -= plants[currPos];
            currPos++;
            steps++;
        }
        return steps;
    }

    
}