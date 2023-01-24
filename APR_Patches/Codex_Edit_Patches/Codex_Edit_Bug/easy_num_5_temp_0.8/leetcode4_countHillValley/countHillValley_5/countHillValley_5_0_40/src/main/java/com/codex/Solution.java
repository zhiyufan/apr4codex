package com.codex;

import java.util.*;

public class Solution {
    public static int countHillValley(int[] nums) {
        
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                continue;
            }

            if (i == 0) {
                if (nums[i] > nums[i + 1]) {
                    count++;
                }
            } else {
                if (nums[i - 1] < nums[i] && nums[i] > nums[i + 1]) {
                    count++;
                }

                if (nums[i - 1] > nums[i] && nums[i] < nums[i + 1]) {
                    count++;
                }
            }
        }
        return count;
    }

    
}