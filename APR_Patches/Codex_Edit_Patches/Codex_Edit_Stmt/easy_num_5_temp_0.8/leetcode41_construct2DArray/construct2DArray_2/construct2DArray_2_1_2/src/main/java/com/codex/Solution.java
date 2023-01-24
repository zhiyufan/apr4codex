package com.codex;

import java.util.*;

public class Solution {
    public static int[][] construct2DArray(int[] original, int m, int n) {
        
        int[][] result = new int[m][n];  //m = 2, n = 5
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i * n + j < original.length) {  // i * n + j == 0, 1, 2, 3, 4, 5
                    result[i][j] = original[i * n + j];  //result[0][0] = original[0];
                                                         //result[0][1] = original[1];
                                                         //result[0][2] = original[2];
                                                         //result[0][3] = original[3];
                                                         //result[0][4] = original[4];
                                                         //result[1][0] = original[5];


                }
            }
        }
        return result;
    }

    
}