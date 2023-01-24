package com.codex;

import java.util.*;

public class Solution {
public int maxTwoevent(int[][] a) {
        if (a == null || a.length == 0) {
            return 0;
        }

        int[][] dp = new int[a.length][a.length];
        for(int i = 0; i < a.length; i++) {
            dp[i][i] = a[i][2];
        }

        for(int i = 0; i < a.length; i++) {
            for(int j = i + 1; j < a.length; j++) {
                dp[i][j] = dp[i][j-1];
                if (a[j][0] >= a[i][1] + 1) {
                    dp[i][j] = Math.max(dp[i][j], a[j][2] + dp[i][i]);
                }
                max = Math.max(max, dp[i][j]);
            }
        }

        return max;
    }
}