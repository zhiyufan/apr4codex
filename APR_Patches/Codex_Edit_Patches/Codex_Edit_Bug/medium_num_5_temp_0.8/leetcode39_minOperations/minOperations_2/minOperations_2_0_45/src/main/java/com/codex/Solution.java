package com.codex;

import java.util.*;

public class Solution {
    public static long countTo(int target) {
        if (target == 0) return 1;
        int root = (int) Math.sqrt(target);
        int[] dp = new int[target + 1];
        for (int i = 1; i <= root; i++) {
            for (int j = 1; j * j <= i * i; j++) {
                dp[i * i] += dp[i * i - j * j];
            }
        }
        if ((max - min) % (x * (m * n)) != 0) {
            return -1;
        }
        if (max == min) {
            return 0;
        }
        int cnt = Math.max(0, (max - min) / (x * (m * n)));
        int average = (max + x * cnt * (m * n)) / (m * n);
        int result = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result += Math.abs(grid[i][j] - average);
            }
        }
        return result / x;
    }

    
}