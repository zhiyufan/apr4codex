package com.codex;

import java.util.*;

public class Solution {
    public static int sumOfBeauties(int[] nums) {
        
        int sum = 0;
        if (nums.length == 1) return 2;
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] > nums[i - 1] && nums[i] < nums[i + 1]) {
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

    public static int count(int[] nums, int k) {
        
        if (nums.length == 0) return 0;
        int count = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (j == i) continue;
                if (nums[i] + nums[j] == k) {
                    count++;
                }
            }
        }
        return count;
    }
    

    
}