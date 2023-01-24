package com.codex;

import java.util.*;

public class Solution {
    public static int[] rearrangeArray2(int[] nums) {
        
        Arrays.sort(nums);   // sort the array
        int[] res = new int[nums.length]; // resultant array
        int left = 0, right = nums.length - 1; // left and right index
        
        // iterate over the array 
        for (int i = 0; i < nums.length; i++) {  
            if (i % 2 == 0) {
                res[i] = nums[right]; // reset the array even position to the largest number
                right--;   // decrement the right index.
            } else {
                res[i] = nums[left];
                left++;
            }
        }
        return res;
    }

    
}