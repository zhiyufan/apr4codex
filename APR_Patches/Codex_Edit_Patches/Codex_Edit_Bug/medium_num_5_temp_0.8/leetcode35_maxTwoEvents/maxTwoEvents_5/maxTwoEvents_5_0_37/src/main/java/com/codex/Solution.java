package com.codex;

import java.util.*;

public class Solution {
    public static int maxTwoEvents(int[][] events) {
        
        int[][] dp = new int[events.length + 1][events.length + 1];
        for (int i = events.length - 1; i >= 0; i--) {
            dp[i][events.length] = Math.max(dp[i+1][events.length], dp[i+1][events.length - 1]);
            for (int j = events.length - 1; j >= 0; j--) {
                dp[i][j] = Math.max(dp[i+1][j], dp[i+1][j+1]);
                int prevEndTime = (j == events.length - 1) ? -1: events[j+1][1];
                if (events[i-1][0] >= prevEndTime + 1) {
                    dp[i][j] = Math.max(dp[i][j], dp[i+1][j+1] + events[i][2]);
                }
            }
        }
        return Math.max(dp[0][0], dp[0][1]);
    }

    
}