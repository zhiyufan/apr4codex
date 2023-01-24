package com.codex;

import java.util.*;

public class Solution {
    public static int minSwaps(int[] nums) {
        /** A swap is defined as taking two distinct positions in an array and swapping the values in them.
         * A circular array is defined as an array where we consider the first element and the last element to be adjacent.
         * Given a binary circular array nums, return the minimum number of swaps required to group all 1's present in the array together at any location.
         */

        int minSwaps = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 1) {
                continue;
            }
            int j = i + 1;
            while (j < nums.length && nums[j] == 0) {
                j++;
            }
            if (j == nums.length) break;
            while (j - i > 0) {
                int temp = nums[j];
                nums[j] = nums[j - 1];
                nums[j - 1] = temp;
                j--;
                minSwaps++;
            }
        }
        return minSwaps;
    }

    }