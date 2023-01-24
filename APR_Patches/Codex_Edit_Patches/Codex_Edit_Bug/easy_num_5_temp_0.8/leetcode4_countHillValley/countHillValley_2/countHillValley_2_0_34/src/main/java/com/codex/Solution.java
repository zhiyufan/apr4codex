package com.codex;

import java.util.*;

public class Solution {
    public static int countHillValley(int[] nums) {
        
        int valleys = 0;
        int hills = 0;
        int i = 1;
        while (i < nums.length) {
            if (nums[i] < nums[i - 1]) {
                while (i < nums.length && nums[i] <= nums[i - 1]) i++;
                if (i == nums.length) return hills + valleys;
                valleys++; i++;
            } else if (nums[i] > nums[i - 1]) {
                while (i < nums.length && nums[i] >= nums[i - 1]) i++;
                if (i == nums.length) return hills + valleys;
                hills++; i++;
            } else {
                ++i;
            }
            i++;
        }
        return hills + valleys;
    }

    
}