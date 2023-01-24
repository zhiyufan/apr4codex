package com.codex;

import java.util.*;

public class Solution {
    public static int countHillValley(int[] nums) {
        
        int hills = 0;
        int valleys = 0;
        int i = 1;
        while (i < nums.length) {
            if (nums[i - 1] == nums[i]) {
                i++;
                continue;
            }
            if (nums[i - 1] < nums[i]) {
                while (i < nums.length - 1 && nums[i - 1] <= nums[i]) i++;
                hills++;
            } else if (nums[i - 1] > nums[i]) {
                while (i < nums.length - 1 && nums[i - 1] >= nums[i]) i++;
                valleys++;
            }
        }
        return hills + valleys;
    }

}