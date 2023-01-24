package com.codex;

import java.util.*;

public class Solution {
    public static List<Integer> maxScoreIndices(int[] nums) {
        
        List<Integer> result = new ArrayList<>();
        int maxScore = 0;
        for (int i = 0; i < nums.length; i++) {
            int zeroLeft = getNumberOfZeros(nums, i);
            int oneRight = getNumberOfOnes(nums, i)
            if (zeroLeft + oneRight > maxScore) {
                maxScore = zeroLeft + oneRight;
                result.clear();
                result.add(i);
            } else if (zeroLeft + oneRight == maxScore) {
                result.add(i);
            }
        }

        return result;
    }

    private static int getNumberOfOnes(int[] nums, int index) {
        int result = 0;
        for (int i = index; i <= nums.length - 1; i++) {
            if (nums[i] == 1) {
                result++;
            }
        }
        return result;
    }

    private static int getNumberOfZeros(int[] nums, int index) {
        int result = 0;
        for (int i = 0; i <= index - 1; i++) {
            if (nums[i] == 0) {
                result++;
            }
        }
        return result;
    }

    
}