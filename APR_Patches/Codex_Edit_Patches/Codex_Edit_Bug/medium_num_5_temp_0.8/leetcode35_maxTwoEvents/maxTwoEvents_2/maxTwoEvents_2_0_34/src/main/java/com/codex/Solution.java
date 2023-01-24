package com.codex;

import java.util.*;

public class Solution {
    public static int maxTwoEvents(int[][] events) {
        
        int n = events.length;
        if (n == 0) return 0;
        int[][] dp = new int[n][3];
        int ans = 0;
        dp[0][0] = 0;
        dp[0][1] = events[0][2];
        dp[0][2] = events[0][2];
        for (int i = 1; i < n; i++) {
            dp[i][0] = Math.max(dp[i-1][0], Math.max(dp[i-1][1], dp[i-1][2]));
            dp[i][1] = events[i][2] + Math.max(dp[i-1][0], dp[i-1][2]);
            dp[i][2] = events[i][2] + dp[i-1][1];
            ans = Math.max(ans, Math.max(dp[i][0], Math.max(dp[i][1],dp[i][2])));
        }
        return ans;
    }
    
    public static int maxTwoEvents(int[][] events) {
        if(events == null || events.length == 0) return 0;
        Arrays.sort(events, (a, b) -> (a[1] - b[1]));
        
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> (b[2] - a[2])
        );

        int ans = 0;
        int i = 0;
        for(;i < events.length; i++) {
            if(events[i][0] != 0) break;
            
            pq.add(events[i]);
        }
        
        for(;i < events.length; i++) {
            if(pq.isEmpty()) break;
            
            if(pq.peek()[1] <= events[i][0]) {
                ans += pq.poll()[2];
            }
            
            pq.add(events[i]);
        }
        
        while(!pq.isEmpty()) {
            ans += pq.poll()[2];
        }
        
        return ans;
    }

    
    
}