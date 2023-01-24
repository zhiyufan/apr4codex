package com.codex;

import java.util.*;

public class Solution {
public class Solution {
    public int[] maxSumOfThreeSubarrays(int[] nums, int k) {
        int n = nums.length;
        int[] sum = new int[n + 1];
        int[] left = new int[n];
        int[] right = new int[n];
        int[] res = new int[3];

        for (int i = 0; i < n; i++) {
            sum[i + 1] = sum[i] + nums[i];
        }

        for (int i = k, max = sum[k] - sum[0]; i < n; i++) {
            if (sum[i + 1] - sum[i + 1 - k] > max) {
                max = sum[i + 1] - sum[i + 1 - k];
                left[i] = i + 1 - k;
            } else {
                left[i] = left[i - 1];
            }
        }

        right[n - k] = n - k;
        for (int i = n - k - 1, max = sum[n] - sum[n - k]; i >= 0; i--) {
            if (sum[i + k] - sum[i] >= max) {
                max = sum[i + k] - sum[i];
                right[i] = i;
            } else {
                right[i] = right[i + 1];
            }
        }
        
        int max = 0;
        for (int i = k; i <= n - 2 * k; i++) {
            int l = left[i - 1];
            int r = right[i + k];
            int total = (sum[i + k] - sum[i]) + (sum[l + k] - sum[l]) + (sum[r + k] - sum[r]);
            if (total > max) {
                max = total;
                res[0] = l;
                res[1] = i;
                res[2] = r;
            }
        }

        return res;
    }
}

















    /* public static long minimalKSum(int[] nums, int k) {
        int i = 0;
        while (k > 0) {
            if (i >= nums.length || nums[i] > i + 1) {
                sum += i + 1;
                k--;
            } else {
                i++;
            }
        }
        return sum;
    } */

    
}