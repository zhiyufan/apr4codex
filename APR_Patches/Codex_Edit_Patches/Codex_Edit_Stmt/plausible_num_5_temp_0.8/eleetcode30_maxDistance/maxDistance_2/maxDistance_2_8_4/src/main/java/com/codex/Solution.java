package com.codex;

import java.util.*;

public class Solution {
    // O(n) time
    // O(1) space
    public static int maxDistance(int[] colors) {
        

        int n = colors.length;
        int maxDist = 0;
        int lastColor = colors[0];
        int lastColorPos = -1;
        for (int i = 1; i < n; i++) {
            if (colors[i] != lastColor) {
                if (lastColorPos != -1) {
                    maxDist = Math.max(maxDist, i - lastColorPos);
                }
                lastColor = colors[i];
                lastColorPos = i;
            }
        }
        return maxDist;
    }

    
}