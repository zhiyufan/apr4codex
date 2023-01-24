package com.codex;

import java.util.*;

public class Solution {
    public static int[] getAverages(int[] nums, int k) {
        
        if (nums.length == 0 || k == 0) {
            return null;
        }
        int count = 0;
        int[] avgs = new int[nums.length - k];
        if (nums.length - k == 0) {
            return avgs;
        } else {
            for (int i = 0; i < nums.length; i++) {
                int low = i - k;
                int high = i + k;
                int sum = 0;
                int count = 0;
                for (int j = low; j <= high; j++) {
                    if (j >= 0 && j < nums.length) {
                        sum += nums[j];
                        count++;
                    }
                }
                if (count != 0) {
                    avgs[count] = sum / count;
                    count++;
                }
            }
        }
        return avgs;
    }

    
}