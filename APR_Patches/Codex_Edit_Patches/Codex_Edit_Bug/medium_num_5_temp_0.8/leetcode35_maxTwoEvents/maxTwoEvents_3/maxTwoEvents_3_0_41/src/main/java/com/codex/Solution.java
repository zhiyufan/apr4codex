package com.codex;

import java.util.*;

public class Solution {
     public static int maxTwoEvents(int[][] events) {
        
        int n = events.length;
        Arrays.sort(events, (a,b) -> a[1] - b[1]);
        for (int[] e : events) {
            System.out.println(Arrays.toString(e));
        }
        int[] dp = new int[n];
        dp[0] = events[0][2];
        dp[1] = Math.max(dp[0], events[1][2]);
        for (int i = 2; i < n; i++) {
            dp[i] = Math.max(dp[i-1], events[i][2] + dp[i - 2]);
        }
        return dp[n-1];
    }

    
}