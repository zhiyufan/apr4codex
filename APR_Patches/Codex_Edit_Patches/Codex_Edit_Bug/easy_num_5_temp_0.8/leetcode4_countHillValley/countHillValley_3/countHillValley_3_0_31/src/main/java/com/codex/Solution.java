package com.codex;

import java.util.*;

public class Solution {
    public static int countHillValley(int[] nums) {
        
        if (nums == null || nums.length < 3) {
            return 0;
        }
        int valley = 0;
        int hill = 0;
        int result = 0;
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] == nums[i - 1] || nums[i] == nums[i + 1])  {
                continue;
            } else if (nums[i - 1] < nums[i] && nums[i] > nums[i + 1]) { 
                hill++;
                if (hill > 0 && valley < 0) {
                    result++;
                }
                valley = 0;
            } else if (nums[i - 1] > nums[i] && nums[i] < nums[i + 1]) {
                valley--;
                if (valley < 0 && hill > 0) {
                result++;
            }
        }
        return result;
    }

    
}