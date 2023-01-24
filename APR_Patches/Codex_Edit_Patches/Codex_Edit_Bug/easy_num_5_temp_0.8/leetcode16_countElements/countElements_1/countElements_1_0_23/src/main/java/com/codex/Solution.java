package com.codex;

import java.util.*;

public class Solution {
    import java.util.Arrays;

    public static int countElements(int[] nums) {
        Arrays.sort(nums);
        int prev = nums[0];
        int count = 1;
        int result = 0;
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                count++;
            } else {
                if (nums[i] == prev + 1) {
                    result += count;
                }
                prev = nums[i];
                count = 1;
            }
        }
        return result;
    }
}