package com.codex;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        int[] colors = {1, 2, 3, 2, 3, 2, 5, 2, 3};
        int maxDistance = maxDistance(colors);
        System.out.println(maxDistance);
    }
    
    public static int maxDistance(int[] colors) {
        
        int[] left = new int[colors.length];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < colors.length; i++) {
            left[i] = map.containsKey(colors[i]) ? map.get(colors[i]) : -1;
            map.put(colors[i], i);
        }


        int max = 0;
        for (int i = 0; i < colors.length; i++) {
            if (left[i] != -1) {
                int distance = i - left[i];
                max = Math.max(max, distance);
            }
        }
        return max;
    }
}