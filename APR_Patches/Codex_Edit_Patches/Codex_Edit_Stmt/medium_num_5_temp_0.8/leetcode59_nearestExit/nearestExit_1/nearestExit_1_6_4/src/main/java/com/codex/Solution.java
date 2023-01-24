package com.codex;

import java.util.*;

public class Solution {
    public static int longestIncreasingSubarray(int[] nums) {
      if (nums.length == 0)
        return 0;
      int max = 1;
      int curr = 1;
      for (int i = 1; i < nums.length; i++) {
        if (nums[i - 1] < nums[i])
          curr++;
        else
          curr = 1;
        max = Math.max(max, curr);
      }
      return max;
    }

    

    
}