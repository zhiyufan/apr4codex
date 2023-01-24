package com.codex;

import java.util.*;

public class Solution {
    public static int[] getAverages(int[] nums, int k) {
        
        int[] result = new int[nums.length - k + 1];
        int windowSum = 0;
        int windowStart = 0;
        for (int windowEnd = 0; windowEnd < nums.length; windowEnd++) {
            windowSum += nums[windowEnd]; // add the next element
            // slide the window, we don't need to slide if we've not hit the required window size of 'k'
            if (windowEnd >= k - 1) {
                result[windowStart] = windowSum / k; // calculate the average
                windowSum -= nums[windowStart]; // subtract the element going out
                windowStart++; // slide the window ahead
            }
        }
        
        return result;
    }

    /*
    public static int[] getAverages(int[] nums, int k) {
        

        int[] result = new int[nums.length - k + 1];
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i - k; j <= i + k; j++) {
                if (j < 0 || j >= nums.length) {
                    continue;
                }
                sum += nums[j];
            }
            result[i] = sum / (2 * k + 1);
        }
        return result;
    }
    */
    
}