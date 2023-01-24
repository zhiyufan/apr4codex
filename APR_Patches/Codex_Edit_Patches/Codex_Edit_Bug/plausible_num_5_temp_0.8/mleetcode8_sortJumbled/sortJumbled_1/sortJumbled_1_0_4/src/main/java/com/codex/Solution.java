package com.codex;

import java.util.*;

public class Solution {
public static int[] sortJumbled(int[] mapping, int[] nums) {

        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            res[i] = nums[i];
        }
        Arrays.sort(res);

        for (int i = 0; i < nums.length; i++) {
            nums[i] = mapping[nums[i]];
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = mapping[nums[i]];
        }

        Arrays.sort(nums);
        return nums;
    }
}
}