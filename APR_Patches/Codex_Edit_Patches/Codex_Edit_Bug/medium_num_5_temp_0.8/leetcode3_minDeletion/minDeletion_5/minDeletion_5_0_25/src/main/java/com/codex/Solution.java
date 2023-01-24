package com.codex;

import java.util.*;

public class Solution {
    public static int minDeletion(int[] nums) {
        
        int max = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        return count;
    }

    
    
}