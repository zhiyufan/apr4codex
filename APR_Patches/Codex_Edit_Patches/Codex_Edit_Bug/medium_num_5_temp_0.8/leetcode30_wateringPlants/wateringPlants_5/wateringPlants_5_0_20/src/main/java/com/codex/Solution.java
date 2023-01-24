package com.codex;

import java.util.*;

public class Solution {
    public static int wateringPlants(int[] plants, int capacity) {

        
        int[] copy = Arrays.copyOf(plants, plants.length);
        Arrays.sort(plants);

        int steps = 0;
        int currPos = 0;
        int currCapacity = capacity;
        for (int i = 0; i < plants.length; i++){
            System.out.println(plants[i]);
        } 
        for (int i = 0; i < plants.length; i++) { 
            if (currCapacity < plants[i] ) {
                currPos = 0;
                currCapacity = capacity;
                steps++;
                if (currCapacity < plants[i]) {
                    break;
                }
            }
            currCapacity -= plants[currPos];
            currPos++;
            steps++;
        }
        return steps;
    }

    
}