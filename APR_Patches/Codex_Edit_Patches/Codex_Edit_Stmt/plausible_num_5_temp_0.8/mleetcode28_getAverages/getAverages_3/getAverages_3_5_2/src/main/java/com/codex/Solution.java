package com.codex;

import java.util.*;

public class Solution {
    public static int[] getAverages(int[] nums, int k) {
        
        int[] avgs = new int[nums.length];
        for (int i = k; i < nums.length - k; i++) {
            int sum = 0;
            for (int j = i - k; j <= i + k; j++) {
                sum += nums[j];
            }
            avgs[i] = sum / (2*k + 1);
        }
        return avgs;
    }

    public static int[] getAverages(int[] nums, int k) {
        
        // Idea is to create a sliding window of size k and 
        // calculate the average of the window. 
        // Use a sliding window approach.
        int[] averages = new int[nums.length];
        int windowSum = 0;
        int windowStart = 0;
        for (int windowEnd = 0; windowEnd < nums.length; windowEnd++) {
            windowSum += nums[windowEnd]; // add the next element
            // slide the window, we don't need to slide if we've not hit the required window size of 'k'
            if (windowEnd >= k - 1) {
                averages[windowStart] = windowSum / k; // calculate the average
                windowSum -= nums[windowStart]; // subtract the element going out
                windowStart++; // slide the window ahead
            }
        }
        return averages;
    }
    
    
}