package com.codex;

import java.util.*;

public class Solution {
public class HelloWorld{

     public static void main(String []args) {
        int[] nums = {1,3,5,6,7,9,11,13,15};
        int p = 10;
        int[] pivot = pivotArray(nums, p);
        for (int i = 0; i < pivot.length; i++) {
            System.out.println(pivot[i]);
        }
     }
        
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
}

    
}