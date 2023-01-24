package com.codex;

import java.util.*;

public class Solution {
    public static int minimumOperations(int[] nums) {
        
        int len = nums.length;
        int[][] dp = new int[len][2];
        dp[0][0] = 0;
        dp[0][1] = 1;
        dp[1][0] = dp[1][1] = 1;
        for (int i = 2; i < len; i++) {
            dp[i][0] = dp[i-1][0];
            if (nums[i] != nums[i-1]) {
                dp[i][0] += 1;
            }
            dp[i][1] = Math.min(dp[i-1][0], dp[i-1][1]);
            if (nums[i] != nums[i-1]) {
                dp[i][1] += 1;
            }
        }
        return Math.min(dp[len-1][0], dp[len-1][1]);
    }

     //  if (nums== null || nums.length == 0) return 0;

  //  int n = nums.length;

  //  int[][] f = new int[n][2];

  //  f[0][0] = 0;
  //  f[0][1] = 1;

  //  for (int i = 1; i < n; i++) {
  //    f[i][0] = f[i - 1][0];
  //    if (nums[i] != nums[i - 1]) {
  //      f[i][0]++;
  //    }
  //    f[i][1] = f[i - 1][1];
  //    if (nums[i] != nums[i - 1]) {
  //      f[i][1]++;
  //    }
  //    if (i >= 2) {
  //      f[i][1] = Math.min(f[i][1], f[i - 1][0] + 1);
  //    }
  //  }

  //  return Math.min(f[n - 1][0], f[n - 1][1]);
}