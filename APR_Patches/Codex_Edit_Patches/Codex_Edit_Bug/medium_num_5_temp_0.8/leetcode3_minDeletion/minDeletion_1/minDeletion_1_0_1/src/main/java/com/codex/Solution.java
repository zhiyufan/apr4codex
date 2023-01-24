package com.codex;

import java.util.*;

public class Solution {
    public static int minDeletion(int[] nums, int index) {
        
        if (index == nums.length) {
            return 0;
        }

        int count = 0;
        int res1 = 0;
        int res2 = 0;
        for (int i = index; i < nums.length-1; i++) {
            if (nums[i] % 2 == 0) {
                if (nums[i] == nums[i+1]) {
                    count++;
                }
            } else {
                if (nums[i] == nums[i+1]) {
                    count++;
                }
            }
        }
        res1 = count+minDeletion(nums, index+1);
        return Math.min(res1, res2);
    }

    
}