package com.codex;

import java.util.*;

public class Solution {
    public static int wateringPlants(int[] plants, int capacity) {
        

        int steps = 0;
        int currPos = 0;
        int currCapacity = capacity;
        while (currPos < plants.length) {
            if (currCapacity < plants[currPos] && currPos != 0) {
                currPos = 0;
                currCapacity = capacity;
            }
            else if(currCapacity >= plants[currPos] && currPos < plants.length) {
                currCapacity -= plants[currPos];
                currPos++;
                steps++;
            }
        }
        return steps;
    }

    
}