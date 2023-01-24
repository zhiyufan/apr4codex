package com.codex;

import java.util.*;

public class Solution {
  public List<Integer> searchRange(int[] nums, int target) {
        int first = firstOccurrence(nums, target);
        int last = lastOccurrence(nums, target);
        return Arrays.asList(first, last);
    }
}