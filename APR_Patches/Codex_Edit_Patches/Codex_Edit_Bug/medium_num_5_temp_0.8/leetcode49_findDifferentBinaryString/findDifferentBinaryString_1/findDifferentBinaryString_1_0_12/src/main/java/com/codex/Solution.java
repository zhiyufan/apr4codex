package com.codex;

import java.util.*;

public class Solution {
// In the program the first element and the last element in the array are being checked separately. This is done to avoid ArrayIndexOutOfBoundsException.

    public static String findDifferentBinaryString(String[] nums) {
        
        Arrays.sort(nums);
        /*for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println("");*/
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i].equals(nums[i - 1] + "0")) {
                if (!nums[i + 1].equals(nums[i] + "0")) {
                    return nums[i] + "1";
                }
            } else if (nums[i].equals("0" + nums[i + 1])) {
                if (!nums[i - 1].equals("0" + nums[i])) {
                    return "1" + nums[i];
                }
            }
        }
        
        if (nums[0].equals("0" + nums[1])) {
            return "1" + nums[0];
        }
        if (nums[nums.length - 1].equals(nums[nums.length - 2] + "0")) {
            return nums[nums.length - 1] + "1";
        }
        
        return "";
        
    }

        
        public static void main (String[] args) throws java.lang.Exception
        {
            String[] nums = {"11101", "11011", "10111", "11001", "11111", "11111", "11001", "11011", "11111", "11111", "11001", "11011", "11111", "11111", "11001", "11011", "11111", "11111", "11001", "11011", "11111", "11111", "11001", "11011", "11111", "11111", "11001", "11011", "11111", "11111"};
            System.out.println(findDifferentBinaryString(nums));
            
        }
}