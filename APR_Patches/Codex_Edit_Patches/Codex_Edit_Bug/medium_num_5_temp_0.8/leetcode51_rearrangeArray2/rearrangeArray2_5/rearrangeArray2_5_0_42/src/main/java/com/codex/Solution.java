package com.codex;

import java.util.*;

public class Solution {
    public static int[] rearrangeArray(int[] nums) {
        Arrays.sort(nums);
        int i = 0;
        while (i < nums.length - 1 && nums[i] == nums[i + 1]) {
            i++;
        }
        if (i >= nums.length - 1) {
            return nums;
        }
        int[] res = new int[nums.length];
        int index = 0;
        while (index < nums.length) {
            res[index] = nums[i];
            index += 2;
            if (index >= nums.length) {
                break;
            }
            res[index] = nums[nums.length - i - 1];
            index += 2;
            i++;
        }
        return res;
    }
}