package com.codex;

import java.util.*;

public class Solution {
public class Main {
    public static void main(String[] args) {
        int[] a = {1, 0, 1, 1, 0, 1, 0};
        int[] result = maxScoreIndices(a);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    public static int[] maxScoreIndices(int[] nums) {
        int[] result = new int[2];
        int maxScore = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length - 1; i++) {
            int zeroLeft = getNumberOfZeros(nums, 0, i);
            int oneRight = getNumberOfOnes(nums, i + 1, nums.length - 1);
            if (zeroLeft + oneRight > maxScore) {
                maxScore = zeroLeft + oneRight;
                result[0] = i;
                result[1] = i + 1;
            } else if (zeroLeft + oneRight == maxScore) {
                result[1] = i + 1;
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