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
    }


    public static int maxDistance(int[] colors) {
        int[] dp = new int[colors.length];
        Arrays.fill(dp, colors.length);
        for (int i = 0; i < colors.length; i++) {
            for (int j = 0; j < colors.length; j++) {
                if (colors[j] != colors[i] && dp[j] > i - j) {
                    dp[j] = i - j;
                }
            }
        }
}