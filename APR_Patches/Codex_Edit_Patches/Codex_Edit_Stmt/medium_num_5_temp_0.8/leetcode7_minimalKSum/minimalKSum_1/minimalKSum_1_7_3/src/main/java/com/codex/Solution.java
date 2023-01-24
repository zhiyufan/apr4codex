package com.codex;

import java.util.*;

public class Solution {

//Given an array of integers nums and a positive integer k, return the lexicographically smallest sum of a of subarray of size k.

//A subarray of size k means a contiguous subarray of length k, For example given nums = [10, 20, 30, 40] and k = 2, the subarray [20,30] is of size 2. The smallest sum is 60.

//We can optimize the comparison in line 6 by using binary search since the input nums are sorted.
//
//Time: O(n*log(n)), Space: O(1)

    public static long minimalKSum(int[] nums, int k) {
        
        Arrays.sort(nums);   //The given array nums may not be sorted.
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

    
}