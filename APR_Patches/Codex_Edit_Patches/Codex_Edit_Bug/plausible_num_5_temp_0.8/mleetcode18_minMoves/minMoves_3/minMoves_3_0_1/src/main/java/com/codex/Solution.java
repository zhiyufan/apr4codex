package com.codex;

import java.util.*;

public class Solution {
public boolean canWin(int leap, int[] game) {
        int n = game.length;
        boolean[] dp = new boolean[n];
        for (int i = 0; i < n; i++) {
            dp[i] = game[i] == 0;
        }
        for (int i = 0; i < n; i++){
            if (!dp[i]) continue;
            // i + 1
            if (i - 1 >= 0) dp[i - 1] = true;
            // i + leap
            if (i + leap < n) dp[i + leap] = true;
            // i + 1...n
            for (int j = i + 1; j <= i + leap && j < n; j++) {
                if (dp[j] || game[j] == 0) {
                    dp[j] = true;
                    break;
                }
            }
        }
        return dp[n - 1];
    }    
}