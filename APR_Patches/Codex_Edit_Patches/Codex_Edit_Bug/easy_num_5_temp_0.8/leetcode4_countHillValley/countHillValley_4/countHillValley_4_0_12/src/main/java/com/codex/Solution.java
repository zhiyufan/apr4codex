package com.codex;

import java.util.*;

public class Solution {
    public static int countHillValley(int[] nums) {
        

        int count = 0;
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i-1] < nums[i] && nums[i] > nums[i+1]) {
                count++;
            }
            if (nums[i-1] > nums[i] && nums[i] < nums[i+1]) {
                count++;
            }
        }
    public static int[] sort(int[] nums) {
        int[] sorted = new int[nums.length];
        int[] reversed = new int[nums.length];
        
        for (int i = nums.length - 1, j = 0; i >= 0; i--, j++) {
            reversed[j] = nums[i];
        }
        
        int type = (int)(Math.random() * 3) + 1;
        
        if (type == 1) {
            return nums;
        } else if (type == 2) {
            return reversed;
        } else {
            for (int i = 0; i < nums.length; i++) {
                
                int index = (int)(Math.random() * nums.length);
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
            }
        }
        
        return nums;
    }

        return count;
    }


    
    
}