package com.codex;

import java.util.*;

public class Solution {
    public static int sumOfBeauties(int[] nums) {
        
        int sum = 0;
        for(int i = 1; i < nums.length - 1; i++) {
            if(nums[i - 1] < nums[i] && nums[i] < nums[i + 1]) {
                sum += 1;
            } else if(nums[i - 1] > nums[i] && nums[i] > nums[i + 1]) {
                sum += 1;
            } else {
                sum += 2;
            }
        }
        return sum;
    }
}