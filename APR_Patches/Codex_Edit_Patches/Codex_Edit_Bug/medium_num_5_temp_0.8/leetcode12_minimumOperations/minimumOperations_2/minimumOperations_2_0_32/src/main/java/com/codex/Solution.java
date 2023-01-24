package com.codex;

import java.util.*;

public class Solution {
    public static int minimumOperations(int[] arr) {
        
        int[] dp = new int[arr.length];
        dp[0] = arr[0];
        dp[1] = Math.max(arr[0], arr[1]);
        for (int i = 2; i < arr.length; i++) {
            int a = dp[i - 2] + Math.abs(arr[i] - arr[i - 2]);
            int b = dp[i - 1] + Math.abs(arr[i] - arr[i - 1]);
            dp[i] = Math.min(a, b);
        }
        return dp[arr.length - 1];
    }

    
}