package com.codex;

import java.util.*;

public class Solution {
public static long minimalKSum(int[] nums, int k) {
        
        Arrays.sort(nums);
        //curr contains max value of numbers processed
        int curr = 1;
        long sum = 0;

        //only those numbers greater than curr can be processed
        for (int i = 0; i < nums.length; i++) {
            //since the array is sorted, if current number is greater than curr, then the remaining numbers are all greater than curr
            if (nums[i] > curr) {
                k--;
                sum+=curr;
                curr++;
            } else if (nums[i] == curr) {
                curr++;
            }
        }

        //if there are still numbers left to be processed, then we can simply add the curr number to result.
        while (k > 0) {
            sum+=curr;
            curr++;
            k--;
        }
        return sum;
    }

    

    
}