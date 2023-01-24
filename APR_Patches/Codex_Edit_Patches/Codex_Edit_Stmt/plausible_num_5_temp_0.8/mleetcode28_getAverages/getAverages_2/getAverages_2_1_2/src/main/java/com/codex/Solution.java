package com.codex;

import java.util.*;

public class Solution {
    public static int[] getAverages(int[] nums, int k) {
        
        int[] avgs = new int[nums.length - (k * 2)];
        if (nums.length == 0 || k == 0) {
            return new int[0];
        }
        for (int i = 0; i < avgs.length; i++) {
            int low = i - k + 1;
            int high = i + k - 1;
            int sum = 0;
            int count = 0;
            for (int j = low; j <= high; j++) {
                if (j >= 0 && j < nums.length) {
                    sum += nums[j];
                    count++;
                }
            }
            avgs[i] = count == 0 ? -1 : (1 + (sum / count));
        }
        return avgs;
    }
}