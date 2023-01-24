package com.codex;

import java.util.*;

public class Solution {
public class Solution {
  public int minimumCost(int[] costs) {
    // Write your solution here
    if(costs == null || costs.length == 0) {
      return 0;
    }
    int min = Integer.MAX_VALUE;
    int secondMin = Integer.MAX_VALUE;
    int res = 0;
    for(int cost : costs) {
      if(cost <= min) {
        res += min;
        secondMin = min;
        min = cost;
      } else if(cost < secondMin) {
        res += cost;
        secondMin = cost;
      } else {
        res += secondMin;
      }
    }
    return res;
  }
}
}