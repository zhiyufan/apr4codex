package com.codex;

import java.util.*;

public class Solution {
    public static int minSwaps(int[] nums) {
        /** A swap is defined as taking two distinct positions in an array and swapping the values in them.
         * A circular array is defined as an array where we consider the first element and the last element to be adjacent.
         * Given a binary circular array nums, return the minimum number of swaps required to group all 1's present in the array together at any location.
         */

        int count = 0;
        for (int i=0; i<nums.length; i++) {
            if (nums[i] == 1) {
                count++;
            }
        }
        int i;
        int j = 0;
        int ans = Integer.MAX_VALUE;
        for (i=0; i<count; i++) {
            if (nums[i] == 1) {
                j++;
            }
        }
        ans = Math.min(ans, count-j);
        for (i=1; i<nums.length; i++) {
            if (nums[i-1] == 1) {
                j--;
            }
            if (nums[(i+count-1) % nums.length] == 1) {
                j++;
            }
            ans = Math.min(ans, count-j);
        }
        return ans;
    }

    }