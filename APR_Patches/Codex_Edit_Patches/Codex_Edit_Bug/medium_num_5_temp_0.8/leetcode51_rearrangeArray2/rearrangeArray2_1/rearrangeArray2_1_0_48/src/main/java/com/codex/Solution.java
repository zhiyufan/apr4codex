package com.codex;

import java.util.*;

public class Solution {
    public static int[] rearrangeArray2(int[] nums) {
        
        // Create two array of average and sorted array
        int n = nums.length;
        int[] average = new int[n];
        for (int i = 1; i < n-1; i++) {
            average[i] = (nums[i-1] + nums[i+1])/2;
        }

        // Sort original and average array
        average[0] = nums[1];
        average[n-1] = nums[n-2];
        // Reorder original array using average array

        Arrays.sort(nums);
        Arrays.sort(average);

        int[] answer = new int[n];
        for (int i = 0; i < n; i++) {
            if (nums[i] >= average[i]) {   
                answer[i] = nums[i-1];
            } else {
                answer[i] = nums[i];
            }
        }

        return answer;
    }
}