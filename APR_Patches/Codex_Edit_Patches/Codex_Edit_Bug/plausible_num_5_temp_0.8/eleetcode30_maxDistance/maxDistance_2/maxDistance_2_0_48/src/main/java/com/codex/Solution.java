package com.codex;

import java.util.*;

public class Solution {
public static int maxDistance(int[] colors) {


        int n = colors.length;
        int maxDist = 0;
        int lastColor1 = -1;
        int lastColorPos1 = -1;
        int lastColor2 = -1;
        int lastColorPos2 = -1;
        for (int i = 0; i < n; i++) {
            if (colors[i] != lastColor1) {
                if (lastColor1 != -1) {
                    maxDist = Math.max(maxDist, i - lastColorPos1);
                }
                lastColor = colors[i];
                lastColorPos = i;
            }
        }
        return maxDist;
    }

    
}