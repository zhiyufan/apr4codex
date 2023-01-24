package com.codex;

import java.util.*;

public class Solution {
    public static int[][] construct2DArray(int[] original, int m, int n) { 
        
        int[][] result = new int[m][n];
        if (original.length != m * n) return result;
        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = original[count];
                count++;
            }
        }
        return result;
    }

    
}