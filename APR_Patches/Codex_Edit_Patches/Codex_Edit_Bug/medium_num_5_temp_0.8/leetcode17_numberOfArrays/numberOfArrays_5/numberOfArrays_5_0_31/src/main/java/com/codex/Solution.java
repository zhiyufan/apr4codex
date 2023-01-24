package com.codex;

import java.util.*;

public class Solution {
    public static int maxBoxes(int[] boxes, int maxSize) {
        

        int size = boxes.length;
        int[] dp = new int[size];
        int[] dpBack = new int[size];
        dp[0] = 1;
        dpBack[size - 1] = 1;
        int[] prefixSum = new int[size];
        int[] suffixSum = new int[size];
        prefixSum[0] = boxes[0];
        suffixSum[size - 1] = boxes[size - 1];

        for(int i = 1; i < size; ++i) {
            prefixSum[i] = prefixSum[i - 1] + boxes[i];
        }

        for(int i = size - 2; i >= 0; i--) {
            suffixSum[i] = suffixSum[i + 1] + boxes[i];
        }
        int i = 1;

        for(int j = size - 1; i < size; ++i) {
            for(; j >= 0; --j) {
                if(i == j) {
                    dp[i] = dp[i - 1] + 1;
                    dpBack[j] = dpBack[j + 1] + 1;
                } else if(prefixSum[i] - prefixSum[j] <= maxSize) {
                    dp[i] = Math.max(dp[j] + 1, dp[i]);
                } else {
                    break;
                }
            }
        }

        return dp[size - 1];
    }
}