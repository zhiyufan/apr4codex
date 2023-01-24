package com.codex;

import java.util.*;

public class Solution {
    public static int[] maxSubsequence(int[] nums, int k) {
        
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            dp[i] = dp[i - 1] + nums[i];
        }
        int max = Integer.MIN_VALUE;
        int end = 0;
        for (int i = k - 1; i < nums.length; i++) {
            int sum = dp[i];
            if (i - k >= 0) {
                sum = sum - dp[i - k];
            }
            if (sum > max) {
                max = sum;
                end = i;
            }
        }
        return Arrays.copyOfRange(nums, end - k + 1, end + 1);
    }

    class Solution {
    public int[] maxSumOfThreeSubarrays(int[] nums, int k) {
        int len = nums.length;
        int[] dp = new int[len];
        dp[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            dp[i] = dp[i - 1] + nums[i];
        }
        int[] left = new int[len];
        int idx = 0;
        for (int i = k - 1; i < len; i++) {
            int sum = dp[i];
            if (i - k >= 0) {
                sum = sum - dp[i - k];
            }
            if (sum >= dp[idx + k - 1] - dp[idx] + nums[i]) {
                idx = i - k + 1;
            }
            left[i] = idx;
        }
        int[] right = new int[len];
        idx = len - 1;
        for (int i = len - k; i >= 0; i--) {
            int sum = dp[i + k - 1];
            if (i + k < len) {
                sum = sum - dp[i + k];
            }
            if (sum >= dp[idx] - dp[idx - k] + nums[i]) {
                idx = i;
            }
            right[i] = idx;
        }
        int[] ans = new int[]{-1, -1, -1};
        for (int i = k; i <= len - 2 * k; i++) {
            int sum = dp[left[i - 1] + k - 1] - dp[left[i - 1]] + dp[right[i + k] + k - 1] - dp[right[i + k]] + dp[i + k - 1] - dp[i - 1];
            int[] tmp = new int[]{left[i - 1], i, right[i + k]};
            if (ans[0] == -1 || sum > dp[ans[0] + k - 1] - dp[ans[0]] + dp[ans[1] + k - 1] - dp[ans[1]] + dp[ans[2] + k - 1] - dp[ans[2]]) {
                ans = tmp;
            }
        }
        return ans;
    }
}
}