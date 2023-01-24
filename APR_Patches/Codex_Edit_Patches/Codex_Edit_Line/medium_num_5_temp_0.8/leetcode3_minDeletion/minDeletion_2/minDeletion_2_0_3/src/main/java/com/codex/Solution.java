package com.codex;

import java.util.*;

public class Solution {
    public static int minDeletion(int[] nums) {
        


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

    //Two pointer solution
    public static int minDeletion(int[] nums) {
        int oddIndex = 1;
        int evenIndex = 0;
        int oddCount = 1;
        int evenCount = 1;
        int count = 0;
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                if (evenCount == 1) {
                    result[evenIndex++] = nums[i];
                }
                if (i > 0 && nums[i] == nums[i - 1]) {
                    evenCount++;
                } else {
                    evenCount = 1;
                }

            } else {
                if (oddCount == 1) {
                    result[oddIndex++] = nums[i];
                }
                if (i > 0 && nums[i] == nums[i - 1]) {
                    oddCount++;
                } else {
                    oddCount = 1;
                }

            }

            if (evenCount > 1) {
                result[evenIndex - 1] = nums[i];
            }

            if (oddCount > 1) {
                result[oddIndex - 1] = nums[i];
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != result[i]) {
                count++;
            }
        }

        return count;
    }
        
}