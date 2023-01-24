package com.codex;

import java.util.*;

public class Solution {
  public static int convert(int[][] original) {
    if (original.length == 0 || original[0].length == 0) return 0;
        int height = original.length;
        int width = original[0].length;
        int result = 0;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                int num = original[i][j];
                int m = height - 1 - i;
                int n = width - 1 - j;
                result += num * Math.pow(10, m * width + n);
            }
        }
        return result;
    }


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