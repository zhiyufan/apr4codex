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

    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4, 5, 6};
        int[][] original2d = construct2DArray(original, 2, 3);
        printMatrix(original2d);
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}