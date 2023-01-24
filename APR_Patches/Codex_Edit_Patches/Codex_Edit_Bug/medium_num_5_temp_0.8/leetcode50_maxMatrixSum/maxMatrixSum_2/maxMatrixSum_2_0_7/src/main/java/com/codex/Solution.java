package com.codex;

import java.util.*;

public class Solution {
public class Solution {
    public int maxMatrixSum(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] a = new int[m][n];
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                a[i][j] = matrix[i][j];
        for (int i = m - 1; i >= 0; i--)
            for (int j = n - 1; j >= 0; j--) {
                if (i + 1 < m && j + 1 < n)
                    a[i][j] += Math.max(a[i + 1][j], a[i][j + 1]);
                else if (i + 1 < m)
                    a[i][j] += a[i + 1][j];
                else if (j + 1 < n)
                    a[i][j] += a[i][j + 1];
                else
                    a[i][j] = matrix[i][j];
            }
        return a[0][0];
    }
}
    
}