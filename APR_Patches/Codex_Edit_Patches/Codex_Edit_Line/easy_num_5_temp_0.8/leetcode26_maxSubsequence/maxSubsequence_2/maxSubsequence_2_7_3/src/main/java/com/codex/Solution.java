package com.codex;

import java.util.*;

public class Solution {
    public static int[] maxSubsequence(int[] nums, int k) {
        int [] pro = new int [nums.length];
        int [] map = new int [nums.length];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            pro[i] = sum;
            map[i] = i;
        }

        int[] res = new int[k];
            int start = k-i;
            int maxI = 0;
            int maxValue = 0;
            for (int j = start; j < nums.length; j++) {
                if (j == start) {
                    maxI = j;
                    maxValue = pro[j];
                } else {
                    int sum = pro[j] - pro[j-start];
                    if (sum > maxValue) {
                        maxI = j;
                        maxValue = sum;
                    }
                    res[i] = maxValue;
                    map[k-i-1] = maxI;
                }
            }
        }
        return res;
    }
}