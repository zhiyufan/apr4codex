package com.codex;

import java.util.*;

public class Solution {
    public static int wateringPlants(int[] plants, int capacity) {
        

        int steps = 0;
        int index = 0;
        int currCapacity = capacity;
        int smallestPlant = 0;
        for (int i = 0; i < plants.length; i++) {
            if (plants[i] < plants[smallestPlant]) {
                smallestPlant = i;
            }
        }
        while (index < plants.length) {
            if (currCapacity < plants[index]) {
                index = smallestPlant;
                if (currCapacity >= plants[index]) {
                    break;
                }
                currCapacity = capacity;
                steps++;
            }
            currCapacity -= plants[index];
            index++;
            steps++;
        }
        return steps;
    }

    
}