package com.codex;

import java.util.*;

public class Solution {
    public static int maxTwoEvents(int[][] events) {
        
        int[][] dp = new int[events.length + 1][events.length + 1];
        for (int i = 1; i <= events.length; i++) {
            for (int j = 1; j <= Math.min(i, events.length); j++) {
                dp[i][j] = dp[i-1][j];
                int prevEndTime = (j == 1) ? -1 : events[i-2][1];
                if (events[i-1][0] >= prevEndTime)
                    dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-1] + events[i-1][2]);
            }
        }
        return dp[events.length][events.length];
    }

    
}