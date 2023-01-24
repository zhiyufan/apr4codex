package com.codex;

import java.util.*;

public class Solution {
public class Main {
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
		// TODO Auto-generated method stub
		int[] arr = new int[] {9,12,-3,5,2,1,0,2,5,7,3,2,0,1,0,5,-3};
		pivotArray(arr,5);
		for(int x : arr)
			System.out.println(x);
	}

}

    
}