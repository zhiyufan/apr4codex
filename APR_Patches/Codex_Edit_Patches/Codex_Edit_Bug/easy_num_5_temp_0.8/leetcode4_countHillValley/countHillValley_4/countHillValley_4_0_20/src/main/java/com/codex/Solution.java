package com.codex;

import java.util.*;

public class Solution {
public static int countHillValley(int[] nums) {
    
    /**
     * find the number of hill valleys in the given integer array
     * @param nums the input integer array
     */
    int count = 0;
    for (int i = 1; i < nums.length - 1; i++) {
        if (nums[i-1] < nums[i] && nums[i] > nums[i+1]) {
            count++;
        }
        if (nums[i-1] > nums[i] && nums[i] < nums[i+1]) {
            count++;
        }
    }
    return count;
}


    
    
}