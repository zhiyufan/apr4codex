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

        int resultIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                if (resultIndex > 0) {
                    if (evenList[resultIndex - 1] == evenList[resultIndex]) {
                        resultIndex--;
                    }
                }
                evenList[resultIndex++] = evenList[i];
            } else {
                if (resultIndex > 0) {
                    if (oddList[resultIndex - 1] == oddList[resultIndex]) {
                        resultIndex--;
                    }
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