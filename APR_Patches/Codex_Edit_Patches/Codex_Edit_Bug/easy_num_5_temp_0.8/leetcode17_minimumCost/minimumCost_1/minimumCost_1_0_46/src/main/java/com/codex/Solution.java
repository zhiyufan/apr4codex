package com.codex;

import java.util.*;

public class Solution {
import java.util.Arrays;

public class MinimumCostClimbingStairs {

  public static int minimumCost(int[] cost) {

    if (cost.length == 1) return cost[0];
    int[] dp = new int[cost.length];
    dp[0] = cost[0];
    dp[1] = cost[1];
    for (int i = 2; i < cost.length; i++) {
      dp[i] = cost[i] + Math.min(dp[i - 1], dp[i - 2]);
    }

    return Math.min(dp[dp.length - 1], dp[dp.length - 2]);
  }

  public static void main(String[] args) {
    System.out.println(minimumCost(new int[] {10, 15, 20}));
    System.out.println(minimumCost(new int[] {1, 100, 1, 1, 1, 100, 1, 1, 100, 1}));
    System.out.println(minimumCost(new int[] {0, 0, 0, 1}));

  }

}
}