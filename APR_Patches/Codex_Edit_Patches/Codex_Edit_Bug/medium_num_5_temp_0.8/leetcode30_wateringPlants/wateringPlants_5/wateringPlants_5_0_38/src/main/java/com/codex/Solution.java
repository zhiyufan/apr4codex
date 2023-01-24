package com.codex;

import java.util.*;

public class Solution {
public static int wateringPlants(int[] plants, int capacity) {

        int steps = 0;
        int currPos = 0;
        int currCapacity = capacity;
        int smallestPlant = 0; 
        int nextSmallest = 0;
        for (int i = 0; i < plants.length; i++) {
                nextSmallest = i;
            if (plants[i] < plants[smallestPlant]) {
                smallestPlant = i;
            }
            if (plants[i] < plants[nextSmallest] && 
                plants[i] > plants[smallestPlant]) {
                nextSmallest = i;
            }
        } 
       
        while (currPos < plants.length) {
            if (currCapacity < plants[currPos]) {
                currPos = nextSmallest;
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
        
        return steps;
    } 

    
}