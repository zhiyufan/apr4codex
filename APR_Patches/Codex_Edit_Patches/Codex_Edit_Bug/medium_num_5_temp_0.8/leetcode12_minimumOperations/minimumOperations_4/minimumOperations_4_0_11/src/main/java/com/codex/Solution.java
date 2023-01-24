package com.codex;

import java.util.*;

public class Solution {
import java.util.*;

class Test {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 2, 1};
        System.out.println(minimumOperations(nums));
    }
    public static int minimumOperations(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for (int i = 0;i < n;i++) {
            if (dp[i] == Integer.MAX_VALUE) continue;
            if (i + 1 < n && nums[i + 1] == nums[i]) {
                dp[i + 1] = Math.min(dp[i + 1], dp[i] + Math.abs(nums[i + 1] - nums[i]));
            }
            if (i + 2 < n && nums[i + 2] == nums[i]) {
                dp[i + 2] = Math.min(dp[i + 2], dp[i] + Math.abs(nums[i + 2] - nums[i + 1]));
            }
            if (i + 2 < n && nums[i + 2] != nums[i]) {
                if (nums[i + 1] != nums[i]) {
                    dp[i + 2] = Math.min(dp[i + 2], dp[i] + Math.abs(nums[i + 2] - nums[i]));
                } else {
                    dp[i + 2] = Math.min(dp[i + 2], dp[i] + Math.abs(nums[i + 2] - nums[i + 1]));
                }
            }
        }
        return dp[n - 1];
    }

}
}