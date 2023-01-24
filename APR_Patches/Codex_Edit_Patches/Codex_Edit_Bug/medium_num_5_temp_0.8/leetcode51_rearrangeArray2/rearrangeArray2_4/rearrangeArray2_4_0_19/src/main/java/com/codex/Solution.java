package com.codex;

import java.util.*;

public class Solution {
    public static int[] rearrangeArray(int[] nums) {
        int[] ans = new int[nums.length];
        int index = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i += 2) {
            ans[i] = nums[index++];
        }
        for (int i = 1; i < nums.length; i += 2) {
            ans[i] = nums[index++];
        }
        return ans;
    }

    private static double aver(int[] nums) {
        double sum = 0.0;
        for (int num : nums) {
            sum += num;
        }
        return sum / nums.length;
    }

    
}