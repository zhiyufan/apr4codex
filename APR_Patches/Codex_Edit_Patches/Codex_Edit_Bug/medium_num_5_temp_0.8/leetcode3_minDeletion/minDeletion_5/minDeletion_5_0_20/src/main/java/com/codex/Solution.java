package com.codex;

import java.util.*;

public class Solution {
    public static int minDeletion(int[] nums) {
        
        int length = nums.length;
        int count = 0;
        int previous = 0;
        for (int i = 0; i < length - 1; i++) {
            if ((i % 2 != 0 && nums[i] == nums[i + 1]) || (previous != nums[i] && nums[i] != nums[i + 1])) {
                count++;
                previous = nums[i + 1];
            }
        }
        return count;
    }

    
    
}