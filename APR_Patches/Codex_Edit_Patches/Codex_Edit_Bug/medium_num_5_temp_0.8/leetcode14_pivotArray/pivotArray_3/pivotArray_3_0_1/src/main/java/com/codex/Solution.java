package com.codex;

import java.util.*;

public class Solution {
public static int[] pivotArray(int[] nums, int pivot) {

    int smaller = 0, equal = 0, greater = nums.length;
    while (equal < greater) {
        if (nums[equal] < pivot) {
            swap(nums, smaller++, equal++);
        }
        else if (nums[equal] == pivot) {
            ++equal;
        }
        else {
            swap(nums, equal, --greater);
        }
    }
    return nums;
}
public static void swap(int[] nums, int i, int j) {
    int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
}

public static void main(String[] args) {
        int[] arr = {4, 7, 1, 2, 9, 1, 5, 6};
        int pivot = 4;
        arr = pivotArray(arr, pivot);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

public static boolean isPalindrome(String str) {
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (!Character.isLetterOrDigit(str.charAt(left))) {
                left++;
            }
            else if (!Character.isLetterOrDigit(str.charAt(right))) {
                right--;
            }
            else {
                if (Character.toLowerCase(str.charAt(left)) != Character.toLowerCase(str.charAt(right))) {
                    return false;
                }
                left++;
                right--;
            }
        }
        return nums;
    }
    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    
}