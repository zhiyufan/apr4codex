package com.codex;

import java.util.*;

public class Solution {
    public static int countHillValley(int[] nums) {
        
        if (nums == null || nums.length < 3) {
            return 0;
        }
        int result = 0;
        int prev = Integer.MAX_VALUE;
        int curr = nums[0];
        int next = nums[1];
        int start = 0;
        
        while (i < nums.length - 1) {
            if ((prev < curr && curr > next) || (prev > curr && curr < next)) {
                result++;
                i = start;
                if (start == nums.length - 2) {
                    return result;
                } else {
                    start++;
                    curr = nums[i++];
                    next = nums[i++];
                }
            } else {
                if (start == nums.length - 2) {
                    return result;
                }
                prev = curr;
                curr = next;
                next = nums[i++];
            }
        }
        return result;
    }

}