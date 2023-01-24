package com.codex;

import java.util.*;

public class Solution {
    public static int wateringPlants(int[] plants, int capacity) {
        

        int steps = 1;
        int capLeft = capacity;

        for (int i = 0; i < plants.length - 1; i++) {
            if (plants[i] > capLeft) {
                capLeft = capacity;
                steps += 2;
            } else {
                capLeft -= plants[i];
                steps+=2;
            }
            
        }

        return capLeft >= plants[plants.length - 1] ? steps : steps + 1;
    }
}