package com.codex;

import java.util.*;

public class Solution {
    public static int maxDistance(int[] colors) {
        /** There are n houses evenly lined up on the street, and each house is beautifully painted. You are given a 0-indexed integer array colors of length n, where colors[i] represents the color of the ith house.
         * Return the maximum distance between two houses with different colors.
         * The distance between the ith and jth houses is abs(i - j), where abs(x) is the absolute value of x.
         */

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

    }