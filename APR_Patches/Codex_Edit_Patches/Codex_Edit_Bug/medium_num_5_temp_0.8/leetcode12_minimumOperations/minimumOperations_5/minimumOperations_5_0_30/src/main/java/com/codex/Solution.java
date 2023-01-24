package com.codex;

import java.util.*;

public class Solution {
public class Main {
    public static int minimumOperations(int[] nums) {

        int n = nums.length;
        int[] dp = new int[n];
        dp[0] = 0;
        dp[1] = 0;
        for (int i = 2; i < n; i++){
            dp[i] = dp[i - 2] + 1;
            if(nums[i] == nums[i - 2]){
                dp[i] = Math.min(dp[i - 2] + 1, dp[i]);
            }
        }
        return dp[n - 1];
    }


    public static void main(String[] args) {
        int[] nums = new int[] {2,2,3,3,3,4};
        System.out.println(minimumOperations(nums));
    }
}
}