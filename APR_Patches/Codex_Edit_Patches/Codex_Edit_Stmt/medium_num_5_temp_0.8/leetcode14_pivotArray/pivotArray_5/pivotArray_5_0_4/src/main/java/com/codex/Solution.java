package com.codex;

import java.util.*;

public class Solution {
    public static int[] pivotIndex(int[] nums) {
        
        int n = nums.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
        }
        int leftSum = 0;
        for (int i = 0; i < n; i++) {
            if (i != n - 1) {
                if (sum - nums[i] - leftSum == leftSum) {
                    return new int[] { i };
                } else {
                    leftSum += nums[i];
                }
            } else {
                if (sum - leftSum == leftSum) {
                    return new int[] { i };
                }
            }
        }
        return new int[] { -1 };
    }

    
}