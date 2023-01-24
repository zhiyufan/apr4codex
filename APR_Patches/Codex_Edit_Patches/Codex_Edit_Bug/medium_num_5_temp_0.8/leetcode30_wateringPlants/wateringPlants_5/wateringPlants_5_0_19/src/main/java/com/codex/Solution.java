package com.codex;

import java.util.*;

public class Solution {
    
    public static int wateringPlants(int[] plants, int capacity) {
        int stepsTaken = 0;
        int currPos = 0;
        int smallPosition = 0;
        int currCapacity = capacity;
        int smallestPlant = 0;
        for (int i = 0; i < plants.length; i++) {
            if (plants[i] < plants[smallestPlant]) {
                smallestPlant = plants[i];
                smallPosition = i;
            }
        }
        while (currPos < plants.length) {
            if (currCapacity < plants[currPos]) {
                currPos = smallPosition;
                if (currCapacity >= plants[currPos]) {
                    break;
                }
                currCapacity = capacity;
                stepsTaken++;
            }
            currCapacity -= plants[currPos];
            currPos++;
            stepsTaken++;
        }
        return stepsTaken;
    }

    
}