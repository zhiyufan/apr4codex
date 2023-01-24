package com.codex;

import java.util.*;

public class Solution {
    public static int minDeletion(int[] nums) {
        
        int length = nums.length;
        int result = 0;
        for (int i = 1; i < length; i++) {
            if (i % 2 == 1 && nums[i] == nums[i - 1]) {
                result++;
            }
        }
        return result;
    }

    
    
}