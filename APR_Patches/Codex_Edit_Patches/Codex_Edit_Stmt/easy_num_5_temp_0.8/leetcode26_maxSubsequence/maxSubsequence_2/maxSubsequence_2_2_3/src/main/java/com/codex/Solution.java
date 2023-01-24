package com.codex;

import java.util.*;

public class Solution {
    public static int[] maxSubsequence(int[] nums, int k) {
        

        int[] res = new int[k];
        int sum = 0;
        for (int i = 0; i < k; i++) {
            res[i] = nums[i];
            sum += nums[i];
        int maxStart = 0;
        }
        int maxSum = sum;
        for (int i = k; i < nums.length; i++) {
            sum -= nums[i-k];
            sum += nums[i];
            if (sum > maxSum) {
                maxSum = sum;
                maxStart = i - k + 1;
            }
        }
        
        for (int i = maxStart; i < maxStart + k; i++) {
                res[i - maxStart] = nums[i];
                }
            }
        }
        return res;
    }


    
}