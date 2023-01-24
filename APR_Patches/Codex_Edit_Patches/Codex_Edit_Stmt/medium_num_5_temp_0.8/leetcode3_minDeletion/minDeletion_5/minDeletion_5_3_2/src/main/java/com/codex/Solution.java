package com.codex;

import java.util.*;

public class Solution {
public class LeetCode_532_0147 {

  public int findPairs(int[] nums, int k) {
    if (nums.length <= 0 || k < 0) {
      return 0;
    }

    Map<Integer, Integer> map = new HashMap<>();
    for (int i : nums) {
      map.put(i, map.getOrDefault(i, 0) + 1);
    }

    int count = 0;
    for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
      if (k == 0) {
        //count how many elements in the array that appear more than twice.
        if (entry.getValue() >= 2) {
          count++;
        }
      } else {
        if (map.containsKey(entry.getKey() + k)) {
          count++;
        }
      }
    }
    return count;
  }
}

    
    
}