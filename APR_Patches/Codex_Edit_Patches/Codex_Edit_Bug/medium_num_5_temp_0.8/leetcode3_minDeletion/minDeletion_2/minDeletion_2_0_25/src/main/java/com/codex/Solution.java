package com.codex;

import java.util.*;

public class Solution {
    public static int minDeletion(int[] nums) {
        


        int[] oddList = new int[nums.length];
        int[] evenList = new int[nums.length];
        int oddIndex = 0;
        int oddCount = 0;
        int evenCount = 0;
        int evenIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                if (evenCount >= 1) {
                    return -1;
                }
                evenCount = 0;
                if (i > 0 && evenList[i] == evenList[i - 1]) {
                    evenCount++;
                }
                evenList[evenIndex++] = nums[i];
            } else {
                if (oddCount >= 1) {
                    return -1;
                }
                oddCount = 0;
                if (i > 0 && oddList[i] == oddList[i - 1]) {
                    oddCount++;
                }
                oddList[oddIndex++] = nums[i];
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