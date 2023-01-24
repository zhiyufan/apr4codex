package com.codex;

import java.util.*;

public class Solution {
public static List<Integer> maxScoreIndices(int[] nums) {
    
    List<Integer> result = new ArrayList<>();
    int maxScore = 0;
    for (int i = 0; i < nums.length; i++) {
        int zeroLeft = getNumberOfZeros(nums, 0, i - 1);
        int oneRight = getNumberOfOnes(nums, i, nums.length - 1);
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

// Only Unsorted Array.
public static void longestSeqOfOnes(int[] nums) {
    int result = 0;
    int maxLength = 0;
    for (int i = 0; i < nums.length; i++) {
        if (nums[i] == 1) {
            result++;
            if (maxLength < result) {
                maxLength = result;
            }
        }
        else {
            result = 0;
        }
    }

    }
    System.out.println(maxLength);
}
// Only Sorted Array
public static void longestSeqOfOnesSortedArray(int[] nums) {
    int left = 0;
    int result = 0;
    int maxLength = 0;
    while (left < nums.length) {
        if (nums[left] == 0) {
            result = 0;
            left++;
            continue;
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