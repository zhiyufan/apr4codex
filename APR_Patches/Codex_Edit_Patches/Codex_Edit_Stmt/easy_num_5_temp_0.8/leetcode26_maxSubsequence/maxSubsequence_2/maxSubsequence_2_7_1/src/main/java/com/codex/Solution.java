package com.codex;

import java.util.*;

public class Solution {
/**
 * 函数原型
 * 求一个数组中最大连续子序列
 * @param nums
 * @param k
 * @return
 */
    public static int[] maxSubsequence(int[] nums, int k) {
        

        int[] res = new int[k];
        int sum = 0;
        for (int i = 0; i < k; i++) {
            res[i] = nums[i];
            sum += nums[i];
        }
        int maxSum = sum;

        // 已经处理完 k 个数，接下来就是处理 nums 中剩余的数了
        for (int i = k; i < nums.length; i++) { 

            // 从原来的序列向后移动
            sum -= nums[i-k];
            sum += nums[i];
            if (sum > maxSum) {
                maxSum = sum;
                for (int j = i-k+1; j <= i; j++) {
                    res[j-i+k-1] = nums[j];
                }
            }
        }
        return res;
    }


    
}