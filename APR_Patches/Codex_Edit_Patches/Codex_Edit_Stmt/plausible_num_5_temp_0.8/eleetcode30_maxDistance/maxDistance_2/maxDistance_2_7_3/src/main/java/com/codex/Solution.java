package com.codex;

import java.util.*;

public class Solution {
    //with -1 and maxDist , lastColorPos
    

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


    //without -1 and maxDist , lastColorPos
     public static int maxDistance(int[] colors) {
        int n = colors.length;
        int lastColor = -1;
        int lastColorPos = -1;
        for (int i = 0; i < n; i++) {
            if (colors[i] != lastColor) {
                if (lastColor != -1) {
                    //maxDist = Math.max(maxDist, i - lastColorPos);
                    return i - lastColorPos;
                }
                lastColor = colors[i];
                lastColorPos = i;
            }
        }
        return -1;
    }

    
        return maxDist;
    }

    
}