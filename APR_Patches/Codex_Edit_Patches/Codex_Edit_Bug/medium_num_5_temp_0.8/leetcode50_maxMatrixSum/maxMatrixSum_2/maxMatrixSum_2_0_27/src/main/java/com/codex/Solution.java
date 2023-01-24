package com.codex;

import java.util.*;

public class Solution {
public static long largestSquare(String[] matrix) {
        int n = matrix.length;
        int m = matrix[0].length();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {
                arr[i][j] = matrix[i].charAt(j) == '0' ? 0 : 1;
            }
        }
        for (int i = 1; i < n; ++i) {
            for (int j = 1; j < m; ++j) {
                arr[i][j] = Integer.min(arr[i - 1][j - 1], Integer.min(arr[i - 1][j], arr[i][j - 1])) + 1;
            }
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                sums[i][j] += Math.max(sums[i - 1][j], sums[i][j - 1]);
            }
        }
        return sums[n - 1][n - 1];
    }

    
}