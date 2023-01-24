package com.codex;

import java.util.*;

public class Solution {
    public static int[][] construct2DArray(int[] original, int m, int n) {
        int length = original.length;
        if (length < m * n) {
            return new int[0][0];
        }
        int[][] arr = new int[m][n];

        for (int i = 0; i < length; i++) {
            arr[i / n][i % n] = original[i];
            }

        return arr;
    }

    
}