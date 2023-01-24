package com.codex;

import java.util.*;

public class Solution {
    public static int wateringPlants(int[] plants, int capacity) {
        
        int i = 0;
        int position = 0;
        boolean isNext = false;
        int steps = 0;
        while (i < plants.length) {
            
            if (plants[i] > capacity) {
                return -1;
            }
            
            if(plants[i] > capacity - position){
                isNext = true;
            }
            position += plants[i];
            steps++;
            i++;
        }
        return steps;
    }

    
}