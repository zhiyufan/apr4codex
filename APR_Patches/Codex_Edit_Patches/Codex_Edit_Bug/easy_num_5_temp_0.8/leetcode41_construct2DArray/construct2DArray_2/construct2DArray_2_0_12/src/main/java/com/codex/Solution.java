package com.codex;

import java.util.*;

public class Solution {
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


    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4, 5, 6, 7, 8};
        int[][] result = construct2DArray(original, 2, 4);
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.printf("%4d", result[i][j]);
            }
            System.out.println();
        }
    }



    
}