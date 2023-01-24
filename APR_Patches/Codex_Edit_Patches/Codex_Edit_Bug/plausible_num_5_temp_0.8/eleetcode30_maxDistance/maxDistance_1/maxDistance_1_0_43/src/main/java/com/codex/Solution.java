package com.codex;

import java.util.*;

public class Solution {
    public static int maxDistance(int[] colors) {
        
        int distance = 0;
        HashMap<Integer, Integer> first = new HashMap<>();
        HashMap<Integer, Integer> second = new HashMap<>();

        for (int i = 0; i < colors.length; i++) {
            if (!first.containsKey(colors[i]))
                first.put(colors[i], i);
        }

        for (int i = colors.length - 1; i >= 0; i--) {
            if (!second.containsKey(colors[i]))
                second.put(colors[i], i);
        }

        for (int i = 0; i < colors.length; i++) {
            distance = Math.max(distance, Math.abs(i - first.get(colors[i])));
            distance = Math.max(distance, Math.abs(i - second.get(colors[i])));
        }

        return distance;
    }

    
}