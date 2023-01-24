package com.codex;

import java.util.*;

public class Solution {
 public static int sumOfBeauties(int[] nums) {
        
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        int nowmin = Integer.MAX_VALUE;
        int nowmax = Integer.MIN_VALUE;
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > nowmin) {
                left[i] = 1;
            }
            if (nowmin == Integer.MAX_VALUE) {
                nowmin = nums[i];
            } else {
                nowmin = Math.min(nums[i], nowmin);
            }
            if (nums[nums.length - 1 - i] < nowmax) {
                right[nums.length - 1 - i] = 1;
            }
            if (nowmax == Integer.MIN_VALUE) {
                nowmax = nums[nums.length - 1 - i];
            } else {
                nowmax = Math.max(nums[nums.length - 1 - i], nowmax);
            }
        }
        for (int i = 1; i < nums.length - 1; i++) {
            if (left[i] == 1 && right[i] == 1) {
                res[i] = 2;
            } else if (left[i] == 1 || right[i] == 1) {
                res[i] = 1;
            }
        }
        int sum = 0;
        for (int i = 1; i < res.length - 1; i++) {
            sum += res[i];
        }
        return sum;
    }

    
}