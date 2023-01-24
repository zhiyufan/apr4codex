package com.codex;

import java.util.*;

public class Solution {
    public static int sumOfBeauties(int[] nums) {

        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        int[] res = new int[nums.length];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < max) {
                left[i] = 1;
            }
            max = Math.max(max, nums[i]);
        }

        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] > min) {
                right[i] = 1;
            }
            min = Math.min(min, nums[i]);
        }

        for (int i = 1; i < nums.length - 1; i++) {
            res[i] = left[i] + right[i];
        }

        int sum = 0;
        for (int i = 1; i < res.length - 1; i++) {
            sum += res[i];
        }
        
        return sum;
    }

    
}