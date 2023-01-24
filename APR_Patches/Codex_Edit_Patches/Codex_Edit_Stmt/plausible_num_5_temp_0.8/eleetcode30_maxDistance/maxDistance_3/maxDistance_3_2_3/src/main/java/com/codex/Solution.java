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
            int leftIdx = map.containsKey(colors[i]) ? map.get(colors[i]) : -1;
            left[i] = left[i] > leftIdx ? left[i] : leftIdx;
        for (int i = 0; i < colors.length; i++) {
            int distance = i - left[i];
            max = Math.max(max,distance);
            map.put(colors[i], i);
        }
        return max;
    }

    
}