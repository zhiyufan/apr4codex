package com.codex;

import java.util.*;

public class Solution {
    public static long minimalKSum(int[] nums, int k) {
        
        Arrays.sort(nums);
        long sum = 0;
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
    }

    public static int subarraySum(int[] nums, int k) {
        
        int count = 0;
        for (int i = 0; i < nums.length; i++){
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                if (sum == k){
                    count++;
                }
            }
        }
        return count;
    }
}