package com.codex;

import java.util.*;

public class Solution {
    public static int numOfPairs(String[] nums, String target) {
        
        int ans = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (Long.parseLong(nums[i] + nums[j]) == Long.parseLong(target)) ans++;
                if (Long.parseLong(nums[j] + nums[i]) == Long.parseLong(target)) ans++;
            }
        }
        return ans;
    }

    
}