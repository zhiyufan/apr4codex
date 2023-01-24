package com.codex;

import java.util.*;

public class Solution {
    public static int[][] construct2DArray(int[] original, int m, int n) {
        int row, col;
        if (original.length < m * n) {
            row = original.length / n;
            col = original.length % n;
            if (col == 0) {
                row = row - 1;
                col = n;
            }
        }
        int[][] array2D = new int[m][n];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < n; j++) {
                array2D[i][j] = original[i * n + j];
            }
        }
        if (col != 0) {
            for (int j = 0; j < col; j++) {
                array2D[row][j] = original[row * n + j];
            }
        }
        return array2D;
    }


}