package com.codex;

import java.util.*;

public class Solution {
    //greedy 
    public static int minDeletion(int[] nums) {
        
        int count = 0; //initialize count of deletions to zero
        for (int i = 0; i < nums.length - 1; i += 2) { //loop through the array
            if (nums[i] == nums[i + 1]) { //check if current element is equal to the next element
                count++; //if yes, increment count
            }
        }
        if (nums.length % 2 == 1) { // check if array length is odd
            for (int i = 0; i < nums.length - 1; i++) { //loop through the array
                if (nums[i] == nums[i + 1]) { //check if current element is equal to the next element
                    count++; //if yes, increment count
                }
            }
        }
        return count;
    }

    
}