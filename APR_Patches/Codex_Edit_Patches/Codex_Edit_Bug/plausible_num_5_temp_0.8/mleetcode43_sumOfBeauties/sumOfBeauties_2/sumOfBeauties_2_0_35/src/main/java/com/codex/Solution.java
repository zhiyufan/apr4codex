package com.codex;

import java.util.*;

public class Solution {
    public static int sumOfBeauties(int[] nums) {
        
        int sum = 0;
        if (nums.length == 1) return 2;
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] > nums[i - 1] && nums[i] > nums[i + 1]) {
                int maxl = Integer.MIN_VALUE;
                int maxr = Integer.MIN_VALUE;
                for (int j = 0; j < i; j++) {
                    maxl = Math.max(maxl, nums[j]);
                }
                for (int j = i + 1; j < nums.length; j++) {
                    maxr = Math.max(maxr, nums[j]);
                }
                if (maxl > nums[i] && maxr > nums[i]) {
                    sum += 1;
                }
               
            } else {
                for (int j = 0; j < i; j++) {
                    for (int k = i + 1; k < nums.length; k++) {
                        if (nums[j] < nums[i] && nums[i] < nums[k]) {
                            sum += 2;
                        }
                    }
                }
            }
        }
        return sum;
    }

    
}