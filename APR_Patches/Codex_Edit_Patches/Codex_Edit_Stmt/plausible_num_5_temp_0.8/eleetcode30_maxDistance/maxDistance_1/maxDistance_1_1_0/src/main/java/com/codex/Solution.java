package com.codex;

import java.util.*;

public class Solution {
    public static int maxDistance(int[] colors) {
        
        int distance = 0;
        HashMap<Integer, Integer> left = new HashMap<>();

        for (int i = 0; i < colors.length; i++) {
            if (!left.containsKey(colors[i]))
                left.put(colors[i], i);
        }

        for (int i = colors.length - 1; i >= 0; i--) {
            distance = Math.max(distance, Math.abs(i - left.get(colors[i])));
        }

        return distance;
    }

    
}