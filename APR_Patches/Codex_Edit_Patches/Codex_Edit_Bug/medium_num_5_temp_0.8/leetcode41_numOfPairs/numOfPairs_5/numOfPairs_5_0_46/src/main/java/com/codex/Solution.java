package com.codex;

import java.util.*;

public class Solution {
 public static int numOfPairs(String[] nums, String target) {
        
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length + 1; j++) {
                if (Integer.valueOf(nums[i]) + Integer.valueOf(nums[j]) == Integer.valueOf(target)) ans++;
                if (Integer.valueOf(nums[j]) + Integer.valueOf(nums[i]) == Integer.valueOf(target)) ans++;
            }
        }
        return ans;
    }

    
}