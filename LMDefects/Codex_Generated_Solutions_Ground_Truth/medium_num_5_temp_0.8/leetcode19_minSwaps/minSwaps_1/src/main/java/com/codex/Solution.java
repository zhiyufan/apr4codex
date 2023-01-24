package com.codex;

import java.util.*;

public class Solution {
    public static int minSwaps(int[] nums) {
        /** A swap is defined as taking two distinct positions in an array and swapping the values in them.
         * A circular array is defined as an array where we consider the first element and the last element to be adjacent.
         * Given a binary circular array nums, return the minimum number of swaps required to group all 1's present in the array together at any location.
         */
        int cnt = 0;
        for (int num : nums) {
            if (num == 1) {
                cnt++;
            }
        }
        int res = cnt;
        for (int i = 0; i < cnt; i++) {
            if (nums[i] == 1) {
                res--;
            }
        }
        int tmp = res;
        for (int i = cnt; i < nums.length; i++) {
            if (nums[i] == 1) {
                tmp++;
            }
            if (nums[i - cnt] == 1) {
                tmp--;
            }
            res = Math.min(tmp, res);
        }
        return res;
    }

    }