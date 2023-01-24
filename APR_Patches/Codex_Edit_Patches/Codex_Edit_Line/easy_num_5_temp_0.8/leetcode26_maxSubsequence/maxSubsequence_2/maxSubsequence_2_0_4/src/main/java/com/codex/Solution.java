package com.codex;

import java.util.*;

public class Solution {
  public static List<Integer> minSubsequence(int[] nums) {
        List<Integer> res = new ArrayList<> ();
        Arrays.sort(nums);
        int sum1 = 0, sum2 = 0;
        for (int i = 0; i < nums.length; i++) sum1 += nums[i];
        sum2 = sum1;
        int i = nums.length-1;
        while (i >= 0 && sum1 >= sum2) {
            sum1 -= nums[i];
            sum2 -= nums[i];
            res.add(nums[i]);
            i--;
        }
        return res;
    }   
}