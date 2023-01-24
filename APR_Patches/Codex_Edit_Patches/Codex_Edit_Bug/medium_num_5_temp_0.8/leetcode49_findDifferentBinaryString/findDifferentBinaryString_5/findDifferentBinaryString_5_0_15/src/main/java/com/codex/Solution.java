package com.codex;

import java.util.*;

public class Solution {
//This Programm will find the different binary strings.
//Here I have assumed that the string length would be same in the input.
//If the length of the binary string is not same then we can change the programm to take the maximum length as the string length and make the other shorter binaries to make strings of length of the maximum length by appending zeros in front of the shorter binary strings.

import java.util.Arrays;

    public static String findDifferentBinaryString(String[] nums) {
        
        int length = nums[0].length();
        int[] counts = new int[length];
        char[] array = new char[length];
        int count = 0;
        for (String s: nums) {
            array = s.toCharArray();
            for (int i = 0; i < length; i++) {
                count = counts[i] + Character.getNumericValue(array[i]);
                if (count % 2 == 0)
                    counts[i] = 1;
                else 
                    counts[i] = 0;
            }
            
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < counts.length; i++){
            sb.append(counts[i] * 2 > nums.length ? 1 : 0);
        }
        return sb.toString();

    }

    public static void main(String[] args) {
        String[] nums = {"10111", "01101", "11000"};
        String res = findDifferentBinaryString(nums);
        System.out.println(res);
    }

}
}