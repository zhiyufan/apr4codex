package com.codex;

import java.util.*;

public class Solution {
    /**
     * Given an array of integers, return the maximum distance between two occurrences of the same element in the array.
     * 
     * Example:
     * Given array [2, 3, 3, 5, 5, 5, 4, 12, 12], the output should be 5. The maximum distance between two occurrences of the same element is between the two 5s, which is 5.
     * 
     * @param colors
     * @return
     */
    public static int maxDistance(int[] colors) {
        
        int distance = 0;
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

        for (int i = 0; i < colors.length; i++) {
            distance = Math.max(distance, Math.abs(i - left.get(colors[i])));
            distance = Math.max(distance, Math.abs(i - right.get(colors[i])));
        }

        return distance;
    }
}