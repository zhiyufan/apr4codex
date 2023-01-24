package com.codex;

import java.util.*;

public class Solution {
    public static int minDeletion(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        

        int[] oddArray = new int[nums.length];
        int[] evenArray = new int[nums.length];
        int oddIndex = 1;
        int evenIndex = 1;
        oddArray[0] = nums[0];
        evenArray[0] = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                evenArray[evenIndex++] = nums[i];
            } else {
                oddArray[oddIndex++] = nums[i];
            }
        }

        int oddResultIndex = 1;
        int evenResultIndex = 1;
        for (int i = 1; i < oddIndex - 1; i++) {
            if (oddArray[i] != oddArray[i - 1]) {
                oddArray[oddResultIndex++] = oddArray[i];
            }
        }

        for (int i = 1; i < evenIndex - 1; i++) {
            if (evenArray[i] != evenArray[i - 1]) {
                evenArray[evenResultIndex++] = evenArray[i];
            }
        }

        int[] result = new int[nums.length / 2 + 1];
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