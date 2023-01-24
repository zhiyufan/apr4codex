package com.codex;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        int[] colors = {1,1,1,1,1,1,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3};
        System.out.println(maxDistance(colors));
    }


    public static int maxDistance(int[] colors) {

        int[] left = new int[colors.length]; // store the latest index of i-th color
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < colors.length; i++) {
            if (map.containsKey(colors[i])) {
                left[i] = map.get(colors[i]);
            } else {
                left[i] = -1;
            }

            map.put(colors[i], i);
        }

        int left = 0;
        int max = 0;
        for (int i = 0; i < colors.length; i++) {
            int distance = i - left;
            max = Math.max(max, Math.max(distance, left[i]));
            left = left[i];
        }
        return max;
    }
}