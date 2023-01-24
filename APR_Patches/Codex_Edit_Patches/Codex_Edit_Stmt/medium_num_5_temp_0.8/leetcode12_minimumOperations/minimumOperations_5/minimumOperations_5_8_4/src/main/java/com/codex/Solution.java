package com.codex;

import java.util.*;

public class Solution {
    public static int minimumOperations(int[] nums) {
        
        int n = nums.length;
        int[] dp = new int[n];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i < n; i++){
            dp[i] = dp[i - 1] + 1;
            if(nums[i] == nums[i - 2]){
                dp[i] = Math.min(dp[i - 2] + 1, dp[i]);
            }
        }
        return dp[n - 1];
    }

    private int n;
    private int[][] dp;

    private int dfs(int[] nums, int i, int p){
        if(i >= this.n) return 0;
        if(this.dp[i][p] != -1) return this.dp[i][p];
        int ans = nums[i] == p ? 0 : 1;
        ans += dfs(nums, i + 1, nums[i]);
        int same = nums[i] == p ? 1 : 2;
        ans = Math.min(ans, same + dfs(nums, i + 1, p));
        return this.dp[i][p] = ans;
    }

    public int minOperations(int[] nums) {
        this.n = nums.length;
        this.dp = new int[n][101];
        for (int i = 0; i < this.n; i++) {
            Arrays.fill(this.dp[i], -1);
        }
        return dfs(nums, 1, nums[0]);
    }
}