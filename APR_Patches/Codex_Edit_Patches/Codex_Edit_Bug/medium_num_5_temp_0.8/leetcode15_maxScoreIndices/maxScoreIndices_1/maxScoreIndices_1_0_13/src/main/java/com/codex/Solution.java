package com.codex;

import java.util.*;

public class Solution {
    public static List<Integer> maxScoreIndices(int[] nums) {
        int n = nums.length;
        int[] left = new int[n];
        int[] right = new int[n];
        left[0] = nums[0] == 1 ? 1 : 0;
        right[n - 1] = nums[n - 1] == 1 ? 1 : 0;
        for (int i = 1; i < n; i++) {
            left[i] = (nums[i] == 1 ? 1 : 0) + left[i - 1];
        }
        for (int i = n - 2; i >= 0; i--) {
            right[i] = (nums[i] == 1 ? 1 : 0) + right[i + 1];
        }
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (left[i] + right[i] > max) {
                max = left[i] + right[i];
            }
        }
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (left[i] + right[i] == max) {
                ans.add(i);
            }
        }
        return ans;
    }
    
}