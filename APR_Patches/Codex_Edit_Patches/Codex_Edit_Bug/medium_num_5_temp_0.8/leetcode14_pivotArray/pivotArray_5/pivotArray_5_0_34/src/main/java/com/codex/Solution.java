package com.codex;

import java.util.*;

public class Solution {
//Pivot Array
//Given an array of integers nums, write a method that returns the "pivot" index of this array. We define the pivot index as the index where the sum of the numbers to the left of the index is equal to the sum of the numbers to the right of the index. If no such index exists, we should return -1. If there are multiple pivot indexes, you should return the left-most pivot index.
//
//Example 1:
//Input: 
//nums = [1, 7, 3, 6, 5, 6]
//Output: 3
//Explanation: 
//The sum of the numbers to the left of index 3 (nums[3] = 6) is equal to the sum of numbers to the right of index 3.
//Also, 3 is the first index where this occurs.
//Example 2:
//Input: 
//nums = [1, 2, 3]
//Output: -1
//Explanation: 
//There is no index that satisfies the conditions in the problem statement.
// 
//
//Note:
//
//The length of nums will be in the range [0, 10000].
//Each element nums[i] will be an integer in the range [-1000, 1000].
//
//
//
//
//
//Hint:
//
//The brute force approach is simple. Loop through each index and check whether it is a pivot index. However, this will be very inefficient. Can you optimize your solution? You should be able to achieve O(n) time.
//
//
//Medium
//Array
//
//



public class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for(int i =0; i<n; i++) {
            sum = sum + nums[i];
        }
        int sum1 = 0;
        for(int i = 0; i<n; i++) {
            sum1 += nums[i];
            if(sum - sum1 == sum1 - nums[i]) {
                return i;
            }
        }
        return -1;
    }
}

//Complexity Analysis
//
//Time Complexity: O(N), where N is the length of nums.
//
//Space Complexity: O(1).

    
}