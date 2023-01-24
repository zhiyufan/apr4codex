package com.codex;

import java.util.*;

public class Solution {
    public static int sumOfBeauties(int[] nums) {
        
        int sum = 0;
        if (nums.length == 1) return 1;
        for (int i = 0; i < nums.length; i++) {
            if (i - 1 < 0 && nums[i] > nums[i + 1]) {
                sum += 1;
            } else if (i + 1 >= nums.length && nums[i] > nums[i - 1]) {

            } else if (nums[i] > nums[i - 1] && nums[i] > nums[i + 1]) {
                sum += 1;
            } else if (nums[i] > nums[i + 1] && nums[i] < nums[i - 1]) {
                sum += 1;
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