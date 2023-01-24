package com.codex;

import java.util.*;

public class Solution {
    public static int[] pivotArray(int[] nums, int pivot) { 
        
        int len;
        int temp;
    
        if(nums.length == 0)
            return nums;
    
        for(int i = 0; i < nums.length-1; i++) {
            for(int j = 0; j < nums.length-i-1; j++) {
                if(nums[j] > nums[j+1]) {
                    temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
    
        len = nums.length - 1;
        int i = 0, j = len;
    
        while(i < j) {
            if(nums[i] < pivot) i++;
            else if(nums[j] > pivot) j--;
            else {
                temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j--;
	    }
        }
        return nums;
    }

    
}