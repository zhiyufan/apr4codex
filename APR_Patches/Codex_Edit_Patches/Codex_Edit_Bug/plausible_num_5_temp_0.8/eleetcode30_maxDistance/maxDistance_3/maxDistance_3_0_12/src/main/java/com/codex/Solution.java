package com.codex;

import java.util.*;

public class Solution {
public static int maxDistance(int[] colors) {
        int[] left = new int[colors.length];
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < colors.length; i++) {
            set.add(colors[i]);
        }
        for (int i = 0; i < colors.length; i++) {
            left[i] = set.contains(colors[i]) ? i : -1;
            set.remove(colors[i]);
        }
        
        int maxDistance = 0;
        for (int i = 0; i < colors.length; i++) {
            maxDistance = Math.max(maxDistance, i - left[i]);
        }

        int max = 0;
        for (int i = 0; i < colors.length; i++) {
            int distance = i - left[i];
            max = Math.max(max, distance);
        }
        return max;
    }

    
}