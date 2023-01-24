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

        int max = 0;
        for (int i = 0; i < colors.length; i++) {
            int distance = i - left[i];
            max = Math.max(max, distance);
        }
        return max;

    public static int maxDistance2(int[] colors) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < colors.length; i++) {
            List<Integer> list = map.getOrDefault(colors[i], new ArrayList<>());
            list.add(i);
            map.put(colors[i], list);
        }

        int max = 0;
        for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
            List<Integer> list = entry.getValue();
            for (int i = 0; i < list.size() - 1; i++) {
                max = Math.max(max, list.get(i + 1) - list.get(i));
            }
        }
        return max;
    }
    }

    
}