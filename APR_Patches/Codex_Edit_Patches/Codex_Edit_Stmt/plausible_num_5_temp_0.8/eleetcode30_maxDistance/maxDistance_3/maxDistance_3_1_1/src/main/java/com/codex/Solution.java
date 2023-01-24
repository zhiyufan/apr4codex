package com.codex;

import java.util.*;

public class Solution {
    // 1. Pre-process the array to store the left most index for each color
    // 2. Calculate the distance between i and the left most index of color i
    // 3. Take the max of all the calculated "distance"
    public static int maxDistance(int[] colors) {
        
        int[] left = new int[colors.length];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < colors.length; i++) {
            left[i] = map.containsKey(colors[i]) ? map.get(colors[i]) : -1;
            map.put(colors[i], i);
        }

        int max = 0;
        for (int i = 0; i < colors.length; i++) {
            int distance = i - left[i];
            max = Math.max(max, distance);
        }
        return max;
    }

    
}