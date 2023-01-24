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
    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }




        
        public static void main(String[] args) {
        // TODO code application logic here
        int[] ar={9,4,2,14,2,12,4,0,1,4,3,0,1,3,3};
        int pivot=0;
        int[] result=pivotArray(ar,pivot);
        for(int i=0;i<result.length;i++){
          System.out.print(result[i]+" ");
        }
    }
    

    
}