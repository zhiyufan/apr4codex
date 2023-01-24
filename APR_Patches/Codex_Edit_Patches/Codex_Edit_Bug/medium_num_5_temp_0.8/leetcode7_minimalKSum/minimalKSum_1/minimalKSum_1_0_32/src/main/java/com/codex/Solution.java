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

    public static void main(String[] args) {
        int[] test1 = {1, 3, 4, 8};
        int[] test2 = {1, 2, 3, 4};
        System.out.println(minimalKSum(test1, 3)); // expected: 7
        System.out.println(minimalKSum(test2, 2)); // expected: 3
    }

    
}