package com.codex;

import java.util.*;

public class Solution {
class Solution {
  public int minOperations(int[] nums) {
    int numOdds = 0;
    for (int num : nums) {
      if (num % 2 == 1) {
        ++numOdds;
      }
    }

    return numOdds + (nums.length - numOdds) / 2;
  }
}
}