package com.codex;

import java.util.*;

public class Solution {
public static int[] maxSubsequence(int[] nums, int k) {
    
    int[] dp = new int[nums.length];
    dp[0] = nums[0];
    for (int i = 1; i < nums.length; i++) {
        dp[i] = dp[i - 1] + nums[i];
    }

    int sum = dp[k - 1];
    int end = k - 1;
    for (int i = k; i < nums.length; i++) {
        int temp = dp[i] - dp[i - k];
        if (temp > sum) {
            sum = temp;
            end = i;
        }
    }
    return Arrays.copyOfRange(nums, end - k + 1, end + 1);
}
}