package com.codex;

import java.util.*;

public class Solution {
    public static int wateringPlants(int[] plants, int wateringCanCapacity) {

        int steps = 0;
        int currPos = 0;
        int currCanCapacity = wateringCanCapacity;
        int smallestPlant = 0;
        for (int i = 0; i < plants.length; i++) {
            if (plants[i] < plants[smallestPlant]) {
                smallestPlant = i;
            }
        }
        for (int i = 0; i < plants.length; i++) {
            if (currCanCapacity < plants[currPos]) {
                currPos = smallestPlant;
                currCanCapacity = wateringCanCapacity;
                steps++;
            }
            currCanCapacity -= plants[currPos];
            if (currPos < plants.length - 1) {
                currPos++;
                steps++;
            }
        }
        return steps;
    }

    
}