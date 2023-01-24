package com.codex;

import java.util.*;

public class Solution {

    public static int countHillValley(int[] nums) {
        
        int count = 0;
        for (int i = 1; i < nums.length - 1; i++) {
            int left = nums[i - 1];
            int mid = nums[i];
            int right = nums[i + 1];

            if (left < mid && mid > right || left > mid && mid < right) {
                count++;
            }
            
        }
        return count;
    }

    
}