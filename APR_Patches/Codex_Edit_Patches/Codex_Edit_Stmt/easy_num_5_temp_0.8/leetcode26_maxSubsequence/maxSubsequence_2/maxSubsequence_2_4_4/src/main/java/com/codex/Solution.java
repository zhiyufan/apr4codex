package com.codex;

import java.util.*;

public class Solution {

        public static int[] maxSubsequence(int[] nums, int k) {
        

        int[] res = new int[k];
        int sum = 0;
        for (int i = 0; i < k; i++) {
            res[i] = nums[i];
            sum += nums[i];
        }
        int maxSum = sum;
        for (int i = k; i < nums.length; i++) {
            sum -= nums[i-k];
            sum += nums[i];
            if (sum > maxSum || (sum == maxSum && compare(res, i-k+1, i, k))) {
                maxSum = sum;
                for (int j = i-k+1; j <= i; j++) {
                    res[j-i+k-1] = nums[j];
                }
            }
        }
        return res;
    }
    /**
     * A[0~i] > B[0~i] ? 1 : -1
     * @param A
     * @param B
     * @return
     */
    public static boolean compare(int[] A, int startA, int endA, int L) {
        for (int i = 0; i < L; i++) {
            int a = A[startA + i];
            int b = A[endA + i];
            if (a > b) {
                return true;
            } else if (a == b) {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }

    }

    
}