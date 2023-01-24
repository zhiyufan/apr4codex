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
        int count = 0;
        for (int i = 0; i < nums.length - 1; i += 2) {
            if (nums[i] == nums[i + 1]) {
                count++;
            }
        }
        if (nums.length % 2 == 1) {
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] == nums[i + 1]) {
                    count++;
                }
            }
        }
        return count;
    }

    }