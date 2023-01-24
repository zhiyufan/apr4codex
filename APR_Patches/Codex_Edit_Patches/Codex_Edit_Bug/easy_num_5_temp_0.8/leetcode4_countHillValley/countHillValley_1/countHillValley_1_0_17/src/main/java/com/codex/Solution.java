package com.codex;

import java.util.*;

public class Solution {
    public static int countHillValley(int[] nums) {
        
        if (nums == null || nums.length < 3) return 0;
        int prev = nums[1] - nums[0];
        int cur;
        int count = 0; 
        for (int i = 2; i < nums.length; i++) {
            cur = nums[i] - nums[i - 1];
            if (cur == 0) continue;
            if (prev > 0 && cur < 0 || prev < 0 && cur > 0) {
                count++;
            }
            prev = cur;
        }
        return count;
    }

}