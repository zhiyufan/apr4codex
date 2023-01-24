package com.codex;

import java.util.*;

public class Solution {
//https://leetcode.com/discuss/interview-question/398035
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
                if (i > 0 && (evenCount >= 1 || evenList[i] < evenList[i - 1])) {
                    evenList[i] = evenList[i - 1];
                }
                evenCount = 0;
                if (i > 0 && evenList[i - 1] == evenList[i]) {
                    evenCount++;
                }
            } else {
                if (i > 0 && (oddCount >= 1 || oddList[i] > oddList[i - 1])) {
                    oddList[i] = oddList[i - 1];
                }
                oddCount = 0;
                if (i > 0 && oddList[i - 1] == oddList[i]) {
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