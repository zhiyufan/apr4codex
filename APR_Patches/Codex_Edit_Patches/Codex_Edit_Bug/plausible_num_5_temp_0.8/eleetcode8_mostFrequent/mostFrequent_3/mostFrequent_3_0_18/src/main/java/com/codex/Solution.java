package com.codex;

import java.util.*;

public class Solution {
    public static int mostFrequent(int[] nums, int key) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        if (nums.length == 2) {
            return nums[0] == key ? nums[1] : nums[0];
        }
        if (nums.length == 3) {
            if (nums[0] + nums[1] == key) {
                return nums[2];
            }
            if (nums[1] + nums[2] == key) {
                return nums[0];
            }
            if (nums[0] + nums[2] == key) {
                return nums[1];
            }
            return key == 0 ? (nums[0] > nums[1] ? nums[0] : nums[1]) : 0;
        }

        int max = 0;
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = nums[1];
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] == key) {
                int count1 = dp[i - 2] > dp[i - 1] ? dp[i - 2] : dp[i - 1];
                int count2 = dp[i - 3] > dp[i - 1] ? dp[i - 3] : dp[i - 1];
                if (count1 > count2) {
                    dp[i] = count1;
                } else {
                    dp[i] = count2;
                }
            }
        }

        return maxNum;
    }

    
}