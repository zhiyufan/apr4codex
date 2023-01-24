package com.codex;

import java.util.*;

public class Solution {
public class Solution {
  public int minimumCost(int[] cost) {
    // Write your solution here
    int len = cost.length;
    if (len <= 2) {
      return Math.min(cost[0], cost[1]);
    }

    int[] minCost = new int[len];
    minCost[0] = cost[0];
    minCost[1] = cost[1];
    for (int i = 2; i < len; i++) {
      minCost[i] = Math.min(minCost[i - 1], minCost[i - 2]) + cost[i];
    }
    return Math.min(minCost[len - 1], minCost[len - 2]);
  }
}
}