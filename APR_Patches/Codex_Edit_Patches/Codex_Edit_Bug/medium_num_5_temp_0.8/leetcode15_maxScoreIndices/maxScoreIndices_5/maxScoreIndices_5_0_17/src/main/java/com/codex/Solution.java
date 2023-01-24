package com.codex;

import java.util.*;

public class Solution {
public static int maxScoreIndices(int[] nums) {
    int leftSum = 0;
    int rightSum = 0;
    int rightIndex = nums.length - 1;
    int leftIndex = 0;
    int maxSum = 0;
    while (rightIndex >= leftIndex) {
        if (rightSum > leftSum) {
            leftSum += nums[leftIndex] == 0 ? 1 : 0;
            leftIndex++;
        } else if (rightSum < leftSum) {
            rightSum += nums[rightIndex] == 1 ? 1 : 0;
            rightIndex--;
        } else {
            leftSum += nums[leftIndex] == 0 ? 1 : 0;
            leftIndex++;
        }
        maxSum = Math.max(maxSum, leftSum);
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
        for (int i = left; i <= right; i++) {
            if (nums[i] == 0) {
                result++;
            }
        }
        return result;
    }

    
}