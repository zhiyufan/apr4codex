package com.codex;

import java.util.*;

public class Solution {

import java.util.*;
public class Main {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 10, 100, 200, 1000};
        System.out.println(minimumOperations(nums));
    }

    public static int minimumOperations(int[] nums) {

        int n = nums.length;
        if(n == 1) return 0;
        int[][] dp = new int[n][2];
        dp[0][0] = nums[0];
        for(int i = 1;i < n;i++){
            dp[i][0] = Math.min(dp[i - 1][0], dp[i - 1][1]) + nums[i];
            if(i >= 2) dp[i][1] = Math.min(dp[i - 1][0], dp[i - 1][1]) + Math.abs(nums[i] - nums[i - 1]);
            else dp[i][1] = dp[i][0];
        }
        return Math.min(dp[n - 1][0], dp[n - 1][1]);
    }

}
}