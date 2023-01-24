package com.codex;

import java.util.*;

public class Solution {
import java.util.*;

public class RunningAverage {

  public static int[] getAverages(int[] nums, int k) {
        

      int[] result = new int[nums.length];
      int sum = 0;
      for (int i = 0; i < k; i++) {
        sum += nums[i];
      }
      for (int i = 0; i < nums.length; i++) {
        if (i - k < 0 || i + k >= nums.length) {
            result[i] = -1;
        } else if (i == 0) {
            int j = 0;
            sum = 0;
            while (j < 2 * k + 1) {
                sum += nums[i + j];
                j++;
            }
            result[i] = sum / (2 * k + 1);
        } else {
            sum = result[i - 1] * (2 * k + 1);
            sum -= nums[i - 1];
            sum += nums[i + k];
            result[i] = sum / (2 * k + 1);
        }	
      }
      return result;
    }

  public static void main(String[] args) {
      int[] nums = { 1, 3, 2, 6, -1, 4, 1, 8, 2 };
      int[] result = getAverages(nums, 4);
      System.out.println("Averages of subarrays of size K: " + Arrays.toString(result));
  }
}
    
}