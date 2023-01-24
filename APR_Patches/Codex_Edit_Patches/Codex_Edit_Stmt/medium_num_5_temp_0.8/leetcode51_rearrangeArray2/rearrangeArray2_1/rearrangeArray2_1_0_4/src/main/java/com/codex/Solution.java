package com.codex;

import java.util.*;

public class Solution {
// public static int[] maxAvgSlice(int[] nums, int k) {
//         int n = nums.length;
//         int[] maxSlice = new int[n-k+1];
        
//         for (int i = 0; i < n-k+1; i++) {
//             int sum = 0;
//             for (int j = 0; j < k; j++) {
//                 sum += nums[i+j];
//             }
//             maxSlice[i] = sum / k;
//         }
        
//         int max = maxSlice[0];
//         int index = 0;
//         for (int i = 1; i < n-k+1; i++) {
//             if (maxSlice[i] > max) {
//                 max = maxSlice[i];
//                 index = i;
//             }
//         }
        
//         int[] maxNums = new int[k];
//         for (int i = 0; i < k; i++) {
//             maxNums[i] = nums[index+i];
//         }
        
//         return maxNums;
//     }




public static int[] maxAvgSlice(int[] nums, int k) {
        
        int n = nums.length;
        int[] maxSlice = new int[n-k+1];
        
        for (int i = 0; i < n-k+1; i++) {
            int sum = 0;
            for (int j = 0; j < k; j++) {
                sum += nums[i+j];
            }
            maxSlice[i] = sum / k;
        }

        int max = maxSlice[0];
        int index = 0;
        for (int i = 1; i < n-k+1; i++) {
            if (maxSlice[i] > max) {
                max = maxSlice[i];
                index = i;
            }
        }

        return answer;
    }
}