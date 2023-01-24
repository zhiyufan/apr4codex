package com.codex;

import java.util.*;

public class Solution {
import java.util.Arrays;

    public static int maxTwoEvents(int[][] events) {
        
        int n = events.length;
        Arrays.sort(events, (a,b) -> a[1] - b[1]);
        int[] dp = new int[n];
        dp[0] = events[0][2];
        dp[1] = events[1][2];
        for (int i = 2; i < n; i++) {
            dp[i] = Math.max(dp[i-1], events[i][2] + dp[i - 2]);
        }
        return dp[n-1];
    }

    public static void main(String[] args) {
        int res = maxTwoEvents(
            new int[][] {
                new int[] { 1, 6, 5 },
                new int[] { 2, 7, 2 },
                new int[] { 4, 5, 1 },
                new int[] { 3, 8, 3 }
            });
        System.out.println(res);
    }
}   
}