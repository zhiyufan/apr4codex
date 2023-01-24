package com.codex;

import java.util.*;

public class Solution {

public class Main {

	public static void main(String[] args) {
		 
		int[] nums= {1,2,3,4,5,6,7,8};
		//int[] res=SortArrayByParity2(nums);
		int[] res=rearrangeArray2(nums);
		for(int i=0;i<res.length;i++)
			System.out.print(res[i]+" ");
		
	}
	
    public static int[] rearrangeArray2(int[] nums) {
        
        Arrays.sort(nums);
        int[] res = new int[nums.length];
        int left = 0, right = nums.length - 1;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                res[i] = nums[right];
                right--;
            } else {
                res[i] = nums[left];
                left++;
            }
        }
        return res;
    }

}
}