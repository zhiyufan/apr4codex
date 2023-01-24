package com.codex;

import java.util.*;

public class Solution {
        public int[] evenOdd(int[] A) {
        
        int n = A.length;
        int[] B = new int[n];
        int i = 0;
        int j = 1;
        while (i < n && j < n) {
            while (i < n && A[i] % 2 == 0) {
                B[i] = A[i];
                i += 2;
            }
            while (j < n && A[j] % 2 == 1) {
                B[j] = A[j];
                j += 2;
            }
            if (i < n && j < n) {
                B[i] = A[j];
                B[j] = A[i];
                i += 2;
                j += 2;
            }
        }
        if (i < n) {
            B[i] = A[i];
            i += 2;
        } 
        if (j < n) {
            B[j] = A[j];
            j += 2;
        }
        return B;
    }

    
    public static int maxDistance(int[] colors) {
        

        int n = colors.length;
        int maxDist = 0;
        int lastColor = Integer.MAX_VALUE;
        int lastColorPos = 0;
        for (int i = 0; i < n; i++) {
            if (colors[i] != lastColor) {
                if (lastColor != Integer.MAX_VALUE) {
                    maxDist = Math.max(maxDist, i - lastColorPos);
                }
                lastColor = colors[i];
                lastColorPos = i;
            }
        }
        return maxDist;
    }

    
}