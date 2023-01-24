package com.codex;

import java.util.*;

public class Solution {

public static int maxDistance(int[] colors) {
        

        int n = colors.length;
        int maxDist = 0;
        int lastColor = Integer.MIN_VALUE;
        int lastColorPos = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (colors[i] != lastColor) {
                if (lastColor != Integer.MIN_VALUE) {
                    maxDist = Math.max(maxDist, i - lastColorPos);
                }
                lastColor = colors[i];
                lastColorPos = i;
            }
        }
        return maxDist;
    }
}