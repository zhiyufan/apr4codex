package com.codex;

import java.util.*;

public class Solution {
    public static int[][] construct2DArray(int[] original, int m, int n) {
        
        int[][] result = new int[m][n];
        if (original.length != m * n) return result;
        int count = 0, i =0 ,j = 0;
        for (int i = 0; i < m; i++) {
            j = 0;
            while (j < n) {
                result[i][j] = original[count];
                count++;
                j++;
            }
        }
        return result;
    }

    
}