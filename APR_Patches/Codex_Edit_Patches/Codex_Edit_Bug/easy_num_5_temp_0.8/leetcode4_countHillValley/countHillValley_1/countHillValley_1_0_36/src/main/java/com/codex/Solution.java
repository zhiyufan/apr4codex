package com.codex;

import java.util.*;

public class Solution {
    public static int countHillValley(int[] nums) {
        
        if (nums == null || nums.length < 3) return 0;
        int count = 0;
        for (int i = 2; i < nums.length; i++) {
            boolean isHigher = nums[i] > nums[i - 1] && nums[i - 1] > nums[i - 2];
            boolean isLower =  nums[i] < nums[i - 1] && nums[i - 1] < nums[i - 2];
            if (isHigher || isLower) count++;
        }
        return count;
    }

    
}