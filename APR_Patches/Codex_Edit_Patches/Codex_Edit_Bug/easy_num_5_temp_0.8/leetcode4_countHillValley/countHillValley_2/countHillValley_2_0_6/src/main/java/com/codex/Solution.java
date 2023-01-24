package com.codex;

import java.util.*;

public class Solution {
    public static int countHillValley(int[] nums) {
        
        int hills = 0;
        int valleys = 0;
        int i = 1;
        while (i < nums.length) {
            if (nums[i] < nums[i + 1]) {
                while (i < nums.length - 1 && nums[i] < nums[i + 1]) i++;
                hills++;
            } else if (nums[i] > nums[i + 1]) {
                while (i < nums.length - 1 && nums[i] > nums[i + 1]) i++;
                valleys++;
            }
        }
        return hills + valleys;
    }

    
}