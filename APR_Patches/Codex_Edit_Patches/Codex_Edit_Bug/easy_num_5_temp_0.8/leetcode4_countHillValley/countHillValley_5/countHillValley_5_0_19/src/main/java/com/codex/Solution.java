package com.codex;

import java.util.*;

public class Solution {
    public static int countHillValley(int[] nums) {
        
        int count = 0;
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                continue;
            }

            if (nums[i - 1] < nums[i] && nums[i] > nums[i + 1]) {
                count++;
            }

            if (nums[i - 1] > nums[i] && nums[i] < nums[i + 1]) {
                count++;
            }






    





    public static int countHillValley(int[] nums) {
        
        if (nums == null || nums.length <= 2) {
            return 0;
        }
        int count = 0;
        for (int i = 1; i < nums.length - 1; i++) {
            if (  (nums[i - 1] < nums[i] && nums[i] > nums[i + 1]) || (nums[i - 1] > nums[i] && nums[i] < nums[i + 1])) {
                count++;
            }

        }
        return count;
    }
        }
        return count;
    }

    
}