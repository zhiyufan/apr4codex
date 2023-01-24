package com.codex;

import java.util.*;

public class Solution {
    public static int countElements(int[] nums) {
        
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
           int temp = nums[i] + 1;
           if(Arrays.binarySearch(nums, temp) > 0){
               count++;
            }
        }
        return count;
    }

    
}