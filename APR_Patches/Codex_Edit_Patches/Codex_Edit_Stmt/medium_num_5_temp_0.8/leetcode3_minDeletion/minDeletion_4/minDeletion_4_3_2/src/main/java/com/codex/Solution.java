package com.codex;

import java.util.*;

public class Solution {
    public static int minDeletion(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                count++;
            }
        }
        if (nums.length % 2 == 0) {
            return Math.min(count, nums.length - count);
        } else {
            return Math.min(count - 1, nums.length - count);
        }
        return count;
    }

    
}