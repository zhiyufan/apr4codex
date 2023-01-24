package com.codex;

import java.util.*;

public class Solution {
    public static int maxDistance(int[] colors) {
        
        int[] right = new int[colors.length];
        Map<Integer, Integer> rIndex = new HashMap<>();
        for (int i = 0; i < colors.length; i++) {
            right[i] = rIndex.containsKey(colors[i]) ? rIndex.get(colors[i]) : -1;
            rIndex.put(colors[i], i);
        }

        int max = 0;
        for (int i = 0; i < colors.length; i++) {
            int distance = right[i] - i;
            max = Math.max(max, distance);
        }
        return max;
    }

    
}