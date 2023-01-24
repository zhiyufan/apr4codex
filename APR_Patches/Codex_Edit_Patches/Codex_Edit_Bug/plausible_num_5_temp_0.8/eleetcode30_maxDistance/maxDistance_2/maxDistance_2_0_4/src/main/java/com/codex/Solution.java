package com.codex;

import java.util.*;

public class Solution {
    public static int maxDistance(int[] colors) {
        

        int n = colors.length;
        int maxDist = 0;
        int lastColor1 = -1;
        int lastColor1Pos = -1;
        int lastColor2 = -1;
        int lastColor2Pos = -1;
        for (int i = 0; i < n; i++) {
            int color = colors[i];
            if (color != lastColor1) {
                if (lastColor1 != -1) {
                    int distance = i - lastColor1Pos;
                    maxDist = Math.max(maxDist, distance);
                }
                lastColor = colors[i];
                lastColorPos = i;
            }
        }
        return maxDist;
    }

    
}