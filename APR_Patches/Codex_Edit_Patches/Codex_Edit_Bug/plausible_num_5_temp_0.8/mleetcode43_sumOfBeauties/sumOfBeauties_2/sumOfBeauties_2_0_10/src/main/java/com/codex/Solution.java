package com.codex;

import java.util.*;

public class Solution {
import java.util.Arrays;


    public static int sumOfBeauties(int[] nums) {
        
        int sum = 0;
        if (nums.length == 1) return 2;
        int[] dp = new int[nums.length];
        for (int i = 0; i < dp.length; i++) {
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }
        Arrays.sort(dp);
        int maxBeautyLength = dp[dp.length - 1];
        for (int i = 0; i < dp.length; i++) {
            if (dp[i] == maxBeautyLength) {
                int[] temp = new int[dp.length];
                temp[i] = 1;
                for (int j = 0; j < i; j++) {
                    for (int k = 0; k < i; k++) {
                        temp[i] = Math.max(temp[i], temp[k] + 1);
                    }
                }
            }
        }
        return sum;
    }

    
}