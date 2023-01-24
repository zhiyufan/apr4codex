package com.codex;

import java.util.*;

public class Solution {
    public static int numOfPairs(String[] nums, String target) {
        
        int ans = 0, sum = Integer.valueOf(target);
        if (nums.length == 0) return ans;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {               
                ans += ((Integer.valueOf(nums[i] + nums[j]) == sum) || (Integer.valueOf(nums[j] + nums[i]) == sum)) ? 1 : 0;
            }
        }
        return ans;
    }

    
}