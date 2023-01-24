package com.codex;

import java.util.*;

public class Solution {
    public static int sumOfBeauties(int[] nums) {
        
        int sum = 0;
        for(int i = 1; i < nums.length - 1; i++) {
            if((i == 1 || nums[i - 2] < nums[i]) && (i == (nums.length - 2) || nums[i] > nums[i + 2])) {
                sum += 1;
            } else {
	                int j = i - 1;
	                int k = i + 1;
	                while(j >= 0) {
	                    if(nums[i] > nums[j]) {
	                        break;
	                    }
	                    j--;
	                }
	                while(k < nums.length) {
	                    if(nums[i] > nums[k]) {
	                        break;
	                    }
	                    k++;
	                }
	                if(j < 0 && k >= nums.length) {
	                    sum += 2;
	                }
	            }
        }
        return sum;
    }
}