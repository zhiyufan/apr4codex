package com.codex;

import java.util.*;

public class Solution {
import java.util.Arrays;
public class First {

  public static int[] pivotArray(int[] nums, int pivot) {

    int i = 0, j = nums.length-1;
    while (i <= j) {
      if (nums[i] < pivot) {
        i++;
      } else if (nums[j] > pivot) {
        j--;
      } else {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
        i++;
        j--;
      }
    }

    return nums;
  }

  public static void main(String[] args) {
    System.out.println(Arrays.toString(pivotArray(new int[]{2, 7, 5, 3, 1, 7, 4, 5, 4}, 7)));
  }
}
}