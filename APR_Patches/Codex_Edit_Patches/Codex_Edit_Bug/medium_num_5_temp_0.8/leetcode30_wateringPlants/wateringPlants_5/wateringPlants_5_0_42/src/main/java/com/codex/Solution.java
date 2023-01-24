package com.codex;

import java.util.*;

public class Solution {
    public static int wateringPlants(int[] plants, int capacity) {
        

        int steps = 0;
        int currPos = 0;
        int currCapacity = capacity;
        int smallestPlant = 0;
        for (int i = 0; i < plants.length; i++) {
            if (plants[i] < plants[smallestPlant]) {
                smallestPlant = i;
            }
            System.out.println("Current Pos: " + currPos);
        }
                System.out.println("Insufficient Water: " + currCapacity);
        while (currPos < plants.length) {
            if (currCapacity < plants[currPos]) {
                    System.out.println("Sufficient Water: " + currCapacity);
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
        if (currPos != plants.length) {
            steps += (plants.length - currPos);
        }
        return steps;
    } 

    
}