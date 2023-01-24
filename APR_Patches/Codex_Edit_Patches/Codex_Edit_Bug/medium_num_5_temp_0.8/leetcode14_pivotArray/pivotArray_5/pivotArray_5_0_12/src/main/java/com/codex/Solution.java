package com.codex;

import java.util.*;

public class Solution {

public class pivotArray {
    public static int[] pivotArray(int[] nums, int pivot, int left, int right) {
        while (left < right) {
            while (left < right && nums[left] < pivot) {
                left ++;
            }
            while (left <= right && nums[right] > pivot) {
                right--;
            }
            if (left < right) {
                int temp =nums[left];
                nums[left]=nums[right];
                nums[right]=temp;
                left++;
                right--;
            }
        }
        return nums;
    } 

    public static void main(String[] args) {
        int[] a = {7, 9, 5, 6, 3, 2};
        int[] b = pivotArray(a, 5, 0, 5);
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i]);
        }
    }
    }

    
}