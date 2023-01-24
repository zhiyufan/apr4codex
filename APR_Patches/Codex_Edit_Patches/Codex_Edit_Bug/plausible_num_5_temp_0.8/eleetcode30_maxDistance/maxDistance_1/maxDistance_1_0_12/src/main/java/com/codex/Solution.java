package com.codex;

import java.util.*;

public class Solution {
    public static int maxDistance(int[] colors) {
        
        int distance = 0;
        int[] left = new int[4];
        int[] right = new int[4];
        Arrays.fill(left, Integer.MAX_VALUE);
        Arrays.fill(right, Integer.MIN_VALUE);

        for (int i = 0; i < colors.length; i++) {
            left[colors[i]-1] = Math.min(left[colors[i]-1], i);
            right[colors[i]-1] = Math.max(right[colors[i]-1], i);
        }

        for (int i = 1; i <= 3; i++) {
            distance = Math.max(distance, Math.abs(left[i] - right[i]));
        }

        return distance;
    }

    public static int maxDistance(int[] colors) {
        int distance = 0;
        int temp = 0;
        for (int i = 0; i < colors.length; i++) {
            if (colors[i] == 2) {
                distance += temp;
                temp = 0;
            } else if (colors[i] == 3) {
                temp = 0;
            } else {
                temp += 1;
            }
        }

        temp = 0;
        for (int i = colors.length - 1; i >= 0; i--) {
            if (colors[i] == 2) {
                distance += temp;
                temp = 0;
            } else if (colors[i] == 3) {
                temp = 0;
            } else {
                temp += 1;
            }
        }

        return distance;
    }
}