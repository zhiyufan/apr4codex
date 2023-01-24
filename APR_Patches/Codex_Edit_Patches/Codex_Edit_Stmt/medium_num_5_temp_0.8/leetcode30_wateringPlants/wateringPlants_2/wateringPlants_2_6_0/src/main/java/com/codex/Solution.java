package com.codex;

import java.util.*;

public class Solution {
public static int wateringPlants(int[] plants, int capacity) {

    int steps = 0;
    int i = 0;
    int x = -1;
    int water = capacity;
    while (i < plants.length) {
        if (x >= 0) {
            if (water < plants[i]) {
                steps++;
                water = capacity;
                x = -1;
            } else {
                steps++;
                water -= plants[i];
                i++;
                x++;
            }
        } else {
            water = capacity;
            steps++;
            x = 0;
        }
    }
    return steps;
}


    public static int wateringPlants(int[] plants, int capacity) { // Watering Plants
        int steps = 0; // It's to count steps
        int i = 0; // It's to count plants
        int x = -1; // It's to count steps
        int water = capacity; // It's to store capacity
        while (i < plants.length) { // It's to run the loop
            if (x >= 0) { // It's to check the first step
                if (water < plants[i]) { // It's to check if the water's are enough
                    steps++; // It's to add 1 to steps
                    water = capacity; // It's to store the capacity
                    x = -1; // It's to store -1
                } else { // If it's false
                    steps++; // It's to add 1 to steps
                    water -= plants[i]; // It's to fill the capacity
                    i++; // It's to add 1 to plants
                    x++; // It's to store 0
                }
            } else { // If it's false
                water = capacity; // It's to store capacity
                steps++; // It's to add 1 to steps
                x = 0; // It's to store 0
            }
        }
        return steps; // It's to return steps
    }


    


    public static int wateringPlants(int[] plants, int capacity) { // Watering Plants
        int steps = 0; // It's to count steps
        int i = 0;
        int x = -1;
        int water = capacity;
        while (i < plants.length) {
            if (x >= 0) { // It's to check the first step
                if (water < plants[i]) { // It's to check if the water's are enough
                    steps++;
                    water = capacity; // It's to store the capacity
                    x = -1; // It's to store -1
                } else { // If it's false
                    steps++;
                    water -= plants[i]; // It's to fill the capacity
                    i++; // It's to add 1 to plants
                    x++; // It's to store 0
                }
            } else { // If it's false
                water = capacity; // It's to store capacity
                steps++; // It's to add 1 to steps
                x = 0; // It's to store 0
            }
        }
        return steps; // It's to return steps
    }
}