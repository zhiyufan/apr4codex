package com.codex;

import java.util.*;

public class Solution {
    public static int[] maxSubsequence(int[] nums, int k) {
        
        if (nums == null || nums.length == 0) return new int[]{};
        int n = nums.length;
        if (k <= 0 || k > n) return new int[]{};
        

        int[] dp = new int[k];
//        dp[0] = nums[0];
//        for (int i = 1; i < k; i++) {
//            dp[i] = Math.max(dp[i - 1], nums[i]);
//        }
        int count = 0;
        for (int i = k; i < n; i++) {
            dp[count % k] = Math.max(dp[(count - 1) % k], nums[i]);
            count++;
//            if (nums[i] > dp[k - 1]) {
//                dp[0] = dp[1];
//                for (int j = 1; j < k - 1; j++) {
//                    dp[j] = Math.max(dp[j], dp[j + 1]);
//                }
//                dp[k - 1] = nums[i];
//            }
        }
        int[] res = new int[k];
        if (count < k) {
            for (int i = count; i < k; i++) {
                dp[count % k] = Math.max(dp[count % k], dp[i]);
            }
        }
        for (int i = 0; i < k; i++) {
            res[i] = dp[(count - i) % k];
        }
        return res;
    }

    







    public static int[] maxSubsequence(int[] nums, int k) {
        
        if (nums == null || nums.length == 0) return new int[]{};
        int n = nums.length;
        if (k <= 0 || k > n) return new int[]{};
        
        int[] dp = new int[k];
        int count;
        for (int i = 0; i < n; i++) {
            count = 0;
            for (int j = i + 1; j < n; j++) {
                if (nums[i] < nums[j]) {
                    dp[(count++) % k] = nums[j];
                }
                dp[k - 1] = nums[i];
            }
        }
        return dp;
    }

    
}