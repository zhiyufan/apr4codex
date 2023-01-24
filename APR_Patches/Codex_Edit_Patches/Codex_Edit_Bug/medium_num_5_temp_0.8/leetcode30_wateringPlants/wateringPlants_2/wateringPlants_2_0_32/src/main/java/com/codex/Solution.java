package com.codex;

import java.util.*;

public class Solution {
import java.util.Arrays;

    public static int wateringPlants(int[] plants, int capacity) {
        Arrays.sort(plants);
        int steps = 0, i = 0, x = -1, water = 0,remaining =0;
        while (i < plants.length) {
            if (water < plants[i]){
                water = capacity;
                steps +=2;
            } 
            if (remaining == 0 && water == capacity){
                remaining = plants[i];
            }
            remaining =  remaining > 0 ? remaining - plants[i] : 0;
            i++;
        }
        steps += remaining > 0 ? 2 : 1;
        return steps;        
    }
}