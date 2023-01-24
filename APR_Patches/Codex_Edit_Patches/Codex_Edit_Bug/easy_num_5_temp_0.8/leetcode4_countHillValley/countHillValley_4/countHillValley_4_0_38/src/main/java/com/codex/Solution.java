package com.codex;

import java.util.*;

public class Solution {
    public static int countHillValley(int[] nums) {
        if (nums.length <= 2) {
            return 0;
        }
        int pre = nums[0] < nums[1] ? -1 : 1;

        int count = 0;
        for (int i = 1; i < nums.length - 1; i++) {
            int cur = nums[i] - nums[i-1];
            if (cur * pre < 0) {
                count++;
            }
            pre = cur;
        }
        return count;
    }


    
    
}