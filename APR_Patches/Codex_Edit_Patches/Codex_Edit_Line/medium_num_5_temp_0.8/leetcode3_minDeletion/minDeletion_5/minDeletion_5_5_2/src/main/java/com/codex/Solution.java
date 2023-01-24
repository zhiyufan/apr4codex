package com.codex;

import java.util.*;

public class Solution {
    // Given an integer array arr, return the number of subarrays (of size more than one) that have a most
    // two distinct integers.

    // Example 1:
    // Input: arr = [1,2,1,2,3]
    // Output: 2
    // Explanation: The only sub-arrays with 2 or more different integers are [1,2,1,2] and [2,1,2].

    // Example 2:
    // Input: arr = [1,2,1,3,4]
    // Output: 3
    // Explanation: 1 and 2 are considered two different integers.

    public static int minDeletion(int[] nums) {
        
        int length = nums.length;
        int count = 0;
        for (int i = 0; i < length - 1; i++) {
            if (i % 2 == 0 && nums[i] == nums[i + 1]) {
                count++;
            }
        }
        return count;
    }

    
    
}