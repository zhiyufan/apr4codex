package com.codex;

import java.util.*;

public class Solution {
    public static int minSwaps(int[] nums) {
        /** A swap is defined as taking two distinct positions in an array and swapping the values in them.
         * A circular array is defined as an array where we consider the first element and the last element to be adjacent.
         * Given a binary circular array nums, return the minimum number of swaps required to group all 1's present in the array together at any location.
         */
        int n = nums.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 1) count++;
        }
        if (count <= 1) return 0;
        int max = 0, currentSum = 0;
        for (int i = 0; i < count; i++) {
            if (nums[i] == 1) currentSum++;
        }
        max = currentSum;
        for (int i = count; i < n; i++) {
            if (nums[i] == 1) currentSum++;
            if (nums[i-count] == 1) currentSum--;
            max = Math.max(max, currentSum);
        }
        return count - max;
    }

    }