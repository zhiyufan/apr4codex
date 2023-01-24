package com.codex;

import java.util.*;

public class Solution {
    public static int minDeletion(int[] nums) {
        /** You are given a 0-indexed integer array nums. The array nums is beautiful if:
         * nums.length is even.
         * nums[i] != nums[i + 1] for all i % 2 == 0.
         * Note that an empty array is considered beautiful.
         * You can delete any number of elements from nums. When you delete an element, all the elements to the right of the deleted element will be shifted one unit to the left to fill the gap created and all the elements to the left of the deleted element will remain unchanged.
         * Return the minimum number of elements to delete from nums to make it beautiful.
         */
        int length = nums.length;
        int count = 0;
        for (int i = 0; i < length - 1; i++) {
            if (i % 2 == 0 && nums[i] == nums[i + 1]) {
                count++;
            }
        }
        return count;
    }

    /**
     * Given a sorted array nums, remove the duplicates in-place such that duplicates appeared at most once and return the new length.
     * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
     * Example 1:
     * Given nums = [1,1,2],
     * Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively.
     * It doesn't matter what you leave beyond the returned length.
     */
    }