package com.codex;

import java.util.*;

public class Solution {
    public static int minDeletion(int[] nums) {
        


        int[] oddList = new int[nums.length];
        int[] evenList = new int[nums.length];
        int oddIndex = 0;
        int evenIndex = 0;
        int index = 0;
        while( index < nums.length) {
            if (i % 2 == 0) {
                evenList[evenIndex++] = nums[index];
            } else {
                oddList[oddIndex++] = nums[index];
            index++;
            }
        }

        int oddCount = 0;
        int evenCount = 0;
        index = 0;
        while( index < nums.length) {
            if (i % 2 == 0) {
                if (evenCount > 1) {
                    evenList[index - 1] = evenList[index];
                }
                evenCount = 0;
                if (index > 0 && evenList[index] == evenList[index - 1]) {
                    evenCount++;
                }
            } else {
                if (oddCount > 1) {
                    oddList[index - 1] = oddList[index];
                }
                oddCount = 0;
                if (index > 0 && oddList[index] == oddList[index - 1]) {
                    oddCount++;
                }

            }
            index++;
        }

        int[] result = new int[nums.length];
        int resultIndex = 0;
        index = 0;
        while( index < nums.length) {
            if (i % 2 == 0) {
                result[resultIndex++] = evenList[index];
            } else {
                result[resultIndex++] = oddList[index];
            }
            index++;
        }

        int count = 0;
        index = 0;
        while( index < nums.length) {
            if (nums[i] != result[i]) {
            index++;
                count++;
            }
        }

        return count;
    }

        
}