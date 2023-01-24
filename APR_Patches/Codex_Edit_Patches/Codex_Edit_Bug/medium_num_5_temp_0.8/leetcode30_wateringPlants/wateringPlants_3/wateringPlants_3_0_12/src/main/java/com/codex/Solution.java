package com.codex;

import java.util.*;

public class Solution {
public class WateringPlants {
    public static void main(String[] args) {
        System.out.println(wateringPlants(new int[]{2, 4, 5, 1, 2}, 5));
    }

    public static int wateringPlants(int[] plants, int cap) {
        int steps = 0;
        int currWater = cap;

        int i = 0;
        while (i < plants.length) {
            steps++;

            if (currWater < plants[i]) {
                steps += (i) * 2;
                currWater = cap;
                continue;
            }
            if (currWater >= plants[i]) {
                currWater -= plants[i];
                i++;
            }
        }
        return steps;
    }


    
}