package com.codex;

import java.util.*;

public class Solution {
    public static int numOfPairs(String[] nums, String target) {
        
        int ans = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (Integer.valueOf(nums[i] + nums[j]) == Integer.valueOf(target)) ans++;
                if (Integer.valueOf(nums[j] + nums[i]) == Integer.valueOf(target)) ans++;
            }
        }
        return ans;
    }
    public static int numPairsThatEqualTarget(int[] nums, int target) {
        // Write your code here
        int len = nums.length;
        int pairs = 0;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (nums[i] + nums[j] == target) pairs++;
            }
        }
        return pairs;
    }

    
}