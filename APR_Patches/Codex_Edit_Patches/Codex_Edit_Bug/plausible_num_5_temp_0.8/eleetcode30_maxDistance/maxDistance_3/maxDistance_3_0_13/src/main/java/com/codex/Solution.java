package com.codex;

import java.util.*;

public class Solution {
public class Main {
    public static int maxDistance(int[] colors) {
        if (colors == null || colors.length == 0) {
            return 0;
        }
        int n = colors.length;
        int[] left = new int[colors.length];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            left[i] = map.containsKey(colors[i]) ? map.get(colors[i]) : i;
            map.put(colors[i], i);
        }

        int max = 0;
        for (int i = 0; i < n; i++) {
            int distance = i - left[i];
            max = Math.max(max, distance);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] colors = {0, 0, 1, 1, 2, 2};
        System.out.println(maxDistance(colors));
    }
}
}