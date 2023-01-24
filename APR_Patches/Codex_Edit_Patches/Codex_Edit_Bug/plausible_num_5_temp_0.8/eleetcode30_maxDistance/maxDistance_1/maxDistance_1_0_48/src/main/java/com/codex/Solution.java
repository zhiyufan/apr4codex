package com.codex;

import java.util.*;

public class Solution {
    public static int maxDistance(int[] colors) {
        
        int distance = 0;
        HashMap<Integer, Integer> left = new HashMap<>();
        int[] result = new int[colors.length];
        
        HashMap<Integer, Integer> right = new HashMap<>();

        for (int i = 0; i < colors.length; i++) {
            if (!left.containsKey(colors[i]))
                left.put(colors[i], i);
        }

        for (int i = colors.length - 1; i >= 0; i--) {
            if (!right.containsKey(colors[i]))
                right.put(colors[i], i);
        }

        }

        int maxDistance = 0;
        for (int i = 0; i < result.length; i++) {
        	maxDistance = Math.max(maxDistance, Math.max(i - left.get(colors[i]), right.get(colors[i]) - i));
        }

        return maxDistance;
    }

    
}