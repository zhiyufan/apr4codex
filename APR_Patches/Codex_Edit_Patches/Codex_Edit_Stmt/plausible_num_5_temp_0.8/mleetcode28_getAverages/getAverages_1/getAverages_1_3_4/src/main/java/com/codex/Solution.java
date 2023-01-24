package com.codex;

import java.util.*;

public class Solution {
    public static int[] getAverages(int[] nums, int k) {
        

        int[] averages = new int[nums.length - k + 1];
        int i = 0;
        while (i + k - 1 < nums.length) {
            int sum = 0, j = i;
            while (j < i + k) {
                sum += nums[j];
                j++;
            }
            averages[i] = sum / k;
            i++;
        }
        return avgs;
    }

    
}