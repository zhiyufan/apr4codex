package com.codex;

import java.util.*;

public class Solution {
    public static boolean isDuplicate(int[] nums) {
        

        Set<Integer> evenSet = new HashSet<>();
        Set<Integer> oddSet = new HashSet<>();
        for (int i = 1; i < nums.length; i++) {
            if (i % 2 == 1) {
                if (oddSet.contains(nums[i])) {
                    return true;
                } else {
                    oddSet.add(nums[i]);
                }
            }
            if (i % 2 == 0) {
                if (evenSet.contains(nums[i])) {
                    return true;
                } else {
                    evenSet.add(nums[i]);
                }
            }
        }

        return false;
        /*
         * int[] oddList = new int[nums.length]; int[] evenList = new int[nums.length];
         * int oddIndex = 0; int evenIndex = 0; for (int i = 0; i < nums.length; i++) {
         * if (i % 2 == 0) { evenList[evenIndex++] = nums[i]; } else { oddList[oddIndex++]
         * = nums[i]; } }
         * 
         * int oddCount = 0; int evenCount = 0; for (int i = 0; i < nums.length; i++) {
         * if (i % 2 == 0) { if (evenCount > 1) { evenList[i - 1] = evenList[i]; }
         * evenCount = 0; if (i > 0 && evenList[i] == evenList[i - 1]) { evenCount++; } }
         * else { if (oddCount > 1) { oddList[i - 1] = oddList[i]; } oddCount = 0; if (i >
         * 0 && oddList[i] == oddList[i - 1]) { oddCount++; }
         * 
         * } }
         * 
         * int[] result = new int[nums.length]; int resultIndex = 0; for (int i = 0; i <
         * nums.length; i++) { if (i % 2 == 0) { result[resultIndex++] = evenList[i]; }
         * else { result[resultIndex++] = oddList[i]; } }
         * 
         * int count = 0; for (int i = 0; i < nums.length; i++) { if (nums[i] !=
         * result[i]) { count++; } }
         * 
         * return count;
         */
    }
    
    public void duplicateZeros(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                count++;
            }
        }

        int length = arr.length + count;
        int index = arr.length - 1;
        for (int i = length - 1; i >= 0; i--) {
            if (index >= arr.length || index < 0) {
                break;
            }

            if (arr[index] != 0) {
                arr[i] = arr[index];
                index--;
            } else {
                arr[i] = 0;
                if (i - 1 >= 0) {
                    arr[i - 1] = 0;
                }
                i--;
                index--;
            }
        }
    }

        
}