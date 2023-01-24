package com.codex;

import java.util.*;

public class Solution {
    public static int countElements(int[] nums) {

        int count = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (i < nums.length - 1) {
                if (nums[i] == nums[i + 1]) {
                    continue;
                }
                if (nums[i] == nums[i + 1] - 1) {
                    count++; 
                }
            }
        }
        return count;
    }
}