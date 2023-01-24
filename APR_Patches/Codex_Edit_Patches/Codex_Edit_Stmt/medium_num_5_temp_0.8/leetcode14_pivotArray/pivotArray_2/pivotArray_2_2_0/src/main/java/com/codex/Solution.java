package com.codex;

import java.util.*;

public class Solution {
<<<<<<< HEAD
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
=======
    public static int[] pivotArray(int[] arr, int pivot) {
        int i = 0, j = arr.length - 1;
        while (i <= j) {
            if (arr[i] < pivot) {
                i++;
            } else if (arr[j] > pivot) {
                j--;
            } else {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        return arr;
    }
>>>>>>> github/master

    
}