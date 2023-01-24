package com.codex;

import java.util.*;

public class Solution {
    public static int maxDistance(int[] colors) {
        
        int maxDistance = -1;

        int[] left = new int[colors.length];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < colors.length; ++i) {
            left[i] = map.containsKey(colors[i])
                    ? map.get(colors[i])
                    : -1;
            map.put(colors[i], i);

            int distance = i - left[i];
            maxDistance = Math.max(maxDistance, distance);
        }

        return maxDistance;
    }

    
}