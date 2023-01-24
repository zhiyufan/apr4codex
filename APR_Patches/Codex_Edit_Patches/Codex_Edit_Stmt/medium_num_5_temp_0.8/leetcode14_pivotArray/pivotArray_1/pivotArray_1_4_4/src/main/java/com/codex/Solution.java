package com.codex;

import java.util.*;

public class Solution {
public class Solution {
  public int[] pivotIndex(int[] nums) {
    int sum1 = 0;
    int sum2 = 0;
    for (int i = 0; i < nums.length; i++) {
      sum2 += nums[i];
    }
    for (int i = 0; i < nums.length; i++) {
      sum1 += nums[i];
      sum2 -= nums[i];
      if (sum1 == sum2) {
        return nums;
      }
    }
    return nums;
  }
}
}