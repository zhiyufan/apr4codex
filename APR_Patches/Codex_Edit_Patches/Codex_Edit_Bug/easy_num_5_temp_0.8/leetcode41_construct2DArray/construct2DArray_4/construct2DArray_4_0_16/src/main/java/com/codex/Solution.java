package com.codex;

import java.util.*;

public class Solution {
    public static int[][] construct2DArray(int[] original, int m, int n) {      
        int[][] arr = new int[m][n];
        
        for (int k = 0, i = 0, j = 0; k < original.length; k++) {
            arr[i][j] = original[k];
            j++;
            if (j == n) {
                j = 0;
                i++;
            }
        }
        return arr;
    }

    
}