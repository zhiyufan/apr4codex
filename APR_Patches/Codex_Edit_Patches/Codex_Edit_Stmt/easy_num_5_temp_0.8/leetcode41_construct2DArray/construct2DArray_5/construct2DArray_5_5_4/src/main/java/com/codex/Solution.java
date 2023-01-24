package com.codex;

import java.util.*;

public class Solution {
    public static int[][] construct2DArray(int[] original, int m, int n) {
        

        int[][] result = new int[n][m];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                if (i * result[0].length + j < original.length) {
                    result[i][j] = original[i * result[0].length + j];
                } else {
                    return new int[0][0];
                }
            }
        }
        return result;
    }

    
}