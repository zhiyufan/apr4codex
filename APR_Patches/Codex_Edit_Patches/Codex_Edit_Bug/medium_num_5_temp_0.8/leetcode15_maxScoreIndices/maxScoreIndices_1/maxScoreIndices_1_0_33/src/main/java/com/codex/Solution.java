package com.codex;

import java.util.*;

public class Solution {
class Solution {
    public int[] maxSumOfThreeSubarrays(int[] nums, int k) {
        int[] sums = new int[nums.length - k + 1];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (i >= k) {
                sum -= nums[i - k];
            }
            if (i >= k - 1) {
                sums[i - k + 1] = sum;
            }
        }
        int[] left = new int[sums.length];
        int best = 0;
        for (int i = 0; i < sums.length; i++) {
            if (sums[i] > sums[best]) {
                best = i;
            }
            left[i] = best;
        }
        int[] right = new int[sums.length];
        best = sums.length - 1;
        for (int i = sums.length - 1; i >= 0; i--) {
            if (sums[i] >= sums[best]) {
                best = i;
            }
            right[i] = best;
        }
        int[] ans = new int[]{-1, -1, -1};
        int count = 0;
        for (int j = k; j < sums.length - k; j++) {
            int i = left[j - k], l = right[j + k];
            if (ans[0] == -1 || sums[i] + sums[j] + sums[l] > sums[ans[0]] + sums[ans[1]] + sums[ans[2]]) {
                ans[0] = i;
                ans[1] = j;
                ans[2] = l;
            }
        }
        return new int[]{ans[0], ans[1], ans[2]};
    }
}
}