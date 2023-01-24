package com.codex;

import java.util.*;

public class Solution {
import java.util.stream.IntStream;

    public static int wateringPlants(int[] plants, int capacity) {
        int steps = plants.length > 0 ? 1 : 0;
        int water = capacity;
        for(int i = 0; i < plants.length; i++) {
            water -= plants[i];
            if(water < 0) {
                steps++;
                water = capacity;
                water -= plants[i];
            }
            if(i < plants.length - 1 && plants[i] > plants[i + 1]) {
                steps++;
                water = capacity;
            }
        }
        if(water != capacity) {
            steps++;
        }
        return steps;
    }

    public static void main(String[] args) {
        System.out.println(wateringPlants(new int[] {2, 4, 5, 1, 2}, 6));
    }
}