package com.codex;

import java.util.*;

public class Solution {
    public static int maxDistance(int[] colors, int target) {
        
        int[] left = new int[colors.length];
        Map<Integer, Integer> map = new HashMap<>();  // <color, index>
        for (int i = 0; i < colors.length; i++) {
            if (colors[i] == target) {
                left[i] = i;
            } else {
                left[i] = map.containsKey(colors[i]) ? map.get(colors[i]) : -1;
                map.put(colors[i], i);
            }
        }

        int max = 0;
        for (int i = 0; i < colors.length; i++) {
            int distance = i - left[i];
            max = Math.max(max, distance);
        }
        return max;
    }

    
}