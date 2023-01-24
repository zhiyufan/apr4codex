package com.codex;

import java.util.*;

public class Solution {
    public static int maxDistance(int[] colors) {
        
        if (colors == null || colors.length == 0) {
            return -1;
        }

        int maxDistance = 0;
        Map<Integer, Integer> leftMap = new HashMap<>();
        Map<Integer, Integer> rightMap = new HashMap<>();

        for (int i = 0; i < colors.length; i++) {
            if (!leftMap.containsKey(colors[i])) {
                leftMap.put(colors[i], i);
            }
        }

        for (int i = colors.length - 1; i >= 0; i--) {
            if (!rightMap.containsKey(colors[i])) {
                rightMap.put(colors[i], i);
            }
        }

        for (int i = 0; i < colors.length; i++) {
            maxDistance = Math.max(maxDistance, Math.abs(i - leftMap.get(colors[i])));
            maxDistance = Math.max(maxDistance, Math.abs(i - rightMap.get(colors[i])));
        }
        
        return maxDistance;
    }
    
    /* Simplified version
    public static int maxDistance(int[] colors) {
        
        int distance = 0;
        HashMap<Integer, Integer> left = new HashMap<>();
        HashMap<Integer, Integer> right = new HashMap<>();

        for (int i = 0; i < colors.length; i++) {
            if (!left.containsKey(colors[i]))
                left.put(colors[i], i);
        }

        for (int i = colors.length - 1; i >= 0; i--) {
            if (!right.containsKey(colors[i]))
                right.put(colors[i], i);
        }

        for (int i = 0; i < colors.length; i++) {
            distance = Math.max(distance, Math.abs(i - left.get(colors[i])));
            distance = Math.max(distance, Math.abs(i - right.get(colors[i])));
        }

        return distance;
    }

    
    */
}