package com.codex;

import java.util.*;

public class Solution {
    public static int[] getAverages(int[] nums, int k) {
        if (k == 0) {
            return new int[0];
        }
        int[] avg = new int[nums.length];
        for (int i = 0, j = 0; j + k <= nums.length; j++) {
            int sum = 0;
            while (i < j + k) {
                sum += nums[i++];
            }
            avg[j] = sum / k;
        }
        return avgs;
    }

    
}