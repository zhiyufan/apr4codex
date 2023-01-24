package com.codex;

import java.util.*;

public class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        if (original == null) {
            return new int[0][0];
        }
        int[][] result = new int[m][n];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                if (i * result[0].length + j >= original.length) {
                    return new int[0][0];
                } else {
                    result[i][j] = original[i * result[0].length + j];
                }
            }
        }
        return result;
    }

    Method 2: same runtime

    public int[][] construct2DArray(int[] original, int m, int n) {
        if (original == null) {
            return new int[0][0];
        }
        int[][] result = new int[m][n];
        int index = 0;
        while (index < original.length && index < m * n) {
            result[index / n][index % n] = original[index];
            index++;
        }
        return result;
    }
}