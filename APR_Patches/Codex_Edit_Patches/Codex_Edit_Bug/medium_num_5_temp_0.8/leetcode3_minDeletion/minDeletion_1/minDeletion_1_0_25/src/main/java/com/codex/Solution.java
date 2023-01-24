package com.codex;

import java.util.*;

public class Solution {
    public static int minDeletion(int[] nums) {
        int n = nums.length;
        if (n == 1) {
            return 1;
        }

        int count = 0;
        for (int i = 0; i < n-1; i++) {
            if (nums[i] % 2 == 0) {
                if (nums[i] == nums[i+1]) {
                    count++;
                }
            } else {
                if (nums[i] != nums[i+1]) {
                    count++;
                }
            }
        }
        return count;
    }

    
}