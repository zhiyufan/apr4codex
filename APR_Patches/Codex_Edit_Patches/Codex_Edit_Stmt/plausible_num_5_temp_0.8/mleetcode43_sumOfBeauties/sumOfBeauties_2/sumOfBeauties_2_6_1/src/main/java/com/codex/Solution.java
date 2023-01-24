package com.codex;

import java.util.*;

public class Solution {
    public static int sumOfBeauties(int[] nums) {
        
        int sum = 0;
        if (nums.length == 1) return 2;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i - 1] && nums[i] < nums[i + 1]) {
                sum += 1;
            }
            else if (i == nums.length - 2 && nums[i] > nums[i + 1] && nums[i] < nums[i - 1]) {
                sum += 1;
            }
            else {
                for (int j = 0; j < i; j++) {
                    for (int k = i + 1; k < nums.length; k++) {
                        if (i == nums.length - 2) {
                            if (nums[i] > nums[k] && nums[i] < nums[j]) {
                                sum += 2;
                            }
                        } else if (j == 0) {
                            if (nums[j] < nums[i] && nums[i] < nums[k]) {
                                sum += 2;
                            }
                        } else {
                            if (nums[j] < nums[i] && nums[i] < nums[k]) {
                                sum += 2;
                            }
                        }
                    }
                }
            }
        }
        return sum;
    }

    
}