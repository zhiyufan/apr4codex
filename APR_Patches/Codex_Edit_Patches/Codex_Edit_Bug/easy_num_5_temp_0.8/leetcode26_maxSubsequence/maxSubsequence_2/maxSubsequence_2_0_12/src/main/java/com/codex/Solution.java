package com.codex;

import java.util.*;

public class Solution {
    public static boolean isPossible(int[] nums, int k, int index, int n) {
        if (n == 0) {
            return true;
        }
        for (int i = n; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (nums[j] == index) {
                    int tmp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = tmp;
                    if (isPossible(nums, k, index+1, j+1)) {
                        return true;
                    }
                    nums[i] = nums[j];
                    nums[j] = tmp;
                }
            }
        }
        return false;
    }

    public static boolean canArrange(int[] nums, int k) {
        return isPossible(nums, k, 0, 0);
    }




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
            if (sum > maxSum) {
                maxSum = sum;
                for (int j = i-k+1; j <= i; j++) {
                    res[j-i+k-1] = nums[j];
                }
            }
        }
        return res;
    }


    public static void main(String[] args) {
        int[] nums = new int[] {2, 3, 7};
        int[] res = maxSubsequence(new int[] {2, 11, 5, 9, 4, 4, 5, 9}, 3);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }
}