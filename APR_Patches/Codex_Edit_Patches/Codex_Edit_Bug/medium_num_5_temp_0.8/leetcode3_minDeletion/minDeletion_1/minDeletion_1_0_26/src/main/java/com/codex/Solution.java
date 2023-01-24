package com.codex;

import java.util.*;

public class Solution {
    public static int minDeletion(int[] nums) {
        
        if (nums.length == 0)
            return 0;

        int count = 0;
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] % 2 == 0) {
                count += nums[i+1] % 2;
                
            } else {
                count += 1 - nums[i+1] % 2;
                
            }
        }
        return count;
    }

    
}