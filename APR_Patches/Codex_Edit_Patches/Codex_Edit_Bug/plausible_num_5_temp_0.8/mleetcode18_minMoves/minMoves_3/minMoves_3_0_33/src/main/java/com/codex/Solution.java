package com.codex;

import java.util.*;

public class Solution {
  public static int minMoves2(int target, int maxDoubles) {

    int[] dp = new int[target + 1];
    for (int i = 1; i <= target; i++) {
      int minStep = i;
      int count = 0;
      while (count < maxDoubles && i % 2 == 0) {
        i /= 2;
        count++;
        minStep = Math.min(minStep, i + dp[i]);
      }
      dp[i] = minStep;
    }

    return dp[target];
  }
}