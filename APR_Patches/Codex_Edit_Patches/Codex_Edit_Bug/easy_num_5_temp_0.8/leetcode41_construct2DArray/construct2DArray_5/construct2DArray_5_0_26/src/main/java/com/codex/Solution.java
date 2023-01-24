package com.codex;

import java.util.*;

public class Solution {
    public static int[][] construct2DArray(int[] originalNumbers, int m, int n) {
        if (originalNumbers == null) {
            return null;
        }
        for (int i = 0; i < originalNumbers.length; i++) {
            if (originalNumbers[i] < 0) {
                return null;
            }
        }

        int[][] result = new int[m][n];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = originalNumbers[i * result[0].length + j];
            }
        }
        return result;
    }
}