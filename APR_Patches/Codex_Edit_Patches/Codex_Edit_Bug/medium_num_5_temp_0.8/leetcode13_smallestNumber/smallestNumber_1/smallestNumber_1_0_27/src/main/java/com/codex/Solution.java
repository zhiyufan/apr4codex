package com.codex;

import java.util.*;

public class Solution {
        public static int maxSubArray(int[] nums) {
        // write your code here
        int max = nums[0];
        int sum = nums[0];
        for (int i = 0; i < nums.length; i++) {
            sum = Math.max(nums[i], sum + nums[i]);
            max = Math.max(sum, max);
        }
        if (max < 0) {
            return max;
        }
        return max;
    
    }
    
}