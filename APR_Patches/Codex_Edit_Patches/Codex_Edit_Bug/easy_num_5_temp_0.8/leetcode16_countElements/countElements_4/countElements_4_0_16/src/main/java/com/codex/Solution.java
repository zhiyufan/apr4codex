package com.codex;

import java.util.*;

public class Solution {
    public static int maxSubArray(int[] nums) {
        
        int result = Integer.MIN_VALUE;
        for (int i = 1; i < nums.length; i++) {
            int currentMax = nums[i] + nums[i - 1];
            result = Math.max(result, currentMax);
        }

        return result;
    }

    
}