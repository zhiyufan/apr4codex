package com.codex;

import java.util.*;

public class Solution {
    public static int[][] construct2DArray(int[] original, int m, int n) {
        
        int[][] result = new int[m][n];
        for (int i = 0; i < m; i++) {//控制行
            for (int j = 0; j < n; j++) {//控制列
                if (i * n + j < original.length) {
                    result[i][j] = original[i * n + j];
                }
            }
        }
        return result;
    }

    
}