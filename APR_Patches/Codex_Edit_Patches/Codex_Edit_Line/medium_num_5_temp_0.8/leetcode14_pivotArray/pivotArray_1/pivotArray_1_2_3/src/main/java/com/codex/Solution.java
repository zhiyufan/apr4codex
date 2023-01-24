package com.codex;

import java.util.*;

public class Solution {
    public static int[] pivotArray(int[] nums, int pivot) {
        
        int i = 0, j = nums.length - 1;
        while (i <= j) {
            while (i <= j && nums[i] < pivot) {
                i++;
            }
            while (i <= j && nums[j] > pivot) {
                j--;
            }
            if (i <= j) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j--;
            }
        }
        return nums;
    }

 public static void main(String[] args) {
        int[] nums = {3, 1, 4, 6, 5, 2};
        int pivot = 3;
        int[] result = pivotArray(nums, pivot);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}