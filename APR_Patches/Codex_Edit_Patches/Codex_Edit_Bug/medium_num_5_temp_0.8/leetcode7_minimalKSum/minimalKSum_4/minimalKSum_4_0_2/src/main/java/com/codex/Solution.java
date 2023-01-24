package com.codex;

import java.util.*;

public class Solution {
    public static long minimalKSum(int[] nums, int k) { 
        //create a new array that will hold the new array
        int[] newNum;
        //loop through the array and if the numbers are smaller than or equal to the index, 
        //add it to the new array
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= i) {
                newNum[i] = nums[i];
            }
        }
        //sort the array
        Arrays.sort(newNum);
        
        int curr = 1; //initializes it to 0
        long sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > curr) {
                k--;
                sum+=curr;
                curr++;
            } else if (nums[i] == curr) curr++;
        }
        while (k > 0) {
            sum+=curr;
            curr++;
            k--;
        }
        return sum;
    }

    
}