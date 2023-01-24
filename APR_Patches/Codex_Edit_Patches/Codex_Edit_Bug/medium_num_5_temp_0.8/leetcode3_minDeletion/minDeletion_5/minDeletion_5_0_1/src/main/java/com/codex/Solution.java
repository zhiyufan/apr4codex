package com.codex;

import java.util.*;

public class Solution {
    public static int minDeletion(int[] nums) {
        
        int length = nums.length;
        int count = 0;

        if (length < 3) {
            return 0;
        }

        for (int i = 0; i < length - 1; i++) {
            int j = i + 2;
            if (i % 2 == 0 && nums[i] == nums[i + 1] && nums[i] == nums[j] && nums[i + 1] == nums[j]) {
                count += 2;
                i++;
            } else if (i % 2 == 0 && nums[i] == nums[i + 1]) {
                count++; 
            }
        }
        return count;
    }

    
    
}