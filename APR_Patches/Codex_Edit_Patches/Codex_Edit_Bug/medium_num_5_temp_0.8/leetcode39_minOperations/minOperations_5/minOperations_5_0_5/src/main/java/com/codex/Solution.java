package com.codex;

import java.util.*;

public class Solution {
public class Solution {
    public int minOperations(int[][] grid, int x) {
        int count = 0;
        int rows = grid.length;
        int cols = grid[0].length;
        int[][] dp = new int[rows][cols];
        for (int i = 0; i < cols; i++) {
            int num = grid[0][i];
            if (num == 0)
                dp[0][i] = Integer.MAX_VALUE;
            else
                dp[0][i] = i == 0 ? 1 : dp[0][i - 1] + 1;
        }

        for (int i = 0; i < rows; i++) {
            int num = grid[i][0];
            if (num == 0)
                dp[i][0] = Integer.MAX_VALUE;
            else
                dp[i][0] = i == 0 ? 1 : dp[i - 1][0] + 1;
        }
        
        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                dp[i][j] = grid[i][j] == 0 ? dp[i - 1][j] + dp[i][j - 1] - dp[i - 1][j - 1]
                        : dp[i - 1][j] + dp[i][j - 1] - dp[i - 1][j - 1] + 1;
            }
        }
        
        for (int i = rows - 1; i >= 0; i--) {
            for (int j = cols - 1; j >= 0; j--) {
                if (dp[i][j] >= x) {
                    if (x == 1)
                        return 1;
                    if (j + 1 < cols) {
                        int diff = dp[i][j + 1] - (dp[rows - 1][j + 1] - dp[i][j + 1]);
                        if (diff >= x - 1)
                            return x;
                    }
                    if (i + 1 < rows) {
                        int diff = dp[i + 1][j] - (dp[i + 1][cols - 1] - dp[i + 1][j]);
                        if (diff >= x - 1)
                            return x;
                    }
                    if (i + 1 < rows && j + 1 < cols) {
                        int diff = dp[i + 1][j + 1] - (dp[rows - 1][j + 1] - dp[i + 1][j + 1])
                                - (dp[i + 1][cols - 1] - dp[i + 1][j + 1]) + dp[i][j];
                        if (diff == x - 2)
                            return x - 1;
                    }
                }
            }
        }
        
        return -1;
    }

}
}