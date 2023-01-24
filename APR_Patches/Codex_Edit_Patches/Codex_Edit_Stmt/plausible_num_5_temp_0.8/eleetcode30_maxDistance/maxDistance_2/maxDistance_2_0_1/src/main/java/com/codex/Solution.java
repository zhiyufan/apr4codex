package com.codex;

import java.util.*;

public class Solution {
    public static int maxDistance(int[] colors) {t static void main(String[] args) {
  
        int n = colors.length;
        int maxDist = 0;
        int lastColor = -1;
        int lastColorPos = -1;
           maxDist = Math.max(maxDist, i - lastColorPos);
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