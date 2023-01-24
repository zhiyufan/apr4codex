package com.codex;

import java.util.*;

public class Solution {
    public static int[] rearrangeArray2(int[] nums) {
        int n = nums.length;
        int[] average = new int[n];
        for (int i = 1; i < n-1; i++) {
            average[i] = (nums[i-1] + nums[i+1])/2;
        }

        average[0] = nums[1];
        average[n-1] = nums[n-2];

        Arrays.sort(nums);
        Arrays.sort(average);

        int[] answer = new int[n];
        if (nums[0] >= average[0]) {
            answer[0] = nums[1];
            
        } else {
            answer[0] = nums[0]; 
        }

        if (nums[j] >= average[j]) {
            answer[j] = nums[j-1];
        } else {
           answer[j] = nums[j]; 
        }

        return answer;
    }
}