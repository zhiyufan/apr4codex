package com.codex;

import java.util.*;

public class Solution {


    public static int wateringPlants(int[] plants, int capacity) {
        

        int steps = 0;
        int curCap = capacity;

        for (int i = 0; i < plants.length; i++) {
            if (curCap < plants[i]) {
                curCap = capacity;
                steps++;
            }

            curCap -= plants[i];
            steps++;

            if (i + 1 < plants.length) {
                if (curCap < plants[i + 1]) {
                    curCap = capacity;
                    steps++;
                }
            }
        }

    public static int wateringPlants(int[] plants, int capacity) {
        

        // I gave up
        int steps = 0;
        TreeSet<Integer> indices = new TreeSet<>();
        for (int i = 0; i < plants.length; i++) {
            if (plants[i] > capacity) return -1;

            if (plants[i] == capacity) {
                indices.add(i);
                indices.add(i + 1);
            }
        }

        indices.add(plants.length);

        System.out.println(indices);


        int curCap = capacity;
        int prevIndex = 0;
        while (!indices.isEmpty()) {
            int index = indices.pollFirst();
            int distance = index - prevIndex;
            int plantsToWater = 0;
            int waterToAdd = 0;

            if (indices.isEmpty()) {
                plantsToWater = plants.length - prevIndex;
            } else {
                plantsToWater = index - prevIndex;
            }

            waterToAdd = plantsToWater - curCap;

            if (waterToAdd > 0) {
                curCap = capacity;
                steps++;
                steps += Math.ceil((double) waterToAdd / capacity);
            }

            curCap -= plantsToWater;
            steps++;

            prevIndex = index;
        }

        return steps;
    }

    
        return steps;
    }

    
}