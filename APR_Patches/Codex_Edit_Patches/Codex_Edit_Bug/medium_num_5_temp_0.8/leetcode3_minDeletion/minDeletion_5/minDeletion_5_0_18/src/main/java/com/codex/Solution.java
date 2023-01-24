package com.codex;

import java.util.*;

public class Solution {
    public static int solution(int[] nums) {
        
        int n = nums.length;
         
        int[] left = new int[n];
        int[] right = new int[n];
         
        left[0] = nums[0];
        right[n-1] = nums[n-1];
      
        for(int i = 1; i < n; i++){
            left[i] = Math.max(left[i-1],nums[i]);
        }
      
        for(int i = n-2; i >= 0; i--){
            right[i] = Math.max(right[i+1],nums[i]);
        }
         
        int result = 0;
        for(int i = 1; i < n-1; i++){
            if(nums[i] < left[i] && nums[i] < right[i]){
                int min = Math.min(left[i],right[i]);
                result += (min - nums[i]);
            }
        }
         
        return result;
    }

    
    
}