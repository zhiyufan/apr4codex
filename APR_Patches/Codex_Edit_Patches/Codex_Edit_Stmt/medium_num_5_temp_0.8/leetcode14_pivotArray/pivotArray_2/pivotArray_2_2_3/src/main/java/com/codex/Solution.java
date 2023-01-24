package com.codex;

import java.util.*;

public class Solution {
    public static int[] pivotArray(int[] nums, int pivot) {
        
        int i = 0, j = nums.length-1;
        while (i <= j) {
            if (nums[i] < pivot) {
                i++;
            } else if (nums[j] > pivot) {
                j--;
            } else {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j--;
            }
        }
        return nums;
    }

    public static int[] removeDuplicate(int[] arr) {
        int i = 0, j = 0;
        for (; i < arr.length - 1; i++) {
            if (arr[i] != arr[j])
                arr[++j] = arr[i];
        }
        return Arrays.copyOfRange(arr, 0, j + 1);
    }

    public static int[] moveZero(int[] arr) {
        int i = 0, j = 0;
        for (; i < arr.length; i++) {
            if (arr[i] != 0)
                arr[j++] = arr[i];
        }
        while (j < arr.length) {
            arr[j++] = 0;
        }
        return arr;
    }

    public static boolean isPalindrome(int[] arr) {
        int i = 0, j = arr.length - 1;
        while (i < j) {
            if (arr[i] != arr[j])
                return false;
            i++;
            j--;
        }
        return true;
    }

    public static int continousSum(int[] arr) {
        int maxSum = 0, currentSum = 0;
        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];
            maxSum = Math.max(maxSum, currentSum);
            currentSum = Math.max(currentSum, 0);
        }
        return maxSum;
    }

    public static int nonContinousSum(int[] arr) {
        int maxSum = 0;
        boolean hasPositive = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                maxSum += arr[i];
                hasPositive = true;
            }
        }
        return hasPositive ? maxSum : max(arr);
    }

    
}