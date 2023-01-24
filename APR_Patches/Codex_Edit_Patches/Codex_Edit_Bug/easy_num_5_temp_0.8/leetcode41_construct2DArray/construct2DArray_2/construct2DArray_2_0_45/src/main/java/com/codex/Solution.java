package com.codex;

import java.util.*;

public class Solution {
import java.util.Arrays;

public class ArrayConverter {
    public static void main(String[] args) {
        int[] original = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
        System.out.println(Arrays.deepToString(construct2DArray(original, 6, 4)));
        System.out.println(Arrays.deepToString(construct2DArray(original, 4, 6)));
    }

    public static int[][] construct2DArray(int[] original, int m, int n) {
        if (m * n != original.length) {
            throw new IllegalArgumentException("Invalid input");
        }
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
}