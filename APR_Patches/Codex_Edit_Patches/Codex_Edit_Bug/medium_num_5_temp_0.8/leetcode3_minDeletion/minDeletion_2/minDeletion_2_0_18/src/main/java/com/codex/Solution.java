package com.codex;

import java.util.*;

public class Solution {
public static int minDeletion(int[] nums) {


        if (nums.length <= 1) {
            return 0;
        }

        int[] oddList = new int[(nums.length >> 1) + 1];
        int[] evenList = new int[nums.length >> 1];

        int oddIndex = 1;
        int evenIndex = 0;
        oddList[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if ((i & 1) == 0) {
                evenList[evenIndex] = nums[i];
                evenIndex++;
            } else {
                oddList[oddIndex] = nums[i];
                oddIndex++;
            }
        }

        int oddCount = 0;
        int evenCount = 0;
        oddIndex = 1;
        evenIndex = 0;

        for (int i = 1; i < nums.length; i++) {
            if ((i & 1) == 0) {
                if (evenIndex > 0 && evenList[evenIndex] == evenList[evenIndex - 1]) {
                    evenCount++;
                } else {
                    if (evenCount > 1) {
                        evenList[evenIndex - 1] = evenList[evenIndex];
                    }
                    evenCount = 0;
                }
                evenIndex++;

            } else {
                if (oddIndex > 1 && oddList[oddIndex] == oddList[oddIndex - 1]) {
                    oddCount++;
                } else {
                    if (oddCount > 1) {
                        oddList[oddIndex - 1] = oddList[oddIndex];
                    }
                    oddCount = 0;
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