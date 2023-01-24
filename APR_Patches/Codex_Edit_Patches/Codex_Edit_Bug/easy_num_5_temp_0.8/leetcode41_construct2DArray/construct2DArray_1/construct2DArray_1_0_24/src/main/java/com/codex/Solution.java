package com.codex;

import java.util.*;

public class Solution {
    public static int[][] construct2DArray(int[] original, int m, int n) {
        
        int[][] result = new int[m][n];
        if (original.length != m * n) return result;
        for (int row = 0; row < original.length; row++) {
            int col = row % n;
            result[(row - col) / n][col] = original[row];
            }
        }
        return result;
}