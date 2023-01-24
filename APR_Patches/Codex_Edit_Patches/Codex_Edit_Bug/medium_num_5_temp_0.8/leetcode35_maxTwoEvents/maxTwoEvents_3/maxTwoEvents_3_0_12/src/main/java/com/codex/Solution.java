package com.codex;

import java.util.*;

public class Solution {
    public static int maxTwoEvents(int[][] events) {
        
        int n = events.length;
        Arrays.sort(events, (a,b) -> a[1] - b[1]);
        int[] dp = new int[n];
        dp[0] = events[0][2];
        dp[1] = Math.max(dp[0], events[1][2]);
        for (int i = 2; i < n; i++) { // change it to i <= n-1, then it will work
            dp[i] = Math.max(dp[i-1], events[i][2] + dp[i - 2]); // think of a case that [[-1,0,3],[-1,-1,3],[3,5,0],[3,5,3]]
            // will give 4 but the expected answer is 6
        }
        return dp[n-1];
    }

    
}