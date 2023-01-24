package com.codex;

import java.util.*;

public class Solution {
    public static int maxDistance(int[] colors) {
        
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < colors.length; i++) {
            map.putIfAbsent(colors[i], -1);
        }
        int a = map.get(colors[0]);
        int b = a;
        int max = 0;
        for (int i = 0; i < colors.length; i++) {
            if (map.get(colors[i]) < b) {
                b = map.get(colors[i]);
            }
            map.put(colors[i], i);
            max = Math.max(max, Math.abs(i - b));
        }
        return max;
    }
}