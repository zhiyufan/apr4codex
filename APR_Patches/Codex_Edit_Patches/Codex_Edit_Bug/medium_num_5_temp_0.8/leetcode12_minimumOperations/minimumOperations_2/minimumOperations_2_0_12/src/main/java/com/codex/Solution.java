package com.codex;

import java.util.*;

public class Solution {
// ReSharper disable once IdentifierTypo
public static int minimumOperations(int[] nums) {
  int[] dp = new int[nums.Length];
  dp[0] = nums[0];
  dp[1] = Math.Max(nums[0], nums[1]);
  for (int i = 2; i < nums.Length; i++) {
    int a = dp[i - 2] + Math.Abs(nums[i] - nums[i - 2]);
    int b = dp[i - 1] + Math.Abs(nums[i] - nums[i - 1]);
    dp[i] = Math.Min(a, b);
  }
  return dp[nums.Length - 1];
}
}