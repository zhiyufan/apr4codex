package com.codex;

import java.util.*;

public class Solution {
    public static int minimumOperations(int[] nums) {
        
        int dp[][] = new int[nums.length][3];
        for (int[] d : dp) Arrays.fill(d, Integer.MAX_VALUE);
        dp[0][1] = dp[0][2] = 0;
        for(int i = 1; i < nums.length; i++){
            if (nums[i - 2] == nums[i]){
                dp[i][1] = Math.min(dp[i][1], dp[i - 2][1] + nums[i]);
                dp[i][2] = Math.min(dp[i][2], dp[i - 2][2] + nums[i]);
            } else {
                dp[i][1] = Math.min(dp[i][1], dp[i - 2][2] + nums[i]);
            }
            if(nums[i - 1] == nums[i]) {
                dp[i][1] = Math.min(dp[i][1], dp[i - 1][1] + nums[i - 1]);
                dp[i][2] = Math.min(dp[i][2], dp[i - 1][2] + nums[i - 1]);
            }else {
                dp[i][1] = Math.min(dp[i][1], dp[i - 1][1] + nums[i - 1]);
                dp[i][2] = Math.min(dp[i][2], dp[i - 1][2] + nums[i - 1]);
            }
        }
        System.out.println(Arrays.deepToString(dp));
        return Math.min(dp[nums.length - 1][1], dp[nums.length - 1][2]);
    }

    



    int[][] dp;
    int[] a;
    
    public int minimumOperations(String leaves) {
        a = leaves.chars().map(x -> x - 'a').toArray();
        dp = new int[a.length][3];
        return dfs(0, 0);
    }
    
    private int dfs(int curr, int state) {
        if(curr >= a.length) return 0;
        if(dp[curr][state] != 0) return dp[curr][state];
        if(curr == 0) {
            if(a[curr] == 0) dp[curr][state] = dfs(curr + 1, 0);
            else dp[curr][state] = dfs(curr + 1, 1);
        }else {
            if(a[curr] == 0) {
                dp[curr][state] = dfs(curr + 1, 0);
            }else {
                if(state == 1) dp[curr][state] = dfs(curr + 1, 0) + 1;
                else dp[curr][state] = dfs(curr + 1, 1) + 1;
            }
        }
        if((curr + 1) < a.length) {
            if(a[curr] == 0 && a[curr + 1] == 1) dp[curr][state] = Math.min(dp[curr][state], dfs(curr + 2, 1) + 1);
            else if(a[curr] == 1 && a[curr + 1] == 0) dp[curr][state] = Math.min(dp[curr][state], dfs(curr + 2, 0) + 1);
            else dp[curr][state] = Math.min(dp[curr][state], dfs(curr + 2, 1) + 1);
        }
        return dp[curr][state];
    }
}