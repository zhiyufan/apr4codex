package com.codex;

import java.util.*;

public class Solution {
    public static int numOfPairs(String[] nums, String target) {
        
        int ans = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                if (Integer.parseInt(nums[i] + nums[j]) < Integer.parseInt(target) && Integer.parseInt(nums[i] + nums[j+1]) >Integer.parseInt(target)) {
                    ans = j - i;
                    break;
                }
            }
        }
        return ans;
    }

    
}