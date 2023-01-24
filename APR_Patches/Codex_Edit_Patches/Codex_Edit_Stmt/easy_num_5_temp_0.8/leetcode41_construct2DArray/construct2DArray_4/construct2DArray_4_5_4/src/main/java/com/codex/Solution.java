package com.codex;

import java.util.*;

public class Solution {
    public static int[][] construct2DArray(int[] original, int m, int n) {
        
        int[][] arr = new int[m][n];
        int k = 0;
        for (int i = 0; i < m && k < original.length; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = original[k];
                k += 1;
            }
        }
        return arr;
    }

    
}