package com.codex;

import java.util.*;

public class Solution {
public static int maxDistance(int[] colors) {
        

        int n = colors.length;
        int lastLastColorPos = -1;
        int maxDist = 0;
        int lastColor = -1;
        int lastColorPos = -1;
        for (int i = 0; i < n; i++) {
            if (colors[i] != lastColor) {
                    lastLastColorPos = lastColorPos;
                if (lastColorPos != -1) {
                    maxDist = Math.max(maxDist, i - lastColorPos);
                }
                lastColor = colors[i];
                lastColorPos = i;
        maxDist = Math.max(maxDist, n - lastLastColorPos - 1);
            }
        }
        return maxDist;

        
    
    }

    
}