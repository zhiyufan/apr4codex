package com.codex;

import java.util.*;

public class Solution {
    public static int countPeaksandHill(int[] nums) {
        
        if (nums == null || nums.length < 3) {
            return 0;
        }
        int result = 0;
        int up = 0;
        int down = 0;
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i - 1] < nums[i]) {
                up++;
            } else if (nums[i - 1] > nums[i]) {
                down++;
            }
            if ((nums[i - 1] < nums[i] && nums[i] > nums[i + 1]) ||
                    (nums[i - 1] > nums[i] && nums[i] < nums[i + 1])) {
                result++;
            }
            if (up > 0 && down > 0) {
                up = 0;
                down = 0;
            }
        }
        return result;
    }
}