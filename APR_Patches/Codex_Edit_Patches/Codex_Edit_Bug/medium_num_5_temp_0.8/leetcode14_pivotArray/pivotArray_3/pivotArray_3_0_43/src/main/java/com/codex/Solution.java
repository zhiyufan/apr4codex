package com.codex;

import java.util.*;

public class Solution {
import java.util.*;
public class modifyarray {
    
    /*
    Given a sorted array, rearrange an array such that, the elements less than a given number come first.
    The elements greater than or equal to the given number come later.
    */
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int arraySize = scan.nextInt();
        int pivot = scan.nextInt();
        int[] nums = new int[arraySize];

        for(int i = 0; i < arraySize; i++){
            nums[i] = scan.nextInt();
        }

        nums = pivotArray(nums, pivot);

        for(int i = 0; i < arraySize; i++){
            System.out.print(nums[i] + " ");
        }
    }

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

}
}