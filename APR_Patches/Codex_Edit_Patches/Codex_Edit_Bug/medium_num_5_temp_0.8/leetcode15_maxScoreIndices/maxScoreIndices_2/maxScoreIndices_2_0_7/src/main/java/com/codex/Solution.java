package com.codex;

import java.util.*;

public class Solution {
    public static List<Integer> maxScoreIndices(int[] nums) {
        
        int n = nums.length;
        if (n == 0) return new ArrayList<>();
        int[] leftCount = new int[n];
        int[] rightCount = new int[n];
        int[] leftOnes = new int[n];
        int[] rightOnes = new int[n];
        int cur = 0;
        int ones = 0;
        for (int i = 0; i < n; i++) {
            cur += nums[i];
            leftCount[i] = cur;
            cur = cur ^ 1;
            ones += cur;
            leftOnes[i] = ones;
        }
        cur = 0;
        for (int i = n - 1; i >= 0; i--) {
            cur += nums[i] ^ 1;
            rightCount[i] = cur;
            cur = cur ^ 1;
            ones += cur;
            rightOnes[i] = ones;
        }
        int max = 0;
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int left = i == 0 ? 0 : leftCount[i - 1] + Math.abs(leftOnes[i - 1] - rightOnes[i - 1]);
            int right = i == n - 1 ? 0 : rightCount[i + 1];
            int sum = left + right + Math.abs(leftOnes[i] - rightOnes[i]);
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