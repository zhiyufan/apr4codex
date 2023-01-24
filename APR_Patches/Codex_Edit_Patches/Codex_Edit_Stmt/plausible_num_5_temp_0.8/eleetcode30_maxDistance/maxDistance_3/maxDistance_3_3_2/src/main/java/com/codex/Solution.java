package com.codex;

import java.util.*;

public class Solution {
    public static int maxDistance(int[] colors) {
        
        int[] left = new int[colors.length];
        int[] right = new int[colors.length];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < colors.length; i++) {
            if (!map.containsKey(colors[i])) {
                map.put(colors[i], i);
            }
            
            left[i] = map.containsKey(colors[i]) ? map.get(colors[i]) : -1;
        }
        
        map.clear();
        for (int i = colors.length - 1; i >= 0; i--) {
            if (!map.containsKey(colors[i])) {
                map.put(colors[i], i);
            }
            
            right[i] = map.containsKey(colors[i]) ? map.get(colors[i]) : -1;
        }

        int max = 0;
        for (int i = 0; i < colors.length; i++) {    
            int distance = i - left[i] + right[i] - i;
            max = Math.max(max, distance);
        }
        return max;
    }
}