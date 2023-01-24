package com.codex;

import java.util.*;

public class Solution {
static int maxDistance(int[] colors) {
        int n = colors.length, minDis = n;
        int[] left = new int[3], right = new int[3];
        Arrays.fill(left, n);
        Arrays.fill(right, n);
        for(int i = 0; i < n; i++) {
            left[colors[i]] = Math.min(left[colors[i]], i);
            right[colors[i]] = Math.min(right[colors[i]], n - i - 1);
        }
        for(int i = 0; i < 3; i++) {
            for(int j = i + 1; j < 3; j++) {
                minDis = Math.min(minDis, left[j] - right[i]);
                minDis = Math.min(minDis, left[i] - right[j]);
            }
        }
        return minDis;
    }
}