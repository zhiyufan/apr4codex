package com.codex;

import java.util.*;

public class Solution {
    public static int sumOfBeauties(int[] nums) {
        
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        int nowMin = nums[0];
        int nowMax = nums[nums.length - 1];
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > nowMin) {
                left[i] = 1;
            }
            nowMin = Math.min(nums[i], nowMin);
            if (nums[nums.length - 1 - i] < nowMax) {
                right[nums.length - 1 - i] = 1;
            }
            nowMax = Math.max(nums[nums.length - 1 - i], nowMax);
        }
        for (int i = 1; i < nums.length - 1; i++) 
            res += left[i] * right[i];
        return res;
    }
}