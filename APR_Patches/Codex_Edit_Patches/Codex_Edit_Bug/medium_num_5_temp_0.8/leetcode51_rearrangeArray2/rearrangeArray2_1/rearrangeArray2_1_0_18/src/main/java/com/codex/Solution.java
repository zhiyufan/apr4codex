package com.codex;

import java.util.*;

public class Solution {
    public static int[] rearrangeArray2(int[] nums) {
        
        int n = nums.length;
        int[] average = new int[n];
        for (int i = 0; i < nums.length; i++) {
            int prev = (i-1) % nums.length;
            int next = (i+1) % nums.length;
            average[i] = (nums[prev] + nums[next])/2;
        }


        Arrays.sort(nums);
        Arrays.sort(average);

        int[] answer = new int[n];
        for (int i = 0; i < n-1; i++) {
            if (nums[i] >= average[i]) {
                answer[i] = nums[i-1];
            } else {
                answer[i] = nums[i];
            }
        }

        return answer;
    }
}