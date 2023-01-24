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


        int[] oddList = new int[nums.length];
        int[] evenList = new int[nums.length];
        int oddIndex = 0;
        int evenIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                evenList[evenIndex++] = nums[i];
            } else {
                oddList[oddIndex++] = nums[i];
            }
        }

        int oddCount = 0;
        int evenCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                if (evenCount > 1) {
                    evenList[i - 1] = evenList[i];
                }
                evenCount = 0;
                if (i > 0 && evenList[i] == evenList[i - 1]) {
                    evenCount++;
                }
            } else {
                if (oddCount > 1) {
                    oddList[i - 1] = oddList[i];
                }
                oddCount = 0;
                if (i > 0 && oddList[i] == oddList[i - 1]) {
                    oddCount++;
                }

            }
        }

        int[] result = new int[nums.length];
        int resultIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                result[resultIndex++] = evenList[i];
            } else {
                result[resultIndex++] = oddList[i];
            }
        }

        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != result[i]) {
                count++;
            }
        }

        return count;
    }

        }