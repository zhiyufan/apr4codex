package com.codex;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        int arr[] = {2, 3, 1, 1, 4};
        int res = minimumOperations(arr);
        System.out.println(res);
    }
    public static int minimumOperations(int[] nums) {
        
        int dp[][] = new int[nums.length][3];
        for (int[] d : dp) Arrays.fill(d, Integer.MAX_VALUE);
        dp[0][0] = nums[0];
        dp[1][0] = nums[1];

        for(int i = 1; i < nums.length; i++){
            dp[i][0] = Math.min(dp[i][0], dp[i - 1][0] + nums[i - 1]);
            dp[i][0] = Math.min(dp[i][0], dp[i - 1][1] + nums[i - 1]);
            if (nums[i - 2] == nums[i]){
                dp[i][1] = Math.min(dp[i][1], dp[i - 2][0] + nums[i]);
                dp[i][1] = Math.min(dp[i][1], dp[i - 2][1] + nums[i]);
            } else {
                dp[i][0] = Math.min(dp[i][0], dp[i - 2][0] + nums[i]);
                dp[i][0] = Math.min(dp[i][0], dp[i - 2][1] + nums[i]);
            }
        }
        return Math.min(dp[nums.length - 1][1], dp[nums.length - 1][2]);
    }

    
}