package com.codex;

import java.util.*;

public class Solution {
    public static int countHillValley(int[] nums) {
        
        if (nums == null || nums.length < 3) return 0;
        int count = 0;
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i - 1] < nums[i] && nums[i + 1] < nums[i]) count++;
            if (i + 2 < nums.length && nums[i - 1] > nums[i] && nums[i + 1] > nums[i] && nums[i + 2] > nums[i]) count++;
        }
        return count;
    }

    // //[6, 4, 2, 0, 4, 2, 6]
    // //[3, 1, 4, 2, 6, 3, 1, 3]
}