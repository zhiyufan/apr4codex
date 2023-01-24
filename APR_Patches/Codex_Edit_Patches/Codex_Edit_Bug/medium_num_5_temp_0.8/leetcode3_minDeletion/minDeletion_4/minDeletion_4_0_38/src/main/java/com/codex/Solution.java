package com.codex;

import java.util.*;

public class Solution {
    public static int minDeletion(int[] nums) {
        
        int count = 0;
        for (int i = 0; i < nums.length - 1; i += 2) {
            if (nums[i] == nums[i + 1]) {
                count++;
            }
        }
        if (nums.length % 2 == 1) {
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] == nums[i + 1]) {
                    count++;
                }
            }
        }
        if (nums == null || nums.length == 0) return 0;
        int result = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                result++;
                if (i < nums.length - 2 && nums[i + 2] == nums[i]) {
                    i++;
                }
            }
        }
        return result;
    }

    
}