package com.codex;

import java.util.*;

public class Solution {
    public static int countHillValley(int[] nums) {
        
        if (nums == null || nums.length < 3) {
            return 0;
        }
        int result = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if ((nums[i - 1] < nums[i] && nums[i] > nums[i + 1]) ||
                    (nums[i - 1] > nums[i] && nums[i] < nums[i + 1])
					&& (i + 2 < nums.length && nums[i + 1] != nums[i + 2])) {
                result++;
            }
        }
        return result;
    }
}