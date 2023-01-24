package com.codex;

import java.util.*;

public class Solution {
public static int[] findMaxSubarraySum(int[] nums) {
  int[] curr = new int[nums.length];
  int[] incl = new int[nums.length];
  int[] excl = new int[]{0};
  for (int i = 0; i < nums.length; i++) {
    curr[i] = Math.max(incl[i - 1], excl[i - 1]);
    if (i == 0) {
      incl[i] = nums[i];
    } else {
      incl[i] = curr[i - 1] + nums[i];
    }

    curr[i] = Math.max(incl[i], excl[i]);
    excl[i + 1] = curr[i];
  }
  return curr;
}
}