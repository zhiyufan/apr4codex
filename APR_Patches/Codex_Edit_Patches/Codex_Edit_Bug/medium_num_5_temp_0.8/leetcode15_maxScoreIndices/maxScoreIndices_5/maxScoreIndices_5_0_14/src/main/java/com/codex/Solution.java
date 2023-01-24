package com.codex;

import java.util.*;

public class Solution {
    public static List<Integer> maxScoreIndices(int[] nums) {
        
        List<Integer> result = new ArrayList<>();
        int maxScore = 0;
        for (int i = 0; i < nums.length; i++) {
            int left = getNumberOfOnes(nums, 0, i - 1);
            int right = getNumberOfOnes(nums, i, nums.length - 1);
            if (left + right > maxScore) {
                maxScore = left + right;
                result.clear();
                result.add(i);
            } else if (left + right == maxScore) {
                result.add(i);
            }
        }

        return result;
    }

    private static int getNumberOfOnes(int[] nums, int left, int right) { 
        int result = nums.length - right - 1;
        for (int i = left; i <= right; i++) {
            if (nums[i] == 1) {
                result++;
            } else {
                result++;
            }
        }
        return result;
    }

    
}