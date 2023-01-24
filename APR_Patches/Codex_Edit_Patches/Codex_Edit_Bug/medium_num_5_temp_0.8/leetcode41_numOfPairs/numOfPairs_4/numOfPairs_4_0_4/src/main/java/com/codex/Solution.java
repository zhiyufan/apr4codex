package com.codex;

import java.util.*;

public class Solution {
    public static int numOfPairs(String[] nums, String target) {
        
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (Integer.parseInt(nums[i]) + Integer.parseInt(nums[j]) == Integer.parseInt(target)) {
                    count++;
                }
            }
        }
        return count;
    }

    
}