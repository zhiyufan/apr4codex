package com.codex;

import java.util.*;

public class Solution {
import java.util.Arrays;
public class MinimalKSum {
    public static long minimalKSum(int[] nums, int k) {
        
        Arrays.sort(nums);
        long sum = 0;
        int i = 0;
        //while k>0
        while (k > 0) {
            if (i >= nums.length || nums[i] > i + 1) {
                sum += i + 1;
                k--;
            } else {
                i++;
            }
        }
        return sum; // return the sum 
    }

    // main function
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4, 5};
        System.out.println("Minimal K sum is:" + minimalKSum(nums, 10));
       
    }
}

   
}