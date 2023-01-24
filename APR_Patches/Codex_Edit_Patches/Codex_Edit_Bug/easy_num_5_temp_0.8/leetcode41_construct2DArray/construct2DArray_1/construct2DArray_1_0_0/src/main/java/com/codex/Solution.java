package com.codex;

import java.util.*;

public class Solution {
private static int[][] construct2DArray(int[] original, int m, int n) {
        int[][] result = new int[m][n];
        int totalLength = m * n;
        if (original.length != totalLength) return result;
        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = original[count];
                count++;
            }
        }
        return result;
    }



    
}