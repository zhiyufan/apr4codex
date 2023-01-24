package com.codex;

import java.util.*;

public class Solution {
    public static int wateringPlants(int[] plants, int capacity) {
        int steps = 0;
        int currWater = capacity; //initial capacity
        for (int i = 0; i <= plants.length; i++) { //start looking for the next plant
            if (i == plants.length || plants[i] > currWater) { //if there is no next plant or it is not reachable
                steps += (i - 1) * 2; //double the number of steps you need to go back
                currWater = capacity; //reset the amount of water you have
                i--; //go back one step to look again
            } else {
                currWater -= plants[i];
            }
        }
        return steps;
    }


    
}