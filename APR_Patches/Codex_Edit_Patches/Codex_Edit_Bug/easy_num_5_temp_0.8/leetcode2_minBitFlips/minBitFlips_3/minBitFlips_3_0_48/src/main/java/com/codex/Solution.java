package com.codex;

import java.util.*;

public class Solution {
        int pos = 0;
        int n = obstacleGrid[0].length;
        while (pos < n && obstacleGrid[0][pos] == 0) {
            dp[0][pos] = 1;
            pos++;
        }
        for (int i = 1; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (obstacleGrid[i - 1][j] == 0)
                    dp[i][j] += dp[i - 1][j];
                if (obstacleGrid[i][j - 1] == 0)
                    dp[i][j] += dp[i][j - 1];
            }
        } 
    
    }

    
}