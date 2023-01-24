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

        int max = 0;
        for (int i = 0; i < colors.length; i++) {
            int distance = i - left[i];
            max = Math.max(max, distance);
        }
        return max;




    public static int maxDistance(int[] colors) {
        int max = 0;
        Map<Integer, Integer> left = new HashMap<>();
        Map<Integer, Integer> right = new HashMap<>();
        for (int i = 0; i < colors.length; i++) {
            if (!left.containsKey(colors[i])) {
                left.put(colors[i], i);
            }
            right.put(colors[i], i);
        }

        for (int i = 0; i < colors.length; i++) {
            max = Math.max(max, right.get(colors[i]) - left.get(colors[i]));
        }
        return max;
    }
    }

    
}