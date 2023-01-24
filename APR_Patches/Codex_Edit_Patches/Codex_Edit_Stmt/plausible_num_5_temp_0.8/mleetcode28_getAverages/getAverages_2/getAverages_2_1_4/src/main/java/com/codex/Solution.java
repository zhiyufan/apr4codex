package com.codex;

import java.util.*;

public class Solution {
    public static int[] getAverages(int[] nums, int k) {
        
        int lenNum = nums.length;
        if (lenNum == 0 || k == 0) {
            int[] avgs = new int[0];
            return avgs;
        }
        int[] avgs = new int[lenNum];
        for (int i = 0; i < lenNum; i++) {
            int low = i - k;
            int high = i + k;
            int sum = 0;
            int count = 0;
            for (int j = low; j <= high; j++) {
                if (j >= 0 && j < lenNum) {
                    sum += nums[j];
                    count++;
                }
            }
            avgs[i] = count == 0 ? -1 : sum / count;
        }
        return avgs;
    }

    
}