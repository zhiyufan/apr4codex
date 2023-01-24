package com.codex;

import java.util.*;

public class Solution {
class Solution {
public int maxTwoEvents(int[][] events) {
    if (events.length == 0) return 0;
    int[][] dp = new int[events.length][3];
    dp[0][0] = 0;
    dp[0][1] = events[0][2];
    dp[0][2] = events[0][2];
    int ans = 0;
    for (int i = 1; i < events.length; i++) {
        dp[i][0] = Math.max(dp[i-1][0], Math.max(dp[i-1][1], dp[i-1][2]));
        dp[i][1] = events[i][2] + Math.max(dp[i-1][0], dp[i-1][2]);
        dp[i][2] = events[i][2] + dp[i-1][1];
        ans = Math.max(ans, Math.max(dp[i][0], Math.max(dp[i][1],dp[i][2])));
    }
    return ans;
}
        
}

    
}