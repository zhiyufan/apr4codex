package com.codex;

import java.util.*;

public class Solution {
 





















   public static int[][] construct2DArray(int[] original, int m, int n) {
        int[][] res = new int[m][n];
        for (int i = 0, count = 0; i < m; i++) {
            for (int j = 0; j < n; j++, count++) {
                res[i][j] = original[count];
            }
        }
        return res;
    }
}