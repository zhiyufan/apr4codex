package com.codex;

import java.util.*;

public class Solution {
    public static int maxDistance(int[] colors) {
        
        int distance = 0;
        HashMap<Integer, Integer> minLeft = new HashMap<>();
        HashMap<Integer, Integer> maxRight = new HashMap<>();

        for (int i = 0; i < colors.length; i++) {
            if (minLeft.containsKey(colors[i])) {
                minLeft.put(colors[i], Math.min(minLeft.get(colors[i]), i));
            } else {
                minLeft.put(colors[i], i);
            }
        }

        for (int i = colors.length - 1; i >= 0; i--) {
            if (maxRight.containsKey(colors[i])) {
                maxRight.put(colors[i], Math.max(maxRight.get(colors[i]), i));
            } else {
                maxRight.put(colors[i], i);
            }
        }

        for (int i = 0; i < colors.length; i++) {
            distance = Math.max(distance, Math.abs(i - left.get(colors[i])));
            distance = Math.max(distance, Math.abs(i - right.get(colors[i])));
        }

        return distance;
    }

    
}