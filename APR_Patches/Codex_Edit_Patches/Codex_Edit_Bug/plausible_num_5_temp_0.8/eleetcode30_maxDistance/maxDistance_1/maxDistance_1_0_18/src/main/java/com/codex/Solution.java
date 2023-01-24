package com.codex;

import java.util.*;

public class Solution {
    public static int maxDistance(int[] colors, int color) {
        
        int distance = 0;
        int color = 3;
        HashMap<Integer, Integer> left = new HashMap<>();
        HashMap<Integer, Integer> right = new HashMap<>();

        for (int i = 0; i < colors.length; i++) {
            if (!left.containsKey(colors[i]))
                left.put(colors[i], i);
        }

        for (int i = colors.length - 1; i >= 0; i--) {
            if (!right.containsKey(colors[i]))
                right.put(colors[i], i);
        }

        for (int i = 0; i < colors.length; i++)
        {
            if (colors[i] == color)
                distance = Math.max(distance, Math.abs(i - left.get(colors[i])));

            if (colors[i] == color)
                distance = Math.max(distance, Math.abs(i - right.get(colors[i])));
        }

        return distance;
    }

    
}