package com.codex;

import java.util.*;

public class Solution {
    public static int[][] construct2DArray(int[] original, int m, int n) {
        if(m*n != original.length )
        return new int[0][0];

        int[][] result = new int[m][n];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                    result[i][j] = original[i * result[0].length + j];
                
            }
        }
        return result;
    }

    
}