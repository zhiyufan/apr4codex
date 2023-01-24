package com.codex;

import java.util.*;

public class Solution {
    public static int countElements(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
        }
        return count;
    }

    
}