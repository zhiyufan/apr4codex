package com.codex;

import java.util.*;

public class Solution {
    public static int minDeletion(int[] nums) {
        
        int evenCount = 0;
        int oddCount = 0;
        int[] even = new int[nums.length];
        int[] odd = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                even[evenCount++] = nums[i];
            } else {
                odd[oddCount++] = nums[i];
            }
        }


        int evenDelete = 0;
        int oddDelete = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                int tempCount = 0;
                while (i + 1 < evenCount && even[i] == even[i + 1]) {
                    i++;
                    tempCount++;
                }
                evenDelete += tempCount;
            } else {
                int tempCount = 0;
                while (i + 1 < oddCount && odd[i] == odd[i + 1]) {
                    i++;
                    tempCount++;
                }
                oddDelete += tempCount;
            }
        }

        return Math.min(oddDelete, evenDelete);
    }

        
}