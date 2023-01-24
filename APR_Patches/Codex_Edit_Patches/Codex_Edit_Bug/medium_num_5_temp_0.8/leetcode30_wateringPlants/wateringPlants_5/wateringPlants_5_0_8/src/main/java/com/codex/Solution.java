package com.codex;

import java.util.*;

public class Solution {
    public static int wateringPlants(int[] plants, int capacity) {
        

        int steps = 0;
        int currPos = 0;
        int currCapacity = capacity;
        int smallestPlant = 1;
        int nextPos = 0;
        for (int i = 0; i < plants.length; i++) {
            if (plants[i] < plants[smallestPlant] && plants[i] < currCapacity) {
                smallestPlant = i;
            }
        }
        while (currPos < plants.length) {
            if (currCapacity < plants[currPos]) {
                nextPos = smallestPlant;
                if (currCapacity >= plants[nextPos]) {
                    break;
                }
                currCapacity = capacity;
                steps++;
            }
            currCapacity -= plants[currPos];
            currPos = nextPos;
            nextPos++;
            steps++;
            if (currPos == plants.length) {
                currPos = 0;
                nextPos = 1;
                currCapacity = capacity;
                steps++;
            }
        }
        return steps;
    }



    public static int wateringPlants(int[] plants, int capacity) {
        

        int steps = 0;
        int currPos = 0;
        int currCapacity = capacity;
        int smallestPlant = 1;
        for (int i = 0; i < plants.length; i++) {
            if (plants[i] < plants[smallestPlant] && plants[i] < currCapacity) {
                smallestPlant = i;
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
            if (currPos == plants.length) {
                currPos = 0;
                currCapacity = capacity;
                steps++;
            }
        }
        return steps;
    }

    
}