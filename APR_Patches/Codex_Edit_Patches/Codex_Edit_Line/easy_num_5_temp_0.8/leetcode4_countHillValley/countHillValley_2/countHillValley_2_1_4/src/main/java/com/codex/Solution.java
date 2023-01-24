package com.codex;

import java.util.*;

public class Solution {
    public static int countHillValley(int[] nums) {
        int length = nums.length;
        int hills = 0;
        int valleys = 0;
        int i = 0;
        while (i < length - 1) {
            if (nums[i] < nums[i + 1]) {
                while (i < length - 1 && nums[i] <= nums[i + 1]) i++;
                hills++;
            } else if (nums[i] > nums[i + 1]) {
                while (i < length - 1 && nums[i] >= nums[i + 1]) i++;
                valleys++;
            }
            i++;
        }
        return hills + valleys;
    }

    
}