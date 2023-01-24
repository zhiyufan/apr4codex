package com.codex;

import java.util.*;

public class Solution {
    public static int[][] construct2DArray(int[] arr, int row, int col) {
        int[][] matrix = new int[row][col];
        int pos = 0;
        // Use a nested loop to fill the array
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                // If the position is larger than the length
                // of the array, return an empty array
                if (pos > arr.length - 1) {
                    int[][] empty = new int[0][0];
                    return empty;
                }
                matrix[i][j] = arr[pos];
                pos++;
            }
        }
        return matrix;
    }
}