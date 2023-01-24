package com.codex;

import java.util.*;

public class Solution {
    public static int numOfPairs(String[] nums, int target) {
        
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (Integer.parseInt(nums[i] + nums[j]) == target || Integer.parseInt(nums[j] + nums[i]) == target) ans++;
            }
        }
        return ans;
    }

    
}