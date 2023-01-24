package com.codex;

import java.util.*;

public class Solution {
    public static int wateringPlants(int[] plants, int capacity) {
        

        int steps = 0;
        int currentPosition = 0;
        int currCapacity = capacity;
        int smallestPlant = 0;
        for (int i = 0; i < n; i++) {
            if (plants[i] < plants[smallestPlant]) 
                smallestPlant = i;
        }
        while (currentPosition < plants.length) {
            if (currCapacity < plants[currentPosition]) {
                currentPosition = smallestPlant;
                if (currCapacity >= plants[currentPosition]) break;
                currCapacity = capacity;
                steps++;
            }
            currCapacity -= plants[currentPosition];
            currentPosition++;
            steps++;
        }
        return steps;
    }

    
}