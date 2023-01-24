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

    public static void main (String args[]) {
        int[] nums = {2, 8, 5, 3, 9, 6, 1, 4, 7};
        int[] res = pivotArray(nums, 7);
        for (int i : res) {
            System.out.print(i + " ");
        }
    }


    
}