package com.codex;

import java.util.*;

public class Solution {
    public static int minDeletion(int[] nums) {
        int count = 0;
        for (int i = 0, j = nums.length - 1; i < j; i++, j--) {
            if (nums[i] == nums[j]) {
                count++;
            }
        }
        return count;
    }
}