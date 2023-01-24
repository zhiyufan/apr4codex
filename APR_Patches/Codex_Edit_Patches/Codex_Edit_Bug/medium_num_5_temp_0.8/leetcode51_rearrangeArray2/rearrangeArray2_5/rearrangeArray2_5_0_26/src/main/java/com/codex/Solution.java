package com.codex;

import java.util.*;

public class Solution {

    public static int[] rearrangeArray2(int[] nums) {
        
        Arrays.sort(nums);// Sort the Array
        int[] res = new int[nums.length];//Declare the array
        int left = 0, right = nums.length - 1;// Declare the indexes
        
        for (int i = 0; i < nums.length; i++) {//Use the loop to iterate all the different values
            //Set the indexes
            if (i % 2 == 0) {//Execute this block of code if the index is multiple of 2
                res[i] = nums[right];//Set the right index into the result array
                right--;//Decrease the right index
            } else {//Execute this block of code if the index is NOT multiple of 2
                res[i] = nums[left];//Set the left index into the result array
                left++;//Increase the left index
            }
        }
        return res;
    }

    
}