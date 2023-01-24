package com.codex;

import java.util.*;

public class Solution {
public class test02 {


    public int minDeletion(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = nums[i];
        }

        int[] oddResult = new int[nums.length];
        int[] evenResult = new int[nums.length];
        int oddCount = 0;
        int evenCount = 0;
        for (int i = 0; i < nums.length; i += 2) {
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            for (int j = i; j < nums.length; j += 2) {
                min = Math.min(min, result[j]);
                max = Math.max(max, result[j]);
            }
            for (int j = i; j < nums.length; j += 2) {
                if (result[j] != min && result[j] != max) {
                    oddResult[j] = result[j];
                } else {
                    oddCount++;
                    if (oddCount > 1) {
                        oddResult[j - 2] = result[j];
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