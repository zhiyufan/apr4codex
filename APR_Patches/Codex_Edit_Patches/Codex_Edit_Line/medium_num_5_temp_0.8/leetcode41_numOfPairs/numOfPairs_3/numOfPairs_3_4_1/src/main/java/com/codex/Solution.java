package com.codex;

import java.util.*;

public class Solution {
    public static int numOfPairs(String[] nums, String target) {
        
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
            //Have to do both ways or else you will get a half of the answers.
                if (Integer.parseInt(nums[i] + nums[j]) == Integer.parseInt(target) || Integer.parseInt(nums[j] + nums[i]) == Integer.parseInt(target)) ans++;
            }
        }
        return ans;
    }

    
}