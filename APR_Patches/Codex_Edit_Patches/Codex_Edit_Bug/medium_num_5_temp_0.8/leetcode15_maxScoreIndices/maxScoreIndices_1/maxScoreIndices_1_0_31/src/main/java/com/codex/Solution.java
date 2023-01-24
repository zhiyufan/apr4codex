package com.codex;

import java.util.*;

public class Solution {
public static List<Integer> maxScoreIndices(int[] nums) {
        int n = nums.length - 1;
        int[] left = new int[n];
        int[] right = new int[n];
        for (int i = 0; i < n; i++) {
            left[i] = nums[i];
            if (i > 0) left[i] += left[i - 1];
        }
        for (int i = n; i >= 0; i--) {
            right[i] = nums[i];
            if (i < n) right[i] += right[i + 1];
        }
        List<Integer> ans = new ArrayList<>();
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (left[i] + right[i] > max) {
                ans.clear();
                ans.add(i);
                max = left[i] + right[i];
            } else if (left[i] + right[i] == max) {
                ans.add(i);
            }
        }
        return ans;
    }
    
}