package com.codex;

import java.util.*;

public class Solution {
    public static int sumOfBeauties(int[] nums) {
        int[] res = new int[nums.length];
        int sum = 0, nowMin = nums[0], nowMax = nums[nums.length - 1];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > nowMin) {
                res[i]++;
            }
            nowMin = Math.min(nums[i], nowMin);
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] < nowMax) {
                res[i]++;
            }
            nowMax = Math.max(nums[i], nowMax);
        }
        
        for (int i = 0; i < nums.length; i++) {
            if (res[i] > 0) {
                sum += res[i];
            }
        }
        
        return sum;
    }

    
}