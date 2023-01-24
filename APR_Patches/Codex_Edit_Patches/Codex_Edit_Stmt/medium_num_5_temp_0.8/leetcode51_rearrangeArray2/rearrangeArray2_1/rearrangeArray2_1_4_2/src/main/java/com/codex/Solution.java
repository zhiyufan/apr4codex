package com.codex;

import java.util.*;

public class Solution {
    public static int[] rearrangeArray2(int[] nums) {
        
        int n = nums.length;
        int[] average = new int[n];
        for (int i = 0; i < n-2; i++) {
            average[i] = (nums[i-1] + nums[i+1])/2;
        }

        average[0] = (nums[n-1] + nums[1])/2;
        average[n-1] = (nums[n-2] + nums[0])/2;

        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] > average[i] ? average[i] : nums[i];
        }

        return nums;
    }
}