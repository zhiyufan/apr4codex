package com.codex;

import java.util.*;

public class Solution {
    public static int[] sortJumbled(int[] mapping, int[] nums) {
        int[] map = new int[nums.length];
        for (int i = 0; i < 10; i++) {
            if (mapping[i] != 0) {
                map[nums[i]] = mapping[i];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = map[nums[i]];
        }

        Arrays.sort(nums);
        return nums;
    }
}