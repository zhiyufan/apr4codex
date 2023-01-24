package com.codex;

import java.util.*;

public class Solution {
public static int wateringPlants(int[] plants, int capacity) {

        int steps = 0;
        int currPos = 0;
        int currCapacity = capacity;
        int smallestPlant = currPos;
        for (int i = 0; i < plants.length; i++) {
            if (plants[i] < plants[smallestPlant]) {
                smallestPlant = i;
        System.out.println("smallestPlant: " + smallestPlant);
            }
        }
        while (currPos < plants.length) {
            if (currCapacity < plants[currPos]) {
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
            System.out.println("Capacity: " + currCapacity);
            System.out.println("currPos: " + currPos);
        }
        return steps;
    }

    
}