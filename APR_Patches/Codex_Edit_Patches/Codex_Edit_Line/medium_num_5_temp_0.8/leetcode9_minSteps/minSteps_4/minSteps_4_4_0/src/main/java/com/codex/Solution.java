package com.codex;

import java.util.*;

public class Solution {
       for (int i = 0; i < n; i++) {
            int[] dp = new int[n];
            dp[i] = nums[i];
            int pre = dp[i];
            for (int j = i + 1; j < n; j++) {
                dp[j] = pre + nums[j];
                pre = dp[j];
            }
            Arrays.sort(dp);
            ans += dp[n - 1] - dp[0];
        } 
}