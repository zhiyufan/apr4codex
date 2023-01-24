package com.codex;

import java.util.*;

public class Solution {
    public static int minDeletion(String[] nums) {

        if (nums == null || nums.length == 0 || nums[0].length() == 0) {
            return 0;
        }

        int[] nums = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 'a') {
                nums[i] = 0;
            } else {
                nums[i] = 1;
            }
        }


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

        int[] odd = new int[nums.length];
        int[] even = new int[nums.length];
        int oddNum = 0;
        int evenNum = 0;
        int[] oddIndex = new int[nums.length];
        int[] evenIndex = new int[nums.length];
        int oddIndex = 0;
        int evenIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            int j = nums.length - 1 - i;
            if (i % 2 == 0) {
                if (j > 0 && evenList[j] == evenList[j - 1]) {
                    even[evenNum++] = j;
                    evenIndex[evenIndex++] = j - 1;
                }
                if (i > 0 && evenList[i] == evenList[i - 1]) {
                    even[evenNum++] = i;
                    evenIndex[evenIndex++] = i - 1;
                }
            } else {
                if (j > 0 && odd[j] == odd[j - 1]) {
                    odd[oddNum++] = j;
                    oddIndex[oddIndex++] = j - 1;
                }
                if (i > 0 && oddList[i] == oddList[i - 1]) {
                    odd[oddNum++] = i;
                    oddIndex[oddIndex++] = i - 1;
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