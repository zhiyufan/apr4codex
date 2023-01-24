package com.codex;

import java.util.*;

public class Solution {
public class lalala {

	public static void main(String[] args) {
		int[] nums = new int[]{3,3,3,3};
		pivot(nums,3);
		for(int num: nums) {
			System.out.print(num + " ");
		}
	}

	public static int[] pivot(int[] nums, int pivot) {
		int smaller=0, greater=nums.length-1, eq=0;
		while(eq<=greater) {
			if(nums[eq]<pivot) {
				swap(nums,eq,smaller);
				eq++;
				smaller++;
			}
			else if(nums[eq]>pivot) {
				swap(nums,eq,greater);
				greater--;
			}
			else {
				eq++;
			}
		}
		return nums;
	}

	public static void swap(int[] nums, int i, int j) {
		int temp=nums[i];
		nums[i]=nums[j];
		nums[j]=temp;
	}
}

    
}