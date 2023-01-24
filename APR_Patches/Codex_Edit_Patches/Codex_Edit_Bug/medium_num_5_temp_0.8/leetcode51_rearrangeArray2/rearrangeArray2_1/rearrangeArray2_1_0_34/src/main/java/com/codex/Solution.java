package com.codex;

import java.util.*;

public class Solution {
public static int[] rearrangeArray2(int[] nums) {
    
    int n = nums.length;
    int[] answer = new int[n];
    int[] average = new int[n];
    for (int i = 0; i < n; i++) {
        if (i == 0) {
            average[i] = nums[1]/2;
        } else if (i == n-1) {
            average[i] = nums[n-2]/2;
        } else {
            average[i] = (nums[i-1] + nums[i+1])/2;
        }
    }

    Arrays.sort(nums);
    Arrays.sort(average);

    for (int i = 0; i < n; i++) {
        if (nums[i] >= average[i]) {
            answer[i] = nums[i-1];
        } else {
            answer[i] = nums[i];
        }
    }

    return answer;
}

// works for only 1/3 cases
public static int[] rearrangeArray1(int[] nums) {
        
    int n = nums.length;
    int[] answer = new int[n];
    int[] average = new int[n];
    for (int i = 0; i < n; i++) {
        if (i == 0) {
            average[i] = nums[1]/2;
        } else if (i == n-1) {
            average[i] = nums[n-2]/2;
        } else {
            average[i] = (nums[i-1] + nums[i+1])/2;
        }
    }

    Arrays.sort(nums);
    Arrays.sort(average);

    for (int i = 0; i < n; i++) {
        if (nums[i] >= average[i]) {
            answer[i] = nums[i-1];
        } else {
            answer[i] = nums[i];
        }
    }

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