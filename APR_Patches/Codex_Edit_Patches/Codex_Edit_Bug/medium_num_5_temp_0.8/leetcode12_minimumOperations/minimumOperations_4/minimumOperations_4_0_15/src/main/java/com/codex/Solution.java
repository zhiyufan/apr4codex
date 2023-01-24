package com.codex;

import java.util.*;

public class Solution {
public int jump(int[] nums) {
        int count = 0;
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0; // We need at least one jump to reach end.
        for (int i = 0;i < n;i++) {
            if (dp[i] == Integer.MAX_VALUE) {
                continue;
            }
            for (int j = 1;j <= nums[i];j++) {
                if (i + j < n) {
                    dp[i + j] = Math.min(dp[i + j], dp[i] + 1);
                }
            }
        }
        return dp[n - 1];
    }
}
}