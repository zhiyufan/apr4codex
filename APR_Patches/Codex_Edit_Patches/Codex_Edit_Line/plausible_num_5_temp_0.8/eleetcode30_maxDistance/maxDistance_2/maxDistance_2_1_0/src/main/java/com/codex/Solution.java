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

        public  int maxDistance(int[] colors) {
        int n = colors.length;
        int[] minLastIndex = new int[2];
        int[] maxLastIndex = new int[2];
        Arrays.fill(minLastIndex, -1);
        Arrays.fill(maxLastIndex, -1);
        int maxDist = 0;
        for (int i = 0; i < n; i++) {
            int color = colors[i] - 1;
            maxDist = Math.max(maxDist, i - minLastIndex[color]);
            minLastIndex[color] = Math.min(minLastIndex[color], i);
            maxDist = Math.max(maxDist, maxLastIndex[color]);
            maxLastIndex[color] = Math.max(maxLastIndex[color], i);
        }
        return maxDist;
    }
        }
        return maxDist;
    }

    
}