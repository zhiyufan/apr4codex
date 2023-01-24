package com.codex;

import java.util.*;

public class Solution {
public class Solution {
  public static int[] pivotArray(int[] nums, int pivot) {
    int smaller = 0;
    int equal = 0;
    int greater = nums.length;
    while (equal < greater) {
      if (nums[equal] < pivot) {
        swap(nums, smaller++, equal++);
      } else if (nums[equal] == pivot) {
        ++equal;
      } else {
        swap(nums, equal, --greater);
      }
    }
    return nums;
  }

  private static void swap(int[] nums, int i, int j) {
    int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
  }
}
}