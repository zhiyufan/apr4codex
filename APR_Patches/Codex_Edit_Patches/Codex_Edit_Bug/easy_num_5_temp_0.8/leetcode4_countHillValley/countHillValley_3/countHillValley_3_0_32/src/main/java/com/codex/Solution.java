package com.codex;

import java.util.*;

public class Solution {
    public static int countHillValley(int[] nums) {
        if (nums == null || nums.length < 3) {
            return 0;
        }
        int result = 0;
        int i = 1;
        while (i < nums.length - 1 && (nums[i - 1] < nums[i] && nums[i] > nums[i + 1] ||
                (nums[i - 1] > nums[i] && nums[i] < nums[i + 1]))) {
            result++;
            i += 2;
        }
        if (i < nums.length) {
            if ((nums[i - 1] < nums[i] && nums[i] > nums[i + 1]) ||
                    (nums[i - 1] > nums[i] && nums[i] < nums[i + 1])) {
                result++;
            }
        }
        return result;
    }

    
}