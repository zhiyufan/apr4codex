package com.codex;

import java.util.*;

public class Solution {
    public static int[][] construct2DArray(int[] original, int m, int n) {
        

        int[][] result = new int[m][n];
        if (original.length > m * n) {
            return new int[0][0];
        } else {
            int k = 0;
            for (int i = 0; i < result.length; i++) {
                for (int j = 0; j < result[0].length; j++) {
                    if (k < original.length) {
                        result[i][j] = original[k];
                        k++;
                    }
            return result;
                }
            }
        }
    }

    
}