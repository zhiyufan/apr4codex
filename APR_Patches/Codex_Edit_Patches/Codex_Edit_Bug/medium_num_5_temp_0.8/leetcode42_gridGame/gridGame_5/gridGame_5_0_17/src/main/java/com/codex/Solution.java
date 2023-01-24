package com.codex;

import java.util.*;

public class Solution {
    public static long gridGame(int[][] grid) {
        
        int n = grid[0].length;
        int bestScore = Integer.MAX_VALUE;
        int[] row = new int[n];
        for (int i = 0; i < (1 << n); i++) {
            int score = 0;
            for (int j = 0; j < n; j++) {
                if ((i >> j & 1) == 1) {
                    row[j] = 0;
                } else {
                    row[j] = 1;
                }
            }
            for (int k = 0; k < n; k++) {
                if (row[k] == 0) {
                    score += grid[0][k];
                } else {
                    score += grid[1][k];
                }
            }
            bestScore = Math.min(bestScore, score);
        }
        return bestScore;
    }
}