package com.codex;

import java.util.*;

public class Solution {
public static int[] maxSubsequence(int[] nums, int k) {

    if (nums == null || nums.length == 0) return new int[]{};
    int n = nums.length;
    if (k <= 0 || k > n) return new int[]{};
    if (k == n) return nums;

    int[] res = new int[k];
    int count = 1;

    // Start from 1. That's why count is 1;
    for (int i = 1; i < n; i++) {
        if (nums[i] > nums[res[count - 1]]) {
            res[count++] = i;
        }
        if (nums[i] >= nums[res[count - 1]]) res[count++] = i;
    }

    int[] ans = new int[count];
    for (int i = 0; i < count; i++) {
        ans[i] = nums[res[i]];
    }

    return ans;
}
}