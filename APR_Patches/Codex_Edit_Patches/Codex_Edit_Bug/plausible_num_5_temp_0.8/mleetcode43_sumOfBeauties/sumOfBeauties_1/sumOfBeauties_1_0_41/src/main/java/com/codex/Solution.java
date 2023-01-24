package com.codex;

import java.util.*;

public class Solution {
    public static int sumOfBeauties(int[] nums) {
        
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        int nowmin = nums[0];
        int nowmax = nums[nums.length - 1];
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > nowmin) {
                res++;
            }
            nowmin = Math.min(nums[i], nowmin);
            if (nums[nums.length - 1 - i] < nowmax) {
                res++;
            }
            nowmax = Math.max(nums[nums.length - 1 - i], nowmax);
        }
        for (int i = 1; i < nums.length - 1; i++) {
            res--;
        }
        return sum;
    }

    
}