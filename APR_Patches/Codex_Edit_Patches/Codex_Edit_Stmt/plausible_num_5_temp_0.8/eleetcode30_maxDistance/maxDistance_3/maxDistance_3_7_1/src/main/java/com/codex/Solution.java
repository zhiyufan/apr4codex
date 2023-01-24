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
        for (int i = colors.length - 1; i >= 0; i--) {
            int distance = i - left[i];
            int right = map.containsKey(colors[i]) ? map.get(colors[i]) : -1;
            max = Math.max(max, (right != -1 ? distance : max) + (right != -1 ? right - i : 0));
            map.put(colors[i], i);
        }
        return max;
    }

    
}