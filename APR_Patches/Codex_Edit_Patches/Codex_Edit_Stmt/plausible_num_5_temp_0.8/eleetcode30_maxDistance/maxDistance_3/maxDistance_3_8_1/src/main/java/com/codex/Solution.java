package com.codex;

import java.util.*;

public class Solution {
    public static int maxDistance(int[] colors) {
        int max = 0;
        int last = -1;
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < colors.length; i++) {
            if (set.contains(colors[i])) {
                max = Math.max(max, i - last);
            } else {
                set.add(colors[i]);
            }
            last = Math.max(last, map.getOrDefault(colors[i], -1));
            map.put(colors[i], i);
        }
        return max;
    }


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
    }

    
}