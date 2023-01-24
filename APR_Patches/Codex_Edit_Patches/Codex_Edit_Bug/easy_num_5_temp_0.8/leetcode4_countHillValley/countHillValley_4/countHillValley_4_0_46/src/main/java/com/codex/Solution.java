package com.codex;

import java.util.*;

public class Solution {
    public static int countHillValley(int[] nums) {
        

        int count_valley = 0;
        int count_hill = 0;
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i-1] < nums[i] && nums[i] > nums[i+1]) {
                count_hill++;
            }
            if (nums[i-1] > nums[i] && nums[i] < nums[i+1]) {
                count_valley++;
            }
        }
        return count;
    }


    
    
}