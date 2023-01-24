package com.codex;

import java.util.*;

public class Solution {
//    public int countSubstrings(String s) {
//        if (s == null || s.length() == 0) {
//            return 0;
//        }
//        int n = s.length();
//        boolean[][] dp = new boolean[n][n];
//        int res = 0;
//        for (int i = n - 1; i >= 0; i--) {
//            for (int j = i; j < n; j++) {
//                if (s.charAt(i) == s.charAt(j) && ((j - i <= 1) || (j - 1 >= 0 && dp[i + 1][j - 1]))) {
//                    dp[i][j] = true;
//                    res++;
//                }
//            }
//        }
//        return res;
//    }


    public static int countHillValley(int[] nums) {
        
        if (nums == null || nums.length < 3) {
            return 0;
        }
        int result = 0;
        for (int i = 1; i < nums.length - 1; i++) {
            if ((nums[i - 1] < nums[i] && nums[i] > nums[i + 1]) || (nums[i - 1] > nums[i] && nums[i] < nums[i + 1]))
            {
                result++;
            }
        }
        return result;

    }
}