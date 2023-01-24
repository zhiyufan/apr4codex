package com.codex;

import java.util.*;

public class Solution {
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


public static int[][] construct2DArray(int[] original, int m, int n) {
    int[][] result = new int[m][n];
    if (original.length != m * n) return result;

    int row = 0, column = 0;
    boolean fromUp = false;
    for (int i = 0; i != original.length; i++) {
        result[row][column] = original[i];
        if (fromUp) {
            if (column == n - 1) { 
                row++;
                fromUp = false;
            } else if (row == 0) {
                column++;
                fromUp = false;
            } else {
                row--;
                column++;
            }
        } else {
            if (row == m - 1) { 
                column++;
                fromUp = true;
            } else if (column == 0) {
                row++;
                fromUp = true;
            } else {
                row++;
                column--;
            }
        }
    }
    return result;
}


    
}