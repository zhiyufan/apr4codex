package com.codex;

import java.util.*;

public class Solution {
public static int wateringPlants(int[] plants, int capacity) {
        int steps = 0;
        int currPos = 0;
        int currCapacity = capacity;
        int indexOfSmallestPlant = 0;
        for (int i = 0; i < plants.length; i++) {
            if (plants[i] < plants[indexOfSmallestPlant]) {
                indexOfSmallestPlant = i;
            }
        }
        while (true) {
            if (currCapacity < plants[0]) {
                currPos = indexOfSmallestPlant;
                if (currCapacity >= plants[indexOfSmallestPlant]) {
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