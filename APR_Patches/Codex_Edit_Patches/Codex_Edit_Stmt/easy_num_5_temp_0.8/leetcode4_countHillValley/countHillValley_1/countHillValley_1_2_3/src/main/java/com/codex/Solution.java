package com.codex;

import java.util.*;

public class Solution {
public static int countHillValley(int[] nums) {

  if (nums == null || nums.length < 3) return 0;
  int count = 0;
  for (int i = 1; i < nums.length - 1; i++) {
    if (nums[i - 1] < nums[i] && nums[i + 1] < nums[i]) count++;
    if (nums[i - 1] > nums[i] && nums[i + 1] > nums[i]) count++;
  }
  return count;
}


public static void combinationSum(int[] nums, int target, List<Integer> partial, List<List<Integer>> results) {

  int intsum = 0;
  for (Integer i : partial) {
    intsum += i;
  }

  if (intsum == target) {
    results.add(partial);
  }

  if (intsum > target) {
    return;
  }

  for (int i = 0; i < nums.length; i++) {
    List<Integer> partial_result = new ArrayList<Integer>(partial);
    partial_result.add(nums[i]);
    combinationSum(nums, target, partial_result, results);
    }

}
}