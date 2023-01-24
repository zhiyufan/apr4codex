package com.codex;

import java.util.*;

public class Solution {
    public static int wateringPlants(int[] plants, int capacity) {
        

        int steps = 0;
        int currPos = 0;
        boolean visited[] = new boolean[plants.length];
        int currCapacity = capacity;
        int smallestPlant = 0;
        for (int i = 0; i < plants.length; i++) {
            if (plants[i] < plants[smallestPlant]) {
                smallestPlant = i;
            }
        }
        while (currPos < plants.length) {
            if (currCapacity < plants[currPos]) {
                if (visited[currPos] == false) {
                    currPos = smallestPlant;
                    if (currCapacity >= plants[currPos]) {
                        break;
                    }
                    visited[currPos] = true;
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

    public static void main(String[] args) {
        System.out.println(wateringPlants(new int[]{2, 4, 5, 1, 2}, 6));
        System.out.println(wateringPlants(new int[]{1, 2, 3, 4, 6}, 2));

    }
}