package com.codex;

import java.util.*;

public class Solution {
public static int countHillValley(int[] nums) {
        if (nums == null || nums.length < 3) return 0;
        int count = 0;
        int i = 1;
        while(i < nums.length - 1) {
            if (nums[i - 1] < nums[i] && nums[i + 1] < nums[i]) {
                count++;
                i += 2;
            } else if (nums[i - 1] > nums[i] && nums[i + 1] > nums[i]) {
                count++;
                i += 2;
            } else {
                i++;
            }
        }
        return count;
    }
}
}