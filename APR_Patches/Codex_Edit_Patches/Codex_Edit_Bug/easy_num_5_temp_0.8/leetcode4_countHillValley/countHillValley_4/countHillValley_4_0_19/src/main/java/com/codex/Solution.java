package com.codex;

import java.util.*;

public class Solution {
    public static int countHillValley(int[] nums) {
        

        int count = 0;
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i-1] < nums[i] && nums[i] > nums[i+1]) {
                count++;
            }
            if (nums[i-1] > nums[i] && nums[i] < nums[i+1]) {
                count++;
            }
        }
    public static int minCost(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for(int i = 1; i < nums.length; i++) {
            sum += nums[i] - nums[i-1];
        }
        return sum;
    }

        return count;
    }


    
    
}