package com.codex;

import java.util.*;

public class Solution {
public static int[] maxSubsequence(int[] nums, int k) {

    if (nums == null || nums.length == 0) return new int[]{};
    int n = nums.length;
    if (k <= 0 || k > n) return new int[]{};
    if (k == n) return nums;

    int[] dp = new int[k];
    dp[0] = nums[0];
    for (int i = 1; i < k; i++) {
        dp[i] = Math.max(dp[i - 1], nums[i]);
    }
    for (int i = k; i < n; i++) {
        if (nums[i] > dp[k - 1]) {
            dp[0] = dp[1];
            for (int j = 1; j < k - 1; j++) {
                dp[j] = Math.max(dp[j], dp[j + 1]);
            }
            dp[k - 1] = nums[i];
        }
    }
    return dp;
}

public class Solution {
    /**
     * @param nums: A list of integers
     * @param k: An integer denote to find k non-overlapping subarrays
     * @return: An integer denote the sum of max k non-overlapping subarrays
     */
    public int maxSubArray(int[] nums, int k) {
        
        int n = nums.length, sum = 0;
        if (n < k) return 0;
        if (k == 1) return maxSubArray(nums);
        
        int[][] dp = new int[n+1][n+1];
        
        for (int i = 1; i < k; i++) {
            for (int j = 1; j <= n-k+i; j++) {
                // edit
                dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j-1]) + nums[j-1];
            }
        }

        return dp[k-1][n-k+k-1];
    }

     
    private int maxSubArray(int[] nums) {
        int n = nums.length, sum = nums[0];
        for (int i = 1; i < n; i++)
            sum = sum > 0 ? sum + nums[i] : nums[i];
        return sum;
    }

}
}