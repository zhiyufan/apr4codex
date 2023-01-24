package com.codex;

import java.util.*;

public class Solution {
public static int maxDistance(int[] colors) {
    if (colors == null || colors.length == 0) {
        return 0;
    }
    int[] left = new int[colors.length];
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < colors.length; i++) {
        left[i] = map.containsKey(colors[i]) ? map.get(colors[i]) : -1;
        map.put(colors[i], i);
    }
    
    map.clear();
    
    int[] right = new int[colors.length];
    for (int i = colors.length - 1; i >= 0; i--) {
        right[i] = map.containsKey(colors[i]) ? map.get(colors[i]) : -1;
        map.put(colors[i], i);
    }
    
    int max = 0;
    for (int i = 0; i < colors.length; i++) {
        max = Math.max(max, i - left[i]);
        max = Math.max(max, right[i] - i);
    return max;
}
    }

    
}