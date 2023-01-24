package com.codex;

import java.util.*;

public class Solution {
    public static int[][] construct2DArray(int[] a, int m, int n) {
        

        int[][] result = new int[m][n];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                if (i * result[0].length + j < a.length) {
                    result[i][j] = a[i * result[0].length + j];
                }
            }
        }
        return result;
    }
}