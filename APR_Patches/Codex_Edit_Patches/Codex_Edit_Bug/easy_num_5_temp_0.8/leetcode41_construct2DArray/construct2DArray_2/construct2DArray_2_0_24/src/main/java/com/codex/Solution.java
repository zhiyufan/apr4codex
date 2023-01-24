package com.codex;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        
        int[][] myArray = construct2DArray(new int[]{1, 2, 3, 4, 5, 6}, 2, 3);
        System.out.println(Arrays.deepToString(myArray));
        
        int[][] myArray2 = construct2DArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, 2, 0);
        System.out.println(Arrays.deepToString(myArray2));
        
        int[][] myArray3 = construct2DArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, 2, 4);
        System.out.println(Arrays.deepToString(myArray3));
    }
    
    
    public static int[][] construct2DArray(int[] original, int m, int n) {
        
        int[][] result = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i * n + j < original.length) {
                    result[i][j] = original[i * n + j];
                }
            }
        }
        return result;
    }

    
}