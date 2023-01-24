package com.codex;

import java.util.*;

public class Solution {
    public static int mostFrequent(int[] nums, int key) { 
        

        
        int count = 0;  // count of occurrences of the most frequent element 
        int maxCount = 0;  // current maximum value of count
        int target = 0;  // the most frequent element

        
        for (int i = 0; i < nums.length; i++) {  // i represents a key element
            
            if (nums[i] == key) {  // check if i element is key
                
                for (int j = i + 1; j < nums.length; j++) {  // j represents subsequent elements to i
                    
                    if (nums[j] == nums[i + 1]) {  // check if subsequent element is equal to the next element
                        
                        count++;  // increment count by 1
                        
                    }
                    
                } 
                if (count > maxCount) {  // if count is greater than maxCount
                    
                    maxCount = count;  // set new maxCount 
            
                    target = nums[i + 1];  // set new target element
                    
                }
            }
        
        return target;  // return the target element
        
    }
}