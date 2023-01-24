package com.codex;

import java.util.*;

public class Solution {
public static List<Integer> maxScoreIndices(int[] nums) {
        int n = nums.length;
        if (n == 0) return new ArrayList<>();
        int[] leftSum = new int[n];
        int[] rightSum = new int[n];
        int l = 0;
        int r = 0;
        for (int i = 0; i < n; i++) {
            l += nums[i];
            leftSum[i] = l;
        }
        for (int i = n - 1; i >= 0; i--) {
            r += (nums[i] ^ 1);
            rightSum[i] = r;
        }
        int max = 0;
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int left = i == 0 ? 0 : leftSum[i - 1];
            int right = i == n - 1 ? 0 : rightSum[i + 1];
            int sum = left + right;
            if (sum > max) {
                max = sum;
                res = new ArrayList<>();
                res.add(i);
            } else if (sum == max) {
                res.add(i);
            }
        }
        return res;
    }
}