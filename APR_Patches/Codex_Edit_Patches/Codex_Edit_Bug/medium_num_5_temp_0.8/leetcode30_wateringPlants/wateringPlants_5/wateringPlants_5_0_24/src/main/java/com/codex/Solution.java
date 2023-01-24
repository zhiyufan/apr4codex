package com.codex;

import java.util.*;

public class Solution {
public static int wateringPlants(int[] plants, int capacity) {
        int steps = 0;
        int currPos = 0;
        int currCapacity = 0;
        int smallestPlant = 0;
                currCapacity = capacity;
        while (currPos < plants.length) {
            if (currCapacity < plants[currPos]) {
                currPos = smallestPlant;
                if (currCapacity >= plants[currPos]) {
                    break;
                }
                steps++;
            }
            currCapacity -= plants[currPos];
            currPos++;
            steps++;
        }
        return steps;
    }

    
}