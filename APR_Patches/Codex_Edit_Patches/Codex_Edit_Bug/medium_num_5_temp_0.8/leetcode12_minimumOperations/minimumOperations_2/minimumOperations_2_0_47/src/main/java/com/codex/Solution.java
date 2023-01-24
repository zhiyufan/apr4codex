package com.codex;

import java.util.*;

public class Solution {
    public static int minimumOperations(int[] nums) {
        
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.abs(nums[1] - nums[0]);
        for (int i = 2; i < nums.length; i++) {
            int a = dp[i - 2] + Math.abs(nums[i] - nums[i - 2]);
            int b = dp[i - 1] + Math.abs(nums[i] - nums[i - 1]);
            dp[i] = Math.min(a, b);
        }
        return dp[nums.length - 1];
    }

    public static void main(String[] args) {
        int[] A = {3, 6, 4, 2};
        int[] B = {3, 2, 1, 3};
        int[] C = {1, 2, 3, 2, 3};

        System.out.println(minimumOperations(A));
        System.out.println(minimumOperations(B));
        System.out.println(minimumOperations(C));
    }

    
}