package com.codex;

import java.util.*;

public class Solution {
    public static long minimalKSum(int[] nums, int k) {
        // Initialize some useful variables
        Arrays.sort(nums);
        int curr = 1;
        long sum = 0;
        // check all the elements in the array
        for (int i = 0; i < nums.length; i++) {
            // if the element is greater than curr, put the element in kth position
            if (nums[i] > curr) {
                k--;
                sum+=curr;
                curr++;
            } else if (nums[i] == curr) curr++;
        }
        while (k > 0) {
            sum+=curr;
            curr++;
            k--;
        }
        return sum;
    }

    
}