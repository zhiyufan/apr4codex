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
                int dist = (lastColor != -1) ? i - lastColorPos : i + 1;
                maxDist = Math.max(maxDist, dist);
                lastColor = colors[i];
                lastColorPos = i;
            }
        }
        return maxDist;
    }

    
}