package com.codex;

import java.util.*;

public class Solution {
    public static int numOfPairs(int[] nums, int target) {
        
        int ans = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (Integer.valueOf(nums[i] + nums[j]) == (target)) ans++;
                if (Integer.valueOf(nums[j] + nums[i]) == (target)) ans++;
            }
        }
        return ans;
    }

    
}