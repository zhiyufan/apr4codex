package com.codex;

import java.util.*;

public class Solution {
/*
// Problem Statement
// Given an array of Strings, and a target sum value, find the total number of pairs in the array that combine to give the target sum.
// NOTE: The array of Strings will only contain integers, so no need to worry about parsing strings to integers.

// Example
// Input: 
// target = 20
// nums = ["2", "4", "6", "10"]

// Output:
// 2

// Explanation:
// Number of pairs that sum to target: 2
// 2 + 10 = 12
// 4 + 6 = 10



*/   
    public static int numOfPairs(String[] nums, String target) {
        
        int ans = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (Integer.valueOf(nums[i] + nums[j]) == Integer.valueOf(target)) ans++;
                if (Integer.valueOf(nums[j] + nums[i]) == Integer.valueOf(target)) ans++;
            }
        }
        return ans;
    }

    
}