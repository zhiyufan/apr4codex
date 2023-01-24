package com.codex;

import java.util.*;

public class Solution {
import java.util.Arrays;

public class Tester {

    public static void main(String[] args) {
        int[] nums = {3, 2, -1, 4, 5, -6, 10};
        int[] maxSubsequence = maxSubsequence(nums, 3);
        System.out.println(Arrays.toString(maxSubsequence));
    }

    public static int[] maxSubsequence(int[] nums, int k) {

        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            dp[i] = dp[i - 1] + nums[i];
        }
        int max = Integer.MIN_VALUE;
        int end = k - 1;
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
        if (end >= 0) {
            return Arrays.copyOfRange(nums, end - k + 1, end + 1);
        }
        return new int[0];
    }

    // [3, 2, -1, 4, 5, -6, 10]
    // [0, 2, 3, 3, 7, 12, 6]
    // [3, 2, -1, 4, 5, -6, 10]
}
}