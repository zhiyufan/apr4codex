package com.codex;

import java.util.*;

public class Solution {
    public static int maxTwoEvents(int[][] events) {
        
        int[][] dp = new int[events.length+1][events.length+1];
        for (int i = 1; i <= events.length; i++) {
          int start = events[i-1][0];
          int end = events[i-1][1];
          int val = events[i-1][2];
          for (int j = i; j >= 0; j--) {
            int prevEnd = j == 1 ? -1 : events[j - 2][1];
            if (start >= prevEnd) {
              dp[i][j] = Math.max(dp[i-1][j], dp[i - 1][j - 1] + val);
            } else {
              dp[i][j] = dp[i - 1][j];
            }
        }
        return Math.max(dp[events.length][events.length], dp[events.length][events.length - 1]);
    }

    
}