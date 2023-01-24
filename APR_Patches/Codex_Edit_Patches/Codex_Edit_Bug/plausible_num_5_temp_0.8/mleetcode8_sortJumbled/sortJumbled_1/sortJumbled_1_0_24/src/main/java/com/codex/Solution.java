package com.codex;

import java.util.*;

public class Solution {
public static int[] sortJumbled(int[] mapping, int[] nums) {

        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            res[i] = nums[i];
        }
        Arrays.sort(res);

        int n = mapping.length;
        int[] map = new int[n];
        for (int i = 0; i < n; i++) {
            map[mapping[i] % n] = i;
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = map[nums[i] % n];
        }

        Arrays.sort(nums);
        return nums;
    }
}