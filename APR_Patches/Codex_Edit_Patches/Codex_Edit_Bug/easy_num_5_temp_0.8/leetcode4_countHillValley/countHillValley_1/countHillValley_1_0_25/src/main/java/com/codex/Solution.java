package com.codex;

import java.util.*;

public class Solution {
    public static int countHillValley(int[] nums) {
        
        if (nums == null || nums.length < 3) return 0;
        int count = 0;
        boolean isIncreasing = false;
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i - 1] < nums[i] && nums[i + 1] < nums[i]) {
                if (isIncreasing) count++;
                isIncreasing = false;
            }
            if (nums[i - 1] > nums[i] && nums[i + 1] > nums[i]) {
                if (!isIncreasing) count++;
                isIncreasing = true;
            }
        }
        return count;
    }

    
}