package com.codex;

import java.util.*;

public class Solution {
    public static int maxDistance(int[] colors) {
        
        int[] left = new int[colors.length + 1];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < colors.length; i++) {
            left[i] = map.containsKey(colors[i]) ? map.get(colors[i]) : i;
            map.put(colors[i], i);
        }

        int max = 0;
        for (int i = 1; i <= colors.length; i++) {
            int distance = i - left[i] - 1;
            max = Math.max(max, left[i] - distance);
        }
        return max;
    }

    
}