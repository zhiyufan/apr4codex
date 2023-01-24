package com.codex;

import java.util.*;

public class Solution {
    public static List<Integer> maxScoreIndices(int[] nums) {
        
        List<Integer> result = new ArrayList<>();
        int maxScore = 0;
        for (int i = 0; i < nums.length; i++) {
            int numOfZeros = getNumberOfZeros(nums, 0, i);
            int numOfOnes = getNumberOfOnes(nums, i, nums.length - 1);
            if (numOfZeros + numOfOnes > maxScore) {
                maxScore = numOfZeros + numOfOnes;
                result.clear();
                result.add(i);
            } else if (numOfZeros + numOfOnes == maxScore) {
                result.add(i);
            }
        }

        return result;
    }

    private static int getNumberOfOnes(int[] nums, int left, int right) {
        int result = 0;
        for (int i = left; i <= right; i++) {
            if (nums[i] == 1) {
                result++;
            }
        }
        return result;
    }

    private static int getNumberOfZeros(int[] nums, int left, int right) {
        int result = 0;
        for (int i = left; i < right; i++) {
            if (nums[i] == 0) {
                result++;
            }
        }
        return result;
    }

    
}