package com.codex;

import java.util.*;

public class Solution {
    public static int maxDistance(int[] colors) {
        
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < colors.length; i++) {
            if (!map.containsKey(colors[i])) {
                map.put(colors[i], i);
            }
        }

        int max = 0;
        for (int i = 0; i < colors.length; i++) {
            int distance = i - map.get(colors[i]);
            max = Math.max(max, distance);
        }
        return max;
    }

    
}