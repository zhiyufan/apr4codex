package com.codex;

import java.util.*;

public class Solution {
    public static List<Integer> maxScoreIndices(int[] nums) {
        /** You are given a 0-indexed binary array nums of length n. nums can be divided at index i (where 0 <= i <= n) into two arrays (possibly empty) numsleft and numsright:
         * numsleft has all the elements of nums between index 0 and i - 1 (inclusive), while numsright has all the elements of nums between index i and n - 1 (inclusive).
         * If i == 0, numsleft is empty, while numsright has all the elements of nums.
         * If i == n, numsleft has all the elements of nums, while numsright is empty.
         * The division score of an index i is the sum of the number of 0's in numsleft and the number of 1's in numsright.
         * Return all distinct indices that have the highest possible division score. You may return the answer in any order.
         */
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

    }