package com.codex;

import java.util.*;

public class Solution {
    public static int[] pivotArray(int[] nums, int pivot) {
        
        int i = 0, j = nums.length-1;
        while (i <= j) {
            if (nums[i] < pivot) {
                i++;
            } else if (nums[j] > pivot) {
                j--;
            } else {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j--;
            }
        }
        return nums;
    }



def addOne(arr): 
      
    # Find length of array 
    n = len(arr) 
      
    # Base case  
    if n == 0: 
        return[] 
      
    # Initialize carry 
    carry = 1
      
    # Traverse array from end 
    for i in range(n - 1, -1, -1): 
          
        # Add 1 at current position 
        # and update carry 
        arr[i]+= 1
        carry = arr[i] // 10
        arr[i] %= 10
  
        # If there was no carry 
        # then break from loop 
        if (carry == 0): 
            break
      
    # If there was a carry  
    # then we need to add 1 at  
    # the beginning of array 
    if (carry): 
        arr.insert(0, 1) 
          
    return arr 

    
}