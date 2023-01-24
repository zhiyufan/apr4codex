package com.codex;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
		
		int a[] = { 1,2,3,4,5,1,2,3,4,5,6,7,8,9};
		
		int result[] = pivotArray(a, 5);
		
		for(int i = 0; i < result.length; i++){
			System.out.print(result[i] + " ");
		}
	}
	
	public static int[] pivotArray(int[] nums, int pivot) {
        
        int i = 0, j = nums.length - 1;
        while (i <= j) {
            while (i <= j && nums[i] <= pivot) {
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