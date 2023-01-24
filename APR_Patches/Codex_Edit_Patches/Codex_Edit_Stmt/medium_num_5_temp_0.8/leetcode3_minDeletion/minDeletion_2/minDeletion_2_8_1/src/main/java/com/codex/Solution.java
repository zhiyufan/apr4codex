package com.codex;

import java.util.*;

public class Solution {
    public static int minDeletion(int[] nums) {
        


        int[] oddList = new int[nums.length];
        int[] evenList = new int[nums.length];
        int oddIndex = 0;
        int evenIndex = 0;
        for (int j = 0; j < nums.length; j++) {
            if (j % 2 == 0) {
                evenList[evenIndex++] = nums[j];
            } else {
                oddList[oddIndex++] = nums[j];
            }
        }

        int oddCount = 0;
        int evenCount = 0;
        for (int j = 0; j < nums.length; j++) {
            if (j % 2 == 0) {
                if (evenCount > 0) {
                    evenList[j - 1] = evenList[j];
                }
                evenCount = 0;
                if (j > 0 && evenList[j] == evenList[j - 1]) {
                    evenCount++;
                }
            } else {
                if (oddCount > 0) {
                    oddList[j - 1] = oddList[j];
                }
                oddCount = 0;
                if (j > 0 && oddList[j] == oddList[j - 1]) {
                    oddCount++;
                }

            }
        }

        int[] result = new int[nums.length];
        int resultIndex = 0;
        for (int j = 0; j < nums.length; j++) {
            if (j % 2 == 0) {
                result[resultIndex++] = evenList[j];
            } else {
                result[resultIndex++] = oddList[j];
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