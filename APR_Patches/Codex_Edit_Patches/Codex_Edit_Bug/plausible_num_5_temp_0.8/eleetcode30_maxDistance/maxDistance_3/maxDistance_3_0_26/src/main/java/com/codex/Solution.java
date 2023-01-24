package com.codex;

import java.util.*;

public class Solution {
public static int maxDistance(int[] colors) {
        if (colors.length == 0 || colors.length == 1) {
            return 0;
        }
        
        int[] left = new int[colors.length];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < colors.length; i++) {
            left[i] = map.containsKey(colors[i]) ? map.get(colors[i]) : -1;
            map.put(colors[i], i);
        }

        int[] right = new int[colors.length];
        map.clear();
        int max = 0;
        for (int i = 0; i < colors.length; i++) {
            right[i] = map.containsKey(colors[i]) ? map.get(colors[i]) : -1;
            map.put(colors[i], i);
        }

        for (int i = 0; i < colors.length; i++) {
            if (right[i] != -1 && left[i] != -1) {
                int distance = Math.abs(right[i] - left[i]);
                max = Math.max(max, distance);
            } else if (right[i] != -1) {
                int distance = Math.abs(right[i] - i);
                max = Math.max(max, distance);
            } else if (left[i] != -1) {
                int distance = Math.abs(left[i] - i);
                max = Math.max(max, distance);
            }
        }
        return max;
    }
}