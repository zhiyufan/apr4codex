package com.codex;

import java.util.*;

public class Solution {
    public static int minDeletion(int[] nums) {
        
        int len = nums.length;
        if (len <= 0) {
            return 0;
        }
        int count = 1;
        for (int i = 1; i < len; i++) {
            if (nums[i] == nums[i - 1]) {
                if (i + 1 < len) {
                    if (nums[i] == nums[i + 1]) {
                        count += 2;
                    } else {
                        count++;
                    }
                } else {
                    count++;
                }
            }
        }
        
        return count;
    }

    
}