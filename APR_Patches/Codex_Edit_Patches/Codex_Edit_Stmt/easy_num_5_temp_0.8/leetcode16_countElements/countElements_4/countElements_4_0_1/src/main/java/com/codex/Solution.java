package com.codex;

import java.util.*;

public class Solution {
    public static int countElements(int[] nums) {

        if (nums == null || nums.length == 0) {
            return 0;
        }
        Arrays.sort(nums);

        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < nums[i + 1]) {
                count++;
            }
        }
        return count;
    }
}