package com.codex;

import java.util.*;

public class Solution {
    public static int maxScoreIndices(int[] nums, int k) {
        int n = nums.length;
        if (k == n) return nums[n - 1];
        int[] left = new int[k];
        int[] right = new int[k];
        for (int i = 0; i < k; i++) {
            right[i] = nums[n - i - 1];
        }
        int count = 0;
        int max = 0;
        while (count != k) {
            if (left[count] > right[count]) {
                max += left[count];
                count++;
            } else {
                max += right[count];
                count++;
            }
        }
        return max;
    }

    public static List<Integer> maxScoreIndices(int[] nums) {
        
        int n = nums.length;
        int[] left = new int[n];
        int[] right = new int[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 1) count++;
            left[i] = count;
        }
        count = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (nums[i] == 0) count++;
            right[i] = count;
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