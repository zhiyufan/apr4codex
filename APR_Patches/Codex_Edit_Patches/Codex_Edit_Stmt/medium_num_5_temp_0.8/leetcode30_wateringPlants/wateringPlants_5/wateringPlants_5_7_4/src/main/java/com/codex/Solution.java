package com.codex;

import java.util.*;

public class Solution {
public static int wateringPlants(int[] plants, int capacity) {

        int steps = 0;
        int currPos = 0;
        int currCapacity = capacity;
        while (currPos < plants.length) {
           
            if (currCapacity >= plants[currPos]) {
                currCapacity -= plants[currPos];
                currPos++;
            }
            
            else {
                currCapacity = capacity;
            }
            steps++;
        }
        return steps;
    }
}