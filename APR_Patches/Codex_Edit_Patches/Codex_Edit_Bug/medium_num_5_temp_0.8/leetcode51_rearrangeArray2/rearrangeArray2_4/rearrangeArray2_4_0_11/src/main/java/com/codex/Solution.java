package com.codex;

import java.util.*;

public class Solution {
import java.util.Arrays;

public class Test {
  public static void main(String[] args) {
    int[] nums = new int[]{-4, 0, -9, 5, -1, -1, -8, -2, 0, -7, -10, -10, -4, -9, 5, -1, -1, -8, -2, 0, -7, -10};
    System.out.println(Arrays.toString(rearrangeArray2(nums)));
  }

  public static int[] rearrangeArray2(int[] nums) {
    double avg = aver(nums);
    int[] ans = new int[nums.length];
    int index = 0;
    for (int num : nums) {
      if (num != avg) {
        ans[index++] = num;
      }
    }

    private static double aver(int[] nums) {
        double sum = 0.0;
        for (int num : nums) {
            sum += num;
        }
        return sum / nums.length;
    }

    
}