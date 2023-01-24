package com.codex;

import java.util.*;

public class Solution {
    public static int minDeletion(int[] nums) {
        
        // System.out.println(getMinDeletion(nums));
        int length = nums.length;
        int count = 0;
        for (int i = 0; i < length - 1; i++) {
            // System.out.println(nums[i]);
            // System.out.println(nums[i + 1]);
            // System.out.println(i);
            if (i % 2 == 0 && nums[i] == nums[i + 1]) {
                count++;
            }
        }
        return count;
    }

    
    
}