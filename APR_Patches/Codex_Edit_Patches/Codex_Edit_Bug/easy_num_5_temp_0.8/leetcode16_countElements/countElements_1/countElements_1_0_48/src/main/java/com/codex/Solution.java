package com.codex;

import java.util.*;

public class Solution {
    public static void moveZeroes(int[] nums) {
        int count = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[count++] = nums[i];
            }
        }
       
        while (count < nums.length) {
            nums[count++] = 0;
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static void moveAllZeroes(int[] nums) {
        
        int count = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[count++] = nums[i];
            }
        }
        
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }

        while (count < nums.length) {
            nums[count++] = 0;
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static void moveAllZeroesToRight(int[] nums) {
        
        int count = 1;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0 && nums[i] == nums[i + 1]) {
                nums[count++] = nums[i];
            }
        }
        return count;
    }

    
}