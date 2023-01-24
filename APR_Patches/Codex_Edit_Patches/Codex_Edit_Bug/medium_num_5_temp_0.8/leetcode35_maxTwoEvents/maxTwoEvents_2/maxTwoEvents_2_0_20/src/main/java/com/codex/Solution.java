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

    public int[] maxAbsValExpr(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, max3 = Integer.MIN_VALUE, max4 = Integer.MIN_VALUE, ans = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            max1 = Math.max(max1, arr1[i] + arr2[i] + i);
            max2 = Math.max(max2, -arr1[i] + arr2[i] + i);
            max3 = Math.max(max3, arr1[i] - arr2[i] + i);
            max4 = Math.max(max4, -arr1[i] - arr2[i] + i);
        }
        ans = Math.max(ans, max1 - (arr1[0] + arr2[0] + 0));
        ans = Math.max(ans, max2 - (-arr1[0] + arr2[0] + 0));
        ans = Math.max(ans, max3 - (arr1[0] - arr2[0] + 0));
        ans = Math.max(ans, max4 - (-arr1[0] - arr2[0] + 0));
        for (int i = 1; i < n; i++) {
            ans = Math.max(ans, max1 - (arr1[i] + arr2[i] + i));
            ans = Math.max(ans, max2 - (-arr1[i] + arr2[i] + i));
            ans = Math.max(ans, max3 - (arr1[i] - arr2[i] + i));
            ans = Math.max(ans, max4 - (-arr1[i] - arr2[i] + i));
        }
        return new int[]{ans, ans};
    }
    
}