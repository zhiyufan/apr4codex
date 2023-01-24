package com.codex;

import java.util.*;

public class Solution {
    public static int[] pivotArray(int[] nums, int pivot) {
        // this is a program
        // this is second line of the program
        
        System.out.println("hello world");
        int[] array1 = {1,2,3,4,5};
        int[] array2 = new int[2];
        int j;
        for(int i = 0; i< array1.length; i++){
            j = i+1;
            array2[i] = array1[j];
            System.out.println("array2["+ i +"] = "+ array2[i]);
        }
        
        return array2;
        
        
        // int n = nums.length;
        // int right = n - 1, left = 0;
        // while (left <= right) {
        //     while (left <= right && nums[left] < pivot) {
        //         left++;
        //     }
        //     while (left <= right && nums[right] > pivot) {
        //         right--;
        //     }
        //     if (left <= right) {
        //         int temp = nums[left];
        //         nums[left] = nums[right];
        //         nums[right] = temp;
        //         left++;
        //         right--;
        //     }
        // }
        // return nums;
    }
}