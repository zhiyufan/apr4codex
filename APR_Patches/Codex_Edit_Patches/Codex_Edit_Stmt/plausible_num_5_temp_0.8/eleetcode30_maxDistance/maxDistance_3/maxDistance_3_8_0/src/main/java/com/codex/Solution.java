package com.codex;

import java.util.*;

public class Solution {
    public static int maxDistance(int[] colors) {
        
        Map<Integer, Integer> map = new HashMap<>();
        int[] left = new int[colors.length];
        for (int i = 0; i < colors.length; i++) {
            if (map.containsKey(colors[i])) {
                left[i] = map.get(colors[i]);
            }
            else {
                left[i] = -1;
            }
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