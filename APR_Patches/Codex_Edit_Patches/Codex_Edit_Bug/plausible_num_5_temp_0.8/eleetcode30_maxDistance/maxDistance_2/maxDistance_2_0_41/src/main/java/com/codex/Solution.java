package com.codex;

import java.util.*;

public class Solution {
    public static int maxDistance(int[] colors) {
        

        int n = colors.length;
        int maxDist = 0;
        int lastColor = -1;
        int lastColorPos = -1;
        for (int i = 0; i < n; i++) {
            if (colors[i] != lastColor) {
                if (lastColor != -1) {
                    maxDist = Math.max(maxDist, i - lastColorPos);
                }
                lastColor = colors[i];
                lastColorPos = i;
            }
        }
        return maxDist;


int maxDistance(int[] colors) {
    // max distance pair (a, b) such that colors[a] == colors[b]
    // (a, b) is a valid pair if |a - b| > 1
    int n = colors.length;
    int[] left = new int[n];
    int[] right = new int[n];
    Arrays.fill(left, -1);
    Arrays.fill(right, -1);
    for (int i = 1; i < n; i++) {
        if (colors[i - 1] == colors[i]) {
            left[i] = i - 1;
        } else {
            left[i] = left[i - 1];
        }
    }
    for (int i = n - 2; i >= 0; i--) {
        if (colors[i] == colors[i + 1]) {
            right[i] = i + 1;
        } else {
            right[i] = right[i + 1];
        }
    }
    int maxDist = -1;
    for (int i = 0; i < n; i++) {
        if (left[i] != -1 && right[i] != -1) {
            maxDist = Math.max(maxDist, right[i] - left[i] + 1);
        }
    }
    return maxDist;
}
    }

    
}