package com.codex;

import java.util.*;

public class Solution {
<<<<<<< HEAD
    public static int countHillValley(int[] nums) {
        

        int count = 0;
=======
        public static int countHillValley(int[] nums) {
        

        int count = 0;
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i-1] < nums[i] && nums[i] > nums[i+1]) {
>>>>>>> ca8d7b1f971f1b2e49bac865708f0d44ae0e3a98
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i-1] < nums[i] && nums[i] > nums[i+1]) {
                count++;
            }
            if (nums[i-1] > nums[i] && nums[i] < nums[i+1]) {
                count++;
            }
        }
        return count;
    }


    
    
}