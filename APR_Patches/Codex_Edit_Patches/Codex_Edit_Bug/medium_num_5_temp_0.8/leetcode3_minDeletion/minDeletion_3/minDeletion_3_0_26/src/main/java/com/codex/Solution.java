package com.codex;

import java.util.*;

public class Solution {
import java.util.ArrayList;
import java.util.List;

public class Solution {

  public static int minDeletion(int[] nums) {

    int count = 0;
    for (int i = 0; i < nums.length - 1; i++) {
      if (nums[i] % 2 == 0 && nums[i] == nums[i + 1]) {
        count++;
      }
    }

    return count;
  }


  
}
// [5,13,8,7,10]
// [5,13,8,9,10]
// [1,1]
}