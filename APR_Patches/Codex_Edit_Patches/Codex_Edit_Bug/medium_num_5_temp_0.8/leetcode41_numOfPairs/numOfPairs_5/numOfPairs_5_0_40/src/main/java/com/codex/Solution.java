package com.codex;

import java.util.*;

public class Solution {
    public static int numOfPairs(String[] nums, String target) {
        
        int ans = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (Integer.valueOf(nums[i] + nums[j]) == Integer.valueOf(target)) ans++; // Did not count the same string twice
                if (Integer.valueOf(nums[j] + nums[i]) == Integer.valueOf(target)) ans++; // Did not count the same string twice
            }
        }
        return ans;
    }

    
}