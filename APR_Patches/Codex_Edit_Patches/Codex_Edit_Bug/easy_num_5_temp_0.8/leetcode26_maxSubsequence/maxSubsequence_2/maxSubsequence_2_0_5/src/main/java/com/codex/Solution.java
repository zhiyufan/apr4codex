package com.codex;

import java.util.*;

public class Solution {
public class MyClass {
    public static void main(String args[]) {
        int[] numbs = new int[]{5,5,5,5,5};
        int[] res = maxSubsequence(numbs, 4);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }

    }

    public static int[] maxSubsequence(int[] nums, int k) 
    {

        int maxSum = 0;
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


    
}