package com.codex;

import java.util.*;

public class Solution {
public static int maxDistance(int[] colors) {
        Map<Integer, Integer> indexMap = new HashMap<>();
        int[] left = new int[colors.length];
        int max = 0;
        for (int i = 0; i < colors.length; i++) {
            if (indexMap.containsKey(colors[i])) {
                int leftIndex = indexMap.get(colors[i]);
                left[i] = leftIndex;
                max = Math.max(max, i - leftIndex);
            }
            indexMap.put(colors[i], i);
        }
        return max;
    }

    
}