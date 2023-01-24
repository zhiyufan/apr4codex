package com.codex;

import java.util.*;

public class Solution {
    public static int maxDistance(int[] colors) {
        
        int[] left = new int[colors.length];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < colors.length; i++) {
            left[i] = map.containsKey(colors[i]) ? map.get(colors[i]) : -1;
            map.put(colors[i], i);
        }

        int[] right = new int[colors.length];
        map.clear();
        for (int i = colors.length - 1; i >= 0; i--) {
            right[i] = map.containsKey(colors[i]) ? map.get(colors[i]) : colors.length;
            map.put(colors[i], i);
        }
        
        int max = 0;
        for (int i = 0; i < colors.length; i++) {
            int distance = right[i] - left[i] - 1;
            max = Math.max(max, distance);
        }
        return max;
    }
        }

        int max = 0;
        for (int i = 0; i < colors.length; i++) {
            int distance = i - left[i];
            max = Math.max(max, distance);
        }
        return max;
    }

    
}