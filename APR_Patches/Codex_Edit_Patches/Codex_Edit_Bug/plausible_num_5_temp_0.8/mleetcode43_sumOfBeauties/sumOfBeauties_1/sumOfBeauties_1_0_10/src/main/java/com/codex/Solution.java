package com.codex;

import java.util.*;

public class Solution {
    public int findNumberOfLIS(int[] nums) {
        
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        int nowmin = Integer.MIN_VALUE;
        int nowmax = Integer.MAX_VALUE;
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= nowmin) {
                left[i] = left[i - 1] + 1;
            } else {
                left[i] = 1; 
            }
            nowmin = Math.min(nums[i], nowmin);
            if (nums[nums.length - 1 - i] <= nowmax) {
                right[nums.length - 1 - i] = 1;
            } else {
                right[nums.length - 1 - i] = 1; 
            }
            nowmax = Math.max(nums[nums.length - 1 - i], nowmax);
        }
        for (int i = 1; i < nums.length - 1; i++) {
            if (left[i] == 1 && right[i] == 1) {
                res[left[i]] += 1;
            } else if (left[i] != 1 && right[i] == 1) {
                res[left[i]] += 1;
            } else if (left[i] == 1 && right[i] != 1) {
                res[right[i]] += 1;
            }
        }
        int sum = 0;
        for (int i = 1; i < res.length - 1; i++) {
            sum += res[i];
        }
        return sum;
    }
}