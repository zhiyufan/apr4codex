package com.codex;

import java.util.*;

public class Solution {
    public static int maxDistance(List<Integer> colors) {
        

        int n = colors.size();
        int maxDist = 0;
        int lastColor = -1;
        int lastColorPos = -1;
        for (int i = 0; i < n; i++) {
            if (colors.get(i) != lastColor) {
                if (lastColor != -1) {
                    maxDist = Math.max(maxDist, i - lastColorPos);
                }
                lastColor = colors.get(i);
                lastColorPos = i;
            }
        }
        return maxDist;
    }

    
}