package com.codex;

import java.util.*;

public class Solution {
        /**
    Problem:Given an array of integers, find the number of hill-valleys. A hill-valley is a subsequence of the array where the first element is strictly greater than the following numbers and the last element is strictly smaller than the preceding numbers.

    Example:

    int[] A = {5, 8, 6, 2, 3, 4, 6};
    Output: 3
    */
    
    public static int countHillValley(int[] nums) {
        

        int count = 0;
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i-1] < nums[i] && nums[i] > nums[i+1]) {
                count++;
            }
            if (nums[i-1] > nums[i] && nums[i] < nums[i+1]) {
                count++;
            }
        }
        return count;
    }


    
    
}