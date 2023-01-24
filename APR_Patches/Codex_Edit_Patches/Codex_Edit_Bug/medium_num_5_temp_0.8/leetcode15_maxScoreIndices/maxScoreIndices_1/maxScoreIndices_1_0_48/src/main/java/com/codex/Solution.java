package com.codex;

import java.util.*;

public class Solution {
    public static List<Integer> maxScoreIndices(int[] nums) {
        
        int n = nums.length;
        int[] left = new int[n];
        int[] right = new int[n];
        int count = 0,sum=0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 1) count++;
            left[i] = count;
        }
        count = 0,sum=0;
        for (int i = n - 1; i >= 0; i--) {
            if (nums[i] == 0) count++;
            right[i] = count;
        }
        List<Integer> ans = new ArrayList<>();
        int max = 0,one=0,zero=0;
        for (int i = 0; i < n; i++) {
            one=left[i];
            zero=right[i];
            if ((one+zero) > max) {
                ans.clear();
                ans.add(i);
                max = one+zero;
            } else if ((one+zero) == max) {
                ans.add(i);
            }
        }
        return ans;
    }
}