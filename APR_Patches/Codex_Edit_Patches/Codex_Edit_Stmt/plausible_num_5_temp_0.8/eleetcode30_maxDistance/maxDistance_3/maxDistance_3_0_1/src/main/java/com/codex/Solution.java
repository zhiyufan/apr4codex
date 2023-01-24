package com.codex;

import java.util.*;

public class Solution {
    public static int maxDistance(int[] colors) {
        
        int[] left = new int[colors.length];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < colors.length; i++) {
            left[i] = map.containsKey(colors[i]) ? map.get(colors[i]) : -1;
            map.put(colors[i], i);
        }
        map.clear();

        int max = 0;
        for (int i = 0; i < colors.length; i++) {
            int distance = left[i] == -1 ? 0 : i - left[i];
            if (distance > max) {
                max = distance;
            }
        }
        return max;
    }

    
}