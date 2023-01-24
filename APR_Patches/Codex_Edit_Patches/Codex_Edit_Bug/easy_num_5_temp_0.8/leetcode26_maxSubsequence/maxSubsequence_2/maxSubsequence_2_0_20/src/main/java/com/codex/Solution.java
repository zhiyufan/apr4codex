package com.codex;

import java.util.*;

public class Solution {
class MaxContiguousSubsequence {
        

    public static int[] maxContiguousSubsequence(int[] nums, int k) {

            int[] res = new int[k];
            int sum = 0;
            for (int i = 0; i < k; i++) {
                res[i] = nums[i];
                sum += nums[i];
            }
            int maxSum = sum;
            int start = 0;
            for (int i = k; i < nums.length; i++) {
                sum -= nums[i-k];
                sum += nums[i];
                if (sum > maxSum) {
                    maxSum = sum;
                    start = i-k+1;
                    for (int j = i-k+1; j <= i; j++) {
                        res[j-i+k-1] = nums[j];
                    }
                }
            return res;
            }
        }


}
}