package com.codex;

import java.util.*;

public class Solution {
    public static int[] getAverages(int[] nums, int k) {
        

        int[] avgs = new int[nums.length - 1];
		int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            int sum = 0;
            for (int j = i - k; j <= i + k; j++)
			{
                if (j < 0 || j >= nums.length - 1) {
                    continue;
                }
                sum += nums[j];
            }
            avgs[i] = sum / (2 * k + 1);
        }
        return avgs;
    }

    
}