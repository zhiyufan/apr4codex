package com.codex;

import java.util.*;

public class Solution {
    public static int minDeletion(int[] nums) {
        


        int[] oddList = new int[nums.length];
        int[] evenList = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                evenList[i] = nums[i];
            } else {
                oddList[i] = nums[i];
            }
        }

        int oddCount = 0;
        int evenCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {                
                if (i > 0 && evenList[i] == evenList[i - 1]) {
                    evenCount++;
                }
                if (evenCount > 1) {
                    evenList[i - 1] = evenList[i];
                }
                evenCount = 0;
                
            } else {
                if (i > 0 && oddList[i] == oddList[i - 1]) {
                    oddCount++;
                }
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