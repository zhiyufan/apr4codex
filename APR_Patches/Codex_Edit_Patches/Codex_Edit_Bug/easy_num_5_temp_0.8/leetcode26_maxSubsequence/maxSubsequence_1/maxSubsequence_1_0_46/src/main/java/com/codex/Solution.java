package com.codex;

import java.util.*;

public class Solution {
    public static int[] maxSubsequence(int[] nums, int m) {
        int[] ret = new int[m];
        int start = 0;
        int end = nums.length - m;
        for (int i = 0; i < m; i++) {
            int max_idx = start;
            for (int j = start; j <= end; j++)
                if (nums[j] > nums[max_idx])
                    max_idx = j;
            ret[i] = nums[max_idx];
            start = max_idx + 1;
            end++;
        }
        return ret;
    }

    
}