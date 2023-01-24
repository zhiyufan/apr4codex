package com.codex;

import java.util.*;

public class Solution {
    public static int wateringPlants(int[] plants, int capacity) {
        
        int i = 0;
        int position = 0;
        int steps = 0;
        while (i < plants.length) {
            if (plants[i] > capacity) {
                return -1;
            }
            if (position < 0) {
                steps++;
                position = 0;
            }
            if (plants[i] > capacity){
                i -= 1;
                steps++;
                position = 0;
                continue;
            }
            int prevPlant = plants[i - 1];
            int currPlant = plants[i];
            if (prevPlant > capacity - position) {
                i -= 1;
                steps++;
                position = 0;
                continue;
            }
            if (currPlant > capacity - position - prevPlant) {
                i -= 1;
                steps++;
                position = 0;
                continue;
            }
            if (currPlant + prevPlant > capacity) {
                i -= 1;
                steps++;
                position = 0;
                continue;
            }
            if (prevPlant + currPlant > capacity - position) {
                steps++;
                position = 0;
            }
            position += plants[i] + plants[i - 1];
            steps++;
            i++;
        }
        return steps;
    }

    
}