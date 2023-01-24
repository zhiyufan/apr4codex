package com.codex;

import java.util.*;

public class Solution {
    public class MyClass {
    public static int wateringPlants(int[] plants, int capacity) {
        
        int steps = 0;
        int currWater = capacity;
        for (int i = 0; i < plants.length; i++) {
            steps++;
            if (plants[i] > currWater) {
                steps += (i - 1) * 2;
                currWater = capacity;
                i--;
            } else {
                currWater -= plants[i];
            }
        }
        return steps;
    }
    
    public static void main(String args[]) {
        
        int[] plants = {2,4,5,1,2};
        int capacity = 6;
        
        int steps = wateringPlants(plants, capacity);
        
        
        System.out.println(steps);
        
    }
}


    
}