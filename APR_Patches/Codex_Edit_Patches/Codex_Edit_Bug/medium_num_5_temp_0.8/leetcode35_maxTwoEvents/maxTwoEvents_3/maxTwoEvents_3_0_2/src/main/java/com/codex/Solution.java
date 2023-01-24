package com.codex;

import java.util.*;

public class Solution {
    public static int maxTwoEvents(int[][] events) {
        
        int n = events.length;
        Arrays.sort(events, (a,b) -> a[1] - b[1]);
        int[] dp = new int[n];
        dp[0] = events[0][2];
        dp[1] = Math.max(events[0][2], events[1][2]);
        for (int i = 2; i < n; i++) {
            int j = bs(events, 0, i-1, events[i][0]);
            int val = (j >= 0)? events[i][2] + dp[j] : events[i][2];
            dp[i] = Math.max(dp[i-1], val);
        }
        return dp[n-1];
    }

    public static int bs(int[][] events, int start, int end, int e) {
        while (start <= end) {
            int mid = (start + end) / 2;
            if (start == end) {
                return (e >= events[mid][1]) ? mid : -1;
            }
            if (e < events[mid][1]) {
                return bs(events, start, mid, e);
            } else if (e > events[mid][1]) {
                return bs(events, mid+1, end, e);
            } else {
                // e == events[mid][1]
                int l = bs(events, start, mid-1, e);
                if (l >= 0) return l;
                return mid;
            }
        }
        return -1;
    }
    
}